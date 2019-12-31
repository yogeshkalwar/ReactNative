package com.nativemodulepackageexample.toast;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
import java.util.HashMap;

public class ToastModule extends ReactContextBaseJavaModule {
  private static ReactApplicationContext reactContext;

  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";

  ToastModule(ReactApplicationContext context) {
    super(context);
    reactContext = context;
  }

  /**
   * The purpose of this method is to return the string name of the NativeModule 
   * which represents this class in JavaScript. 
   * So here we will call this ToastExample so that we can access it through React.
   * NativeModules.ToastModule in JavaScript.
   * @return name of module refered by JS code
   */
  @Override
  public String getName() {
    return "ToastModule";
  }

  /**
   * This method returns the constant values exposed to JavaScript.
   * Toast.LENGTH_SHORT will be exposed by ToastModule.SHORT.
   * Toast.LENGTH_LONG will be exposed by ToastModule.LONG.
   * @return maps of JS key to Android constants
   */
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
    constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
    return constants;
  }

  /**
   * This method is exposed to JS code.
   * It will be used as ToastModule.show("Hello", ToastModule.SHORT);
   * All JS exposed method should have @ReactMethod annotation.
   * @param message - String message
   * @param duration - SHORT/LONG duration
   */
  @ReactMethod
  public void show(String message, int duration) {
    Toast.makeText(getReactApplicationContext(), message, duration).show();
  }
}