package ir.iact.koinSample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getUsernameButton.setOnClickListener {
            val userName = DataProvider.instance.getUserName()
            Toast.makeText(this, "Username is: $userName", Toast.LENGTH_LONG).show()
        }

    }
}
