package com.example.activitytest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.first_layout.*

class FirstActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("First Activity", "Task id is $taskId")
        setContentView(R.layout.first_layout)
        button1.setOnClickListener{
            //Toast.makeText(this, "You clicked Button 1", Toast.LENGTH_SHORT).show()
            /*显式启动intent*/
            //val intent = Intent(this, SecondActivity::class.java)
            //startActivity(intent)
            /*隐式启动intent*/
            /*val intent = Intent("com.example.activitytest.ACTION_START")
            intent.addCategory("com.example.activitytest.MY_CATEGORY")
            startActivity(intent)*/
            /*显示网页*/
            /*val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.baidu.com")*/
            /*拨号*/
            /*val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:1008611")*/
            /*传递数据*/
            /*val data = "Hello SecondActivity"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("extra_data", data)*/
            /*返回数据*/
            /*val intent = Intent(this,
                    SecondActivity::class.java)
            startActivity(intent)*/
            //startActivity(intent)
            SecondActivity.actionStart(this, "data1", "data2")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this,
                "You clicked Add",
                 Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,
                "You clicked Remove",
                 Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == RESULT_OK) {
                val returnedData = data?.getStringExtra("data_return")
                Log.d("FirstActivity", "returned data is $returnedData")
            }
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("First Activity", "onRestart")
    }
}