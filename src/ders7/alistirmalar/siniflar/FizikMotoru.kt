package ders7.alistirmalar.siniflar

//Fiziksel hesaplamalar yapacağımız nesnesiz (hiçbir nesne üretilmeyecek) bir FizikMotoru sınıfı tasarlayın.
// Sınıfın içine bir companion object bloğu açıp
// Dünya’nın yer çekimi ivmesini temsil eden bir sabit
// (const val YER_CEKIMI = 9.8) tanımlayın.
// Aynı blok içerisine dışarıdan serbest düşüş saniyesini (Double)
// parametre alan ve hızını (Süre * Yer Çekimi) hesaplayıp ondalıklı olarak geri döndüren
// bir fonksiyon yazın.
// main içinde kullanıcıdan saniye değerini (çökme korumalı) alıp nesne üretmeden doğrudan hızı hesaplatarak yazdırın.
class FizikMotoru {

    companion object{
        const val YER_CEKIMI = 9.8

        fun serbestDusmeHizi(saniye: Double): Double {
            return saniye * YER_CEKIMI
        }
    }



}