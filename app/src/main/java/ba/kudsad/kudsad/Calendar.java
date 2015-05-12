package ba.kudsad.kudsad;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class Calendar extends ActionBarActivity {

    private WebView mWebView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);

        mWebView2 = (WebView) findViewById(R.id.webView2);
        WebSettings webSettings = mWebView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView2.loadUrl("https://www.kudsad.ba/events/calendar");

    }
}
