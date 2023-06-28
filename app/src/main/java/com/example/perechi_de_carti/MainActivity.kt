package com.example.perechi_de_carti

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView cardImageView;
    private Button drawButton;
    private int[] cardImages = {
        R.drawable.card_1,
        R.drawable.card_2,
        R.drawable.card_3,
        // Adaugă imagini pentru cărți adiționale aici
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardImageView = findViewById(R.id.cardImageView);
        drawButton = findViewById(R.id.drawButton);

        drawButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawCard();
            }
        });
    }

    private void drawCard() {
        Random random = new Random();
        int cardIndex = random.nextInt(cardImages.length);
        int imageId = cardImages[cardIndex];
        cardImageView.setImageResource(imageId);
    }
}
