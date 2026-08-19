package ders7.siniflar

class Oyuncu(var isim: String, can: Int) {
    var can: Int = can
        set(value) {
            if (value !in 0..100) {
                println("Hata: Can değeri 0 ile 100 arasında olmalı!")
                field = 100
            }
        }


    init {
        println("Yeni bir oyuncu katıldı. Hoşgeldin $isim")
        this.can = can //Değişken can old. vurgu yapmış olduk
    }


}