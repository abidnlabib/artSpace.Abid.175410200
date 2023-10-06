import abid175410200.artSpace.R
import abid175410200.artSpace.ui.theme.ArtSpaceTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // Panggil komponen Compose yang ingin Anda tampilkan
                artSpace()
            }
        }
    }
}

@Composable
fun artSpace() {
    var name by remember { mutableStateOf(TextFieldValue()) }
    var counter by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Selamat Datang di Aplikasi ART SPACE",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )


        Text(
            text = "ini adalah box dengan gambar anime",
            fontSize = 18.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id =R.drawable.ic_launcher_background ), // Ganti dengan nama gambar yang sesuai
                contentDescription = null, // Ganti dengan deskripsi gambar
                modifier = Modifier
                    .size(200.dp) // Atur ukuran gambar sesuai kebutuhan Anda
                    .clip(shape = CircleShape) // Jika Anda ingin memotong gambar ke bentuk tertentu
            )
        }

            Button(
                onClick = {
                    counter++
                },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Sebelumnya!")
            }
            Button(
                onClick = {
                    counter++
                },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Selanjutnya")
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        artSpace()
    }
}