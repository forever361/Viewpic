package com.aiduo.viewpic;
import java.util.ArrayList;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
private ViewPager viewPager;
private ArrayList<View> pageview;

private TextView tv_indicator;

private MediaPlayer mediaPlayer1;
private MediaPlayer mediaPlayer2;
private MediaPlayer mediaPlayer3;
	private MediaPlayer mediaPlayer4;
	private MediaPlayer mediaPlayer5;
	private MediaPlayer mediaPlayer6;
	private MediaPlayer mediaPlayer7;
	private MediaPlayer mediaPlayer8;
	private MediaPlayer mediaPlayer9;
	private MediaPlayer mediaPlayer10;
	private MediaPlayer mediaPlayer11;
	private MediaPlayer mediaPlayer12;


private ImageView imageView; 
private ImageView[] imageViews; 
//��������LinearLayout
private ViewGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/////////////////////隐藏标题栏和状态栏////////////////////
		supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
		int flag= WindowManager.LayoutParams.FLAG_FULLSCREEN;
		Window window = getWindow();
		window.setFlags(flag, flag);
/////////////////////隐藏标题栏和状态栏////////////////////
        
        setContentView(R.layout.main);
		Toast.makeText(MainActivity.this, "第1页", Toast.LENGTH_SHORT).show();
		mediaPlayer1=MediaPlayer.create(MainActivity.this,R.raw.a1);
		mediaPlayer2=MediaPlayer.create(MainActivity.this,R.raw.a2);
		mediaPlayer3=MediaPlayer.create(MainActivity.this,R.raw.a3);
		mediaPlayer4=MediaPlayer.create(MainActivity.this,R.raw.a4);
		mediaPlayer5=MediaPlayer.create(MainActivity.this,R.raw.a5);
		mediaPlayer6=MediaPlayer.create(MainActivity.this,R.raw.a6);
		mediaPlayer7=MediaPlayer.create(MainActivity.this,R.raw.a7);
		mediaPlayer8=MediaPlayer.create(MainActivity.this,R.raw.a8);
		mediaPlayer9=MediaPlayer.create(MainActivity.this,R.raw.a9);
		mediaPlayer10=MediaPlayer.create(MainActivity.this,R.raw.a10);
		mediaPlayer11=MediaPlayer.create(MainActivity.this,R.raw.a11);
		mediaPlayer12=MediaPlayer.create(MainActivity.this,R.raw.a12);

		mediaPlayer1.start();

        
        viewPager = (ViewPager) findViewById(R.id.viewPager);
		tv_indicator = (TextView) findViewById(R.id.tv_indicator);
        
        //���Ҳ����ļ���LayoutInflater.inflate
        LayoutInflater inflater =getLayoutInflater();
        View view1 = inflater.inflate(R.layout.item01, null);
        View view2 = inflater.inflate(R.layout.item02, null);
        View view3 = inflater.inflate(R.layout.item03, null);
		View view4 = inflater.inflate(R.layout.item04, null);
		View view5 = inflater.inflate(R.layout.item05, null);
		View view6 = inflater.inflate(R.layout.item06, null);
		View view7 = inflater.inflate(R.layout.item07, null);
		View view8 = inflater.inflate(R.layout.item08, null);
		View view9 = inflater.inflate(R.layout.item09, null);
		View view10 = inflater.inflate(R.layout.item10, null);
		View view11 = inflater.inflate(R.layout.item11, null);
		View view12 = inflater.inflate(R.layout.item12, null);

        
        //��viewװ������
        pageview =new ArrayList<View>();
        pageview.add(view1);
        pageview.add(view2);
        pageview.add(view3);
		pageview.add(view4);
		pageview.add(view5);
		pageview.add(view6);
		pageview.add(view7);
		pageview.add(view8);
		pageview.add(view9);
		pageview.add(view10);
		pageview.add(view11);
		pageview.add(view12);
               
                
//        group = (ViewGroup)findViewById(R.id.viewGroup);
        
        //�ж�����ͼ���ж��ٸ����
        imageViews = new ImageView[pageview.size()];
//        for(int i =0;i<pageview.size();i++){
//        	imageView = new ImageView(MainActivity.this);
//        	imageView.setLayoutParams(new LayoutParams(20,20));
//        	imageView.setPadding(20, 0, 20, 0);
//        	imageViews[i] = imageView;
        	
        	//Ĭ�ϵ�һ��ͼ��ʾΪѡ��״̬
//        	if (i == 0) {
//                imageViews[i].setBackgroundResource(R.drawable.page_indicator_focused);
//            } else {
//                imageViews[i].setBackgroundResource(R.drawable.page_indicator_unfocused);
//            }
//
//            group.addView(imageViews[i]);
//        }
                             

        
        //��������
        viewPager.setAdapter(mPagerAdapter);
        //�󶨼����¼�
        viewPager.addOnPageChangeListener(new GuidePageChangeListener());
    }
    
    //����������
    PagerAdapter mPagerAdapter = new PagerAdapter(){

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return pageview.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			return arg0==arg1;
		}

		@Override
		 public void destroyItem(View arg0, int arg1, Object arg2) {
	            ((ViewPager) arg0).removeView(pageview.get(arg1));
	        }

		@Override
		public Object instantiateItem(View arg0, int arg1){
			((ViewPager)arg0).addView(pageview.get(arg1));
			return pageview.get(arg1);
		}

    	
    };
    
    
    
    //pageView������
    class GuidePageChangeListener implements OnPageChangeListener{

		@Override
		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub
			tv_indicator.setText(String.valueOf(arg0+1)+"/"+pageview.size());

		}

		@Override
		//����л��ˣ��Ͱѵ�ǰ�ĵ������Ϊѡ�б�������������δѡ�б���
		public void onPageSelected(int arg0) {
			// TODO Auto-generated method stub

			if(arg0+1==1){

				mediaPlayer1.start();

			}
			if(arg0+1==2){

				mediaPlayer2.start();

			}

			if(arg0+1==3){

				mediaPlayer3.start();

			}

			if(arg0+1==4){

				mediaPlayer4.start();

			}

			if(arg0+1==5){

				mediaPlayer5.start();

			}

			if(arg0+1==6){

				mediaPlayer6.start();

			}

			if(arg0+1==7){

				mediaPlayer7.start();

			}

			if(arg0+1==8){

				mediaPlayer8.start();

			}

			if(arg0+1==9){

				mediaPlayer9.start();

			}

			if(arg0+1==10){

				mediaPlayer10.start();

			}

			if(arg0+1==11){

				mediaPlayer11.start();

			}

			if(arg0+1==12){

				mediaPlayer12.start();

			}





			
		}
    	
    }
}
