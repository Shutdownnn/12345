package com.example.calv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str:String
        var ss:String
        one.setOnClickListener {
            ss = "1"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        two.setOnClickListener {
            ss = "2"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        three.setOnClickListener {
            ss = "3"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        four.setOnClickListener {
            ss = "4"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        five.setOnClickListener {
            ss = "5"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        six.setOnClickListener {
            ss = "6"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        seven.setOnClickListener {
            ss = "7"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        eight.setOnClickListener {
            ss = "8"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        nine.setOnClickListener {
            ss = "9"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        zero.setOnClickListener {
            ss = "0"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        del.setOnClickListener {
            if (ans.text.length != 1) {
                str = ans.text.toString().dropLast(1)
                ans.setText(str)
            }
            else
                str = "0"
                ans.setText(str)
        }

        clear.setOnClickListener {
            str = "0"
            ans.setText("0")
        }

        plus.setOnClickListener {
            var old = ans.text.toString()
            ans.text = old
            ans.setText("$old")
//            var result = old.toDouble() + str.toDouble()
//            ans.setText("$result")
        }

        equal.setOnClickListener {

        }
    }
}
