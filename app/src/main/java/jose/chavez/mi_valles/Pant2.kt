package jose.chavez.mi_valles

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class Pant2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pant2)


        val btn: Button = findViewById(R.id.sig)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, Pant3::class.java)
            startActivity(intent)
        }
    }
}
