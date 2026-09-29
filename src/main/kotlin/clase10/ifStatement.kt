package clase10

fun leerEmail(): String{
    println("Ingresa tu email: ")
    val email =readLine()?.trim() ?: "Sin correo"
    return email
}

fun leerPassword(): String{
    println("Ingresa tu contraseña: ")
    val password =readLine()?.trim() ?: ""
    return password
}

fun main() {
    val email = leerEmail()
    if (email.contains("@")) {
        println("El email tiene formato valido")
    } else {
        println("El email no es valido")
    }

    val password = leerPassword()
    if (password.length >= 8) {
        println("La contraseña es fuerte")
    } else if (password.length >= 6) {
        println("La contraseña es media")
    }
    else {
        println("La contraseña es insegura")
    }

    val nivelDeSeguridad = if (password.length >= 8) {
        "alto"
    } else if (password.length >= 6) {
        "Media"
    } else {
        "bajo"
    }
    println("Nivel de seguridad de contraseña es: $nivelDeSeguridad")



    println("\n=== EJERCICIO ===")
    println("Crea una función llamada 'clasificarEmail' que:")
    println("1. Reciba un email como parámetro")
    println("2. Use if/else if para clasificar:")
    println("   - Si contiene 'admin': 'Administrador'")
    println("   - Si contiene 'support': 'Soporte'")
    println("   - Si no: 'Usuario normal'")
    println("3. Devuelva la clasificación")
    println("4. Imprimir la clasificación")

    println("-------------------------------------------------------------------------------------")

    println("Ingresa tu email: ")
    val userEmail = readLine()?.trim() ?: "Sin correo"
    println("Clasificación del email: ${clasificarEmail(userEmail)}")


    println("Clasificación del email: ${clasificarEmail(email)}")
    println(clasificarEmail("admin@empresa.com")) // Debería imprimir "Administrador"
    println(clasificarEmail("support@empresa.com")) // Debería imprimir "Soporte"
    println(clasificarEmail("juan@empresa.com")) // Debería imprimir "Usuario normal"

}
fun clasificarEmail(email: String): String {
    return if (email.contains("admin")) {
        "Administrador"
    } else if (email.contains("support")) {
        "Soporte"
    } else {
        "Usuario normal"
    }
}

/*


    println("Clasificación del email: ${clasificarEmail(email)}")
    println(clasificarEmail("admin@empresa.com")) // Debería imprimir "Administrador"
    println(clasificarEmail("support@empresa.com")) // Debería imprimir "Soporte"
    println(clasificarEmail("juan@empresa.com")) // Debería imprimir "Usuario normal"

}
fun clasificarEmail(email: String): String {
    return if (email.contains("admin")) {
        "Administrador"
    } else if (email.contains("support")) {
        "Soporte"
    } else {
        "Usuario normal"
    }
}

/*
JAVA
import java.util.Scanner;

public class EmailValidator {
    private Scanner scanner = new Scanner(System.in);

    public String leerEmail() {
        System.out.println("Ingresa tu email: ");
        String email = scanner.nextLine();
        return email != null ? email.trim() : "Sin correo";
    }

    public String leerPassword() {
        System.out.println("Ingresa tu contraseña: ");
        String password = scanner.nextLine();
        return password != null ? password.trim() : "";
    }

    public String clasificarEmail(String email) {
        if (email.contains("admin")) {
            return "Administrador";
        } else if (email.contains("support")) {
            return "Soporte";
        } else {
            return "Usuario normal";
        }
    }

    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();

        String email = validator.leerEmail();
        if (email.contains("@")) {
            System.out.println("El email tiene formato válido");
        } else {
            System.out.println("El email no es válido");
        }

        String password = validator.leerPassword();
        if (password.length() >= 8) {
            System.out.println("La contraseña es fuerte");
        } else if (password.length() >= 6) {
            System.out.println("La contraseña es media");
        } else {
            System.out.println("La contraseña es insegura");
        }

        String nivelDeSeguridad;
        if (password.length() >= 8) {
            nivelDeSeguridad = "alto";
        } else if (password.length() >= 6) {
            nivelDeSeguridad = "medio";
        } else {
            nivelDeSeguridad = "bajo";
        }
        System.out.println("Nivel de seguridad de contraseña es: " + nivelDeSeguridad);

        // Pruebas de clasificación de email
        System.out.println("Clasificación del email: " + validator.clasificarEmail(email));
        System.out.println(validator.clasificarEmail("admin@empresa.com"));
        System.out.println(validator.clasificarEmail("support@empresa.com"));
        System.out.println(validator.clasificarEmail("juan@empresa.com"));

        validator.scanner.close();
    }
}
 */