package ucb.bo.edu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_capacitor.*
import kotlinx.android.synthetic.main.activity_transistor.*

class TransistorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transistor)

        btnQueEsTran.setOnClickListener {
            val intent = Intent(this, QueEsTran::class.java)
            startActivity((intent))
        }

        btnTiposTran.setOnClickListener {
            val intent = Intent(this, TiposTranActivity::class.java)
            startActivity((intent))
        }

        btnComoFuncionaTran.setOnClickListener {
            val intent = Intent(this, ComoFuncionaTran::class.java)
            startActivity((intent))
        }
    }
}