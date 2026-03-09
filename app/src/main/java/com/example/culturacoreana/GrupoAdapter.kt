package com.example.culturacoreana

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GrupoAdapter(private val listaGrupos: List<GrupoKpop>) :
    RecyclerView.Adapter<GrupoAdapter.GrupoViewHolder>() {

    inner class GrupoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombre: TextView = itemView.findViewById(R.id.txtNombreGrupo)
        val descripcion: TextView = itemView.findViewById(R.id.txtDescripcionGrupo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GrupoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_grupo_adapter, parent, false)
        return GrupoViewHolder(view)
    }

    override fun onBindViewHolder(holder: GrupoViewHolder, position: Int) {
        val grupo = listaGrupos[position]
        holder.nombre.text = grupo.nombre
        holder.descripcion.text = grupo.descripcion
    }

    override fun getItemCount(): Int = listaGrupos.size
}