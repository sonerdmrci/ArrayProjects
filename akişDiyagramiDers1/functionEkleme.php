<?php

function ekle(& $value)
{
    $value +=5;
}
$Mynumber = 14;
ekle($Mynumber);
echo $Mynumber;


?>