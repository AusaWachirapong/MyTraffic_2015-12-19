package development.kamutchat.wachirapong.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by taopa on 12/20/2015.
 */
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context objContext;
    private String[] title1Strings , title2Strings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] title1Strings, String[] title2Strings, int[] iconInts) {
        this.objContext = objContext;
        this.title1Strings = title1Strings;
        this.title2Strings = title2Strings;
        this.iconInts = iconInts;
    }   //Constructor

    @Override
    public int getCount() {
        return title1Strings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView_1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //For textView
        TextView title_1TextView = (TextView) objView_1.findViewById(R.id.txttitle1);
        title_1TextView.setText(title1Strings[position]);

        TextView title_2TextView = (TextView) objView_1.findViewById(R.id.txttitle2);
        title_2TextView.setText(title2Strings[position]);


        // For Image
        ImageView iconImageView = (ImageView) objView_1.findViewById(R.id.imv_Icon);
        iconImageView.setImageResource(iconInts[position]);


        return objView_1;
    }
}   //main class
