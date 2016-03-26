package com.example.animality;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pagehumster extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagehumster);
    }
    public void page2(View view) {
        Intent page2 = new Intent(this, page2.class);
        startActivity(page2);
        finish();
    }
    public void sendMail(View view)
    {
        Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
        mailIntent.setType("text/html");
        mailIntent.setData(Uri.parse("mailto:"));
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Это очень срочно!");
        mailIntent.putExtra(Intent.EXTRA_TEXT, "Мама, хочу хомячка! Купи, купи, купи! ");
        if (mailIntent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(mailIntent);
        }
    }
}
