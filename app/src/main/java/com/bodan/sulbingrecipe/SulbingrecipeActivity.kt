package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.bodan.sulbingrecipe.databinding.ActivitySulbingrecipeBinding

class SulbingrecipeActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding : ActivitySulbingrecipeBinding? = null
    private val binding get() = mBinding!!
    private var whatsulbing : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰 바인딩
        mBinding = ActivitySulbingrecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // 버튼을 눌러서 가져온 값
        if (intent.hasExtra("idText")) {
            whatsulbing = intent.getStringExtra("idText")
        }

        // 팥인절미설빙
        if (whatsulbing == "patinjeolmi") {
            binding.sulbingimage.setImageResource(R.drawable.patinjeolmisulbing)
            binding.recipetable.setImageResource(R.drawable.patinjeolmirecipe)
            binding.recipedetail.setImageResource(R.drawable.patinjeolmirecipedetail)
        }
    }
}