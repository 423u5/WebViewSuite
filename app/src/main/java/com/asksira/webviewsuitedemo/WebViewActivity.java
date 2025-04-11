package com.asksira.webviewsuitedemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.asksira.webviewsuite.WebViewSuite;

public class WebViewActivity extends AppCompatActivity {

    WebViewSuite webViewSuite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webViewSuite = findViewById(R.id.webViewSuite);
        webViewSuite.setOpenPDFCallback(new WebViewSuite.WebViewOpenPDFCallback() {
            @Override
            public void onOpenPDF() {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (!webViewSuite.goBackIfPossible()) super.onBackPressed();
    }
}
