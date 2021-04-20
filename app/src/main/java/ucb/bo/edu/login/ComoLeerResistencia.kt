package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_leer_resistencia.*

class ComoLeerResistencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_leer_resistencia)
        val picasso=Picasso.get()
        picasso.load("https://www.inventable.eu/media/122_Resistencias_colores/resistor_color_band_tit.png").resize(500,200).into(LeerResis1)
        val picasso1=Picasso.get()
        picasso1.load("https://www.inventable.eu/media/122_Resistencias_colores/resistor_color_4band.png").resize(700,800).into(LeerResis2)
    }
}