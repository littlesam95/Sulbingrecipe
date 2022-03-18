package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.bodan.sulbingrecipe.databinding.ActivitySulbingBinding
import kotlinx.android.synthetic.main.activity_sulbing.*

class SulbingActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding : ActivitySulbingBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰 바인딩
        mBinding = ActivitySulbingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sulbingList = arrayListOf(
            SulbingRecycler(R.drawable.injeolmisulbing, 1),
            SulbingRecycler(R.drawable.patinjeolmisulbing, 2),
            SulbingRecycler(R.drawable.heukimjachaltteok, 3),
            SulbingRecycler(R.drawable.cheesesulbing, 4),
            SulbingRecycler(R.drawable.realgreentea, 5),
            SulbingRecycler(R.drawable.greenteachoco, 6),
            SulbingRecycler(R.drawable.oreochocomonster, 7),
            SulbingRecycler(R.drawable.chocobrownie, 8),
            SulbingRecycler(R.drawable.mintchoco, 9),
            SulbingRecycler(R.drawable.tiramisu, 10),
            SulbingRecycler(R.drawable.strawberrymacaron, 11),
            SulbingRecycler(R.drawable.applemangocheese, 12),
            SulbingRecycler(R.drawable.kingmango, 13),
            SulbingRecycler(R.drawable.blueberrycheese, 14),
            SulbingRecycler(R.drawable.chikchokmonster, 15),
            SulbingRecycler(R.drawable.injeolmimango, 16),
            SulbingRecycler(R.drawable.patinjeolmimango, 17),
            SulbingRecycler(R.drawable.realtontonmelon, 18),
            SulbingRecycler(R.drawable.yogurtontonmelon, 19),
            SulbingRecycler(R.drawable.strawberrycheesemelon, 20),
            SulbingRecycler(R.drawable.shinemuscat, 21),
            SulbingRecycler(R.drawable.plainstrawberry, 22),
            SulbingRecycler(R.drawable.premiumplainstrawberry, 23),
            SulbingRecycler(R.drawable.yogurtplainstrawberryy, 24),
            SulbingRecycler(R.drawable.warrplainstrawberry, 25),
            SulbingRecycler(R.drawable.chekschocostrawberry, 26)
        )

        rv_sulbing.layoutManager = GridLayoutManager(applicationContext, 2)
        rv_sulbing.setHasFixedSize(true)
        rv_sulbing.adapter = SulbingAdapter(sulbingList)

        rv_sulbing.setNestedScrollingEnabled(false);

        /*
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

        // 흑임자찰떡설빙 레시피
        binding.heukimjachaltteok.setOnClickListener {
            var idText = "heukimjachaltteok"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 치즈설빙 레시피
        binding.cheese.setOnClickListener {
            var idText = "cheese"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 리얼그린티설빙 레시피
        binding.realgreentea.setOnClickListener {
            var idText = "realgreentea"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 그린티초코설빙 레시피
        binding.greenteachoco.setOnClickListener {
            var idText = "greenteachoco"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 오레오초코몬스터설빙 레시피
        binding.oreochocomonster.setOnClickListener {
            var idText = "oreochocomonster"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 초코브라우니설빙 레시피
        binding.chocobrownie.setOnClickListener {
            var idText = "chocobrownie"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 민트초코설빙 레시피
        binding.mintochoco.setOnClickListener {
            var idText = "mintochoco"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 티라미수설빙 레시피
        binding.tiramisu.setOnClickListener {
            var idText = "tiramisu"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 딸기마카롱설빙 레시피
        binding.strawberrymacaron.setOnClickListener {
            var idText = "strawberrymacaron"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 애플망고치즈설빙 레시피
        binding.applemangocheese.setOnClickListener {
            var idText = "applemangocheese"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 킹망고설빙 레시피
        binding.kingmango.setOnClickListener {
            var idText = "kingmango"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 블루베리치즈설빙 레시피
        binding.blueberrycheese.setOnClickListener {
            var idText = "blueberrycheese"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 칙촉몬스터설빙 레시피
        binding.chikchokmonster.setOnClickListener {
            var idText = "chikchokmonster"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 인절미&망고 반반설빙 레시피
        binding.injeolmimango.setOnClickListener {
            var idText = "injeolmimango"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 팥인절미&망고 반반설빙 레시피
        binding.patinjeolmimango.setOnClickListener {
            var idText = "patinjeolmimango"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 리얼통통메론설빙 레시피
        binding.realtontonmelon.setOnClickListener {
            var idText = "realtontonmelon"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 요거통통메론설빙 레시피
        binding.yogurtontonmelon.setOnClickListener {
            var idText = "yogurtontonmelon"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 딸기치즈메론설빙 레시피
        binding.strawberrycheesemelon.setOnClickListener {
            var idText = "strawberrycheesemelon"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 샤인머스켓메론설빙 레시피
        binding.shinemuscat.setOnClickListener {
            var idText = "shinemuscat"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 생딸기설빙 레시피
        binding.plainstrawberry.setOnClickListener {
            var idText = "plainstrawberry"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 프리미엄생딸기설빙 레시피
        binding.premiumplainstrawberry.setOnClickListener {
            var idText = "premiumplainstrawberry"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 순수요거생딸기설빙 레시피
        binding.yogurtplainstrawberry.setOnClickListener {
            var idText = "yogurtplainstrawberry"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 와르르생딸기설빙 레시피
        binding.warrplainstrawberry.setOnClickListener {
            var idText = "warrplainstrawberry"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 첵스초코딸기설빙 레시피
        binding.chekschocostrawberry.setOnClickListener {
            var idText = "chekschocostrawberry"
            var intent = Intent(this@SulbingActivity, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }
        */
    }
}