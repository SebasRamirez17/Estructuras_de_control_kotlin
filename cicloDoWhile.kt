fun main() {
    var opcion: Int;
    var num1: Double;
    var num2: Double;

    do{
        println("Ingrese el primer número: ");
        var num1 = readLine()!!.toDouble();

        println("Ingrese el segundo número: ");
        var num2 = readLine()!!.toDouble();

        println("Elija una opción \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n 5.Finalizado\n");
        var opcion = readLine()!!.toInt();
        when (opcion) {
            1 -> println("La suma de los números es $(num1 + num2)");
            2 -> println("La resta de los números es $(num1 - num2)");
            3 -> println("La multiplicación de los números es $(num1 * num2)");
            4 -> {
                if(num2 <= 0){
                    println("El número dos es negativo o igual a cero");
                }else{
                    println("La división de los números es $(num1 / num2)");
                }
            }
            5 -> println("El sistema a finalizado");
            else -> println("Opción inválida");
        }
    } while (opcion!= 5);
}