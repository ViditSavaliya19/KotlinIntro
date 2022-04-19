package com.example.kotlin07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

  val rv_view : RecyclerView get() = findViewById(R.id.rv_view);

    var country_name = arrayOf("India","UK","US","Ukrain","Russia","Nepal","Yuganda")
    var capital_name = arrayOf("Delhi","London","Wosington DC","Kiw","Mosco","Kathmandu","yuganda")
    var l1 = arrayListOf<ModelData>()
    var i=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        while (i<capital_name.size)
        {
            var m1 = ModelData(country_name[i],capital_name[i])
            l1.add(m1)
            i++

        }
        var adapter = MyAdapter(this,l1)
        var layoutmanager = LinearLayoutManager(this)
        rv_view.layoutManager =layoutmanager
        rv_view.adapter=adapter

    }
}