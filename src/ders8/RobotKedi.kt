package ders8

class RobotKedi : SesCikarabilir, SarjEdilebilir {
    override fun sesCikar() {
        println("Mekanik miyav sesi çıkarıyor...")
    }

    override fun sarjEt() {
        println("Şarj oluyor...")
    }
}