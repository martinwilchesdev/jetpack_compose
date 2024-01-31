fun main() {
    // La funcion reduce permite transformar todos los valores de una estructura de datos en un unico valor
    val numeros = listOf(1,2,3,4,5)
    val multiplicacion = numeros.reduce { a, b -> a * b }
    // a -> valor acumulado, b -> valor actual
    println(multiplicacion) // 120
}