package com.jefmelo.mask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jefmelo.mask.databinding.ActivityUnmaskedBinding

class ActivityUnmasked : AppCompatActivity() {

    private var binding: ActivityUnmaskedBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUnmaskedBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val tel = intent.getStringExtra("tel")
        binding!!.idTextViewTel.text = "Telefone: $tel"

        val pf = intent.getStringExtra("pf")
        binding!!.idTextViewCpf.text = "CPF: $pf"

        val pj = intent.getStringExtra("pj")
        binding!!.idTextViewCnpj.text = "CNPJ: $pj"

    }
}