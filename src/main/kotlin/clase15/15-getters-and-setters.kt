package clase15

import com.sun.org.apache.xpath.internal.operations.Bool

class Email(val remitente: String, val mensaje: String) {
    var asunto: String = ""
        set(value) { // setter personalizado que se usa para modificar el valor de la propiedad asunto
            // field almacena el valor real de asunto
            field = if (value.trim().isEmpty()) value.trim()
            else "Sin asunto"
                value.trim()
            // Si el valor que intentas asignar (value) está vacío o tiene solo espacios, se asigna "Sin asunto".
            //Si no está vacío, se asigna el valor limpio (sin espacios al inicio o al final) usando value.trim().
        }

    // val esImportante es una propiedad calculada de solo lectura (val), que verifica si el asunto contiene la palabra "urgente" (ignorando mayúsculas y minúsculas) y devuelve true o false según corresponda.
    val esImportante: Boolean

        get() = asunto.contains("urgente", ignoreCase = true)
}

class Contacto(val nombre: String) {
    var email: String = ""
        set(value) {
            field = if (value.contains("@")) value else ""
        }
    val esValido: Boolean
        get() = email.contains("@") && email.contains(".com")



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

    val contacto = Contacto("Juan")
    contacto.email = "juan@email.com"
    println("Email: ${contacto.email}, es válido?: ${contacto.esValido}") // Debería imprimir true
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
