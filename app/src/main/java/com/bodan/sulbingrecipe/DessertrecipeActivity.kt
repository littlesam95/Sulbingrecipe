package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.Toast
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
        if (whatdessert == "1") {
            binding.dessertimage.setImageResource(R.drawable.injeolmitoast)
            binding.dessertrecipetable.setImageResource(R.drawable.injeolmitoastrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.injeolmitoastrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1550, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 675, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 모짜렐라인절미토스트
        if (whatdessert == "2") {
            binding.dessertimage.setImageResource(R.drawable.mozzarellainjeolmitoast)
            binding.dessertrecipetable.setImageResource(R.drawable.mozzarellatoastrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.mozzarellainjeolmirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1450, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 675, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 허니버터브레드
        if (whatdessert == "3") {
            binding.dessertimage.setImageResource(R.drawable.honeybutterbread)
            binding.dessertrecipetable.setImageResource(R.drawable.honeybutterbreadrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.honeybutterbreadrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1350, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 650, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 달콤퐁당꿀떡
        if (whatdessert == "4") {
            binding.dessertimage.setImageResource(R.drawable.dalcompongdangkkultteok)
            binding.dessertrecipetable.setImageResource(R.drawable.dalcompongdangkkultteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.dalcompongdangkkultteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 700, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 350, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 인절미꿀떡
        if (whatdessert == "5") {
            binding.dessertimage.setImageResource(R.drawable.injeolmikultteok)
            binding.dessertrecipetable.setImageResource(R.drawable.injeolmikultteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.injeolmikultteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 800, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 525, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 국내산통단팥죽
        if (whatdessert == "6") {
            binding.dessertimage.setImageResource(R.drawable.koreanbigdanpatmeal)
            binding.dessertrecipetable.setImageResource(R.drawable.koreanbigdanpatmealrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.koreanbigdanpatmealrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 350, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 인절미아이스크림
        if (whatdessert == "7") {
            binding.dessertimage.setImageResource(R.drawable.injeolmiicecream)
            binding.dessertrecipetable.setImageResource(R.drawable.injeolmiicecreamrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.injeolmiicecreamrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 850, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 플레인와플
        if (whatdessert == "8") {
            binding.dessertimage.setImageResource(R.drawable.plainwaffle)
            binding.dessertrecipetable.setImageResource(R.drawable.plainwafflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.plainwafflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 425, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 350, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 생딸기와플
        if (whatdessert == "9") {
            binding.dessertimage.setImageResource(R.drawable.plainstrawberrywaffle)
            binding.dessertrecipetable.setImageResource(R.drawable.plainstrawberrywafflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.plainstrawberrywafflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 825, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 450, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 쌍쌍치즈가래떡
        if (whatdessert == "10") {
            binding.dessertimage.setImageResource(R.drawable.twincheesegaraetteok)
            binding.dessertrecipetable.setImageResource(R.drawable.twincheesegaraetteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.twincheesegaraetteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1425, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 650, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 쌍쌍치즈가래떡볶이
        if (whatdessert == "11") {
            binding.dessertimage.setImageResource(R.drawable.twincheesegaraetteokbokki)
            binding.dessertrecipetable.setImageResource(R.drawable.twincheesegaraetteokbokkirecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.twincheesegaraetteokbokkirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1450, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 바바리안크림츄러스
        if (whatdessert == "12") {
            binding.dessertimage.setImageResource(R.drawable.barbariancreamchuros)
            binding.dessertrecipetable.setImageResource(R.drawable.barbariancreamchurosrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.barbariancreamchurosrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 딥초코츄러스
        if (whatdessert == "13") {
            binding.dessertimage.setImageResource(R.drawable.deepchocochuros)
            binding.dessertrecipetable.setImageResource(R.drawable.deepchocochurosrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.deepchocochurosrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 650, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 275, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 프리미엄딸기마카롱
        if (whatdessert == "14") {
            binding.dessertimage.setImageResource(R.drawable.premiumstrawberrymacaron)
            binding.dessertrecipetable.setImageResource(R.drawable.premiumstrawberrymacaronrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.premiumstrawberrymacaronrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 450, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 190, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 생딸기찹쌀떡
        if (whatdessert == "15") {
            binding.dessertimage.setImageResource(R.drawable.plainstrawberrychapsaltteok)
            binding.dessertrecipetable.setImageResource(R.drawable.plainstrawberrychapsaltteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.plainstrawberrychapsaltteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 665, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 350, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 한입쏙붕어빵
        if (whatdessert == "16") {
            binding.dessertimage.setImageResource(R.drawable.onemouthfishbread)
            binding.dessertrecipetable.setImageResource(R.drawable.onemouthfishbreadrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.onemouthfishbreadrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 275, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 315, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 딸기치즈케이크
        if (whatdessert == "17") {
            binding.dessertimage.setImageResource(R.drawable.strawberrycheesecake)
            binding.dessertrecipetable.setImageResource(R.drawable.strawberrycheesecakerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.strawberrycheesecakerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 800, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 275, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 티라미수케이크
        if (whatdessert == "18") {
            binding.dessertimage.setImageResource(R.drawable.tiramisucake)
            binding.dessertrecipetable.setImageResource(R.drawable.tiramisucakerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.tiramisucakerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 625, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 꿀호떡
        if (whatdessert == "19") {
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
        if (whatdessert == "20") {
            binding.dessertimage.setImageResource(R.drawable.injeolmikkulhotteok)
            binding.dessertrecipetable.setImageResource(R.drawable.injeolmikkulhotteokrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.injeolmikkulhotteokrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1100, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 플레인크로플
        if (whatdessert == "21") {
            binding.dessertimage.setImageResource(R.drawable.plaincroffle)
            binding.dessertrecipetable.setImageResource(R.drawable.plaincrofflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.plaincrofflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 525, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 265, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 인절미크로플
        if (whatdessert == "22") {
            binding.dessertimage.setImageResource(R.drawable.injeolmicroffle)
            binding.dessertrecipetable.setImageResource(R.drawable.injeolmicrofflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.injeolmicrofflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 950, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 생딸기크로플
        if (whatdessert == "23") {
            binding.dessertimage.setImageResource(R.drawable.plainstrawberrycroffle)
            binding.dessertrecipetable.setImageResource(R.drawable.plainstrawberrycrofflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.plainstrawberrycrofflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 425, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 초코크로플
        if (whatdessert == "24") {
            binding.dessertimage.setImageResource(R.drawable.chococroffle)
            binding.dessertrecipetable.setImageResource(R.drawable.chochcrofflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.chochcrofflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 875, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 425, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 치즈크로플
        if (whatdessert == "25") {
            binding.dessertimage.setImageResource(R.drawable.cheesecroffle)
            binding.dessertrecipetable.setImageResource(R.drawable.cheesecrofflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.cheesecrofflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 875, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 칙촉크로플
        if (whatdessert == "26") {
            binding.dessertimage.setImageResource(R.drawable.chikchokcroffle)
            binding.dessertrecipetable.setImageResource(R.drawable.chikchokcrofflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.chikchokcrofflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 3125, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 민트초코크로플
        if (whatdessert == "27") {
            binding.dessertimage.setImageResource(R.drawable.mintchococroffle)
            binding.dessertrecipetable.setImageResource(R.drawable.mintchococrofflerecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.mintchococrofflerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1950, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 425, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 매콤떡볶이
        if (whatdessert == "28") {
            binding.dessertimage.setImageResource(R.drawable.maecomtteokbokki)
            binding.dessertrecipetable.setImageResource(R.drawable.maecomtteokbokkirecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.maecomtteokbokkirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 로제떡볶이
        if (whatdessert == "29") {
            binding.dessertimage.setImageResource(R.drawable.rosetteokbokki)
            binding.dessertrecipetable.setImageResource(R.drawable.rosetteokbokkirecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.rosetteokbokkirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1350, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 베이컨크림스파게티/로제스파게티
        if (whatdessert == "30") {
            binding.dessertimage.setImageResource(R.drawable.baconcreamspaghetti)
            binding.dessertrecipetable.setImageResource(R.drawable.baconcreamspaghettirecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.baconcreamspaghettirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1150, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 425, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 반숙김치볶음밥
        if (whatdessert == "31") {
            binding.dessertimage.setImageResource(R.drawable.bansukkimchibokkeumbap)
            binding.dessertrecipetable.setImageResource(R.drawable.bansukkimchibokkeumbaprecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.bansukkimchibokkeumbaprecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 885, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 415, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 통통새우볶음밥
        if (whatdessert == "32") {
            binding.dessertimage.setImageResource(R.drawable.tontonshrimpbokkeumbap)
            binding.dessertrecipetable.setImageResource(R.drawable.tontonshrimpbokkeumbaprecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.tontonshrimpbokkeumbaprecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 885, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 415, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 참치마요구운주먹밥/참치김치구운주먹밥
        if (whatdessert == "33") {
            binding.dessertimage.setImageResource(R.drawable.grilledtunaonigiri)
            binding.dessertrecipetable.setImageResource(R.drawable.grilledtunaonigirirecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.grilledtunaonigirirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 고구마피자/불고기피자
        if (whatdessert == "34") {
            binding.dessertimage.setImageResource(R.drawable.sweetpotatopizza)
            binding.dessertrecipetable.setImageResource(R.drawable.sweetpotatopizzarecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.sweetpotatopizzarecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1115, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 415, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 치즈떡볶이피자
        if (whatdessert == "35") {
            binding.dessertimage.setImageResource(R.drawable.cheesetteokbokkipizza)
            binding.dessertrecipetable.setImageResource(R.drawable.cheesetteokbokkipizzarecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.cheesetteokbokkipizzarecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2515, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 865, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 핫도그퐁당치즈떡볶이
        if (whatdessert == "36") {
            binding.dessertimage.setImageResource(R.drawable.hotdogpongdangcheesetteokbokki)
            binding.dessertrecipetable.setImageResource(R.drawable.hotdogpongdangcheesetteokbokkirecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.hotdogpongdangcheesetteokbokkirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2100, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 875, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }

        // 찰핫도그
        if (whatdessert == "37") {
            binding.dessertimage.setImageResource(R.drawable.chalhotdog)
            binding.dessertrecipetable.setImageResource(R.drawable.chalhotdogrecipe)
            binding.dessertrecipedetail.setImageResource(R.drawable.chalhotdogrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 700, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.dessertrecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.dessertrecipetable.layoutParams = imageLayoutParams2
        }
    }
}