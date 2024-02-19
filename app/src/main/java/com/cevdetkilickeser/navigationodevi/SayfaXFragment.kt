package com.cevdetkilickeser.navigationodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.cevdetkilickeser.navigationodevi.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {

    private lateinit var binding: FragmentSayfaXBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.fromXToY)
        }

        return binding.root
    }
}