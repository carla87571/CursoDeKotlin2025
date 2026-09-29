package clase6

fun main() {
    val emailRecibidos = 15
    val emailEnviados = 10
    val limiteEmails = 20

    val tieneEmails = emailRecibidos > 16
    val excedeEnviados = emailEnviados >= limiteEmails

    println("tiene emails: $tieneEmails") // false
    println("Alcanzamos el limite de emails enviados ?: $excedeEnviados") // false

    val sonIguales = emailRecibidos == emailEnviados
    println("Son iguales ? : $sonIguales") // false

    val sonDiferentes = emailRecibidos != emailEnviados
    println("Son diferentes ? : $sonDiferentes") // true
    println("---------------------------------------------------------------------")


    val email = "user@example.com"
    val password = "1234"

    val tieneArroba = email.contains("@") // true
    val tienePunto = email.contains(".") // true
    val esEmailValido = tieneArroba && tienePunto // true
    println("Es un email válido ? : $esEmailValido") // true

    val passwordCorto = password.length < 6 // true
    val passwordLargo = password.length > 20 // false
    val passwordProblematico = passwordCorto || passwordLargo // true este es el operador or
    println("Es un password problemático ? : $passwordProblematico") // true

    val emailInvalido = !esEmailValido // output: false
    println("Es un email inválido ? : $emailInvalido") // false

    println("\n=== EJERCICIO ===")
    println("Valida email: debe tener @ y ., no debe contener 'test'")
    println("Valida que no sea spam: asunto no debe tener 'GRATIS' o 'URGENTE'")

    val validarEmail = email.contains("@") && email.contains(".") && !email.contains("test")
    println("Email válido: $validarEmail") // true

    val asuntoEmail = "reunión importante"

    val noEsSpam = !asuntoEmail.contains("GRATIS") && !asuntoEmail.contains("URGENTE")
    println("No es spam: $noEsSpam") // true
    val emailAceptable = validarEmail && noEsSpam
    println("Email aceptable: $emailAceptable") // true


}
// Kotlin permite usar operadores lógicos para combinar condiciones y validar estados.
fun validarEmail(email: String, asunto: String): Boolean {
    val emailValido = email.contains("@") &&
            email.contains(".") &&
            !email.contains("test")

    val noEsSpam = !asunto.uppercase().contains("GRATIS") &&
            !asunto.uppercase().contains("URGENTE")

    return emailValido && noEsSpam

/*
    fun main() {
        val email = "usuario@dominio.com"
        val asunto = "Reunión de equipo"

        val esEmailValido = validarEmail(email, asunto)
        println("¿El email es válido?: $esEmailValido") // true

        // Otros ejemplos:
        val emailInvalido = "test@dominio.com"
        val asuntoSpam = "OFERTA GRATIS"

        val esEmailInvalido = validarEmail(emailInvalido, asuntoSpam)
        println("¿El email es válido?: $esEmailInvalido") // false
    }
    */

}

// JAVA
/*
public class EmailValidator {
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();

        String email = "usuario@dominio.com";
        String asunto = "Reunión de equipo";

        boolean esEmailValido = validator.validarEmail(email, asunto);
        System.out.println("¿El email es válido?: " + esEmailValido); // true

        // Otros ejemplos:
        String emailInvalido = "test@dominio.com";
        String asuntoSpam = "OFERTA GRATIS";

        boolean esEmailInvalido = validator.validarEmail(emailInvalido, asuntoSpam);
        System.out.println("¿El email es válido?: " + esEmailInvalido); // false
    }

    public boolean validarEmail(String email, String asunto) {
        boolean emailValido = email.contains("@") &&
                             email.contains(".") &&
                             !email.contains("test");

        boolean noEsSpam = !asunto.toUpperCase().contains("GRATIS") &&
                           !asunto.toUpperCase().contains("URGENTE");

        return emailValido && noEsSpam;
    }
}

 */

// JAVASCRIPT
/*
function validarEmail(email, asunto) {
    const emailValido = email.includes("@") &&
                       email.includes(".") &&
                       !email.includes("test");

    const noEsSpam = !asunto.toUpperCase().includes("GRATIS") &&
                     !asunto.toUpperCase().includes("URGENTE");

    return emailValido && noEsSpam;
}

// Uso de la función
const email = "usuario@dominio.com";
const asunto = "Reunión de equipo";

const esEmailValido = validarEmail(email, asunto);
console.log("¿El email es válido?:", esEmailValido); // true

// Otros ejemplos:
const emailInvalido = "test@dominio.com";
const asuntoSpam = "OFERTA GRATIS";

const esEmailInvalido = validarEmail(emailInvalido, asuntoSpam);
console.log("¿El email es válido?:", esEmailInvalido); // false
 */