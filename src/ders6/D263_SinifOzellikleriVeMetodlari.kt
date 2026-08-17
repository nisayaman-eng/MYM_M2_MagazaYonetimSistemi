package ders6

import ders6.siniflar.Araba

fun main() {
    val benimArabam = Araba()
    val seninAraban = Araba()

    println("""
        |Benim Arabamın Özellikleri:
        |Renk: ${benimArabam.renk}
        |Hız: ${benimArabam.hiz}
        |Marka: ${benimArabam.marka}
    """.trimIndent())

    println("--------------------------")

    println("""
        |Senin Arabanın Özellikleri:
        |Renk: ${seninAraban.renk}
        |Hız: ${seninAraban.hiz}
        |Marka: ${seninAraban.marka}
    """.trimIndent())

    println("--------------------------")

    benimArabam.renk = "Gold"
    benimArabam.hiz = 150

    benimArabam.gazaBas()

    benimArabam.frenYap()

    println("""
        | Benim Arabamın Özellikleri:
        |Renk: ${benimArabam.renk}
        |Hız: ${benimArabam.hiz}
        |Marka: ${benimArabam.marka}
    """.trimIndent())

    println("--------------------------")

    println("""
        |Senin Arabanın Özellikleri:
        |Renk: ${seninAraban.renk}
        |Hız: ${seninAraban.hiz}
        |Marka: ${seninAraban.marka}
    """.trimIndent())

    seninAraban.gazaBas()
    seninAraban.gazaBas()
    seninAraban.gazaBas()



}