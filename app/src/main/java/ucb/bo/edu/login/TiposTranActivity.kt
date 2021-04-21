package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_que_es_tran.*
import kotlinx.android.synthetic.main.activity_tipos_tran.*

class TiposTranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipos_tran)
        val picasso1 = Picasso.get()
        picasso1.load("https://lh3.googleusercontent.com/proxy/81dVpWA4yfoa1lC8m_Oal-QaMIRDDXCsnpCE__5iSGpSz3SFUa5abvgOs3JgFd9_xyK7-1WmxtdZZpzAozgGItjdLrInJu5Hc563uH0_ho8NxlQInF1A-dw9").resize(500, 400).into(TipoTran)
        val picasso2 = Picasso.get()
        picasso2.load("https://electronikuts.files.wordpress.com/2014/09/transistor-2.png").resize(400, 500).into(TipoTran2)
        val picasso3 = Picasso.get()
        picasso3.load("https://www.electronicoscaldas.com/3440-thickbox_default/transistor-jfet-j112.jpg").resize(400, 400).into(TipoTran3)
        val picasso4 = Picasso.get()
        picasso4.load("https://www.ecured.cu/images/7/74/Fototransistor2.jpg").resize(500, 200).into(TipoTran4)
    }
}