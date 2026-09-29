package clase7

fun main () {
    var emailObligatorio:String = "user@email.com" // No puede ser nulo
    var emailOpcional:String? = null // Puede ser nulo

    println(emailObligatorio) // Imprime user@email.com
    println(emailOpcional) // Imprime null

    //println(emailOpcional!!) // Lanza NullPointerException si es nulo // operador !! se llama operador de aserción no nula

    //llamado seguro evita el NullPointerException en valores nulos, ?: 0 operador elvis si es nulo devuelve 0 longitud
    var longitudEmail = emailOpcional?.length ?: 0 // Operador seguro de llamada (?.) evita NullPointerException

    println("longitud del correo: $longitudEmail") // Lanza NullPointerException si emailOpcional es nulo

    println("--------------------------------------------------------------------------------------------------------------")
    println("\n=== EJERCICIO ===")
    println("Crea variables para: email (obligatorio), nombre (opcional)")
    println("Usa ?: para mostrar 'Anónimo' si nombre es null")
    println("Usa ?. para obtener la longitud del nombre de forma segura")


    val email: String? = "usuario@dominio.com"// Variables de ejemplo
    val nombreOpcional: String? = null


    // Operador Elvis ?: con cadena directa
    val nombreMostrar = nombreOpcional ?: "Anónimo"
    println("Nombre: $nombreMostrar") // Imprime: Nombre: Anónimo

    // Operador de llamada segura ?. con operador Elvis ?:
    val longitudEmail1 = email?.length ?: 0
    println("Longitud del email: $longitudEmail1") // Imprime: Longitud del email: 19

    // Combinando ambos operadores con llamadas a métodos
    val emailMayusculas = email?.uppercase() ?: "SIN EMAIL"
    println("Email en mayúsculas: $emailMayusculas") // Imprime: Email en mayúsculas: USUARIO@DOMINIO.COM
    // Operador seguro de llamada (?.) evita NullPointerException

    println("--------------------------------------------------------------------------------------------------------------")

    // Ejemplo financiero: saldo de usuario
    val saldoUsuario: Double? = null // El saldo puede ser nulo si no está inicializado

    // Usamos el operador seguro ?. y el operador Elvis ?: para manejar el caso nulo
    val saldoDisponible = saldoUsuario ?: 0.0
    println("Saldo disponible: $saldoDisponible") // Imprime: Saldo disponible: 0.0

    // Otro ejemplo: calcular intereses si el saldo no es nulo
    val tasaInteres = 0.05
    val intereses = saldoUsuario?.times(tasaInteres) ?: 0.0
    println("Intereses calculados: $intereses") // Imprime: Intereses calculados: 0.0
}