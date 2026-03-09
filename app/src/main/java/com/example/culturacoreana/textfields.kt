package com.example.culturacoreana

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class TextFieldsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_textfields, container, false)

        val editText = view.findViewById<EditText>(R.id.editTextComida)
        val button = view.findViewById<Button>(R.id.btnMostrar)
        val textView = view.findViewById<TextView>(R.id.txtResultado)

        button.setOnClickListener {
            val comida = editText.text.toString()
            if (comida.isNotEmpty()) {
                textView.text = "¡Has escrito $comida, un plato típico de Corea!"
            } else {
                Toast.makeText(requireContext(), "Escribe algo primero", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}