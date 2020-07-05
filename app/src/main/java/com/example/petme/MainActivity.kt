package com.example.petme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val auth = FirebaseAuth.getInstance()

        if (auth.currentUser != null){
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        login_hp.setOnClickListener {
            val intent = Intent(this, HandphoneLoginActivity::class.java)
            startActivity(intent)
        }

        login_email.setOnClickListener {
            val intent = Intent(this, EmailLoginActivity::class.java)
            startActivity(intent)
        }

        login_google.setOnClickListener{
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}