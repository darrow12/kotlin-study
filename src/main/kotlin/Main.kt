fun main(args: Array<String>) {
    var nome = "Kim"
    println(nome)

    nome = "Maria"
    println(nome.length)

    /* ============================================ */

    // STRING: cadeira de caracteres
    var cidade: String = "São Paulo"
    println("Nome da cidade: " + cidade)
    println("Quantidade de Letras: " + cidade.length)
    // String é para guardar algo grande na memória

    /* ============================================ */

    // CHAR: Representar uma informação com uma letrinha
    println("")
    var tipo = 'X' // Aspas simples identifica com Char, aspas duplas como String
    println(tipo)
    // É necessário definir de forma explícita o tipo Char na variável, pois se não, será String

    /* ============================================ */

    // PAIR: armazenar dois valores diferentes mas na mesma variável, por exemplo
    var (codigo, descricao) = Pair(100, "Teclado") // Tipagem por inferência
    println(codigo)
    println(descricao)

    var produto2: Pair<Int, String> = Pair(200, "Mouse") // Tipagem explícita
    println("")
    println("========")
    println("")
    println("Produtos: " + produto2)
    println("")
    println("• " + produto2.first + " 🔢")
    println("• " + produto2.second + " 🖱️")
    println("")

    /* ============================================ */

    var text = "Este texto \"quebra\" em duas linhas"
    var text2 = "Nota:\t 10"
    println(text)
    println(text2)

    /* ============================================ */

    // Interpolação de Strings
    val studentGrade = 8.5
    val studentName = "Jão"
    val result = "aprovado"
    val message = "O aluno $studentName tirou $studentGrade e está $result"
    println(message)
}