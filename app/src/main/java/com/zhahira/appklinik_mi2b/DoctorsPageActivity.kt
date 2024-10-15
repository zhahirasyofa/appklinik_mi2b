package com.zhahira.appklinik_mi2b

import android.annotation.SuppressLint
import android.graphics.ColorSpace.Model
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zhahira.appklinik_mi2b.Adapter.AdapterListDoctors
import com.zhahira.appklinik_mi2b.Adapter.MenuIcon
import com.zhahira.appklinik_mi2b.Model.ModelIcon
import com.zhahira.appklinik_mi2b.Model.ModelListDoctor

class DoctorsPageActivity : AppCompatActivity() {

    private lateinit var RecyclerViewMenu : RecyclerView
    private lateinit var AdapterMenu : MenuIcon

    private lateinit var RecyclerViewDoctor : RecyclerView
    private lateinit var AdapterDoctor : AdapterListDoctors

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_doctors_page)

        //data contoh untuk menu
        val menuIcons = listOf(
            ModelIcon(R.drawable.iconheart,"cardiologist"),
            ModelIcon(R.drawable.iconeye,"Ophthalmologyst"),
            ModelIcon(R.drawable.icontooth,"Dentist")
        )


        //inisialisasi recyclerview dan adapter
        RecyclerViewMenu = findViewById(R.id.recycleViewMenu)
        RecyclerViewMenu.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        AdapterMenu = MenuIcon(menuIcons)
        RecyclerViewMenu.adapter = AdapterMenu

        //data untuk dokter
        val menudokter = listOf(
            ModelListDoctor("Dr.Floyd Miles",R.drawable.dokter1,R.drawable.bintang,"Pediatrics","(123 reviews)","4.9"),
            ModelListDoctor("Dr.Guy Hawkins",R.drawable.dokter2,R.drawable.bintang,"Dentist","(85 reviews)","5.0"),
            ModelListDoctor("Dr.Jane Cooper",R.drawable.dokter3,R.drawable.bintang,"Cardiologist","(44 reviews)","4.9"),
            ModelListDoctor("Dr.Jacob Jones",R.drawable.dokter4,R.drawable.bintang,"Nephrologyst","(101 reviews)","5.0"),
            ModelListDoctor("Dr.Savannah Nguyen",R.drawable.dokter5,R.drawable.bintang,"Urologist","(168 reviews)","4.8")
        )

        //inisialisasi recycleview dan adapter
        RecyclerViewDoctor = findViewById(R.id.recycleViewDoctor)
        RecyclerViewDoctor.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        AdapterDoctor= AdapterListDoctors(menudokter)
        RecyclerViewDoctor.adapter = AdapterDoctor


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}