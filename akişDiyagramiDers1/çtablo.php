<?php

/* 0 ile 100 dereceyi ekrana yazan (Fahranhyt cinsinden)
Tablo halinde yazan program� yaz�n�z. (F = derece*1.8+32, for d�ng�s�)
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