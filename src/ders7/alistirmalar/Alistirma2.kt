package ders7.alistirmalar

import ders7.alistirmalar.siniflar.Kullanici

fun main() {
    // main içinde kullanıcıdan önce ismini isteyin,
    // ardından “Özel bir yetki rolünüz var mı? (E/H)” diye sorun.
    // Eğer “E” derse ondan rolünü girmesini isteyip iki parametreyle,
    // “H” derse rolü pas geçip tek parametreyle (yani varsayılan rolü tetikleyerek)
    // nesneyi üretin.

    print("Adınızı girin: ")
    val ad = readln().trim()

    print("Özel bir yetki rolünüz var mı? (E/H): ")
    val secim = readln().trim().lowercase()

    if (secim == "e"){
        print("Sistem rolünüzü girin: ")
        val rol = readln().trim()
        val ozelKullanici = Kullanici(ad, rol)
        ozelKullanici.bilgileriGoster()
    }else if (secim == "h"){
        val normalKullanici = Kullanici(ad)
        normalKullanici.bilgileriGoster()
        println("Nesne üretildi.")
    }else{
        println("Geçerli bir komut girin.")
    }



}