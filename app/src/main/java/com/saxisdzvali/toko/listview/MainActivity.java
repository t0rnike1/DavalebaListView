package com.saxisdzvali.toko.listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.saxisdzvali.toko.listview.adapters.CustomMwerlebiAdapter;
import com.saxisdzvali.toko.listview.model.MwerlebiCharacter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<MwerlebiCharacter> listViewData = mwerlebiData ();

        CustomMwerlebiAdapter adapter = new CustomMwerlebiAdapter(this, listViewData);

        ListView listView = (ListView) findViewById(R.id.listview);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                intent.putExtra("MwerlebiCharacter", (MwerlebiCharacter)adapterView.getAdapter() .getItem (i));
                startActivity(intent);

            }
        });



    }

    private ArrayList<MwerlebiCharacter> mwerlebiData () {
        ArrayList<MwerlebiCharacter> list = new ArrayList<>();




        for (int j =0; j < 8; j++ )
        for (int i = 0; i < Mwerlebi.names.length; i++) {

            MwerlebiCharacter ilia = new MwerlebiCharacter(Mwerlebi.names[i], Mwerlebi.descriptions[i], Mwerlebi.images[i]);
            list.add(ilia);
        }


        return list;
    }



}
