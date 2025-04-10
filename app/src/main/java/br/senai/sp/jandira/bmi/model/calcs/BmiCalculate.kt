package br.senai.sp.jandira.bmi.model.calcs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import br.senai.sp.jandira.bmi.R
import br.senai.sp.jandira.bmi.model.Bmi
import br.senai.sp.jandira.bmi.model.BmiStatus
import kotlin.math.pow

@Composable
fun bmiCalculate(weight: Int, height: Double): Bmi {

    //pow potencia
    //val bmiresult = weight.div(height.pow(2))
    val bmiResult = weight / height.pow(2)

    when {
        bmiResult < 18.5 ->
            return Bmi(
                bmi = Pair(stringResource(R.string.under_weight), bmiResult),
                bmiColor = colorResource(R.color.light_blue),
                bmiStatus = BmiStatus.UNDER_WEIGHT
            )
        bmiResult >= 18.5 && bmiResult < 25.0 ->
        return Bmi(
            bmi = Pair(stringResource(R.string.normal), bmiResult),
            bmiColor = colorResource(R.color.light_green),
            bmiStatus = BmiStatus.NORMAL
        )
        bmiResult >= 25 && bmiResult < 30.0 ->
            return Bmi(
                bmi = Pair(stringResource(R.string.over_weight), bmiResult),
                bmiColor = colorResource(R.color.yellow),
                bmiStatus = BmiStatus.OVER_WEIGHT
            )
        bmiResult >= 30 && bmiResult < 35.0 ->
            return Bmi(
                bmi = Pair(stringResource(R.string.obesity_1), bmiResult),
                bmiColor = colorResource(R.color.light_orange),
                bmiStatus = BmiStatus.OBESITY_1
            )
        bmiResult >= 35.0 && bmiResult < 40.0 ->
            return Bmi(
                bmi = Pair(stringResource(R.string.obesity_2), bmiResult),
                bmiColor = colorResource(R.color.dark_orange),
                bmiStatus = BmiStatus.OBESITY_2
            )
        else ->
            return Bmi(
                bmi = Pair(stringResource(R.string.obesity_3), bmiResult),
                bmiColor = colorResource(R.color.red),
                bmiStatus = BmiStatus.OBESITY_3
            )
    }

}