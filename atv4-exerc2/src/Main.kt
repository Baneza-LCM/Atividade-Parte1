package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("abrindo transação...")
    try {
        funcao()
    } finally {
        println("fechando transação")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executando SQl 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}