package jose.chavez.mi_valles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pant3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pant3)

        val btn: Button = findViewById(R.id.sig)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, Pant4::class.java)
            startActivity(intent)
        }
    }
}