<?php
$mysql= new mysqli("localhost","root","","calculadora");
if($mysql->connect_error){
    echo("Error de conexion");
}
else{
   // echo "Conexion exitosa";
}
?>