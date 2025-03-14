fun main() {
    var valor = 0
    var cont = 0
    var dentro = 0
    var fora = 0

    while(cont < 10){
        println("Escreva os valores ")
        valor = readln().toInt()

        if (valor >= 24 && valor <= 42){
            dentro++ // dentro++ a mesma coisa que dentro = dentro + 1
        }
        else{
            fora++
        }
        cont++
    }
    println("A quantidade de números entre o intervalo é: " + dentro)
    println("A quantidade de números fora do intervalo é: " + fora)


}