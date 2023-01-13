<?php

function sinif($vize, $final){
    $ortalama = (($vize*0.4) + ($final*0.6));
    return $ortalama;
}
echo "1. Öðrencinin Ortalamasý = ".sinif(60,80)."<br>";
echo "2. Öðrencinin Ortalamasý = ".sinif(70,60)."<br>";
echo "3. Öðrencinin Ortalamasý = ".sinif(80,60)."<br>";
echo "4. Öðrencinin Ortalamasý = ".sinif(100,80)."<br>";
echo "5. Öðrencinin Ortalamasý = ".sinif(80,90)."<br>";
echo "6. Öðrencinin Ortalamasý = ".sinif(40,90)."<br>";

?>