package com.craiovadata.leitoeuro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    val curs = 4.75

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculeaza.setOnClickListener { view ->

            val insertedString = editText.text.toString()
            val insertedInt = Integer.parseInt(insertedString)
            val sumaEuro = insertedInt / curs

            val myFormat = DecimalFormat("0.0")
            val sumaEuroFormatata = myFormat.format(sumaEuro)

            // afisare
            textViewEuro.text = "$sumaEuroFormatata  euro"
        }
    }
}
