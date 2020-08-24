package com.disebud.livecode.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.disebud.livecode.R
import kotlinx.android.synthetic.main.fragment_dasboard.*


class DasboardFragment : Fragment() {

    lateinit var nav: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dasboard, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        transfer_button.setOnClickListener {


            nav.navigate(R.id.action_dasboardFragment_to_transferToFragment)
        }

        history_button.setOnClickListener {
            // exitAnim = waktu pindah ke fragment tujuan
            // enterAnim = waktu sampai di fragment tujuan
            // popupExitAnim = waktu back dari fragment
            // popupEnterAnim = waktu sampai di fragment sebelumnya



            nav.navigate(R.id.action_dasboardFragment_to_historyFragment)
        }
    }
}

