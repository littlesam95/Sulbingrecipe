package com.bodan.sulbingrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bodan.sulbingrecipe.databinding.ActivityBeverageBinding
import kotlinx.android.synthetic.main.activity_beverage.*
import com.bumptech.glide.Glide

class BeverageActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding : ActivityBeverageBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰 바인딩
        mBinding = ActivityBeverageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val beverageList = arrayListOf(
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjI1/MDAxNjQ4MDIzNjg1MTUy.o12ll_oHeQrIGOoI-1Vz6ceP64N-6iG0cDdtkN2mtRMg.6ibVGubUqLXBLJeW5AEpBchFd1EGgKyJzT8nXuTkz24g.PNG.littlesam95/sangsanglemontea.png?type=w580", 1),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTcx/MDAxNjQ4MDI1NTk5ODIy.B0sDlcLzOhdBQKMnLrMaCJkifBrE1q1vmRyp23eriIwg.Vk031upkqfmzYEoCzRTtRPA_CDFHHE9dNJldcKkt1-Qg.PNG.littlesam95/tontonyuzatea.png?type=w580", 2),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjk5/MDAxNjQ4MDIzNjYyMzYw.PYs9SMnI5b5jPfYzal4VYswMSJ7Jho0wHwzbjjUGZ3Yg.mQT_g9El490bNF2if6dXEoYOSh4nGfuuuHZnPU95k7Eg.PNG.littlesam95/deepsanggangtea.png?type=w580", 3),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjYx/MDAxNjQ4MDIzNjYyMzM1.7phBjHAeep3vrLMvKcrC2vEOt4pduSnNxgNRxSTAzccg.cTQvwDCEMP6jRa4tLtlio2PZ8Yp7aJ3InqpvwU4dnW4g.PNG.littlesam95/deepdaechutea.png?type=w580", 4),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNzgg/MDAxNjQ4MDI1NjMyMDI5.oJlmTWwY6p5b5ob-mPmXjSC0koDMzoGnx4E1jGcMMDEg.uhUzOFVf2G9Pyy0rkGLT_lWIdZXbG79M8k3C5uPFsaUg.PNG.littlesam95/peachicetea.png?type=w580", 5),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfODAg/MDAxNjQ4MDIzNjYyNzMw.HdmUwt4Pm-KDA6fOs0eED6LarqAmJhJt9PNkhAJqZQgg.eNIMi_QDMszCQThxvmqWLfQ0Oe-Gn-2TQNH2LPvjx24g.PNG.littlesam95/honeygrapefruittea.png?type=w580", 6),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjYw/MDAxNjQ4MDI1NjMyMDMy.9ii0mRmEmQB10s5dKhEmfUNOPHT6MdHHjRJGz6JMPHgg.isR-gv14RXBVqggg1oWSicXcVF9mczV0cdICX8ciuLIg.PNG.littlesam95/raspberryomitea.png?type=w580", 7),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjkz/MDAxNjQ4MDI1NTk5ODI0.kHiDQyfSlcWgk8b-lz8UIic3W5SjElQoM-kkKlUjVk8g.oPCXwMvMg8vDoDHVMoHRuqQT3kwJETdvYAlDyy057_8g.PNG.littlesam95/teabagteaeight.png?type=w580", 8),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTA5/MDAxNjQ4MDI1NjAwMDM3.4HNuID2ZVAEf25WFvPqg1Vw8bbahBGAXVgU78crCFqEg.iCiwyBOLRObUqOO7n4dXLr8YQRKnVj5RfWZH-coiZtsg.PNG.littlesam95/sangsanglemonade.png?type=w580", 9),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTUy/MDAxNjQ4MDIzNjYyNjkx.8-M8HBFWwZ9dwEVve4Dw4Ig__sahDaL15UER0qAI5Lkg.ytk8RPwHEAlL7DafZcKzliGEstewrqCyJHN2mmijCpcg.PNG.littlesam95/honeygrapefruitade.png?type=w580", 10),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTEw/MDAxNjQ4MDIzNjYxMjIz.vIPW3o92b4ML6aN0OBR58oRXhVK0_pDMUtxoKV-jRLsg.sugMAMMP0AtoXh401WpBeGw0B1BDvI5ZJFOBsDNVRGog.PNG.littlesam95/applemangoade.png?type=w580", 11),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMzIg/MDAxNjQ4MDI1NjAwMDA4.y0fpSoMaEviQJHPJQXPUati_j4JLS5c3FYJuIeCkzqUg.A5hvvBqCbrCPFTWuiEwz0z99RA30pjajG6zvLV8Ym8og.PNG.littlesam95/redmangoade.png?type=w580", 12),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNzEg/MDAxNjQ4MDI1NTk5ODI0.NOxv29-IkauQp2NA0Q5IMkpwAdJXLtIl39l2U8DwLOog.sE12xLH8am-WdvsVqvtTmn-01mG9MUVgpGp2RF4OGlUg.PNG.littlesam95/strawberryade.png?type=w580", 13),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMzAw/MDAxNjQ4MDIzNjYyNDM2.PJRdBbZ286vyz_ahwwc9H3YNpOkxDuIoPIV2sOC8IUsg.jUqCxjdEgrIi6ozdDBY5UKbk0tn0gUjx6NXwcq_etFQg.PNG.littlesam95/greengrapeade.png?type=w580", 14),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjEz/MDAxNjQ4MDI1NjMyMDIx.KghANIw20JZGDlIzOCShhcVjPpAlFb_uWo7BMdyYjYIg.eiE-cpmvOTqn8gqGAoQheWIgLax-iZIG4e17ax4It-gg.PNG.littlesam95/plainyogurtsmoothie.png?type=w580", 15),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNzIg/MDAxNjQ4MDIzNjYxNDM4.EW9CvmRgzOl95TXyvQrBjMjKrz4Uaze_t23RbMgE3PQg.7P8hQepVz2q7gfuC20hyPJfs9gbD8nlvf0NpQT3Sedsg.PNG.littlesam95/blueberryyogurtsmoothie.png?type=w580", 16),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMzcg/MDAxNjQ4MDI2MDE3NDk4.mOJeuqzU_vWDcr04Q4pG7jCX-ywyAvgVeOKqgbqxSZsg.rrQj3TBZE49dWp_yntNE8l1HqvAvLA0pXAflCE-Yvhgg.PNG.littlesam95/strawberryyogurtsmoothie.png?type=w580", 17),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTcw/MDAxNjQ4MDIzNjYxMjIw.73Durfd6cgEYNgC_CBcGmgY9XWgPaUhROe0M3DtEr1sg.-Xp1dShsz1Q1lvdChFLaizjaM-pnaw68PbBaMAaZI34g.PNG.littlesam95/berryberryyogurtsmoothie.png?type=w580", 18),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjQ1/MDAxNjQ4MDI1NjAwMDEx.WOFyQvG598RHoomcZu8YjZ0wro4NFSRvK1E1GKjz4R8g.lm6IZbJGp7v8CUWQ7SQ5lvp8ePcFzvcK17KFMppX4SMg.PNG.littlesam95/redmangosmoothie.png?type=w580", 19),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjkz/MDAxNjQ4MDI1NjMyMDMw.05fVNjOdiW6TWNqmQyYCY5yC_xJlnDzTHf57JwFHA8Mg.lg9WIoO1GXcnFQvBxyD6PH4JQQdq2H0il2zvEZoAyZ8g.PNG.littlesam95/plainstrawberryjuice.png?type=w580", 20),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNzkg/MDAxNjQ4MDI1NjAwMDE1.HSmbNX4Ib4n_BBR67wGKLcYBiwujuar_xj9VL_3o5jsg.aYy5xaEpbagmBh2gMiZdKNJSnDBLPXdXMEnos8g59CYg.PNG.littlesam95/sabalsikhye.png?type=w580", 21),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMyAg/MDAxNjQ4MDIzNjYzMzgw.CqoVT7mf-dXbKf87UCAMFcSiD4GS5RV6BEbPvGFs-k8g.b6TwyFwvGE2-uWqy7_ezZ0yk2kMeugyiPc6NEyLZGBwg.PNG.littlesam95/juicefour.png?type=w580", 22),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTcw/MDAxNjQ4MDIzNjYxNzc5.s6LfAel1cRI3CpOXlCanez-UVxBzK4VXqX5ZVUtc2rQg.HW1j6ftYkH0nCBsK1LVK-ac7tKDVjTENU1skjfMMktAg.PNG.littlesam95/chekschocosnowlatte.png?type=w580", 23),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTg1/MDAxNjQ4MDIzNjYyODU4.kSPgL5W6rwsSnzJq4rJPm73DqTKHBr8P-_6-3no5tIUg.S81KSdPEB1H9hduqwTaDwCsGYmuTxptpQLT-PSE0Alog.PNG.littlesam95/hoticechoco.png?type=w580", 24),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjMy/MDAxNjQ4MDIzNjYyNTI2.YzC6YS3NC_bmEwjXZEN0e1H7O3bRpWc4ZnVtAFalhgcg.wbFFOncmbieZ1jPilMiMK9igZZhnbIJf5KPH1zQMXA8g.PNG.littlesam95/greentealatte.png?type=w580", 25),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjg1/MDAxNjQ4MDI1NTk5ODIx.hg7AOIutMfJav115f5PcheNBbVSOGlBKVLl1hJWtbKUg._WtOj0UXqIPll_5UtOYxCjsPNE8klQ66y1t8Dskex-kg.PNG.littlesam95/strawberrylatte.png?type=w580", 26),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjUz/MDAxNjQ4MDI1NjMyMDI0.yUr6s3VWXOjEqbe5ZTXNCMwHZ47mLUmpSeeP0NEazx4g.XovKorKnqh0uCPk0pZZZhuT1ZqJMg5VX2XowpH-cEM8g.PNG.littlesam95/mixedgrainpowderlatte.png?type=w580", 27),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMzkg/MDAxNjQ4MDI2MjA1NDM4.xbLBC6YXBhfculW4OxKmXOCm3mIR_7hi16qojpxnPl8g.GJIDkL5QfHONxSfuu8PUvYMXhUHkHXdO2n2GIOiR_9Mg.PNG.littlesam95/americano.png?type=w580", 28),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTMy/MDAxNjQ4MDI2MjA1NDEy.zc1mFICtr5YLwFqxGAV9AqCMJiynXZgOmM5kCBuWx0gg.5Y7vVEHj8iEZ5s3CZDkVJOV36c1uMLuJYOUR7LOSRpkg.PNG.littlesam95/americanoventi.png?type=w580", 29),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjc1/MDAxNjQ4MDIzNjYxNDU3.tLbovgdDuJ96Dz5k09w27lymswKmkD6JstDM-tASuKYg.NJL93lmmAlPcNWnT4HyKy44X7rfHXSiwZboLPayjIcYg.PNG.littlesam95/cafelatte.png?type=w580", 30),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTg0/MDAxNjQ4MDI1NTk5ODE5.nRBxpOhq1sZLNRelrzVbknBGb59u2KqGdIJViAmBbo8g.8xiwmS1fHJCUHAbq0mH4meJBOdrHhIQNpgrSq3R20Xsg.PNG.littlesam95/vanlialatte.png?type=w580", 31),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTM1/MDAxNjQ4MDIzNjYxNDc3.aIPTf4jpsKLaQK4c6NBfDnVWYkALu3g_5Er4qY633H0g.gx3GqL3_ez_HtELAgFZBrqO6XEBb9lZyboYEM3NvXZAg.PNG.littlesam95/cafemocha.png?type=w580", 32),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfNzcg/MDAxNjQ4MDIzNjYxNTE1.99QrCqCioQaXWd8B76ipckRAFZh2JHasdbRW9PiJe7Ig.O955kzF5wAl5UtZKYH0rvOQvq0_4WfM6zmsRXLZphrMg.PNG.littlesam95/cappuccino.png?type=w580", 33),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMTcy/MDAxNjQ4MDIzNjYxNTM5.96id41C7as74HHTeLokhNnMOb5PfB8gGvfOc8QiDAjEg.yjeZIpYY3PHr8FuwqPBZdJAR-WbxYjAdoHwEZ7-HiQwg.PNG.littlesam95/caramelmacchiato.png?type=w580", 34),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjQ1/MDAxNjQ4MDIzNjYyMjQ3.CP-e_aOAGtHILEXYYv96QY9boKhxjcmHuvqYyAI-aZAg.96zhTejPDImBExW7GEY1DhQMbwqL8FWbD34iS__WBpsg.PNG.littlesam95/condensedmilklatte.png?type=w580", 35),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfODMg/MDAxNjQ4MDIzNjYyMDIy.qn4l5_9msGpcOK_SJ0FjMDw6WiWJrU9V-9BgY-LcfOEg.NMZzhoFt6DEcPSNsj9uxXQ-eVCA72CQwUp_nh8PXb6Eg.PNG.littlesam95/coldbrewamericano.png?type=w580", 36),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMjNfMjI2/MDAxNjQ4MDIzNjYyMTI2.nVMzF8ggveY6Ggg-irH0jy3M-f0wt_Lf7JzkBDXnrSkg.dnZKW1aKBOQjEiyGHdlBNqE6baHaVYUY9FEqOXy4VlQg.PNG.littlesam95/coldbrewlatte.png?type=w580", 37),
        )

        rv_beverage.layoutManager = GridLayoutManager(applicationContext, 2)
        rv_beverage.setHasFixedSize(true)
        rv_beverage.adapter = BeverageAdapter(beverageList)
    }
}