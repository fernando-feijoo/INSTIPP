package Controlador;

import Modelo.Modelo_Paciente;
import Vista.Vista_Paciente;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Controlador_Paciente implements ActionListener, KeyListener, MouseListener, FocusListener {

    Vista_Paciente vistaPaciente;
    Modelo_Paciente modeloPaciente = new Modelo_Paciente();
    Color colorCover = new Color(235, 245, 251);
    Color colorCoverOtro = new Color(250, 219, 216);
    Color colorBase = new Color(204, 204, 204);
    int opcion, valorASCII;
    boolean validadorVacio, validadorLetras, validadorLetras1, validadorLetras2, validadorLetras3, validadorLetras4, validador;
    char tmp;

    public Controlador_Paciente(Vista_Paciente vistaPaciente) {
        this.vistaPaciente = vistaPaciente;
        //MouseListener para clicks.
        this.vistaPaciente.jp_botonSalir.addMouseListener(this);
        this.vistaPaciente.jp_botonGuardar.addMouseListener(this);
        this.vistaPaciente.jp_botonActualizar.addMouseListener(this);
        this.vistaPaciente.jp_botonEliminar.addMouseListener(this);
        //ActionListener para clicks.
        //KeyListener para eventos de teclas.
        this.vistaPaciente.txf_buscar.addKeyListener(this);
        this.vistaPaciente.jtb_tablaPacientes.addKeyListener(this);
        this.vistaPaciente.txf_edad.addKeyListener(this);
        this.vistaPaciente.txf_nombre.addKeyListener(this);
        this.vistaPaciente.txf_fechaNacimiento.addKeyListener(this);
        //FocusListener para algunos textbox
        this.vistaPaciente.txf_edad.addFocusListener(this);
        this.vistaPaciente.txf_nombre.addFocusListener(this);
        this.vistaPaciente.txf_fechaNacimiento.addFocusListener(this);
        //Rellenar campos en combo box.
        this.llenar_combo_especies();
        this.llenar_tabla_pacientes();
        //Ejecucion de otros parametros.
        this.ocultarElementos();
    }

    public void borrar_datos() {
        this.vistaPaciente.txf_nombre.setText(null);
        this.vistaPaciente.txf_edad.setText(null);
        this.vistaPaciente.cb_especie.setSelectedIndex(0);//Selecciona la opcion por defecto inicial.
        this.vistaPaciente.txf_color.setText(null);
        this.vistaPaciente.cb_sexo.setSelectedIndex(0);//Selecciona la opcion por defecto inicial.
        this.vistaPaciente.txf_raza.setText(null);
        this.vistaPaciente.txf_fechaNacimiento.setText(null);
    }

    public void llenar_tabla_pacientes() {
        try {
            DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaPaciente.jtb_tablaPacientes.getModel();
            tablaModelo.setColumnCount(0);
            tablaModelo.setRowCount(0);

            tablaModelo.addColumn("id");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Edad");
            tablaModelo.addColumn("Sexo");
            tablaModelo.addColumn("Especie");
            tablaModelo.addColumn("Raza");
            tablaModelo.addColumn("Color");
            tablaModelo.addColumn("Fecha de Nacimiento");

            ResultSet rs = modeloPaciente.consultar_pacientes();
            String[] datos = new String[8];
            while (rs.next()) {
                datos[0] = rs.getString("id_paciente");
                datos[1] = rs.getString("pac_nombre");
                datos[2] = rs.getString("pac_edad");
                datos[3] = rs.getString("pac_sexo");
                datos[4] = rs.getString("pac_especie");
                datos[5] = rs.getString("pac_raza");
                datos[6] = rs.getString("pac_color");
                datos[7] = rs.getString("pac_fecha_nac");
                tablaModelo.addRow(datos);
            }
        } catch (SQLException ex) {
            System.out.println("Error al llenar la tabla... " + ex);
        }
    }

    public void llenar_combo_especies() {
        try {
            ResultSet rs = modeloPaciente.consultar_especie();
            while (rs.next()) {
                this.vistaPaciente.cb_especie.addItem(rs.getString("especie"));
            }
        } catch (SQLException ex) {
            System.out.println("Error al llenar combo especies: " + ex);
        }
    }

    public void cargar_datos() {
        validadorVacio = true;
        validadorLetras = true;
        try {
            if (this.vistaPaciente.txf_nombre.getText().isEmpty() || this.vistaPaciente.txf_edad.getText().isEmpty()
                    || this.vistaPaciente.cb_especie.getSelectedIndex() == 0 || this.vistaPaciente.txf_color.getText().isEmpty()
                    || this.vistaPaciente.cb_sexo.getSelectedIndex() == 0 || this.vistaPaciente.txf_raza.getText().isEmpty()
                    || this.vistaPaciente.txf_fechaNacimiento.getText().isEmpty()) {
                validadorVacio = false;
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vistaPaciente, "Campos vacios, ingrese los datos faltantes.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        validadorLetras1 = esSoloLetras(this.vistaPaciente.txf_nombre.getText());
        validadorLetras2 = esSoloLetras(this.vistaPaciente.txf_color.getText());
        validadorLetras3 = esSoloLetras(this.vistaPaciente.txf_raza.getText());
        if (validadorLetras1 && validadorLetras2 && validadorLetras3) {
            System.out.println("Datos correctos");
            validadorLetras = true;
        } else {
            validadorLetras = false;
            JOptionPane.showMessageDialog(vistaPaciente, "Campos con caracteres especiales.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if (validadorVacio && validadorLetras) {
            System.out.println("Ingreso a los datos de envio.");
            modeloPaciente.nombre = this.vistaPaciente.txf_nombre.getText().toUpperCase();
            modeloPaciente.edad = this.vistaPaciente.txf_edad.getText();
            modeloPaciente.especie = this.vistaPaciente.cb_especie.getSelectedItem().toString();
            modeloPaciente.color = this.vistaPaciente.txf_color.getText().toUpperCase();
            modeloPaciente.sexo = this.vistaPaciente.cb_sexo.getSelectedItem().toString();
            modeloPaciente.raza = this.vistaPaciente.txf_raza.getText().toUpperCase();
            modeloPaciente.fechaNacimiento = this.vistaPaciente.txf_fechaNacimiento.getText();
        } else {
            System.out.println("Falso en el ingreso de datos.");
        }
    }

    public void filtrar_datos(String valor) {
        DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaPaciente.jtb_tablaPacientes.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tablaModelo);
        this.vistaPaciente.jtb_tablaPacientes.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + valor, 1));
    }

    /**
     * Recorremos cada caracter de la cadena y comprobamos si son letras. Para
     * comprobarlo, lo pasamos a mayuscula y consultamos su numero ASCII. Si
     * está fuera del rango 65 - 90, es que NO son letras. Para ser más exactos
     * al tratarse del idioma español, tambien comprobamos el valor 165
     * equivalente a la Ñ
     *
     * @param cadena
     * @return true or false;
     */
    static boolean esSoloLetras(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.toUpperCase().charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90) && valorASCII != 32 && valorASCII != 8) {
                return false; //Se ha encontrado un caracter que no es letra
            }
        }
        return true; //Terminado el bucle sin que se haya retornado false, es que todos los caracteres son letras
    }

    public void ocultarElementos() {
        this.vistaPaciente.lbl_nombreIncorrecto.setVisible(false);
        this.vistaPaciente.lbl_edadIncorrecta.setVisible(false);
        this.vistaPaciente.lbl_fechaNacimientoIncorrecta.setVisible(false);
    }

    public static boolean isNumericInt(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    /**
     * Obtenemos el valor ASCII de un char
     *
     * @param caracter
     * @return int del char recibido.
     */
    public int numeroASCII(char caracter) {
        int valorASCII = (int) caracter;
        return valorASCII;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == this.vistaPaciente.txf_buscar) {
            filtrar_datos(this.vistaPaciente.txf_buscar.getText());
        }

        if (e.getSource() == this.vistaPaciente.txf_edad) {
            tmp = e.getKeyChar();
            valorASCII = numeroASCII(tmp);
            if (!Character.isDigit(tmp) && valorASCII != 8) {
                this.vistaPaciente.lbl_edadIncorrecta.setText("* Ingreso de datos incorrectos, solo ingresar numeros.");
                this.vistaPaciente.lbl_edadIncorrecta.setVisible(true);
                e.consume();
            } else if (this.vistaPaciente.txf_edad.getText().length() >= 2) {
                this.vistaPaciente.lbl_edadIncorrecta.setText("* Solo puede ingresar 2 numeros.");
                this.vistaPaciente.lbl_edadIncorrecta.setVisible(true);
                e.consume();
            } else {
                this.vistaPaciente.lbl_edadIncorrecta.setVisible(false);
            }
        }

        if (e.getSource() == this.vistaPaciente.txf_nombre) {
            tmp = e.getKeyChar();
            valorASCII = numeroASCII(tmp);
            if (!Character.isLetter(tmp) && valorASCII != 8 && valorASCII != 32) {
                this.vistaPaciente.lbl_nombreIncorrecto.setVisible(true);
                e.consume();
            } else {
                this.vistaPaciente.lbl_nombreIncorrecto.setVisible(false);
            }
        }
        if (e.getSource() == this.vistaPaciente.txf_fechaNacimiento) {
            tmp = e.getKeyChar();
            valorASCII = numeroASCII(tmp);
            if (!Character.isDigit(tmp) && valorASCII != 8 && valorASCII != 45) {
                this.vistaPaciente.lbl_fechaNacimientoIncorrecta.setVisible(true);
                e.consume();
            } else {
                this.vistaPaciente.lbl_fechaNacimientoIncorrecta.setVisible(false);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER && e.getSource() == vistaPaciente.jtb_tablaPacientes) {
            if (this.vistaPaciente.jtb_tablaPacientes.getSelectedRowCount() == 1) {
                int filaSeleccionada = this.vistaPaciente.jtb_tablaPacientes.getSelectedRow();
                //Seleccion del id de dato a modificar. Mas adelante claro.
                this.modeloPaciente.id = Integer.parseInt(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 0).toString());

                this.vistaPaciente.txf_nombre.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 1).toString());
                this.vistaPaciente.txf_edad.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 2).toString());
                this.vistaPaciente.cb_sexo.setSelectedItem(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 3).toString());
                this.vistaPaciente.cb_especie.setSelectedItem(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 4).toString());
                this.vistaPaciente.txf_raza.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 5).toString());
                this.vistaPaciente.txf_color.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 6).toString());
                this.vistaPaciente.txf_fechaNacimiento.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 7).toString());
            } else if (this.vistaPaciente.jtb_tablaPacientes.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(vistaPaciente, "Aún no seleciona 1 opción.", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(vistaPaciente, "Selecciono más de 1 fila, seleccione solo 1.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Salimos de la ventana y se oculta sando paso a la palabra bienvenida en Vista_Principal.
        if (e.getSource() == this.vistaPaciente.jp_botonSalir) {
            this.vistaPaciente.txf_buscar.setText(null);
            this.vistaPaciente.setVisible(false);
            this.llenar_tabla_pacientes();
            borrar_datos();
        }
        //Guardamos la informacion dentro de los textField de Vista_Paciente y se borra una vez guardado.
        if (e.getSource() == this.vistaPaciente.jp_botonGuardar) {
            this.cargar_datos();
            System.out.println("Validador en Guardar: " + validadorVacio);
            if (validadorVacio && validadorLetras) {
                try {
                    this.modeloPaciente.guardar_datos_paciente();
                } catch (SQLException ex) {
                    System.out.println("Error al guardar los datos: " + ex);
                }
                opcion = JOptionPane.showConfirmDialog(vistaPaciente, "¿Desea ingresas mas datos?", "Datos", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.OK_OPTION) {
                    borrar_datos();
                }
                this.llenar_tabla_pacientes();
            }
        }
        //Actualizamos la informacion de la BD
        if (e.getSource() == this.vistaPaciente.jp_botonActualizar) {
            opcion = 1;
            this.cargar_datos();
            try {
                opcion = JOptionPane.showConfirmDialog(vistaPaciente, "¿Desea actualizar el registro?", "Actualizado", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    this.modeloPaciente.actualizar_pacientes();
                    System.out.println("Datos actualizados...");
                }
            } catch (SQLException ex) {
                System.out.println("Error al actualizar los datos: " + ex);//Aun nose porque sale error es como que ingresa 2 veces.
            }
            if (opcion == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(vistaPaciente, "Registro actualizado correctamente.", "Mensaje confirmación", JOptionPane.INFORMATION_MESSAGE);
                this.llenar_tabla_pacientes();
                this.borrar_datos();
            }
        }

        if (e.getSource() == this.vistaPaciente.jp_botonEliminar) {
            opcion = 1; // valor de respuesta negativo, positivo es 0.
            try {
                opcion = JOptionPane.showConfirmDialog(vistaPaciente, "¿Desea eliminar el registro?", "Eliminado", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    this.modeloPaciente.eliminar_pacientes();
                }
            } catch (SQLException ex) {
                System.out.println("Error al eliminar los datos: " + ex);
            }
            if (opcion == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(vistaPaciente, "Registro eliminado correctamente.", "Mensaje confirmación", JOptionPane.INFORMATION_MESSAGE);
                this.llenar_tabla_pacientes();
                this.borrar_datos();
            } else if (opcion == JOptionPane.NO_OPTION) {
                this.modeloPaciente.id = 0;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //        Asigno color al jPanel donde se encuentre el mouse.
        if (e.getSource() == this.vistaPaciente.jp_botonActualizar) {
            this.vistaPaciente.jp_botonActualizar.setBackground(colorCover);
        } else if (e.getSource() == this.vistaPaciente.jp_botonGuardar) {
            this.vistaPaciente.jp_botonGuardar.setBackground(colorCover);
        } else if (e.getSource() == this.vistaPaciente.jp_botonEliminar) {
            this.vistaPaciente.jp_botonEliminar.setBackground(colorCoverOtro);
        } else if (e.getSource() == this.vistaPaciente.jp_botonSalir) {
            this.vistaPaciente.jp_botonSalir.setBackground(colorCover);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //        Asigno color al jPanel donde se encuentre el mouse.
        if (e.getSource() == this.vistaPaciente.jp_botonActualizar) {
            this.vistaPaciente.jp_botonActualizar.setBackground(colorBase);
        } else if (e.getSource() == this.vistaPaciente.jp_botonGuardar) {
            this.vistaPaciente.jp_botonGuardar.setBackground(colorBase);
        } else if (e.getSource() == this.vistaPaciente.jp_botonEliminar) {
            this.vistaPaciente.jp_botonEliminar.setBackground(colorBase);
        } else if (e.getSource() == this.vistaPaciente.jp_botonSalir) {
            this.vistaPaciente.jp_botonSalir.setBackground(colorBase);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.vistaPaciente.txf_edad) {
            if (this.vistaPaciente.txf_edad.getText().length() <= 2) {
                this.vistaPaciente.lbl_edadIncorrecta.setVisible(false);
            }
        }
        if (e.getSource() == this.vistaPaciente.txf_nombre) {
            validador = esSoloLetras(this.vistaPaciente.txf_nombre.getText());
            if (validador) {
                this.vistaPaciente.lbl_nombreIncorrecto.setVisible(false);
            }
        }
        if (e.getSource() == this.vistaPaciente.txf_fechaNacimiento) {
            this.vistaPaciente.lbl_fechaNacimientoIncorrecta.setVisible(false);
        }
    }
}
