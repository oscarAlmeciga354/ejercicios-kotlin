import java.util.Scanner
fun main(args: Array<String>){
    val dato = Scanner(System.`in`)
    print("Ingrese el valor de la hora de trabajo: ")
    val valorHora : Float = dato.nextFloat()
    print("Ingrese el número de horas trabajadas por día: ")
    val horasTrabajadasPorDia: Int = dato.nextInt()
    val salarioDiario = valorHora * horasTrabajadasPorDia
    val salarioNeto = salarioDiario * 30
    println("El salario neto es $salarioNeto")
    val salarioTotal = salarioNeto * (1 - 0.2)
    println("El salario total es $salarioTotal")



}
