<?php
header('Content-Type: application/json');
$json_ugly = $_POST['json'];
$json_pretty = json_encode(json_decode($json_ugly), JSON_PRETTY_PRINT);
echo $json_pretty;

