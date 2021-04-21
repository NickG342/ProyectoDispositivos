package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_leer_resistencia.*
import kotlinx.android.synthetic.main.activity_que_es_cap.*

class QueEsCapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que_es_cap)
        val picasso= Picasso.get()
        picasso.load("https://www.ingmecafenix.com/wp-content/uploads/2017/04/Capacitor.jpg").resize(500,300).into(QueCap1)
    }
}