fun main(args: Array<String>) {
    var nomeFaculdade = "FIAP"
    println(nomeFaculdade)

    nomeFaculdade = "Faculdade de Informática e Administração Paulista"
    println(nomeFaculdade)

    // nomeFaculdade = 200 // Não pode mudar o tipo da variável. Se foi "definida"/advinhada como String, vai ser string até ser apagada

    var idade: Byte = 20
    println(idade)

    val pi = 3.14 // Variável constante

    var peso: Byte = -128
    println(peso)

    println("")
    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)
    /* Digamos que o mínimo e máximo seja o valor do Bit divido por 2.
    Ele aceita positivo e negativo, contudo, no positivo, ele conta do 0, por isso vai até 127, e no negativo não, por isso, -128
    */
    println("")
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
}