package ders6.siniflar

class Kisi {
    var yas: Int = 0
        set(value) {
            if (value >= 0){
                field = value
            }else{
                println("Hata: Yaş değeri negatif olamaz!")
            }
        }



}