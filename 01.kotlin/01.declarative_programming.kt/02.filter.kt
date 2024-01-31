fun main() {
    // El metodo filter() permite filtrar valores contenidos en una estructura de datos
    val nombres = listOf("Martin", "Andrea", "Paola", "Eduardo")
    val nombresRes = nombres.filter { it.contains(
        "t", ignoreCase = true
    ) }
    println(nombresRes) // ["Martin"]

    val personas = listOf(
        Personas("Martin", 29),
        Personas("Eduardo", 31),
        Personas("Andrea", 31),
        Personas("Paola", 25),
        Personas("Nataly", 18)
    )

    // La programacion declarativa permite encadenar funciones
    val mayores = personas.filter { it.age > 30 }.map { it.name }.sorted()
    println(mayores) // [Personas(anme=Eduardo, age=31), Personas(name=Andrea, age=31)]
}

/*
    La palabra clave data antecede la definicion de la clase ya que esta no contiene atributos ni metodos, de esta forma esta clase podra ser trabajada como un modelo de datos.
*/
data class Personas(val name:String, val age:Int)