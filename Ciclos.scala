object Ciclos {
  def main(args:Array[String]):Unit = {
    var k = 0
    while (k < 10){
      // Quando pretendemos juntar texto a uma variavel, pode-se usar "$<variavel>" ou "${<variavel>}" dentro de aspas, 
      // e nao contatenar variavel com texto usando o "+". 
      // O "s" antes do inicio do texto é para indicar que temos codigo interpolado
      println(s"o valor de k é - ${k} e o seguinte é ${k + 1}")
      k += 1
    }
  }
}
