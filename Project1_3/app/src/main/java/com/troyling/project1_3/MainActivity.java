package com.troyling.project1_3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private static final String APPLE_URL = "https://www.apple.com";
    private static final String GOOGLE_URL = "https://www.google.com";
    private static final String WPI_URL = "https://www.wpi.edu";
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // load google initially
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(GOOGLE_URL);

        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        Button wpiBtn = (Button) findViewById(R.id.wpiBtn);
        Button appleBtn = (Button) findViewById(R.id.appleBtn);

        // add listeners
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Google", Toast.LENGTH_SHORT).show();
                webView.loadUrl(GOOGLE_URL);
            }
        });

        wpiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "WPI", Toast.LENGTH_SHORT).show();
                webView.loadUrl(WPI_URL);
            }
        });

        appleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Apple", Toast.LENGTH_SHORT).show();
                webView.loadUrl(APPLE_URL);
            }
        });
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
