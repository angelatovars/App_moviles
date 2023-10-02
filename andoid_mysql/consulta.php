<?php
include 'conexion.php';
$codigo=$_GET['calculador'];

$consulta = "select * from calculador where RAIZ_CUADRADA = '$codigo'";
$resultado = $mysql -> query($consulta);

while($fila=$resultado -> fetch_array()){
    $producto[] = array_map('utf8_encode', $fila);
}

echo json_encode($producto);
$resultado -> close();
?>
