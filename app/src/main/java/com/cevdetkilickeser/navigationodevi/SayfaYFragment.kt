package com.cevdetkilickeser.navigationodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cevdetkilickeser.navigationodevi.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {

    private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)
        return binding.root
    }
}