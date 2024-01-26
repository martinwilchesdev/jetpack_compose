fun main() {
    val x = 18

    // El bloque condicional if permite ejecutar un bloque de codigo si una expresion evaluada retorna true.
    if (x >= 18) {
        println("Es un adulto")

    // Si la expresion evaluada retorna false, el codigo de la aplicacion sera ejecutado en el bloque else, si este se encuentra definido.
    } else {
        println("Es menor de edad")
    }

    // if anidados
    val genre = "Male"

    if (x >= 18) {
        if (genre === "Male") {
            println("Debe prestar el servicio militar")
        } else {
            println("No debe prestar el servicio militar")
        }
    } else {
        println("Es menor de edad")
    }
}