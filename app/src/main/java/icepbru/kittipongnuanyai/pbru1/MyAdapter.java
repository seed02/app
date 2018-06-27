package icepbru.kittipongnuanyai.pbru1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kittipongnuanyai on 1/19/2018 AD.
 */

public class MyAdapter extends BaseAdapter {


    //Explicit
    private Context objContext;
    private int[] imgInts;
    private String[] nameStrings;
    private String[] detailStrings;
    private String[] messStrins;

    public MyAdapter(Context objContext, int[] imgInts, String[] nameStrings, String[] detailStrings, String[] messStrins)
    {
        this.objContext = objContext;
        this.imgInts = imgInts;
        this.nameStrings = nameStrings;
        this.detailStrings = detailStrings;
        this.messStrins = messStrins;
    }

    @Override
    public int getCount() {
        return nameStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //Show icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setBackgroundResource(imgInts[i]);

        //show name
        TextView nameTexView = (TextView) view1.findViewById(R.id.textView);
        nameTexView.setText(nameStrings[i]);

        //show detail
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView2);
        detailTextView.setText(detailStrings[i]);





        return view1;
    }

}   //Main Class
