fun main() {
    // Los arreglos son vectores que permiten guardar multiples valores
    // Los valores de un arreglo son organizados de forma indexada desde el 0 hasta n
    // Los valores contenidos por un arreglo pueden ser de distintos tipos de datos
    var arr = arrayOf("Martin", "Andrea", 2, 2.5, true)

    // Imprimir el contenido de un arreglo en un String
    println(arr.contentToString()) // ["Martin", "Andrea", 2, 2.5, true]

    // Acceder un valor especifico de un arreglo a traves de su indice
    println(arr[0]) // Martin
    // Reasignar un valor del arreglo mediante un indice especifico
    arr[0] = "Martin Wilches"
    println(arr[0]) // Martin Wilches

    // Retornar el numero de elementos contenidos en un arreglo
    println(arr.size) // 5

    // Agregar elementos al final del arreglo
    arr += "Paola"
    println(arr.contentToString()) // ["Martin", "Andrea", 2, 2.5, true, "Paola"]
    println(arr.size) // 6

    // Ordenar los elementos contenidos en un arreglo
    var nums1 = intArrayOf(5, 1, 9, 2)
    nums1.sort()
    println(nums1.contentToString()) // [1, 2, 5, 9]

    // Buscar elementos repetidos en un arreglo y asignarlos a una nueva variable
    var nums2 = intArrayOf(1, 2, 3, 2, 8, 8)
    var duplicate = nums2.groupBy { it }.filter { it.value.size > 1 }.keys
    println(duplicate) // [2, 8]

    /**
     * Arreglos de un tipo de dato especifico
    */
    var a = booleanArrayOf(true, false)
    var b = intArrayOf(1,2,3,4,5)
    println(a.contentToString()) // [true, false]
    println(b.contentToString()) // [1,2,3,4,5]
}