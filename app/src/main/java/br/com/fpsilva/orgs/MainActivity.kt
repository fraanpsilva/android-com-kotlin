package br.com.fpsilva.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // acessando a view
        var nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de Frutas"

        var descricao = findViewById<TextView>(R.id.descricao)
        nome.text = "Laranja, manga, maçã"

        var valor = findViewById<TextView>(R.id.valor)
        valor.text = "19.99"
    }
}