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
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjc4/MDAxNjQ4MDIzNjYyOTEy.3Hz4b7e-jjWtyVB0mMiGfO9OtCMrucCvnOCBXwUGvrIg.vRILB8oZkfrQDrCxdn-WRn_LzMxd5OFAPiAOGi3gycYg.PNG.littlesam95/injeolmi.png?type=w580", 1),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfODUg/MDAxNjQ4MDMwNjg2MTU5.qYTmBv0n1lMi2QbSPTe05cCCeOsqiiZ8tBwR2OGN53Ig.ppmWUV65hLdkqblOyJLUeRJdUPXrfOJfyyOHW58UcxAg.PNG.littlesam95/patinjeolmi.png?type=w580", 2),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjYg/MDAxNjQ4MDIzNjYyNjEy.47R5RDt48HHUPV_HgcMDaH6Am-XPh6BjFrq1E44oPq0g.7hqOg_0r38LNwMTgojKr_fjUsKRc8i8tS0Faf4c0WqIg.PNG.littlesam95/heukimjachaltteok.png?type=w580", 3),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfOTYg/MDAxNjQ4MDIzNjYxNzY0.ImPi3SVsOAk5g13vpTy-pLWPxlzqI3xC8ZZN3DT3zN0g.FMb1XruCD3tva5K4089sjBYKS1REFPvawxQN01kGIj0g.PNG.littlesam95/cheese.png?type=w580", 4),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTM0/MDAxNjQ4MDMwNjg2NDk5.JU6tMcplLC6av3oNsAgg3wSLjBLdphmHcgmGHPBvUXsg.wR3r3zKpRvFNoiHSpc-HWfiVcrXswffPdhyvOkAq1Rcg.PNG.littlesam95/realgreentea.png?type=w580", 5),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTkz/MDAxNjQ4MDIzNjYyNDc4.-XfZdKf6LrIS4ii3IoW2Xd_2ugUCEqHDKQEQipgEqHwg.ZzrT_yXPucYrzK0AteNLzF_k2fiCjgfFIsFSDmozlgEg.PNG.littlesam95/greenteachoco.png?type=w580", 6),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjg5/MDAxNjQ4MDMwNjg2MTUz.cFg85iL3GITEeImzhxqSRHAm1ZxglCEnQ2cV5aOd6Ycg.jdzDWy8M7sBsVOj8GWOvmlQWkiOxkViHpCZCtFXaiHUg.PNG.littlesam95/oreochocomonster.png?type=w580", 7),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMzEg/MDAxNjQ4MDIzNjYyMDI0.BaoW88ZoKTXVuh6QWoPsVN6psQ40xSWn0tVqOOUQJI4g.lLLaX1PHdhST-tPG1_EJjbnOX1sPmTC7jpGcOtT8zecg.PNG.littlesam95/chocobrownie.png?type=w580", 8),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTE2/MDAxNjQ4MDMwNjg2MTM1.YMGL3_7Ldbq3QxRNh-Ar0CiIisuYepAsUJGDmnCWrWMg.A44fmjYemqWYNCUyZ0qK8GhJEjPIEU2HvoQddGai4eUg.PNG.littlesam95/mintchoco.png?type=w580", 9),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfOTAg/MDAxNjQ4MDMwNjg2NjQ1.9gVFl6Eu7kuJcgRRavYoSEotvhSveo1tWuQ73XfeeRog.bkv6ShNoe75buVgKUnfkhbWksMxu66M53MKOpd5u4NYg.PNG.littlesam95/tiramisu.png?type=w580", 10),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjU4/MDAxNjQ4MDMwNjg2NzY1.ddURlRarw0a1kP8zKdS149rxn_foD3oB6F31OGo6EKwg.baNA2ThhQm9ER910yhM-y5x9kz1w5xm9arZalVQoVhUg.PNG.littlesam95/strawberrymacaron.png?type=w580", 11),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjY1/MDAxNjQ4MDIzNjYxMjQw.IEEY7UUUS7Mv2mrinAZh9DL1Rc9XsG_tuhKE9rEjnH8g.s08sNBRVUFWouVrYv4iGYutAsjVuUEKxokyT7SnI3r8g.PNG.littlesam95/applemangocheese.png?type=w580", 12),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjgx/MDAxNjQ4MDMwNjg2MTU4.epqqkdKQM_sIImTKuSsjnKsp-n091w7yuaXTl9C5Rjcg.ILHrrcj9yX87HzfJSPz3lQ0h0tV3Cpa1LlKUf7atXEgg.PNG.littlesam95/kingmango.png?type=w580", 13),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTg0/MDAxNjQ4MDIzNjYxNDcz.dGUoKJGg-S7QdIfaxlO3XACuvO2dDhMcezqxf75xrt8g.VrfVFNwF8ibIRTzxYwMKG8wxuiCNjTfz7vbIozCdflog.PNG.littlesam95/blueberrycheese.png?type=w580", 14),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTg5/MDAxNjQ4MDIzNjYyMDM0.D0v_5xjW1k0CZn8pHznBb9XaTyhfeijX6wXt9RCD-i8g.TQRyiv72-cz8sAnYeFqpLFHPx602sPL-hrIWZCtG2_Eg.PNG.littlesam95/chikchokmonster.png?type=w580", 15),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTIx/MDAxNjQ4MDIzNjYzMjMz.Q4xOKW7tCVcN5lm7RBhC63hJqM1GnOcD969gN_unXS0g.X2hdBBi6oBpErWtM9AVyOJG3jXDrw7urhZ00hPtKxHog.PNG.littlesam95/injeolmimango.png?type=w580", 16),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTUw/MDAxNjQ4MDMwNjg2MTEz.b3Y7Z_KhXrqweUAaeNcWK24eN6xmY-xsF2sb_FSOPG8g.hIj8mf7snwjNDLHZFIyN565PBbktQMf78aeJ3vMgbvUg.PNG.littlesam95/patinjeolmimango.png?type=w580", 17),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNSAg/MDAxNjQ4MDMwNjg2NDg0.wk_8sZll3Zh8lm96xMwYMENtKw2_J0sEE7uurG-hiGEg.PvUuiRZL7kjfY91YYP2FdjY31jrZBEepIiKmVfiZlSEg.PNG.littlesam95/realtontonmelon.png?type=w580", 18),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjIg/MDAxNjQ4MDMwNjg2ODA1.EKXD-lImNsdiPjmoolseGGnHdYcfeC17ozZzQh3BviMg.uoDmsXGqnm4JxpoWnq9IEcggwDFdfEs2daE9iPyCgHMg.PNG.littlesam95/yogurtontonmelon.png?type=w580", 19),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMzUg/MDAxNjQ4MDMwNjg2NTcx.hwl-hAMQQUHR4l_nvRqfJSSlzWx3yA5u1bMy4pKWV1gg.9ZaIKVIQl8b8andaFRFG0oY6WRtpEy3eUxYuitZstTgg.PNG.littlesam95/strawberrycheesemelon.png?type=w580", 20),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjIx/MDAxNjQ4MDMwNjg2NTEy.PpUOEUJeKXtdWuBpY8BEDoyS3WCGSw0GXx5kQ795cEwg.wS_dACquvUnL1hYqNktYrO5Cx7AL02PZfUB2Nsx0wqgg.PNG.littlesam95/shinemuscatmelon.png?type=w580", 21),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjY1/MDAxNjQ4MDMwNjg2MTcz.eE9LCkKJjsq7NCo9vnYkOc03DCBNTh7MGooZpOFwdc8g.6RIXfvJVTfrIBzuvBN-fsPaRYNt1bp0cNLrtPl1IFZQg.PNG.littlesam95/plainstrawberry.png?type=w580", 22),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTUw/MDAxNjQ4MDMwNjg2NDUy.82OXe3lR0fKlmBjVQaXbBbqf5AD1dWf3rbEilqEceWog.meYfTiNeHuILztpmqKLcKCi5K-3ZBdaWSQJdpPOXWQ0g.PNG.littlesam95/premiumplainstrawberry.png?type=w580", 23),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNzkg/MDAxNjQ4MDMwNjg2MzE2.IFv0XXyHyRIOhDc7iQi0PPSySi9citVGzHvcOvofeN4g.yzof_cfkCBtF8CEsGYckgXOsG8ka78gJbMCKlIbiZJwg.PNG.littlesam95/plainyogurtstrawberry.png?type=w580", 24),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTIx/MDAxNjQ4MDMwNjg2Nzcw.pUr_7GHSNpGBdioDUd8DUBL642xjd2q4TrlwyNhFpyQg.khjto7qXdufIqiIvTGpI7aPoAuS0aVgYWIAS-JGlsgwg.PNG.littlesam95/warrplainstrawberry.png?type=w580", 25),
            SulbingRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTkg/MDAxNjQ4MDIzNjYxODkz.7mxep_by-ZzI6lsHiFAHboxcqylYk_cvDPm1e5cA-00g.1Gq-ILkZYLRfY5f2pTrD4q13ty5hfTYc74MtiWuC4GUg.PNG.littlesam95/chekschocostrawberry.png?type=w580", 26)
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