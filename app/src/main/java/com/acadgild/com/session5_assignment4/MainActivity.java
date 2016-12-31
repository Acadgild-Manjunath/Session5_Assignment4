package com.acadgild.com.session5_assignment4;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)findViewById(R.id.txtView1);

        registerForContextMenu(textView1);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
      //  Window window = this.getWindow();
        //window.setNavigationBarColor(Color.BLACK);
       //  window.setStatusBarColor(Color.BLACK);
        menu.setHeaderTitle("Context Menu");

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);


        // return true;
    }

    private void alignCenter(MenuItem item)
    {
        SpannableString s = new SpannableString(item.getTitle());
        s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
        item.setTitle(s);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {


        int itemId = item.getItemId();
        if(itemId == R.id.item1)
        {
            Toast.makeText(getApplicationContext(),"You clicked on "+item.getTitle(),Toast.LENGTH_SHORT).show();
        }

        else if(itemId == R.id.item2)
        {
            Toast.makeText(getApplicationContext(),"You clicked on "+item.getTitle(), Toast.LENGTH_SHORT).show();
        }

       else if(itemId == R.id.item3)
        {
            Toast.makeText(getApplicationContext(),"You clicked on "+item.getTitle(), Toast.LENGTH_SHORT).show();
        }

        else
        {
            Toast.makeText(getApplicationContext(),"Invalid Selection",Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}
