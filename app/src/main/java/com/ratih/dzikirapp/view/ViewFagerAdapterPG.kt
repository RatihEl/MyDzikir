package com.ratih.dzikirapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ratih.dzikirapp.ModelPagiAdapter
import com.ratih.dzikirapp.R


//Adapter berfungsi untuk menampilkan item yang dimuat ke dalam adapter
//Adapter buat menghubungkan data dengan view nya
//adapter


class ViewFagerAdapterPG (private val introSlides : List<ModelPagiAdapter>)
//kalau buat adapter ada kodingan ini
 : RecyclerView.Adapter<ViewFagerAdapterPG.IntroSliderViewHolder>(){

 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSliderViewHolder {
  return IntroSliderViewHolder(
   // onCreateViewHolder = fungsi nya untuk memanggil layout yang kita buat untuk menaruh data
   LayoutInflater.from(parent.context).inflate(R.layout.item_pagi,parent,false)
  )
 }

 override fun getItemCount(): Int {
  //buat ngitung si list nya ada berapa
  return introSlides.size
 }

 override fun onBindViewHolder(holder: IntroSliderViewHolder, position: Int) {
  //buat nge set up widget2 nya
  //buat mengikat widget2 nya dengan data
  holder.bind(introSlides[position])
 }

 inner class IntroSliderViewHolder (view : View) : RecyclerView.ViewHolder(view){
  //inisialisasi = panggil id per widget nya
  private val judul = view.findViewById<TextView>(R.id.judul)
  private val keteranganarab= view.findViewById<TextView>(R.id.keteranganarab)
  private val keteranganindo = view.findViewById<TextView>(R.id.indo)

  //function bind untuk mengikat widget2 nya dengan data
  fun bind (modelPagiAdapter: ModelPagiAdapter){
   judul.text = modelPagiAdapter.judul
   keteranganarab.text =modelPagiAdapter.keteranganarab
   keteranganindo.text = modelPagiAdapter.keteranganindo
  }

 }
}