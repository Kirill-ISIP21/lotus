package com.example.lotus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun signin(view: android.view.View) {
        if (email.text.toString().isNotEmpty()&&password.text.toString().isNotEmpty())
        {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        else
        {
            val  alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }
}