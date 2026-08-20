package ders7.alistirmalar

import ders7.alistirmalar.siniflar.Calisan

fun main() {
    for (i in 1..3){
        print("$i. personel adını girniz: ")
        val yeniPersonel = readln().trim()
        val calisan = Calisan(yeniPersonel)
    }

    println("Toplam çalışan sayısı: ${Calisan.calisanSayisi}")




}