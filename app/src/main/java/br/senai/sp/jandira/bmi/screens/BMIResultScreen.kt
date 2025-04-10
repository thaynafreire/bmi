package br.senai.sp.jandira.bmi.screens

import android.content.Context
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R
import br.senai.sp.jandira.bmi.model.BmiStatus
import br.senai.sp.jandira.bmi.model.calcs.bmiCalculate
import br.senai.sp.jandira.bmi.screens.components.BmiLevel
import br.senai.sp.jandira.bmi.utils.convertNumberToLocale
import java.util.Locale

@Composable
fun BMIResultScreen(navegacao: NavHostController?) {

    val context = LocalContext.current //criar contexto pra saber onde estamos
    val userFile = context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE) //pegar arquivo de referencia

    val userAge = userFile.getInt("user_age", 0)

    val userWeight = userFile.getInt("user_weight", 0)

    val userHeight = userFile.getFloat("user_height", 0.0f)

    //pegando o arquivo p fazer o calculo
    val bmi = bmiCalculate(userWeight,
        userHeight.toDouble().div(100))


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
                        border = BorderStroke(7.dp, color = bmi.bmiColor),
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
                                text = String.format(
                                    Locale.getDefault(),
                                    "%.1f",
                                    bmi.bmi.second
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
                        text = bmi.bmi.first,
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
                                    text = userAge.toString(),
                                    modifier = Modifier
                                        .padding(top = 4.dp),
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
                                    text = "$userWeight kg",
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
                                        R.string.result_height
                                    ),
                                    color = Color(0xff343434),
                                    fontSize = 16.sp,
                                )
                                Text(
                                    modifier = Modifier,
                                    text = String.format(Locale.getDefault(), "%.2f", userHeight),
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
                            .height(292.dp),
                    ) {
                        BmiLevel(
                            bulletColor = colorResource(R.color.light_blue),
                            lefttext = stringResource(R.string.underweight),
                            righttext = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.UNDER_WEIGHT) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.light_green),
                            lefttext = stringResource(R.string.normalcolumn),
                            righttext = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.NORMAL) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.yellow),
                            lefttext = stringResource(R.string.overweight),
                            righttext = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.OVER_WEIGHT) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.light_orange),
                            lefttext = stringResource(R.string.obesity1),
                            righttext = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.OBESITY_1) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.dark_orange),
                            lefttext = stringResource(R.string.obesity2),
                            righttext = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.OBESITY_2) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.red),
                            lefttext = stringResource(R.string.obesity3),
                            righttext = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.OBESITY_3) true else false
                        )
                    }
                    HorizontalDivider(
                        color = Color(0xffE0E0E0),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(0.8.dp)
                    )
                    Button(
                        onClick = {
                            navegacao!!.navigate("dados")
                        },
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
    BMIResultScreen(null)
}