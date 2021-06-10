package ucb.bo.edu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_b_j_t.*
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*

class BjtFija : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjt_fija)
        val picasso = Picasso.get()
        picasso.load("https://3.bp.blogspot.com/-piryjfIPdGs/WJD-_MnruNI/AAAAAAAACrE/IJbDi5YHOAQiV_JsQgGAKxuqPrSsvuTYQCPcB/s1600/figura%2B1-min.png").resize(400, 500).into(My_imagen)
    }
}