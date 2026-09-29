package clase17

enum class EmailFolders{
    INBOX,
    SENT,
    DRAFT,
    ARCHIVE,
    SPAM
}

enum class EmailPriority(val level: Int, val color:String){
    LOW(1,"gris"),
    NORMAL(2,"azul"),
    HIGH(3,"naranja"),
    URGENT(4,"rojo")
}

fun prioridadIntAEmailPriority(entero:Int): EmailPriority?{
    // Verifica si el entero está dentro del rango de índices válidos
    // de la enumeración EmailPriority
    // y devuelve el elemento correspondiente o null si no es válido
    return if (entero in 0 until EmailPriority.entries.size)
        // con el metodo entries se puedes acceder a los valores de la enumeración
        EmailPriority.entries.get(entero)
    else
        null
}


fun main(){

    println("========")
    println("Selecciona carpeta")
    println("1. Bandeja de entrada")
    println("2. Borradores")
    println("3. Archivados")
    println("4. Spam")
    val valorCarpeta  = readLine()?.trim()?.toInt()?:0

    var carpetaActual = EmailFolders.entries.get(valorCarpeta)

    when(carpetaActual){
        EmailFolders.INBOX -> {
            println("Bienvenido a Bandeja de entrada")
        }
        EmailFolders.SENT -> {
            println("Bienvenido a Enviados")
        }
        EmailFolders.DRAFT -> {
            println("Bienvenido a Borradores")
        }
        EmailFolders.ARCHIVE -> {
            println("Bienvenido a Archivados")
        }
        EmailFolders.SPAM -> {
            println("Bienvenido a Spam")
        }
    }
    val prioridadEmail=prioridadIntAEmailPriority(0)
    println("La prioridad de ${prioridadEmail?.name} es ${prioridadEmail?.level} con color ${prioridadEmail?.color}")

    println("\n=== EJERCICIO ===")
    println("Crea enum 'EstadoEmail' con: NUEVO, LEIDO, RESPONDIDO")
    println("1. Agrega propiedad 'icono' a cada estado")
    println("2. Crea función para convertir int a EstadoEmail")
    println("3. Muestra todos con índice e icono")

    EstadoEmail.entries.forEachIndexed { index, estado ->
        println("[$index] $estado ${estado.icono}")
    }
}
fun intToEstado(index: Int): EstadoEmail? {
    return if (index in 0 until EstadoEmail.entries.size) {
        EstadoEmail.entries[index]
    } else null
}
enum class EstadoEmail(val icono: String) {
    NUEVO("icono_mensaje"),
    LEIDO("icono_leido"),
    RESPONDIDO("↩icono_respondido")
}

/*
Características principales:
Cada constante es un objeto único de la clase enum
Se pueden acceder a todas las constantes con EnumClass.entries
Se puede obtener el nombre de la constante con .name
Se puede obtener la posición con .ordinal
Se pueden usar en expresiones when

Enum básico - Como EmailFolders:
enum class EmailFolders {
    INBOX,
    SENT,
    DRAFT,
    ARCHIVE,
    SPAM

Enum con propiedades - Como EmailPriority:
enum class EmailPriority(val level: Int, val color: String) {
    LOW(1, "gris"),      // Cada constante recibe
    NORMAL(2, "azul"),   // los parámetros definidos
    HIGH(3, "naranja"),  // en el constructor
    URGENT(4, "rojo")
}


// Obtener una constante por índice
var carpetaActual = EmailFolders.entries.get(valorCarpeta)

// Usar enum en when
when(carpetaActual) {
    EmailFolders.INBOX -> println("Bienvenido a Bandeja de entrada")
    // ...
}

// Acceder a propiedades
val prioridad = EmailPriority.LOW
println(prioridad.level)    // 1
println(prioridad.color)    // "gris"
println(prioridad.name)     // "LOW"
println(prioridad.ordinal)  // 0

Los enums son útiles cuando necesitas representar un conjunto fijo de valores relacionados, como estados, prioridades o categorías.


//JAVA
Enum básico:
public enum EmailFolders {
    INBOX,
    SENT,
    DRAFT,
    ARCHIVE,
    SPAM
}

Enum con propiedades:
public enum EmailPriority {
    LOW(1, "gris"),
    NORMAL(2, "azul"),
    HIGH(3, "naranja"),
    URGENT(4, "rojo");

    private final int level;
    private final String color;

    EmailPriority(int level, String color) {
        this.level = level;
        this.color = color;
    }

    public int getLevel() {
        return level;
    }

    public String getColor() {
        return color;
    }
}

Ejemplo de uso:
public class EmailSystem {
    public static EmailPriority prioridadIntAEmailPriority(int entero) {
        if (entero >= 0 && entero < EmailPriority.values().length) {
            return EmailPriority.values()[entero];
        }
        return null;
    }

    public static void main(String[] args) {
        // Obtener valores del enum
        EmailFolders carpeta = EmailFolders.INBOX;

        // Switch con enum
        switch (carpeta) {
            case INBOX:
                System.out.println("Bienvenido a Bandeja de entrada");
                break;
            case SENT:
                System.out.println("Bienvenido a Enviados");
                break;
            // ...
        }

        // Usar métodos del enum
        EmailPriority prioridad = EmailPriority.LOW;
        System.out.println("Nivel: " + prioridad.getLevel());
        System.out.println("Color: " + prioridad.getColor());
        System.out.println("Nombre: " + prioridad.name());
        System.out.println("Ordinal: " + prioridad.ordinal());

        // Iterar sobre valores
        for (EmailPriority p : EmailPriority.values()) {
            System.out.println(p.name());
        }
    }
}

Principales diferencias con Kotlin:
En Java se usa values() en lugar de entries
Los getters deben definirse explícitamente
La sintaxis es más verbosa
El switch en Java requiere break
No hay safe calls (?.)
 */

