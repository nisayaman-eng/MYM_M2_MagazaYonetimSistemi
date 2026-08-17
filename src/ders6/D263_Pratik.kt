package ders6

import ders6.siniflar.Kitap

fun main() {
    val kitap = Kitap()
    kitap.kitapAdi = "Eylül"
    kitap.sayfaSayisi = 287
    kitap.sayfaOku(100)
    kitap.sayfaOku(100)
    kitap.sayfaOku(100)
}