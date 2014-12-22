package com.laras.learning_tenses;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;
public class latihan extends Activity {
	public int index, index2, index3, index4, index5, index6, index7, index8,
	index9, index10, jumlah;
	public int hasil1, hasil2, hasil3, hasil4, hasil5, hasil6, hasil7, hasil8,
	hasil9, hasil10;
	public static int nilai = 0;
	public TextView ba, bb, bc, bd, be, bf, bg, bh, bi, bj;
	public Spinner soal1, soal2, soal3, soal4, soal5, soal6, soal7, soal8,
	soal9, soal10;
	public Button submit;
	public static int mHasil = 0;
	public String jawaban,jawaban1,kunciString;
	public static String jwaban="";
	
	String[] pert1 = { " Pilih jawaban", "A. Went", "B. Goes" };
	String[] pert2 = { " Pilih jawaban ", "A. Don't ", "B. Doest'n" };
	String[] pert3 = { " Pilih jawaban", "A. will", "B. Wold"};
	String[] pert4 = { " Pilih jawaban", "A. Drank", "B. Drunk"};
	String[] pert5 = { " Pilih jawaban", "A. Come", "B. Came" };
	String[] pert6 = { " Pilih jawaban", "A. Visiting", "B. Visit" };
	String[] pert7 = { " Pilih jawaban ", "A.Call", "B. Called" };
	String[] pert8 = { " Pilih jawaban ", "A. Study", "B. Studies" };
	String[] pert9 = { " Pilih jawaban ", "A.like", "B. likes"};
	String[] pert10 = { " Pilih jawaban ", "A. like-go", "B. likes-Goes"};
	int[] kunci = { 1, 3, 2, 3, 1, 2, 3, 2, 3, 1 };
	int[] soal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.latihansoal);

    ba = (TextView) findViewById(R.id.ba);
    bb = (TextView) findViewById(R.id.bb);
    bc = (TextView) findViewById(R.id.bc);
    bd = (TextView) findViewById(R.id.bd);
    be = (TextView) findViewById(R.id.be);
    bf = (TextView) findViewById(R.id.bf);
    bg = (TextView) findViewById(R.id.bg);
    bh = (TextView) findViewById(R.id.bh);
    bi = (TextView) findViewById(R.id.bi);
    bj = (TextView) findViewById(R.id.bj);
    
    soal1 = (Spinner) findViewById(R.id.soal1);
    soal2 = (Spinner) findViewById(R.id.soal2);
    soal3 = (Spinner) findViewById(R.id.soal3);
    soal4 = (Spinner) findViewById(R.id.soal4);
    soal5 = (Spinner) findViewById(R.id.soal5);
    soal6 = (Spinner) findViewById(R.id.soal6);
    soal7 = (Spinner) findViewById(R.id.soal7);
    soal8 = (Spinner) findViewById(R.id.soal8);
    soal9 = (Spinner) findViewById(R.id.soal9);
    soal10 = (Spinner) findViewById(R.id.soal10);
    
    submit = (Button) findViewById(R.id.submit);
    ba.setText("1. Lisa .... to market yesterday");
    bb.setText("2. Vera and Silvia .... go to School ");
    bc.setText("3. She.... come tonight ");
    bd.setText("4. Tono.... a glass of milk yesterday");
    be.setText("5. Yanti had....when Rina came ");
    bf.setText("6. He is going to... his grandmother tomorrow ");
    bg.setText("7. Mia is eating when Nia....");
    bh.setText("8. Rudy was sleeping when Fahri....");
    bi.setText("9. Do he...your house ");
    bj.setText("10. Toni... to swim and he..to swimming pool everyweek");

    ArrayAdapter<String> pil1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, pert1);
   pil1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
   soal1.setAdapter(pil1);
   soal1.setOnItemSelectedListener(new OnItemSelectedListener() {
   public void onItemSelected(AdapterView<?> arg0, View arg1,
   int arg2, long arg3) {
   index = soal1.getSelectedItemPosition();
    		}

   public void onNothingSelected(AdapterView<?> arg0) {
    }
    });
   ArrayAdapter<String> pil2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, pert2);
   pil2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
   soal2.setAdapter(pil2);
   soal2.setOnItemSelectedListener(new OnItemSelectedListener() {
   public void onItemSelected(AdapterView<?> arg0, View arg1,
    int arg2, long arg3) {
    index2 = soal2.getSelectedItemPosition();
    		}

    		public void onNothingSelected(AdapterView<?> arg0) {
    		}
    		});
    		ArrayAdapter<String> pil4 = new ArrayAdapter<String>(this,
    				android.R.layout.simple_spinner_item, pert4);
    				pil4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    				soal4.setAdapter(pil4);
    				soal4.setOnItemSelectedListener(new OnItemSelectedListener()
    				{
    				public void onItemSelected(AdapterView<?> arg0, View arg1,
    				int arg2, long arg3) {
    				index4 = soal4.getSelectedItemPosition();
    				}

    				public void onNothingSelected(AdapterView<?> arg0) {
    				}
    				});
    				
ArrayAdapter<String> pil5 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, pert5);
    				pil5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    				soal5.setAdapter(pil5);
    				soal5.setOnItemSelectedListener(new OnItemSelectedListener() {
    				public void onItemSelected(AdapterView<?> arg0, View arg1,
    				int arg2, long arg3) {
    				index5 = soal5.getSelectedItemPosition();
    				}

    				public void onNothingSelected(AdapterView<?> arg0) {
    				}
    				});

    				ArrayAdapter<String> pil6 = new ArrayAdapter<String>(this,
    				android.R.layout.simple_spinner_item, pert6);
    				pil6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    				soal6.setAdapter(pil6);
    				soal6.setOnItemSelectedListener(new OnItemSelectedListener() {
    				public void onItemSelected(AdapterView<?> arg0, View arg1,
    				int arg2, long arg3) {
    				index6 = soal6.getSelectedItemPosition();
    				}

    				public void onNothingSelected(AdapterView<?> arg0) {
    				}
    				});
    				ArrayAdapter<String> pil7 = new ArrayAdapter<String>(this,
    				android.R.layout.simple_spinner_item, pert7);
    				pil7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    				soal7.setAdapter(pil7);
    				soal7.setOnItemSelectedListener(new OnItemSelectedListener() {
    				public void onItemSelected(AdapterView<?> arg0, View arg1,
    				int arg2, long arg3) {
    				index7 = soal7.getSelectedItemPosition();
    				}

    				public void onNothingSelected(AdapterView<?> arg0) {
    				}
    				});
    				ArrayAdapter<String> pil8 = new ArrayAdapter<String>(this,
    				android.R.layout.simple_spinner_item, pert8);
    				pil8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    				soal8.setAdapter(pil8);
    				soal8.setOnItemSelectedListener(new OnItemSelectedListener() {
    				public void onItemSelected(AdapterView<?> arg0, View arg1,
    				int arg2, long arg3) {
    				index8 = soal8.getSelectedItemPosition();
    				}

    				public void onNothingSelected(AdapterView<?> arg0) {
    				}
    				});
    				ArrayAdapter<String> pil9 = new ArrayAdapter<String>(this,
    				android.R.layout.simple_spinner_item, pert9);
    				pil9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    				soal9.setAdapter(pil9);
    				soal9.setOnItemSelectedListener(new OnItemSelectedListener() {
    				public void onItemSelected(AdapterView<?> arg0, View arg1,
    				int arg2, long arg3) {
    				index9 = soal9.getSelectedItemPosition();
    				}

    				public void onNothingSelected(AdapterView<?> arg0) {
    				}
    				});
    				ArrayAdapter<String> pil10 = new ArrayAdapter<String>(this,
    				android.R.layout.simple_spinner_item, pert10);
    				pil10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    				soal10.setAdapter(pil10);
    				soal10.setOnItemSelectedListener(new OnItemSelectedListener() {
    				public void onItemSelected(AdapterView<?> arg0, View arg1,
    				int arg2, long arg3) {
    				index10 = soal10.getSelectedItemPosition();
    				}

    				public void onNothingSelected(AdapterView<?> arg0) {
    				}
    				});
    				}

    				public void hitungPoin(View view) {
    				int jwb[] = { index, index2, index3, index4, index5, index6, index7,
    				index8, index9, index10 };
    				int no;

    				for (int i = 0; i < kunci.length; i++) {
    					if (jwb[i]==1){
    						jawaban=" A ";	
    						}else if (jwb[i]==2) {
    						jawaban=" B ";		
    						}else if (jwb[i]==3) {
    						jawaban=" C ";		
    						}else{
    						jawaban=" - ";		
    						}
    					if (kunci[i]==1){
    						kunciString="A";	
    						}else if (kunci[i]==2) {
    						kunciString="B";		
    						}else if (kunci[i]==3) {
    						kunciString="C";		
    						}else{
    						kunciString="Tidak dijawab";		
    						}
    					if (jwb[i] == kunci[i]) {
    					mHasil = mHasil + 10;
    					//ini buat ganti String tulisan pada output hasil nilai, juga yg di nilai.java juga, ini gabung....
    					jawaban1=jawaban+" =>(Benar)=> "+kunciString+" \n";
    					}else{
    					//ini buat ganti String tulisan pada output hasil nilai, juga yg di nilai.java juga, ini gabung....
    					jawaban1=jawaban+" =>(Salah)=> "+kunciString+" \n";
    					}
    				no=i+1;
    				jwaban=jwaban+Integer.toString(no)+". "+jawaban1;
    				}
    				Intent nilaisoal = new Intent(this,nilai.class );
    				nilaisoal.putExtra("mHasil", mHasil);
    				nilaisoal.putExtra("mJwb", jwaban);
    				startActivity(nilaisoal);
    				finish();
    				System.exit(0);
    				}


    				@Override
    				public void onBackPressed(){
    				finish();
    				System.exit(0);
    				}
}
