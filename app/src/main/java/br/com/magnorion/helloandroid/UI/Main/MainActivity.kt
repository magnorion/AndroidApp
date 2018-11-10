package br.com.magnorion.helloandroid.UI.Main

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.magnorion.helloandroid.Model.Pedido
import br.com.magnorion.helloandroid.R
import br.com.magnorion.helloandroid.R.string.atum
import br.com.magnorion.helloandroid.UI.Checkout.CheckoutActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders
                .of(this)
                .get(MainViewModel::class.java)

        mainViewModel.nomeUsuario = intent.getStringExtra ( "nome")
        mainViewModel.telefoneUsuario = intent.getStringExtra( "telefone")

        tvNome.text = getString(R.string.saldacao)

        cbAtum.isChecked = mainViewModel.atumSelecionado
        cbBacon.isChecked = mainViewModel.baconSelecionado
        cbMussarela.isChecked = mainViewModel.mussarelaSelecionado
        cbCalabresa.isChecked = mainViewModel.calabresaSelecionado

        btCalcular.setOnClickListener{
            val intent = Intent(this, CheckoutActivity::class.java)
            intent.putExtra("pedido", geraPedido())
            startActivity(intent)
        }
    }

    private fun geraPedido(): Pedido {
        return Pedido(mainViewModel.nomeUsuario, mainViewModel.telefoneUsuario)
    }
}
