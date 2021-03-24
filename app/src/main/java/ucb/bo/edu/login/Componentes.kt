package ucb.bo.edu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_componentes.*
import kotlinx.android.synthetic.main.activity_main.*

class Componentes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_componentes)

        btnResis.setOnClickListener {
            val intent = Intent(this, ResistenciaActivity::class.java)
            startActivity((intent))
        }

        btnCapacitor.setOnClickListener {
            val intent = Intent(this, CapacitorActivity::class.java)
            startActivity((intent))
        }

        btnTransistor.setOnClickListener {
            val intent = Intent(this, TransistorActivity::class.java)
            startActivity((intent))
        }
    }
}