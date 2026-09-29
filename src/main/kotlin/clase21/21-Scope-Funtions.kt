package clase21

import java.util.UUID
import javax.security.auth.Subject

data class Email(
    val id:String,
    var subject: String,
    var body: String,
    var isRead: Boolean = false
)

fun main() {

    println("1. LET")
    /*
    LET:Ejecutar operaciones sobre un objeto que puede ser nulo
Transformar un objeto en otro valor
Limitar el alcance de una variable
     */
    // Generamos un emailId aleatorio con UUID que es un identificador único universal y utilizamos randomUUID() para generarlo
    val emailId: String = UUID.randomUUID().toString()
    // Transformamos el emailId a un objeto Email y let es una función de alcance que permite ejecutar un bloque de código con el objeto como receptor
    val email = emailId.let {
        // Dentro del bloque, 'it' se refiere al emailId
        Email(
            id = it,
            subject = "Reunion",
            body = "Mensaje",
        )
    }

    println("Transformamos $emailId a un $email")

    println("2. APPLY")

    val email2 = Email(
        id = UUID.randomUUID().toString(),
        subject = "Reunion",
        body = "Mensaje"
    ).apply {subject = "Fiesta fin de año"
    }

    println("email2 $email2")

    println("3. RUN")

    val email3= Email(
        id = UUID.randomUUID().toString(),
        subject = "Oferta",
        body = "Oferta de trabajo",
    )
    val asunto = email3.run {
        isRead = true
        subject = subject.uppercase()
        "Email procesado:$subject"
    }
    println("Email3: $email3")

    println("4. WITH")

    val email4= Email(
        id = UUID.randomUUID().toString(),
        subject = "Importante",
        body = "Mensaje urgente",
    )
    val summary = with(email4){
        isRead = true
        //  ...
        "ID:${id}, Asunto $subject , Leído:$isRead"
    }
    println("El resumen de $email4 es: $summary")

    println("5. ALSO")
    val email5= Email(
        id = UUID.randomUUID().toString(),
        subject = "Importante",
        body = "Mensaje urgente",
    ).also {
        println("Enviar correo $it ....")
    }

    println("\n=== EJERCICIO ===")
    println("Crea función 'validateEmail' que:")
    println("1. Use let para verificar que email no sea null")
    println("2. Use apply para limpiar espacios con la función trim")
    println("3. Use also para hacer print del correo limpiado.")
    println("4. Use run para validar y retornar resultado")

    println("\nValidaciones:")
    println("juan@test.com: ${validateEmail("juan@test.com")}")
    println("invalido: ${validateEmail("invalido")}")
    println("null: ${validateEmail(null)}")
}

fun validateEmail(email: String?): Boolean {
    return email?.let { emailStr ->
        emailStr.apply {
            trim()
        }.also {
            println("Validando: $it")
        }.run {
            contains("@") && contains(".")
        }
    } ?: false
}

/*
LET:
Let es una función de alcance (scope function) que se utiliza principalmente para:
Ejecutar operaciones sobre un objeto que puede ser nulo
Transformar un objeto en otro valor
Limitar el alcance de una variable
Explicación básica

// Sintaxis básica
objeto?.let {
    // 'it' es el objeto
    // hacer algo con 'it'
    // retornar un resultado (opcional)
}
Ejemplo práctico:
Supongamos que tienes que procesar datos de un usuario que vienen de un formulario web:

data class UserForm(
    val name: String?,
    val email: String?,
    val age: String?
)

data class User(
    val name: String,
    val email: String,
    val age: Int
)

fun processUserForm(form: UserForm): User? {
    return form.let {
        // Solo crea el usuario si todos los campos son válidos
        if (it.name.isNullOrEmpty() || it.email.isNullOrEmpty() || it.age.isNullOrEmpty()) {
            null
        } else {
            User(
                name = it.name,
                email = it.email,
                age = it.age.toInt()
            )
        }
    }
}

Uso real con validación encadenada:

fun validateAndSendEmail(userInput: String?) {
    userInput
        ?.let { input -> input.trim() }  // Elimina espacios
        ?.let { trimmed ->
            if (trimmed.contains("@")) trimmed else null
        }  // Valida formato
        ?.let { validEmail ->
            Email(
                id = UUID.randomUUID().toString(),
                subject = "Bienvenido",
                body = "Hola $validEmail"
            )
        }  // Crea el email
        ?.let { email -> sendEmail(email) }  // Envía el email
}
 */

/*
APPLY:
Apply es una función de alcance que se usa para configurar propiedades de un objeto y devuelve el mismo objeto. Es útil para inicializar objetos.
Características principales:
Usa this como referencia al objeto
Devuelve el objeto mismo
Útil para configurar múltiples propiedades
Ejemplo simple con una clase Persona:

data class Persona(
    val nombre: String,
    var edad: Int,
    var direccion: String,
    var telefono: String
)

// Usando apply para configurar un objeto
val persona = Persona(
    nombre = "Juan",
    edad = 0,
    direccion = "",
    telefono = ""
).apply {
    edad = 25
    direccion = "Calle Principal 123"
    telefono = "555-1234"
}

Ejemplo práctico con configuración de email:

data class EmailConfig(
    val destinatario: String,
    var asunto: String = "",
    var contenido: String = "",
    var esUrgente: Boolean = false,
    var adjuntos: MutableList<String> = mutableListOf()
)

// Usando apply para configurar un email
val email = EmailConfig("usuario@ejemplo.com").apply {
    asunto = "Reunión importante"
    contenido = "Por favor confirmar asistencia"
    esUrgente = true
    adjuntos.add("agenda.pdf")
}

La ventaja de apply es que permite configurar múltiples propiedades de forma más concisa y legible.

 */

/*
RUN:
Run es una función de alcance que combina características de with y let. Es útil para:
Ejecutar bloques de código sobre un objeto
Realizar cálculos y devolver un resultado
Limitar el alcance de variables
Características principales:
Usa this como referencia al objeto
Devuelve el último valor del bloque
Puede usarse con objetos nulos (?.run)
Ejemplo simple con un email:

data class Email(
    val id: String,
    var asunto: String,
    var contenido: String,
    var leido: Boolean = false
)

// Usando run para procesar un email
val email = Email(
    id = "123",
    asunto = "reunión",
    contenido = "texto del email"
).run {
    // Procesar el email y devolver un resumen
    leido = true
    asunto = asunto.uppercase()
    "Email: $asunto (Leído: $leido)"
}
 */

/*
WITH:With es una función de alcance que permite acceder a las propiedades y funciones de un objeto sin necesidad de repetir su nombre. Es útil cuando necesitas operar con un objeto múltiples veces.
Características principales:
Usa this como referencia al objeto
Devuelve el último valor del bloque
No es una función de extensión (se llama directamente)
Ejemplo simple con una configuración de email:

data class Email(
    val id: String,
    var asunto: String,
    var contenido: String,
    var leido: Boolean = false,
    var etiquetas: MutableList<String> = mutableListOf()
)

// Usando with para procesar un email
val email = Email("1", "Reunión", "Contenido", false)
val resumen = with(email) {
    leido = true
    asunto = asunto.uppercase()
    etiquetas.add("importante")

    // Devuelve un resumen
    "Asunto: $asunto, Leído: $leido, Etiquetas: $etiquetas"
}

Ejemplo práctico con formato de texto:

data class TextoFormato(
    var texto: String,
    var tamaño: Int,
    var negrita: Boolean,
    var color: String
)

val formatoFinal = TextoFormato("Hola", 12, false, "negro")
with(formatoFinal) {
    texto = texto.uppercase()
    tamaño = 16
    negrita = true
    color = "rojo"
}
La ventaja de with es que evita repetir el nombre del objeto cuando necesitas acceder a múltiples propiedades.

 */