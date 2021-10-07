package me.reialves

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipocontratacao: String

) {
    override fun toString(): String = """ 
        Nome: $nome
        Salario: $salario
    """.trimIndent()
}
