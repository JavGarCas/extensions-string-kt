package com.javgarcas.extensionsstringsktdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.javgarcas.extensions.string.empty
import com.javgarcas.extensions.string.isValidEmail
import com.javgarcas.extensions.string.safeString
import com.javgarcas.extensions.string.space

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        initViewEmpty()
        initViewSpace()
        initViewSafeString()
        initViewIsValidEmail()
    }

    private fun initViewEmpty() {
        val message = "This texts appends empty string: |"
            .plus(String.empty())
            .plus("|")
        findViewById<TextView>(R.id.empty_text_view).text = message
    }

    private fun initViewSpace() {
        val message = "This texts appends space string: |"
            .plus(String.space())
            .plus("|")
        findViewById<TextView>(R.id.space_text_view).text = message
    }

    private fun initViewSafeString() {
        var data: String? = null
        val message1 = "This texts appends null string: |"
            .plus(data.safeString())
            .plus("|")
        findViewById<TextView>(R.id.safe_string_1_text_view).text = message1
        data = "Not null"
        val message2 = "This texts appends not null string: |"
            .plus(data.safeString())
            .plus("|")
        findViewById<TextView>(R.id.safe_string_2_text_view).text = message2
    }

    private fun initViewIsValidEmail() {
        var data: String = "erroremail@format"
        val message1 = data.plus(" is valid email? ")
            .plus(data.isValidEmail().toString())
        findViewById<TextView>(R.id.is_valid_email_1_text_view).text = message1
        data = "validemail@format.com"
        val message2 = data.plus(" is valid email? ")
            .plus(data.isValidEmail().toString())
        findViewById<TextView>(R.id.is_valid_email_2_text_view).text = message2
    }
}
