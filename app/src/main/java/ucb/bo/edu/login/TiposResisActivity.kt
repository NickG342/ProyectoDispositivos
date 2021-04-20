package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_como_funciona_tran.*
import kotlinx.android.synthetic.main.activity_tipos_resis.*

class TiposResisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipos_resis)
        val picasso1 = Picasso.get()
        picasso1.load("https://electromundo.pro/wp-content/uploads/2020/02/Resistencia-de-pel%C3%ADcula-de-carbono-carbono.png").resize(500, 400).into(imagen)
        val picasso2 = Picasso.get()
        picasso2.load("https://es.wikipedia.org/wiki/Potenci%C3%B3metro#/media/Archivo:Potentiometer.jpg").resize(500, 400).into(imagen2)
        val picasso3 = Picasso.get()
        picasso3.load("https://images-na.ssl-images-amazon.com/images/I/4164J3zk1gL.jpg").resize(500, 400).into(imagen3)
        val picasso4 = Picasso.get()
        picasso4.load("https://4.bp.blogspot.com/-pXOOXbx8DTg/WPIHSlM467I/AAAAAAAAA6g/DvaB7qCV8JMEc1vsDvt54pGFo4KYFwF5QCLcB/s320/wirewound.gif").resize(500, 400).into(imagen4)
        val picasso5 = Picasso.get()
        picasso5.load("https://www.aulafacil.com/uploads/cursos/5267/15061_resistencia-carbon.jpg").resize(700, 200).into(imagen5)
        val picasso6 = Picasso.get()
        picasso6.load("https://1.bp.blogspot.com/-CN721R5WRVg/V0VhYLz1ofI/AAAAAAAAAm0/l_Qpa_84WBoB0-DRY8GuvJc3cZ6WmHd1QCLcB/s320/resistencia_pelicula_metalica_100ohm.jpg").resize(700, 200).into(imagen6)
        val picasso7 = Picasso.get()
        picasso7.load("https://cdn.ready-market.com/107/cdb12976//Templates/pic/Metal_Oxide_Film_Leaded_Resistor-MOF.jpg?v=ad357f6e").resize(700, 200).into(imagen7)
        val picasso8 = Picasso.get()
        picasso8.load("http://1.bp.blogspot.com/-JlH-REMAN3g/VR2o31lIbzI/AAAAAAAAAGE/mdzLoTkTrRo/s1600/008.jpg").resize(500, 400).into(imagen8)
    }
}