package ucb.bo.edu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b_j_t.*
import kotlinx.android.synthetic.main.activity_bjt_ofet.*
import kotlinx.android.synthetic.main.activity_formulas.*

class bjtOfet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjt_ofet)

        btn_BJT.setOnClickListener {
            val intent = Intent(this, BJT::class.java)
            startActivity((intent))
        }
        btn_FET.setOnClickListener {
            val intent = Intent(this, FET::class.java)
            startActivity((intent))
        }
    }
}