package ucb.bo.edu.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_que_es_resistecia.*
import kotlinx.android.synthetic.main.activity_que_es_tran.*

class QueEsTran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que_es_tran)
        val picasso1 = Picasso.get()
        picasso1.load("https://4.bp.blogspot.com/-4YQNs3MVDZ4/VrDDw362bFI/AAAAAAAABWA/S3khr6oRx1o/w1200-h630-p-k-no-nu/Transistor.png").resize(600, 200).into(QueTran)
    }
}