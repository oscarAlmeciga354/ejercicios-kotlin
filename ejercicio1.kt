import java.util.Scanner
fun main() {
    val dato = Scanner(System.`in`)
    println("Ingrese la primera edad: ")
    val edad1 = dato.nextInt()
    println("Ingrese la segunda edad: ")
    val edad2 = dato.nextInt()
    println("Ingrese la tercera edad: ")
    val edad3 = dato.nextInt()
    val promedio = (edad1+edad2+edad3)/3
    println("El promedio de edades es: $promedio")




}


