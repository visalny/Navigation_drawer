package edu.rupp.ckcc.myproject;

import android.app.Activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);

        DrawerLayout layout=findViewById(R.id.drawer);
        Toolbar toolbar=findViewById(R.id.toolbar);

        ActionBarDrawerToggle drawerToggle=new ActionBarDrawerToggle(this,layout,toolbar,R.string.open,R.string.close);
        layout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.listone:
                Toast.makeText(this, "List One", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.listtwo:
                Toast.makeText(this, "List Two", Toast.LENGTH_SHORT).show();
                return true;
        }
        return true;
    }
}

