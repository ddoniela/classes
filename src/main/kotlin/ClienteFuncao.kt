/*

Classe Cliente
    Atributos - Nome, sobrenome, documento, código
    Atributos secundários - estado e cidade
    Métodos - atualizar sobrenome


*/
fun main () {
    val Daniela = Cliente(
        "Daniela",
        "Lima",
        "65485644-41",
        8,
        "MG",
        "Uberaba"
    )
/*
    println(Daniela.sobrenome)
    println(Daniela.cidade)


 */
    println("Digite o valor da sua compra para calcularmos o desconto: R$")
    var valor = readln().toDouble()
    Daniela.comprarDesc(valor)


}