package com.laras.learning_tenses;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MenuActivity extends Activity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  this.requestWindowFeature(Window.FEATURE_NO_TITLE);
  setContentView(R.layout.menuutama);
 
  Button materi = (Button) findViewById(R.id.button2);
	materi.setOnClickListener(new View.OnClickListener() {
		public void onClick(View materi){
			Intent Intent = new
			Intent(materi.getContext(), materi.class);
			startActivity(Intent);
		}
});
	  Button latihan = (Button) findViewById(R.id.button1);
		latihan.setOnClickListener(new View.OnClickListener() {
			public void onClick(View materi){
				Intent Intent = new
				Intent(materi.getContext(), latihan.class);
				startActivity(Intent);
			}
	});
  
  
 }
}
