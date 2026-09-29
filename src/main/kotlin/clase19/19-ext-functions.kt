package clase19

import javax.security.auth.Subject

fun String.isValidEmail(): Boolean{
    return this.contains("@") && this.contains(".")
}

fun String.addSignatureToName(companyName:String): String{
    return "${this}\n\n---------\n${companyName.uppercase()}"
}
val String.emailDomain: String
    get() = this.substringAfter("@").substringBefore(".")

data class Email(
    val subject: String,
    val sender: String,
    val body: String,
    var isRead: Boolean
)

fun Email.markAsRead(){
    this.isRead = true
    println("Email ${this.subject} marcado como leido")
}

fun String.capitalize(): String {
    return this.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
}
fun String.wordCount(): Int {
    return this.split("\\s+".toRegex()).count { it.isNotEmpty() }
}
/*
otra forma de capitalizar y contar
fun String.capitalize(): String {
    return if (this.isNotEmpty()) {
        this.first().uppercase() + this.substring(1)
    } else this
}

fun String.wordCount(): Int {
    return this.split(" ").filter { it.isNotBlank() }.size
}
 */

fun main() {
    val emailAddress = "juan@empresa.com"
    emailAddress.isValidEmail()
    println("el email es: ${emailAddress}")
    println("es un email válido: ${emailAddress.isValidEmail()}")

    val nombreRemitente = "Juan Perez"
    println(nombreRemitente.addSignatureToName("Empresa 1"))
    println("Dominio del email: ${emailAddress.emailDomain}")

    val correoDataClass = Email("Reunión", "jefe@empresa.com", "Reunión de proveedores aplazada", false)
    println(correoDataClass)
    correoDataClass.markAsRead()
    println(correoDataClass)

    println("\n=== EJERCICIO ===")
    println("Crea extension functions para String:")
    println("1. capitalize() - primera letra mayúscula")
    println("2. wordCount() - contar palabras")

    val texto = "hola mundo, este es un texto de prueba"
    println("Texto original: $texto")
    println("Texto capitalizado: ${texto.capitalize()}")
    println("Cantidad de palabras: ${texto.wordCount()}")

}

/*
JAVA
// Utility class for String operations
public class StringExtensions {

    // Check if a string is a valid email
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    // Add a signature to a name
    public static String addSignatureToName(String name, String companyName) {
        return name + "\n\n---------\n" + companyName.toUpperCase();
    }

    // Get the email domain
    public static String getEmailDomain(String email) {
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".", atIndex);
        if (atIndex != -1 && dotIndex != -1) {
            return email.substring(atIndex + 1, dotIndex);
        }
        return "";
    }

    // Capitalize the first letter of a string
    public static String capitalize(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    // Count the number of words in a string
    public static int wordCount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.split("\\s+").length;
    }
}



public class Main {
    public static void main(String[] args) {
        String email = "juan@empresa.com";
        System.out.println("Is valid email: " + StringExtensions.isValidEmail(email));
        System.out.println("Email domain: " + StringExtensions.getEmailDomain(email));

        String name = "Juan Perez";
        System.out.println("Name with signature: \n" + StringExtensions.addSignatureToName(name, "Empresa 1"));

        String text = "hello world";
        System.out.println("Capitalized text: " + StringExtensions.capitalize(text));
        System.out.println("Word count: " + StringExtensions.wordCount(text));
    }
}
 */
