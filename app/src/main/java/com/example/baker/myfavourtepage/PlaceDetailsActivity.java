package com.example.baker.myfavourtepage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlaceDetailsActivity extends AppCompatActivity {

    TextView txtPlaceName,txtPlaceDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);

        txtPlaceName=(TextView) findViewById(R.id.txtPlaceName);
        txtPlaceDetails=(TextView) findViewById(R.id.txtDetails);

        String getPlaceName=getIntent().getExtras().getString("placeName");

        if(getPlaceName.equals("Saintmartin")){

            txtPlaceName.setText("Saintmartin");
            txtPlaceDetails.setText("Saintmartin is a beautiful Place.I want to Visit Saintmartin");
        }
        else if(getPlaceName.equals("IIUC")){

            txtPlaceName.setText("IIUC");
            txtPlaceDetails.setText("IIUC  gives bamboooooo!!!!");
        }
    }
}
