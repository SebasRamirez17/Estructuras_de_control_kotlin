fun main() {
    //Declaración de un conjunto de números enteros
    val numeros = setOf(1, 2, 3, 4, 5)

    //Accediendo a los elementos del conjunto
    println(numeros.contains(3))//Imprime: True
    println(numeros.contains(6))//Imprime: False

    //Iterando sobre los elementos del conjunto con un for Loop
    for (numero in numeros) {
        println(numero)
    }

    //Declaración de un conjunto mutable de cadenas
    val frutas = mutableSetOf("manzana", "pera", "naranja")

    //Agregando elementos al conjunto mutable
    frutas.add("fresa")
    frutas.addAll(listOf("banano", "sandia"))

    //Eliminando elementos del conjunto mutable
    frutas.remove("pera")
    frutas.removeAll(listOf("manzana", "naranja"))

    //Iterando sobre los elemntos del conjunto mutable con un for Loop
    for (fruta in frutas) {
        println(fruta)
    }
}