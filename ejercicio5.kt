import java.util.Scanner
fun main(args: Array<String>){
    val dato = Scanner(System.`in`)
    print("Ingrese la primera nota:")
    val nta1 = dato.nextFloat()
    print("Ingrese la segunda nota:")
    val nta2 = dato.nextFloat()
    print("Ingrese la primera nota:")
    val nta3 = dato.nextFloat()
    val prom = (nta1 + nta2 + nta3)/3
    val porc55 = prom * 0.55
    print("Ingrese la nota del examen final: ")
    val ntaExamFin = dato.nextFloat()
    val porc30 = ntaExamFin * 0.3
    print("Ingrese la nota del trabajo final: ")
    val trabFin = dato.nextFloat()
    val porc15 = trabFin * 0.15
    print("La nota final de la materia es: "+ (porc55+porc30+porc15))

}