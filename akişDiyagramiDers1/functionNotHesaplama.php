<?php

function sinif($vize, $final){
    $ortalama = (($vize*0.4) + ($final*0.6));
    return $ortalama;
}
echo "1. Öğrencinin Ortalaması = ".sinif(60,80)."<br>";
echo "2. Öğrencinin Ortalaması = ".sinif(70,60)."<br>";
echo "3. Öğrencinin Ortalaması = ".sinif(80,60)."<br>";
echo "4. Öğrencinin Ortalaması = ".sinif(100,80)."<br>";
echo "5. Öğrencinin Ortalaması = ".sinif(80,90)."<br>";
echo "6. Öğrencinin Ortalaması = ".sinif(40,90)."<br>";

?>