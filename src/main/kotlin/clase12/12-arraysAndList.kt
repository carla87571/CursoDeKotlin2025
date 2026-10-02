package clase12

fun main() {
    // Array nos sirven para cuando tenemos una cantidad fija de elementos
    // Resumen:
    //Kotlin `arrayOf`: Tamaño fijo, elementos mutables.
    //Python:
    //Listas: Tamaño y elementos mutables.
    //Tuplas: Tamaño y elementos inmutables.
    val emails = arrayOf("juan@empresa.com", "carlos@empresa.com", "wilson@empresa.com")
    val cantidadDeCorreos = arrayOf(1,15,50,100)

    println("El primer correo es: ${emails[0]}")
    println("El segundo correo es: ${emails[1]}")
    println("El tercer correo es: ${emails[2]}")

    // Modifica y reescribe el primer correo
    emails[0]="nuevocorreojuan@empresa.com"
    println("La nueva Lista de correos es: ${emails.joinToString(", ")}")

    // set: Otra forma de modificar el correo con Indice 1
    emails.set(1, "nuevocorreojuan@empresa.com")
    println("El primer correo es: ${emails[0]}")
    println("La lista de correos es: ${emails.joinToString(", ")}")

    // size indica la cantidad de elementos en el array
    println("El tamano del array es: ${emails.size}") // output: 3



    // mutableListOf nos sirven para cuando tenemos una cantidad variable de elementos
    // Listas mutables son sirven cuando tenemos una cantidad variable de elementos, es decir,
    // es una lista dinamica que puede crecer o decrecer según sea necesario.
    /*
    El método .joinToString() en Kotlin se usa para convertir una colección
    (como arrays o listas) en un String, uniendo todos sus elementos.
     */
    val nuevaListaDeEmails = mutableListOf<String>()
    println("Nueva lista : ${nuevaListaDeEmails.joinToString ()} tamaño:${nuevaListaDeEmails.size}")

    // Agrega elementos a la lista mutable
    nuevaListaDeEmails.addAll(arrayOf("juan@empresa.com","carlos@empresa.com", "wilson@empresa.com"))
    println("Nueva lista : ${nuevaListaDeEmails.joinToString ()} tamaño:${nuevaListaDeEmails.size}")

    // Elimina un elemento de la lista mutable
    nuevaListaDeEmails.remove("juan@empresa.com")
    println("Nueva lista : ${nuevaListaDeEmails.joinToString ()} tamaño:${nuevaListaDeEmails.size}")

    // Agrega un elemento en una posición específica de la lista mutable
    nuevaListaDeEmails.add(0,"juan@empresa.com")
    println("Nueva lista : ${nuevaListaDeEmails.joinToString ()} tamaño:${nuevaListaDeEmails.size}")



    // Listas inmutables son útiles cuando no necesitamos modificar la lista después de su creación.
    // Son más eficientes en términos de memoria y rendimiento.
    // No se pueden agregar, eliminar o modificar elementos después de su creación.
    val listOfEmails = listOf<String>("juan@empresa.com", "carlos@empresa.com", "wilson@empresa.com")
    val nuevaLista = listOfEmails.subList(1,2)
    println("Nueva lista: ${nuevaLista.joinToString()} tamaño: ${nuevaLista.size}")

    val primerElemento = listOfEmails.first()
    val ultimoElemento = listOfEmails.last()
    val indexLastElement = listOfEmails.lastIndex
    println("Primer elemento: $primerElemento")
    println("Ultimo elemento: $ultimoElemento")
    println("Indice del ultimo elemento: $indexLastElement")


    println("\n=== EJERCICIO ===")
    println("Crea una lista mutable de asuntos de email y:")
    println("1. Agrega 3 asuntos diferentes")
    println("2. Modifica el segundo asunto")
    println("3. Elimina el primer asunto")
    println("4. Muestra la lista final y su tamaño")

    val asuntosEmail = mutableListOf<String>()
    asuntosEmail.addAll(arrayOf("Reunión de equipo", "Informe mensual", "Actualización del proyecto"))
    println("Asuntos de email: ${asuntosEmail.joinToString()} tamaño: ${asuntosEmail.size}")

    // Modifica el segundo asunto
    asuntosEmail[1] = "Informe trimestral"
    println("Asuntos de email después de modificar el segundo asunto: ${asuntosEmail.joinToString()} tamaño: ${asuntosEmail.size}")

    // Elimina el primer asunto por índice
    asuntosEmail.removeAt(0)
    println("Asuntos de email después de eliminar el primer asunto: ${asuntosEmail.joinToString()} tamaño: ${asuntosEmail.size}")

}

/*
// Kotlin
val arrayKotlin = arrayOf("email1", "email2", "email3")              // Array (fixed size)
val listInmutable = listOf("email1", "email2", "email3")            // Immutable List
val listMutable = mutableListOf("email1", "email2", "email3")       // Mutable List
 */

/*
// Java
// Arrays (fixed size)
String[] arrayJava = {"email1", "email2", "email3"};

// Immutable List (desde Java 9)
List<String> listaInmutable = List.of("email1", "email2", "email3");

// Mutable Lists
ArrayList<String> listaMutable = new ArrayList<>();
listaMutable.add("email1");
listaMutable.add("email2");

// También se puede inicializar así
List<String> otraListaMutable = new ArrayList<>(Arrays.asList("email1", "email2", "email3"));
 */

/*
// JavaScript
// Array (mutable by default)
const array = ["email1", "email2", "email3"];

// Para hacer un array "inmutable"
const arrayInmutable = Object.freeze(["email1", "email2", "email3"]);

// Métodos modernos de Array
const emails = ["email1", "email2", "email3"];
emails.push("email4");           // Agregar al final
emails.pop();                    // Remover del final
emails.unshift("email0");        // Agregar al inicio
emails.shift();                  // Remover del inicio
emails.splice(1, 1);            // Remover en posición específica
*
 */
/*
Principales diferencias:
Java: Más verboso, distinción clara entre arrays y listas
JavaScript: Arrays son siempre mutables por defecto, Object.freeze() para inmutabilidad
Kotlin: Sintaxis más concisa, distinción clara entre mutable e inmutable

 */