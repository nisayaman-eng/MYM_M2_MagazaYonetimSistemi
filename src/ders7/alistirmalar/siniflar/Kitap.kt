package ders7.alistirmalar.siniflar

class Kitap(val ad: String, val yazar: String, val sayfaSayisiGirdisi: Int) {
    var sayfaSayisi: Int = 1
        set(value) {

            if (value <= 0){
                println("Hatalı sayfa sayısı! Sayfa sayısı 1 olarak ayarlandı.")
                field = 1
            }else {
                field = value
            }
        }

    init {
        sayfaSayisi = sayfaSayisiGirdisi
    }

}