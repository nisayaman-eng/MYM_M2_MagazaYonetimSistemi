package ders9

fun main() {

    val sayilar = listOf(1,2,3,4,5,5,5)

    val sayilarSeti =  sayilar.toSet()
    println("Sayılar seti: $sayilarSeti")

    println("Sayılar seti 2: ")
    sayilar.distinct().forEach { println(it)}




    val ciftler = sayilar.filter { it % 2 == 0}
    println(ciftler)

    //.map variyi yeniden oluşturmayı sağlıyor. (Dönüştürme işlemi)
    val kareler = sayilar.map { it * it}
    println(kareler)

    ciftler.forEach { println("Çift sayı: $it") }

    val numaralar = listOf(10, 15, 45, 85, 5, 20, 25, 30)
    numaralar.filter { it > 5}.map { it * 2 }.forEach { println(it) }

    numaralar.sorted().forEach { println(it) }
    println("-----")
    numaralar.reversed().forEach { println(it) }// var olan sırayı tersine çevirir
    println("-----")
    val adet = numaralar.count{it > 15}//15 ten büyük kaç tane sayı varsa saymasını istedik burda. .count() diye de kullanılır
    println(adet)



}