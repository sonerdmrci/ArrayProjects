<?php

function topla($sayi1 , $sayi2)
{
    $sonuc = $sayi1 + $sayi2;
    return $sonuc;
}
function cikart($sayi1 , $sayi2)
{
    $sonuc = $sayi1 - $sayi2;
    return $sonuc;
}
function carpma($sayi1 , $sayi2)
{
    $sonuc = $sayi1 * $sayi2;
    return $sonuc;
}
function bolme($sayi1 , $sayi2)
{
    $sonuc = $sayi1 / $sayi2;
    return $sonuc;
}
echo "Toplam Fonksiyonu : ". topla(15 , 25)."<br>";
echo "Çýkarma Fonksiyonu : ". cikart(25,15)."<br>";
echo "Çarpma Fonksiyonu : ". carpma(5 , 6). "<br>";
echo "Bolme Fonksiyonu : ". bolme(16,4);


?>