package ders6

import ders6.siniflar.BankaHesabi

fun main() {
    val musteriHesap = BankaHesabi()
    musteriHesap.bakiyeSorgula()
    musteriHesap.paraYatir(1000.0)
    musteriHesap.bakiyeSorgula()

}