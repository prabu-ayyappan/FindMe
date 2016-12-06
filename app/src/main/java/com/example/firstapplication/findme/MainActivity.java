//Prabu Author
package com.example.firstapplication.findme;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView randomVegImageView;
    ImageView randomFruitsImageView;
    ImageView randomAnimalsImageView;
    ImageView randomBPImageView;

    ImageView statusimage;
    String backgroundImageName;
    Integer randomChoiceSelect;
    Integer intMusicBefore;
    Integer intMusic;

    HashMap<Integer, String> animalHash = new HashMap<Integer, String>() {
        {
            put(R.drawable.animals_elephant, "animals_elephant");
            put(R.drawable.animals_cat, "animals_cat");
            put(R.drawable.animals_dog, "animals_dog");
            put(R.drawable.animals_goat, "animals_goat");
            put(R.drawable.animals_horse, "animals_horse");
            put(R.drawable.animals_camel, "animals_camel");
            put(R.drawable.animals_cow, "animals_cow");
            put(R.drawable.animals_girafee, "animals_girafee");
            put(R.drawable.animals_lion, "animals_lion");
            put(R.drawable.animals_monkey, "animals_monkey");
            put(R.drawable.animals_rabbit, "animals_rabbit");
            put(R.drawable.animals_sheep, "animals_sheep");
            put(R.drawable.animals_tiger, "animals_tiger");
            put(R.drawable.animals_zeebra, "animals_zeebra");
        }
    };

    HashMap<Integer, String> fruitsHash = new HashMap<Integer, String>() {
        {
            put(R.drawable.fruits_apple, "fruits_apple");
            put(R.drawable.fruits_banana, "fruits_banana");
            put(R.drawable.fruits_pomegranate, "fruits_pomegranate");
            put(R.drawable.fruits_watermelon, "fruits_watermelon");
            put(R.drawable.fruits_dates, "fruits_dates");
            put(R.drawable.fruits_kiwi, "fruits_kiwi");
            put(R.drawable.fruits_fig, "fruits_fig");
            put(R.drawable.fruits_orange, "fruits_orange");
            put(R.drawable.fruits_guava, "fruits_guava");
            put(R.drawable.fruits_grapes, "fruits_grapes");
            put(R.drawable.fruits_papaya, "fruits_papaya");
            put(R.drawable.fruits_strawberry, "fruits_strawberry");
            put(R.drawable.fruits_pineapple, "fruits_pineapple");

        }
    };

    HashMap<Integer, String> vegHash = new HashMap<Integer, String>() {
        {
            put(R.drawable.vegetables_carrot, "vegetables_carrot");
            put(R.drawable.vegetables_beetroot, "vegetables_beetroot");
            put(R.drawable.vegetables_onion, "vegetables_onion");
            put(R.drawable.vegetables_bitterguard, "vegetables_bitterguard");
            put(R.drawable.vegetables_beans, "vegetables_beans");
            put(R.drawable.vegetables_brinjal, "vegetables_brinjal");
            put(R.drawable.vegetables_cauliflower, "vegetables_cauliflower");
            put(R.drawable.vegetables_cucumber, "vegetables_cucumber");
            put(R.drawable.vegetables_radish, "vegetables_radish");
            put(R.drawable.vegetables_drumstick, "vegetables_drumstick");
            put(R.drawable.vegetables_ladiesfinger, "vegetables_ladiesfinger");
            put(R.drawable.vegetables_potato, "vegetables_potato");
            put(R.drawable.vegetables_greenpeas, "vegetables_greenpeas");
            put(R.drawable.vegetables_tomato, "vegetables_tomato");
        }
    };

    HashMap<Integer, String> bpHash = new HashMap<Integer, String>() {{

        put(R.drawable.pb_arm, "bp_arm");
        put(R.drawable.pb_chin, "bp_chin");
        put(R.drawable.pb_eyes, "bp_eyes");
        put(R.drawable.pb_ears, "bp_ears");
        put(R.drawable.pb_face, "bp_face");
        put(R.drawable.pb_foot, "bp_foot");
        put(R.drawable.pb_hand, "bp_hand");
        put(R.drawable.pb_head, "bp_head");
        put(R.drawable.pb_knees, "bp_knees");
        put(R.drawable.pb_leg, "bp_leg");
        put(R.drawable.pb_lips, "bp_lips");
        put(R.drawable.pb_mouth, "bp_mouth");
        put(R.drawable.pb_neck, "bp_neck");
        put(R.drawable.pb_nose, "bp_nose");
        put(R.drawable.pb_teeth, "bp_teeth");
        put(R.drawable.pb_shoulders, "bp_shoulders");
        put(R.drawable.pb_toes, "bp_toes");
        put(R.drawable.pb_tounge, "bp_tounge");

    }};

    HashMap<Integer, Integer> animalHashMusic = new HashMap<Integer, Integer>() {
        {
            put(R.drawable.animals_elephant, R.raw.elephant);
            put(R.drawable.animals_cat, R.raw.cat);
            put(R.drawable.animals_dog, R.raw.dog);
            put(R.drawable.animals_goat, R.raw.goat);
            put(R.drawable.animals_horse, R.raw.horse);
            put(R.drawable.animals_camel, R.raw.camel);
            put(R.drawable.animals_cow, R.raw.cow);
            put(R.drawable.animals_girafee, R.raw.giraffe);
            put(R.drawable.animals_lion, R.raw.lion);
            put(R.drawable.animals_monkey, R.raw.monkey);
            put(R.drawable.animals_rabbit, R.raw.rabbit);
            put(R.drawable.animals_sheep, R.raw.sheep);
            put(R.drawable.animals_tiger, R.raw.tiger);
            put(R.drawable.animals_zeebra, R.raw.zebra);

        }

    };

    HashMap<Integer, Integer> fruitsHashMusic = new HashMap<Integer, Integer>() {
        {
            put(R.drawable.fruits_apple, R.raw.apple);
            put(R.drawable.fruits_banana, R.raw.banana);
            put(R.drawable.fruits_pomegranate, R.raw.pomegranate);
            put(R.drawable.fruits_watermelon, R.raw.watermelon);
            put(R.drawable.fruits_dates, R.raw.dates);
            put(R.drawable.fruits_kiwi, R.raw.kiwi);
            put(R.drawable.fruits_fig, R.raw.fig);
            put(R.drawable.fruits_orange, R.raw.orange);
            put(R.drawable.fruits_guava, R.raw.guava);
            put(R.drawable.fruits_grapes, R.raw.grapes);
            put(R.drawable.fruits_papaya, R.raw.papaya);
            put(R.drawable.fruits_strawberry, R.raw.strawberry);
            put(R.drawable.fruits_pineapple, R.raw.pineapple);
        }
    };


    HashMap<Integer, Integer> vegHashMusic = new HashMap<Integer, Integer>() {
        {
            put(R.drawable.vegetables_carrot, R.raw.carrot);
            put(R.drawable.vegetables_beetroot, R.raw.beetroot);
            put(R.drawable.vegetables_onion, R.raw.onion);
            put(R.drawable.vegetables_bitterguard, R.raw.bitterguard);
            put(R.drawable.vegetables_beans, R.raw.beans);
            put(R.drawable.vegetables_brinjal, R.raw.brinjal);
            put(R.drawable.vegetables_cauliflower, R.raw.cauliflower);
            put(R.drawable.vegetables_cucumber, R.raw.cucumber);
            put(R.drawable.vegetables_radish, R.raw.radish);
            put(R.drawable.vegetables_drumstick, R.raw.drumstick);
            put(R.drawable.vegetables_ladiesfinger, R.raw.ladiesfinger);
            put(R.drawable.vegetables_potato, R.raw.potato);
            put(R.drawable.vegetables_greenpeas, R.raw.greenpeas);
            put(R.drawable.vegetables_tomato, R.raw.tomato);
        }
    };

    HashMap<Integer, String> bpHashMusic = new HashMap<Integer, String>() {{
        put(R.drawable.pb_arm, "pb_arm");
        put(R.drawable.pb_chin, "pb_chin");
        put(R.drawable.pb_eyes, "pb_eyes");
        put(R.drawable.pb_ears, "pb_ears");
        put(R.drawable.pb_face, "pb_face");
        put(R.drawable.pb_foot, "pb_foot");
        put(R.drawable.pb_hand, "pb_hand");
        put(R.drawable.pb_head, "pb_head");
        put(R.drawable.pb_knees, "pb_knees");
        put(R.drawable.pb_leg, "pb_leg");
        put(R.drawable.pb_lips, "pb_lips");
        put(R.drawable.pb_mouth, "pb_mouth");
        put(R.drawable.pb_neck, "pb_neck");
        put(R.drawable.pb_nose, "pb_nose");
        put(R.drawable.pb_teeth, "pb_teeth");
        put(R.drawable.pb_shoulders, "pb_shoulders");
        put(R.drawable.pb_toes, "pb_toes");
        put(R.drawable.pb_tounge, "pb_tounge");
    }};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Configuration config = getResources().getConfiguration();
        if (config.smallestScreenWidthDp >= 600) {
            setContentView(R.layout.activity_main_tab_landscape);
        } else {
            setContentView(R.layout.activity_main_mobile_landscape);
        }

        statusimage = (ImageView) findViewById(R.id.status);

        randomVegImageView = (ImageView) findViewById(R.id.vegetables);
        randomFruitsImageView = (ImageView) findViewById(R.id.fruits);
        randomAnimalsImageView = (ImageView) findViewById(R.id.animalImage);
        randomBPImageView = (ImageView) findViewById(R.id.bodypartImage);

        Random randomAnimal = new Random();
        List<Integer> randomAnimalKeys = new ArrayList<Integer>(animalHash.keySet());
        Integer randomAnimalKey = randomAnimalKeys.get(randomAnimal.nextInt(randomAnimalKeys.size()));

        Random randomFruits = new Random();
        List<Integer> randomFruitsKeys = new ArrayList<Integer>(fruitsHash.keySet());
        Integer randomFruitsKey = randomFruitsKeys.get(randomFruits.nextInt(randomFruitsKeys.size()));

        Random randomVeg = new Random();
        List<Integer> randomVegKeys = new ArrayList<Integer>(vegHash.keySet());
        Integer randomVegKey = randomVegKeys.get(randomVeg.nextInt(randomVegKeys.size()));

        Random randomPB = new Random();
        List<Integer> randomPBKeys = new ArrayList<Integer>(bpHash.keySet());
        Integer randomBPKey = randomPBKeys.get(randomPB.nextInt(randomPBKeys.size()));

        randomVegImageView.setImageResource(randomVegKey);
        randomVegImageView.setTag(randomVegKey);

        randomFruitsImageView.setImageResource(randomFruitsKey);
        randomFruitsImageView.setTag(randomFruitsKey);

        randomAnimalsImageView.setImageResource(randomAnimalKey);
        randomAnimalsImageView.setTag(randomAnimalKey);

        randomBPImageView.setImageResource(randomBPKey);
        randomBPImageView.setTag(randomBPKey);

        Integer max;
        Integer min;

        Random randomChoice = new Random();
        max = 3;
        min = 1;

        randomChoiceSelect = randomChoice.nextInt((max - min) + 1) + min;

        if (randomChoiceSelect == 1) {
            intMusic = animalHashMusic.get(randomAnimalKey);
            intMusicBefore = intMusic;
            final MediaPlayer mpAnimalSound = MediaPlayer.create(this, intMusic);
            mpAnimalSound.start();
        } else if (randomChoiceSelect == 2) {
            intMusic = fruitsHashMusic.get(randomFruitsKey);
            intMusicBefore = intMusic;
            final MediaPlayer mpFruitSound = MediaPlayer.create(this,intMusic);
            mpFruitSound.start();
        } else if (randomChoiceSelect == 3) {
            intMusic = vegHashMusic.get(randomVegKey);
            intMusicBefore = intMusic;
            final MediaPlayer mpVegSound = MediaPlayer.create(this, intMusic);
            mpVegSound.start();
        } 
//        else if (randomChoiceSelect == 4) {
//            intMusic = bpHashMusic.get(randomBPKey);
//            intMusicBefore = intMusic;
//            final MediaPlayer mpBPSound = MediaPlayer.create(this, intMusic);
//            mpBPSound.start();
//        }
        else {
//            System.out.println("Not a valid Category");
        }
    }

    public void repeatSound(View view) {
        final MediaPlayer mpSound = MediaPlayer.create(this, intMusicBefore);
        mpSound.start();
    }

    public void validate(View view) {
        ImageView imageView = (ImageView) view;
        Integer integer = (Integer) imageView.getTag();
        integer = integer == null ? 0 : integer;
        intMusicBefore = intMusic;
        final MediaPlayer mpw = MediaPlayer.create(this, R.raw.wrong);
        final MediaPlayer mpc = MediaPlayer.create(this, R.raw.correct);
        if (randomChoiceSelect == 1 && view.getContentDescription().equals("animals") ) {
            intMusic = animalHashMusic.get(integer);
            if(intMusicBefore == intMusic) {
                statusimage.setBackgroundResource(R.drawable.check_mark);
                mpc.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                }, 2000);
            } else {
                statusimage.setBackgroundResource(R.drawable.wrong_mark);
                mpw.start();
            }
        } else if (randomChoiceSelect == 2 && view.getContentDescription().equals("fruits") ) {
            intMusic = fruitsHashMusic.get(integer);
            if(intMusicBefore == intMusic) {
                statusimage.setBackgroundResource(R.drawable.check_mark);
                mpc.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                }, 2000);

            } else {
                statusimage.setBackgroundResource(R.drawable.wrong_mark);
                mpw.start();
            }
        } else if (randomChoiceSelect == 3 && view.getContentDescription().equals("vegetables") ) {
            intMusic = vegHashMusic.get(integer);
            if(intMusicBefore == intMusic) {
                statusimage.setBackgroundResource(R.drawable.check_mark);
                mpc.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                }, 2000);
            } else {
                statusimage.setBackgroundResource(R.drawable.wrong_mark);
                mpw.start();
            }
        }
//        else if (randomChoiceSelect == 4 && view.getContentDescription().equals("bodyparts") ) {
//            intMusic = BPHashMusic.get(integer);
//            if(intMusicBefore == intMusic) {
//                statusimage.setBackgroundResource(R.drawable.check_mark);
//                mpc.start();
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        Intent intent = getIntent();
//                        finish();
//                        startActivity(intent);
//                    }
//                }, 2000);
//            } else {
//                statusimage.setBackgroundResource(R.drawable.wrong_mark);
//                mpw.start();
//            }
//        }
        else {
            statusimage.setBackgroundResource(R.drawable.wrong_mark);
            mpw.start();
        }
    }
}