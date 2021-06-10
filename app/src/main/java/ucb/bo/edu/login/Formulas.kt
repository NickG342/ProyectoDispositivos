package ucb.bo.edu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulas.*
import kotlinx.android.synthetic.main.activity_main.*

class Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulas)

        btnOhm.setOnClickListener {
            val intent = Intent(this, Ley_ohm::class.java)
            startActivity((intent))
        }

        btnCapacitancia.setOnClickListener {
            val intent = Intent(this, Capacitancia::class.java)
            startActivity((intent))
        }

        btnTransisBJT.setOnClickListener {
            val intent = Intent(this, bjtOfet::class.java)
            startActivity((intent))
        }
    }
}