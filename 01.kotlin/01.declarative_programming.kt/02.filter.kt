fun main() {
    // El metodo filter() permite filtrar valores contenidos en una estructura de datos
    val nombres = listOf("Martin", "Andrea", "Paola", "Eduardo")
    val nombresRes = nombres.filter { it.contains( // Retorna un nuevo arreglo con los elementos del arreglo [nombres] que contengan el caracter t
        "t", ignoreCase = true
    ) }
    println(nombresRes) // ["Martin"]

    val personas = listOf(
        Personas("Eduardo", 31),
        Personas("Martin", 29),
        Personas("Andrea", 31),
        Personas("Nataly", 18),
        Personas("Paola", 25)
    )

    // La programacion declarativa permite encadenar funciones mediante la notacion de punto
    val mayores = personas.filter { it.age > 30 }.map { it.name }.sorted() // Retorna un nuevo arreglo con los elementos del arreglo [personas] cuya edad sea mayor a 30. Dicho nuevo arreglo es mapeado para retornar unicamente el nombre de la persona y por ultimo los elementos son ordenados alfabeticamente.
    println(mayores) // [Personas(name=Eduardo, age=31), Personas(name=Andrea, age=31)]
}

// La palabra clave data que antecede la definicion de la clase permite que esta pueda ser trabajada como un modelo de datos, ya que la clase misma no contiene atributos ni metodos.
data class Personas(val name:String, val age:Int)