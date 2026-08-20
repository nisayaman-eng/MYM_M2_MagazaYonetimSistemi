package ders7.alistirmalar

import ders7.alistirmalar.siniflar.Kitap

fun main() {
    print("Kitap adı giriniz: ")
    val kitapAdi = readln().trim()

    print("Yazar: ")
    val yazar = readln().trim()

    print("Sayfa sayısı: ")
    val sayfaSayisi = readln().toIntOrNull() ?: 1

    val kitap = Kitap(kitapAdi, yazar, sayfaSayisi)
    println("""
        ----Kitap Bilgileri----
        |Ad: ${kitap.ad}
        |Yazar: ${kitap.yazar}
        |Sayfa Sayısı: ${kitap.sayfaSayisi}
    """.trimIndent())

    print("Yeni sayfa sayısını girin: ")
    kitap.sayfaSayisi = readln().toIntOrNull() ?: 1

    println("Güncel sayfa sayısı: ${kitap.sayfaSayisi}")
}