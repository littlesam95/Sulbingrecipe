package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import com.bodan.sulbingrecipe.databinding.ActivityDessertrecipeBinding

class DessertrecipeActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding : ActivityDessertrecipeBinding? = null
    private val binding get() = mBinding!!
    private var whatdessert : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰 바인딩
        mBinding = ActivityDessertrecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // 버튼을 눌러서 가져온 값
        if (intent.hasExtra("idText")) {
            whatdessert = intent.getStringExtra("idText")
        }

        // 인절미토스트
        if (whatdessert == "injeolmitoast") {
            binding.dessertimage.setImageResource(R.drawable.injeolmitoast)
            binding.dessertrecipetable.setImageResource(R.drawable.injeolmitoastrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.injeolmitoastrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 750, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 800, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 모짜렐라인절미토스트
        if (whatdessert == "mozzarellainjeolmitoast") {
            binding.dessertimage.setImageResource(R.drawable.mozzarellainjeolmitoast)
            binding.dessertrecipetable.setImageResource(R.drawable.mozzarellatoastrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.mozzarellainjeolmirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 650, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 허니버터브레드
        if (whatdessert == "honeybutterbread") {
            binding.dessertimage.setImageResource(R.drawable.honeybutterbread)
            binding.dessertrecipetable.setImageResource(R.drawable.honeybutterbreadrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.honeybutterbreadrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 650, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 달콤퐁당꿀떡
        if (whatdessert == "dalcompongdangkkultteok") {
            binding.dessertimage.setImageResource(R.drawable.dalcompongdangkkultteok)
            binding.dessertrecipetable.setImageResource(R.drawable.dalcompongdangkkultteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.dalcompongdangkkultteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 350, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 인절미꿀떡
        if (whatdessert == "injeolmikultteok") {
            binding.dessertimage.setImageResource(R.drawable.injeolmikultteok)
            binding.dessertrecipetable.setImageResource(R.drawable.injeolmikultteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.injeolmikultteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 550, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 국내산통단팥죽
        if (whatdessert == "koreanbigdanpatmeal") {
            binding.dessertimage.setImageResource(R.drawable.koreanbigdanpatmeal)
            binding.dessertrecipetable.setImageResource(R.drawable.koreanbigdanpatmealrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.koreanbigdanpatmealrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 370, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 인절미아이스크림
        if (whatdessert == "injeolmiicecream") {
            binding.dessertimage.setImageResource(R.drawable.injeolmiicecream)
            binding.dessertrecipetable.setImageResource(R.drawable.injeolmiicecreamrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.injeolmiicecreamrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 750, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 플레인와플
        if (whatdessert == "plainwaffle") {
            binding.dessertimage.setImageResource(R.drawable.plainwaffle)
            binding.dessertrecipetable.setImageResource(R.drawable.plainwafflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.plainwafflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 250, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 생딸기와플
        if (whatdessert == "plainstrawberrywaffle") {
            binding.dessertimage.setImageResource(R.drawable.plainstrawberrywaffle)
            binding.dessertrecipetable.setImageResource(R.drawable.plainstrawberrywafflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.plainstrawberrywafflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 쌍쌍치즈가래떡
        if (whatdessert == "twincheesegaraetteok") {
            binding.dessertimage.setImageResource(R.drawable.twincheesegaraetteok)
            binding.dessertrecipetable.setImageResource(R.drawable.twincheesegaraetteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.twincheesegaraetteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 쌍쌍치즈가래떡볶이
        if (whatdessert == "twincheesegaraetteokbokki") {
            binding.dessertimage.setImageResource(R.drawable.twincheesegaraetteokbokki)
            binding.dessertrecipetable.setImageResource(R.drawable.twincheesegaraetteokbokkirecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.twincheesegaraetteokbokkirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1300, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 바바리안크림츄러스
        if (whatdessert == "barbariancreamchuros") {
            binding.dessertimage.setImageResource(R.drawable.barbariancreamchuros)
            binding.dessertrecipetable.setImageResource(R.drawable.barbariancreamchurosrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.barbariancreamchurosrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 딥초코츄러스
        if (whatdessert == "deepchocochuros") {
            binding.dessertimage.setImageResource(R.drawable.deepchocochuros)
            binding.dessertrecipetable.setImageResource(R.drawable.deepchocochurosrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.deepchocochurosrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 프리미엄딸기마카롱
        if (whatdessert == "premiumstrawberrymacaron") {
            binding.dessertimage.setImageResource(R.drawable.premiumstrawberrymacaron)
            binding.dessertrecipetable.setImageResource(R.drawable.premiumstrawberrymacaronrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.premiumstrawberrymacaronrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 180, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 생딸기찹쌀떡
        if (whatdessert == "plainstrawberrychapsaltteok") {
            binding.dessertimage.setImageResource(R.drawable.plainstrawberrychapsaltteok)
            binding.dessertrecipetable.setImageResource(R.drawable.plainstrawberrychapsaltteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.plainstrawberrychapsaltteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 한입쏙붕어빵
        if (whatdessert == "onemouthfishbread") {
            binding.dessertimage.setImageResource(R.drawable.onemouthfishbread)
            binding.dessertrecipetable.setImageResource(R.drawable.onemouthfishbreadrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.onemouthfishbreadrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 250, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 딸기치즈케이크
        if (whatdessert == "strawberrycheesecake") {
            binding.dessertimage.setImageResource(R.drawable.strawberrycheesecake)
            binding.dessertrecipetable.setImageResource(R.drawable.strawberrycheesecakerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.strawberrycheesecakerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 700, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 330, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 티라미수케이크
        if (whatdessert == "tiramisucake") {
            binding.dessertimage.setImageResource(R.drawable.tiramisucake)
            binding.dessertrecipetable.setImageResource(R.drawable.tiramisucakerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.tiramisucakerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 350, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 꿀호떡
        if (whatdessert == "kkulhotteok") {
            binding.dessertimage.setImageResource(R.drawable.kkulhotteok)
            binding.dessertrecipetable.setImageResource(R.drawable.kkulhotteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.kkulhotteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 550, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 250, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 인절미꿀호떡
        if (whatdessert == "injeolmikkulhotteok") {
            binding.dessertimage.setImageResource(R.drawable.injeolmikkulhotteok)
            binding.dessertrecipetable.setImageResource(R.drawable.injeolmikkulhotteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.injeolmikkulhotteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 450, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }
    }
}