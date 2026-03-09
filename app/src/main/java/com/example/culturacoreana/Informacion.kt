package com.example.culturacoreana

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment

class InformacionFragment : Fragment() {

    private var progress = 0
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_informacion, container, false)

        val textView = view.findViewById<TextView>(R.id.txtDescripcion)
        val imageView = view.findViewById<ImageView>(R.id.imgCultura)
        val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
        val btnAprender = view.findViewById<Button>(R.id.btnAprender)

        // Texto y explicación
        textView.text = "Cultura Coreana: Aprende sobre comidas, festivales y K-pop."

        // Imagen de ejemplo
        imageView.setImageResource(R.drawable.kimchi) // agrega un drawable de kimchi

        // Configurar ProgressBar
        progressBar.progress = 0

        // Botón para “aprender” incrementando la barra
        btnAprender.setOnClickListener {
            progress = 0
            progressBar.progress = progress
            handler.postDelayed(object : Runnable {
                override fun run() {
                    if (progress < 100) {
                        progress += 10
                        progressBar.progress = progress
                        handler.postDelayed(this, 300)
                    }
                }
            }, 300)
        }

        return view
    }
}