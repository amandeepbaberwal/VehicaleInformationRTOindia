package com.example.amandeep.vehicaleinformationrtoindia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        WebView webView = findViewById(R.id.webView);
        webView.loadUrl("https://parivahan.gov.in/rcdlstatus/?pur_cd=102");
    }
}
