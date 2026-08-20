package ders7.alistirmalar.siniflar

//Etkinlik adında bir sınıf oluşturun. i
// Birincil yapıcıda etkinlikAd (String), geçici bir başlangıç saati (baslangicSaatiGirdisi: Int) ve geçici bir bitiş saati (bitisSaatiGirdisi:
// Int) tanımlayın (Saatler 0-24 arası tam sayı tutacaktır). Sınıf gövdesinde `val` olan baslangicSaati ve bitisSaati özelliklerini oluşturun.
// Sınıf içindeki init bloğunda şu mantıksal denetimi kurun: Eğer bitiş saati başlangıç saatinden küçük veya eşitse (Örn: Başlangıç 14, Bitiş 10 girildiyse),
// bu durum bir mantık hatasıdır! Sistem hemen “Hata: Bitiş saati başlangıçtan önce olamaz! Bitiş saati otomatik olarak başlangıcın 2 saat sonrasına ayarlandı” uyarısı
// versin ve bitiş saatini düzeltip atasın. main içinde hatalı saatler girerek sistemin nesneyi nasıl koruduğunu test edin.
class Etkinlik(
    val etkinlikAd: String,
    baslangicSaatiGirdisi: Int,
    bitisSaatiGirdisi: Int
) {

    val baslangicSaati = baslangicSaatiGirdisi
    var bitisSaati = bitisSaatiGirdisi

    init {
        if (bitisSaatiGirdisi <= baslangicSaatiGirdisi){
            println("Hata: Bitiş saati ($bitisSaatiGirdisi:00) başlangıçtan önce olamaz! Bitiş saati otomatik olarak ${baslangicSaatiGirdisi + 2}:00 saat sonrasına ayarlandı")
            bitisSaati = baslangicSaatiGirdisi + 2
        }else{
            bitisSaati = bitisSaatiGirdisi
            println("Etkinlik zaman planlaması oluşturuldu.")
        }
    }

    fun detaylariGoster() {
        println("Etkinlik adı: $etkinlikAd | Saat: $baslangicSaati:00 - Bitiş Saati: $bitisSaati:00")
    }

}