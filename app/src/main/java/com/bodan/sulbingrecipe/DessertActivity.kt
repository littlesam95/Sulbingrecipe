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
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjQz/MDAxNjQ4MDIzNjYzMzU1.RnrcrY8-ebB-ipPsKeRKWgQzUjlYrFXVruTG2X_JFdsg.XHG9GZ2wWEtml3WJrFGdWDFBuoL7fMAQngMlBH-Ho_Qg.PNG.littlesam95/injeolmitoast.png?type=w580", 1),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjkg/MDAxNjQ4MDMwMDM4MjE0.ACWOmlE1fStHdRvf5FqlL0SCSo-OXOjSrXkvMmHt1Aog.1kXYprqWmrlP0ism3wMSQIUl5VFV4wNbstLVSOM78hUg.PNG.littlesam95/mozzarellainjeolmitoast.png?type=w580", 2),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjM0/MDAxNjQ4MDIzNjYyNjcx.8Z7v-Sv-Mv1VW82Vch1Wdu_o7FsXPQI2HQGkeofDi5Ag.AN35lpolsq0a8fB9EieM53PhIZW0PAtNRuqroK7-BM4g.PNG.littlesam95/honeybutterbread.png?type=w580", 3),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjUy/MDAxNjQ4MDIzNjYyMzMw.vQaF4TW62XDKu22AdXBcq-JQlRTtzbyq1jzfxjdPXMYg.e0IwQBz7BEIjf73CCnxmv5-zENQF4vmsYvl7pGO6N_Ig.PNG.littlesam95/dalcompongdangkkultteok.png?type=w580", 4),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTkx/MDAxNjQ4MDIzNjYzMTE2.CudKDkL6ZqSe4SsrhHMl530V1UziwSx8DCGEy8agUi8g.YYNlgk02ch_kDB7i0nFyIF4oqEXf5PAYOymhpljdw7wg.PNG.littlesam95/injeolmikultteok.png?type=w580", 5),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjg1/MDAxNjQ4MDIzNjYzNDky.EJ_zMr93kr00eQY4GdxK0ScWhXHWAelWU0GQXUpuBUkg.KPiokBCrdpO1OAeZx4rJUujEvcbMvO34xkvsWnR65a4g.PNG.littlesam95/koreanbigdanpatmeal.png?type=w580", 6),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjYx/MDAxNjQ4MDIzNjYzMDQy.JG_O8UWxJafdKLKdHbz70J7uGCkGtwStcKBlpaekkTYg.LKqJ9s0ey5q-nj1Dyu9N4zWuDx6jQ9EAkDO5UzbU1esg.PNG.littlesam95/injeolmiicecream.png?type=w580", 7),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTM2/MDAxNjQ4MDMwMDM4NDE2.96Ke_nPgcqIA4dAGfEoJUz4RDt1mMPr8bzxXeC2G-uUg.daiQ6-mrRZE1vimT5j3ZxmZ9ciHaL1kcuatTl3lreOog.PNG.littlesam95/plainwaffle.png?type=w580", 8),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNzQg/MDAxNjQ4MDMwMDM4MDgy.r44ymB5ZpaYZdToIMT2kbLZw9Ipj9INCNpfqwoQs5Ugg.QTSMMe2cht_sxRfAH-nXHd4x9RCx1uRoblleSkWgck0g.PNG.littlesam95/plainstrawberrywaffle.png?type=w580", 9),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjI3/MDAxNjQ4MDMwMDM4ODIz.MO2_0t7d6MtbTEAPxmLosigHRDvpoZ85hdVMEerv0x8g.nZjGlQXfMqJLHdDrKAyTXYaqmMkl1uIhoxT8ORBEi0wg.PNG.littlesam95/twincheesegaraetteok.png?type=w580", 10),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTk4/MDAxNjQ4MDMwMDM4OTky.pF96iMqbr1kHvo54GYxYDaTK-9w5kPPJLZQW2kLWy2og.dDwwzADBn-Uy6VAQnp0e2KKC3c9eFwDEa4FT27fKA2Yg.PNG.littlesam95/twincheesegaraetteokbokki.png?type=w580", 11),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjQ0/MDAxNjQ4MDIzNjYxMjI3.6Dh2S-ksjauxYk0w2ofM9j6i2XHnVyKUFjih9GY9UUsg.y_2sYdzOPtBQL5McxeTp-xvpVsm2kFe3OMagTNN6ZeMg.PNG.littlesam95/barbariancreamchuros.png?type=w580", 12),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjIx/MDAxNjQ4MDIzNjYyMjg2.18RjMklopK00nS3kCPfV04IqCIuQ8nVCuyp4mbxjTsIg.4Nu5iDp4ipI6Xgw4Tonz6AEAQaYe6lm6uUuRmw-C1Ygg.PNG.littlesam95/deepchocochuros.png?type=w580", 13),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTI1/MDAxNjQ4MDMwMDM4NDA4.4XWGXm9EGABa_nuFNtDGwLfyuuFnrEeVUOY1symY8RIg.b2DD4sc1f1A8Mcbkvg9cIspp9gbapDLM-4sZEzI-XH4g.PNG.littlesam95/premiumstrawberrymacaron.png?type=w580", 14),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNTcg/MDAxNjQ4MDMwMDM3ODcw.Q4E1eWB6dno_IRKwqgqqZINNuNru3AQl3zCm-D4YvKQg.9ed1AGiTX2hnfHNTNnlHBvDooSycA5fVDYQZri67epwg.PNG.littlesam95/plainstrawberrychapsaltteok.png?type=w580", 15),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMzQg/MDAxNjQ4MDMwMDM4MTIw.y8SjiNmB1CnegNb_lmG9Qbt9bWcxkwBX6EeGMI6cwK4g.SILq1SYPTy3D1_MvQo_WKAfRT8qOUxO33QSaA94iTwYg.PNG.littlesam95/onemouthfishbread.png?type=w580", 16),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNyAg/MDAxNjQ4MDMwMDM4NTcz.0Z8H4M45Utqp4I-HcKwu16tKPo0hEvGKEHfKrJfIej4g.3_TlovgOy8wVL9OpHL_b4Z4-9M9IDER9MEUvMewYuh4g.PNG.littlesam95/strawberrycheesecake.png?type=w580", 17),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjU0/MDAxNjQ4MDMwMDM4NTgz.YBVsNHrut7OQNX-t7ee2V4FPKW7bC3zpbbyPTRvfZtQg.QmirCdiJltZMU4y2ewg_8mQR5uqih4SxnKxTn8NNci0g.PNG.littlesam95/tiramisucake.png?type=w580", 18),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfOTIg/MDAxNjQ4MDMwMjI3NTcy.TjRIS0SLKJsiAaDhoXkEkiHYLMiY2Eu-0QbCGlVgL1Ug.wnVs9IdzQq0DR9Z21yrq5PCQ9umLEa9TId535bwdSdEg.PNG.littlesam95/kkulhotteok.png?type=w580", 19),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTcg/MDAxNjQ4MDIzNjYzMDky.vzjcLmxRRjcjBTyu6rQkOFlitDwfwgl90_mFBqD_Fsgg.oQY1ZqNePwHXkqJRe8DZFNcO9nqAjgaFFalsL34GHzcg.PNG.littlesam95/injeolmikkulhotteok.png?type=w580", 20),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTA1/MDAxNjQ4MDMwMDM4MTE0.ZZaFn3VTzppFu3UGUhPyqew2UTsxYBJAmSlNy0GJUyAg.e7iop7NeYVob_zrMyzhHGzxynr5erIBorSqOcB-OZ24g.PNG.littlesam95/plaincroffle.png?type=w580", 21),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTE5/MDAxNjQ4MDIzNjYyOTcz.AW79MrtYRnB8qOt18B-yyRTTdgkZsEH8yoAvV6CYhkcg.ZRVugnGMKusxmiykO-8_Xb82UHUzNNwccIdLI4p-IRkg.PNG.littlesam95/injeolmicroffle.png?type=w580", 22),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfOCAg/MDAxNjQ4MDMwMDM4MTg2.m0Eb0y0hVUu4rlPrGUdkWI7oSPB2N8knft-gW94muKUg.DTE4fTU_wLKL0w3B6VLqeomOlYtZVR7_kbOMTgDBtvUg.PNG.littlesam95/plainstrawberrycroffle.png?type=w580", 23),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfODEg/MDAxNjQ4MDIzNjYyMDE1.XWRyxSkqnA2l04b8S57TNRx3inD5yjFL8sZmN6qadIMg.zmPCiIpfihHCO4x1twgmehWori-I3Bl6ARXiMsSMqJsg.PNG.littlesam95/chococroffle.png?type=w580", 24),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTk4/MDAxNjQ4MDIzNjYxNzM4._-b8TXcYxqIbZl6hpvuFyjvhEvT2Jau6j0DzyC4UQvMg.xaY_MT-L7dunmZjU4R7uC30AVqTdjuuhNpT_hfLJFQcg.PNG.littlesam95/cheesecroffle.png?type=w580", 25),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfOTUg/MDAxNjQ4MDIzNjYxOTc3.11M-R8I4U8IT46ejf-YO9FZDRG5VoG93m5H1xJ4KrXkg.4ptRhwnk-2QUXJMHzxEO2Nm_ay6aIa6zUvsIUKsmD-wg.PNG.littlesam95/chikchokcroffle.png?type=w580", 26),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNjMg/MDAxNjQ4MDMwMDM3NzY0.nlgwfQguTcucBjngeWOhlfZs_dYwOqTMH8rZjtj0pUkg.KxJHe_z4UToO1bdFMNPe5ClMXQ2zejnPSUjqY2WjQIMg.PNG.littlesam95/mintchococroffle.png?type=w580", 27),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjM1/MDAxNjQ4MDMwMDM4OTk3.z5ihUb7Fw-BelT5cWcoIgAfc50xeRdHJ2BMHC-G_YX8g.Td9FAN9Si6tr9VIPwPWbjjCZhq8OoQq4ViTCHEk77wUg.PNG.littlesam95/maecomtteokbokki.png?type=w580", 28),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNTQg/MDAxNjQ4MDMwMDM4NTY4.l0vkI64NDpeBwEEXSZWUU268y1oMm_P9kxylxfWZi6kg.GII0qbG8Ba_vb7xFCzDww8Rp59UR-ZpqJiL29lE0P3Ig.PNG.littlesam95/rosetteokbokki.png?type=w580", 29),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTMx/MDAxNjQ4MDIzNjYxMjQy.yRt6fAwkgCsJbf3nY9RfFFrT4HHTngfPnhp9hA1df64g.aCwEdRMJ-4ydFLOSM-tr8INgRITyLYG3UJMgWotAW10g.PNG.littlesam95/baconcreamspaghetti.png?type=w580", 30),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjg3/MDAxNjQ4MDIzNjYxMjI3.yLN02AyFVIAljJzgRkl_eHsVZCnPdBC35TSjhy-i_fog.7pdEfbWKEFTJ2WaOW06wMagDRhRoQ4PdDEVgHgvDb9Ag.PNG.littlesam95/bansukkimchibokkeumbap.png?type=w580", 31),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTk1/MDAxNjQ4MDMwMDM4NzAx.WLoKYIsmn6m0T6TcgbXx7PMshNR6K5v2G2pITibv8twg.2e5KQ7qm3lpPd6INOiNKy0ZKR8FwXYXOIJk0FsW4-RIg.PNG.littlesam95/tontonshrimpbokkeumbap.png?type=w580", 32),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjE2/MDAxNjQ4MDIzNjYyNTgw.GC0jPWygeYGjUY9RYZdewqEVAoOsTEG0eGgMqklgH5Qg.-TBFhzS1YHtRzgFk69Z6tUmdyFnw49Jkn9k-PHqu1jog.PNG.littlesam95/grilledtunaonigiri.png?type=w580", 33),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTEg/MDAxNjQ4MDMwMDM4NjE3.tIko1x9swmSL5IprOwsFYItTHA8LO2LgLzM5VJdz42Mg.GRVIH4755ti5N67m1PB-YEj_q4zqmqaPxHvJcBtYzdQg.PNG.littlesam95/sweetpotatopizza.png?type=w580", 34),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjMy/MDAxNjQ4MDIzNjYxNzgy.jfva4jejQW4oE75NTb8dfvszL7B_Pybf1INrqhQv1PAg.hXuCi7ODGpw5-Bc_a6Ny0MMo89FwJ5hGdcCwCysnPqcg.PNG.littlesam95/cheesetteokbokkipizza.png?type=w580", 35),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNDUg/MDAxNjQ4MDIzNjYyODE4.wXII60zP3Sivp2J-vlUXkgv79B5T12nMbVtLABogfZUg.OS6G2lAbfL0XOzQW6goHaAOQs4UOKQcEYtALl0fIaUAg.PNG.littlesam95/hotdogpongdangcheesetteokbokki.png?type=w580", 36),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjA2/MDAxNjQ4MDIzNjYxNjk5.AyMToiMcZr5oK1NW9WuLQg4cTK7hQ2gg6CtlrmUg-DMg.sY5t70qMt1jw8LLXJ2maVioEop5JF7eMgX8ND9RZo4gg.PNG.littlesam95/chalhotdog.png?type=w580", 37)
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