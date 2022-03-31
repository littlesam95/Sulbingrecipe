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
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTg3/MDAxNjQ4NjM5NTI2MzI5.ZIv55PeAjpUsc7JxqOiiUWCe4gIxbObYqVwlnWnfEsUg.-PN07G6l4y8tV7MThh19qmFPbr24IQiZdbho_waf8tUg.PNG.littlesam95/injeolmitoast.png?type=w580", 1),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTQ5/MDAxNjQ4NjM5NTI2NTIw.D1Mvfp5Ai7gHsH_Wrayg6Uka3zAL9Hu3abrWn6Ask7Ag.jHF_sGjJJPZvEMBn2LybqTCOtp85HA6StqA7EYCCwwog.PNG.littlesam95/mozzarellainjelomitoast.png?type=w580", 2),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTgw/MDAxNjQ4NjM5NTI2MTQ2.jmT48XA-_pgeYCuQqzU1OgaD1DBIwmaFZs2MU0ZaY50g.a_PbcSeNNOa4XfftWisqSe6Bnp4K0FxwZb_X4zfY7OUg.PNG.littlesam95/honeybutterbread.png?type=w580", 3),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTE4/MDAxNjQ4NjM5NTI1OTUz.fXNVloRrqdYfSzg4LVin04sUFkgFZJEYr468Kx9oHkUg.3uXKW8E7l2WRLbTf05S2hbra7oeLqfVj4n6nvGduLfAg.PNG.littlesam95/dalcompongdangkkultteok.png?type=w580", 4),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNTUg/MDAxNjQ4NjM5NTI2MzM3.qGIlS-XZrSddqeO5K5MqeZATTJqoD7ojiDGt0Jn1MyEg.jLe4SblKhWvSAfHXlNW6-hh4hod5Sj7fBnYXZyPJ-ckg.PNG.littlesam95/injeolmikkultteok.png?type=w580", 5),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjU4/MDAxNjQ4NjM5NTI2MzU0.VM9GeG2cbFHbWaWTCqdJqZep3eT1Xz3NLp3yJdqcxtEg.ERRLThvaCqu6xaWPIJ2HK94MMkWbYPVKz3u1d2tC6gwg.PNG.littlesam95/koreandanpatmeal.png?type=w580", 6),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTc0/MDAxNjQ4NjM5NTI2MTgy.SQZOVJM8P-U70UItrHW5hMoHuxvt7cdetD5up1o8VBYg.G4pyRHBcknlXoqGEmaa4Dqtaaje3coGcRO0o1YUgbPwg.PNG.littlesam95/injeolmiicecream.png?type=w580", 7),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNzUg/MDAxNjQ4NjM5NTI2NzE1.SFkJsyJLlNHrVFYiNytElL327_V-rFtn55UXwDI7yvYg.S-zijpDdNinTD0qvnG_M4HXrbGzKlM5v7VvBG_QqfQAg.PNG.littlesam95/plainwaffle.png?type=w580", 8),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTE5/MDAxNjQ4NjM5NTI2Njkx.0Bk_LTA2xTvxno9ouss_rMIi9Ixj2m58Ay9Tg0ea8PAg.p7JK4T25OyCWYo_64G5xxt1aOS_s5F9tiHVG-KlcnGYg.PNG.littlesam95/plainstrawberrywaffle.png?type=w580", 9),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjIw/MDAxNjQ4NjM5NTI2OTUy.G55owkxUCh7xy-iM6owafRNI4AE-hPIBgU2scIGjhv4g.Tv8XnoD7Hv566bd4U0ujFYWLIo4ciEY3yUCBkGmtE3wg.PNG.littlesam95/twincheesegaraetteok.png?type=w580", 10),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTYw/MDAxNjQ4NjM5NTI3MDM1.eju-5oC3CE_zj1Srj9l41o33taaHRPcNvMzOTuyXgwog.Loqprm5XRgDKukqvndjk3q1tcbyeIVNmxWoJdHUEC24g.PNG.littlesam95/twincheesegaraetteokbokki.png?type=w580", 11),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNTcg/MDAxNjQ4NjM5NTI3MDYw.TqLMWm2I1wjjFPXOCu_8cMj52hYponilD8DG7MiyeQQg.E9YDuKFXDo72bmeky9iIv4Oqa6MycEb933e4bqhmai0g.PNG.littlesam95/barbarincreamchuros.png?type=w580", 12),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNTAg/MDAxNjQ4NjM5NTI2MTM4.Q-2vIm39nG0cZgxR-AQZFcHzhtSg1tylEWb4WlmSZw4g.NNaJg7CRugYPJ9z56Y2JGzE3PyLtxnvyCRiuioEYPnwg.PNG.littlesam95/deepchocochuros.png?type=w580", 13),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMzUg/MDAxNjQ4NjM5NTI2NzMw.C-gQkIdP2F-RTzZ9-3hLlY8_J6q0M1Hv28TGcidXTP0g.syaXTq5eZL45qyNkWy-i97cnE8FkHJqjcqd88NGGKjIg.PNG.littlesam95/premiumstrawberrymacaroin.png?type=w580", 14),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNTEg/MDAxNjQ4NjM5NTI2NTQy.B4zGkpSS5bJPVGDoauA0C1dNv2fl8buNK5oXLPHO8bEg.hFQDOzdx2Or9H3hr5Y3CoGoQCO1AbEV5brac40Dd1CEg.PNG.littlesam95/plainstrawberrychapsaltteok.png?type=w580", 15),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjU1/MDAxNjQ4NjM5NTI2NTI0.cZpAgYiaoS5F8mAxpplQLKtF-mm3EV570uudD15zICUg.VYdhcSn0SZl8DhfzWXGwJkpeosK5y2sF53xxZwSgkHwg.PNG.littlesam95/onemouthfishbread.png?type=w580", 16),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfODYg/MDAxNjQ4NjM5NTI2ODE4.NMNhOeN_c-PCaCf-iS55KRr0725GTFIoYAzBt5E8Zycg.XbXnGTebG-XMK1auF1fLtT9DOUHGogi0481yVUxpaxUg.PNG.littlesam95/strawberrycheesecake.png?type=w580", 17),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMzUg/MDAxNjQ4NjM5NTI2ODg2.nyNNfYaCRqd39FT8yLEmfGd3i7blSFRO4kJOqxgxGE4g.jyIz1GajptMSJYHEjBqxfAY9W4u_-tEZz3DzW_VsJFsg.PNG.littlesam95/tiremisucake.png?type=w580", 18),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMzkg/MDAxNjQ4NjM5NTI2MzQy.oecEeiCvuPCAoq0GzwoVyHu4nqOFyBB8JNLE3lJSQecg.RMCt6bG-ktwQuz12dKplUzFsthL4_ruTB794J8-pXegg.PNG.littlesam95/kkulhotteok.png?type=w580", 19),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTEz/MDAxNjQ4NjM5NTI2MzIx.5oIJ8SGnRKq6f0a65HbAeSckiZmdrCbSpR4MwlJ0AxAg.9TDic2tU5DsuJYLw7ZqitUr8a--7Z5GCoZayRaPtk-0g.PNG.littlesam95/injeolmikkulhotteok.png?type=w580", 20),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjI1/MDAxNjQ4NjM5NTI2NTM1.6kR8X5wJUKXiOGLYQS57l7C_-qbTywhP80B9YyQimXIg.jNwxOl2N_EsIaEZfqNhBhUvfhORyWWzMDvp8bXGQKRIg.PNG.littlesam95/plaincroffle.png?type=w580", 21),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjQ3/MDAxNjQ4NjM5NTI2MTU1.N3-QDRtPEzoBajAaCtYwLXlxAtIzOiFMd1hBN4B_8Mog.amGrbW37C7ZpeiuVyhHtTDvQQLMHqA8u1wYal04B344g.PNG.littlesam95/injelomicroffle.png?type=w580", 22),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTc3/MDAxNjQ4NjM5NTI2Njkx.MZF_WuGt1JsX_bxVFK7x4rRGb2jDkLbH-jNzgQ9XNJsg.JVCVcNCV6TRusGqxi78G3FTPnSp_i2xc2d0DN6pzHqwg.PNG.littlesam95/plainstrawberrycroffle.png?type=w580", 23),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTEy/MDAxNjQ4NjM5NTI1OTU0.6tbHBCo6otzP3dmMXHawJnho7-WylSKNs1NnIF5CdVcg.FpGw9HBBkY7foLrEUBcnbgcO3b6LGO2FykWEa3i_gYcg.PNG.littlesam95/chococroffle.png?type=w580", 24),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNzIg/MDAxNjQ4NjM5NTI1OTUx.Zi7SNH5WyoBflJ6lcDU_A2CD0KI5zws6EsX08wi3Cocg.v7lnVbBA7vpHIujiRzg-U_1br43KHHxaxnEdPkKlUFog.PNG.littlesam95/cheesecroffle.png?type=w580", 25),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTg1/MDAxNjQ4NjM5NTI1OTUy.lE8kWSgoPPy9g_sqyfZSGhcZ1hy4H0sND2iiLt-HkrYg.FMhSdY62VEnXrMOnxoWvBEFcSUID00WhAzeIIfFO__Ag.PNG.littlesam95/chikchokcroffle.png?type=w580", 26),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNDQg/MDAxNjQ4NjM5NTI2NDk5.XaJQcQovWazh94evW4a6-cWU0XyONHcp3EV4UWDGI6Ag.2eydg3O57lALcv4Ks-nQ_biX_6RpR1xU97HfG1zCieQg.PNG.littlesam95/mintchococroffle.png?type=w580", 27),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNzgg/MDAxNjQ4NjM5NTI2Mzgx.8Gwek872vgwNAZRVg0KGc3jBZrJE9_5d5v0FKxa7cOAg.hc7yNC3CK_05YSlkvtfHTpw50QqCQw1-b3Bg_341XE0g.PNG.littlesam95/maecomtteokbokki.png?type=w580", 28),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNTYg/MDAxNjQ4NjM5NTI2Nzg2.OUj3Vyu9V9etSWaCTKE-2Xt6vZpx8g0QfArQn8UVegYg.ZTgbNkCpGQHWXX5VZ7Mli40m4CiV9wwfCLUZ68wmyH8g.PNG.littlesam95/rosetteokbokki.png?type=w580", 29),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzFfMTI3/MDAxNjQ4NzA1NDk2MTE5.M_E_ycJjMguneAZ9Nf17LK9VJi8H8ZEZbHgx72ZCbZQg.l0WC7xYbVEkryZcQL-oeYq3sc_fbHd91_FnH5uq_Aiwg.PNG.littlesam95/baconcreamspaghetti.png?type=w580", 30),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfOTAg/MDAxNjQ4NjM5NTI3MTAw.xQvC7CgGdlsqyEULnoXSoakyb2U50-NGZDO_RmiGzAUg.vufTu0gieVeHeeooE5VrRJoZOTIIpWyQMnlG6wbNfCAg.PNG.littlesam95/bansukkimchibokkeumbap.png?type=w580", 31),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjYw/MDAxNjQ4NjM5NTI2OTE4.iEXUfiVHjW9UvMRJUVy-ztT5_7-M-s8EVlW7FTB40xgg.YmfoFHkI1wDiRPPi6yyFtdvQYNTeMOzqBpttRZpsLkQg.PNG.littlesam95/tontonshrimpbokkeumbap.png?type=w580", 32),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjEz/MDAxNjQ4NjM5NTI2MTQz.unA3M0Lkyfoz61iA8jCDV1XUXU5NMPe6QBwbxX-AAP0g.8bkY77_Nu1f62NkXrxYgoDRj4IgZyV3SILaPaf3SRVMg.PNG.littlesam95/grilledfishonigiri.png?type=w580", 33),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTE0/MDAxNjQ4NjM5NTI2ODY3.thge9lzSb4oBnW2zeUa6OmtCI22A8TelQvR4xdL3BNgg.V_giOwS1V7sIJf2aQlKI7L78bCGrSRlgFUqq16UUMFMg.PNG.littlesam95/sweetpotatopizza.png?type=w580", 34),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMzEg/MDAxNjQ4NjM5NTI1OTU0.YNj0nsWUGIzW9wII5r2B4KgLXXWHpi0JShk2qacHUf4g.kX7GuOmYfc8Hs4qmAXGoRblJvn1C1wA-09xfl5DmrFsg.PNG.littlesam95/cheesetteokbokkipizza.png?type=w580", 35),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTE4/MDAxNjQ4NjM5NTI2MTUw.2_-ctA3tlh3TlCh0IOQWXUDVlSJI-V-iRo5-Ag6e9Ogg.35SoZBlAbXqRSYtx_1tzRclRLBEeQaW2BwnfzygZdy0g.PNG.littlesam95/hotdogpongdangcheesetteokbokki.png?type=w580", 36),
            DessertRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNTUg/MDAxNjQ4NjM5NTI1OTUx.wPExthqBygMna28l-qPwjI4-mpim0L5YQYtRDKwkuKMg.ssGglXdMstwsFaO-JukBOdJjarnpwoRTw7Pj_h2z898g.PNG.littlesam95/chalhotdog.png?type=w580", 37)
        )

        rv_dessert.layoutManager = GridLayoutManager(applicationContext, 3)
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