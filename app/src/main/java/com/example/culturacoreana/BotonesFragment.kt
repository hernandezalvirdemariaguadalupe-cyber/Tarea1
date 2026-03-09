package com.example.culturacoreana

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BotonesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_botones, container, false)

        val btnNormal = view.findViewById<Button>(R.id.btnNormal)
        val imgBtn = view.findViewById<ImageButton>(R.id.imgBtn)
        val fab = view.findViewById<FloatingActionButton>(R.id.fab)

        // Botón normal
        btnNormal.setOnClickListener {
            Toast.makeText(requireContext(), "¡Has presionado el botón! Banda: BTS", Toast.LENGTH_SHORT).show()
        }

        // ImageButton
        imgBtn.setOnClickListener {
            Toast.makeText(requireContext(), "¡Has presionado el ImageButton! Festival: Chuseok", Toast.LENGTH_SHORT).show()
        }

        // FloatingActionButton
        fab.setOnClickListener {
            Toast.makeText(requireContext(), "¡Has presionado el FAB! Grupo: BLACKPINK", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}