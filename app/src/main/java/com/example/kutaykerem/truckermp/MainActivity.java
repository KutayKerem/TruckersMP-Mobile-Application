package com.example.kutaykerem.truckermp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connect();
        home();
        webView.setWebViewClient(new WebViewClient());
    }

    public void connect(){

        webView = findViewById(R.id.webView);

    }
    public void home(){
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://truckersmp.com");

    }


}