package com.zhahira.appklinik_mi2b.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zhahira.appklinik_mi2b.R
import com.zhahira.appklinik_mi2b.Model.ModelListDoctor

class AdapterListDoctors(
    val itemListDoctors: List<ModelListDoctor>
): RecyclerView.Adapter<AdapterListDoctors.MyviewHolder>() {
    class MyviewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var txtNamaDoktor : TextView = itemView.findViewById(R.id.txtNamaDoctor)
        var imgDoctor : ImageView = itemView.findViewById(R.id.imgDoctor)
        var imgBintang : ImageView = itemView.findViewById(R.id.imgBintang)
        var txtBidang : TextView = itemView.findViewById(R.id.txtBidang)
        var txtTotalReview : TextView = itemView.findViewById(R.id.txtJumlahReview)
        var txtTotalRating : TextView = itemView.findViewById(R.id.txtJumlahRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doctor,parent,false)
        return MyviewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemListDoctors.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem = itemListDoctors[position]
        holder.txtNamaDoktor.setText(currentItem.NamaDr)
        holder.imgDoctor.setImageResource(currentItem.ImageDr)
        holder.imgBintang.setImageResource(currentItem.ImageBintang)
        holder.txtBidang.setText(currentItem.BidangDr)
        holder.txtTotalRating.setText(currentItem.totalRating)
        holder.txtTotalReview.setText(currentItem.totalReview)
    }
}