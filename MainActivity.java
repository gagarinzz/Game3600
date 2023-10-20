package com.example.a3606;


import static com.example.a3606.Logic.l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity<multipliedValue, stringValue> extends AppCompatActivity {

    public static int[] array;
    //private static String textView29;
    private TextView textView8;
    private TextView textView16;
    private TextView textView29;
    private TextView textView14;
    private int counter = 0;
    private String firstCard;
    private String firstCard2;
    private String strValue2;
    private String stringValue;
    int k1;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем текст из текстовых полей
        TextView T2 = findViewById(R.id.T2);
        TextView T1 = findViewById(R.id.T1);
        String text2 = T2.getText().toString();
        String text1 = T1.getText().toString();

        // Вычисляем половину длины текста
        int halfway2 = text2.length() / 2;
        int halfway1 = (text1.length() / 2) + 4;

        // Создаем SpannableString для изменения цвета текста
        SpannableString spannableString2 = new SpannableString(text2);
        SpannableString spannableString1 = new SpannableString(text1);

        // Устанавливаем красный цвет для первой половины текста
        spannableString2.setSpan(new ForegroundColorSpan(Color.RED), 0, halfway2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString1.setSpan(new ForegroundColorSpan(Color.RED), 0, halfway1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Устанавливаем обновленный текст с различными стилями
        T2.setText(spannableString2);
        T1.setText(spannableString1);

        // Инициализация счетчика и кнопок
        textView8 = findViewById(R.id.textView8);
        textView16 = findViewById(R.id.textView16);
        textView29 = findViewById(R.id.textView29);
        textView14 = findViewById(R.id.textView14);
        Button button4 = findViewById(R.id.button4);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);
        Button button24 = findViewById(R.id.button24);

        // Устанавливаем обработчик нажатия для кнопки Increment (для textView8)
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCounterByValue(1, textView8);
            }
        });

        // Устанавливаем обработчик нажатия для кнопки Increment (для textView8)
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCounterByValue(5, textView8);
            }
        });

        // Устанавливаем обработчик нажатия для кнопки Increment (для textView8)
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCounterByValue(10, textView8);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCounterByValue(50, textView8);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCounterByValue(100, textView8);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCounterByValue(0, textView8);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCounter();  // Вызываем метод сброса счётчика
            }
        });

        // Инициализация колоды и перемешивание
        List<String> deck = initializeDeck();
        Random random = new Random();

        // Генерация случайного целого числа от 0 до 51
        // Создание массива от 0 до 51
        Integer[] array = new Integer[52];
        for (int i = 0; i < 52; i++) {
            array[i] = i;
        }






    // Перемешивание массива
    List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        int z = (array[0])+1;



// Преобразование обратно в массив (если необходимо)



        //int randomNumber = random.nextInt(52);
        //shuffleDeck(deck);

        // Получаем первую карту из колоды
        String firstCard = deck.get(array[0]);
        //String firstCard2 = deck.get(array[0]);
        String strValue = new String();
        int k1 = Logic.k;
        strValue2 = Integer.toString(k1);
        //String strValue2 = ;
        // Устанавливаем первую карту в TextView
        textView29.setText(firstCard);
        //int z=0;
        //int y=0;
        //int x=0;
        int x = (z+12)/13;
        int y = 12+z-((13*x)-1);
        String stringValue = String.valueOf(z);
        textView16.setText(stringValue);
        //textView14.setText(firstCard);
        //textView14.setText(firstCard2);
        //textView14.setText(strValue2);
        //textView14.(z);
    }

    private void incrementCounterByValue(int value, TextView textView) {
        counter += value;
        textView.setText(String.valueOf(counter));
    }

    private void resetCounter() {
        counter = 0;
        textView8.setText(String.valueOf(counter));
    }

    private List<String> initializeDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"\u2665", "\u2666", "\u2663", "\u2664"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }
        return deck;
    }

    //private void shuffleDeck(List<String> deck) {
        //Collections.shuffle(deck);
    //}

    //textView8.set.Integer z;
    

    private int multiplyRank(String deck) {
        String[] parts = deck.split(" ");//public static int multiplyRank(String input) {
        // Разбиваем входную строку по пробелу
        //String[] parts = textView29.split(" ");
        int multipliedValue = multiplyRank(firstCard);
        //textView14.setText(String.valueOf(multipliedValue));

        return multipliedValue;
    }}