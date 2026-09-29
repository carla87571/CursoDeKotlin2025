package clase8

fun main() {
    println("=======Sistema de gestión de emails=======")
    print("Ingresa tu email:")
    val email = readLine() ?: "Sin email"

    print("Ingresa el destinatario:")
    val destinatario = readLine() ?: "Sin destinatario"

    print("Ingresa el asunto:")
    val asunto  = readLine() ?: "Sin asunto"

    println("Para: $destinatario")
    println("Asunto: $asunto")

    print("Ingresa el mensaje:")
    val mensajeSinLimpiar = readLine()
    val mensajeLimpio = mensajeSinLimpiar?.trim() //trim elimina espacios en el String


    println("===============================")
    println("VISTA Previa DE EMAIL")
    println("================================")
    println("De: $email")
    println("Para: $destinatario")
    println("Asunto: $asunto")
    println("mensaje: $mensajeLimpio")
    println("===============================")

}


/*
JAVA UTILIZA EL OPERADOR TERNARIO PARA EVITAR NULL
condición ? valorSiVerdadero : valorSiFalso

public class EmailHandler {
    public static void main(String[] args) {
        String email = null;

        // Equivalente al operador Elvis (?:) utiliza el operador ternario
        String emailToUse = email != null ? email : "Sin email";

        // Equivalente a llamada segura (?.)
        int length = email != null ? email.length() : 0;

        // Con Optional (Java 8+)
        Optional<String> optionalEmail = Optional.ofNullable(email);
        String safeEmail = optionalEmail.orElse("Sin email");
        Integer safeLength = optionalEmail.map(String::length).orElse(0);
    }
}
 */

/*
JAVASCRIPT
const email = null;

// Equivalente a ?. (Optional Chaining)
const length = email?.length;

// Equivalente a ?: (Nullish Coalescing)
const emailToUse = email ?? "Sin email";

// Combinados
const upperEmail = email?.toUpperCase() ?? "SIN EMAIL";
 */

// Diferencias principales:
// Java: Usa verificaciones explícitas (OPERADOR TERNARIO o Optional)
// JavaScript: Tiene operadores similares a Kotlin (?. y ??)
// Kotlin: Tiene soporte nativo para nulabilidad (?. y ?:)