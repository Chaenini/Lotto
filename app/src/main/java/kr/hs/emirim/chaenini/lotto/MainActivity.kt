package kr.hs.emirim.chaenini.lotto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_name.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RandomCard.setOnClickListener{
            val intent = Intent(this,ResultActivity::class.java)

            intent.putIntegerArrayListExtra("result", ArrayList(LottoNumberMaker.getShuffleLottoNumbers()))
            startActivity(intent)
        }

        ConstellationCard.setOnClickListener{
            startActivity(Intent(this,ConstellationActivity::class.java))
        }

        NameCard.setOnClickListener{
            startActivity(Intent(this,NameActivity::class.java))
        }

    }
}