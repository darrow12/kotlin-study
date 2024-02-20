fun main() {
    // Set não permite itens repetidos
    var filmes = HashSet<String>()
    println(filmes.size)

    filmes.add("Homem-Aranha 1")
    filmes.add("Homem-Aranha 2")
    filmes.add("Homem-Aranha 3")
    println(filmes.size)

    println(filmes)

    filmes.add("Homem-Aranha 1")
    println(filmes)

    filmes.add("Homem-Aranha 4")
    println(filmes)

    println(filmes.contains("Homem-Aranha 1"))
    println(filmes.contains("Homem Aranha 1"))

    filmes.remove("Homem-Aranha 4")
    println(filmes)

    println("\n")
    // ===========================
    // Forma reduzida:
    var precos = setOf(45.9, 78.7, 54.9, 41.9)
    println(precos)
    // QUando criado dessa forma, não é possível adicionar novos elementos
}