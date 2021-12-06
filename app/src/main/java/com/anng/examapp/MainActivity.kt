package com.anng.examapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.resumeButton)
        bottomNavigationView = findViewById(R.id.aboutButton)

        bottomNavigationView.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null

            when (item.itemId) {


                R.id.resumeButton -> {
                    fragment = GoodMoodList1()
                }

                R.id.aboutButton -> {
                    fragment = AboutFragment()

                }


            }

            true
        }

      }


    }
