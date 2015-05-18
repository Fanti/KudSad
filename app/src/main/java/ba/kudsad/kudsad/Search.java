package ba.kudsad.kudsad;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class Search extends ActionBarActivity {

    private WebView mWebView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);

        mWebView4 = (WebView) findViewById(R.id.webView4);
        WebSettings webSettings = mWebView4.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView4.loadUrl("https://www.kudsad.ba/pretraga/");

    }
}
