fun main() {
    val num = listOf(1,2,3,4,5)
    val res1 = sumarListaImperativa(num)
    println(res1) // 15

    val res2 = sumarListaDeclarativa(num)
    println(res2) // 15

    val res3 = filtrarPares(num)
    println(res3) // [2,4]
}

fun sumarListaImperativa(lista: List<Int>): Int {
    /* Programacion imperativa
            Es un paradigma de programacion que se enfoca en especificar de forma explicita los pasos a seguir para lograr un resultado deseado.
            En este paradigma es comun el uso de ciclos y condiciones para lograr el resultado esperado.
    */
    var res = 0
    // Mediante el ciclo for se realiza la suma de cada uno de los elementos contenidos en la lista y valor acumalado se asigna a una variable res.
    for(i in lista) {
        res += i
    }

    return res
}

fun filtrarPares(lista: List<Int>): List<Int> {
    var res = mutableListOf<Int>()
    for(i in lista) {
        if (i % 2 == 0) {
            res.add(i)
        }
    }

    return res
}

fun sumarListaDeclarativa(lista: List<Int>): Int {
    /* Programacion declarativa
        Es un paradigma de programacion que se centra en describir el que se quiere lograr en lugar de como hacer el paso a paso para lograr el resultado esperado.
    */
    return lista.sum() // El metodo sum() se encarga de sumar los elementos contenidos en la lista. (Al invocar la funcion se evita realizar el paso a paso para sumar cada uno de los elementos contenidos)
}