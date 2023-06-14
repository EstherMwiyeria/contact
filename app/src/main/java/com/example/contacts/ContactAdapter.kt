package com.example.contacts

import androidx.recyclerview.widget.RecyclerView


import android.view.LayoutInflater
import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.databinding.ContactListItemBinding
//import com.example.mycontacts.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

 class ContactAdapter(var contactList: List<ContactData>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact = contactList[position]
        val binding = holder.binding
//        binding.ivAvatar.tag=currentContact.image
//        binding.tvnPhoneNumber.text= currentContact.phoneNumber
//        binding.tvEmail.text = currentContact.email
//        binding.tvName.text = currentContact.names

        binding.ivAvatar.tag = currentContact.image
        binding.tilphoneNumber.text = currentContact.phoneNumber
        binding.tilEmail.text = currentContact.email
        binding.tilName.text = currentContact.names
        Picasso
            .get()
            .load(currentContact.image)
            .resize(80, 80)
            .centerCrop()
            .centerInside()
            .transform(CropCircleTransformation())
            .into(binding.ivAvatar)
    }

override fun getItemCount(): Int {
    return contactList.size
}
    inner class ContactViewHolder(val binding: ContactListItemBinding) : RecyclerView.ViewHolder(binding.root)



}
