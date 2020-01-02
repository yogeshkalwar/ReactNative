package com.nativeuiexample.helpers;

import android.content.Context;
import android.graphics.Color;

public class ResourceHelper {

    public static int getColor(final Context context, final String color) {
        int value = Color.WHITE;
        try {
            value = Color.parseColor(color);
        } catch (final IllegalArgumentException e) {
            ELogger.log("ResourceHelperr", String.format("%s color is not valid", color));
        }
        return value;
    }
}
