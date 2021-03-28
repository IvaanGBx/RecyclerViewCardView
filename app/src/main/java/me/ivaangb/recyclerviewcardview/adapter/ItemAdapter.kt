package me.ivaangb.recyclerviewcardview.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import me.ivaangb.recyclerviewcardview.R
import me.ivaangb.recyclerviewcardview.model.Person

class ItemAdapter(private val context: Context, private val dataset: List<Person>):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        val cityTextView: TextView = view.findViewById(R.id.cityTextView)
        val statusTextView: TextView = view.findViewById(R.id.statusTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayoutInflater = LayoutInflater.from(context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayoutInflater)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.nameTextView.text = context.resources.getString(item.nameResourceId)
        holder.cityTextView.text = context.resources.getString(item.ciudadResourceId)
        holder.statusTextView.text = context.resources.getString(item.estadoResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}