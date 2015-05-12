package ba.kudsad.kudsad;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.Menu;
import android.view.MenuItem;


public class News extends ActionBarActivity {

    private WebView mWebView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_layout);

        mWebView3 = (WebView) findViewById(R.id.webView3);
        WebSettings webSettings = mWebView3.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView3.loadUrl("https://www.kudsad.ba/reports/index");

    }
}

