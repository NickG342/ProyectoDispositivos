package ucb.bo.edu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_capacitor.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resistencia.*

class CapacitorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capacitor)

        btnQueEsCap.setOnClickListener {
            val intent = Intent(this, QueEsCapActivity::class.java)
            startActivity((intent))
        }

        btnTiposCap.setOnClickListener {
            val intent = Intent(this, TiposCapActivity::class.java)
            startActivity((intent))
        }

        btnComoSeMideCap.setOnClickListener {
            val intent = Intent(this, ComoMedirCapActivity::class.java)
            startActivity((intent))
        }
    }
}