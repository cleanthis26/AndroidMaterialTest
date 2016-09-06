package com.example.cmetaxas.applytheme;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Welcome !");
        toolbar.setSubtitle("Folks !");

//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setTitle("Welcome !");
//        toolbar.setSubtitle("Folks !");
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            // With material design APIs
//            toolbar.setElevation(10f);
//        } else {
//            // Without material
//        }

        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String msg = "";

                switch (item.getItemId()) {

                    case R.id.discard:
                        msg = getString(R.string.delete);
                        break;

                    case R.id.search:
                        msg = getString(R.string.search);
                        break;

                    case R.id.edit:
                        msg = getString(R.string.edit);
                        break;

                    case R.id.settings:
                        msg = getString(R.string.settings);
                        break;

                    case R.id.Exit:
                        msg = getString(R.string.exit);
                        break;
                }

                Toast.makeText(MainActivity.this, msg + " clicked !", Toast.LENGTH_SHORT).show();

                return true;
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        String msg = "";
//
//        switch (item.getItemId()) {
//
//            case R.id.discard:
//                msg = getString(R.string.delete);
//                break;
//
//            case R.id.search:
//                msg = getString(R.string.search);
//                break;
//
//            case R.id.edit:
//                msg = getString(R.string.edit);
//                break;
//
//            case R.id.settings:
//                msg = getString(R.string.settings);
//                break;
//
//            case R.id.Exit:
//                msg = getString(R.string.exit);
//                break;
//        }
//
//        Toast.makeText(this, msg + " clicked !", Toast.LENGTH_SHORT).show();
//
//        return super.onOptionsItemSelected(item);
//    }
}
