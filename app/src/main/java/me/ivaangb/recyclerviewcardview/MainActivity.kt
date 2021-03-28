package me.ivaangb.recyclerviewcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.ivaangb.recyclerviewcardview.adapter.Datasource
import me.ivaangb.recyclerviewcardview.adapter.ItemAdapter
import me.ivaangb.recyclerviewcardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myDataset = Datasource().loadInfo()
        binding.recyclerView.adapter = ItemAdapter(this, myDataset)
    }
}