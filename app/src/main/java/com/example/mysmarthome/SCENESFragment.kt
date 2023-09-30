package com.example.mysmarthome

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SCENESFragment : Fragment() {

    companion object {
        fun newInstance() = SCENESFragment()
    }

    private lateinit var viewModel: SCENEViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_s_c_e_n_e, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SCENEViewModel::class.java)
        // TODO: Use the ViewModel
    }

}