package funcoes
inline fun transacao(funcao: () -> Unit){ //INLINE FUNCTION
    println("Abrindo transação...")
    try{
        funcao()
    }finally {
        println("Fechando transação")
    }
}



fun main(args: Array<String>) {
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}