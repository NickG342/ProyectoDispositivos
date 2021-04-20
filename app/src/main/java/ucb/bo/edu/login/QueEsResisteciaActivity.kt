package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*
import kotlinx.android.synthetic.main.activity_como_funciona_tran.My_imagen
import kotlinx.android.synthetic.main.activity_que_es_resistecia.*

class QueEsResisteciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que_es_resistecia)
        val picasso = Picasso.get()
        picasso.load("https://upload.wikimedia.org/wikipedia/commons/9/91/Upor_simbol1.png").resize(700, 200).into(My_imagen)
        val picasso1 = Picasso.get()
        picasso1.load("https://image.jimcdn.com/app/cms/image/transf/dimension=320x10000:format=jpg/path/sce1fe2a743ab0a00/image/i29d2966e57642507/version/1565018473/image.jpg").resize(600, 400).into(Mi_imagen)
    }
}