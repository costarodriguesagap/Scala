object Match {
 // funcao match permite executar accoes de forma dinamica, é uma forma dinamica de interpretar expressoes
 def obtem_descricao_mes(mes: Int):String = {
   mes match{
     case 1  => "Janeiro"
     case 2  => "Fevereiro"
     case 3  => "Marco"
     case 4  => "Abril"
     case 5  => "Maio"
     case 6  => "Junho"
     case 7  => "Julho"
     case 8  => "Agosto"
     case 9  => "Setembro"
     case 10 => "Outobro"
     case 11 => "Novembro"
     case 12 => "Dezembro"
     case _  => "N/A"
   }
 }
 def printa_descricao_mes(mes: Int):Unit = {
   println(mes match{
     case 1  => "Janeiro"
     case 2  => "Fevereiro"
     case 3  => "Marco"
     case 4  => "Abril"
     case 5  => "Maio"
     case 6  => "Junho"
     case 7  => "Julho"
     case 8  => "Agosto"
     case 9  => "Setembro"
     case 10 => "Outobro"
     case 11 => "Novembro"
     case 12 => "Dezembro"
     case _  => "N/A"
   })
 }
 def main(args: Array[String]):Unit = {
   /*println(Match.obtem_descricao_mes(2))
   println(Match.obtem_descricao_mes(12))
   println(Match.obtem_descricao_mes(8))
   println(Match.obtem_descricao_mes(5))*/
   println(Match.obtem_descricao_mes(-1))
   Match.printa_descricao_mes(1)
   Match.printa_descricao_mes(9)
   Match.printa_descricao_mes(20)
   
 }
}