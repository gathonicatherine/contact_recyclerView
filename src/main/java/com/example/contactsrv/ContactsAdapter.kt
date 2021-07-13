package com.example.contactsrv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(var contactList: List<Contact>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.contact_view_item, parent,false)
        return ContactViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvemail.text = currentContact.email
        holder.tvname.text=currentContact.name
     holder.tvphonenumber.text=currentContact.phonenumber
    }
}



class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphonenumber)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
}
