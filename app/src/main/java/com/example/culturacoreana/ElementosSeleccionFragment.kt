package com.example.culturacoreana

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class ElementosSeleccionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_elementos_seleccion, container, false)

        // CheckBoxes - Comidas coreanas
        val cbKimchi = view.findViewById<CheckBox>(R.id.cbKimchi)
        val cbBibimbap = view.findViewById<CheckBox>(R.id.cbBibimbap)
        val cbTteokbokki = view.findViewById<CheckBox>(R.id.cbTteokbokki)

        // RadioGroup - Festival coreano
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioFestivales)

        // Switch - Hábito cultural
        val switchHanbok = view.findViewById<Switch>(R.id.switchHanbok)

        val btnMostrar = view.findViewById<Button>(R.id.btnMostrarSeleccion)
        val txtResultado = view.findViewById<TextView>(R.id.txtResultadoSeleccion)

        btnMostrar.setOnClickListener {
            // Comidas seleccionadas
            val comidas = mutableListOf<String>()
            if (cbKimchi.isChecked) comidas.add("Kimchi")
            if (cbBibimbap.isChecked) comidas.add("Bibimbap")
            if (cbTteokbokki.isChecked) comidas.add("Tteokbokki")

            // Festival seleccionado
            val festivalId = radioGroup.checkedRadioButtonId
            val festival = when (festivalId) {
                R.id.rbChuseok -> "Chuseok"
                R.id.rbSeollal -> "Seollal"
                R.id.rbBoryeong -> "Boryeong"
                else -> "Ninguno"
            }

            // Switch
            val usaHanbok = if (switchHanbok.isChecked) "Sí" else "No"

            // Resultado final
            txtResultado.text = "Comidas elegidas: ${comidas.joinToString(", ")}\nFestival: $festival\n¿Usas Hanbok?: $usaHanbok"
        }

        return view
    }
}