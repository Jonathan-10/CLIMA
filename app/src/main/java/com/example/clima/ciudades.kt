package com.example.clima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class ciudades : AppCompatActivity() {

    val TAG = "com.example.clima.ciudades.Ciudad"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bMexico = findViewById<Button>(R.id.bMexico)
        val bBerlin = findViewById<Button>(R.id.bBerlin)

        bMexico.setOnClickListener(View.OnClickListener {
           val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3530597")
            startActivity(intent)
        })

        bBerlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "2950159")
            startActivity(intent)
        })

    }
}
