fun main() {
    println("Ingrese el numero a: ")
    val a = readLine()!!.toInt()

    println("Ingrese el numero b: ")
    val b = readLine()!!.toInt()
    
    if (a > b) {
    println("$a es mayor que $b")
    } else {
    if (b > a) {
    println("$b es mayor que $a")
    } else {
    println("$a y $b son iguales")
    }
    }
    println("\n\nTerminó la estructura")
}