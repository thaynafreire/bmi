package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun BMIResultScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xffE6E6FA)
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                modifier = Modifier
                    .padding(top = 58.dp)
                    .padding(start = 25.dp),
                text = stringResource(
                    R.string.result_bmi
                ),
                color = Color(0xff343434),
                fontSize = 32.sp,
                fontWeight = FontWeight.SemiBold
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(735.dp),
                shape = RoundedCornerShape(
                    topStart = 35.dp,
                    topEnd = 35.dp
                ),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xfffefefe)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier
                            .size(110.dp),
                        shape = CircleShape,
                        border = BorderStroke(7.dp, Color(0xfffeaa08)),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xfffefefe)
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                modifier = Modifier,
                                text = stringResource(
                                    R.string.imc_number
                                ),
                                color = Color(0xff343434),
                                fontSize = 32.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                    Text(
                        modifier = Modifier
                            .padding(top = 18.dp),
                        text = stringResource(
                            R.string.class_imc
                        ),
                        color = Color(0xff343434),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Card(
                        modifier = Modifier
                            .padding(25.dp)
                            .height(70.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xffE6E6FA)
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    modifier = Modifier,
                                    text = stringResource(
                                        R.string.result_age
                                    ),
                                    color = Color(0xff343434),
                                    fontSize = 16.sp
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(top = 4.dp),
                                    text = stringResource(
                                        R.string.number_age
                                    ),
                                    color = Color(0xff343434),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                            Divider(
                                color = Color(0xffB0B0B0),
                                modifier = Modifier
                                    .height(55.dp)
                                    .width(0.8.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    modifier = Modifier,
                                    text = stringResource(
                                        R.string.result_Weight
                                    ),
                                    color = Color(0xff343434),
                                    fontSize = 16.sp
                                )
                                Text(
                                    modifier = Modifier,
                                    text = stringResource(
                                        R.string.number_weight
                                    ),
                                    color = Color(0xff343434),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                            Divider(
                                color = Color(0xffB0B0B0),
                                modifier = Modifier
                                    .height(55.dp)
                                    .width(0.8.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    modifier = Modifier,
                                    text = stringResource(
                                        R.string.result_high
                                    ),
                                    color = Color(0xff343434),
                                    fontSize = 16.sp,
                                )
                                Text(
                                    modifier = Modifier,
                                    text = stringResource(
                                        R.string.number_high
                                    ),
                                    color = Color(0xff343434),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(270.dp),
                    ) { }
                    HorizontalDivider(
                        color = Color(0xffE0E0E0),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(0.8.dp)
                    )
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(15.dp),
                        colors = ButtonDefaults.buttonColors(
                            Color(0xff6A4C9C)
                        ),
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .width(190.dp)
                            .height(45.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = stringResource(
                                R.string.button_result
                            )
                        )
                    }
                }

            }
        }
    }

}


@Preview(showSystemUi = true)
@Composable
private fun BMIResultScreenPreview() {
    BMIResultScreen()
}