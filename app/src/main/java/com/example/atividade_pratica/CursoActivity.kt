package com.example.atividade_pratica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CursoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curso)

        val btnVoltar = findViewById<Button>(R.id.ButtonVoltar)
        val btnDisciplinas = findViewById<Button>(R.id.ButtonDisciplinas)

        btnVoltar.setOnClickListener {
            finish()
        }

        btnDisciplinas.setOnClickListener {
            val intent = Intent(this, DisciplinasActivity::class.java)
            startActivity(intent)
        }
    }
}