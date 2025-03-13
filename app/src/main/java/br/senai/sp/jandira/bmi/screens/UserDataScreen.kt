package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(modifier: Modifier = Modifier){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xffE6E6FA)
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start

        ) {
            Text(
                modifier = Modifier
                    .padding(top = 90.dp)
                    .padding(start = 35.dp),
                text = stringResource(
                    R.string.hi_userdatascreen
                ),
                color = Color(0xff343434),
                fontSize = 32.sp,
                fontWeight = FontWeight.SemiBold
            )
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(
                    topStart = 40.dp,
                    topEnd = 40.dp
                ),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xfffefefe)
                    )
            ){
                Column (
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ){
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .padding(top = 60.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Column (
                            modifier = Modifier
                                .fillMaxHeight(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Card (
                                modifier = Modifier
                                    .size(130.dp),
                                shape = CircleShape,
                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.male_avatar
                                    ),
                                    contentDescription = stringResource(
                                        R.string.avatar_male
                                    ),
                                    modifier = Modifier
                                        .fillMaxSize(),
                                )
                            }
                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(20.dp),
                                colors = ButtonDefaults.buttonColors(
                                    Color(0xff70be6b)
                                ),
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .width(130.dp)
                                    .align(Alignment.CenterHorizontally)
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.male_userdatasreen
                                    )
                                )
                            }
                }
                        Column (
                            modifier = Modifier
                                .fillMaxHeight(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Card (
                                modifier = Modifier
                                    .size(130.dp),
                                shape = CircleShape,
                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.woman_avatar
                                    ),
                                    contentDescription = stringResource(
                                        R.string.avatar_female
                                    ),
                                    modifier = Modifier
                                        .fillMaxSize(),
                                )
                            }
                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(20.dp),
                                colors = ButtonDefaults.buttonColors(
                                    Color(0xff70be6b)
                                ),
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .width(130.dp)
                                    .align(Alignment.CenterHorizontally)
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.female_userdatascreen
                                    )
                                )
                            }
                        }
                    }
                    Column (
                        modifier = Modifier
                            .padding(32.dp)
                            .fillMaxSize()
                    ){
                        OutlinedTextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 25.dp),
                            shape = RoundedCornerShape(
                                topStart = 15.dp,
                                topEnd = 15.dp,
                                bottomStart = 15.dp,
                                bottomEnd = 15.dp,
                            ),
                            value = "",
                            onValueChange = {},
                            label = { Text(text = "Age") },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = "",
                                    tint = Color(0xff343434)
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}




@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview(){
    UserDataScreen()
}
