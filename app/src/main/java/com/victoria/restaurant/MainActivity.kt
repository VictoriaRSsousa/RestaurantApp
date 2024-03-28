package com.victoria.restaurant

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.LinearLayout
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<LinearLayout>(R.id.main)

        val checkedCheckBoxes = mutableListOf<CheckBox>()

        for (i in 0 until layout.childCount) {
            val childView = layout.getChildAt(i)

            if (childView is LinearLayout) {

                for (j in 0 until childView.childCount) {
                    val innerChildView = childView.getChildAt(j)


                    if (innerChildView is CheckBox) {

                        if (innerChildView.isChecked) {

                            checkedCheckBoxes.add(innerChildView)
                        }
                    }
                }
            }
        }

        for (checkBox in checkedCheckBoxes) {
            println(checkBox.tag)
        }
    }
}