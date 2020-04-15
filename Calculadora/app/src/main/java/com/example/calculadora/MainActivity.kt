package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonReset.setOnClickListener(this)
        buttonPoint.setOnClickListener(this)
        buttonEqual.setOnClickListener(this)
        buttonSum.setOnClickListener(this)
        buttonSubtracts.setOnClickListener(this)
        buttonMultiplies.setOnClickListener(this)
        buttonDivide.setOnClickListener(this)

    }


    override fun onClick(v: View?) {
        if(v?.id == R.id.button0){
            centralPanel.text = "0"
        }else{
            centralPanel.text = "9"
        }
    }
}
