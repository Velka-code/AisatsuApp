package jp.techacademy.kenichi.nadaya.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.TimePickerDialog
import java.util.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        showTimePickerDialog()

    }

    private fun showTimePickerDialog() {

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener {
                    view, hour, minute ->
                val h = hour
                val m = minute
                jurge(h,m)
                                               },
            13, 0, true)

        timePickerDialog.show()

    }

    public fun jurge(hour:Int,minute:Int){
        when(hour){
            in 0..1 -> when(minute){
                in 0..59 -> textView.text ="こんばんは"
            }
            in 2..9 -> when(minute){
                in 0..59 -> textView.text ="おはよう"
            }
            in 10..17 -> when(minute){
                in 0..59 -> textView.text ="こんにちは"
            }
            in 18..23 -> when(minute){
                in 0..59 -> textView.text ="こんばんは"
            }
        }

    }

}