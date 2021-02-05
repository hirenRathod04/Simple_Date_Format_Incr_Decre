package com.royalsoftsolutions.simple_date_format_incr_decre;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.sql.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

import static java.util.Collections.*;
import static java.util.Collections.reverse;

public class MainActivity extends AppCompatActivity {
    private int x = 0;
    private int no_Of_Date_Get = 15;
    private  ArrayList<String> list;
    private Button btn;
    private RecyclerView rvDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        function_For_DateList();

        btn = findViewById ( R.id.btn );
    }

    private void function_For_DateList() {

        list=new ArrayList<String>();//Creating arraylist
        DateFormat dateFormat = new SimpleDateFormat ( "dd/MM/yyyy" );
        Date date = new Date (  );
        System.out.println ( "Todays Date:" + dateFormat.format ( date ) );
        System.out.println ( "HHHHHHHHH----TODAYDATE-----HHHHHHHHHHHHHHHHHHHHHHH" );

        System.out.println ( "###########------START FOR LOOP OUTPUT---######################" );
        for (int j = 0; j < no_Of_Date_Get; j++) {
            add_Date ( x );

            System.out.println ( "Week of Days Are      : " + add_Date ( x ) );


            list.add(add_Date ( x ));


            x++;
        }
        Collections.reverse(list);


        rvDate = findViewById (R.id.rvDate);
        rvDate.setLayoutManager ( new LinearLayoutManager ( this ,RecyclerView.HORIZONTAL,false) );
        MyListAdapter adapter = new MyListAdapter (MainActivity.this, list);
        rvDate.setAdapter ( adapter );
        rvDate.setHasFixedSize ( true );

        System.out.println ( "###########------END FOR LOOP OUTPUT---######################" );

        System.out.println ( "###########------START ARRAY OUTPUT---######################" );
        System.out.println(list);
        System.out.println ( "###########------END ARRAY OUTPUT---######################" );


        System.out.println ( "###########--------------End" +
                "------------------######################" );
    }

    public static String add_Date(int n) {
        //DateFormat dateFormat = new SimpleDateFormat ( " E -  dd/MM/YYYY  ",Locale.getDefault ());
        DateFormat dateFormat = new SimpleDateFormat ( " E -  dd  ",Locale.getDefault ());
        Calendar calendar = Calendar.getInstance ( );
        calendar.add ( Calendar.DATE, - n );
        String result = dateFormat.format ( calendar.getTime ( ) );

        return result;
    }
}