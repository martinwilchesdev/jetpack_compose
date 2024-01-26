fun main() {
    val dia = 1
    val x = 5

    // La estructura when es similar a la estructura switch utilizada en otros lenguajes.
    when (dia) {
        // Las opciones de la estructura when deben ser del mismo tipo de dato que el valor evaluado 
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        else -> println("El numero no es valido")
    }

    when(x) {
        // Dentro de la estructura when es posible definir rangos como opciones para evaluar un valor especifico
        in 1..10 -> println("Esta en el rango")
        in 10..29 -> println("Esta fuera de rango")
        else -> println("El valor ingresado es invalido")
    }
}