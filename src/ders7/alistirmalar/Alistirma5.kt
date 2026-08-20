package ders7.alistirmalar

import ders7.alistirmalar.siniflar.FizikMotoru

fun main() {
    // main içinde kullanıcıdan saniye değerini (çökme korumalı) alıp nesne üretmeden doğrudan hızı hesaplatarak yazdırın.

    print("Düşüş süresini saniye olarak girin: ")
    val sure = readln().toDoubleOrNull() ?: 0.0

    val hiz = FizikMotoru.serbestDusmeHizi(sure)
    println("$sure saniye serbest düşen cismin ulaşacağı hız: ${"%.2f".format(hiz)}")


}