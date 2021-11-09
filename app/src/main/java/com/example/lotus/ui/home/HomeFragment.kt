package com.example.lotus.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.lotus.MyFeel
import com.example.lotus.R
import com.example.lotus.databinding.FragmentHomeBinding
import recadapters.FeelRecycler

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home,container,false)
        val feel_recycler: RecyclerView=root.findViewById(R.id.feel_rec)
        feel_recycler.adapter= FeelRecycler(requireContext(), MyFeel().list)
        return root
    }
}