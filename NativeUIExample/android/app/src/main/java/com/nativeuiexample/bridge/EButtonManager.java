package com.nativeuiexample.bridge;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.nativeuiexample.components.EButton;
import com.nativeuiexample.constants.Component;

public class EButtonManager extends SimpleViewManager<EButton> {

    @NonNull
    @Override
    public String getName() {
        return Component.EButton;
    }

    @NonNull
    @Override
    protected EButton createViewInstance(final @NonNull ThemedReactContext reactContext) {
        return new EButton(reactContext);
    }

    @ReactProp(name="text")
    public void setTextProp(final EButton view, final String text) {
        view.setText(text);
    }

    @ReactProp(name="textColor")
    public void setTextColorProp(final EButton view, final String color) {
        view.setTextColor(color);
    }

    @ReactProp(name="backgroundColor")
    public void setBackgroundColorProp(final EButton view, final String color) {
        view.setBackgroundColor(color);
    }

    @ReactProp(name="textSize")
    public void setTextSizeProp(final EButton view, final int size) {
        view.setTextSize(size);
    }

    @ReactProp(name="cornorSize")
    public void setCornorSizeProp(final EButton view, final float size) {
        view.setCornorSize(size);
    }
}