package com.excal.myproject.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.excal.myproject.R

class TransactionListAdapter(private val listTransaction:ArrayList<Transaction>):RecyclerView.Adapter<TransactionListAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView =itemView.findViewById(R.id.iv_transaction)
        val target: TextView =itemView.findViewById(R.id.tv_transaction_target)
        val time:TextView=itemView.findViewById(R.id.tv_transaction_time)
        val amount:TextView=itemView.findViewById(R.id.tv_amount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_row_transactions,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTransaction.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (id,target_id,target,amount,date)=listTransaction[position]
        holder.icon.setImageResource(target_id)
        holder.target.text=target
        holder.time.text=(date)
        holder.amount.text="$${amount}"
    }
}