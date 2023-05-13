<?php
function guardarDatos($codigo, $cedula, $apellido, $nombre, $direccion, $sueldo) {
    $wsdl_url = 'http://localhost:8080/Enterprise050523/ConexionEnterprise?wsdl';
    $client = new SoapClient($wsdl_url);

    return $client->guardar($codigo, $cedula, $apellido, $nombre, $direccion, $sueldo);
}
?>
