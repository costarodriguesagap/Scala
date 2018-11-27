object Condicionais_IF_ELSE {
  val z = 10
  def kvale10():String = if(z == 10) "z vale 10" else "z nao vale 10"
    
  def main(args: Array[String]):Unit = {
    val n = 7
    if(n == 5){println("Sim, n vale 5")}
    else if(n == 6){println("Nao, n nao vale 5, vale 6")}
    else if(n == 7){println("Nao, n nao vale 5, nao vale 6, vale 7")}
    else{println("Nao, n nao vale nem 5 nem 6 nem 7")}
    
    val k = 11
    println(if(k == 10) "k vale 10" else "k nao vale 10")
    println(Condicionais_IF_ELSE.kvale10())
    
    }
}