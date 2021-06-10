package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*

class Capacitancia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capacitancia)
        val picasso = Picasso.get()
        picasso.load("https://image.slidesharecdn.com/capacitancia-1230662869439013-1/95/capacitancia-2-728.jpg?cb=1230634164").resize(600, 500).into(My_imagen)
    }
}