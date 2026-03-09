package com.example.culturacoreana

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.culturacoreana.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // 1. Definimos la lista aquí para tenerla disponible
    private val grupos = listOf(
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(TextFieldsFragment())

        binding.btnTextFields.setOnClickListener { replaceFragment(TextFieldsFragment()) }
        binding.btnBotones.setOnClickListener { replaceFragment(BotonesFragment()) }
        binding.btnSeleccion.setOnClickListener { replaceFragment(ElementosSeleccionFragment()) }

        // 2. Al hacer clic en listas, cargamos el Fragment que mostrará los grupos
        binding.btnListas.setOnClickListener {
            replaceFragment(ListasFragment())
        }

        binding.btnInfo.setOnClickListener { replaceFragment(InformacionFragment()) }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}