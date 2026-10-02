package clase13

fun main() {
    var emailPendientes = 3

    while (emailPendientes>0){
        println ("Procesando email. Quedan :$emailPendientes email")
        emailPendientes-=1
    }
    println("--------------------------------------------------------------")

    var intentos = 0

    do {
        intentos+=1 // intentos = intentos + 1
        println("Intento de envio de correo:$intentos") // ou
    } while (intentos<2)

    println("------------------------------------------------------------------------")
    for (i in 0 .. 5){
        println("El valor de i es $i")
    }
    println("------------------------------------------------------------------------")

    var i = 0
    while (i<=5){
        println("El valor de i es $i")
        i++
    }
    println("------------------------------------------------------------------------")

    for (i in 5 downTo  0){
        println("El valor de i es $i")
    }
    println("------------------------------------------------------------------------")
    for (i in 0 .. 10 step 2){
        println("El valor de i es $i")
    }
    println("------------------------------------------------------------------------")

    val emails = arrayOf("juan@empresa.com", "carlos@empresa.com", "wilson@empresa.com")

    for (email in emails){
        println("Correo actual $email")
    }
    println("------------------------------------------------------------------------")

    var indiceEmail=0
    while (indiceEmail<= emails.size-1){
        println("Correo actual ${emails.get(indiceEmail)}")
        indiceEmail++
    }
    println("------------------------------------------------------------------------")

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

    /*
    Creación de la lista:
Se crea una lista mutable (mutableListOf) para almacenar los emails que el usuario ingrese.

Bucle for:
Este bucle se ejecuta 3 veces (de 1 a 3).
En cada iteración, se solicita al usuario que ingrese un email con readLine().
El email ingresado se limpia de espacios con .trim() y se agrega a la lista.

Bucle while:
Este bucle recorre la lista de emails desde la posición 0 hasta el final (listaEmails.size).
En cada iteración, verifica si el email actual contiene el carácter '@' usando .contains("@").
Si el email es válido, incrementa el contador emailsValidos.
Luego, avanza a la siguiente posición incrementando posicion.

Resultado:
Al finalizar el bucle while, se imprime la cantidad de emails válidos.
¿Qué pasa en segundo plano?

Bucle for: Se repite un número fijo de veces (3 en este caso). En cada repetición, realiza una acción específica (pedir un email y agregarlo a la lista).

Bucle while: Se repite mientras la condición (posicion < listaEmails.size) sea verdadera. En cada repetición, verifica un email y avanza al siguiente.

Control de flujo: Los bucles controlan el flujo del programa, permitiendo repetir acciones hasta que se cumpla una condición o se alcance un límite
     */

}