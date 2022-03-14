package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.bodan.sulbingrecipe.databinding.ActivitySulbingBinding

class SulbingActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding : ActivitySulbingBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰 바인딩
        mBinding = ActivitySulbingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 인절미설빙 레시피
        binding.injeolmi.setOnClickListener {
            var idText = "injeolmi"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 팥인절미설빙 레시피
        binding.patinjeolmi.setOnClickListener {
            var idText = "patinjeolmi"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }
    }
}