fun main() {
    // El bloque try...catch permite capturar y posteriormente manejar los errores ocurridos durante la ejecucion del programa
    try {
        println("Escribe el primer valor")
        val num1 = readln().toInt()

        println("Escribe el segundo valor")
        val num2 = readln().toInt()

        val res = num1 + num2
    } catch(e: NumberFormatException) {
        // En este ejemplo el bloque catch es ejecutado cuando por consola no se ingresa un valor de tipo entero
        // Cuando el error es capturado, se imprime un mensaje por consola e inmediatamente se finaliza la ejecucion del programa
        println("Error: El número ingresado es inválido $e")
    }
}