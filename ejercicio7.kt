import java.util.Scanner
fun main(args: Array<String>){
    val metro: Float
    val dato = Scanner(System.`in`)
    print("Ingrese la cantidad en metros a calcular: ")
     metro = dato.nextFloat()
    val pulg = (metro*39.27)/1
    val pies = metro*(3.28/1)
    println("La conversion de $metro a pulgadas es: $pulg")
    println("La conversion de $metro a pies es: $pies")
}