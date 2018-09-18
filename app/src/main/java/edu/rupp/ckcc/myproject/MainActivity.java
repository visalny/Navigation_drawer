package edu.rupp.ckcc.myproject;

import android.app.Activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

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
}
