package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*

class Ley_ohm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ley_ohm)
        val picasso = Picasso.get()
        picasso.load("https://lafisicayquimica.com/wp-content/uploads/2020/05/ohmiosley.jpg").resize(700, 400).into(My_imagen)
    }
}