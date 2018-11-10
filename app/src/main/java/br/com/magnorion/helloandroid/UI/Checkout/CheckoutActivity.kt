package br.com.magnorion.helloandroid.UI.Checkout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.magnorion.helloandroid.Model.Pedido
import br.com.magnorion.helloandroid.R

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val pedido = intent.getParcelableExtra<Pedido>("pedido")
        Toast.makeText(this, pedido.nome, Toast.LENGTH_LONG).show()
    }
}
