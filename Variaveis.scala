object Variaveis {
  
  def main (args: Array[String]): Unit = {
    
    val a = 5 // definicao de variavel imutavel(constante)
    println("O valor de a é - " + a)
    var b = 2 // definicao de variavel mutavel(pode ser alterado no decorrer da aplicacao)
    println("O valor de b é - " + b)
    b = 10
    println("O valor de b é - " + b)
    val c = 2.0 // definicao de variavel double
    println("O valor de c é - " + c)
    val d = "Variavel String ..."
    println(d)
     val f = 2.0f // definicao de variavel double
    println("O valor de f é - " + f)
  }
}