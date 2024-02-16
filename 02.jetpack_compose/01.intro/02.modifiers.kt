class MainActivity : ComponentActivity() {
    /* ... */
}

// Los modificadores ayudan a personalizar la apariencia y el comportamiento de los componentes
@Preview(showBackground = true)
@Composable
fun Content() {
    Text(
        text = "Hello Jetpack Compose",
        modifier = Modifier
            .background(Color.Black)
            .padding(50.dp)
            .clickable {
                println("Hello Jetpack Compose")
            }
    )
}

/*
    Existen 4 tipos de modificadores

        - De posicionamiento = width, height
        - De funcionalidad = click, scroll
        - De apariencia = background, padding, border
        - De escucha = onKeyEvent

    El orden en que son encadenados los modificares en un componente es importante

        .padding(50.dp)
        .background(Color.Black)

    En el ejemplo anterior primero se aplica el padding y luego el color de fondo, por lo cual el espacio que ocupe el padding no tendra el color de fondo especificado
*/