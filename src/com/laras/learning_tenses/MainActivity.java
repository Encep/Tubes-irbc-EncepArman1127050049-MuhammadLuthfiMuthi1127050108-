package com.laras.learning_tenses;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;


public class MainActivity extends  Activity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  this.requestWindowFeature(Window.FEATURE_NO_TITLE);
  setContentView(R.layout.activity_main);
  
  Thread logotimer = new Thread() {
   public void run() {
    try {
     int logotimer = 0;
     while (logotimer < 5000) {
      sleep(100);
      logotimer = logotimer + 100; 
     };
     startActivity(new Intent(getBaseContext(), MenuActivity.class));
    } catch (InterruptedException e) {
     e.printStackTrace();
    } finally {
     finish();
    }
   }
  };
  logotimer.start();
 }
}
