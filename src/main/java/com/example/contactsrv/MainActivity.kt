package com.example.contactsrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvcontacts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }
    fun displayContacts(){
        var contactList = listOf<Contact>(Contact("Wanjiku","28365786","wanjiku@gmail.com"),
        Contact("Janet","384672965952","janet@gmail.com"),
        Contact("Anyijukire","32678683365","anyijuikire@gmail.com"),
        Contact("Nowamani","26875908","nowamani@gmail.com"),
        Contact("Aijuka","73657647862","aijuka@gmail.com"),
        Contact("Ayebare","62387657","ayebare@gmail.com"))

        rvcontacts=findViewById(R.id.rvcontacts)
        var contactAdapter= ContactsAdapter(contactList)
        rvcontacts.layoutManager=LinearLayoutManager(baseContext)
        rvcontacts.adapter = contactAdapter
    }
}