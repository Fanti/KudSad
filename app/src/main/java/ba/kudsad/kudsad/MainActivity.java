package ba.kudsad.kudsad;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.content.Intent;
import android.util.Log;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.SaveCallback;
import java.text.ParseException;



public class MainActivity extends ActionBarActivity {

    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.kudsad.ba/");

        Parse.initialize(this, "Rb3YC37jL0UI7We20J7FIIVDaJ5INyitZkHfT1A6", "BfJmKPJVzJHAQvLNDB0izPbDRVT7S4VL8se52oEK");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.calendar:
                Intent intCalendar = new Intent(MainActivity.this, Calendar.class);
                startActivity(intCalendar);

                return true;

            case R.id.news:
                Intent intNews = new Intent(MainActivity.this,News.class);
                startActivity(intNews);
                return true;

            case R.id.action_search:
                Intent intSearch = new Intent(MainActivity.this,Search.class);
                startActivity(intSearch);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }
*/
       // return super.onOptionsItemSelected(item);
    }
}
