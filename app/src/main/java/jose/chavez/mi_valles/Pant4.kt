package jose.chavez.mi_valles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pant4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pant4)

        val btn: Button = findViewById(R.id.sig)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, Pant2::class.java)
            startActivity(intent)
        }
    }
}