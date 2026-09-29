package clase11

fun main() {
    val email = "admin@empresa.com"

    when {
        email.contains("admin") -> {
            println("Administrador")
        }

        email.contains("support") -> {
            println("Soporte")
        }

        else -> {
            println("Usuario normal")
        }
    }

    val tipoDeUsuario = when {
        email.contains("admin") -> {
            "Administrador"
        }
        email.contains("support") -> "Soporte"
        else -> "Usuario normal"
    }

    println("Tipo de usuario de email: $tipoDeUsuario")

    val proveedor = readLine() ?: "otro"
    when(proveedor) {
        "gmail" -> println("Google Mail")
        "outlook" -> println("Microsoft Outlook")
        "yahoo" -> println("Yahoo Mail")
        else -> println("Otro proveedor ")
    }

    val elEmailEsValido = email.contains("@") &&
            email.contains(".com")
    val esGmail = email.contains("gmail")


    when {
        elEmailEsValido && esGmail -> {
            println("Es un correo válido del proveedor gmail")
        }
        elEmailEsValido -> {
            println("Es un correo valido")
        }
        else -> {
            println("El correo no es válido")
        }
    }

    println("\n=== EJERCICIO ===")
    println("Crea una función 'evaluarPassword' que use when para:")
    println("1. Si longitud >= 8: 'Fuerte'")
    println("2. Si longitud >= 6: 'Media'")
    println("3. Si no: 'Débil'")

     // Debería imprimir "Fuerte", "Media" o "Débil"

    fun evaluarPasword(password: String): String {
        return when {
            password.length >= 8 -> "Fuerte"
            password.length >= 6 -> "Media"
            else -> "Débil"
        }
    }

    val password = readLine()?: ""
    println(evaluarPasword(password))
    println(evaluarPasword("123456")) // Debería imprimir "Débil"

    // Ejemplo con múltiples condiciones
    val numero = 10
    when (numero) {
        in 1..5 -> println("El número está entre 1 y 5")
        in 6..10 -> println("El número está entre 6 y 10")
        else -> println("El número es mayor que 10")
    }

    // Ejemplo con un valor específico
    val dia = "Lunes"
    when (dia) {
        "Lunes" -> println("Inicio de semana")
        "Viernes" -> println("Fin de semana a la vista")
        else -> println("Día normal")
    }
}

/*
 diferencia principal entre switch-case en Java y when en Kotlin radica en su flexibilidad y sintaxis. Aquí están las diferencias clave:
Diferencias:
Expresividad:
En Kotlin, when puede evaluar expresiones complejas (como rangos, condiciones booleanas, etc.), mientras que switch-case en Java solo evalúa valores discretos (como números, caracteres o cadenas).
Retorno de valores:
when en Kotlin puede devolver un valor directamente, ya que es una expresión. En Java, switch-case no devuelve valores directamente, a menos que se asigne el resultado a una variable.
Sintaxis:
when tiene una sintaxis más concisa y no requiere palabras clave como break para evitar la ejecución de casos posteriores.
Compatibilidad:
switch-case en Java es más limitado en cuanto a los tipos de datos que puede manejar (por ejemplo, no admite rangos o condiciones booleanas).
Ejemplo en Java (similar al código Kotlin proporcionado)




public class Main {
    public static void main(String[] args) {
        String email = "admin@empresa.com";

        // Ejemplo 1: Clasificación de email
        switch (getEmailType(email)) {
            case "Administrador":
                System.out.println("Administrador");
                break;
            case "Soporte":
                System.out.println("Soporte");
                break;
            default:
                System.out.println("Usuario normal");
        }

        // Ejemplo 2: Proveedor de correo
        String proveedor = "gmail";
        switch (proveedor) {
            case "gmail":
                System.out.println("Google Mail");
                break;
            case "outlook":
                System.out.println("Microsoft Outlook");
                break;
            case "yahoo":
                System.out.println("Yahoo Mail");
                break;
            default:
                System.out.println("Otro proveedor");
        }

        // Ejemplo 3: Validación de email
        boolean elEmailEsValido = email.contains("@") && email.contains(".com");
        boolean esGmail = email.contains("gmail");

        if (elEmailEsValido && esGmail) {
            System.out.println("Es un correo válido del proveedor gmail");
        } else if (elEmailEsValido) {
            System.out.println("Es un correo válido");
        } else {
            System.out.println("El correo no es válido");
        }

        // Ejemplo 4: Evaluación de contraseña
        String password = "12345678";
        System.out.println(evaluarPassword(password));

        // Ejemplo 5: Número en rango
        int numero = 10;
        switch (numero) {
            case 1, 2, 3, 4, 5 -> System.out.println("El número está entre 1 y 5");
            case 6, 7, 8, 9, 10 -> System.out.println("El número está entre 6 y 10");
            default -> System.out.println("El número es mayor que 10");
        }

        // Ejemplo 6: Día específico
        String dia = "Lunes";
        switch (dia) {
            case "Lunes":
                System.out.println("Inicio de semana");
                break;
            case "Viernes":
                System.out.println("Fin de semana a la vista");
                break;
            default:
                System.out.println("Día normal");
        }
    }

    public static String getEmailType(String email) {
        if (email.contains("admin")) {
            return "Administrador";
        } else if (email.contains("support")) {
            return "Soporte";
        } else {
            return "Usuario normal";
        }
    }

    public static String evaluarPassword(String password) {
        if (password.length() >= 8) {
            return "Fuerte";
        } else if (password.length() >= 6) {
            return "Media";
        } else {
            return "Débil";
        }
    }
}
 */




