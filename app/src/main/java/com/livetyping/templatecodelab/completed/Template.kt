package com.livetyping.templatecodelab.completed

/*
package ${PACKAGE_NAME}

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.livetyping.templatecodelab.R
import com.livetyping.templatecodelab.common.Model
import kotlinx.android.synthetic.main.recycler_item.view.*

class ${Adapter_name}Adapter(private val onItemClick: (${Model}) -> Unit) : RecyclerView.Adapter<${Adapter_name}Adapter.${Adapter_name}ViewHolder>() {
    private val items = arrayListOf<Model>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${Adapter_name}ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.${Layout_item_id}, parent, false)
        return ${Adapter_name}ViewHolder(onItemClick, itemView)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ${Adapter_name}ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    fun swapItems(items: Iterable<${Model}>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    class ${Adapter_name}ViewHolder(
    private val onItemClick: (${Model}) -> Unit,
    itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: ${Model}) {
        itemView.setOnClickListener {
            onItemClick(item)
        }
    }
    }
}
*/
