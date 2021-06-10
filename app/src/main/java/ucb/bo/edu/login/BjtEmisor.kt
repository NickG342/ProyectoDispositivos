package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*

class BjtEmisor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjt_emisor)
        val picasso = Picasso.get()
        picasso.load("https://1.bp.blogspot.com/-uEF2COSF5kc/WJFI6SrZt2I/AAAAAAAACtI/ej8qov8DSPY3g_tNUnhcUxXtxeTDAJa4gCPcB/s1600/figura%2B1-min.png").resize(400, 500).into(My_imagen)
    }
}