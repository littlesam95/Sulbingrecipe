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
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjUw/MDAxNjQ4NjQyMjUzOTQy.tvazkQq5JPOYJf2i45_jPVMEeAaiSfS1h711Y_GXq2Eg.sSxIpEwN6rurRy3Xj1FPLGKKNjv4OGTgw4ljvQzZKnwg.PNG.littlesam95/sangsanglemontea.png?type=w580", 1),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjkw/MDAxNjQ4NjQyMjU0MDg1.VuvbVMF0JEmcQCcpNWkfKpfJKso1QZDIK3oUUOR3qmkg._5PEd4IcNGkMvD4aCB0JaAcbEC7f1FIiFPyVRckJ4Rwg.PNG.littlesam95/tongtongyuzatea.png?type=w580", 2),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfOTAg/MDAxNjQ4NjQyMjUzNTQw.VnqLl_bvLQtcA8HxXHzexM0BbrdaFwxmaVn38tQ1-Vcg.bs2eOQmlS3AmakfYTH6PR5qSs7vnWfdOCqodswP75a0g.PNG.littlesam95/deepsanggangtea.png?type=w580", 3),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjIz/MDAxNjQ4NjQyMjUzNTI0.mpYI_8yAfhpY3gUV_svPbiQVrLy-7-SPtMxVSxHzud4g.df_HiDORrN2Bqkp9nNDhxDn6oIS6EbrRgIKw5CBS1Wsg.PNG.littlesam95/deepdachutea.png?type=w580", 4),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjE3/MDAxNjQ4NjQyMjUzNjgx.d1SKDWHEZBMGv4409joDs_7y0CJxN6GFv0kaNmuHKv8g.Pu4rOor0RBA5P3rutWFTNY1coN8PDCr7e_nr2Hd6R1Eg.PNG.littlesam95/peachicetea.png?type=w580", 5),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjUg/MDAxNjQ4NjQyMjUzNTk4.iaeubvc2jgSeP9AUYT6bUx_yNPXD1WlAQXW5z6ApOwog.JZq2y9AwXJlM-ryUrlbgWydaexQ1lZ9sX7qYVGEqHBIg.PNG.littlesam95/honeyfruittea.png?type=w580", 6),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMzgg/MDAxNjQ4NjQyMjUzODEx.yDZQuuWIwb2EhP752zUPqzHpLoGT7Jw0p5TMIJ3jwJYg.svsFwIOoe6pmpAaf8FTkzHLsBMApuNjZjUNCcldMHD8g.PNG.littlesam95/raspberryomitea.png?type=w580", 7),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNDEg/MDAxNjQ4NjQyMjU0MDY5.xOCMfKx2Kt6cbN4UL8IYPHoEy8Cy6lecoFKXuju0LK0g.412nosTlY896cstyoTLfscRWRB00DStefkh8QD-ezyQg.PNG.littlesam95/teaeight.png?type=w580", 8),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTIy/MDAxNjQ4NjQyMjUzOTM5.C7ppwTnQOF9nq1n5s7M1f3z6cxNMkvR2omaRgp8uGPAg.9YYJPfAUnJ-8J0jPALryYyNQMiYgl_GrOYOo_R9f-WMg.PNG.littlesam95/sangsanglemonade.png?type=w580", 9),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTUx/MDAxNjQ4NjQyMjUzNTY5.3R0mQ6Y9tBqsWhT71_OIKRy-H-_kxso29A82RGNJFs8g.UOyNpMmzXFaVciEQba3iVtPijncHSGL4AqiGqyKEpLcg.PNG.littlesam95/honeyfruitade.png?type=w580", 10),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjkw/MDAxNjQ4NjQyMjUzMjkw.lnSulC5v9NszE1otq3AsCEpVuBwRf59IoR9M4MxrGJcg.l6Pd68z9Y5XtLXqohBQjYEGrTz2oyxSL2daE32JoGUEg.PNG.littlesam95/applemangoade.png?type=w580", 11),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTY3/MDAxNjQ4NjQyMjUzODIz.H_bPQ-F08F1flAwCDZhLbLOxdUs7eGnLS42gwur9IrQg.tXXWGak-nqZEfzruLiSzuw93TNIN979oUkoMvnB8Fogg.PNG.littlesam95/redmangoade.png?type=w580", 12),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTE5/MDAxNjQ4NjQyMzIzMTQy.Lq4RPV3AoxAn-glgwIrtogKkgGlK-SY46txDcwIYRNUg.6P_M3vU8VXYhLWo1v9vpvULKVsDxtTTzondbg1wgoesg.PNG.littlesam95/strawberryade.png?type=w580", 13),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTc1/MDAxNjQ4NjQyMjUzNTQ4.p-9sk5PBdIzoDriz_L4SHaXWvf6uLEuD3MaSRoQZxRQg.wbFe46aOmOoJlNQxqpgBBMCdNz9GNglDUNuyYBDJLM4g.PNG.littlesam95/greengrapeade.png?type=w580", 14),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNTUg/MDAxNjQ4NjQyMjUzODA4.llPOopWN0Cu5WxS_r-84pUZZBT1VFgyhPU1Dw-UtS_wg.auvueirtspJpTEr4ZqCcjLFkJlhtcWEvhQ-wEL4atckg.PNG.littlesam95/plainyogurtsmoothie.png?type=w580", 15),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTY3/MDAxNjQ4NjQyMjUzMzky.Lmo2dBCe8olE-ywNeHUEiTEXLq9xNN_yTjXqnQzpO3Mg.Tg76ajXWQcndXaEHFelQKsqUVll-YZHKxSsI_o5iRPcg.PNG.littlesam95/blueberryyogurtsmoothie.png?type=w580", 16),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTEg/MDAxNjQ4NjQyMjU0MDY3.zBO8EbHxYCWRDUHV6t637Q1PYnd-VK4nAJFO99B848kg.dEDk8Xs0ggXwGUOKCf0Y6vhyyBw11qXZvuUGFqJRbokg.PNG.littlesam95/strawberryyogurtsmoothie.png?type=w580", 17),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMzgg/MDAxNjQ4NjQyMjUzMjkw._s3hnhL9HUOK5TmVVmix9e7ITuxdumLTU1GyK_AxR4Ig.Y6v5lebH4w40cxy27cs5xHSgNOVA_ZQR4RVY0W57E_og.PNG.littlesam95/berryberryyogurtsmoothie.png?type=w580", 18),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTQx/MDAxNjQ4NjQyMzIzMTQx.41ygN8CE84OYA5lGyuUBXUZvzkoCKUxRN8u2Nv9QGkYg.IYth9mQ1GGBSfm2iHA440rOvDPtRznIkvBuACQSAq1og.PNG.littlesam95/redmangosmoothie.png?type=w580", 19),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNjAg/MDAxNjQ4NjQyMjUzNjk3.oOm4wSzc4d1IyMh8HzJf-tSPOwjbvWm1sJACDPX65IYg.l6QV6h2vYRDEFok5mKlCvXy1ZmO3Km88UyVqzhitTVkg.PNG.littlesam95/plainstrawberryjuice.png?type=w580", 20),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMzkg/MDAxNjQ4NjQyMjUzODky.JmdAOXVx-AuU0Ecz2x9-Z80wxqRqBmoCObvcqFS0daMg.q3S3jS1WnmeF187qZhlmpg4QTleLFSkcLMigC_Q5dwUg.PNG.littlesam95/sabalshikhye.png?type=w580", 21),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjg0/MDAxNjQ4NjQyMjUzNjc1.zAZ7_MBxDhDmTtA3Lv981Pg_W1dBjuDu7qTc4gr3aLUg.-oQ0gfbQSmTGFh3IthI9rEHGrmiA-7mNQXSMjR-X2yIg.PNG.littlesam95/juicefour.png?type=w580", 22),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjI2/MDAxNjQ4NjQyMjUzNDM2.Yj2SeJFYD6VSE8619jx5mecawbE4YfDLXPsCsuf1Sjsg.8IGTxG9_B0iZk2Ku8xHqDwWWUCECEnWUe7G_z983NmAg.PNG.littlesam95/chekschocosnowlatte.png?type=w580", 23),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjM0/MDAxNjQ4NjQyMjUzNjcx.by6CUihBHP-4c158mdmd5tnuKuGXlFJ_V3rzzh7cZoIg.4MZXOSWhAESZkmVw5a30dkIzTnxdfA8nqtlml3_FVSUg.PNG.littlesam95/hotchoco.png?type=w580", 24),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNzEg/MDAxNjQ4NjQyMjUzNTQ4.RSygKAGKsUpYGx68wgPQfXpPs4mbdxXvGcDiKbpZk_sg.0SH5YVhcXi479KTY01qYUdaSq2XspgaeahJ_pTP7Tacg.PNG.littlesam95/greentealatte.png?type=w580", 25),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNTcg/MDAxNjQ4NjQyMjU0MDE1.lLO61eoZkeZBErxXvm9t2H3SQmg8l9ZDOmqRJs_XJcYg.IY8oPHb6rxh7mHhQc9hksiKnZUoKqCImhMwqAWlFjcgg.PNG.littlesam95/strawberrylatte.png?type=w580", 26),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjEy/MDAxNjQ4NjQyMjUzNjgy.Fa41wlZw6tB-l_z2yl-vLqB4rJZHcwCVaWqe9JUBKkMg.l49andldqtGZqWxCXGtPojlg-9Vu0aNpFAfvetqIoGAg.PNG.littlesam95/mixedgrainpowderlatte.png?type=w580", 27),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjk5/MDAxNjQ4NjQyMjU0MTk2.P6exAdlPV7M8TeQZGKRqvOcEkit5XKeuW6470JfgpvEg.oJfRlM7ziFRNaonWtUjdDsV64IP11rOsAnIp8yaI6DIg.PNG.littlesam95/americano.png?type=w580", 28),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjE4/MDAxNjQ4NjQyMjU0MjAx.z1dFj2vOqYmDBJOY5nXfADMlMki-1HBNJwyJXAU7-u0g.PN9OPVVyN0mKAcd6_hJbtR_DdrVpFeejB44Zb4A0QfAg.PNG.littlesam95/americanoventi.png?type=w580", 29),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjA0/MDAxNjQ4NjQyMjUzMjky.jWgnd_fGN6Uk5v1TYJmD3nXTVhZ6ypCZ_I5yiHmDuK0g.oKyc_FqxX8yB3URhdpokbu3f38LyRTkLwEMvFn3ywBgg.PNG.littlesam95/caffelatte.png?type=w580", 30),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTg4/MDAxNjQ4NjQyMjU0MTYx.tUuFd-FR8poWwIsUtbr0gsPAePQKEaoLcCqPZwfpY-cg.J_tTGe4PPuuPjSnaoGz5vVnpsnMSzZw77J-iQWZDa9cg.PNG.littlesam95/vanlialatte.png?type=w580", 31),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNzAg/MDAxNjQ4NjQyMjUzMjky.Y4krr8GMf3zV9Z32cBnE3o_2ywfxoaVxLZTF6Oeu-Egg.oPOinNXO3kclZKhuvgG6IZ8WxM5WII9m-F2v3uA1evsg.PNG.littlesam95/cafemocha.png?type=w580", 32),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjMg/MDAxNjQ4NjQyMjUzMjk2.vF3ij-Q70_v4ngDbMWMCkg5cGJQ3C_4EiZUYbxCnDXIg.Gs49-ErvIICA41H6BDQkY65tBDKfEJSD6xSQXFsUnYcg.PNG.littlesam95/cappuccino.png?type=w580", 33),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjQg/MDAxNjQ4NjQyMjUzNDM2.ZlBk9fG7L1Ql740rtHtFp-yNq7mfv-IsvOOG1rKdSRIg.tuNNv0BhNhMT2zNCuf6C0wTd3NtVb5FZiAzaXxkfiA0g.PNG.littlesam95/caramelmacchiato.png?type=w580", 34),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfNzMg/MDAxNjQ4NjQyMjUzNDU0.yfwoz3gm2g9VD6Dpq6Z0EtID3F_pamKCQ7cx0rNh0M4g.GCh99DKs_Fq69Yv9QhRx8CM2beRH3V_-yYMWSlvXtsQg.PNG.littlesam95/condensedmilklatte.png?type=w580", 35),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMjcw/MDAxNjQ4NjQyMjUzNDQx.3o-V84E35bcZJmrFqfl7jC-QZqgX9LUlDUTzzJQdJkkg.0-KJxKFso8ltzIMPhPsC6ezz6YWdcnDaYgkXU1BQQHQg.PNG.littlesam95/coldbrewamericano.png?type=w580", 36),
            BeverageRecycler("https://postfiles.pstatic.net/MjAyMjAzMzBfMTAy/MDAxNjQ4NjQyMjUzNDM3.3TICPNjjq6T-0F16xly_fM_9ooom7xGD81bswuxE_XEg.VbdtSTNbz_NCw6oymATybw6jiB-O60KgiqTJS44-Lgog.PNG.littlesam95/coldbewlatte.png?type=w580", 37),
        )

        rv_beverage.layoutManager = GridLayoutManager(applicationContext, 3)
        rv_beverage.setHasFixedSize(true)
        rv_beverage.adapter = BeverageAdapter(beverageList)
    }
}