<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Guardar Datos</title>
</head>
<body>
    <h1>Hola desde NetBeans</h1>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        // Obtén los valores de los campos del formulario
        $codigo = $_POST["codigo"];
        $cedula = $_POST["cedula"];
        $apellido = $_POST["apellido"];
        $nombre = $_POST["nombre"];
        $direccion = $_POST["direccion"];
        $sueldo = $_POST["sueldo"];

        // Validar los datos del formulario
        // ...

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
    }
    ?>

    <form method="post" action="index.php">
        <!-- Aquí van los campos del formulario -->
        <!-- Por ejemplo: -->
        <input type="text" name="codigo" placeholder="Código">
        <input type="text" name="cedula" placeholder="Cédula">
        <input type="text" name="apellido" placeholder="Apellido">
        <input type="text" name="nombre" placeholder="Nombre">
        <input type="text" name="direccion" placeholder="Dirección">
        <input type="text" name="sueldo" placeholder="Sueldo">
        <button type="submit">Guardar</button>
    </form>
</body>
</html>
