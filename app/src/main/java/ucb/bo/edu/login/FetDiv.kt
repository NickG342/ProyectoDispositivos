package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*

class FetDiv : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fet_div)
        val picasso = Picasso.get()
        picasso.load("https://i.stack.imgur.com/QTtPn.png").resize(400, 600).into(My_imagen)
    }
}