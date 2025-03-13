fun main() {
    println("Informe um número")
    var num1 = readln().toInt()
    println("Informe um número")
    var num2 = readln().toInt()
    var media = 0
    var soma = 0
    while (num1 <= num2) {
        media = media + num1
        soma = soma + 1
        num1 = num1 + 1
    }
    println("O resultado da média é " + media/soma)
}