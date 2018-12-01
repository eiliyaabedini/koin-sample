package ir.iact.koinSample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.android.ext.android.startKoin

class MainActivity : AppCompatActivity() {

    private val dataProvider: DataProvider by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin(applicationContext, listOf(appModule))

        getUsernameButton.setOnClickListener {
            val userName = dataProvider.getUserName()
            Toast.makeText(this, "Username is: $userName", Toast.LENGTH_LONG).show()
        }


    }
}
