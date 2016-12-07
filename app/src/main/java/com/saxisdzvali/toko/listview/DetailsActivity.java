package com.saxisdzvali.toko.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.saxisdzvali.toko.listview.model.MwerlebiCharacter;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        MwerlebiCharacter sulxanSaba = (MwerlebiCharacter) getIntent().getExtras().getSerializable("MwerlebiCharacter");

        TextView nameView = (TextView) findViewById(R.id.name);
        TextView descriptionView = (TextView) findViewById(R.id.description);
        ImageView imageView = (ImageView) findViewById(R.id.image);

        nameView.setText(sulxanSaba.getName());
        descriptionView.setText(sulxanSaba.getDescription());


        Picasso.with(this)
                .load(sulxanSaba.getImage())
                .resize(400, 400)
                .into(imageView);

    }
}
