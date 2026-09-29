package clase15

import com.sun.org.apache.xpath.internal.operations.Bool

class Email(val remitente: String, mensaje: String) {
    var asunto: String = ""
        set(value) {
            field = if (value.trim().isEmpty()) "Sin asunto" else value.trim()
        }

    val esImportante: Boolean
        get() = asunto.contains("urgente", ignoreCase = true)
}

class Contacto(
    private var _email: String = ""
) {
    var email: String
        get() = _email
        set(value) {
            _email = if (value.contains("@")) value else ""
        }

    val esValido: Boolean
        get() = _email.isNotEmpty() && _email.contains("@")
}
fun main() {
    val email1 = Email(remitente = "carla@empresa.com", mensaje = "Este es un mensaje de correo")
    email1.asunto = "   "
    println("El asunto es: ${email1.asunto}") // Ahora imprimirá "Sin asunto"

    email1.asunto = "URGENTE-Reunión jueves"
    println("El correo es importante?: ${email1.esImportante}") // Debería imprimir true

    println("\n=== EJERCICIO ===")
    println("Crea clase 'Contacto' con:")
    println("- Setter para email: validar que contenga '@' para agregarlo. En caso contrario dejarlo vacio")
    println("- Propiedad calculada 'esValido'")
}



class Mascota {
    // 1. Propiedad con getter y setter por defecto
    var nombre: String = ""

    // 2. Propiedad con getter personalizado
    val estaHambriento: Boolean = true
        get() = field // field es el valor de la propiedad

    // 3. Propiedad con setter personalizado
    var edad: Int = 0
        set(nuevoValor) {
            field = if (nuevoValor >= 0) nuevoValor else 0
        }
}
/*
Paso a paso:
var nombre: String
Getter automático: mascota.nombre (obtiene el valor)
Setter automático: mascota.nombre = "Firulais" (asigna el valor)
val estaHambriento: Boolean
Solo tiene getter porque es val (inmutable)
get() = field retorna el valor actual
Se usa para leer: mascota.estaHambriento
var edad: Int
Tiene setter personalizado
field es el valor interno de la propiedad
Valida que la edad no sea negativa
 */
/*
fun main() {
    val mascota = Mascota()

    // Usando setters
    mascota.nombre = "Firulais"    // Setter automático
    mascota.edad = -5              // Setter personalizado (guardará 0)

    // Usando getters
    println(mascota.nombre)        // Getter automático
    println(mascota.estaHambriento) // Getter personalizado
    println(mascota.edad)          // Mostrará 0
}

 */
