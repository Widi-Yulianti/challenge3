package com.example.chaptertiga.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chaptertiga.Abjad
import com.example.chaptertiga.AbjadData
import com.example.chaptertiga.List_abjad_adapter
import com.example.chaptertiga.R
import com.example.chaptertiga.databinding.FragmentListKataFragmentBinding

class List_abjad_fragment : Fragment() {
    private var _binding: FragmentListAbjadFragmentBinding? = null
    private val binding get() = _binding!!

    private var list: ArrayList<Abjad> = arrayListOf()
    private lateinit var rvItems: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentListAbjadFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvItems = view.findViewById(R.id.rv_abjad)
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjad)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}