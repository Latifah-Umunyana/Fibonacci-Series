package com.akirachix.fibonaccirecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonaccirecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val fibonacci = fibonacci()

        binding.rvNumbers.layoutManager = LinearLayoutManager(this)

        val numbersAdapter = FibonacciRecyclerViewAdapter(fibonacci)

        binding.rvNumbers.adapter = numbersAdapter


    }


   fun fibonacci(): List<Int>{

        var a = 0
        var b = 1
        var accumulator = 0
        var fibonacci = mutableListOf<Int>()

        while (accumulator < 1000000000){

            fibonacci.add(accumulator)
            a = b
            b = accumulator

            accumulator = a + b

        }

        return fibonacci

    }



}