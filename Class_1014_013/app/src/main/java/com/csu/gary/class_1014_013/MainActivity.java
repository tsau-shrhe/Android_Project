package com.csu.gary.class_1014_013;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mbtnOK;
    private TextView msug;
    private Spinner mspnSex;
    private EditText medit_age;
    private String msSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtnOK = (Button)findViewById(R.id.btnOK);
        msug = (TextView)findViewById(R.id.sug);
        medit_age = (EditText)findViewById(R.id.edit_age);

        mbtnOK.setOnClickListener(btnokOnClick);
        mspnSex = (Spinner)findViewById(R.id.spnSex);
        mspnSex.setOnItemSelectedListener(spnonselct);

    }

    private View.OnClickListener btnokOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int age = Integer.parseInt(medit_age.getText().toString());
            String strsug = getString(R.string.result);

            if(msSex.equals(getString(R.string.sex_male)))
                if(age < 28)
                    strsug += getString(R.string.sug_not_hurry);
                else if (age> 33)
                    strsug += getString(R.string.sug_hurry);
                else
                    strsug += getString(R.string.sug_find);
            else
                if(age < 25)
                    strsug += getString(R.string.sug_not_hurry);
                else if (age> 30)
                    strsug += getString(R.string.sug_hurry);
                else
                    strsug += getString(R.string.sug_find);

            msug.setText(strsug);
        }
    };

    private AdapterView.OnItemSelectedListener spnonselct =
            new AdapterView.OnItemSelectedListener(){
        @Override
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id){
            msSex = parent.getSelectedItem().toString();
        }
        public void onNothingSelected(AdapterView<?> parent){

        }
    };
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
