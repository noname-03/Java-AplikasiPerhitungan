package com.fahrurrozi.aplikasiperhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {
    private WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        view = (WebView) this.findViewById(R.id.web);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.loadUrl("https://www.youtube.com");
    }

    public class MyBrowser extends WebViewClient {
//        @Override
        public boolean shouldOvverideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}