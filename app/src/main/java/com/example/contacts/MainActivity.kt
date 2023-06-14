//package com.example.mycontacts
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.contacts.ContactAdapter
//import com.example.contacts.ContactData
//import com.example.contacts.databinding.ActivityMainBinding
////import com.example.mycontacts.databinding.ActivityMainBinding
//
//class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding= ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//    }
//
//
//    override fun onResume() {
//        super.onResume()
//        displayContact()
//    }
//    fun displayContact(){
//        val contact1= ContactData("Regina","070987450","regina.com","https://images.unsplash.com/photo-1525357816819-392d2380d821?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVyc29uJTIwcHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
//        val contact3=ContactData("Eunice","078765340","eunice.com","https://images.unsplash.com/photo-1533636721434-0e2d61030955?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YmxhY2slMjBwZXJzb24lMjBwcm9maWxlJTIwcGljdHVyZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
//        val contact4=ContactData("Ann","079874750","ann.com","https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1370&q=80 ")
//        val contact5=ContactData("Grace","079235380","grace.com","https://images.unsplash.com/photo-1525357816819-392d2380d821?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVyc29uJTIwcHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
//        val contact2=ContactData("Philiph","070987450","philip.com","https://images.unsplash.com/photo-1533636721434-0e2d61030955?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YmxhY2slMjBwZXJzb24lMjBwcm9maWxlJTIwcGljdHVyZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
//        val contact6=ContactData("Ryan","078765340","ryan.com","https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1370&q=80")
//        val contact7=ContactData("Robert","079874750","robert.com"," https://images.unsplash.com/photo-1525357816819-392d2380d821?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVyc29uJTIwcHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
//        val contactName= mutableListOf<ContactData>(contact1,contact3,contact4,contact5,contact6,contact7,contact2)
////       val contactName=listOf(contact1,contact3,contact4,contact5)
//        val contactAdapter=ContactAdapter(contactName)
//        binding.rvContact.layoutManager=LinearLayoutManager(this)
//        binding.rvContact.adapter=contactAdapter
//    }
//}

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
//import com.bumptech.glide.Glide
import com.example.contacts.ContactAdapter
import com.example.contacts.ContactData
import com.example.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setupRecyclerView()
        displayContact()
    }

//    private fun setupRecyclerView() {
//        contactAdapter = ContactAdapter()
//        binding.rvContact.layoutManager = LinearLayoutManager(this)
//        binding.rvContact.adapter = contactAdapter
//    }

    private fun displayContact() {
        val contactList = mutableListOf<ContactData>()

        val contact1 = ContactData("Regina", "070987450", "regina.com", "https://images.unsplash.com/photo-1525357816819-392d2380d821?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVyc29uJTIwcHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
        val contact2 = ContactData("Philiph", "070987450", "philip.com", "https://images.unsplash.com/photo-1533636721434-0e2d61030955?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YmxhY2slMjBwZXJzb24lMjBwcm9maWxlJTIwcGljdHVyZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact3 = ContactData("Eunice", "078765340", "eunice.com", "https://images.unsplash.com/photo-1533636721434-0e2d61030955?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YmxhY2slMjBwZXJzb24lMjBwcm9maWxlJTIwcGljdHVyZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact4 = ContactData("Ann", "079874750", "ann.com", "https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1370&q=80")
        val contact5 = ContactData("Grace", "079235380", "grace.com", "https://images.unsplash.com/photo-1525357816819-392d2380d821?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVyc29uJTIwcHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
        val contact6 = ContactData("Ryan", "078765340", "ryan.com", "https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1370&q=80")
        val contact7 = ContactData("Robert", "079874750", "robert.com", "https://images.unsplash.com/photo-1525357816819-392d2380d821?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVyc29uJTIwcHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")

        contactList.add(contact1)
        contactList.add(contact2)
        contactList.add(contact3)
        contactList.add(contact4)
        contactList.add(contact5)
        contactList.add(contact6)
        contactList.add(contact7)

//      contactAdapter.setData(contactList)
        val contactName= mutableListOf<ContactData>(contact1,contact3,contact4,contact5,contact6,contact7,contact2)
//       val contactName=listOf(contact1,contact3,contact4,contact5)
        val contactAdapter=ContactAdapter(contactName)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactAdapter
    }
}
