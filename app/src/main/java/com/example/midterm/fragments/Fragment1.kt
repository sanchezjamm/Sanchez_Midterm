package com.example.midterm.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.midterm.R
import java.util.zip.Inflater

class Fragment1 : Fragment(){
    override fun onCreate (savedInstancesState: Bundle?){
        super.onCreate(savedInstancesState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container:ViewGroup?,
        savedInstancesState: Bundle?
    ) : View? {
        return inflater.inflate(R.layout.fragment1,container,false)
    }

}