package com.washswat.admin.missionmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONArray array = makeFakeMission();

        Intent intent = new Intent(MainActivity.this,MapActivity.class);
        intent.putExtra("array" , array.toString());
        startActivity(intent);

    }

    public JSONArray makeFakeMission(){
        JSONArray array = new JSONArray();
        JSONObject order = new JSONObject();
        JSONObject userInfo = new JSONObject();

        Log.d("Gump",  "Call:makeFakeMission");
        try {
            userInfo.put("name", "주문1");
            userInfo.put("lat", "37.510151");
            userInfo.put("lot", "127.028282");
            Log.d("Gump",userInfo.toString());
            order.put("userInfo", userInfo);
            Log.d("Gump", order.toString());
            Log.d("Gump", order.getJSONObject("userInfo").toString());
            array.put(order);

            userInfo = new JSONObject();
            userInfo.put("name", "주문2");
            userInfo.put("lat", "37.507683");
            userInfo.put("lot", "127.034183");
            Log.d("Gump",userInfo.toString());
            order.put("userInfo", userInfo);
            Log.d("Gump", order.toString());
            Log.d("Gump", order.getJSONObject("userInfo").toString());
            array.put(order);

            Log.d("Gump", array.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return array;
    }

}
