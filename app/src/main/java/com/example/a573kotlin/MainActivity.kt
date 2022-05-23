package com.example.a573kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView_1_id.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        recyclerView_2_id.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        getAdapter1(data1())
        getAdapter2(data2())
    }

    private fun getAdapter1(list: ArrayList<Contents>) {
        val adapter1 = Adapter_1(this, list)
        recyclerView_1_id.adapter = adapter1
    }

    private fun getAdapter2(list: ArrayList<Shorts>) {
        val adapter2 = Adapter_2(this, list)
        recyclerView_2_id.adapter = adapter2
    }

    private fun data1(): ArrayList<Contents> {
        val list = ArrayList<Contents>()
        list.add(Contents("Masha va Medved"))
        list.add(Contents("Masha va Medved"))
        list.add(Contents("Masha va Medved"))
        list.add(Contents("Masha va Medved"))
        list.add(Contents("Masha va Medved"))
        list.add(Contents("Masha va Medved"))
        list.add(Contents("Masha va Medved"))
        list.add(Contents("Masha va Medved"))
        list.add(Contents("Masha va Medved"))
        list.add(Contents("Masha va Medved"))
        return list
    }

    private fun data2(): ArrayList<Shorts> {
        val list = ArrayList<Shorts>()
        list.add(Shorts(R.drawable.rasm1, "Yevropach o'yin kulgu va musiqa", "177K views"))
        list.add(Shorts(R.drawable.rasm2, "Yevropach o'yin kulgu va musiqa", "1,2K views"))
        list.add(Shorts(R.drawable.rasm4, "Yevropach o'yin kulgu va musiqa", "17K views"))
        list.add(Shorts(R.drawable.rasm5, "Yevropach o'yin kulgu va musiqa", "187K views"))
        list.add(Shorts(R.drawable.rasm6, "Yevropach o'yin kulgu va musiqa", "87K views"))
        list.add(Shorts(R.drawable.rasm7, "Yevropach o'yin kulgu va musiqa", "187K views"))
        list.add(Shorts(R.drawable.rasm9, "Yevropach o'yin kulgu va musiqa", "7K views"))
        list.add(Shorts(R.drawable.rasm5, "Yevropach o'yin kulgu va musiqa", "187K views"))
        list.add(Shorts(R.drawable.rasm7, "Yevropach o'yin kulgu va musiqa", "18K views"))
        list.add(Shorts(R.drawable.rasm2, "Yevropach o'yin kulgu va musiqa", "7K views"))
        return list
    }
}