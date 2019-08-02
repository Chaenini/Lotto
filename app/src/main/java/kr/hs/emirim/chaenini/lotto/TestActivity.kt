package kr.hs.emirim.chaenini.lotto

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*
import java.net.URI
import java.net.URL

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        button.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java);
            startActivity(intent)
        }

        button3.setOnClickListener{
            val intent = Intent(this,NameActivity::class.java);
            startActivity(intent)
        }

        button4.setOnClickListener{
            val intent = Intent(this,ResultActivity::class.java);
            startActivity(intent)
        }

        button5.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"))
            startActivity(intent);
        }
    }

    fun goConstellation(view: View){
        val intent = Intent(this,ConstellationActivity::class.java);
        startActivity(intent)
    }
}
