fun main() {
    /* Exercício:

    + Criar um Array vazio para armazenar as tarefas.
    + Adicionar algumas tarefas à lista inicialmente.
    + Verificar se a lista está vazia.
    + Adicionar mais algumas tarefas à lista.
    + Verificar se a lista está vazia novamente.
    + Mostrar todas as tarefas na lista.
    + Remover uma tarefa específica.
    + Contar a quantidade de letras em uma tarefa específica.

    Dica: Você pode usar as funções isEmpty(), add(), contains(), remove(), size e count() para realizar estas operações.
    */

    var tasks = ArrayList<String>()
    tasks.add("• Lavar o carro")
    tasks.add("• Levar o lixo")
    tasks.add("• Tomar banho")

    println("======== 📋 To.do: Lista de tarefas ========")
    println("")

    if (tasks.isEmpty()) {
        println("A lista de tarefas está vazia! Hora de relaxar! 😎")
        println("")
    } else {
        println("Há tarefas a fazer! Mãos à obra!")
        println("")
        println("✅ Lista:")
        for (task in tasks) {
            println(task)
        }
        println("")
        println("A lista possui ${tasks.size} tarefas.")
        println("")
        for (task in tasks) {
            println("A tarefa ${task} possui ${task.length} caracteres.")
        }
    }

    tasks.remove("• Tomar banho")
    println("")
    println("=================")
    println("")
    println("A tarefa \"Tomar banho\" foi removida da lista com sucesso.")
}