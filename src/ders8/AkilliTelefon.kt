package ders8

class AkilliTelefon: SesCikarabilir, SarjEdilebilir {
    override fun sesCikar() {
        println("Zırrr... Telefon çalıyor.")
    }

    override fun sarjEt() {
        println("Şarj oluyor...")
    }
}