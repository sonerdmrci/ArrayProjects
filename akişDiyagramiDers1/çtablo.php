<?php

/* 0 ile 100 dereceyi ekrana yazan (Fahranhyt cinsinden)
Tablo halinde yazan programý yazýnýz. (F = derece*1.8+32, for döngüsü)
*/
$satir = 100;
$satir = 3;
echo "<table border>";
for($i = 0; $i <= 100; $i++)
{
    echo "<tr>";
    $fah = $i * 1.8 + 32;
    echo $i ."<td> derece </td><td>=</td>" . $fah"<td> fahranhyt </td>";
    echo "</br>";
    
}
echo "</tr>";
echo "</table>";



?>