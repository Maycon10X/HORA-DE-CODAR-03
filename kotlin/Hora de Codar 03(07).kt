fun main() {
    var med = 0.0
    println("Escreva a nota do aluno")
    var not1 = readln().toDouble()
    while (not1 < 0 || not1 > 10) {
        println("Valor inválido, escreva novamente")
         not1 = readln().toDouble()
    }
    println("Escreva a nota do aluno")
    var not2 = readln().toDouble()
    while (not2 <= 0 || not2 > 10) {
        println("Valor inválido, escreva novamente")
         not2 = readln().toDouble()
    }
    println("Escreva a nota do aluno")
    var not3 = readln().toDouble()
    while (not3 < 0 || not3 > 10) {
        println("Valor inválido, escreva novamente")
         not3 = readln().toDouble()
    }
    println("Escreva a nota do aluno")
    var not4 = readln().toDouble()
    while (not4 < 0 || not4 > 10) {
        println("Valor inválido, escreva novamente")
         not4 = readln().toDouble()
    }
    println("Escreva a nota do aluno")
    var not5 = readln().toDouble()
    while (not5 < 0 || not5 > 10) {
        println("Valor inválido, escreva novamente")
         not5 = readln().toDouble()
    }
    println("Escreva a nota do aluno")
    var not6 = readln().toDouble()
    while (not6 < 0 || not6 > 10) {
        println("Valor inválido, escreva novamente")
         not6 = readln().toDouble()
    }
    println("deseja imprimir a nota do aluno? (S/N)")
    var opcao = ""
    opcao =  readln()
    if(opcao == "s"){
        med =  not1 + not2 + not3 + not4 + not5 + not6
        println("A média do aluno é " + med/6)
    }
    else {
        println("Obrigado!!!")
    }
}
