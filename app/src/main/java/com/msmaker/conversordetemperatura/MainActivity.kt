package com.msmaker.conversordetemperatura

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun converte(view: View) {

        var temperatura = editTemperatura.text.toString().toDouble()

        if (radioCelsius.isChecked) {
            temperatura = (temperatura - 32) * 5 / 9

        } else if (radioFahrenheit.isChecked) {
            temperatura = (temperatura * 9 / 5) + 32
        }

        editTemperatura.setText(temperatura.toString())
    }


}
