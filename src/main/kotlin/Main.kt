fun main() {
    // ========================
    // Operadores aritmeticos
    var a = 10
    var b = 20
    var c = a + b
    println("Soma $c")

    c = a - b
    println("Subtração $c")

    c = a * b
    println("Multiplicação $c")

    c = a % 2 // resto da divisao
    println("Resto $c")

    // a = a + 5; Funciona desses jeitos abaixo
    a += 5;
    a -= 3;
    a /= 2;
    a *= 3;
    a %= 2;
    println("Soma composta $a")
    println("\n")

    println("========================")
    println("\n")
    // ========================
    // Operadores de comparação

    println(2 > 5)
    println(2 < 5)
    println(2 == 5)
    println(2 == 2)
    println(2 != 2)
    println(2 != 3)
    println(2 >= 2)
    println(2 <= 2)
    println(2 <= 3)
    println(2 >= 3)
    println("\n")

    println("========================")
    println("\n")
    // ========================
    // Operadores lógicos

    // &&
    println(2 > 3 && 5 < 4) // false + false = false
    println(2 < 3 && 5 < 4) // true + false = false
    println(2 < 3 && 5 > 4) // true + true = true
    println(2 < 3 && 5 > 4 && 1 != 1) // true + true + false = false
    println(2 < 3 && 5 > 4 && 1 != 10) // true + true + true = true

    // ||
    println(2 > 3 || 5 == 5) // false + true = true
    println(2 < 3 || 5 == 5) // true + true = true
    println(2 == 3 || 5 < 5) // false + false = false
    println("\n")

    println("========================")
    println("\n")
    // ========================
    // Operador Ternário

    var grade = 7.5
    var result = if (grade > 7.0) "aprovado" else "reprovado"
    println(result)   //aprovado
    println("\n")


    println("========================")
    println("\n")
    // ========================
    // COALESCÊNCIA NULA (?:)
    // Em Kotlin, o operador ?: permite decidir pelo uso de uma atribuição de redundância, caso a variável analisada seja nula. O Código-fonte “Operador Coalescência nula” mostra exemplos do uso.

    var age: Int? = null
    var myAge = age ?: 0    //0
    println(myAge)

    age = 25
    var newAge = age ?: 0   //25
    println(newAge)

    // Outro exemplo

    // Variável para representar o local da festa (age)
    var localDaFesta: String? = null // Se o local não for encontrado, inicialmente é nulo

    // Se o amigo não encontrar um local disponível, você decide por um local alternativo (valor padrão após ?:)
    var localEscolhido = localDaFesta ?: "Casa do João" // "Casa do João" é o local alternativo
    println("O local da festa é: $localEscolhido")

    // Se o amigo encontrar um local disponível, você vai com esse local
    localDaFesta = "Salão de Festas"
    localEscolhido = localDaFesta ?: "Casa do João" // Neste caso, o local encontrado será o utilizado
    println("O local da festa é: $localEscolhido")

    // Se localDaFesta for nulo, localEscolhido será "Casa do João" (o valor padrão).
    // Se localDaFesta não for nulo, localEscolhido será o valor de localDaFesta.
    println("\n")


    println("========================")
    println("\n")
    // ========================
    // CLOSED RANGE(..) E HALF CLOSED RANGE (UNTIL)
    //Estes operadores criam um intervalo de valores. O Closed Range utiliza (..) para criar um intervalo aberto, indicando o valor inicial e o valor final. Por sua vez, o Half Closed Range utiliza a palavra reservada (until) para criar um intervalo entre o valor inicial e o valor imediatamente anterior ao valor final (intervalo aberto no início e fechado ao final). Veja o exemplo a no Código-fonte “Operadores Closed Range e Half Closed Range” no qual esses operadores são utilizados em uma estrutura de repetição for.

    println("\nClosed Range ..")
    var numbers = 1..10
    for (number in numbers) {
        println(number)   //Imprime de 1 a 10
    }

    println("\nHalf Closed Range (until)")
    var newNumbers = (1 until 10)
    for (number in newNumbers) {
        println(number)   //Imprime de 1 a 9
    }
}