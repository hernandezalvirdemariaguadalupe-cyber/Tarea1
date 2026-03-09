package com.example.culturacoreana

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListasFragment : Fragment(R.layout.fragment_listas) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewKpop)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val grupos = listOf(
            GrupoKpop("BTS", "Grupo de K-pop surcoreano, debutó en 2013."),
            GrupoKpop("BLACKPINK", "Grupo femenino famoso mundialmente."),
            GrupoKpop("TWICE", "Grupo femenino popular en Corea y Japón."),
            GrupoKpop("EXO", "Grupo masculino con gran éxito en Asia."),
            GrupoKpop("RED VELVET", "Grupo femenino conocido por sus conceptos únicos."),
            GrupoKpop("STRAY KIDS", "Grupo masculino con estilo enérgico."),
            GrupoKpop("ITZY", "Grupo femenino joven y dinámico."),
            GrupoKpop("SEVENTEEN", "Grupo masculino con coreografías complejas."),
            GrupoKpop("NCT", "Grupo masculino con subunidades múltiples."),
            GrupoKpop("ATEEZ", "Grupo masculino emergente y potente.")
        )

        recyclerView.adapter = GrupoAdapter(grupos)
    }
}