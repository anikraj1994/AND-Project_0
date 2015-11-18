package me.anikraj.myappportfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void resume(View v){
        goToUrl("https://s3.amazonaws.com/accredible-profile-uploads/udacity/resumes/1447865457021");
    }
    public void git(View v){
        goToUrl("https://github.com/anikraj1994");
    }
    public void website(View v){
        goToUrl("http://anikraj.me/");
    }

    public void link(View v){
        goToUrl ( "http://in.linkedin.com/in/anikrajc");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
