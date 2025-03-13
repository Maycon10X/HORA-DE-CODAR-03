var num1 = 0.0


fun main() {
    println("Informe um número")
    num1 = readln().toDouble()
    inicio()
}
fun inicio() {
    println("Informe outro número")
    var num2 = readln().toDouble()
    if (num2 <= 0) {
        inicio()
    } else {
        println("o resultado da divisão é " + num1/num2)
    }
}