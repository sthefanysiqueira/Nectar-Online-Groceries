package com.example.nectar_online_groceries.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Password
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nectar_online_groceries.R
import com.example.nectar_online_groceries.User
import com.example.nectar_online_groceries.ui.theme.NectarOnlineGroceriesTheme

@Composable
fun SignInScreen(
    onEnterClick: (User) -> Unit
) {
    Column {
        var username by remember {
            mutableStateOf("")
        }

        var password by remember {
            mutableStateOf("")
        }

        val image = painterResource(id = R.drawable.logo_icon)

        Image(
            painter = image,
            contentDescription = "Logo do Nectar Online Groceries",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 60.dp)
                .width(48.dp)
                .height(56.dp)
        )

        Text(
            text = "Entrar",
            color = colorResource(id = R.color.grey),
            fontWeight = FontWeight.SemiBold,
            fontSize = 26.dp.value.sp,
            modifier = Modifier
                .padding(start = 25.dp, top = 100.dp)
                .width(82.dp)
                .height(29.dp)
        )

        Text(
            text = "Insira seus dados de e-mail e senha",
            color = colorResource(id = R.color.light_grey),
            fontSize = 16.dp.value.sp,
            modifier = Modifier
                .padding(start = 25.dp, top = 15.dp)
                .height(20.dp)
        )

        TextField(
            value = username,
            onValueChange = { newValue ->
                username = newValue
            },
            Modifier
                .padding(start = 25.dp, top = 40.dp, end = 25.dp)
                .fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // Fundo quando focado
                unfocusedContainerColor = Color.Transparent, // Fundo quando não focado
                focusedIndicatorColor = colorResource(id = R.color.green_button_color), // Borda quando focado
                unfocusedIndicatorColor = colorResource(id = R.color.text_field_border_color) // Borda quando não focado
            ),
            label = {
                Text("Usuário/E-mail")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Ícone de pessoa que representa usuário"
                )
            }
        )

        TextField(
            value = password, onValueChange = { it: String ->
                password = it
            },
            Modifier
                .padding(start = 25.dp, top = 30.dp, end = 25.dp)
                .fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // Fundo quando focado
                unfocusedContainerColor = Color.Transparent, // Fundo quando não focado
                focusedIndicatorColor = colorResource(id = R.color.green_button_color), // Borda quando focado
                unfocusedIndicatorColor = colorResource(id = R.color.text_field_border_color) // Borda quando não focado
            ),
            label = {
                Text("Senha")
            },
            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Password,
                    contentDescription = "Ícone de senha"
                )
            }
        )

        Button(
            modifier = Modifier
                .align(alignment = Alignment.End)
                .padding(top = 20.dp, end = 25.dp),
            onClick = { /* Ação de esqueci minha senha */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = colorResource(id = R.color.grey),
            ),
        ) {
            Text(
                text = "Esqueci minha senha",
                color = colorResource(id = R.color.grey),
                fontFamily = FontFamily.SansSerif,
                fontSize = 14.dp.value.sp,
                textAlign = TextAlign.Center,
            )
        }

        Button(
            onClick = {
                onEnterClick(
                    User(
                        username = username,
                        password = password
                    )
                )
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.green_button_color),
                contentColor = colorResource(id = R.color.white_button_text_color),
            ),
            shape = RoundedCornerShape(19.dp),
            modifier = Modifier
                .padding(start = 25.dp, top = 30.dp, end = 25.dp)
                .width(365.dp)
                .height(68.dp)
        ) {
            Text(
                "Entrar",
                fontSize = 16.dp.value.sp,
            )
        }
    }
}

@Preview
@Composable
fun SignInScreenPreview() {
    NectarOnlineGroceriesTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            SignInScreen(onEnterClick = {})
        }
    }
}