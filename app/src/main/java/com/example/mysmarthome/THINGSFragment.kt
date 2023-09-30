package com.example.mysmarthome

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Handler
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import com.example.mysmarthome.ui.routines.RoutinesFragment

class THINGSFragment : Fragment() {

    companion object {
        fun newInstance() = THINGSFragment()
    }

    private lateinit var viewModel: THINGViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_t_h_i_n_g, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(THINGViewModel::class.java)
        // TODO: Use the ViewModel
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView33 = view.findViewById<TextView>(R.id.textView33)
        val textView56 = view.findViewById<TextView>(R.id.textView56)
        textView33.setOnClickListener {
            val textView34 = view.findViewById<TextView>(R.id.textView34)
            textView34.visibility = View.VISIBLE
            textView33.visibility = View.INVISIBLE
            textView56.visibility = View.INVISIBLE
        }

        val textView = view.findViewById<TextView>(R.id.textView34)
        textView.setOnClickListener {
            showTextDialog()
        }
    }

        private fun showTextDialog() {
            val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Enter a value")

            val input = EditText(requireContext())
            input.inputType = InputType.TYPE_CLASS_TEXT
            builder.setView(input)

            builder.setPositiveButton("OK") { _, _ ->
                val inputValue = input.text.toString()


                val progressBar = ProgressBar(requireContext())
                progressBar.isIndeterminate = true

                val dialog = AlertDialog.Builder(requireContext())
                    .setTitle("Creating new Routine")
                    .setCancelable(false)
                    .setView(progressBar)
                    .create()

                // Show the progress bar
                dialog.show()

                // Wait for 2 seconds before launching MainActivity3
                Handler().postDelayed({
                    // Dismiss the progress bar
                    dialog.dismiss()

                    val intent = Intent(requireActivity(), MainActivity::class.java)
                    intent.putExtra("input_value", inputValue)
                    intent.putExtra("fragment_id", R.id.navigation_routines)
                    startActivity(intent)

                }, 2000)
            }

            builder.setNegativeButton("Cancel") { dialog, _ -> dialog.cancel() }

            builder.show()
        }
    }

