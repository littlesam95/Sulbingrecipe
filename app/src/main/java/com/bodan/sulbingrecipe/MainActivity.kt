package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.bodan.sulbingrecipe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰 바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 빙수 레시피 액티비티로 이동
        binding.icewaterbutton.setOnClickListener {
            var intent = Intent(this@MainActivity, SulbingActivity::class.java)
            startActivity(intent)
        }
        // 디저트 레시피 액티비티로 이동
        binding.dessertbutton.setOnClickListener {
            var intent = Intent(this@MainActivity, DessertActivity::class.java)
            startActivity(intent)
        }
        // 음료 레시피 액티비티로 이동
        binding.beveragebutton.setOnClickListener {
            var intent = Intent(this@MainActivity, BeverageActivity::class.java)
            startActivity(intent)
        }
        // 사용기한표 액티비티로 이동
        binding.usedatebutton.setOnClickListener {
            var intent = Intent(this@MainActivity, UsedateActivity::class.java)
            startActivity(intent)
        }
    }
}