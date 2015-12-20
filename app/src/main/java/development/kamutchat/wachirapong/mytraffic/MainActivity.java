package development.kamutchat.wachirapong.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //explicit
    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        // Button Controller
        buttonController();

        //ListView Controller
        ListViewController();

    }   // Main Method

    private void ListViewController() {

        //SetUp Array_#1
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};

        //Setup Array_#2
        String[] title_1Strings = new String[20];
        title_1Strings[0] = "หัวข้อที่ 1";
        title_1Strings[1] = "หัวข้อที่ 2";
        title_1Strings[2] = "หัวข้อที่ 3";
        title_1Strings[3] = "หัวข้อที่ 4";
        title_1Strings[4] = "หัวข้อที่ 5";
        title_1Strings[5] = "หัวข้อที่ 6";
        title_1Strings[6] = "หัวข้อที่ 7";
        title_1Strings[7] = "หัวข้อที่ 8";
        title_1Strings[8] = "หัวข้อที่ 9";
        title_1Strings[9] = "หัวข้อที่ 10";
        title_1Strings[10] = "หัวข้อที่ 11";
        title_1Strings[11] = "หัวข้อที่ 12";
        title_1Strings[12] = "หัวข้อที่ 13";
        title_1Strings[13] = "หัวข้อที่ 14";
        title_1Strings[14] = "หัวข้อที่ 15";
        title_1Strings[15] = "หัวข้อที่ 16";
        title_1Strings[16] = "หัวข้อที่ 17";
        title_1Strings[17] = "หัวข้อที่ 18";
        title_1Strings[18] = "หัวข้อที่ 19";
        title_1Strings[19] = "หัวข้อที่ 20";

        //SetUp Array_#3
        String[] title_2Strings = getResources().getStringArray(R.array.title_2);

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, title_1Strings, title_2Strings, intIcon);
        trafficListView.setAdapter(objMyAdapter);


    }   //ListView Controller

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_shut);
                buttonMediaPlayer.start();

                // Intent to Web View
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/zYNsQ6ibdZs"));

                startActivity(objIntent);
            }   //event
        });
    }

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }

}   // Man Class
