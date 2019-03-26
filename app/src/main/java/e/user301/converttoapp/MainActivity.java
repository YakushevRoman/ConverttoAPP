package e.user301.converttoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView rWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rWebView = findViewById(R.id.main_web_view);
        rWebView.getSettings().setJavaScriptEnabled(true);
        rWebView.loadUrl("file:///android_asset/view.html");
    }
}
