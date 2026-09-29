package clase13

fun main() {
    var emailPendientes = 0

    while (emailPendientes>0){
        println ("Procesando email. Quedan :$emailPendientes email")
        emailPendientes-=1
    }

    var intentos = 0

    do {
        intentos+=1
        println("Intento de envio de correo:$intentos")
    } while (intentos<2)

    for (i in 0 .. 5){
        println("El valor de i es $i")
    }
    var i = 0
    while (i<=5){
        println("El valor de i es $i")
        i++
    }

    for (i in 5 downTo  0){
        println("El valor de i es $i")
    }

    for (i in 0 .. 10 step 2){
        println("El valor de i es $i")
    }

    val emails = arrayOf("juan@empresa.com", "carlos@empresa.com", "wilson@empresa.com")

    for (email in emails){
        println("Correo actual $email")
    }
    var indiceEmail=0
    while (indiceEmail<= emails.size-1){
        println("Correo actual ${emails.get(indiceEmail)}")
        indiceEmail++
    }

    println("\n=== EJERCICIO ===")
    println("Crea una lista de 3 emails usando for y readline")
    println("Luego recórrela con while y cuenta cuántos contienen '@'")

    // Crear una lista mutable para almacenar los emails
    val listaEmails = mutableListOf<String>()

    // usar un for para pedir 3 emails al usuario
    for (i in 1..3) {
        print("Email #$i: ")
        // Lee el email y elimina espacios en blanco al inicio y al final
        val email = readLine()?.trim() ?: "email$i@test.com"
        listaEmails.add(email) // Agrega el email a la lista
    }
    // 3. Usar while para contar emails válidos
    var emailsValidos = 0
    var posicion = 0
    while (posicion < listaEmails.size) {
        if (listaEmails[posicion].contains("@")) {
            emailsValidos++
        }
        posicion++
    }

// 4. Mostrar el resultado
    println("Cantidad de emails válidos: $emailsValidos")

}