# Cultura Coreana - App Android

## Descripción
**Cultura Coreana** es una aplicación educativa y entretenida desarrollada en Android que permite explorar distintos aspectos de la cultura coreana. La app cuenta con varios fragments interactivos donde el usuario puede aprender sobre gastronomía, música, grupos de K-pop, vestimenta y tradiciones coreanas.  

Entre sus características principales están:  
- Navegación entre diferentes fragments.  
- Listas interactivas de grupos de K-pop con descripción.  
- Textos y explicaciones en español sobre distintos elementos culturales.  
- Diseño limpio, colores agradables y botones con efectos visuales.  

---

## Instalación

1. Clona este repositorio o descarga el proyecto como ZIP.  
2. Abre Android Studio y selecciona **Open an Existing Project**.  
3. Asegúrate de tener instalado el SDK de Android con la versión mínima requerida.  
4. Conecta un dispositivo Android o utiliza un emulador.  
5. Haz clic en **Run** para compilar e instalar la app.  

---

## Uso

1. **Pantalla principal:**  
   Al abrir la app, encontrarás botones que llevan a los distintos fragments:  
   - Gastronomía  
   - Música  
   - K-pop  
   - Vestimenta  
   - Tradiciones  

2. **Fragment de K-pop:**  
   - Contiene una lista de grupos de K-pop.  
   - Al seleccionar un grupo, se muestra su descripción y algunos datos relevantes.  
   - Los datos se gestionan mediante un modelo `GrupoKpop.kt`.  

3. **Fragment de gastronomía:**  
   - Permite leer información sobre platos típicos coreanos.  
   - Incluye un campo de texto para que el usuario escriba su plato favorito.  

4. **Interacción:**  
   - Cada fragment está diseñado para ser interactivo y educativo.  
   - Los botones y listas están diseñados para mantener un flujo intuitivo.  

---

## Estructura del proyecto
CulturaCoreana/ <br>
├── app/ <br>
│ ├── src/main/java/com/example/culturacoreana/ <br>
│ │ ├── MainActivity.kt <br>
│ │ ├── fragments/ <br>
│ │ │ ├── GastronomiaFragment.kt <br>
│ │ │ ├── MusicaFragment.kt <br>
│ │ │ ├── KpopFragment.kt <br>
│ │ │ ├── VestimentaFragment.kt <br>
│ │ │ └── TradicionesFragment.kt <br>
│ │ └── models/ <br>
│ │ └── GrupoKpop.kt <br>
│ ├── res/ <br>
│ │ ├── layout/ <br>
│ │ │ ├── fragment_gastronomia.xml <br>
│ │ │ ├── fragment_musica.xml <br>
│ │ │ ├── fragment_kpop.xml <br>
│ │ │ ├── fragment_vestimenta.xml <br>
│ │ │ └── fragment_tradiciones.xml <br>
│ │ ├── drawable/ <br>
│ │ └── values/ <br>
│ │ └── strings.xml <br>
└── README.md <br>


---

## Requisitos

- Android Studio 2022 o superior  
- SDK de Android mínimo 21 (Lollipop)  
- Conexión a internet opcional (solo para futuras actualizaciones de contenido)  

---

## Créditos

Desarrollado por **María Guadalupe Hernández Alvirde**.  

---

## Notas

- La app está diseñada para ser escalable, permitiendo agregar más fragments y listas de contenido cultural.  
- Se recomienda revisar los strings y recursos gráficos antes de compilar para evitar errores de visualización.

##Imagenes
