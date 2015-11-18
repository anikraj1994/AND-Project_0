package me.anikraj.myappportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_about) {
            startActivity(new Intent(MainActivity.this,About.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void button1(View v){
        Toast.makeText(this,"This button will launch my Spotify Streamer app!",Toast.LENGTH_SHORT).show();
    }
    public void button2(View v){
        Toast.makeText(this,"This button will launch my Football Scores app!",Toast.LENGTH_SHORT).show();
    }
    public void button3(View v){
        Toast.makeText(this,"This button will launch my Library app!",Toast.LENGTH_SHORT).show();
    }
    public void button4(View v){
        Toast.makeText(this,"This button will launch my Build It Bigger app!",Toast.LENGTH_SHORT).show();
    }
    public void button5(View v){
        Toast.makeText(this,"This button will launch my XYZ Reader app!",Toast.LENGTH_SHORT).show();
    }
    public void button6(View v){
        Toast.makeText(this,"This button will launch my Capstone app!",Toast.LENGTH_SHORT).show();
    }

}
