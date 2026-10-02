package clase14

class Email (
    // constructor primario con parámetros y declaración de propiedades
    val asunto: String,
    val remitente: String,
    val mensaje: String
) {
    var leido: Boolean =false

    fun marcarComoLeido() {
        leido = true
    }
    fun getterLeido(): Boolean {
        return leido
    }
    fun setterLeido(leido: Boolean) {
        this.leido = leido
    }
    fun marcarComoNoLeido() {
        leido = false
    }
    fun mostrarLaInfo() {
        println("De: $remitente | Asunto: $asunto | Leído: $leido")
    }
}

class BandejaEmails() {
    val emails = mutableListOf<Email>()// Lista mutable para almacenar objetos Email

    fun agregarUnEmail(email: Email) { // Agrega un objeto Email a la lista de emails
        emails.add(email)
    }

    fun contarNoLeidos(): Int {
        var contador = 0
        for (email in emails) { // Recorre cada email en la lista
            if (!email.leido) { // Si el email no ha sido leído
                contador++      // Aumenta el contador
            }
        }
        return contador // Return the count after the loop
    }
}
fun main() {
    // creando instancias de la clase Email
    val email1 = Email(
        asunto = "Reunion viernes",
        remitente = "carlos@empresa.com",
        mensaje = "Hola, tenemos una reunion el viernes a las 10:00 AM."
    )
    val email2 = Email(
        asunto = "Reunion viernes",
        remitente = "carlos@empresa.com",
        mensaje = "Hola, tenemos una reunion el viernes a las 10:00 AM."
    )
    val email3 = Email(
        asunto = "Reunion viernes",
        remitente = "carlos@empresa.com",
        mensaje = "Hola, tenemos una reunion el viernes a las 10:00 AM."
    )
    email1.mostrarLaInfo()
    email1.marcarComoLeido()

    val bandejaEmails = BandejaEmails()

    bandejaEmails.agregarUnEmail(email1)
    bandejaEmails.agregarUnEmail(email2)
    bandejaEmails.agregarUnEmail(email3)
    println("Faltan por leer: ${bandejaEmails.contarNoLeidos()} emails")


    println("\n=== EJERCICIO ===")
    println("Crea una clase 'Contacto' con:")
    println("- Propiedades: nombre, email")
    println("- Método: mostrarContacto()")

    val contacto = Contacto("Juan", "juan@email.com")
    contacto.mostrarContacto()

}

class Contacto(val nombre: String, val email: String) {

    fun mostrarContacto() {
        println("Nombre: $nombre, Email: $email")
    }

    val esValido: Boolean
        get() = email.contains("@") && email.contains(".com")
}

/*
//JAVA
public class Email {
    private final String asunto;
    private final String remitente;
    private final String mensaje;
    private boolean leido = false;

    // Constructor
    public Email(String asunto, String remitente, String mensaje) {
        this.asunto = asunto;
        this.remitente = remitente;
        this.mensaje = mensaje;
    }

    public void marcarComoLeido() {
        leido = true;
    }

    public void marcarComoNoLeido() {
        leido = false;
    }

    public void mostrarLaInfo() {
        System.out.println("De: " + remitente + " | Asunto: " + asunto + " | Leído: " + leido);
    }

    public boolean isLeido() {
        return leido;
    }
}


public class BandejaEmails {
    private final List<Email> emails = new ArrayList<>();

    public void agregarUnEmail(Email email) {
        emails.add(email);
    }

    public int contarNoLeidos() {
        int contador = 0;
        for (Email email : emails) {
            if (!email.isLeido()) {
                contador++;
            }
        }
        return contador;
    }


    public class Main {
    public static void main(String[] args) {
        Email email1 = new Email(
            "Reunion viernes",
            "carlos@empresa.com",
            "Hola, tenemos una reunion el viernes a las 10:00 AM."
        );

        Email email2 = new Email(
            "Reunion viernes",
            "carlos@empresa.com",
            "Hola, tenemos una reunion el viernes a las 10:00 AM."
        );

        Email email3 = new Email(
            "Reunion viernes",
            "carlos@empresa.com",
            "Hola, tenemos una reunion el viernes a las 10:00 AM."
        );

        email1.marcarComoLeido();

        BandejaEmails bandejaEmails = new BandejaEmails();
        bandejaEmails.agregarUnEmail(email1);
        bandejaEmails.agregarUnEmail(email2);
        bandejaEmails.agregarUnEmail(email3);

        System.out.println("Faltan por leer: " + bandejaEmails.contarNoLeidos() + " emails");
    }
}
 */