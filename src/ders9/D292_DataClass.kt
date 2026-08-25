package ders9

fun main() {
    val urun1 = UrunModeli(1, "Klavye")
    val urun2 = UrunModeli(1, "Klavye")
    println(urun1 == urun2)

    //copy() val değerler için kullanılıyor. Çünkü val değerler değiiştirlimez
    val urun1V2 = urun1.copy(sepetteMi = true)
    println(urun1)
    println(urun1V2)






}