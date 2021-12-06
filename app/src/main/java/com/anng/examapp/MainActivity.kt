package com.anng.examapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var userRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        userRecyclerView= findViewById(R.id.developer_name_text_view)
        userRecyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        userRecyclerView.adapter= DeveloperAdapter(listOf(String()))
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
