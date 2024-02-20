fun main() {
    // Map: consegue colocar uma lista do tipo chave e valor
    // Lista de produtos, dá para fazer o map

    var produtos = HashMap<String, Double>()
    produtos.put("Mouse", 149.9)
    produtos.put("Teclado", 219.99)
    produtos.put("Apontador laser", 56.99)

    println(produtos)
    println(produtos.size)

    produtos.remove("Mouse")
    println(produtos)

    println(produtos.get("Teclado"))
}