package ucb.bo.edu.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resistencia.*

/*AIzaSyDv86Pt0fY3sf1W-zX8Ecxc_qHIk2OC-pc*/
/*AIzaSyDv86Pt0fY3sf1W-zX8Ecxc_qHIk2OC-pc*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider  = bundle?.getString("provider")

        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
        prefs.putString("email", email)
        prefs.putString("provider", provider)
        prefs.apply()

        btnComponentes.setOnClickListener {
            val intent = Intent(this, Componentes::class.java)
            startActivity((intent))
        }

        /*btnUSer.setOnClickListener {
                    val homeIntent = Intent(this, HomeActivity::class.java)
                    startActivity((homeIntent))
        }*/

        btnFormulas.setOnClickListener {
            val intent = Intent(this, Formulas::class.java)
            startActivity((intent))
        }

        btnVideos.setOnClickListener {
            val intent = Intent(this, Tutoriales::class.java)
            startActivity((intent))
        }
    }

    /*private fun showHome(email: String, provider: String){
        val homeIntent = Intent(this, HomeActivity::class.java).apply {
            putExtra("email",email)
            putExtra("provider",provider)
        }
        startActivity(homeIntent)
    }*/


}

