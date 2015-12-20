package development.kamutchat.wachirapong.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //explicit
    private TextView headTextView ,DetailTextView;

    private ImageView TrafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //ShowView
        showView();

    }   //Main Method

    private void showView() {

        //Show Head
        String strHead = getIntent().getStringExtra("Head");
        headTextView.setText(strHead);

        //Show Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        TrafficImageView.setImageResource(intImage);

        //Show Detail
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] strDetail = getResources().getStringArray(R.array.detail);
        DetailTextView.setText(strDetail[intIndex]);


    }   //ShowView

    private void bindWidget() {
        headTextView = (TextView) findViewById(R.id.textView2);
        TrafficImageView = (ImageView) findViewById(R.id.imageView);
        DetailTextView = (TextView) findViewById(R.id.textView3);
    }

}   //Main Class
