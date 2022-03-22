package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import com.bodan.sulbingrecipe.databinding.ActivityBeveragerecipeBinding

class BeveragerecipeActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding : ActivityBeveragerecipeBinding? = null
    private val binding get() = mBinding!!
    private var whatbeverage : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰 바인딩
        mBinding = ActivityBeveragerecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // 버튼을 눌러서 가져온 값
        if (intent.hasExtra("idText")) {
            whatbeverage = intent.getStringExtra("idText")
        }

        // 생생레몬차
        if (whatbeverage == "1") {
            binding.beverageimage.setImageResource(R.drawable.sangsanglemontea)
            binding.beveragerecipetable.setImageResource(R.drawable.sangsanglemontearecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.sangsanglemontearecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 870, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 690, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 통통유자차
        if (whatbeverage == "2") {
            binding.beverageimage.setImageResource(R.drawable.tontonyuzatea)
            binding.beveragerecipetable.setImageResource(R.drawable.tontonyuzatearecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.tontonyuzateadetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 870, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 690, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 진한생강차
        if (whatbeverage == "3") {
            binding.beverageimage.setImageResource(R.drawable.deepsanggangtea)
            binding.beveragerecipetable.setImageResource(R.drawable.deepsanggangtearecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.deepsanggangtearecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 870, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 690, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 진한대추차
        if (whatbeverage == "4") {
            binding.beverageimage.setImageResource(R.drawable.deepdaechutea)
            binding.beveragerecipetable.setImageResource(R.drawable.deepdaechutearecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.deepdaechutearecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 870, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 690, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 복숭아아이스티
        if (whatbeverage == "5") {
            binding.beverageimage.setImageResource(R.drawable.peachicetea)
            binding.beveragerecipetable.setImageResource(R.drawable.peachicetearecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.peachicetearecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 835, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 허니자몽차
        if (whatbeverage == "6") {
            binding.beverageimage.setImageResource(R.drawable.honeygrapefruittea)
            binding.beveragerecipetable.setImageResource(R.drawable.honeygrapefruittearecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.honeygrapefruittearecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1500, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1035, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 산딸기오미차
        if (whatbeverage == "7") {
            binding.beverageimage.setImageResource(R.drawable.raspberryomitea)
            binding.beveragerecipetable.setImageResource(R.drawable.raspberryomitearecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.raspberryomitearecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 705, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 티백차 8종
        if (whatbeverage == "8") {
            binding.beverageimage.setImageResource(R.drawable.teabagteaeight)
            binding.beveragerecipetable.setImageResource(R.drawable.teabagteaeightrecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.teabagteaeightrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1365, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 780, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 생생레몬에이드
        if (whatbeverage == "9") {
            binding.beverageimage.setImageResource(R.drawable.sangsanglemonade)
            binding.beveragerecipetable.setImageResource(R.drawable.sangsanglemonaderecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.sangsanglemonaderecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 560, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 410, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 허니자몽에이드
        if (whatbeverage == "10") {
            binding.beverageimage.setImageResource(R.drawable.honeygrapefruitade)
            binding.beveragerecipetable.setImageResource(R.drawable.honeygrapefruitaderecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.honeygrapefruitaderecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 825, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 610, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 애플망고에이드
        if (whatbeverage == "11") {
            binding.beverageimage.setImageResource(R.drawable.applemangoade)
            binding.beveragerecipetable.setImageResource(R.drawable.applemangoaderecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.applemangoaderecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 685, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 레드망고에이드
        if (whatbeverage == "12") {
            binding.beverageimage.setImageResource(R.drawable.redmangoade)
            binding.beveragerecipetable.setImageResource(R.drawable.redmangoaderecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.redmangoaderecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1050, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 705, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 딸기에이드
        if (whatbeverage == "13") {
            binding.beverageimage.setImageResource(R.drawable.strawberryade)
            binding.beveragerecipetable.setImageResource(R.drawable.strawberryaderecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.strawberryaderecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 595, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 420, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 청포도에이드
        if (whatbeverage == "14") {
            binding.beverageimage.setImageResource(R.drawable.greengrapeade)
            binding.beveragerecipetable.setImageResource(R.drawable.greengrapeaderecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.greengrapeaderecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 685, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 480, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 플레인요거트스무디
        if (whatbeverage == "15") {
            binding.beverageimage.setImageResource(R.drawable.plainyogurtsmoothie)
            binding.beveragerecipetable.setImageResource(R.drawable.plainyogurtsmoothierecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.plainyogurtsmoothierecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1000, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 520, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 블루베리요거트스무디
        if (whatbeverage == "16") {
            binding.beverageimage.setImageResource(R.drawable.blueberryyogurtsmoothie)
            binding.beveragerecipetable.setImageResource(R.drawable.blueberryyogurtsmoothierecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.blueberryyogurtsmoothierecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1150, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 615, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 딸기요거트스무디
        if (whatbeverage == "17") {
            binding.beverageimage.setImageResource(R.drawable.strawberryyogurtsmoothie)
            binding.beveragerecipetable.setImageResource(R.drawable.strawberryyogurtsmoothierecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.strawberryyogurtsmoothierecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1215, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 705, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 베리베리요거트스무디
        if (whatbeverage == "18") {
            binding.beverageimage.setImageResource(R.drawable.berryberryyogurtsmoothie)
            binding.beveragerecipetable.setImageResource(R.drawable.berryberryyogurtsmoothierecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.berryberryyogurtsmoothierecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1385, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 755, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 레드망고스무디
        if (whatbeverage == "19") {
            binding.beverageimage.setImageResource(R.drawable.redmangosmoothie)
            binding.beveragerecipetable.setImageResource(R.drawable.redmangosmoothierecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.redmangosmoothierecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1550, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 840, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 생딸기주스
        if (whatbeverage == "20") {
            binding.beverageimage.setImageResource(R.drawable.plainstrawberryjuice)
            binding.beveragerecipetable.setImageResource(R.drawable.plainstrawberryjuicerecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.plainstrawberryjuicerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1585, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 715, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 사발식혜
        if (whatbeverage == "21") {
            binding.beverageimage.setImageResource(R.drawable.sabalsikhye)
            binding.beveragerecipetable.setImageResource(R.drawable.sabalsikhyerecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.sabalsikhyerecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 착즙주스 4종
        if (whatbeverage == "22") {
            binding.beverageimage.setImageResource(R.drawable.juicefour)
            binding.beveragerecipetable.setImageResource(R.drawable.juicefourrecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.juicefourrecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 750, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 첵스초코스노우라떼
        if (whatbeverage == "23") {
            binding.beverageimage.setImageResource(R.drawable.chekschocosnowlatte)
            binding.beveragerecipetable.setImageResource(R.drawable.chekschocosnowlatterecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.chekschocosnowlatterecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2170, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 525, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 핫초코/아이스초코
        if (whatbeverage == "24") {
            binding.beverageimage.setImageResource(R.drawable.hoticechoco)
            binding.beveragerecipetable.setImageResource(R.drawable.hoticechocorecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.hoticechocorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2690, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1340, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 그린티라떼
        if (whatbeverage == "25") {
            binding.beverageimage.setImageResource(R.drawable.greentealatte)
            binding.beveragerecipetable.setImageResource(R.drawable.greentealatterecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.greentealatterecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2115, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1050, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 딸기라떼
        if (whatbeverage == "26") {
            binding.beverageimage.setImageResource(R.drawable.strawberrylatte)
            binding.beveragerecipetable.setImageResource(R.drawable.strawberrylatterecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.strawberrylatterecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1900, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1035, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 미숫가루라떼
        if (whatbeverage == "27") {
            binding.beverageimage.setImageResource(R.drawable.mixedgrainpowderlatte)
            binding.beveragerecipetable.setImageResource(R.drawable.mixedgrainpowderlatterecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.mixedgrainpowderlatterecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 950, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 445, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 아메리카노
        if (whatbeverage == "28") {
            binding.beverageimage.setImageResource(R.drawable.americano)
            binding.beveragerecipetable.setImageResource(R.drawable.americanorecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.americanorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 925, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 685, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 아메리카노 벤티
        if (whatbeverage == "29") {
            binding.beverageimage.setImageResource(R.drawable.americanoventi)
            binding.beveragerecipetable.setImageResource(R.drawable.americanoventirecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.americanoventirecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1050, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 685, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 카페라떼
        if (whatbeverage == "30") {
            binding.beverageimage.setImageResource(R.drawable.cafelatte)
            binding.beveragerecipetable.setImageResource(R.drawable.cafelatterecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.cafelatterecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 975, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 685, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 바닐라라떼
        if (whatbeverage == "31") {
            binding.beverageimage.setImageResource(R.drawable.vanlialatte)
            binding.beveragerecipetable.setImageResource(R.drawable.vanlialatterecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.vanlialatterecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 950, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 865, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 카페모카
        if (whatbeverage == "32") {
            binding.beverageimage.setImageResource(R.drawable.cafemocha)
            binding.beveragerecipetable.setImageResource(R.drawable.cafemocharecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.cafemocharecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2200, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1350, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 카푸치노
        if (whatbeverage == "33") {
            binding.beverageimage.setImageResource(R.drawable.cappuccino)
            binding.beveragerecipetable.setImageResource(R.drawable.cappuccinorecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.cappuccinorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 910, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 395, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 카라멜마끼아또
        if (whatbeverage == "34") {
            binding.beverageimage.setImageResource(R.drawable.caramelmacchiato)
            binding.beveragerecipetable.setImageResource(R.drawable.caramelmacchiatorecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.caramelmacchiatorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1140, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1000, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 연유라떼
        if (whatbeverage == "35") {
            binding.beverageimage.setImageResource(R.drawable.condensedmilklatte)
            binding.beveragerecipetable.setImageResource(R.drawable.condensedmilklatterecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.condensedmilklatterecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1450, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 990, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 콜드브루아메라키노
        if (whatbeverage == "36") {
            binding.beverageimage.setImageResource(R.drawable.coldbrewamericano)
            binding.beveragerecipetable.setImageResource(R.drawable.coldbrewamericanorecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.coldbrewamericanorecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 635, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 410, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }

        // 콜드브루라떼
        if (whatbeverage == "37") {
            binding.beverageimage.setImageResource(R.drawable.coldbrewlatte)
            binding.beveragerecipetable.setImageResource(R.drawable.coldbrewlatterecipe)
            binding.beveragerecipedetail.setImageResource(R.drawable.coldbrewlatterecipedetail)
            val imageLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 575, )
            imageLayoutParams.gravity = Gravity.CENTER
            binding.beveragerecipedetail.layoutParams = imageLayoutParams
            val imageLayoutParams2 = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 410, )
            imageLayoutParams2.gravity = Gravity.CENTER
            binding.beveragerecipetable.layoutParams = imageLayoutParams2
        }
    }
}