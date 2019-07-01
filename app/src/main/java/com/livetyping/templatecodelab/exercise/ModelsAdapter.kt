package com.livetyping.templatecodelab.exercise

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.livetyping.templatecodelab.R
import com.livetyping.templatecodelab.common.Model
import kotlinx.android.synthetic.main.recycler_item.view.*

class ModelsAdapter(private val onItemClick: (Model) -> Unit) : RecyclerView.Adapter<ModelsAdapter.ModelsViewHolder>() {
    private val items = arrayListOf<Model>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.recycler_item, parent, false)
        return ModelsViewHolder(onItemClick, itemView)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ModelsViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    fun swapItems(items: Iterable<Model>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    class ModelsViewHolder(
        private val onItemClick: (Model) -> Unit,
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val textView = itemView.item

        fun bind(item: Model) {
            itemView.setOnClickListener {
                onItemClick(item)
            }
            textView.text = item.id.toString()
        }
    }
}