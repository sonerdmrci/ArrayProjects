<?php

function sinif($vize, $final){
    $ortalama = (($vize*0.4) + ($final*0.6));
    return $ortalama;
}
echo "1. ��rencinin Ortalamas� = ".sinif(60,80)."<br>";
echo "2. ��rencinin Ortalamas� = ".sinif(70,60)."<br>";
echo "3. ��rencinin Ortalamas� = ".sinif(80,60)."<br>";
echo "4. ��rencinin Ortalamas� = ".sinif(100,80)."<br>";
echo "5. ��rencinin Ortalamas� = ".sinif(80,90)."<br>";
echo "6. ��rencinin Ortalamas� = ".sinif(40,90)."<br>";

?>