object funcoes {
  // declaração de uma funcao, usar palavra reservada "def"
  // o retorno da funcao soma é "Int" que se define após "):"
  // uma funcao com apenas com uma linha no corpo nao necessita de chavetas, defini-se o corpo da funcao após o "="
  // uma funcao sem retorno deve ter no sitio do tipo de retorno a palavra reservada "Unit"
  def soma(a:Int,b:Int):Int = a+b
  def subtracao(a:Int,b:Int):Int = {a-b}
  def divisao(a:Int,b:Int):Int = {
    val dividendo = a
    val divisor = b
    a/b
  }
  def maior_que(a:Int,b:Int):Unit = {
    if(funcoes.subtracao(a,b)<0){
      println("a menor que b")
      }
    else{
      println("a maior que b")
      }
  }
  def main (args: Array[String]): Unit = {
    println(funcoes.soma(1,0))
    println(funcoes.subtracao(3,1))
    println(funcoes.divisao(6,2))
    funcoes.maior_que(6,2)
    funcoes.maior_que(2,3)
  }
}