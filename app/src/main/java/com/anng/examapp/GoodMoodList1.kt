package com.anng.examapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment


class GoodMoodList1 : Fragment() {
    lateinit var mainImageView: ImageView
    lateinit var leftButton: Button
    lateinit var rightButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_good_mood_list1, container, false)

        mainImageView = view.findViewById(R.id.main_image)
        leftButton = view.findViewById(R.id.left)
        rightButton= view.findViewById(R.id.right)



        return view
    }


}