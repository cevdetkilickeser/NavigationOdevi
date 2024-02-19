package com.cevdetkilickeser.navigationodevi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.cevdetkilickeser.navigationodevi.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {

    private lateinit var binding: FragmentSayfaBBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.buttonB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.fromBToY)
        }

        return binding.root
    }
}