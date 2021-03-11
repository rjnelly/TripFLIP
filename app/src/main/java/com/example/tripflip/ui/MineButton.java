package com.example.tripflip.ui;

import android.content.Context;
import android.widget.Button;

public class MineButton extends androidx.appcompat.widget.AppCompatButton {
    private static final int SIZE = 75;
    public MineButton(Context context) {
        super(context);
        setWidth(SIZE);
        setMinimumWidth(SIZE);
        setMaxWidth(SIZE);
        setMinimumHeight(SIZE);
        setMaxHeight(SIZE);
        setHeight(SIZE);
    }
}
