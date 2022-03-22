package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bodan.sulbingrecipe.databinding.ActivityBeverageBinding
import kotlinx.android.synthetic.main.activity_beverage.*

class BeverageActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding : ActivityBeverageBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰 바인딩
        mBinding = ActivityBeverageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val beverageList = arrayListOf(
            BeverageRecycler(R.drawable.sangsanglemontea, 1),
            BeverageRecycler(R.drawable.tontonyuzatea, 2),
            BeverageRecycler(R.drawable.deepsanggangtea, 3),
            BeverageRecycler(R.drawable.deepdaechutea, 4),
            BeverageRecycler(R.drawable.peachicetea, 5),
            BeverageRecycler(R.drawable.honeygrapefruittea, 6),
            BeverageRecycler(R.drawable.raspberryomitea, 7),
            BeverageRecycler(R.drawable.teabagteaeight, 8),
            BeverageRecycler(R.drawable.sangsanglemonade, 9),
            BeverageRecycler(R.drawable.honeygrapefruitade, 10),
            BeverageRecycler(R.drawable.applemangoade, 11),
            BeverageRecycler(R.drawable.redmangoade, 12),
            BeverageRecycler(R.drawable.strawberryade, 13),
            BeverageRecycler(R.drawable.greengrapeade, 14),
            BeverageRecycler(R.drawable.plainyogurtsmoothie, 15),
            BeverageRecycler(R.drawable.blueberryyogurtsmoothie, 16),
            BeverageRecycler(R.drawable.strawberryyogurtsmoothie, 17),
            BeverageRecycler(R.drawable.berryberryyogurtsmoothie, 18),
            BeverageRecycler(R.drawable.redmangosmoothie, 19),
            BeverageRecycler(R.drawable.plainstrawberryjuice, 20),
            BeverageRecycler(R.drawable.sabalsikhye, 21),
            BeverageRecycler(R.drawable.juicefour, 22),
            BeverageRecycler(R.drawable.chekschocosnowlatte, 23),
            BeverageRecycler(R.drawable.hoticechoco, 24),
            BeverageRecycler(R.drawable.greentealatte, 25),
            BeverageRecycler(R.drawable.strawberrylatte, 26),
            BeverageRecycler(R.drawable.mixedgrainpowderlatte, 27),
            BeverageRecycler(R.drawable.americano, 28),
            BeverageRecycler(R.drawable.americanoventi, 29),
            BeverageRecycler(R.drawable.cafelatte, 30),
            BeverageRecycler(R.drawable.vanlialatte, 31),
            BeverageRecycler(R.drawable.cafemocha, 32),
            BeverageRecycler(R.drawable.cappuccino, 33),
            BeverageRecycler(R.drawable.caramelmacchiato, 34),
            BeverageRecycler(R.drawable.condensedmilklatte, 35),
            BeverageRecycler(R.drawable.coldbrewamericano, 36),
            BeverageRecycler(R.drawable.coldbrewlatte, 37),
        )

        rv_beverage.layoutManager = GridLayoutManager(applicationContext, 2)
        rv_beverage.setHasFixedSize(true)
        rv_beverage.adapter = BeverageAdapter(beverageList)
    }
}