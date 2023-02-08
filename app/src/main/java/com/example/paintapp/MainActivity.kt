package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paintapp.PaintView.Companion.colorlist
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathList
import com.example.paintapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    companion object {
        // what ever is stored inside companion object
        // can be accessed in the entire application
        var path = Path()
        var paintbrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // initializing all the buttons
        val red_btn = binding.redButton
        val black_btn = binding.blackButton
        val purple_btn = binding.purpleButton
        val green_btn = binding.greenButton

        red_btn.setOnClickListener {
            paintbrush.setColor(Color.RED)
            currentColor(paintbrush.color)
        }
        black_btn.setOnClickListener {
            paintbrush.setColor(Color.BLACK)
            currentColor(paintbrush.color)
        }
        purple_btn.setOnClickListener {
            pathList.clear()
            colorlist.clear()
            path.reset()
        }
        green_btn.setOnClickListener {
            paintbrush.setColor(Color.GREEN)
            currentColor(paintbrush.color)
        }


    }
    private fun currentColor(color : Int){
        currentBrush = color
        path = Path()
    }
}