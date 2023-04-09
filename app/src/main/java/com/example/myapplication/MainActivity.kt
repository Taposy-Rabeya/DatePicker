package com.example.myapplication

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding
import java.lang.StringBuilder
import java.lang.ref.Cleaner
import java.util.Calendar
import kotlin.contracts.Returns

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fullDate = Calendar.getInstance().time.toString();

//        val calendar = Calendar.getInstance()
//        val year = calendar.get(Calendar.YEAR)
//        val month = calendar.get(Calendar.MONTH)
//        val day = calendar.get(Calendar.DAY_OF_MONTH)

        binding.btnDate.setOnClickListener {
//            val datePickerDialog = DatePickerDialog(this@MainActivity, DatePickerDialog.OnDateSetListener
//            { view, year, monthOfYear, dayOfMonth ->
//                val currentDate = "$dayOfMonth/$monthOfYear/$year"
//                binding.textView.setText(currentDate)
//            }, year, month, day)
//            datePickerDialog.show()
//            binding.textView.text = fullDate
       }
        binding.textView.text = fullDate

        val today = Calendar.getInstance()
        binding.datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH))
        { view, year, month, day ->
            fullDate = "$day/$month/$year"

        }
    }
}



