package com.example.dlopener;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WindowManager.LayoutParams params = getWindow().getAttributes();

        params.height = 1400;
        params.width = 1070;
        params.y = 1000;

        this.getWindow().setAttributes(params);

        Uri uri = getIntent().getData() ;
        if(uri!=null){
            String path = uri.toString();
            Toast.makeText(this, "Link opened", Toast.LENGTH_SHORT).show();
            WebView wv = (WebView) findViewById(R.id.webview);
            wv.loadUrl(path);
        }
    }
}