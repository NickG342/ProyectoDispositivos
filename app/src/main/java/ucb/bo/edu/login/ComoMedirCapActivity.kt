package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_medir_cap.*
import kotlinx.android.synthetic.main.activity_que_es_cap.*

class ComoMedirCapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_medir_cap)
        val picasso= Picasso.get()
        picasso.load("https://dam-assets.fluke.com/s3fs-public/6004129-dmm-capacitance-1500x1000.jpg").resize(500,300).into(MedirCap1)
    }
}