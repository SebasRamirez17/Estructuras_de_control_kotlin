fun main(){
    println("Ingrese el numero de dia: ")
    var dayNum= readLine()!!.toInt()
    when (dayNum) {
    1 -> println("Lunes")
    2 -> println("Martes")
    3 -> println("Miércoles")
    4 -> println("Jueves")
    5 -> println("Viernes")
    6 -> println("Sábado")
    7 -> println("Domingo")
    else -> println("Día inválido")
    }
}