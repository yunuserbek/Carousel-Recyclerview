package com.example.carouselrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.carouselrecyclerview.databinding.ActivityMainBinding
import com.jackandphantom.carouselrecyclerview.CarouselRecyclerview

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val movieList =ArrayList<MovieModel>()
        movieList.add(MovieModel(R.drawable.besiktas,"Besiktas"))
        movieList.add(MovieModel(R.drawable.bursaspor,"bursa"))
        movieList.add(MovieModel(R.drawable.fenerbahce,"fenerbahce"))
        movieList.add(MovieModel(R.drawable.galatasaray,"galatasaray"))
        val adapter = MovieAdapter(movieList)
        binding.apply {
          carouselRV.adapter = adapter
            carouselRV.set3DItem(true)
            carouselRV.setAlpha(true)
            carouselRV.setInfinite(true)
        }
    }
}