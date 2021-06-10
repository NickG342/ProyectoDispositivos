package ucb.bo.edu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b_j_t.*

class BJT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_j_t)
        btn_pol_fija.setOnClickListener {
            val intent = Intent(this, BjtFija::class.java)
            startActivity((intent))
        }
        btn_pol_em.setOnClickListener {
            val intent = Intent(this, BjtEmisor::class.java)
            startActivity((intent))
        }
        btn_pol_div.setOnClickListener {
            val intent = Intent(this, BjtDiv::class.java)
            startActivity((intent))
        }
    }
}