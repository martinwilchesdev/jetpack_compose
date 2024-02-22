// Importacion de todo lo relacionado a remember (set, get) para asi poder manipular las variables en tiempo de ejecucion
import androidx.compose.runtime.*

@Composable
fun Content() {
    /*
        Para modificar el valor de una variable y que el sistema recuerde su estado anterior, esta debe ser definida haciendo uso de remember.
    |   Estas variables deben estar definidas dentro de un metodo Composable al que pertenecen.
    */
    var likes = by remember {
        mutableStateOf(0) // El valor inicial y los valores posteriores de la variable son agregado al mutableStateOf() como parametro
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
                    likes++ // El evento click del boton modifica el estado de la variable likes
                }
            ) {
                Text(text = "Me gusta")
            }
            Text(text = "$likes Me gusta")
        }
    }
}