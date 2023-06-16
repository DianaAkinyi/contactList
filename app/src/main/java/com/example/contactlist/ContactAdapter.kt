package com.example.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.databinding.ContactNameListBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactAdapter(var contactlist:List<ContactData>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       val binding= ContactNameListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)


    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactlist[position]
        var binding=holder.binding
        binding.tvName.text=currentContact.name
        binding.tvPhoneNumber.text=currentContact.phoneNumber
        binding.tvEmailAddress.text=currentContact.email
        binding.ivImage.imageAlpha
        Picasso
            .get()
            .load(currentContact.image)
//            .resize(80,80)
//            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivImage)


    }
    override fun getItemCount(): Int {
        return contactlist.size
    }

}
class ContactViewHolder( var binding: ContactNameListBinding): RecyclerView.ViewHolder(binding.root)
