package me.reialves

fun main() {
    val nomes = Array(3) {""}

    nomes[0] = "Maria"
    nomes[1] = "Zaza"
    nomes[2] = "Jose"

    for (nome in nomes){
        println(nome)
    }

    nomes.sort()

    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Zaza", "Jose")

    nomes2.sort()
    nomes2.forEach { println(it) }
    }
