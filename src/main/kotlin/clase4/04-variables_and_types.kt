package clase4

fun main() {
    val nombreUsuario = "Juan"  // val es inmutable, no se puede cambiar
    var nombreDeUsuario2 = "Carlos" // var es mutable, se puede cambiar

    nombreDeUsuario2 = "Pablo"

    var emailNoLeidos = 5 // Variable mutable, puede cambiar

    emailNoLeidos = 3

    println("Usuario: $nombreUsuario, Emails no leidos: $emailNoLeidos")

    val totalEmail: Int =150
    val porcentaje: Float = 75.5f
    val asunto: String ="Reunión"
    val esUrgente: Boolean = true


    val fecha: Long = 1633036800000 // Representa una fecha en milisegundos desde el epoch (1 de enero de 1970)
    val porcentaje2 : Double = 150.02


    println("-----------------------------------------------------------------")
    val  numero = 42

    val comoTexto = numero.toString() // Convertir de numero a String
    val textonumero = "25".toInt() // Convertir de String a Int

    println(numero) // imprime 42
    println(comoTexto) // imprime "42"
    println(textonumero) // imprime 25
    println("------------------------------------------------------------------")



    val leidos = 15
    val totales = 20

    val porcentajeEmails = leidos.toFloat()/totales // 0.75 es una división
    println("Porcentaje de emails leídos: $porcentajeEmails %")
    println("------------------------------------------------------------------")



    println("\n=== EJERCICIO ===")
    println("Crea: nombre (val), emails recibidos/enviados (var)")
    println("Calcula porcentaje de emails enviados")

    val nombre = "Ana"
    var emailsRecibidos = 30
    var emailsEnviados = 20
    var porcentajeEmailsEnviados = (emailsEnviados.toFloat() / (emailsRecibidos + emailsEnviados)) * 100
    println("Nombre: $nombre")
    println("Emails recibidos: $emailsRecibidos")
    println("Emails enviados: $emailsEnviados")
    println("Porcentaje de emails enviados: $porcentajeEmailsEnviados%")


}