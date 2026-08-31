package com.example.atividade_pratica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnConheca = findViewById<Button>(R.id.ButtonCursos)
        val btnDisciplinas = findViewById<Button>(R.id.ButtonDisciplinas)

        btnConheca.setOnClickListener {
            val intent = Intent(this, CursoActivity::class.java)
            startActivity(intent)
        }

        btnDisciplinas.setOnClickListener {
            val intent = Intent(this, DisciplinasActivity::class.java)
            startActivity(intent)
        }
    }
}