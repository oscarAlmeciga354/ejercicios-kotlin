
import java.util.Scanner

fun main(args: Array<String>) {
    val sueldoBase: Int
    val nVentas: Int
    val cInicial : Float = 0.10f
    val dato = Scanner(System.`in`)
    println("Ingrese el sueldo base: ")
    sueldoBase = dato.nextInt()
    println("Ingrese las ventas realizadas: ")
    nVentas = dato.nextInt()
    val totalComisiones = cInicial * nVentas
    val porc = totalComisiones * sueldoBase
    println("El sueldo total es: "+ (sueldoBase + porc))
}



