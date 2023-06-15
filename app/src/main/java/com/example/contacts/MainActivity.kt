package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts.ContactAdapter
import com.example.contacts.ContactData
import com.example.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContact()


    }
    fun displayContact(){
        val name1=ContactData("Esther","076564310","mwiyeriakanoro@gmail.com", "https://images.unsplash.com/photo-1518882570151-157128e78fa1?ixlib=rb-4.0.3&ixid=M3wxM[...]")
        val name2=ContactData("Angeth", "0788564370","angethherjock@gmail.com","https://images.unsplash.com/photo-1519011985187-444d62641929?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmxhY2slMjBwZW9wbGUlMjBwcm9maWxlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val name3=ContactData("Ishimwe","0702364550","ishimwecynthis@gmail.com","https://images.unsplash.com/photo-1518882570151-157128e78fa1?ixlib=rb-4.0.3&ixid=M3wxM[...]")
        val name4=ContactData("Joyce","0715364750","joyce@gmail.com","https://images.unsplash.com/photo-1518882570151-157128e78fa1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVyc29ufGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val name5=ContactData("Gisemba","0795365380","gisembaF@gmail.com","https://images.unsplash.com/photo-1518882570151-157128e78fa1?ixlib=rb-4.0.3&ixid=M3wxM[...]")
        val name6=ContactData("Regina","076564310","mwiyeriakanoro@gmail.com", "https://images.unsplash.com/photo-1518882570151-157128e78fa1?ixlib=rb-4.0.3&ixid=M3wxM[...]")
        val name7=ContactData("Winfrida", "0788564370","angethherjock@gmail.com","https://images.unsplash.com/photo-1519011985187-444d62641929?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmxhY2slMjBwZW9wbGUlMjBwcm9maWxlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val name8=ContactData("Jemima","0702364550","ishimwecynthis@gmail.com","https://images.unsplash.com/photo-1518882570151-157128e78fa1?ixlib=rb-4.0.3&ixid=M3wxM[...]")
        val name9=ContactData("Liz","0715364750","joyce@gmail.com","https://images.unsplash.com/photo-1518882570151-157128e78fa1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVyc29ufGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val name10=ContactData("Cathy","0795365380","gisembaF@gmail.com","https://images.unsplash.com/photo-1518882570151-157128e78fa1?ixlib=rb-4.0.3&ixid=M3wxM[...]")
        val contactApp= listOf(name1,name2,name3,name4,name5,name6,name7,name8,name9,name10)
        val contactAdapter=ContactAdapter(contactApp)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactAdapter
    }
}


