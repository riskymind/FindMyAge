package com.thisiskelechi.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun displayAge(view: View) {
        val age = dob.text.toString().toInt()

         if (age <= 0 || age.toString().length <= 3) {
             age_result.text = "Invalid Input"
             return
         }

        var calculatedAge = Calendar.getInstance().get(Calendar.YEAR) - age
        val result = "You are $calculatedAge years old."
         age_result.setText(result)
        dob.setText("")
    }
}
