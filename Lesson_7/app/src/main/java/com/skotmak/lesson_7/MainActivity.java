package com.skotmak.lesson_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvTest;
    private String teststring = "У лукоморья дуб зеленый, <златая> цепь на дубе том";
    private String teststring2 = "У лукоморья дуб <зеленый>, златая цепь на дубе том и днём и <ночью> кот учёный";
    private char ch;
    private String[] array = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTest = findViewById(R.id.tvTest);
        tvTest.setText("");
        /*
        for (int i = 0; i < teststring.length(); i++){
            ch = teststring.charAt(i);
            tvTest.append(String.valueOf(ch));
            tvTest.append("\n");
        }
*/
    //gettextfromsymbol(teststring2);
    gettext(teststring2);

    }
    private void gettextfromsymbol(String textTest){
        int pos1 = textTest.indexOf('<');
        String temp = textTest.substring(pos1 + 1);
        pos1 = temp.indexOf('>');
        String temp2 = temp.substring(0, pos1);
        tvTest.setText(temp2);
    }

    private  void gettext(String textTest){
        for(int i = 0; i < 4; i++) {
            int pos1 = textTest.indexOf('<');
            String temp = textTest.substring(pos1 + 1);
            pos1 = temp.indexOf('>');
            array[i] = temp.substring(0, pos1);
            //tvTest.setText(temp2);
            //ch = teststring.charAt(i);
            tvTest.append(array[i]);
            tvTest.append("\n");
        }
    }
//дз нужно сделать чтобы программа показывала несколько слов в скобках


}