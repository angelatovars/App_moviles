<?php
if($_SERVER["REQUEST_METHOD"]=="POST"){
    require_once 'conexion.php';
    
    $NUMERO = $_POST["numero"];
    $RAIZ_CUADRADA = $_POST["raiz cuadrada"];
    $RAIZ_CUBICA = $_POST["raiz cubica"];
    $CUADRADA = $_POST["cuadrada"];
    $CUBICA = $_POST["cubica"];
    
    $query = "INSERT INTO calculador (NUMERO, RAIZ_CUADRADA, RAIZ_CUBICA, CUADRADA, CUBICA) VALUES ('" . $NUMERO . "', '" . $RAIZ_CUADRADA . "', '" . $RAIZ_CUBICA . "', '" . $CUADRADA . "', '" . $CUBICA . "')";
    
    $resultado = $mysql->query($query);
    if($resultado) {
        echo "Número ingresado con éxito.";
    } else {
        echo "Error al ingresar el numero: " . $mysql->error;
    }
}