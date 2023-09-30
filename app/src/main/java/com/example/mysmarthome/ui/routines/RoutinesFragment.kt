package com.example.mysmarthome.ui.routines

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mysmarthome.R
import com.example.mysmarthome.databinding.FragmentRoutinesBinding
import com.example.mysmarthome.ui.routines.RoutinesViewModel

class RoutinesFragment : Fragment() {

    private var _binding: FragmentRoutinesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(RoutinesViewModel::class.java)

        _binding = FragmentRoutinesBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val selectedValue = requireActivity().intent.getStringExtra("input_value")
        val textView12 = binding.textView12
        val textView11 = binding.textView11
        val text_notifications = binding.textNotifications
        val textView48 = binding.textView48
        val textView60 = binding.textView60
        val textView59 = binding.textView59
        val textView57 = binding.textView57
        val textView58 = binding.textView58

        if (selectedValue != null) {
            textView12.visibility = View.INVISIBLE
            textView11.visibility = View.INVISIBLE
            textView60.visibility = View.VISIBLE
            textView59.visibility = View.VISIBLE
            textView58.visibility = View.VISIBLE
            textView57.visibility = View.VISIBLE
            text_notifications.visibility = View.INVISIBLE
            textView48.visibility = View.VISIBLE
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}