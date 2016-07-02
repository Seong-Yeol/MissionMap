package com.washswat.admin.missionmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

import net.daum.mf.map.api.MapView;


public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Log.d("Gump","Called creater MapActivity");

        MapView mapView = new MapView(this);
        Log.d("Gump","Success to create DaumMapView");
        mapView.setDaumMapApiKey(getString(R.string.daum_api_key));
        Log.d("Gump","Success to set DaumMapApiKey");

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);

        Log.d("Gump","Success to create MapActivity");
    }
}
