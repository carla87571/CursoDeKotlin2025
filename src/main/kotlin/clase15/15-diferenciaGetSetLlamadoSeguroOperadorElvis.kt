package clase15

/*
Sí, las sentencias `var asunto: String? = null` y `var asunto: String = ""`
son **diferentes**. Aquí te explico las diferencias y cuándo usar cada una, junto con ejemplos simples:

---

### **1. Diferencias entre `String?` y `String`**
- **`String?`**: La variable puede contener un valor de tipo `String` o ser `null`. Es una variable **opcional**.
```kotlin
var asunto: String? = null // Puede ser null o contener un String
asunto = "Hola"            // Ahora contiene "Hola"
asunto = null              // Ahora vuelve a ser null
```

- **`String`**: La variable **no puede ser null**. Siempre debe tener un valor, aunque sea una cadena vacía (`""`).
```kotlin
var asunto: String = "" // Siempre tiene un valor, aunque esté vacío
asunto = "Hola"         // Ahora contiene "Hola"
// asunto = null        // Esto daría error de compilación
```

---

### **2. Uso de `set` y `get`**
- **`set`**: Se usa para **modificar** el valor de una propiedad.
Puedes personalizar cómo se asigna el valor.
- **`get`**: Se usa para **obtener** el valor de una propiedad.
 Puedes personalizar cómo se devuelve el valor.

Ejemplo con `set` y `get`:
```kotlin
class Email {
    var asunto: String = ""
        set(value) { // Personalizamos el setter
            field = if (value.trim().isEmpty()) "Sin asunto" else value.trim()
        }
        get() { // Personalizamos el getter
            return field.uppercase() // Devuelve el asunto en mayúsculas
        }
}

fun main() {
    val email = Email()
    email.asunto = "  " // Setter: asigna "Sin asunto" porque está vacío
    println(email.asunto) // Getter: imprime "SIN ASUNTO" (en mayúsculas)
}
```

---

### **3. Uso del llamado seguro (`?.`)**
El **llamado seguro** (`?.`) se usa con variables que pueden ser `null` (`String?`).
Permite evitar errores como el `NullPointerException`.

Ejemplo:
```kotlin
var asunto: String? = null
println(asunto?.uppercase()) // No lanza error, imprime: null

asunto = "Hola"
println(asunto?.uppercase()) // Imprime: HOLA
```

---

### **4. Uso del operador Elvis (`?:`)**
El **operador Elvis** (`?:`) se usa para proporcionar un valor por defecto si la variable es `null`.

Ejemplo:
```kotlin
var asunto: String? = null
val asuntoFinal = asunto?.uppercase() ?: "SIN ASUNTO" // Si es null, usa "SIN ASUNTO"
println(asuntoFinal) // Imprime: SIN ASUNTO

asunto = "Hola"
val asuntoFinal2 = asunto?.uppercase() ?: "SIN ASUNTO"
println(asuntoFinal2) // Imprime: HOLA
```

---

### **Resumen**
- Usa `String?` si la variable puede ser `null`. Usa `String` si siempre debe tener un valor.
- Usa `set` y `get` para personalizar cómo se asigna o se obtiene el valor de una propiedad.
- Usa `?.` para evitar errores al trabajar con variables opcionales (`String?`).
- Usa `?:` para proporcionar un valor por defecto si la variable es `null`.

Espero que estos ejemplos te ayuden a entender mejor.

 */