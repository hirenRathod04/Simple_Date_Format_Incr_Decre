package com.royalsoftsolutions.simple_date_format_incr_decre;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private int x = 1;
    private int no_Of_Date_Get = 10;
    private  ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        function_For_DateList();

        System.out.println ( "###########--------------End" +
                "------------------######################" );

           /*  arr[k] = list.split(" ");
            Toast.makeText(this,"${arr[0]} : ${arr[1]}", Toast.LENGTH_LONG).show();*//*

        }
*/
        /*list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");*/
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
        System.out.println ( "###########------END FOR LOOP OUTPUT---######################" );

        System.out.println ( "###########------START ARRAY OUTPUT---######################" );
        System.out.println(list);
        System.out.println ( "###########------END ARRAY OUTPUT---######################" );



    }

    public static String add_Date(int n) {
        DateFormat dateFormat = new SimpleDateFormat ( " E -  dd/MM/YYYY  ",Locale.getDefault ());
        Calendar calendar = Calendar.getInstance ( );
        calendar.add ( Calendar.DATE, - n );
        String result = dateFormat.format ( calendar.getTime ( ) );

        return result;
    }
}