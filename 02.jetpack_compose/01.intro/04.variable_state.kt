// Importacion de todo lo relacionado a remember (set, get) para asi poder manipular las variables en tiempo de ejecucion
import androidx.compose.runtime.*

class MainActivity: ComponentActivity() {
    /* ... */
}

@Composable
fun Content() {
    /*
        Las variables cuyo valor es modificado en tiempo real se utiliza mediante remember
        Estas variables deben estar definidas dentro de un metodo Composable
    */

    // El valor de la variable es agregado al mutableStateOf() y con el remember se recuerda el valor anterior en el estado de la variable
    var likes = by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.center
        ) {
            Button(
                onClick = {
                    likes++
                }
            ) {
                Text(text = "Me gusta")
            }
        }
    }
}