package com.example.nectar_online_groceries.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nectar_online_groceries.R
import com.example.nectar_online_groceries.ui.theme.NectarOnlineGroceriesTheme

@Composable
fun HomeScreen() {
    val image = painterResource(id = R.drawable.logo_icon)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = image,
            contentDescription = "Logo do Nectar Online Groceries",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 60.dp)
                .width(48.dp)
                .height(56.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Default.AddLocation,
                contentDescription = "Ícone de localização",
                tint = colorResource(id = R.color.localization_color),
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                modifier = Modifier,
                text = "Duque de Caxias, RJ",
                fontSize = 18.dp.value.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.localization_color)
            )
        }

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .size(width = 370.dp, height = 115.dp),
            painter = painterResource(id = R.drawable.banner),
            contentDescription = "Imagem do Banner",
            alignment = Alignment.Center,
        )

        Text(
            modifier = Modifier
                .padding(top = 30.dp, start = 24.dp),
            text = "Ofertas Exclusivas",
            fontSize = 24.dp.value.sp,
            fontWeight = FontWeight.SemiBold,
            color = colorResource(id = R.color.grey),
        )

        Row(modifier = Modifier.padding(24.dp)) {
            Card(
                modifier = Modifier
                    .width(173.dp)
                    .height(260.dp)
                    .border(
                        width = 0.5.dp,
                        color = colorResource(id = R.color.light_grey),
                        shape = CardDefaults.shape
                    ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 15.dp, top = 33.dp)
                ) {
                    Image(
                        modifier = Modifier.size(width = 104.dp, height = 63.dp),
                        painter = painterResource(id = R.drawable.banana_icon),
                        contentDescription = "Imagem do Produto: Bananas",
                        alignment = Alignment.Center,
                    )
                    Text(
                        modifier = Modifier.padding(top = 33.dp),
                        text = "Bananas",
                        fontSize = 16.dp.value.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.grey)
                    )
                    Text(
                        modifier = Modifier.padding(top = 5.dp),
                        text = "7pcs, Priceg",
                        fontSize = 14.dp.value.sp,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.light_grey)
                    )
                    Text(
                        modifier = Modifier.padding(top = 33.dp),
                        text = "R$4,99",
                        fontSize = 18.dp.value.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.grey)
                    )
                }
            }

            Spacer(modifier = Modifier.width(15.dp))

            Card(
                modifier = Modifier
                    .width(173.dp)
                    .height(260.dp)
                    .border(
                        width = 0.5.dp,
                        color = colorResource(id = R.color.light_grey),
                        shape = CardDefaults.shape
                    ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 15.dp, top = 33.dp)
                ) {
                    Image(
                        modifier = Modifier.size(width = 104.dp, height = 63.dp),
                        painter = painterResource(id = R.drawable.apple_icon),
                        contentDescription = "Imagem do Produto: Maçã",
                        alignment = Alignment.Center,
                    )
                    Text(
                        modifier = Modifier.padding(top = 33.dp),
                        text = "Maçã",
                        fontSize = 16.dp.value.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.grey)
                    )
                    Text(
                        modifier = Modifier.padding(top = 5.dp),
                        text = "1kg, Priceg",
                        fontSize = 14.dp.value.sp,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.light_grey)
                    )
                    Text(
                        modifier = Modifier.padding(top = 33.dp),
                        text = "R$4,99",
                        fontSize = 18.dp.value.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.grey)
                    )
                }
            }
        }
        Text(
            modifier = Modifier
                .padding(top = 30.dp, start = 24.dp),
            text = "Mais Vendidos",
            fontSize = 24.dp.value.sp,
            fontWeight = FontWeight.SemiBold,
            color = colorResource(id = R.color.grey),
        )

        Row(modifier = Modifier.padding(24.dp)) {
            Card(
                modifier = Modifier
                    .width(173.dp)
                    .height(260.dp)
                    .border(
                        width = 0.5.dp,
                        color = colorResource(id = R.color.light_grey),
                        shape = CardDefaults.shape
                    ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 15.dp, top = 33.dp)
                ) {
                    Image(
                        modifier = Modifier.size(width = 104.dp, height = 63.dp),
                        painter = painterResource(id = R.drawable.bell_pepper_red_icon),
                        contentDescription = "Imagem do Produto: Pimentão Vermelho",
                        alignment = Alignment.Center,
                    )
                    Text(
                        modifier = Modifier.padding(top = 33.dp),
                        text = "Pimentão Vermelho",
                        fontSize = 16.dp.value.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.grey)
                    )
                    Text(
                        modifier = Modifier.padding(top = 5.dp),
                        text = "1kg, Priceg",
                        fontSize = 14.dp.value.sp,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.light_grey)
                    )
                    Text(
                        modifier = Modifier.padding(top = 33.dp),
                        text = "R$4,99",
                        fontSize = 18.dp.value.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.grey)
                    )
                }
            }

            Spacer(modifier = Modifier.width(15.dp))

            Card(
                modifier = Modifier
                    .width(173.dp)
                    .height(260.dp)
                    .border(
                        width = 0.5.dp,
                        color = colorResource(id = R.color.light_grey),
                        shape = CardDefaults.shape
                    ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 15.dp, top = 33.dp)
                ) {
                    Image(
                        modifier = Modifier.size(width = 104.dp, height = 63.dp),
                        painter = painterResource(id = R.drawable.ginger_icon),
                        contentDescription = "Imagem do Produto: Gengibre",
                        alignment = Alignment.Center,
                    )
                    Text(
                        modifier = Modifier.padding(top = 33.dp),
                        text = "Gengibre",
                        fontSize = 16.dp.value.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.grey)
                    )
                    Text(
                        modifier = Modifier.padding(top = 5.dp),
                        text = "250gm, Priceg",
                        fontSize = 14.dp.value.sp,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.light_grey)
                    )
                    Text(
                        modifier = Modifier.padding(top = 33.dp),
                        text = "R$4,99",
                        fontSize = 18.dp.value.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.grey)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    NectarOnlineGroceriesTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            HomeScreen()
        }
    }
}