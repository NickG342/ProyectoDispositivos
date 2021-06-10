package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*

class FetFija : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fet_fija)

        val picasso = Picasso.get()
        picasso.load("https://cdn.goconqr.com/uploads/node/image/23143413/8761834c-cdba-497e-adf6-4ffc73621ea4.JPG").resize(650, 500).into(My_imagen)
    }
}