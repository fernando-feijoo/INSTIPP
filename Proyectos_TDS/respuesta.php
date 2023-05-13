<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        // Obtén los valores de los campos del formulario
        $codigo = $_POST['codigo'];
        $cedula = $_POST['cedula'];
        $apellido = $_POST['apellido'];
        $nombre = $_POST['nombre'];
        $direccion = $_POST['direccion'];
        $sueldo = $_POST['sueldo'];

        // URL del archivo WSDL del webservice Java
        $wsdl_url = 'http://localhost:8080/Enterprise050523/ConexionEnterprise?wsdl';

        try {
            // Crea el cliente SOAP
            $client = new SoapClient($wsdl_url);

            // Llama al método "guardar" del webservice Java
            $response = $client->guardar($codigo, $cedula, $apellido, $nombre, $direccion, $sueldo);

            // Analiza la respuesta del webservice
            $mensaje = $response[0];
            $exito = $response[1];

            // Verifica si la operación fue exitosa
            if ($exito == "true") {
                echo "Datos guardados exitosamente: " . $mensaje;
            } else {
                echo "Error al guardar los datos: " . $mensaje;
            }
        } catch (SoapFault $e) {
            echo "Error al llamar al webservice: " . $e->getMessage();
        }
        ?>
    </body>
</html>
