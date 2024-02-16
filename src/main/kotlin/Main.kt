fun main() {
    // Array: imutável, cria e inicializa, mas não adiciona mais valores na lista. Pode modificar, mas não incluir novos valores
    var cidades = arrayOf("São Paulo", "Rio de Janeiro", "Goiânia")

    /*
        🔎 Casting em Kotlin:
        Coverter um tipo no outro.
        Se não especificar, e jogar um número, por exemplo, ele pode fazer o casting
    */

    println(cidades[2])

    cidades[1] = "Curitiba"
    println(cidades[1])

    println("")

    // =========================================

    var temCidade = cidades.isEmpty()
    println(temCidade)

    var valor = arrayOf<String>()
    var temValor = valor.isEmpty()
    println(temValor)

    // Tamanho de um Array
    println(cidades.size) // Tamanho de três, começando no 0

    // Array list: adicionando itens
    var frutas = ArrayList<String>()
    println("Quantidade de frutas: " + frutas.size)
    frutas.add("Banana")
    println("Quantidade de frutas: " + frutas.size)
    frutas.add("Morango")
    frutas.add("Melancia")
    frutas.add("Melancia")
    println("Quantidade de frutas: " + frutas.size)

    // Pesquisa no Array
    println(frutas.contains("Uva"))
    println(frutas.contains("Morango"))

    // Visualizar todos os itens da lista
    println(frutas)

    // Remover item
    frutas.remove("Banana") // Deve ser escrito exatamente igual
    println(frutas)

    println("A quantidade de letras da fruta ${frutas[2]} é de " + frutas[2].count() + "caracteres.")

    // ========================== Exemplo =============================

    //Criando um Array de Strings vazio
    var emptyArray =  arrayOf<String>()
    //Criando um Array de Strings e alimentando valores na criação
    var shoppingList = arrayOf<String>("Leite", "Pão", "Manteiga", "Açúcar")
    //Usando inferência
    var inferredShoppingList = arrayOf("Leite", "Pão", "Manteiga", "Açúcar")
    //Testando se um Array está vazio
    if (shoppingList.isEmpty()) {
        println("A lista de compras está vazia")
    } else {
        println("A lista de compras NÃO está vazia")
    }
    //Recuperando o total de elementos do Array
    println("Nossa lista de compras possui ${shoppingList.size} itens")
    //Resultado: Nossa lista de compras possui 4 itens
    println("Listando todos os itens:")
    println(shoppingList[0]) //Primeiro item do array
    println(shoppingList[1]) //Segundo item Acessando itens de um Array do array
    println(shoppingList[2]) //Terceiro item do array
    println(shoppingList[3]) //Quarto item do array
}