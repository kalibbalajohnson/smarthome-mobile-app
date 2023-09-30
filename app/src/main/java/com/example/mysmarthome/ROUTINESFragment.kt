package com.example.mysmarthome

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ROUTINESFragment : Fragment() {

    companion object {
        fun newInstance() = ROUTINESFragment()
    }

    private lateinit var viewModel: ROUTINEViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_r_o_u_t_i_n_e, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this).get(ROUTINEViewModel::class.java)
        // TODO: Use the ViewModel
    }

}