object Variaveis {
  def main (args: Array[String]): Unit = {
    // definicao de variavel imutavel(constante) deve ser feito com a palavra reservada "val"
    // definicao de variavel mutavel(pode ser alterado no decorrer da aplicacao) deve ser feito com a palavra reservada "var"
    val a = 5 
    println("O valor de a � - " + a)
    var b = 2 
    println("O valor de b � - " + b)
    b = 10
    println("O valor de b � - " + b)
    val c = 2.0 // definicao de variavel double
    println("O valor de c � - " + c)
    val d = "Variavel String ..."
    println(d)
     val f = 2.0f // definicao de variavel double
    println("O valor de f � - " + f)
  }
}