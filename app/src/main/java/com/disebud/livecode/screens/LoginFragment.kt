package com.disebud.livecode.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.disebud.livecode.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    lateinit var nav : NavController

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        loginUser.setOnClickListener {
            // // idnya bisa dilihat pada mode Text nav_graph.xml
            //pengecekan dari input user
            if (emailInput.text.toString().isNotEmpty() && passwordInput.text.toString().isNotEmpty()) {

                //kalau ngk kosong
                val input = emailInput.text.toString()
                Toast.makeText(this.context, "Login Succes , Welcome ${input}", Toast.LENGTH_SHORT).show()
//                val input = edInput.text.toString()
//                val bundle = Bundle()
//                bundle.putString("args", input)
            }else {
                Toast.makeText(this.context, "Fill the form", Toast.LENGTH_SHORT).show()
            }


            nav.navigate(R.id.action_loginFragment_to_dasboardFragment)
        }
    }

}