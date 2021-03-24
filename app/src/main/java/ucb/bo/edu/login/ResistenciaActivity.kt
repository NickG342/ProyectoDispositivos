package ucb.bo.edu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resistencia.*

class ResistenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resistencia)

        btnQueEsResis.setOnClickListener {
            val intent = Intent(this, QueEsResisteciaActivity::class.java)
            startActivity((intent))
        }

        btnLeerResis.setOnClickListener {
            val intent = Intent(this, ComoLeerResistencia::class.java)
            startActivity((intent))
        }

        btnTiposResis.setOnClickListener {
            val intent = Intent(this, TiposResisActivity::class.java)
            startActivity((intent))
        }
    }
}