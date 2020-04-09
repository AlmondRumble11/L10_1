package com.example.l10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button haku;
    EditText url;
    String osoite;
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        haku = (Button)findViewById(R.id.button);
        url = (EditText)findViewById(R.id.editText);
        web = (WebView)findViewById(R.id.webview);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://google.com");

    }
    public void hae(View v){

        web.getSettings().setJavaScriptEnabled(true);
        osoite = url.getText().toString();
        web.loadUrl("http://"+osoite);
        url.setText("");


    }
}
