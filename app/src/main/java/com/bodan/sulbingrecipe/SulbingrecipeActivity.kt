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
        if (whatsulbing == "injeolmi") {
            binding.sulbingimage.setImageResource(R.drawable.injeolmisulbing)
            binding.recipetable.setImageResource(R.drawable.injeolmirecipe)
            binding.recipedetail.setImageResource(R.drawable.injeolmirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 450, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 팥인절미설빙
        if (whatsulbing == "patinjeolmi") {
            binding.sulbingimage.setImageResource(R.drawable.patinjeolmisulbing)
            binding.recipetable.setImageResource(R.drawable.patinjeolmirecipe)
            binding.recipedetail.setImageResource(R.drawable.patinjeolmirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 540, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 흑임자찰떡설빙
        if (whatsulbing == "heukimjachaltteok") {
            binding.sulbingimage.setImageResource(R.drawable.heukimjachaltteok)
            binding.recipetable.setImageResource(R.drawable.heukimjachaltteokrecipe)
            binding.recipedetail.setImageResource(R.drawable.heukimjachaltteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1800, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 630, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 치즈설빙
        if (whatsulbing == "cheese") {
            binding.sulbingimage.setImageResource(R.drawable.cheesesulbing)
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
        if (whatsulbing == "realgreentea") {
            binding.sulbingimage.setImageResource(R.drawable.realgreentea)
            binding.recipetable.setImageResource(R.drawable.realgreentearecipe)
            binding.recipedetail.setImageResource(R.drawable.realgreentearecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 720, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 그린티초코설빙
        if (whatsulbing == "greenteachoco") {
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
        if (whatsulbing == "oreochocomonster") {
            binding.sulbingimage.setImageResource(R.drawable.oreochocomonster)
            binding.recipetable.setImageResource(R.drawable.oreochochrecipe)
            binding.recipedetail.setImageResource(R.drawable.oreochocorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 990, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 초코브라우니설빙
        if (whatsulbing == "chocobrownie") {
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
        if (whatsulbing == "mintochoco") {
            binding.sulbingimage.setImageResource(R.drawable.mintchoco)
            binding.recipetable.setImageResource(R.drawable.mintchocorecipe)
            binding.recipedetail.setImageResource(R.drawable.mintchocorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 990, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 티라미수설빙
        if (whatsulbing == "tiramisu") {
            binding.sulbingimage.setImageResource(R.drawable.tiramisu)
            binding.recipetable.setImageResource(R.drawable.tiramisurecipe)
            binding.recipedetail.setImageResource(R.drawable.tiramisurecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1170, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 딸기마카롱설빙
        if (whatsulbing == "strawberrymacaron") {
            binding.sulbingimage.setImageResource(R.drawable.strawberrymacaron)
            binding.recipetable.setImageResource(R.drawable.strawberrymacaronrecipe)
            binding.recipedetail.setImageResource(R.drawable.strawberrymacaronrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1260, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 애플망고치즈설빙
        if (whatsulbing == "applemangocheese") {
            binding.sulbingimage.setImageResource(R.drawable.applemangocheese)
            binding.recipetable.setImageResource(R.drawable.applemangocheeserecipe)
            binding.recipedetail.setImageResource(R.drawable.applemangocheeserecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2700, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 킹망고설빙
        if (whatsulbing == "kingmango") {
            binding.sulbingimage.setImageResource(R.drawable.kingmango)
            binding.recipetable.setImageResource(R.drawable.kingmangorecipe)
            binding.recipedetail.setImageResource(R.drawable.kingmangorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3400, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1260, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 블루베리치즈설빙
        if (whatsulbing == "blueberrycheese") {
            binding.sulbingimage.setImageResource(R.drawable.blueberrycheese)
            binding.recipetable.setImageResource(R.drawable.blueberrycheeserecipe)
            binding.recipedetail.setImageResource(R.drawable.blueberrycheeserecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 칙촉몬스터설빙
        if (whatsulbing == "chikchokmonster") {
            binding.sulbingimage.setImageResource(R.drawable.chikchokmonster)
            binding.recipetable.setImageResource(R.drawable.chikchokmonsterrecipe)
            binding.recipedetail.setImageResource(R.drawable.chikchokmonsterrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1350, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 인절미&망고 반반설빙
        if (whatsulbing == "injeolmimango") {
            binding.sulbingimage.setImageResource(R.drawable.injeolmimango)
            binding.recipetable.setImageResource(R.drawable.injeolmimangorecipe)
            binding.recipedetail.setImageResource(R.drawable.injeolmimangorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1170, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 팥인절미&망고 반반설빙
        if (whatsulbing == "patinjeolmimango") {
            binding.sulbingimage.setImageResource(R.drawable.patinjeolmimango)
            binding.recipetable.setImageResource(R.drawable.patinjeolmimangorecipe)
            binding.recipedetail.setImageResource(R.drawable.patinjeolmimangorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 4000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1260, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 리얼통통메론설빙
        if (whatsulbing == "realtontonmelon") {
            binding.sulbingimage.setImageResource(R.drawable.realtontonmelon)
            binding.recipetable.setImageResource(R.drawable.realtontonmelonrecipe)
            binding.recipedetail.setImageResource(R.drawable.realtontonmelonrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 810, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 요거통통메론설빙
        if (whatsulbing == "yogurtontonmelon") {
            binding.sulbingimage.setImageResource(R.drawable.yogurtontonmelon)
            binding.recipetable.setImageResource(R.drawable.yogurtontonmelonrecipe)
            binding.recipedetail.setImageResource(R.drawable.yogurtontonmelonrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 딸기치즈메론설빙
        if (whatsulbing == "strawberrycheesemelon") {
            binding.sulbingimage.setImageResource(R.drawable.strawberrycheesemelon)
            binding.recipetable.setImageResource(R.drawable.strawberrycheesemelonrecipe)
            binding.recipedetail.setImageResource(R.drawable.strawberrycheesemelonrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3800, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1080, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 샤인머스켓메론설빙
        if (whatsulbing == "shinemuscat") {
            binding.sulbingimage.setImageResource(R.drawable.shinemuscat)
            binding.recipetable.setImageResource(R.drawable.shinemuscatrecipe)
            binding.recipedetail.setImageResource(R.drawable.shinemuscatrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 생딸기설빙
        if (whatsulbing == "plainstrawberry") {
            binding.sulbingimage.setImageResource(R.drawable.plainstrawberry)
            binding.recipetable.setImageResource(R.drawable.plainstrawberryrecipe)
            binding.recipedetail.setImageResource(R.drawable.plainstrawberryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2800, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 810, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 프리미엄생딸기설빙
        if (whatsulbing == "premiumplainstrawberry") {
            binding.sulbingimage.setImageResource(R.drawable.premiumplainstrawberry)
            binding.recipetable.setImageResource(R.drawable.premiumplainstrawberryrecipe)
            binding.recipedetail.setImageResource(R.drawable.premiumplainstrawberryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1080, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 순수요거생딸기설빙
        if (whatsulbing == "yogurtplainstrawberry") {
            binding.sulbingimage.setImageResource(R.drawable.yogurtplainstrawberryy)
            binding.recipetable.setImageResource(R.drawable.plainyogurtstrawberryrecipe)
            binding.recipedetail.setImageResource(R.drawable.plainyogurtstrawberryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1080, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 와르르생딸기설빙
        if (whatsulbing == "warrplainstrawberry") {
            binding.sulbingimage.setImageResource(R.drawable.warrplainstrawberry)
            binding.recipetable.setImageResource(R.drawable.warrplainstrawbarryrecipe)
            binding.recipedetail.setImageResource(R.drawable.warrplainstrawbarryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 990, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }

        // 첵스초코딸기설빙
        if (whatsulbing == "chekschocostrawberry") {
            binding.sulbingimage.setImageResource(R.drawable.chekschocostrawberry)
            binding.recipetable.setImageResource(R.drawable.chekschocostrawberryrecipe)
            binding.recipedetail.setImageResource(R.drawable.chekschocostrawberryrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 4500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.recipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1350, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.recipetable.layoutParams = imageLayoutParams2
        }
    }
}