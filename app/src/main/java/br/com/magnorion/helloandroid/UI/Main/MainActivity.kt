package br.com.magnorion.helloandroid.UI.Main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.magnorion.helloandroid.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = intent.getStringExtra ( "nome")
        val telefone = intent.getStringExtra( "telefone")

        tvNome.text = getString(R.string.saldacao, nome, telefone)
    }
}
