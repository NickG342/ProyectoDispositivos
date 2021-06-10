package ucb.bo.edu.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resistencia.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnComponentes.setOnClickListener {
            val intent = Intent(this, Componentes::class.java)
            startActivity((intent))
        }

        btnUSer.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity((intent))
        }

        btnFormulas.setOnClickListener {
            val intent = Intent(this, Formulas::class.java)
            startActivity((intent))
        }
    }



}

