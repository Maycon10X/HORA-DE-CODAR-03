fun main(){
    var med = 0.0
    println("Escreva a nota do aluno")
    var not1 = readln().toDouble()
    println("Escreva a nota do aluno")
    var not2 = readln().toDouble()
    println("deseja imprimir a nota do aluno? (S/N)")
    var opcao = ""
    opcao =  readln()
    if(opcao == "s"){
      med =  not1 + not2
        println("A média do aluno é " + med/2)
    }
    else {
        println("Obrigado!!!")
    }

}