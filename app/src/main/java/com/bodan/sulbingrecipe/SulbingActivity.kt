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
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjUy/MDAxNjQ4NjMzMTc2NDE5.A_vsNWtVNuosfZ66LGTtKS5_Kr9J4NeD08GWYHKmrU4g.-ZPZlGEIeuN0nKUbUsA9YVws2lb_eRe3lGXzft77avsg.PNG.littlesam95/injeolmi.png?type=w580", 1),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTcy/MDAxNjQ4NjMzMTc2NTc0.r-N12Q6p9ttbySRlBhFVBKa1o4ISOo1DRg-0aFw4m8gg.pcS8mYO4afURH_BWkZIkJcW0Timh6sRBp-lW---owa8g.PNG.littlesam95/patinjeolmi.png?type=w580", 2),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNzYg/MDAxNjQ4NjMzMTc2NDE4.Yw9o84qveJvA0Yi3IZvylPD7F0XS4jnenyeTluDpnVAg.nhRVJDhCPUGaBZbANT2xNrPdfNk3D0JIY1K8kgFePeMg.PNG.littlesam95/heukimjachaltteok.png?type=w580", 3),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjQ1/MDAxNjQ4NjMzMTc2OTYz.sYBVWXMAeubXM19d3yo7E60cGC9AjuTevTxrEmNH4WAg.C1IcZmcjglSQ6d0q0S1qEZjjwsLnACGjSNm2VJYZf-kg.PNG.littlesam95/cheese.png?type=w580", 4),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjg2/MDAxNjQ4NjMzMTc2Njk5.lj9oOPsoEzVAib36C7gOGupheItYLPbj6VV-eIzQkpwg.jSdb2n_bHICY2GKKxf4ZcdxUkcCxl2TfqfazwHvoAIsg.PNG.littlesam95/realgreentea.png?type=w580", 5),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMzAg/MDAxNjQ4NjMzMTc2NDE3.gYsHY6RGMPcCxFYvnyMKtIR2k38ZZdF8mpJwGGvqG2sg.Kik2j1_FnJeQ8P9qTWo8kxstkutxHJZdmLFzwbz6EHwg.PNG.littlesam95/greenteachoco.png?type=w580", 6),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjI4/MDAxNjQ4NjMzMTc2NTc0.dInRN2VIUpr4A7B_88UQsDuow4VwBDKBEWL4Ve3qQmgg.imu7oX2NIxnfkSPn1B4i7rUzciivX0mMxm0Mx-4NXVYg.PNG.littlesam95/oreochocomonster.png?type=w580", 7),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTUg/MDAxNjQ4NjMzMTc2NDE3.0bntqsm7F-zinooKxGCkuA8tH-RVHgIfTmgSm2EhNJUg._fYl7U_aE1Rdox57eYbU8AdbZxhBEVDntk_GZCFrRnIg.PNG.littlesam95/chocobrownie.png?type=w580", 8),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTY1/MDAxNjQ4NjMzMTc2NTU4.OfLiEJJuaKIqNedeEiE5GO6w29PcYDVdT88mOxjUIR4g.emo7LEaDV60uoFRWR-sLj61k5Si-iFPW9OWsRsNfuBwg.PNG.littlesam95/mintchoco.png?type=w580", 9),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNDQg/MDAxNjQ4NjMzMTc2ODEz.kLgyaPNnosGOigrzCdpD-1WU3SFSnGmua9ICX4NKKu0g.RLuSLkQDDgUx14vqUJeucEjN5oe2oSmAdOlejbF2Wmwg.PNG.littlesam95/tiramisu.png?type=w580", 10),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjUw/MDAxNjQ4NjMzMTc2NzY2.5KD3SSEzhhlE2s4stVwHueyFZsAIrnNRGM4TwFgFLt4g.Gp3u_e5BMIuskbIU74iiguo-gSXpBIRfYT0C--QhVdMg.PNG.littlesam95/strawberrymacaron.png?type=w580", 11),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTk4/MDAxNjQ4NjMzMTc2OTQ1.Y8t0yB8-mitLt32fhP3XA5bwPnymxHV3FbNQASCwbi0g.ho0uXSyTH3FVwNNgIIvPmVX3EAjxYZA-BtjWrMGFXgkg.PNG.littlesam95/applemangocheese.png?type=w580", 12),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNDIg/MDAxNjQ4NjMzMTc2NTIw.e8ZKdPSeDSqwhT7qHxdV4tYU0cseRDhXW8e3iaWLuh0g.33aRY5FAlCDCx4T0lx-2wuaxsuZpmByPcM3LchFM9N4g.PNG.littlesam95/kingmango.png?type=w580", 13),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTcg/MDAxNjQ4NjMzMTc2OTYw.mILTFhc5YU0tGN3g0o80w7ziDH_QhcGbd_rtYzJ0nnkg.zRKKFdcm9OXw2amxg6pTRR_F_wvMz7DqyPNP01V1gNAg.PNG.littlesam95/blueberrycheese.png?type=w580", 14),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNiAg/MDAxNjQ4NjMzMTc2NDE3.zZjJCPbqeYaZvLhOpElThJSTHnM7IEXuYA9yyfFKj4Eg.LNIvopGb73ZUcYl8rhR8x7AN0vH1Wrp--FPTwm08q-Yg.PNG.littlesam95/chikchokmonster.png?type=w580", 15),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjc0/MDAxNjQ4NjMzMTc2NDE5.T8zlODfUWqxoQNKBVdhPPJGTiXBYlYZxmfq86ieSZBsg.aQgzbTDPX3yAGR7-3ITWc2I4DhogpCyGhHREfsklBkQg.PNG.littlesam95/injeolmimango.png?type=w580", 16),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTMw/MDAxNjQ4NjMzMTc2NTgy.6mKrOU9Ps2iM3YuYfbbqWJTr4b_ZFrSpKfacvA9_kl8g.FJuIxB63qHoGCiEMh8aVbIcyNT0HUYqRGcMzz47vX6og.PNG.littlesam95/patinjeolmimango.png?type=w580", 17),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfOTEg/MDAxNjQ4NjMzMTc2NzA0.wN9pg54wQR4V3CB3Jf2FuhXmIMGuAGy90T4WGqRVGQgg.lLnD_MmEhxR9aOtOYjmM8DQ7JR6_Ix7a7YgguSW7nC4g.PNG.littlesam95/realtontonmelon.png?type=w580", 18),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTk1/MDAxNjQ4NjMzMTc2ODQ4.JidE4qGFvbATzQn_DTHBdPW_ZarxunDJZEvheLKarO4g.W3Yxpb4HxDOKY_J5mhyalht6Qs3jGh_rimcURKihRdQg.PNG.littlesam95/yogurtontonmelon.png?type=w580", 19),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfOTMg/MDAxNjQ4NjMzMTc2NzE3.DqWbpHTvrhdVlAppkQB-moGkl4g0_C9eLgAQT12zUSAg.RRa88aj9EpDjVfBsnDwaXrN3KUu5y9650uo7_VZieCUg.PNG.littlesam95/strawberrycheesemelon.png?type=w580", 20),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfOTAg/MDAxNjQ4NjMzMTc2NzEz.aoiw3CpjWOYTuWG1BY_O-_9yyarayST9uFaJGu5mXCMg.u0epUlvfnlFiuD1YfsvJm05UI7ExhDOZi8JEnVkI2bkg.PNG.littlesam95/shinemuscatmelon.png?type=w580", 21),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMiAg/MDAxNjQ4NjMzMTc2NTgz.uae3c0_DMP-5AFjScxkkmdrFygPYKgoHGt5V53ZPNvEg.HnHke-r-zWBSk-BdB36rCgxJYTIq7C9FJLpIPQ9Y1u0g.PNG.littlesam95/plainstrawberry.png?type=w580", 22),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTg3/MDAxNjQ4NjMzMTc2Njk4.6HvMyzxFPptmkdmRZRFlO_zL1Zb9U5rw2V7rc3chTWQg.AxwlnwIo-taQbRvzNt8PfiBtFQzKKldh-udOQOXK4PUg.PNG.littlesam95/premiumplainstrawberry.png?type=w580", 23),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjk0/MDAxNjQ4NjMzMTc2NjQw.l065hKvf-wpMfQRfRUACTCf_H_TcVcsw-eZMlrf6T6Ug.a3GfXURvdKLFabiu0ZnXBxEWn3YzE2e7tt3FeNhLzkAg.PNG.littlesam95/plainyogurtstrawberry.png?type=w580", 24),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNzQg/MDAxNjQ4NjMzMTc2ODMx.ziOf3zKebwMwdTSu95opr8CliJ-fGTNNMAcvcIh4hRkg.dBpA83MMPzNlJh_yomf0Yt1Ow09bEUXoOSfUhMS4IOAg.PNG.littlesam95/warrplainstrawberry.png?type=w580", 25),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjI4/MDAxNjQ4NjMzMTc2OTY4.czEsn-ajj5wx891EM1icP1tIYhv5UGY3MkQ10KFVWI8g.cyT1uHoirJnxAt6nOqLjBKRfDTfuq_W1Vl2ZbwghRJEg.PNG.littlesam95/chekschocostrawberry.png?type=w580", 26)
        )

        rv_sulbing.layoutManager = GridLayoutManager(applicationContext, 3)
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