package com.bodan.sulbingrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bodan.sulbingrecipe.databinding.ActivityDessertBinding
import kotlinx.android.synthetic.main.activity_dessert.*

class DessertActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding : ActivityDessertBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰 바인딩
        mBinding = ActivityDessertBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dessertList = arrayListOf(
            DessertRecycler(R.drawable.injeolmitoast, 1),
            DessertRecycler(R.drawable.mozzarellainjeolmitoast, 2),
            DessertRecycler(R.drawable.honeybutterbread, 3),
            DessertRecycler(R.drawable.dalcompongdangkkultteok, 4),
            DessertRecycler(R.drawable.injeolmikultteok, 5),
            DessertRecycler(R.drawable.koreanbigdanpatmeal, 6),
            DessertRecycler(R.drawable.injeolmiicecream, 7),
            DessertRecycler(R.drawable.plainwaffle, 8),
            DessertRecycler(R.drawable.plainstrawberrywaffle, 9),
            DessertRecycler(R.drawable.twincheesegaraetteok, 10),
            DessertRecycler(R.drawable.twincheesegaraetteokbokki, 11),
            DessertRecycler(R.drawable.barbariancreamchuros, 12),
            DessertRecycler(R.drawable.deepchocochuros, 13),
            DessertRecycler(R.drawable.premiumstrawberrymacaron, 14),
            DessertRecycler(R.drawable.plainstrawberrychapsaltteok, 15),
            DessertRecycler(R.drawable.onemouthfishbread, 16),
            DessertRecycler(R.drawable.strawberrycheesecake, 17),
            DessertRecycler(R.drawable.tiramisucake, 18),
            DessertRecycler(R.drawable.kkulhotteok, 19),
            DessertRecycler(R.drawable.injeolmikkulhotteok, 20),
            DessertRecycler(R.drawable.plaincroffle, 21),
            DessertRecycler(R.drawable.injeolmicroffle, 22),
            DessertRecycler(R.drawable.plainstrawberrycroffle, 23),
            DessertRecycler(R.drawable.chochcroffle, 24),
            DessertRecycler(R.drawable.cheesecroffle, 25),
            DessertRecycler(R.drawable.chikchokcroffle, 26),
            DessertRecycler(R.drawable.mintchococroffle, 27),
            DessertRecycler(R.drawable.maecomtteokbokki, 28),
            DessertRecycler(R.drawable.rosetteokbokki, 29),
            DessertRecycler(R.drawable.baconcreamspaghetti, 30),
            DessertRecycler(R.drawable.bansukkimchibokkeumbap, 31),
            DessertRecycler(R.drawable.tontonshrimpbokkeumbap, 32),
            DessertRecycler(R.drawable.grilledtunaonigiri, 33),
            DessertRecycler(R.drawable.sweetpotatopizza, 34),
            DessertRecycler(R.drawable.cheesetteokbokkipizza, 35),
            DessertRecycler(R.drawable.hotdogpongdangcheesetteokbokki, 36),
            DessertRecycler(R.drawable.chalhotdog, 37)
        )

        rv_dessert.layoutManager = GridLayoutManager(applicationContext, 2)
        rv_dessert.setHasFixedSize(true)
        rv_dessert.adapter = DessertAdapter(dessertList)

        /*
        // 인절미토스트 레시피
        binding.injeolmitoast.setOnClickListener {
            var idText = "injeolmitoast"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 모짜렐라인절미토스트 레시피
        binding.mozzarellainjeolmitoast.setOnClickListener {
            var idText = "mozzarellainjeolmitoast"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 허니버터브레드 레시피
        binding.honeybutterbread.setOnClickListener {
            var idText = "honeybutterbread"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 달콤퐁당꿀떡 레시피
        binding.dalcompongdangkkultteok.setOnClickListener {
            var idText = "dalcompongdangkkultteok"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 인절미꿀떡 레시피
        binding.injeolmikultteok.setOnClickListener {
            var idText = "injeolmikultteok"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 국내산통단팥죽 레시피
        binding.koreanbigdanpatmeal.setOnClickListener {
            var idText = "koreanbigdanpatmeal"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 인절미아이스크림 레시피
        binding.injeolmiicecream.setOnClickListener {
            var idText = "injeolmiicecream"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 플레인와플 레시피
        binding.plainwaffle.setOnClickListener {
            var idText = "plainwaffle"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 생딸기와플 레시피
        binding.plainstrawberrywaffle.setOnClickListener {
            var idText = "plainstrawberrywaffle"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 쌍쌍치즈가래떡 레시피
        binding.twincheesegaraetteok.setOnClickListener {
            var idText = "twincheesegaraetteok"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 쌍쌍치즈가래떡볶이 레시피
        binding.twincheesegaraetteokbokki.setOnClickListener {
            var idText = "twincheesegaraetteokbokki"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 바바리안크림츄러스 레시피
        binding.barbariancreamchuros.setOnClickListener {
            var idText = "barbariancreamchuros"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 딥초코츄러스 레시피
        binding.deepchocochuros.setOnClickListener {
            var idText = "deepchocochuros"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 프리미엄딸기마카롱 레시피
        binding.premiumstrawberrymacaron.setOnClickListener {
            var idText = "premiumstrawberrymacaron"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 생딸기찹쌀떡 레시피
        binding.plainstrawberrychapsaltteok.setOnClickListener {
            var idText = "plainstrawberrychapsaltteok"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 한입쏙붕어빵 레시피
        binding.onemouthfishbread.setOnClickListener {
            var idText = "onemouthfishbread"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 딸기치즈케이크 레시피
        binding.strawberrycheesecake.setOnClickListener {
            var idText = "strawberrycheesecake"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 티라미수케이크 레시피
        binding.tiramisucake.setOnClickListener {
            var idText = "tiramisucake"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 꿀호떡 레시피
        binding.kkulhotteok.setOnClickListener {
            var idText = "kkulhotteok"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }

        // 인절미꿀호떡 레시피
        binding.injeolmikkulhotteok.setOnClickListener {
            var idText = "injeolmikkulhotteok"
            var intent = Intent(this@DessertActivity, DessertrecipeActivity::class.java)
            intent.putExtra("idText", idText)
            startActivity(intent)
        }
        */
    }
}