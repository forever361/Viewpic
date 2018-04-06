package com.aiduo.viewpic;
import java.util.ArrayList;

import android.app.Activity;
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
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private ViewPager viewPager;
private ArrayList<View> pageview;

private TextView tv_indicator;


private ImageView imageView; 
private ImageView[] imageViews; 
//��������LinearLayout
private ViewGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //�����ޱ�����
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        setContentView(R.layout.main);
        
        viewPager = (ViewPager) findViewById(R.id.viewPager);
		tv_indicator = (TextView) findViewById(R.id.tv_indicator);
        
        //���Ҳ����ļ���LayoutInflater.inflate
        LayoutInflater inflater =getLayoutInflater();
        View view1 = inflater.inflate(R.layout.item01, null);
        View view2 = inflater.inflate(R.layout.item02, null);
        View view3 = inflater.inflate(R.layout.item03, null);
        
        //��viewװ������
        pageview =new ArrayList<View>();
        pageview.add(view1);
        pageview.add(view2);
        pageview.add(view3);
               
                
//        group = (ViewGroup)findViewById(R.id.viewGroup);
        
        //�ж�����ͼ���ж��ٸ����
        imageViews = new ImageView[pageview.size()];
        for(int i =0;i<pageview.size();i++){
        	imageView = new ImageView(MainActivity.this);
        	imageView.setLayoutParams(new LayoutParams(20,20));
        	imageView.setPadding(20, 0, 20, 0); 
        	imageViews[i] = imageView;   
        	
        	//Ĭ�ϵ�һ��ͼ��ʾΪѡ��״̬
        	if (i == 0) {  
                imageViews[i].setBackgroundResource(R.drawable.page_indicator_focused);  
            } else {  
                imageViews[i].setBackgroundResource(R.drawable.page_indicator_unfocused);  
            }  
            
//            group.addView(imageViews[i]);
        }
                             

        
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
//			for(int i=0;i<imageViews.length;i++){
//				imageViews[arg0].setBackgroundResource(R.drawable.page_indicator_focused);
//				 if (arg0 != i) {
//	                    imageViews[i].setBackgroundResource(R.drawable.page_indicator_unfocused);
//	                }
//			}


			
		}
    	
    }
}
