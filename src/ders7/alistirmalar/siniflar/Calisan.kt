package ders7.alistirmalar.siniflar
//Calisan adında bir sınıf oluşturun ve girişinde isim parametresini alsın.
// Sınıfın içine bir companion object bloğu açarak şirketteki
// toplam personel sayısını tutacak bir sayaç (Int) tanımlayın
// . Sınıfın init bloğu, her yeni çalışan nesnesi üretildiğinde bu sayacı
// otomatik olarak 1 artırsın. main içinde bir döngü kullanarak kullanıcıdan
// sırayla 3 çalışanın ismini isteyip nesneleri üretin. İşlem bittiğinde,
// üretilen nesneleri hiç kullanmadan doğrudan Calisan sınıfı üzerinden
// toplam personel sayısını ekrana yazdırın.

class Calisan(var isim: String) {
    companion object{
        var calisanSayisi = 0
    }

    init {
        calisanSayisi++

    }


}