package icepbru.kittipongnuanyai.pbru1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {

    //Explicit
    private TextView showTitleTextView;
    private ImageView showImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //Bind Widget
        bindWidget();

        //Show Widget
        showWidget();




    } //Main method

    private void showWidget() {

        //Receive from Inten
        int intClick = getIntent().getIntExtra("click", 0);

        //Show Title
        MyData objMyData = new MyData();
        String[] strTitle = objMyData.mess();

        showTitleTextView.setText(strTitle[intClick]);



        //show Image
        int[] intImage = objMyData.icon();
        showImageView.setImageResource(intImage[intClick]);






    } //showWidget



    private void bindWidget() {
        showTitleTextView = findViewById(R.id.textView6);
        showImageView = findViewById(R.id.imageView3);



    }//bindWidget


}
