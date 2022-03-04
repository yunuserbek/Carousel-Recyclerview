package com.example.carouselrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carouselrecyclerview.databinding.CarouselItemBinding

class MovieAdapter(private var movieList:List<MovieModel>):RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    class MovieViewHolder(val binding:CarouselItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
       val binding = CarouselItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
       val movie = movieList[position]
        holder.binding.apply {
            Glide.with(movieImage).load(movie.image).into(movieImage)
            movieName.text = movie.name
            movieImage.setOnClickListener{
                Toast.makeText(it.context, movie.name, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount(): Int =movieList.size
}