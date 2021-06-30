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
        binding!!.idEditTxtTelefoneCompleto.addTextChangedListener(
            MaskFormatUtil.mask(
                binding!!.idEditTxtTelefoneCompleto,
                MaskFormatUtil.FORMAT_FONE_COD_COMP
            )
        )
        binding!!.idEditTxtCpf.addTextChangedListener(
            MaskFormatUtil.mask(
                binding!!.idEditTxtCpf,
                MaskFormatUtil.FORMAT_CPF
            )
        )
        binding!!.idEditTxtCnpj.addTextChangedListener(
            MaskFormatUtil.mask(
                binding!!.idEditTxtCnpj,
                MaskFormatUtil.FORMAT_CNPJ
            )
        )

        binding!!.idBtnEnviar.setOnClickListener {
            val telFormatado: String = MaskFormatUtil.unmask(binding!!.idEditTxtTelefoneCompleto.text.toString())
            val cpfFormatado: String = MaskFormatUtil.unmask(binding!!.idEditTxtCpf.text.toString())
            val cnpjFormatado: String = MaskFormatUtil.unmask(binding!!.idEditTxtCnpj.text.toString())

            val intent = Intent(this, ActivityUnmasked::class.java)
            intent.putExtra("tel", "+$telFormatado")
            intent.putExtra("pf", cpfFormatado)
            intent.putExtra("pj", cnpjFormatado)
            startActivity(intent)
        }
    }
}