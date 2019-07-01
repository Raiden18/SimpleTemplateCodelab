package com.livetyping.templatecodelab.completed

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.livetyping.templatecodelab.R
import com.livetyping.templatecodelab.common.Model

class MyAdapter(private val onItemClick: (Model) -> Unit) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    private val items = arrayListOf<Model>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.recycler_item, parent, false)
        return MyViewHolder(onItemClick, itemView)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    fun swapItems(items: Iterable<Model>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    class MyViewHolder(
        private val onItemClick: (Model) -> Unit,
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        //TODO: Uncomment to show items in the list
        //private val textView = itemView.item


        fun bind(item: Model) {
            itemView.setOnClickListener {
                onItemClick(item)
            }
            //TODO: Uncomment to show item text in the list
            //textView.text = item.id.toString()
        }
    }
}