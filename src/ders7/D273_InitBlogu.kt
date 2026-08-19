package ders7

import ders7.siniflar.Oyuncu

fun main() {
    val oyuncu = Oyuncu("Hero", -80)
    println(oyuncu.can)

   //oyuncu.can = -80 // costum setter çalışır burda çünkü sonradan atanmış bir değerdir
   //println(oyuncu.can)


}