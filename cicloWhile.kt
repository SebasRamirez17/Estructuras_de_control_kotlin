fun main() {
    var resp = "si";
    var cont = 0;

    while(resp == "si"){
        print("Ingrese nombre: ");
        var nombre = readLine()!!.toString();

        println("Hola $nombre bienvenid@ a la clase");
        cont++;
        print("Ingrese si, si quiere agregar otra persona: ");
        resp = readLine().toString();
    }
    println ("Llegaron a la clase la cantidad $cont personas");
    println("Finalizó el ciclo");
}