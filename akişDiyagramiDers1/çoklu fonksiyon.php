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
echo "��karma Fonksiyonu : ". cikart(25,15)."<br>";
echo "�arpma Fonksiyonu : ". carpma(5 , 6). "<br>";
echo "Bolme Fonksiyonu : ". bolme(16,4);


?>