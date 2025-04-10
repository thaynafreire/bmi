package br.senai.sp.jandira.bmi.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BmiLevel(
    bulletColor: Color = Color.LightGray,
    lefttext: String = "",
    righttext: String = "",
    isFilled: Boolean = false
) {
    Row (
        modifier = Modifier
            .padding(top = 6.dp, bottom = 6.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        Card (
            modifier = Modifier
                .size(20.dp),

            shape = CircleShape,
            colors = CardDefaults
                .cardColors(containerColor = bulletColor)
        ){  }
        Spacer(
            modifier = Modifier
                .width(12.dp)
        )
        Card (
            modifier = Modifier
                .height(32.dp)
                .fillMaxWidth(),
            colors = CardDefaults
                .cardColors(
                   containerColor =  if (isFilled) bulletColor else Color.Transparent
                ),
            shape = RoundedCornerShape(8.dp)
        ){
            Row (
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = lefttext)
                Text(text = righttext)
            }

        }
    }
}

@Preview
@Composable
private fun BmiLevelPreview(){
    BmiLevel()
}