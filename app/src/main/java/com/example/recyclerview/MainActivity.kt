package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RvAdapter
    private lateinit var rvAdapter2: RvAdapter
    private lateinit var rvAdapter3: RvAdapter
    private lateinit var rvAdapter4: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvAdapter = RvAdapter(this, Constant.getData())
        binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.recyclerView.adapter = rvAdapter

        rvAdapter2 = RvAdapter(this, Constant2.getData())
        binding.recyclerView2.layoutManager = GridLayoutManager(this@MainActivity, 2)
        binding.recyclerView2.adapter = rvAdapter2

        rvAdapter3 = RvAdapter(this, Constant3.getData())
        binding.recyclerView3.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView3.adapter = rvAdapter3

        rvAdapter4 = RvAdapter(this, Constant4.getData())
        binding.recyclerView4.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView4.adapter = rvAdapter4
    }
}
