package dev.abhishektiwari.glideimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    ImageView iv1,iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);

        //for animated loading placeholder
        Glide.with(MainActivity.this)
                .load("https://m.media-amazon.com/images/I/81vDZyJQ-4L._SY741_.jpg")
                .placeholder(R.drawable.progress_bar)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(iv1);


        //for Gif file
        Glide.with(MainActivity.this)
                .load("https://gorillalogic.com/wp-content/uploads/2021/03/Gif-6.gif")
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(iv2);
    }
}