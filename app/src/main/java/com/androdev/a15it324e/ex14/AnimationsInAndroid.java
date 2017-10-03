package com.androdev.a15it324e.ex14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.androdev.a15it324e.R;

public class AnimationsInAndroid extends AppCompatActivity {

    private boolean isRotating = false;
    private boolean isFading = false;
    private boolean isSliding = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations_in_android);

        final CardView cardView = (CardView) findViewById(R.id.cardRotate360);
        final CardView cardView1 = (CardView) findViewById(R.id.cardFade);
        final CardView cardView2 = (CardView) findViewById(R.id.cardSlide);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isRotating) {
                    cardView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_360));
                    isRotating = true;
                } else {
                    cardView.clearAnimation();
                    isRotating = false;
                }
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isFading) {
                    cardView1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_fade));
                    isFading = true;
                } else {
                    cardView1.clearAnimation();
                    isFading = false;
                }
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isSliding) {
                    isSliding = true;
                    cardView2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_down));
                } else {
                    cardView2.clearAnimation();
                    isSliding = false;
                }
            }
        });
    }
}
