package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
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

        // 인절미설빙
        if (whatsulbing == "1") {
            binding.sulbingimage.setImageResource(R.drawable.injeolmi)
            binding.recipetable.setImageResource(R.drawable.injeolmirecipe)
            binding.recipedetail.setImageResource(R.drawable.injeolmirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 팥인절미설빙
        if (whatsulbing == "2") {
            binding.sulbingimage.setImageResource(R.drawable.patinjeolmi)
            binding.recipetable.setImageResource(R.drawable.patinjelomirecipe)
            binding.recipedetail.setImageResource(R.drawable.patinjelomirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 흑임자찰떡설빙
        if (whatsulbing == "3") {
            binding.sulbingimage.setImageResource(R.drawable.heukimjachaltteok)
            binding.recipetable.setImageResource(R.drawable.heukimjachaltteokrecipe)
            binding.recipedetail.setImageResource(R.drawable.heukimjachaltteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1800, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 640, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 치즈설빙
        if (whatsulbing == "4") {
            binding.sulbingimage.setImageResource(R.drawable.cheese)
            binding.recipetable.setImageResource(R.drawable.cheeserecipe)
            binding.recipedetail.setImageResource(R.drawable.cheeserecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2400, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 630, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 리얼그린티설빙
        if (whatsulbing == "5") {
            binding.sulbingimage.setImageResource(R.drawable.realgreentea)
            binding.recipetable.setImageResource(R.drawable.realgreentearecipe)
            binding.recipedetail.setImageResource(R.drawable.realgreentearecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 800, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 그린티초코설빙
        if (whatsulbing == "6") {
            binding.sulbingimage.setImageResource(R.drawable.greenteachoco)
            binding.recipetable.setImageResource(R.drawable.greenteachocorecipe)
            binding.recipedetail.setImageResource(R.drawable.greenteachocorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 4600, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 오레오초코몬스터설빙
        if (whatsulbing == "7") {
            binding.sulbingimage.setImageResource(R.drawable.oreochocomonster)
            binding.recipetable.setImageResource(R.drawable.oreochocomonsterrecipe)
            binding.recipedetail.setImageResource(R.drawable.oreochocomonsterrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 990, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 초코브라우니설빙
        if (whatsulbing == "8") {
            binding.sulbingimage.setImageResource(R.drawable.chocobrownie)
            binding.recipetable.setImageResource(R.drawable.chocobrownierecipe)
            binding.recipedetail.setImageResource(R.drawable.chocobrownierecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2700, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 990, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 민트초코설빙
        if (whatsulbing == "9") {
            binding.sulbingimage.setImageResource(R.drawable.mintchoco)
            binding.recipetable.setImageResource(R.drawable.mintchocorecipe)
            binding.recipedetail.setImageResource(R.drawable.mintchocorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 티라미수설빙
        if (whatsulbing == "10") {
            binding.sulbingimage.setImageResource(R.drawable.tiramisu)
            binding.recipetable.setImageResource(R.drawable.tiramisurecipe)
            binding.recipedetail.setImageResource(R.drawable.tiramisurecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 810, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 딸기마카롱설빙
        if (whatsulbing == "11") {
            binding.sulbingimage.setImageResource(R.drawable.strawberrymacaron)
            binding.recipetable.setImageResource(R.drawable.strawberrymacaronrecipe)
            binding.recipedetail.setImageResource(R.drawable.strawberrymacaronrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 750, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 애플망고치즈설빙
        if (whatsulbing == "12") {
            binding.sulbingimage.setImageResource(R.drawable.applemangocheese)
            binding.recipetable.setImageResource(R.drawable.applemangocheeserecipe)
            binding.recipedetail.setImageResource(R.drawable.applemangocheeserecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2700, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 650, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 킹망고설빙
        if (whatsulbing == "13") {
            binding.sulbingimage.setImageResource(R.drawable.kingmango)
            binding.recipetable.setImageResource(R.drawable.kingmangorecipe)
            binding.recipedetail.setImageResource(R.drawable.kingmangorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3400, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 720, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 블루베리치즈설빙
        if (whatsulbing == "14") {
            binding.sulbingimage.setImageResource(R.drawable.blueberrycheese)
            binding.recipetable.setImageResource(R.drawable.blueberrycheeserecipe)
            binding.recipedetail.setImageResource(R.drawable.blueberrycheeserecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 700, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 칙촉몬스터설빙
        if (whatsulbing == "15") {
            binding.sulbingimage.setImageResource(R.drawable.chikchokmonster)
            binding.recipetable.setImageResource(R.drawable.chikchokmonsterrecipe)
            binding.recipedetail.setImageResource(R.drawable.chikchokmonsterrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1000, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 인절미&망고 반반설빙
        if (whatsulbing == "16") {
            binding.sulbingimage.setImageResource(R.drawable.injeolmimango)
            binding.recipetable.setImageResource(R.drawable.injeolmimangorecipe)
            binding.recipedetail.setImageResource(R.drawable.injeolmimangorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 700, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 팥인절미&망고 반반설빙
        if (whatsulbing == "17") {
            binding.sulbingimage.setImageResource(R.drawable.patinjeolmimango)
            binding.recipetable.setImageResource(R.drawable.patinjeolmimangorecipe)
            binding.recipedetail.setImageResource(R.drawable.patinjeolmimangorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 4000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 800, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 리얼통통메론설빙
        if (whatsulbing == "18") {
            binding.sulbingimage.setImageResource(R.drawable.realtontonmelon)
            binding.recipetable.setImageResource(R.drawable.realtontonmelonrecipe)
            binding.recipedetail.setImageResource(R.drawable.realtontonmelonrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 요거통통메론설빙
        if (whatsulbing == "19") {
            binding.sulbingimage.setImageResource(R.drawable.yogurtontonmelon)
            binding.recipetable.setImageResource(R.drawable.yogurtontonmelonrecipe)
            binding.recipedetail.setImageResource(R.drawable.yogurtontonmelonrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 딸기치즈메론설빙
        if (whatsulbing == "20") {
            binding.sulbingimage.setImageResource(R.drawable.strawberrycheesemelon)
            binding.recipetable.setImageResource(R.drawable.strawberrycheesemelonrecipe)
            binding.recipedetail.setImageResource(R.drawable.strawberrycheesemelonrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3800, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 샤인머스켓메론설빙
        if (whatsulbing == "21") {
            binding.sulbingimage.setImageResource(R.drawable.shinemuscatmelon)
            binding.recipetable.setImageResource(R.drawable.shinemuscatmelonrecipe)
            binding.recipedetail.setImageResource(R.drawable.shinemuscatmelonrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 700, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 생딸기설빙
        if (whatsulbing == "22") {
            binding.sulbingimage.setImageResource(R.drawable.plainstrawberry)
            binding.recipetable.setImageResource(R.drawable.plainstrawberryrecipe)
            binding.recipedetail.setImageResource(R.drawable.plainstrawberryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2800, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 프리미엄생딸기설빙
        if (whatsulbing == "23") {
            binding.sulbingimage.setImageResource(R.drawable.premiumplainstrawberry)
            binding.recipetable.setImageResource(R.drawable.premiumplainstrawberryrecipe)
            binding.recipedetail.setImageResource(R.drawable.premiumplainstrawberryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 순수요거생딸기설빙
        if (whatsulbing == "24") {
            binding.sulbingimage.setImageResource(R.drawable.plainyogurtstrawberry)
            binding.recipetable.setImageResource(R.drawable.plainyogurtstrawberryrecipe)
            binding.recipedetail.setImageResource(R.drawable.plainyogurtstrawberryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 810, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 와르르생딸기설빙
        if (whatsulbing == "25") {
            binding.sulbingimage.setImageResource(R.drawable.warrplainstrawberry)
            binding.recipetable.setImageResource(R.drawable.warrplainstrawberryrecipe)
            binding.recipedetail.setImageResource(R.drawable.warrplainstrawberryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 630, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 첵스초코딸기설빙
        if (whatsulbing == "26") {
            binding.sulbingimage.setImageResource(R.drawable.chekschocostrawberry)
            binding.recipetable.setImageResource(R.drawable.chekschocostrawberryrecipe)
            binding.recipedetail.setImageResource(R.drawable.chekschocostrawberryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 4500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }
    }
}