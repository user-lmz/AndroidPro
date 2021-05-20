package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val img: Array<Int> = arrayOf(R.drawable.img_1, R.drawable.img_2)
    companion object {
        @JvmStatic
        private var flag = 0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.button1 -> {
                val inputText = editText.text.toString()
                Toast.makeText(this, inputText,
                    Toast.LENGTH_SHORT).apply {
                    show()
                }
            }
            R.id.button2 -> {
                imageView.setImageResource(img[1-flag])
                flag = 1-flag
            }
            R.id.button3 -> {
                progressBar.progress = progressBar.progress + 10
            }
            R.id.button4 -> {
                progressBar.progress = 0
            }
        }
    }
}