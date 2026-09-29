package clase5

fun main() {
    val emailsRecibidos= 25
    val emailsEnviados = 15
    val emailsEliminados = 3

    val totalEmails = emailsRecibidos + emailsEnviados  //40
    val diferencia = emailsRecibidos - emailsEnviados // 10
    val dobleEmails = emailsRecibidos * 2 // 50
    val promedio = totalEmails /  2 // 20
    val residuo = emailsRecibidos % 7   // 25/7 = 3  residuo 25- 21 = 4

    println("Total : $totalEmails, promedio: $promedio, Residuo:$residuo") // output: Total : 40, promedio: 20, Residuo:4

    println("------------------------------------------------------------------")

    val calculo = 10 + 5 * 2  //20 // 5*2=10 +10 =20
    println(calculo)
    val calculo2 = (10 + 5) * 2 // 15*2=30
    println(calculo2)
    println("------------------------------------------------------------------")

    val emailsPorSemana = emailsEnviados*7 + emailsRecibidos*7 - emailsEliminados*7
    println("Emails por semana: $emailsPorSemana") // output: Emails por semana: 259

    println("------------------------------------------------------------------")

    
    var contador = 10
    println(contador) // output: 10

    contador = contador + 1
    println(contador) // incremento 11

    contador -= 2 //
    println(contador) // decremento 9

    contador *= 2
    println(contador)  // multiplicación 18

    contador /= 2
    println(contador)  // División 9

    contador %= 3
    println(contador) // output: 0

    println("\n=== EJERCICIO ===")
    println("Calcula: Calcula el incremento en porcentaje de emails enviados ayer vs los enviados hoy")

    val emailsEnviadosAyer = 8
    val emailsEnviadosHoy = 12

    val incrementoPorcentaje = ((emailsEnviadosHoy - emailsEnviadosAyer).toFloat() / emailsEnviadosAyer) * 100
    println("Incremento en porcentaje de emails enviados: $incrementoPorcentaje%")

}