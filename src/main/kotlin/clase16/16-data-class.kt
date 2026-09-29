package clase16

class EmailNormal(
    val asunto: String,
    val remitente: String,
    val leido: Boolean
)
data class EmailData(
    val asunto: String,
    val remitente: String,
    val leido: Boolean = false

)

fun main() {
    val emailNormal1 = EmailNormal(asunto = "Reunión", remitente = "jefe@empresa.com", leido = false)
    val emailCopia = emailNormal1
    val emailNormal2 = EmailNormal(asunto = "Reunión", remitente = "jefe@empresa.com", leido = false)

    val emailData1 = EmailData(asunto = "Reunión", remitente = "jefe@empresa.com", leido = false)
    val emailData2 = EmailData(asunto = "Reunión", remitente = "jefe@empresa.com", leido = false)

    println("Clase Normal : $emailNormal1")
    println("Data clase : $emailData2")

    println("Son iguales? ${emailNormal1 == emailNormal2}") // false, compara referencias
    println("Son iguales? ${emailData1 == emailData2}") // true, compara valores

    val email1Copia = emailData1.copy( asunto = "Reunión[Copia]")
    println("Esta es una copia del email: $email1Copia") // Copia del email con un nuevo asunto

    //destructuring declaration
    val (asunto, remitente, leido) = email1Copia
    println("Valores asunto: ${asunto}, remitente: $remitente, leido: $leido") // Imprime los valores de la copia

    println("hachcode data 1: ${emailData1.hashCode()}")
    println("hachcode data 2: ${emailData2.hashCode()}")

    println("\n=== EJERCICIO ===")
    println("Crea data class 'Contacto' con nombre y email")
    println("Crea dos instancias y verifica si son iguales ")
    println("Copia una de las instancias en otra variable y cambia uno de sus valores")


}

/*
Aquí tienes un ejemplo de una data class que representa un sistema de gestión de pedidos en un restaurante. Este ejemplo aborda un problema de la vida real: gestionar los pedidos de los clientes.
Explicación paso a paso:
Definición de la data class:
La clase Pedido almacena información sobre un pedido, como el nombre del cliente, los platos solicitados, el total a pagar y el estado del pedido.
Se utiliza una data class porque queremos comparar pedidos, generar copias y tener un toString() legible.
Uso de la clase:
Se crean instancias de Pedido para representar diferentes pedidos.
Se utiliza el método copy() para modificar un pedido existente.
Se compara si dos pedidos son iguales (por contenido, no por referencia).
Destructuring:
Se descomponen los valores de un pedido en variables individuales para un uso más sencillo.

//CODIGO
data class Pedido(
    val cliente: String,
    val platos: List<String>,
    val total: Double,
    var estado: String = "Pendiente" // Estado inicial por defecto
)

fun main() {
    // Crear pedidos
    val pedido1 = Pedido(
        cliente = "Juan Pérez",
        platos = listOf("Pizza", "Ensalada"),
        total = 25.50
    )
    val pedido2 = Pedido(
        cliente = "Ana López",
        platos = listOf("Hamburguesa", "Papas fritas"),
        total = 15.75
    )

    // Mostrar información de los pedidos
    println("Pedido 1: $pedido1")
    println("Pedido 2: $pedido2")

    // Comparar pedidos
    println("¿Son iguales? ${pedido1 == pedido2}") // false, porque tienen diferente contenido

    // Copiar y modificar un pedido
    val pedidoModificado = pedido1.copy(estado = "En preparación")
    println("Pedido modificado: $pedidoModificado")

    // Descomponer un pedido en variables
    val (cliente, platos, total, estado) = pedidoModificado
    println("Cliente: $cliente, Platos: $platos, Total: $total, Estado: $estado")
}

Resultado esperado:
Los pedidos se imprimen con un formato legible gracias al toString() automático.
La comparación entre pedidos verifica el contenido, no la referencia.
El método copy() permite modificar el estado del pedido sin alterar el original.
La descomposición facilita el acceso a los valores individuales del pedido.
Este ejemplo muestra cómo las data classes simplifican la gestión de datos en problemas reales como el manejo de pedidos en un restaurante.
 */


/*
En Java no existen las data classes como en Kotlin, pero hay varias formas de lograr una funcionalidad similar:
Java 14+ (Records): Los records son lo más parecido a las data classes de Kotlin

public record Pedido(String cliente, List<String> platos, double total, String estado) {
    // Constructor con validación
    public Pedido {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no puede ser null");
        }
    }
}

//Java tradicional (antes de Java 14): Se necesita escribir manualmente todos los métodos como equals(), hashCode(), toString() y un constructor.

public class Pedido {
    private final String cliente;
    private final List<String> platos;
    private final double total;
    private String estado;

    public Pedido(String cliente, List<String> platos, double total, String estado) {
        this.cliente = cliente;
        this.platos = platos;
        this.total = total;
        this.estado = estado;
    }

    // Getters
    public String getCliente() { return cliente; }
    public List<String> getPlatos() { return platos; }
    public double getTotal() { return total; }
    public String getEstado() { return estado; }

    // Setter solo para estado
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return DoubleObjects.equals(cliente, pedido.cliente) &&
               Objects.equals(platos, pedido.platos) &&
               Objects.equals(estado, pedido.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, platos, total, estado);
    }

    @Override
    public String toString() {
        return "Pedido{" +
               "cliente='" + cliente + '\'' +
               ", platos=" + platos +
               ", total=" + total +
               ", estado='" + estado + '\'' +
               '}';
    }
}

Las principales diferencias son:
Los records de Java son inmutables
En Java tradicional hay que escribir manualmente todos los métodos
Kotlin genera automáticamente equals(), hashCode(), toString() y copy()
Los records de Java son más concisos que las clases tradicionales pero menos flexibles que las data classes de Kotlin

 */