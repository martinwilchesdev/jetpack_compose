class MainActivity: ComponentActivity() {
    /* ... */
}

// Las aplicaciones Android con Jetpack Compose son maquetados utilizando filas y columna

@Composable
fun Content() {
    // Es importante elegir un contenedor inicial para luego dentro de este agregar las filas y columnas

    /*
        Al definir una columna como contenedor es recomendable utilizar de forma inicial los modificadores

            .fillMaxSize()
            .wrapContentSize(Alignment.center)

        Con los anteriores modificadores, la maquetacion de la aplicacion se iniciara desde el centro de la interfaz de la aplicacion
        Las columnas ubican a sus hijos en una secuencia vertical
    */
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.center)
    ) {
        Text(text = "Hola Mundo")
        Space()
        Text(text = "JetPack Compose")
        Space()

        /*
            Al definir una fila es recomendable de forma inicial utilizar el siguiente modificador

                .fillMaxWidth

            A su vez el par parametro-valor .horizontalArrangement = Arrangement.spaceEvenly posiciona a los elementos hijos de manera que ocupen todo el ancho disponible de la fila

            Con los anteriores modificadores, la fila ocupara todo el ancho disponible
        */

        // Las filas posicionan a sus hijos a traves de una secuencia horizontal
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spaceEvenly
        ) {
            Button(
                onClick = {
                    println("Hello World")
                }
            ) {
                Text(text = "Button Message")
            }
        }
    }
}

@Composable
fun Space() {
    // El Spacer es un componente que representa un espacio vacio en el layout, cuyo tamaño puede ser alterado a traves de modificadores
    Spacer(
        modifier = Modifier
            .height(5.dp)
    )
}