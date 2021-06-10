package ucb.bo.edu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b_j_t.*

class FET : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f_e_t)
        btn_pol_fija.setOnClickListener {
            val intent = Intent(this, FetFija::class.java)
            startActivity((intent))
        }
        btn_pol_div.setOnClickListener {
            val intent = Intent(this, FetDiv::class.java)
            startActivity((intent))
        }
    }
}