package clase9

fun mostrarBienvenida() {
    println("===========Sistema de email============")
    println("Bienvenido al sistema de gestión de emails")
}

fun saludarUsuario(nombre: String = "Usuario") {
    println("Hola, $nombre. ¡Tienes nuevos emails!")
}

fun leerEmails(): String {
    println("Ingresa tu email: ")
    val email = readLine()?.trim() ?: "Sin email"
    return email
}

fun leerAsunto(): String {
    println("Ingresa el asunto del email: ")
    val asunto = readLine()?.trim() ?: "Sin asunto"
    return asunto
}

fun leerMensaje(): String {
    println("Ingresa el mensaje del email: ")
    val mensaje = readLine()?.trim() ?: "Sin mensaje"
    return mensaje
}

fun createMessageEmail(destinatario: String, asunto: String, mensaje: String){
    println("===============================")
    println("EMAIL CREADO")
    println("===============================")
    println("Para: $destinatario")
    println("Asunto: $asunto")
    println("Mensaje: $mensaje")
    println("===============================")
}
fun enviarEmail() {
    println("El email ha sido enviado correctamente.")
}


fun main() {
    mostrarBienvenida()
    saludarUsuario("Carla")
    val email = leerEmails()
    val asunto = leerAsunto()
    val mensaje = leerMensaje()
    createMessageEmail(
        mensaje = mensaje,
        destinatario = email,
        asunto = asunto
    )
    enviarEmail()

    println("\n=== EJERCICIO ===")
    println("Crea una función llamada 'leerDatosCompletos' que:")
    println("1. No reciba parámetros")
    println("2. Use readLine() para pedir nombre y email")
    println("3. Devuelva un mensaje con los datos")
    println("Luego úsala en main()")

    fun leerDatosCompletos(): String {
        println("Ingresa tu nombre: ")
        val nombre = readLine()?.trim() ?: "Anónimo"
        println("Ingresa tu email: ")
        val email = readLine()?.trim() ?: "Sin email"
        return "Nombre: $nombre, Email: $email"
    }
    // Llamada a la función leerDatosCompletos y muestra el resultado
    println(leerDatosCompletos())

}

//JAVA
/*
// Java
import java.util.Scanner;

public class EmailSystem {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarBienvenida() {
        System.out.println("===========Sistema de email============");
        System.out.println("Bienvenido al sistema de gestión de emails");
    }

    public void saludarUsuario(String nombre) {
        System.out.println("Hola, " + nombre + ". ¡Tienes nuevos emails!");
    }

    public String leerEmails() {
        System.out.println("Ingresa tu email: ");
        String email = scanner.nextLine();
        return email != null ? email : "Sin email";
    }

    public String leerAsunto() {
        System.out.println("Ingresa el asunto del email: ");
        String asunto = scanner.nextLine();
        return asunto != null ? asunto : "Sin asunto";
    }

    public String leerMensaje() {
        System.out.println("Ingresa el mensaje del email: ");
        String mensaje = scanner.nextLine();
        return mensaje != null ? mensaje.trim() : "Sin mensaje";
    }

    public void createMessageEmail(String destinatario, String asunto, String mensaje) {
        System.out.println("===============================");
        System.out.println("EMAIL CREADO");
        System.out.println("===============================");
        System.out.println("Para: " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("===============================");
    }

    public void enviarEmail() {
        System.out.println("El email ha sido enviado correctamente.");
    }

    public static void main(String[] args) {
        EmailSystem sistema = new EmailSystem();
        sistema.mostrarBienvenida();
        sistema.saludarUsuario("Juan");
        String email = sistema.leerEmails();
        String asunto = sistema.leerAsunto();
        String mensaje = sistema.leerMensaje();
        sistema.createMessageEmail(email, asunto, mensaje);
        sistema.enviarEmail();
        sistema.scanner.close();
    }
}

// JAVASCRIPT
// JavaScript
const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

const mostrarBienvenida = () => {
    console.log("===========Sistema de email============");
    console.log("Bienvenido al sistema de gestión de emails");
};

const saludarUsuario = (nombre = "Usuario") => {
    console.log(`Hola, ${nombre}. ¡Tienes nuevos emails!`);
};

const leerInput = async (pregunta) => {
    return new Promise((resolve) => {
        readline.question(pregunta, (respuesta) => {
            resolve(respuesta || "Sin valor");
        });
    });
};

const createMessageEmail = (destinatario, asunto, mensaje) => {
    console.log("===============================");
    console.log("EMAIL CREADO");
    console.log("===============================");
    console.log(`Para: ${destinatario}`);
    console.log(`Asunto: ${asunto}`);
    console.log(`Mensaje: ${mensaje}`);
    console.log("===============================");
};

const enviarEmail = () => {
    console.log("El email ha sido enviado correctamente.");
};

async function main() {
    mostrarBienvenida();
    saludarUsuario("Juan");

    const email = await leerInput("Ingresa tu email: ");
    const asunto = await leerInput("Ingresa el asunto del email: ");
    const mensaje = (await leerInput("Ingresa el mensaje del email: ")).trim();

    createMessageEmail(email, asunto, mensaje);
    enviarEmail();
    readline.close();
}

main();

Principales diferencias:
Java: Usa Scanner para entrada, manejo orientado a objetos, sintaxis más verbosa
JavaScript: Usa async/await para manejar entrada, funciones flecha, template literals
Kotlin: Sintaxis más concisa, readLine() nativo, manejo de nulos con ?: y ?.

 */

