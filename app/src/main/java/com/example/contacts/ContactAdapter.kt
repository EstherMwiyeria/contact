package com.example.contacts


import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contacts.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactAdapter(var ContactList:List<ContactData>) : RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent ,false)
        return ContactViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return ContactList.size
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact =ContactList.get(position)
        var  binding=holder.binding
        binding.ivAvatar.tag=currentContact.image
        binding.tilName.text=currentContact.names
        binding.tilphoneNumber.text=currentContact.phoneNumber
        binding.tilEmail.text =currentContact.email

        binding.tvbutton.setOnClickListener {
            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
            holder.itemView.context.startActivity(intent)
        }
        Picasso
            .get()
            .load(currentContact.image)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivAvatar) }
}
class ContactViewHolder( var binding:ContactListItemBinding):ViewHolder(binding.root)