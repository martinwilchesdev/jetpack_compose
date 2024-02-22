/*
    Los modificadores ayudan a personalizar la apariencia y el comportamiento de los componentes

    Existen 4 tipos de modificadores
        - De posicionamiento = width, height, etc.
        - De funcionalidad = click, scroll, etc.
        - De apariencia = background, padding, border, etc.
        - De escucha = onKeyEvent, etc.

    El orden en que son encadenados los modificares en un componente es importante
        .padding(50.dp)
        .background(Color.Black)

    ** Primero se aplica el padding y luego el color de fondo, por lo cual el espacio que ocupe el padding no tendra el color de fondo especificado
*/
@Composable
fun Content() {
    Text(
        text = "Hello Jetpack Compose",
        modifier = Modifier
            .background(Color.Black)
            .padding(50.dp) // La unidad de medidad para modificar el padding de un componente es dp
            .clickable {
                println("Hello Jetpack Compose")
            }
    )
}