package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*

class BjtDiv : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjt_div)
        val picasso = Picasso.get()
        picasso.load("https://4.bp.blogspot.com/-7EimXb-sf60/WJH9jJTSyhI/AAAAAAAACu8/IzaTkrw1jKslchO9Tlxalnc_5ycg8Tg0gCPcB/s1600/figura%2B1-min.png").resize(400, 500).into(My_imagen)
    }
}