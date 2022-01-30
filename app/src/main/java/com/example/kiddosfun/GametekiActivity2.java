package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GametekiActivity2 extends AppCompatActivity {


    ImageView curView = null;
    private int countPair = 0 ;
    final int [] drawable = new int[]{R.drawable.bt_kucing1, R.drawable.bt_ayam1, R.drawable.bt_bebek1};

    int[] pos = {0,1,2,0,1,2};
    int currentPos = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameteki2);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (currentPos<0)
                {
                    currentPos = position;
                    curView = (ImageView) view;
                    ((ImageView)view).setImageResource(drawable[pos[position]]);
                }

                else {

                    if (currentPos == position)
                    {
                        ((ImageView)view).setImageResource(R.drawable.bt_kotakbiru1);
                    }

                    else if (pos[currentPos]!=pos [position])
                    {
                        curView.setImageResource(R.drawable.bt_kotakbiru1);
                        Toast.makeText(getApplicationContext(),"Not Match",Toast.LENGTH_SHORT).show();
                    }

                    else {
                        ((ImageView)view).setImageResource(drawable[pos[position]]);
                        countPair++;

                        if (countPair == 0)
                        {
                            Toast.makeText(getApplicationContext(),"You Win",Toast.LENGTH_SHORT).show();
                        }
                    }

                    currentPos = -1;
                }
            }
        });
    }
}


