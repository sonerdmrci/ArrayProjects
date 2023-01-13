

<?php

function sum( $x,  $y)
{
    $z = $x +$y ; 
    return $z;
}
echo "7 + 12 =".sum(7,12)."<br>";
echo "8 x 11 =".(8*sum(7,4))."<br>";
echo "100 - 70 =".(100-sum(65,5)."<br>");
echo "50 / 10 =".(50/sum(6,4)."<br>");
echo "10 % 6 =".(10%sum(2,4)."<br>");

?>