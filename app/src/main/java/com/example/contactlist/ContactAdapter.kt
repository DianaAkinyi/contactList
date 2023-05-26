package com.example.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.databinding.ContactNameListBinding

class ContactAdapter(var contactlist:List<ContactData>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var binding=
           ContactNameListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)


    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactlist.get(position)
        var binding=holder.binding
        binding.tvName.text=currentContact.name
        binding.tvPhoneNumber.text=currentContact.phoneNumber
        binding.tvEmailAddress.text=currentContact.email
        binding.ivImage.imageAlpha


    }
    override fun getItemCount(): Int {
        return contactlist.size
    }

}
class ContactViewHolder( var binding: ContactNameListBinding): RecyclerView.ViewHolder(binding.root)
