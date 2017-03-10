package com.example.deepaksomwanshi.share;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn(View v)
    {
        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();

    }

    public void advBtn(View v)
    {
       // Toast.makeText(this, "Advertise Button Clicked many time ", Toast.LENGTH_LONG).show();
/*
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/html");
        String shareBody = "Your body here";
        String shareSub = "Your subject here";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Via"));
*/
        try {
            /*
            Intent i = new Intent(Intent.ACTION_SENDTO);

            i.setType("text/plain");
            //i.setType("message/rfc822");

            i.setData(Uri.parse("mailto:dsom26@yahoo.com")); // only email apps should handle this

            //i.putExtra(Intent.ACTION_SENDTO, "dsom26@yahoo.com");
            //i.putExtra(Intent.EXTRA_SUBJECT, "My application name");
           // String sAux = "\nLet me recommend you this application\n\n";
            //sAux = sAux + "https://play.google.com/store/apps/details?id=Orion.Soft \n\n";
            //String sAux = "TESTING";
            //i.putExtra(Intent.EXTRA_TEXT, sAux);

            // i.putExtra(Intent.EXTRA_EMAIL, "deepak@runtime-solutions.com");

            startActivity(Intent.createChooser(i, "choose one"));
            */
/*
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"abc@gmail.com"});
            Intent mailer = Intent.createChooser(intent, null);
            startActivity(mailer);
            */

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
            intent.putExtra(Intent.EXTRA_TEXT, "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=Orion.Soft \\n\\n");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"pinkvilla@gmail.com"});
            Intent mailer = Intent.createChooser(intent, null);
            startActivity(mailer);

        } catch(Exception e) {
            //e.toString();
        }

    }



}
