package yuling.stitchswitcher;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private boolean isOne = true;

    public void switchStitch(View view) {
        Log.i("Info", "Button Pressed");
        ImageView image = (ImageView) findViewById(R.id.imageView);
        if( isOne == true){
            image.setImageResource(R.drawable.stitch2);
            isOne = false;
        }else{
            image.setImageResource(R.drawable.stitch1);
            isOne = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
