package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*

class ComoFuncionaTran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_funciona_tran)

        val picasso = Picasso.get()
        picasso.load("https://www.ingmecafenix.com/wp-content/uploads/2017/05/Partes-transistor.jpg").into(My_imagen)
    }
}
