package com.example.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//WebViewをインポート
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public  WebView myWebView; //mywebview をこれかプライベートで宣言しないとfinal何たらでwebアクセス出来ない

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ボタンを設定
        Button button = (Button)findViewById(R.id.buttonA);
        myWebView = (WebView) findViewById(R.id.webView);
        //標準ブラウザをキャンセル
        myWebView.setWebViewClient(new WebViewClient());

       button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myWebView.loadUrl("http://www.yahoo.co.jp/");
                findViewById(R.id.buttonA).setVisibility(View.INVISIBLE);//これでボタンを消します
            }
            });
    }
}
