fun main() {
    // Tipo Nullable: NullSafety
    var idade: Int? = null // A interrogação permite que a variável idade use o valor null
    println(idade)

    idade = 20
    println(idade)

    // Exemplo =================

    // A atribuição de null a um var também não será compilada
    //var driverLicense: String = "6789877"
    //driverLicense = null // não compila
    // Para que uma variável contenha um valor null é necessário
    // o uso do sufixo ? no tipo

    /* var driverLicense: String? = null
    println(driverLicense)
    driverLicense = "6789877"
    println(driverLicense)
    driverLicense = null // agora compila
    println(driverLicense) */

    var driverLicense: String? = null
    // driverLicense = "6789877"
    if (driverLicense != null) {
        println("A carteira de motorista é $driverLicense")
    } else {
        println("Esta pessoa não possui carteira de motorista")
    }
}