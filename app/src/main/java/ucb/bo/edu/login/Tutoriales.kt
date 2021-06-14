package ucb.bo.edu.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_tutoriales.*

/*AIzaSyDv86Pt0fY3sf1W-zX8Ecxc_qHIk2OC-pc*/

class Tutoriales : AppCompatActivity() {

    val API_KEY = "AIzaSyDqucLrvuD5gj4f8zXpOxJziLJERKpN2Ds"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutoriales)

        btnResistencia.setOnClickListener{
            val intent = YouTubeStandalonePlayer.createVideoIntent(this, API_KEY, "2rtzSBAXWwQ")
            startActivity(intent)

        }
        /*ucb.bo.edu.login
        9C:22:F7:3C:02:B1:1B:7C:37:B4:8B:18:06:CA:3D:62:78:7A:3C:75*/
        btnCap.setOnClickListener {
            val intent = YouTubeStandalonePlayer.createVideoIntent(this, API_KEY, "oS4WQRXfm-M")
            startActivity(intent)
        }

        btnTran.setOnClickListener {
            val intent = YouTubeStandalonePlayer.createVideoIntent(this, API_KEY, "GwrUC23M5xc")
            startActivity(intent)
        }
    }
}



