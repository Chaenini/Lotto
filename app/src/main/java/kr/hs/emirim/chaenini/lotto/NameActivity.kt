package kr.hs.emirim.chaenini.lotto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class NameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        goButton.setOnClickListener{
            if(TextUtils.isEmpty(editText.text.toString())){
                Toast.makeText(applicationContext,"이름을 입력해 주세요.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("name",editText.text.toString())
            intent.putIntegerArrayListExtra("result", ArrayList(LottoNumberMaker.getLottoNumbersFromHash(editText.text.toString())))

            startActivity(intent)
        }

        backButton.setOnClickListener{
            finish()
        }
    }
}
