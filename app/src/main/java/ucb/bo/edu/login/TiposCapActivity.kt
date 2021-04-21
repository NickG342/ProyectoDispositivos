package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_que_es_cap.*
import kotlinx.android.synthetic.main.activity_tipos_cap.*

class TiposCapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipos_cap)
        val picasso= Picasso.get()
        picasso.load("https://electromundo.pro/wp-content/uploads/2020/02/Electrolitico-Capacitor.jpg").resize(500,300).into(TipoCap1)
        val picasso2= Picasso.get()
        picasso2.load("https://image.made-in-china.com/202f0j10PKNaVFpRhvoT/High-Quality-Mica-Capacitor-TMCM01-680PF-50V.jpg").resize(300,300).into(TipoCap2)
        val picasso3= Picasso.get()
        picasso3.load("https://lh3.googleusercontent.com/proxy/I7mUM6MZXxYnao7IIiIXPvkpthRBWNzZdGdq0DGbCUrOqyW_cAozckwp4ahKnzNwattGTRk1Jp8SwsEu5wEzVq5Xyrn5gpPB5LEdPVOesfM9w2eAFbnWK5rkRigd").resize(500,300).into(TipoCap3)
        val picasso4= Picasso.get()
        picasso4.load("https://image.made-in-china.com/202f0j10ZSoTuzHCgyrQ/Interference-Suppression-Safety-X2-Capacitor-Metallized-Polypropylene-Film-Capacitor.jpg").resize(400,300).into(TipoCap4)
        val picasso5= Picasso.get()
        picasso5.load("https://fonestar.com/imagen.php?img=../productos/1/16NA100/imagenes/16NA100.jpg&Ancho=800&Alto=400").resize(500,300).into(TipoCap5)
        val picasso6=Picasso.get()
        picasso6.load("https://www.minikits.com.au/image/cache/catalog/components/cer-a-640x640.jpg").resize(500,300).into(TipoCap6)
    }
}