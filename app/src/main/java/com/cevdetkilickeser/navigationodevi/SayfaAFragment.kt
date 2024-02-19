package com.cevdetkilickeser.navigationodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cevdetkilickeser.navigationodevi.databinding.FragmentAnasayfaBinding
import com.cevdetkilickeser.navigationodevi.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {

    private lateinit var binding: FragmentSayfaABinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaABinding.inflate(inflater, container, false)

        binding.buttonA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.fromAToB)
        }

        return binding.root
    }
}