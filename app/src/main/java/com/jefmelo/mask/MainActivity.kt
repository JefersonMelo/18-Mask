package com.jefmelo.mask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jefmelo.mask.databinding.ActivityMainBinding
import com.jefmelo.mask.util.MaskFormatUtil

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        //Definições das Máscaras
        binding!!.idTxtTelefoneCompleto.addTextChangedListener(
            MaskFormatUtil.mask(
                binding!!.idTxtTelefoneCompleto,
                MaskFormatUtil.FORMAT_FONE_COD_COMP
            )
        )
        binding!!.idTxtCpf.addTextChangedListener(
            MaskFormatUtil.mask(
                binding!!.idTxtCpf,
                MaskFormatUtil.FORMAT_CPF
            )
        )
        binding!!.idTxtCnpj.addTextChangedListener(
            MaskFormatUtil.mask(
                binding!!.idTxtCnpj,
                MaskFormatUtil.FORMAT_CNPJ
            )
        )

        binding!!.idBtnEnviar.setOnClickListener(View.OnClickListener {
            val telFormatado:String = MaskFormatUtil.unmask(binding!!.idTxtTelefoneCompleto.text.toString())
            val cpfFormatado:String = MaskFormatUtil.unmask(binding!!.idTxtCpf.text.toString())
            val cnpjFormatado:String = MaskFormatUtil.unmask(binding!!.idTxtCnpj.text.toString())

            val intent = Intent(this, ActivityUnmasked::class.java)
            intent.putExtra("numTelefone", "+$telFormatado")
            intent.putExtra("cf", cpfFormatado)
            intent.putExtra("pj", cnpjFormatado)
            startActivity(intent)
        })
    }
}