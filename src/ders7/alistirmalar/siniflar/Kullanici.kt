package ders7.alistirmalar.siniflar

//Kullanici adında bir sınıf oluşturun.
// Sınıf girişinde kullaniciAdi (String) ve rol (String) özelliklerini alsın.
// rol özelliğinin varsayılan değerini “Standart Üye” yapın.
// main içinde kullanıcıdan önce ismini isteyin,
// ardından “Özel bir yetki rolünüz var mı? (E/H)” diye sorun.
// Eğer “E” derse ondan rolünü girmesini isteyip iki parametreyle,
// “H” derse rolü pas geçip tek parametreyle (yani varsayılan rolü tetikleyerek)
// nesneyi üretin.
class Kullanici(val kullaniciAdi: String, val rol: String = "Standart Üye") {

    fun bilgileriGoster() {
        println("Kulalnıcı Adı: $kullaniciAdi, rolü: $rol")
    }


}