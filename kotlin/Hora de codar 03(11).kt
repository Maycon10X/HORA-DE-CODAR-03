fun main() {
    var cont = 0
    var n = 1
    var m = 1
    println("Vamos fazer uma tabuada, escolha seu número de 1 a 10 ")
    var num = readln().toInt()
    while (cont <= 10) {
        println("Essas são as tabuadas   $n x  $m = " + n * m)
        n = n + 1
        cont = cont + 1

        if (cont == 10) {
            m = m + 1
            cont = 0
            n = 1
            if (m > num) {
                break
            }
        }
    }
}