data class Cliente(
    var nome: String, var sobrenome: String,
    var documento: String, var cod: Int
) {
    var estado = ""
    var cidade = ""

    constructor(
        nome: String, sobrenome: String, documento: String, cod: Int,
        estado: String
    ) : this(nome, sobrenome, documento, cod) {
        this.estado = estado
    }

    constructor(
        nome: String, sobrenome: String, documento: String, cod: Int,
        estado: String, cidade: String
    ) : this(nome, sobrenome, documento, cod, estado) {
        this.cidade = cidade
    }



    fun comprarDesc(valor: Double) {
        if (valor > 50.00){
            val valorDesc = valor * 0.10
            val total = valor - valorDesc
            println("O seu desconto é R$$valorDesc e o seu total com desconto é R$total")
        } else{

            println("Infelizmente você precisa comprar mais de R$50 para conseguir 10% de desconto.")
        }
    }
}



