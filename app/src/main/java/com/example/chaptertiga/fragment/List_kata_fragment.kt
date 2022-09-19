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

class List_kata_Fragment : Fragment() {
    private var _binding: FragmentListKataFragmentBinding? = null
    private val binding get() = _binding!!

    private var list: ArrayList<Abjad> = arrayListOf()
    private lateinit var rvItems: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentListKataFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var abjad = arguments?.getString("click_abjad")

        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        when(abjad){
            "A" -> {list.addAll(AbjadData.listAbjadA)}
            "B" -> {list.addAll(AbjadData.listAbjadB)}
            "C" -> {list.addAll(AbjadData.listAbjadC)}
            "D" -> {list.addAll(AbjadData.listAbjadD)}
            "E" -> {list.addAll(AbjadData.listAbjadE)}
            "F" -> {list.addAll(AbjadData.listAbjadF)}
            "G" -> {list.addAll(AbjadData.listAbjadG)}
            "H" -> {list.addAll(AbjadData.listAbjadH)}
            "I" -> {list.addAll(AbjadData.listAbjadI)}
            "J" -> {list.addAll(AbjadData.listAbjadJ)}
        }
        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
}