package com.example.activitytest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_layout.*

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Second Activity", "Task id is $taskId")
        setContentView(R.layout.second_layout)
        /*val extraData = intent.getStringExtra("extra_data")
        Log.d("SecondActivity", "extra data is $extraData")*/
        button2.setOnClickListener{
            /*val intent = Intent()
            intent.putExtra("data_return", "Hello FirstActivity")
            setResult(RESULT_OK, intent)
            finish()*/
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, SecondActivity::class.java).apply {
                putExtra("param1", data1)
                putExtra("param2", data2)
            }
            context.startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Second Activity", "onDestroy")
    }
}