package com.anng.examapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AboutFragment : Fragment() {

    lateinit var developerRecyclerView: RecyclerView
    private val developerName: List<String> = listOf("Anna Gurova")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_about, container, false)
        developerRecyclerView = view.findViewById(R.id.developer_recycler_view)
        developerRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        developerRecyclerView.adapter = DeveloperAdapter(developerName)

        return view

    }

}