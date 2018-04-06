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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

	private ViewPager viewPager;
	private ArrayList<View> pageview;

	private TextView tv_indicator;

	private Button mbutton;
	private Button mbutton_a;
	private Button mbutton_b;

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
	private MediaPlayer mediaPlayer13;
	private MediaPlayer mediaPlayer14;
	private MediaPlayer mediaPlayer15;
	private MediaPlayer mediaPlayer16;
	private MediaPlayer mediaPlayer17;
	private MediaPlayer mediaPlayer18;
	private MediaPlayer mediaPlayer19;
	private MediaPlayer mediaPlayer20;
	private MediaPlayer mediaPlayer21;
	private MediaPlayer mediaPlayer22;
	private MediaPlayer mediaPlayer23;
	private MediaPlayer mediaPlayer24;
	private MediaPlayer mediaPlayer25;
	private MediaPlayer mediaPlayer26;
	private MediaPlayer mediaPlayer27;
	private MediaPlayer mediaPlayer28;
	private MediaPlayer mediaPlayer29;
	private MediaPlayer mediaPlayer30;
	private MediaPlayer mediaPlayer31;
	private MediaPlayer mediaPlayer32;
	private MediaPlayer mediaPlayer33;
	private MediaPlayer mediaPlayer34;
	private MediaPlayer mediaPlayer35;
	private MediaPlayer mediaPlayer36;
	private MediaPlayer mediaPlayer37;
	private MediaPlayer mediaPlayer38;
	private MediaPlayer mediaPlayer39;
	private MediaPlayer mediaPlayer40;
	private MediaPlayer mediaPlayer41;
	private MediaPlayer mediaPlayer42;
	private MediaPlayer mediaPlayer43;
	private MediaPlayer mediaPlayer44;
	private MediaPlayer mediaPlayer45;
	private MediaPlayer mediaPlayer46;
	private MediaPlayer mediaPlayer47;
	private MediaPlayer mediaPlayer48;
	private MediaPlayer mediaPlayer49;
	private MediaPlayer mediaPlayer50;
	private MediaPlayer mediaPlayer51;
	private MediaPlayer mediaPlayer52;

	private MediaPlayer mediaPlayer_b1;
	private MediaPlayer mediaPlayer_c1;


	private ImageView imageView;
	private ImageView[] imageViews;
	//��������LinearLayout
	private ViewGroup group;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
/////////////////////隐藏标题栏和状态栏////////////////////
		supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
		int flag = WindowManager.LayoutParams.FLAG_FULLSCREEN;
		Window window = getWindow();
		window.setFlags(flag, flag);
/////////////////////隐藏标题栏和状态栏////////////////////


		mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.a1);
		mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.a2);
		mediaPlayer3 = MediaPlayer.create(MainActivity.this, R.raw.a3);
		mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.a4);
		mediaPlayer5 = MediaPlayer.create(MainActivity.this, R.raw.a5);
		mediaPlayer6 = MediaPlayer.create(MainActivity.this, R.raw.a6);
		mediaPlayer7 = MediaPlayer.create(MainActivity.this, R.raw.a7);
		mediaPlayer8 = MediaPlayer.create(MainActivity.this, R.raw.a8);
		mediaPlayer9 = MediaPlayer.create(MainActivity.this, R.raw.a9);
		mediaPlayer10 = MediaPlayer.create(MainActivity.this, R.raw.a10);
		mediaPlayer11 = MediaPlayer.create(MainActivity.this, R.raw.a11);
		mediaPlayer12 = MediaPlayer.create(MainActivity.this, R.raw.a12);
		mediaPlayer13 = MediaPlayer.create(MainActivity.this, R.raw.a13);
		mediaPlayer14 = MediaPlayer.create(MainActivity.this, R.raw.a14);
		mediaPlayer15 = MediaPlayer.create(MainActivity.this, R.raw.a15);
		mediaPlayer16 = MediaPlayer.create(MainActivity.this, R.raw.a16);
		mediaPlayer17 = MediaPlayer.create(MainActivity.this, R.raw.a17);
		mediaPlayer18 = MediaPlayer.create(MainActivity.this, R.raw.a18);
		mediaPlayer19 = MediaPlayer.create(MainActivity.this, R.raw.a19);
		mediaPlayer20 = MediaPlayer.create(MainActivity.this, R.raw.a20);
		mediaPlayer21 = MediaPlayer.create(MainActivity.this, R.raw.a21);
		mediaPlayer22 = MediaPlayer.create(MainActivity.this, R.raw.a22);
		mediaPlayer23 = MediaPlayer.create(MainActivity.this, R.raw.a23);
		mediaPlayer24 = MediaPlayer.create(MainActivity.this, R.raw.a24);
		mediaPlayer25 = MediaPlayer.create(MainActivity.this, R.raw.a25);
		mediaPlayer26 = MediaPlayer.create(MainActivity.this, R.raw.a26);
		mediaPlayer27 = MediaPlayer.create(MainActivity.this, R.raw.a27);
		mediaPlayer28 = MediaPlayer.create(MainActivity.this, R.raw.a28);
		mediaPlayer29 = MediaPlayer.create(MainActivity.this, R.raw.a29);
		mediaPlayer30 = MediaPlayer.create(MainActivity.this, R.raw.a30);
		mediaPlayer31 = MediaPlayer.create(MainActivity.this, R.raw.a31);
		mediaPlayer32 = MediaPlayer.create(MainActivity.this, R.raw.a32);
		mediaPlayer33 = MediaPlayer.create(MainActivity.this, R.raw.a33);
		mediaPlayer34 = MediaPlayer.create(MainActivity.this, R.raw.a34);
		mediaPlayer35 = MediaPlayer.create(MainActivity.this, R.raw.a35);
		mediaPlayer36 = MediaPlayer.create(MainActivity.this, R.raw.a36);
		mediaPlayer37 = MediaPlayer.create(MainActivity.this, R.raw.a37);
		mediaPlayer38 = MediaPlayer.create(MainActivity.this, R.raw.a38);
		mediaPlayer39 = MediaPlayer.create(MainActivity.this, R.raw.a39);
		mediaPlayer40 = MediaPlayer.create(MainActivity.this, R.raw.a40);
		mediaPlayer41 = MediaPlayer.create(MainActivity.this, R.raw.a41);
		mediaPlayer42 = MediaPlayer.create(MainActivity.this, R.raw.a42);
		mediaPlayer43 = MediaPlayer.create(MainActivity.this, R.raw.a43);
		mediaPlayer44 = MediaPlayer.create(MainActivity.this, R.raw.a44);
		mediaPlayer45 = MediaPlayer.create(MainActivity.this, R.raw.a45);
		mediaPlayer46 = MediaPlayer.create(MainActivity.this, R.raw.a46);
		mediaPlayer47 = MediaPlayer.create(MainActivity.this, R.raw.a47);
		mediaPlayer48 = MediaPlayer.create(MainActivity.this, R.raw.a48);
		mediaPlayer49 = MediaPlayer.create(MainActivity.this, R.raw.a49);
		mediaPlayer50 = MediaPlayer.create(MainActivity.this, R.raw.a50);
		mediaPlayer51 = MediaPlayer.create(MainActivity.this, R.raw.a51);
		mediaPlayer52 = MediaPlayer.create(MainActivity.this, R.raw.a52);
		mediaPlayer_b1 = MediaPlayer.create(MainActivity.this, R.raw.b1);
		mediaPlayer_c1 = MediaPlayer.create(MainActivity.this, R.raw.c1);

		setContentView(R.layout.main);



		mbutton = (Button) findViewById(R.id.button);
		mbutton_a = (Button) findViewById(R.id.button_a);
		mbutton_b = (Button) findViewById(R.id.button_b);

		mbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch (v.getId()) {
					case R.id.button:
						if (mediaPlayer1 != null) {
							mediaPlayer1.stop();
							mediaPlayer1.release();
							mediaPlayer1 = null;
						}
						mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.b1);
						mediaPlayer1.start();
						break;
				}
			}
		});
		mbutton_a.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch (v.getId()) {
					case R.id.button_a:
						if (mediaPlayer1 != null) {
							mediaPlayer1.stop();
							mediaPlayer1.release();
							mediaPlayer1 = null;
						}
						mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.c1);
						mediaPlayer1.start();
						break;
				}
			}
		});

		mbutton_b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch (v.getId()) {
					case R.id.button_b:
						if (mediaPlayer1 != null) {
							mediaPlayer1.stop();
							mediaPlayer1.release();
							mediaPlayer1 = null;
						}
						mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.a1);
						mediaPlayer1.start();
						break;
				}
			}
		});


		viewPager = (ViewPager) findViewById(R.id.viewPager);
		tv_indicator = (TextView) findViewById(R.id.tv_indicator);

		//���Ҳ����ļ���LayoutInflater.inflate
		LayoutInflater inflater = getLayoutInflater();
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
		View view13 = inflater.inflate(R.layout.item13, null);
		View view14 = inflater.inflate(R.layout.item14, null);
		View view15 = inflater.inflate(R.layout.item15, null);
		View view16 = inflater.inflate(R.layout.item16, null);
		View view17 = inflater.inflate(R.layout.item17, null);
		View view18 = inflater.inflate(R.layout.item18, null);
		View view19 = inflater.inflate(R.layout.item19, null);
		View view20 = inflater.inflate(R.layout.item20, null);
		View view21 = inflater.inflate(R.layout.item21, null);
		View view22 = inflater.inflate(R.layout.item22, null);
		View view23 = inflater.inflate(R.layout.item23, null);
		View view24 = inflater.inflate(R.layout.item24, null);
		View view25 = inflater.inflate(R.layout.item25, null);
		View view26 = inflater.inflate(R.layout.item26, null);
		View view27 = inflater.inflate(R.layout.item27, null);
		View view28 = inflater.inflate(R.layout.item28, null);
		View view29 = inflater.inflate(R.layout.item29, null);
		View view30 = inflater.inflate(R.layout.item30, null);
		View view31 = inflater.inflate(R.layout.item31, null);
		View view32 = inflater.inflate(R.layout.item32, null);
		View view33 = inflater.inflate(R.layout.item33, null);
		View view34 = inflater.inflate(R.layout.item34, null);
		View view35 = inflater.inflate(R.layout.item35, null);
		View view36 = inflater.inflate(R.layout.item36, null);
		View view37 = inflater.inflate(R.layout.item37, null);
		View view38 = inflater.inflate(R.layout.item38, null);
		View view39 = inflater.inflate(R.layout.item39, null);
		View view40 = inflater.inflate(R.layout.item40, null);
		View view41 = inflater.inflate(R.layout.item41, null);
		View view42 = inflater.inflate(R.layout.item42, null);
		View view43 = inflater.inflate(R.layout.item43, null);
		View view44 = inflater.inflate(R.layout.item44, null);
		View view45 = inflater.inflate(R.layout.item45, null);
		View view46 = inflater.inflate(R.layout.item46, null);
		View view47 = inflater.inflate(R.layout.item47, null);
		View view48 = inflater.inflate(R.layout.item48, null);
		View view49 = inflater.inflate(R.layout.item49, null);
		View view50 = inflater.inflate(R.layout.item50, null);
		View view51 = inflater.inflate(R.layout.item51, null);
		View view52 = inflater.inflate(R.layout.item52, null);


		//��viewװ������
		pageview = new ArrayList<View>();
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
		pageview.add(view13);
		pageview.add(view14);
		pageview.add(view15);
		pageview.add(view16);
		pageview.add(view17);
		pageview.add(view18);
		pageview.add(view19);
		pageview.add(view20);
		pageview.add(view21);
		pageview.add(view22);
		pageview.add(view23);
		pageview.add(view24);
		pageview.add(view25);
		pageview.add(view26);
		pageview.add(view27);
		pageview.add(view28);
		pageview.add(view29);
		pageview.add(view30);
		pageview.add(view31);
		pageview.add(view32);
		pageview.add(view33);
		pageview.add(view34);
		pageview.add(view35);
		pageview.add(view36);
		pageview.add(view37);
		pageview.add(view38);
		pageview.add(view39);
		pageview.add(view40);
		pageview.add(view41);
		pageview.add(view42);
		pageview.add(view43);
		pageview.add(view44);
		pageview.add(view45);
		pageview.add(view46);
		pageview.add(view47);
		pageview.add(view48);
		pageview.add(view49);
		pageview.add(view50);
		pageview.add(view51);
		pageview.add(view52);


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
	PagerAdapter mPagerAdapter = new PagerAdapter() {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return pageview.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			return arg0 == arg1;
		}

		@Override
		public void destroyItem(View arg0, int arg1, Object arg2) {
			((ViewPager) arg0).removeView(pageview.get(arg1));
		}

		@Override
		public Object instantiateItem(View arg0, int arg1) {
			((ViewPager) arg0).addView(pageview.get(arg1));
			return pageview.get(arg1);
		}


	};


	//pageView������
	class GuidePageChangeListener implements OnPageChangeListener {

		@Override
		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub
			tv_indicator.setText(String.valueOf(arg0 + 1) + "/" + pageview.size());

		}

		@Override
		//����л��ˣ��Ͱѵ�ǰ�ĵ������Ϊѡ�б�������������δѡ�б���
		public void onPageSelected(int arg0) {
			// TODO Auto-generated method stub

			if (arg0 + 1 == 1) {
				mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.a1);
				if (mediaPlayer2 != null) {
					mediaPlayer2.stop();
					mediaPlayer2.release();
					mediaPlayer2 = null;
				}
				mediaPlayer1.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer1 != null) {
								mediaPlayer1.stop();
								mediaPlayer1.release();
								mediaPlayer1 = null;
							}
								mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.b1);
								mediaPlayer1.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer1 != null) {
									mediaPlayer1.stop();
									mediaPlayer1.release();
									mediaPlayer1 = null;
								}
								mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.c1);
								mediaPlayer1.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer1 != null) {
									mediaPlayer1.stop();
									mediaPlayer1.release();
									mediaPlayer1 = null;
								}
								mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.a1);
								mediaPlayer1.start();
								break;
						}
					}
				});


			}

				if (arg0 + 1 == 2) {
					mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.a2);
					if (mediaPlayer1 != null) {
						mediaPlayer1.stop();
						mediaPlayer1.release();
						mediaPlayer1 = null;
					} else if (mediaPlayer3 != null) {
						mediaPlayer3.stop();
						mediaPlayer3.release();
						mediaPlayer3 = null;
					}
					mediaPlayer2.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer2 != null) {
										mediaPlayer2.stop();
										mediaPlayer2.release();
										mediaPlayer2 = null;
									}
									mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.b2);
									mediaPlayer2.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer2 != null) {
										mediaPlayer2.stop();
										mediaPlayer2.release();
										mediaPlayer2 = null;
									}
									mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.c2);
									mediaPlayer2.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer2 != null) {
										mediaPlayer2.stop();
										mediaPlayer2.release();
										mediaPlayer2 = null;
									}
									mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.a2);
									mediaPlayer2.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 3) {
					mediaPlayer3 = MediaPlayer.create(MainActivity.this, R.raw.a3);
					if (mediaPlayer2 != null) {
						mediaPlayer2.stop();
						mediaPlayer2.release();
						mediaPlayer2 = null;
					} else if (mediaPlayer4 != null) {
						mediaPlayer4.stop();
						mediaPlayer4.release();
						mediaPlayer4 = null;
					}
					mediaPlayer3.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer3 != null) {
										mediaPlayer3.stop();
										mediaPlayer3.release();
										mediaPlayer3 = null;
									}
									mediaPlayer3 = MediaPlayer.create(MainActivity.this, R.raw.b3);
									mediaPlayer3.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer3 != null) {
										mediaPlayer3.stop();
										mediaPlayer3.release();
										mediaPlayer3 = null;
									}
									mediaPlayer3 = MediaPlayer.create(MainActivity.this, R.raw.c3);
									mediaPlayer3.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer3 != null) {
										mediaPlayer3.stop();
										mediaPlayer3.release();
										mediaPlayer3 = null;
									}
									mediaPlayer3 = MediaPlayer.create(MainActivity.this, R.raw.a3);
									mediaPlayer3.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 4) {
					mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.a4);
					if (mediaPlayer3 != null) {
						mediaPlayer3.stop();
						mediaPlayer3.release();
						mediaPlayer3 = null;
					} else if (mediaPlayer5 != null) {
						mediaPlayer5.stop();
						mediaPlayer5.release();
						mediaPlayer5 = null;
					}
					mediaPlayer4.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer4 != null) {
										mediaPlayer4.stop();
										mediaPlayer4.release();
										mediaPlayer4 = null;
									}
									mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.b4);
									mediaPlayer4.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer4 != null) {
										mediaPlayer4.stop();
										mediaPlayer4.release();
										mediaPlayer4 = null;
									}
									mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.c4);
									mediaPlayer4.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer4 != null) {
										mediaPlayer4.stop();
										mediaPlayer4.release();
										mediaPlayer4 = null;
									}
									mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.a4);
									mediaPlayer4.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 5) {
					mediaPlayer5 = MediaPlayer.create(MainActivity.this, R.raw.a5);
					if (mediaPlayer4 != null) {
						mediaPlayer4.stop();
						mediaPlayer4.release();
						mediaPlayer4 = null;
					} else if (mediaPlayer6 != null) {
						mediaPlayer6.stop();
						mediaPlayer6.release();
						mediaPlayer6 = null;
					}
					mediaPlayer5.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer5 != null) {
										mediaPlayer5.stop();
										mediaPlayer5.release();
										mediaPlayer5 = null;
									}
									mediaPlayer5 = MediaPlayer.create(MainActivity.this, R.raw.b5);
									mediaPlayer5.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer5 != null) {
										mediaPlayer5.stop();
										mediaPlayer5.release();
										mediaPlayer5 = null;
									}
									mediaPlayer5 = MediaPlayer.create(MainActivity.this, R.raw.c5);
									mediaPlayer5.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer5 != null) {
										mediaPlayer5.stop();
										mediaPlayer5.release();
										mediaPlayer5 = null;
									}
									mediaPlayer5 = MediaPlayer.create(MainActivity.this, R.raw.a5);
									mediaPlayer5.start();
									break;
							}
						}
					});


				}

				if (arg0 + 1 == 6) {
					mediaPlayer6 = MediaPlayer.create(MainActivity.this, R.raw.a6);
					if (mediaPlayer5 != null) {
						mediaPlayer5.stop();
						mediaPlayer5.release();
						mediaPlayer5 = null;
					} else if (mediaPlayer7 != null) {
						mediaPlayer7.stop();
						mediaPlayer7.release();
						mediaPlayer7 = null;
					}
					mediaPlayer6.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer6 != null) {
										mediaPlayer6.stop();
										mediaPlayer6.release();
										mediaPlayer6 = null;
									}
									mediaPlayer6 = MediaPlayer.create(MainActivity.this, R.raw.b6);
									mediaPlayer6.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer6 != null) {
										mediaPlayer6.stop();
										mediaPlayer6.release();
										mediaPlayer6 = null;
									}
									mediaPlayer6 = MediaPlayer.create(MainActivity.this, R.raw.c6);
									mediaPlayer6.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer6 != null) {
										mediaPlayer6.stop();
										mediaPlayer6.release();
										mediaPlayer6 = null;
									}
									mediaPlayer6 = MediaPlayer.create(MainActivity.this, R.raw.a6);
									mediaPlayer6.start();
									break;
							}
						}
					});


				}

				if (arg0 + 1 == 7) {
					mediaPlayer7 = MediaPlayer.create(MainActivity.this, R.raw.a7);
					if (mediaPlayer6 != null) {
						mediaPlayer6.stop();
						mediaPlayer6.release();
						mediaPlayer6 = null;
					} else if (mediaPlayer8 != null) {
						mediaPlayer8.stop();
						mediaPlayer8.release();
						mediaPlayer8 = null;
					}
					mediaPlayer7.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer7 != null) {
										mediaPlayer7.stop();
										mediaPlayer7.release();
										mediaPlayer7 = null;
									}
									mediaPlayer7 = MediaPlayer.create(MainActivity.this, R.raw.b7);
									mediaPlayer7.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer7 != null) {
										mediaPlayer7.stop();
										mediaPlayer7.release();
										mediaPlayer7 = null;
									}
									mediaPlayer7 = MediaPlayer.create(MainActivity.this, R.raw.c7);
									mediaPlayer7.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer7 != null) {
										mediaPlayer7.stop();
										mediaPlayer7.release();
										mediaPlayer7 = null;
									}
									mediaPlayer7 = MediaPlayer.create(MainActivity.this, R.raw.a7);
									mediaPlayer7.start();
									break;
							}
						}
					});


				}

				if (arg0 + 1 == 8) {
					mediaPlayer8 = MediaPlayer.create(MainActivity.this, R.raw.a8);
					if (mediaPlayer7 != null) {
						mediaPlayer7.stop();
						mediaPlayer7.release();
						mediaPlayer7 = null;
					} else if (mediaPlayer9 != null) {
						mediaPlayer9.stop();
						mediaPlayer9.release();
						mediaPlayer9 = null;
					}
					mediaPlayer8.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer8 != null) {
										mediaPlayer8.stop();
										mediaPlayer8.release();
										mediaPlayer8 = null;
									}
									mediaPlayer8 = MediaPlayer.create(MainActivity.this, R.raw.b8);
									mediaPlayer8.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer8 != null) {
										mediaPlayer8.stop();
										mediaPlayer8.release();
										mediaPlayer8 = null;
									}
									mediaPlayer8 = MediaPlayer.create(MainActivity.this, R.raw.c8);
									mediaPlayer8.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer8 != null) {
										mediaPlayer8.stop();
										mediaPlayer8.release();
										mediaPlayer8 = null;
									}
									mediaPlayer8 = MediaPlayer.create(MainActivity.this, R.raw.a8);
									mediaPlayer8.start();
									break;
							}
						}
					});


				}

				if (arg0 + 1 == 9) {
					mediaPlayer9 = MediaPlayer.create(MainActivity.this, R.raw.a9);
					if (mediaPlayer8 != null) {
						mediaPlayer8.stop();
						mediaPlayer8.release();
						mediaPlayer8 = null;
					} else if (mediaPlayer10 != null) {
						mediaPlayer10.stop();
						mediaPlayer10.release();
						mediaPlayer10 = null;
					}
					mediaPlayer9.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer9 != null) {
										mediaPlayer9.stop();
										mediaPlayer9.release();
										mediaPlayer9 = null;
									}
									mediaPlayer9 = MediaPlayer.create(MainActivity.this, R.raw.b9);
									mediaPlayer9.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer9 != null) {
										mediaPlayer9.stop();
										mediaPlayer9.release();
										mediaPlayer9 = null;
									}
									mediaPlayer9 = MediaPlayer.create(MainActivity.this, R.raw.c9);
									mediaPlayer9.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer9 != null) {
										mediaPlayer9.stop();
										mediaPlayer9.release();
										mediaPlayer9 = null;
									}
									mediaPlayer9 = MediaPlayer.create(MainActivity.this, R.raw.a9);
									mediaPlayer9.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 10) {
					mediaPlayer10 = MediaPlayer.create(MainActivity.this, R.raw.a10);
					if (mediaPlayer9 != null) {
						mediaPlayer9.stop();
						mediaPlayer9.release();
						mediaPlayer9 = null;
					} else if (mediaPlayer11 != null) {
						mediaPlayer11.stop();
						mediaPlayer11.release();
						mediaPlayer11 = null;
					}
					mediaPlayer10.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer10 != null) {
										mediaPlayer10.stop();
										mediaPlayer10.release();
										mediaPlayer10 = null;
									}
									mediaPlayer10 = MediaPlayer.create(MainActivity.this, R.raw.b10);
									mediaPlayer10.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer10 != null) {
										mediaPlayer10.stop();
										mediaPlayer10.release();
										mediaPlayer10 = null;
									}
									mediaPlayer10 = MediaPlayer.create(MainActivity.this, R.raw.c10);
									mediaPlayer10.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer10 != null) {
										mediaPlayer10.stop();
										mediaPlayer10.release();
										mediaPlayer10 = null;
									}
									mediaPlayer10 = MediaPlayer.create(MainActivity.this, R.raw.a10);
									mediaPlayer10.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 11) {
					mediaPlayer11 = MediaPlayer.create(MainActivity.this, R.raw.a11);
					if (mediaPlayer10 != null) {
						mediaPlayer10.stop();
						mediaPlayer10.release();
						mediaPlayer10 = null;
					} else if (mediaPlayer12 != null) {
						mediaPlayer12.stop();
						mediaPlayer12.release();
						mediaPlayer12 = null;
					}
					mediaPlayer11.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer11 != null) {
										mediaPlayer11.stop();
										mediaPlayer11.release();
										mediaPlayer11 = null;
									}
									mediaPlayer11 = MediaPlayer.create(MainActivity.this, R.raw.b11);
									mediaPlayer11.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer11 != null) {
										mediaPlayer11.stop();
										mediaPlayer11.release();
										mediaPlayer11 = null;
									}
									mediaPlayer11 = MediaPlayer.create(MainActivity.this, R.raw.c11);
									mediaPlayer11.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer11 != null) {
										mediaPlayer11.stop();
										mediaPlayer11.release();
										mediaPlayer11 = null;
									}
									mediaPlayer11 = MediaPlayer.create(MainActivity.this, R.raw.a11);
									mediaPlayer11.start();
									break;
							}
						}
					});

				}
				if (arg0 + 1 == 12) {
					mediaPlayer12 = MediaPlayer.create(MainActivity.this, R.raw.a12);
					if (mediaPlayer11 != null) {
						mediaPlayer11.stop();
						mediaPlayer11.release();
						mediaPlayer11 = null;
					} else if (mediaPlayer13 != null) {
						mediaPlayer13.stop();
						mediaPlayer13.release();
						mediaPlayer13 = null;
					}
					mediaPlayer12.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer12 != null) {
										mediaPlayer12.stop();
										mediaPlayer12.release();
										mediaPlayer12 = null;
									}
									mediaPlayer12 = MediaPlayer.create(MainActivity.this, R.raw.b12);
									mediaPlayer12.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer12 != null) {
										mediaPlayer12.stop();
										mediaPlayer12.release();
										mediaPlayer12 = null;
									}
									mediaPlayer12 = MediaPlayer.create(MainActivity.this, R.raw.c12);
									mediaPlayer12.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer12 != null) {
										mediaPlayer12.stop();
										mediaPlayer12.release();
										mediaPlayer12 = null;
									}
									mediaPlayer12 = MediaPlayer.create(MainActivity.this, R.raw.a12);
									mediaPlayer12.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 13) {
					mediaPlayer13 = MediaPlayer.create(MainActivity.this, R.raw.a13);
					if (mediaPlayer12 != null) {
						mediaPlayer12.stop();
						mediaPlayer12.release();
						mediaPlayer12 = null;
					} else if (mediaPlayer14 != null) {
						mediaPlayer14.stop();
						mediaPlayer14.release();
						mediaPlayer14 = null;
					}
					mediaPlayer13.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer13 != null) {
										mediaPlayer13.stop();
										mediaPlayer13.release();
										mediaPlayer13 = null;
									}
									mediaPlayer13 = MediaPlayer.create(MainActivity.this, R.raw.b13);
									mediaPlayer13.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer13 != null) {
										mediaPlayer13.stop();
										mediaPlayer13.release();
										mediaPlayer13 = null;
									}
									mediaPlayer13 = MediaPlayer.create(MainActivity.this, R.raw.c13);
									mediaPlayer13.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer13 != null) {
										mediaPlayer13.stop();
										mediaPlayer13.release();
										mediaPlayer13 = null;
									}
									mediaPlayer13 = MediaPlayer.create(MainActivity.this, R.raw.a13);
									mediaPlayer13.start();
									break;
							}
						}
					});

				}


				if (arg0 + 1 == 14) {
					mediaPlayer14 = MediaPlayer.create(MainActivity.this, R.raw.a14);
					if (mediaPlayer13 != null) {
						mediaPlayer13.stop();
						mediaPlayer13.release();
						mediaPlayer13 = null;
					} else if (mediaPlayer15 != null) {
						mediaPlayer15.stop();
						mediaPlayer15.release();
						mediaPlayer15 = null;
					}
					mediaPlayer14.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer14 != null) {
										mediaPlayer14.stop();
										mediaPlayer14.release();
										mediaPlayer14 = null;
									}
									mediaPlayer14 = MediaPlayer.create(MainActivity.this, R.raw.b14);
									mediaPlayer14.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer14 != null) {
										mediaPlayer14.stop();
										mediaPlayer14.release();
										mediaPlayer14 = null;
									}
									mediaPlayer14 = MediaPlayer.create(MainActivity.this, R.raw.c14);
									mediaPlayer14.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer14 != null) {
										mediaPlayer14.stop();
										mediaPlayer14.release();
										mediaPlayer14 = null;
									}
									mediaPlayer14 = MediaPlayer.create(MainActivity.this, R.raw.a14);
									mediaPlayer14.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 15) {
					mediaPlayer15 = MediaPlayer.create(MainActivity.this, R.raw.a15);
					if (mediaPlayer14 != null) {
						mediaPlayer14.stop();
						mediaPlayer14.release();
						mediaPlayer14 = null;
					} else if (mediaPlayer16 != null) {
						mediaPlayer16.stop();
						mediaPlayer16.release();
						mediaPlayer16 = null;
					}
					mediaPlayer15.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer15 != null) {
										mediaPlayer15.stop();
										mediaPlayer15.release();
										mediaPlayer15 = null;
									}
									mediaPlayer15 = MediaPlayer.create(MainActivity.this, R.raw.b15);
									mediaPlayer15.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer15 != null) {
										mediaPlayer15.stop();
										mediaPlayer15.release();
										mediaPlayer15 = null;
									}
									mediaPlayer15 = MediaPlayer.create(MainActivity.this, R.raw.c15);
									mediaPlayer15.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer15 != null) {
										mediaPlayer15.stop();
										mediaPlayer15.release();
										mediaPlayer15 = null;
									}
									mediaPlayer15 = MediaPlayer.create(MainActivity.this, R.raw.a15);
									mediaPlayer15.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 16) {
					mediaPlayer16 = MediaPlayer.create(MainActivity.this, R.raw.a16);
					if (mediaPlayer15 != null) {
						mediaPlayer15.stop();
						mediaPlayer15.release();
						mediaPlayer15 = null;
					} else if (mediaPlayer17 != null) {
						mediaPlayer17.stop();
						mediaPlayer17.release();
						mediaPlayer17 = null;
					}
					mediaPlayer16.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer16 != null) {
										mediaPlayer16.stop();
										mediaPlayer16.release();
										mediaPlayer16 = null;
									}
									mediaPlayer16 = MediaPlayer.create(MainActivity.this, R.raw.b16);
									mediaPlayer16.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer16 != null) {
										mediaPlayer16.stop();
										mediaPlayer16.release();
										mediaPlayer16 = null;
									}
									mediaPlayer16 = MediaPlayer.create(MainActivity.this, R.raw.c16);
									mediaPlayer16.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer16 != null) {
										mediaPlayer16.stop();
										mediaPlayer16.release();
										mediaPlayer16 = null;
									}
									mediaPlayer16 = MediaPlayer.create(MainActivity.this, R.raw.a16);
									mediaPlayer16.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 17) {
					mediaPlayer17 = MediaPlayer.create(MainActivity.this, R.raw.a17);
					if (mediaPlayer16 != null) {
						mediaPlayer16.stop();
						mediaPlayer16.release();
						mediaPlayer16 = null;
					} else if (mediaPlayer18 != null) {
						mediaPlayer18.stop();
						mediaPlayer18.release();
						mediaPlayer18 = null;
					}
					mediaPlayer17.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer17 != null) {
										mediaPlayer17.stop();
										mediaPlayer17.release();
										mediaPlayer17 = null;
									}
									mediaPlayer17 = MediaPlayer.create(MainActivity.this, R.raw.b17);
									mediaPlayer17.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer17 != null) {
										mediaPlayer17.stop();
										mediaPlayer17.release();
										mediaPlayer17 = null;
									}
									mediaPlayer17 = MediaPlayer.create(MainActivity.this, R.raw.c17);
									mediaPlayer17.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer17 != null) {
										mediaPlayer17.stop();
										mediaPlayer17.release();
										mediaPlayer17 = null;
									}
									mediaPlayer17 = MediaPlayer.create(MainActivity.this, R.raw.a17);
									mediaPlayer17.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 18) {
					mediaPlayer18 = MediaPlayer.create(MainActivity.this, R.raw.a18);
					if (mediaPlayer17 != null) {
						mediaPlayer17.stop();
						mediaPlayer17.release();
						mediaPlayer17 = null;
					} else if (mediaPlayer19 != null) {
						mediaPlayer19.stop();
						mediaPlayer19.release();
						mediaPlayer19 = null;
					}
					mediaPlayer18.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer18 != null) {
										mediaPlayer18.stop();
										mediaPlayer18.release();
										mediaPlayer18 = null;
									}
									mediaPlayer18 = MediaPlayer.create(MainActivity.this, R.raw.b18);
									mediaPlayer18.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer18 != null) {
										mediaPlayer18.stop();
										mediaPlayer18.release();
										mediaPlayer18 = null;
									}
									mediaPlayer18 = MediaPlayer.create(MainActivity.this, R.raw.c18);
									mediaPlayer18.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer18 != null) {
										mediaPlayer18.stop();
										mediaPlayer18.release();
										mediaPlayer18 = null;
									}
									mediaPlayer18 = MediaPlayer.create(MainActivity.this, R.raw.a18);
									mediaPlayer18.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 19) {
					mediaPlayer19 = MediaPlayer.create(MainActivity.this, R.raw.a19);
					if (mediaPlayer18 != null) {
						mediaPlayer18.stop();
						mediaPlayer18.release();
						mediaPlayer18 = null;
					} else if (mediaPlayer20 != null) {
						mediaPlayer20.stop();
						mediaPlayer20.release();
						mediaPlayer20 = null;
					}
					mediaPlayer19.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer19 != null) {
										mediaPlayer19.stop();
										mediaPlayer19.release();
										mediaPlayer19 = null;
									}
									mediaPlayer19 = MediaPlayer.create(MainActivity.this, R.raw.b19);
									mediaPlayer19.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer19 != null) {
										mediaPlayer19.stop();
										mediaPlayer19.release();
										mediaPlayer19 = null;
									}
									mediaPlayer19 = MediaPlayer.create(MainActivity.this, R.raw.c19);
									mediaPlayer19.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer19 != null) {
										mediaPlayer19.stop();
										mediaPlayer19.release();
										mediaPlayer19 = null;
									}
									mediaPlayer19 = MediaPlayer.create(MainActivity.this, R.raw.a19);
									mediaPlayer19.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 20) {
					mediaPlayer20 = MediaPlayer.create(MainActivity.this, R.raw.a20);
					if (mediaPlayer19 != null) {
						mediaPlayer19.stop();
						mediaPlayer19.release();
						mediaPlayer19 = null;
					} else if (mediaPlayer21 != null) {
						mediaPlayer21.stop();
						mediaPlayer21.release();
						mediaPlayer21 = null;
					}
					mediaPlayer20.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer20 != null) {
										mediaPlayer20.stop();
										mediaPlayer20.release();
										mediaPlayer20 = null;
									}
									mediaPlayer20 = MediaPlayer.create(MainActivity.this, R.raw.b20);
									mediaPlayer20.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer20 != null) {
										mediaPlayer20.stop();
										mediaPlayer20.release();
										mediaPlayer20 = null;
									}
									mediaPlayer20 = MediaPlayer.create(MainActivity.this, R.raw.c20);
									mediaPlayer20.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer20 != null) {
										mediaPlayer20.stop();
										mediaPlayer20.release();
										mediaPlayer20 = null;
									}
									mediaPlayer20 = MediaPlayer.create(MainActivity.this, R.raw.a20);
									mediaPlayer20.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 21) {
					mediaPlayer21 = MediaPlayer.create(MainActivity.this, R.raw.a21);
					if (mediaPlayer20 != null) {
						mediaPlayer20.stop();
						mediaPlayer20.release();
						mediaPlayer20 = null;
					} else if (mediaPlayer22 != null) {
						mediaPlayer22.stop();
						mediaPlayer22.release();
						mediaPlayer22 = null;
					}
					mediaPlayer21.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer21 != null) {
										mediaPlayer21.stop();
										mediaPlayer21.release();
										mediaPlayer21 = null;
									}
									mediaPlayer21 = MediaPlayer.create(MainActivity.this, R.raw.b21);
									mediaPlayer21.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer21 != null) {
										mediaPlayer21.stop();
										mediaPlayer21.release();
										mediaPlayer21 = null;
									}
									mediaPlayer21 = MediaPlayer.create(MainActivity.this, R.raw.c21);
									mediaPlayer21.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer21 != null) {
										mediaPlayer21.stop();
										mediaPlayer21.release();
										mediaPlayer21 = null;
									}
									mediaPlayer21 = MediaPlayer.create(MainActivity.this, R.raw.a21);
									mediaPlayer21.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 22) {
					mediaPlayer22 = MediaPlayer.create(MainActivity.this, R.raw.a22);
					if (mediaPlayer21 != null) {
						mediaPlayer21.stop();
						mediaPlayer21.release();
						mediaPlayer21 = null;
					} else if (mediaPlayer23 != null) {
						mediaPlayer23.stop();
						mediaPlayer23.release();
						mediaPlayer23 = null;
					}
					mediaPlayer22.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer22 != null) {
										mediaPlayer22.stop();
										mediaPlayer22.release();
										mediaPlayer22 = null;
									}
									mediaPlayer22 = MediaPlayer.create(MainActivity.this, R.raw.b22);
									mediaPlayer22.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer22 != null) {
										mediaPlayer22.stop();
										mediaPlayer22.release();
										mediaPlayer22 = null;
									}
									mediaPlayer22 = MediaPlayer.create(MainActivity.this, R.raw.c22);
									mediaPlayer22.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer22 != null) {
										mediaPlayer22.stop();
										mediaPlayer22.release();
										mediaPlayer22 = null;
									}
									mediaPlayer22 = MediaPlayer.create(MainActivity.this, R.raw.a22);
									mediaPlayer22.start();
									break;
							}
						}
					});

				}
				if (arg0 + 1 == 23) {
					mediaPlayer23 = MediaPlayer.create(MainActivity.this, R.raw.a23);
					if (mediaPlayer22 != null) {
						mediaPlayer22.stop();
						mediaPlayer22.release();
						mediaPlayer22 = null;
					} else if (mediaPlayer24 != null) {
						mediaPlayer24.stop();
						mediaPlayer24.release();
						mediaPlayer24 = null;
					}
					mediaPlayer23.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer23 != null) {
										mediaPlayer23.stop();
										mediaPlayer23.release();
										mediaPlayer23 = null;
									}
									mediaPlayer23 = MediaPlayer.create(MainActivity.this, R.raw.b23);
									mediaPlayer23.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer23 != null) {
										mediaPlayer23.stop();
										mediaPlayer23.release();
										mediaPlayer23 = null;
									}
									mediaPlayer23 = MediaPlayer.create(MainActivity.this, R.raw.c23);
									mediaPlayer23.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer23 != null) {
										mediaPlayer23.stop();
										mediaPlayer23.release();
										mediaPlayer23 = null;
									}
									mediaPlayer23 = MediaPlayer.create(MainActivity.this, R.raw.a23);
									mediaPlayer23.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 24) {
					mediaPlayer24 = MediaPlayer.create(MainActivity.this, R.raw.a24);
					if (mediaPlayer23 != null) {
						mediaPlayer23.stop();
						mediaPlayer23.release();
						mediaPlayer23 = null;
					} else if (mediaPlayer25 != null) {
						mediaPlayer25.stop();
						mediaPlayer25.release();
						mediaPlayer25 = null;
					}
					mediaPlayer24.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer24 != null) {
										mediaPlayer24.stop();
										mediaPlayer24.release();
										mediaPlayer24 = null;
									}
									mediaPlayer24 = MediaPlayer.create(MainActivity.this, R.raw.b24);
									mediaPlayer24.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer24 != null) {
										mediaPlayer24.stop();
										mediaPlayer24.release();
										mediaPlayer24 = null;
									}
									mediaPlayer24 = MediaPlayer.create(MainActivity.this, R.raw.c24);
									mediaPlayer24.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer24 != null) {
										mediaPlayer24.stop();
										mediaPlayer24.release();
										mediaPlayer24 = null;
									}
									mediaPlayer24 = MediaPlayer.create(MainActivity.this, R.raw.a24);
									mediaPlayer24.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 25) {
					mediaPlayer25 = MediaPlayer.create(MainActivity.this, R.raw.a25);
					if (mediaPlayer24 != null) {
						mediaPlayer24.stop();
						mediaPlayer24.release();
						mediaPlayer24 = null;
					} else if (mediaPlayer26 != null) {
						mediaPlayer26.stop();
						mediaPlayer26.release();
						mediaPlayer26 = null;
					}
					mediaPlayer25.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer25 != null) {
										mediaPlayer25.stop();
										mediaPlayer25.release();
										mediaPlayer25 = null;
									}
									mediaPlayer25 = MediaPlayer.create(MainActivity.this, R.raw.b25);
									mediaPlayer25.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer25 != null) {
										mediaPlayer25.stop();
										mediaPlayer25.release();
										mediaPlayer25 = null;
									}
									mediaPlayer25 = MediaPlayer.create(MainActivity.this, R.raw.c25);
									mediaPlayer25.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer25 != null) {
										mediaPlayer25.stop();
										mediaPlayer25.release();
										mediaPlayer25 = null;
									}
									mediaPlayer25 = MediaPlayer.create(MainActivity.this, R.raw.a25);
									mediaPlayer25.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 26) {
					mediaPlayer26 = MediaPlayer.create(MainActivity.this, R.raw.a26);
					if (mediaPlayer25 != null) {
						mediaPlayer25.stop();
						mediaPlayer25.release();
						mediaPlayer25 = null;
					} else if (mediaPlayer27 != null) {
						mediaPlayer27.stop();
						mediaPlayer27.release();
						mediaPlayer27 = null;
					}
					mediaPlayer26.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer26 != null) {
										mediaPlayer26.stop();
										mediaPlayer26.release();
										mediaPlayer26 = null;
									}
									mediaPlayer26 = MediaPlayer.create(MainActivity.this, R.raw.b26);
									mediaPlayer26.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer26 != null) {
										mediaPlayer26.stop();
										mediaPlayer26.release();
										mediaPlayer26 = null;
									}
									mediaPlayer26 = MediaPlayer.create(MainActivity.this, R.raw.c26);
									mediaPlayer26.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer26 != null) {
										mediaPlayer26.stop();
										mediaPlayer26.release();
										mediaPlayer26 = null;
									}
									mediaPlayer26 = MediaPlayer.create(MainActivity.this, R.raw.a26);
									mediaPlayer26.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 27) {
					mediaPlayer27 = MediaPlayer.create(MainActivity.this, R.raw.a27);
					if (mediaPlayer26 != null) {
						mediaPlayer26.stop();
						mediaPlayer26.release();
						mediaPlayer26 = null;
					} else if (mediaPlayer28 != null) {
						mediaPlayer28.stop();
						mediaPlayer28.release();
						mediaPlayer28 = null;
					}
					mediaPlayer27.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer27 != null) {
										mediaPlayer27.stop();
										mediaPlayer27.release();
										mediaPlayer27 = null;
									}
									mediaPlayer27 = MediaPlayer.create(MainActivity.this, R.raw.b27);
									mediaPlayer27.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer27 != null) {
										mediaPlayer27.stop();
										mediaPlayer27.release();
										mediaPlayer27 = null;
									}
									mediaPlayer27 = MediaPlayer.create(MainActivity.this, R.raw.c27);
									mediaPlayer27.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer27 != null) {
										mediaPlayer27.stop();
										mediaPlayer27.release();
										mediaPlayer27 = null;
									}
									mediaPlayer27 = MediaPlayer.create(MainActivity.this, R.raw.a27);
									mediaPlayer27.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 28) {
					mediaPlayer28 = MediaPlayer.create(MainActivity.this, R.raw.a28);
					if (mediaPlayer27 != null) {
						mediaPlayer27.stop();
						mediaPlayer27.release();
						mediaPlayer27 = null;
					} else if (mediaPlayer29 != null) {
						mediaPlayer29.stop();
						mediaPlayer29.release();
						mediaPlayer29 = null;
					}
					mediaPlayer28.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer28 != null) {
										mediaPlayer28.stop();
										mediaPlayer28.release();
										mediaPlayer28 = null;
									}
									mediaPlayer28 = MediaPlayer.create(MainActivity.this, R.raw.b28);
									mediaPlayer28.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer28 != null) {
										mediaPlayer28.stop();
										mediaPlayer28.release();
										mediaPlayer28 = null;
									}
									mediaPlayer28 = MediaPlayer.create(MainActivity.this, R.raw.c28);
									mediaPlayer28.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer28 != null) {
										mediaPlayer28.stop();
										mediaPlayer28.release();
										mediaPlayer28 = null;
									}
									mediaPlayer28 = MediaPlayer.create(MainActivity.this, R.raw.a28);
									mediaPlayer28.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 29) {
					mediaPlayer29 = MediaPlayer.create(MainActivity.this, R.raw.a29);
					if (mediaPlayer28 != null) {
						mediaPlayer28.stop();
						mediaPlayer28.release();
						mediaPlayer28 = null;
					} else if (mediaPlayer30 != null) {
						mediaPlayer30.stop();
						mediaPlayer30.release();
						mediaPlayer30 = null;
					}
					mediaPlayer29.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer29 != null) {
										mediaPlayer29.stop();
										mediaPlayer29.release();
										mediaPlayer29 = null;
									}
									mediaPlayer29 = MediaPlayer.create(MainActivity.this, R.raw.b29);
									mediaPlayer29.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer29 != null) {
										mediaPlayer29.stop();
										mediaPlayer29.release();
										mediaPlayer29 = null;
									}
									mediaPlayer29 = MediaPlayer.create(MainActivity.this, R.raw.c29);
									mediaPlayer29.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer29 != null) {
										mediaPlayer29.stop();
										mediaPlayer29.release();
										mediaPlayer29 = null;
									}
									mediaPlayer29 = MediaPlayer.create(MainActivity.this, R.raw.a29);
									mediaPlayer29.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 30) {
					mediaPlayer30 = MediaPlayer.create(MainActivity.this, R.raw.a30);
					if (mediaPlayer29 != null) {
						mediaPlayer29.stop();
						mediaPlayer29.release();
						mediaPlayer29 = null;
					} else if (mediaPlayer31 != null) {
						mediaPlayer31.stop();
						mediaPlayer31.release();
						mediaPlayer31 = null;
					}
					mediaPlayer30.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer30 != null) {
										mediaPlayer30.stop();
										mediaPlayer30.release();
										mediaPlayer30 = null;
									}
									mediaPlayer30 = MediaPlayer.create(MainActivity.this, R.raw.b30);
									mediaPlayer30.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer30 != null) {
										mediaPlayer30.stop();
										mediaPlayer30.release();
										mediaPlayer30 = null;
									}
									mediaPlayer30 = MediaPlayer.create(MainActivity.this, R.raw.c30);
									mediaPlayer30.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer30 != null) {
										mediaPlayer30.stop();
										mediaPlayer30.release();
										mediaPlayer30 = null;
									}
									mediaPlayer30 = MediaPlayer.create(MainActivity.this, R.raw.a30);
									mediaPlayer30.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 31) {
					mediaPlayer31 = MediaPlayer.create(MainActivity.this, R.raw.a31);
					if (mediaPlayer30 != null) {
						mediaPlayer30.stop();
						mediaPlayer30.release();
						mediaPlayer30 = null;
					} else if (mediaPlayer32 != null) {
						mediaPlayer32.stop();
						mediaPlayer32.release();
						mediaPlayer32 = null;
					}
					mediaPlayer31.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer31 != null) {
										mediaPlayer31.stop();
										mediaPlayer31.release();
										mediaPlayer31 = null;
									}
									mediaPlayer31 = MediaPlayer.create(MainActivity.this, R.raw.b31);
									mediaPlayer31.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer31 != null) {
										mediaPlayer31.stop();
										mediaPlayer31.release();
										mediaPlayer31 = null;
									}
									mediaPlayer31 = MediaPlayer.create(MainActivity.this, R.raw.c31);
									mediaPlayer31.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer31 != null) {
										mediaPlayer31.stop();
										mediaPlayer31.release();
										mediaPlayer31 = null;
									}
									mediaPlayer31 = MediaPlayer.create(MainActivity.this, R.raw.a31);
									mediaPlayer31.start();
									break;
							}
						}
					});

				}
				if (arg0 + 1 == 32) {
					mediaPlayer32 = MediaPlayer.create(MainActivity.this, R.raw.a32);
					if (mediaPlayer31 != null) {
						mediaPlayer31.stop();
						mediaPlayer31.release();
						mediaPlayer31 = null;
					} else if (mediaPlayer33 != null) {
						mediaPlayer33.stop();
						mediaPlayer33.release();
						mediaPlayer33 = null;
					}
					mediaPlayer32.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer32 != null) {
										mediaPlayer32.stop();
										mediaPlayer32.release();
										mediaPlayer32 = null;
									}
									mediaPlayer32 = MediaPlayer.create(MainActivity.this, R.raw.b32);
									mediaPlayer32.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer32 != null) {
										mediaPlayer32.stop();
										mediaPlayer32.release();
										mediaPlayer32 = null;
									}
									mediaPlayer32 = MediaPlayer.create(MainActivity.this, R.raw.c32);
									mediaPlayer32.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer32 != null) {
										mediaPlayer32.stop();
										mediaPlayer32.release();
										mediaPlayer32 = null;
									}
									mediaPlayer32 = MediaPlayer.create(MainActivity.this, R.raw.a32);
									mediaPlayer32.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 33) {
					mediaPlayer33 = MediaPlayer.create(MainActivity.this, R.raw.a33);
					if (mediaPlayer32 != null) {
						mediaPlayer32.stop();
						mediaPlayer32.release();
						mediaPlayer32 = null;
					} else if (mediaPlayer34 != null) {
						mediaPlayer34.stop();
						mediaPlayer34.release();
						mediaPlayer34 = null;
					}
					mediaPlayer33.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer33 != null) {
										mediaPlayer33.stop();
										mediaPlayer33.release();
										mediaPlayer33 = null;
									}
									mediaPlayer33 = MediaPlayer.create(MainActivity.this, R.raw.b33);
									mediaPlayer33.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer33 != null) {
										mediaPlayer33.stop();
										mediaPlayer33.release();
										mediaPlayer33 = null;
									}
									mediaPlayer33 = MediaPlayer.create(MainActivity.this, R.raw.c33);
									mediaPlayer33.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer33 != null) {
										mediaPlayer33.stop();
										mediaPlayer33.release();
										mediaPlayer33 = null;
									}
									mediaPlayer33 = MediaPlayer.create(MainActivity.this, R.raw.a33);
									mediaPlayer33.start();
									break;
							}
						}
					});

				}
				if (arg0 + 1 == 34) {
					mediaPlayer34 = MediaPlayer.create(MainActivity.this, R.raw.a34);
					if (mediaPlayer33 != null) {
						mediaPlayer33.stop();
						mediaPlayer33.release();
						mediaPlayer33 = null;
					} else if (mediaPlayer35 != null) {
						mediaPlayer35.stop();
						mediaPlayer35.release();
						mediaPlayer35 = null;
					}
					mediaPlayer34.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer34 != null) {
										mediaPlayer34.stop();
										mediaPlayer34.release();
										mediaPlayer34 = null;
									}
									mediaPlayer34 = MediaPlayer.create(MainActivity.this, R.raw.b34);
									mediaPlayer34.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer34 != null) {
										mediaPlayer34.stop();
										mediaPlayer34.release();
										mediaPlayer34 = null;
									}
									mediaPlayer34 = MediaPlayer.create(MainActivity.this, R.raw.c34);
									mediaPlayer34.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer34 != null) {
										mediaPlayer34.stop();
										mediaPlayer34.release();
										mediaPlayer34 = null;
									}
									mediaPlayer34 = MediaPlayer.create(MainActivity.this, R.raw.a34);
									mediaPlayer34.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 35) {
					mediaPlayer35 = MediaPlayer.create(MainActivity.this, R.raw.a35);
					if (mediaPlayer34 != null) {
						mediaPlayer34.stop();
						mediaPlayer34.release();
						mediaPlayer34 = null;
					} else if (mediaPlayer36 != null) {
						mediaPlayer36.stop();
						mediaPlayer36.release();
						mediaPlayer36 = null;
					}
					mediaPlayer35.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer35 != null) {
										mediaPlayer35.stop();
										mediaPlayer35.release();
										mediaPlayer35 = null;
									}
									mediaPlayer35 = MediaPlayer.create(MainActivity.this, R.raw.b35);
									mediaPlayer35.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer35 != null) {
										mediaPlayer35.stop();
										mediaPlayer35.release();
										mediaPlayer35 = null;
									}
									mediaPlayer35 = MediaPlayer.create(MainActivity.this, R.raw.c35);
									mediaPlayer35.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer35 != null) {
										mediaPlayer35.stop();
										mediaPlayer35.release();
										mediaPlayer35 = null;
									}
									mediaPlayer35 = MediaPlayer.create(MainActivity.this, R.raw.a35);
									mediaPlayer35.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 36) {
					mediaPlayer36 = MediaPlayer.create(MainActivity.this, R.raw.a36);
					if (mediaPlayer35 != null) {
						mediaPlayer35.stop();
						mediaPlayer35.release();
						mediaPlayer35 = null;
					} else if (mediaPlayer37 != null) {
						mediaPlayer37.stop();
						mediaPlayer37.release();
						mediaPlayer37 = null;
					}
					mediaPlayer36.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer36 != null) {
										mediaPlayer36.stop();
										mediaPlayer36.release();
										mediaPlayer36 = null;
									}
									mediaPlayer36 = MediaPlayer.create(MainActivity.this, R.raw.b36);
									mediaPlayer36.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer36 != null) {
										mediaPlayer36.stop();
										mediaPlayer36.release();
										mediaPlayer36 = null;
									}
									mediaPlayer36 = MediaPlayer.create(MainActivity.this, R.raw.c36);
									mediaPlayer36.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer36 != null) {
										mediaPlayer36.stop();
										mediaPlayer36.release();
										mediaPlayer36 = null;
									}
									mediaPlayer36 = MediaPlayer.create(MainActivity.this, R.raw.a36);
									mediaPlayer36.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 37) {
					mediaPlayer37 = MediaPlayer.create(MainActivity.this, R.raw.a37);
					if (mediaPlayer36 != null) {
						mediaPlayer36.stop();
						mediaPlayer36.release();
						mediaPlayer36 = null;
					} else if (mediaPlayer38 != null) {
						mediaPlayer38.stop();
						mediaPlayer38.release();
						mediaPlayer38 = null;
					}
					mediaPlayer37.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer37 != null) {
										mediaPlayer37.stop();
										mediaPlayer37.release();
										mediaPlayer37 = null;
									}
									mediaPlayer37 = MediaPlayer.create(MainActivity.this, R.raw.b37);
									mediaPlayer37.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer37 != null) {
										mediaPlayer37.stop();
										mediaPlayer37.release();
										mediaPlayer37 = null;
									}
									mediaPlayer37 = MediaPlayer.create(MainActivity.this, R.raw.c37);
									mediaPlayer37.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer37 != null) {
										mediaPlayer37.stop();
										mediaPlayer37.release();
										mediaPlayer37 = null;
									}
									mediaPlayer37 = MediaPlayer.create(MainActivity.this, R.raw.a37);
									mediaPlayer37.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 38) {
					mediaPlayer38 = MediaPlayer.create(MainActivity.this, R.raw.a38);
					if (mediaPlayer37 != null) {
						mediaPlayer37.stop();
						mediaPlayer37.release();
						mediaPlayer37 = null;
					} else if (mediaPlayer39 != null) {
						mediaPlayer39.stop();
						mediaPlayer39.release();
						mediaPlayer39 = null;
					}
					mediaPlayer38.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer38 != null) {
										mediaPlayer38.stop();
										mediaPlayer38.release();
										mediaPlayer38 = null;
									}
									mediaPlayer38 = MediaPlayer.create(MainActivity.this, R.raw.b38);
									mediaPlayer38.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer38 != null) {
										mediaPlayer38.stop();
										mediaPlayer38.release();
										mediaPlayer38 = null;
									}
									mediaPlayer38 = MediaPlayer.create(MainActivity.this, R.raw.c38);
									mediaPlayer38.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer38 != null) {
										mediaPlayer38.stop();
										mediaPlayer38.release();
										mediaPlayer38 = null;
									}
									mediaPlayer38 = MediaPlayer.create(MainActivity.this, R.raw.a38);
									mediaPlayer38.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 39) {
					mediaPlayer39 = MediaPlayer.create(MainActivity.this, R.raw.a39);
					if (mediaPlayer38 != null) {
						mediaPlayer38.stop();
						mediaPlayer38.release();
						mediaPlayer38 = null;
					} else if (mediaPlayer40 != null) {
						mediaPlayer40.stop();
						mediaPlayer40.release();
						mediaPlayer40 = null;
					}
					mediaPlayer39.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer39 != null) {
										mediaPlayer39.stop();
										mediaPlayer39.release();
										mediaPlayer39 = null;
									}
									mediaPlayer39 = MediaPlayer.create(MainActivity.this, R.raw.b39);
									mediaPlayer39.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer39 != null) {
										mediaPlayer39.stop();
										mediaPlayer39.release();
										mediaPlayer39 = null;
									}
									mediaPlayer39 = MediaPlayer.create(MainActivity.this, R.raw.c39);
									mediaPlayer39.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer39 != null) {
										mediaPlayer39.stop();
										mediaPlayer39.release();
										mediaPlayer39 = null;
									}
									mediaPlayer39 = MediaPlayer.create(MainActivity.this, R.raw.a39);
									mediaPlayer39.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 40) {
					mediaPlayer40 = MediaPlayer.create(MainActivity.this, R.raw.a40);
					if (mediaPlayer39 != null) {
						mediaPlayer39.stop();
						mediaPlayer39.release();
						mediaPlayer39 = null;
					} else if (mediaPlayer41 != null) {
						mediaPlayer41.stop();
						mediaPlayer41.release();
						mediaPlayer41 = null;
					}
					mediaPlayer40.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer40 != null) {
										mediaPlayer40.stop();
										mediaPlayer40.release();
										mediaPlayer40 = null;
									}
									mediaPlayer40 = MediaPlayer.create(MainActivity.this, R.raw.b40);
									mediaPlayer40.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer40 != null) {
										mediaPlayer40.stop();
										mediaPlayer40.release();
										mediaPlayer40 = null;
									}
									mediaPlayer40 = MediaPlayer.create(MainActivity.this, R.raw.c40);
									mediaPlayer40.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer40 != null) {
										mediaPlayer40.stop();
										mediaPlayer40.release();
										mediaPlayer40 = null;
									}
									mediaPlayer40 = MediaPlayer.create(MainActivity.this, R.raw.a40);
									mediaPlayer40.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 41) {
					mediaPlayer41 = MediaPlayer.create(MainActivity.this, R.raw.a41);
					if (mediaPlayer40 != null) {
						mediaPlayer40.stop();
						mediaPlayer40.release();
						mediaPlayer40 = null;
					} else if (mediaPlayer42 != null) {
						mediaPlayer42.stop();
						mediaPlayer42.release();
						mediaPlayer42 = null;
					}
					mediaPlayer41.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer41 != null) {
										mediaPlayer41.stop();
										mediaPlayer41.release();
										mediaPlayer41 = null;
									}
									mediaPlayer41 = MediaPlayer.create(MainActivity.this, R.raw.b41);
									mediaPlayer41.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer41 != null) {
										mediaPlayer41.stop();
										mediaPlayer41.release();
										mediaPlayer41 = null;
									}
									mediaPlayer41 = MediaPlayer.create(MainActivity.this, R.raw.c41);
									mediaPlayer41.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer41 != null) {
										mediaPlayer41.stop();
										mediaPlayer41.release();
										mediaPlayer41 = null;
									}
									mediaPlayer41 = MediaPlayer.create(MainActivity.this, R.raw.a41);
									mediaPlayer41.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 42) {
					mediaPlayer42 = MediaPlayer.create(MainActivity.this, R.raw.a42);
					if (mediaPlayer41 != null) {
						mediaPlayer41.stop();
						mediaPlayer41.release();
						mediaPlayer41 = null;
					} else if (mediaPlayer43 != null) {
						mediaPlayer43.stop();
						mediaPlayer43.release();
						mediaPlayer43 = null;
					}
					mediaPlayer42.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer42 != null) {
										mediaPlayer42.stop();
										mediaPlayer42.release();
										mediaPlayer42 = null;
									}
									mediaPlayer42 = MediaPlayer.create(MainActivity.this, R.raw.b42);
									mediaPlayer42.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer42 != null) {
										mediaPlayer42.stop();
										mediaPlayer42.release();
										mediaPlayer42 = null;
									}
									mediaPlayer42 = MediaPlayer.create(MainActivity.this, R.raw.c42);
									mediaPlayer42.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer42 != null) {
										mediaPlayer42.stop();
										mediaPlayer42.release();
										mediaPlayer42 = null;
									}
									mediaPlayer42 = MediaPlayer.create(MainActivity.this, R.raw.a42);
									mediaPlayer42.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 43) {
					mediaPlayer43 = MediaPlayer.create(MainActivity.this, R.raw.a43);
					if (mediaPlayer42 != null) {
						mediaPlayer42.stop();
						mediaPlayer42.release();
						mediaPlayer42 = null;
					} else if (mediaPlayer44 != null) {
						mediaPlayer44.stop();
						mediaPlayer44.release();
						mediaPlayer44 = null;
					}
					mediaPlayer43.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer43 != null) {
										mediaPlayer43.stop();
										mediaPlayer43.release();
										mediaPlayer43 = null;
									}
									mediaPlayer43 = MediaPlayer.create(MainActivity.this, R.raw.b43);
									mediaPlayer43.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer43 != null) {
										mediaPlayer43.stop();
										mediaPlayer43.release();
										mediaPlayer43 = null;
									}
									mediaPlayer43 = MediaPlayer.create(MainActivity.this, R.raw.c43);
									mediaPlayer43.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer43 != null) {
										mediaPlayer43.stop();
										mediaPlayer43.release();
										mediaPlayer43 = null;
									}
									mediaPlayer43 = MediaPlayer.create(MainActivity.this, R.raw.a43);
									mediaPlayer43.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 44) {
					mediaPlayer44 = MediaPlayer.create(MainActivity.this, R.raw.a44);
					if (mediaPlayer43 != null) {
						mediaPlayer43.stop();
						mediaPlayer43.release();
						mediaPlayer43 = null;
					} else if (mediaPlayer45 != null) {
						mediaPlayer45.stop();
						mediaPlayer45.release();
						mediaPlayer45 = null;
					}
					mediaPlayer44.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer44 != null) {
										mediaPlayer44.stop();
										mediaPlayer44.release();
										mediaPlayer44 = null;
									}
									mediaPlayer44 = MediaPlayer.create(MainActivity.this, R.raw.b44);
									mediaPlayer44.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer44 != null) {
										mediaPlayer44.stop();
										mediaPlayer44.release();
										mediaPlayer44 = null;
									}
									mediaPlayer44 = MediaPlayer.create(MainActivity.this, R.raw.c44);
									mediaPlayer44.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer44 != null) {
										mediaPlayer44.stop();
										mediaPlayer44.release();
										mediaPlayer44 = null;
									}
									mediaPlayer44 = MediaPlayer.create(MainActivity.this, R.raw.a44);
									mediaPlayer44.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 45) {
					mediaPlayer45 = MediaPlayer.create(MainActivity.this, R.raw.a45);
					if (mediaPlayer44 != null) {
						mediaPlayer44.stop();
						mediaPlayer44.release();
						mediaPlayer44 = null;
					} else if (mediaPlayer46 != null) {
						mediaPlayer46.stop();
						mediaPlayer46.release();
						mediaPlayer46 = null;
					}
					mediaPlayer45.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer45 != null) {
										mediaPlayer45.stop();
										mediaPlayer45.release();
										mediaPlayer45 = null;
									}
									mediaPlayer45 = MediaPlayer.create(MainActivity.this, R.raw.b45);
									mediaPlayer45.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer45 != null) {
										mediaPlayer45.stop();
										mediaPlayer45.release();
										mediaPlayer45 = null;
									}
									mediaPlayer45 = MediaPlayer.create(MainActivity.this, R.raw.c45);
									mediaPlayer45.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer45 != null) {
										mediaPlayer45.stop();
										mediaPlayer45.release();
										mediaPlayer45 = null;
									}
									mediaPlayer45 = MediaPlayer.create(MainActivity.this, R.raw.a45);
									mediaPlayer45.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 46) {
					mediaPlayer46 = MediaPlayer.create(MainActivity.this, R.raw.a46);
					if (mediaPlayer45 != null) {
						mediaPlayer45.stop();
						mediaPlayer45.release();
						mediaPlayer45 = null;
					} else if (mediaPlayer47 != null) {
						mediaPlayer47.stop();
						mediaPlayer47.release();
						mediaPlayer47 = null;
					}
					mediaPlayer46.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer46 != null) {
										mediaPlayer46.stop();
										mediaPlayer46.release();
										mediaPlayer46 = null;
									}
									mediaPlayer46 = MediaPlayer.create(MainActivity.this, R.raw.b46);
									mediaPlayer46.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer46 != null) {
										mediaPlayer46.stop();
										mediaPlayer46.release();
										mediaPlayer46 = null;
									}
									mediaPlayer46 = MediaPlayer.create(MainActivity.this, R.raw.c46);
									mediaPlayer46.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer46 != null) {
										mediaPlayer46.stop();
										mediaPlayer46.release();
										mediaPlayer46 = null;
									}
									mediaPlayer46 = MediaPlayer.create(MainActivity.this, R.raw.a46);
									mediaPlayer46.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 47) {
					mediaPlayer47 = MediaPlayer.create(MainActivity.this, R.raw.a47);
					if (mediaPlayer46 != null) {
						mediaPlayer46.stop();
						mediaPlayer46.release();
						mediaPlayer46 = null;
					} else if (mediaPlayer48 != null) {
						mediaPlayer48.stop();
						mediaPlayer48.release();
						mediaPlayer48 = null;
					}
					mediaPlayer47.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer47 != null) {
										mediaPlayer47.stop();
										mediaPlayer47.release();
										mediaPlayer47 = null;
									}
									mediaPlayer47 = MediaPlayer.create(MainActivity.this, R.raw.b47);
									mediaPlayer47.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer47 != null) {
										mediaPlayer47.stop();
										mediaPlayer47.release();
										mediaPlayer47 = null;
									}
									mediaPlayer47 = MediaPlayer.create(MainActivity.this, R.raw.c47);
									mediaPlayer47.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer47 != null) {
										mediaPlayer47.stop();
										mediaPlayer47.release();
										mediaPlayer47 = null;
									}
									mediaPlayer47 = MediaPlayer.create(MainActivity.this, R.raw.a47);
									mediaPlayer47.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 48) {
					mediaPlayer48 = MediaPlayer.create(MainActivity.this, R.raw.a48);
					if (mediaPlayer47 != null) {
						mediaPlayer47.stop();
						mediaPlayer47.release();
						mediaPlayer47 = null;
					} else if (mediaPlayer49 != null) {
						mediaPlayer49.stop();
						mediaPlayer49.release();
						mediaPlayer49 = null;
					}
					mediaPlayer48.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer48 != null) {
										mediaPlayer48.stop();
										mediaPlayer48.release();
										mediaPlayer48 = null;
									}
									mediaPlayer48 = MediaPlayer.create(MainActivity.this, R.raw.b48);
									mediaPlayer48.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer48 != null) {
										mediaPlayer48.stop();
										mediaPlayer48.release();
										mediaPlayer48 = null;
									}
									mediaPlayer48 = MediaPlayer.create(MainActivity.this, R.raw.c48);
									mediaPlayer48.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer48 != null) {
										mediaPlayer48.stop();
										mediaPlayer48.release();
										mediaPlayer48 = null;
									}
									mediaPlayer48 = MediaPlayer.create(MainActivity.this, R.raw.a48);
									mediaPlayer48.start();
									break;
							}
						}
					});

				}
				if (arg0 + 1 == 49) {
					mediaPlayer49 = MediaPlayer.create(MainActivity.this, R.raw.a49);
					if (mediaPlayer48 != null) {
						mediaPlayer48.stop();
						mediaPlayer48.release();
						mediaPlayer48 = null;
					} else if (mediaPlayer50 != null) {
						mediaPlayer50.stop();
						mediaPlayer50.release();
						mediaPlayer50 = null;
					}
					mediaPlayer49.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer49 != null) {
										mediaPlayer49.stop();
										mediaPlayer49.release();
										mediaPlayer49 = null;
									}
									mediaPlayer49 = MediaPlayer.create(MainActivity.this, R.raw.b49);
									mediaPlayer49.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer49 != null) {
										mediaPlayer49.stop();
										mediaPlayer49.release();
										mediaPlayer49 = null;
									}
									mediaPlayer49 = MediaPlayer.create(MainActivity.this, R.raw.c49);
									mediaPlayer49.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer49 != null) {
										mediaPlayer49.stop();
										mediaPlayer49.release();
										mediaPlayer49 = null;
									}
									mediaPlayer49 = MediaPlayer.create(MainActivity.this, R.raw.a49);
									mediaPlayer49.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 50) {
					mediaPlayer50 = MediaPlayer.create(MainActivity.this, R.raw.a50);
					if (mediaPlayer49 != null) {
						mediaPlayer49.stop();
						mediaPlayer49.release();
						mediaPlayer49 = null;
					} else if (mediaPlayer51 != null) {
						mediaPlayer51.stop();
						mediaPlayer51.release();
						mediaPlayer51 = null;
					}
					mediaPlayer50.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer50 != null) {
										mediaPlayer50.stop();
										mediaPlayer50.release();
										mediaPlayer50 = null;
									}
									mediaPlayer50 = MediaPlayer.create(MainActivity.this, R.raw.b50);
									mediaPlayer50.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer50 != null) {
										mediaPlayer50.stop();
										mediaPlayer50.release();
										mediaPlayer50 = null;
									}
									mediaPlayer50 = MediaPlayer.create(MainActivity.this, R.raw.c50);
									mediaPlayer50.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer50 != null) {
										mediaPlayer50.stop();
										mediaPlayer50.release();
										mediaPlayer50 = null;
									}
									mediaPlayer50 = MediaPlayer.create(MainActivity.this, R.raw.a50);
									mediaPlayer50.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 51) {
					mediaPlayer51 = MediaPlayer.create(MainActivity.this, R.raw.a51);
					if (mediaPlayer50 != null) {
						mediaPlayer50.stop();
						mediaPlayer50.release();
						mediaPlayer50 = null;
					} else if (mediaPlayer52 != null) {
						mediaPlayer52.stop();
						mediaPlayer52.release();
						mediaPlayer52 = null;
					}
					mediaPlayer51.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer51 != null) {
										mediaPlayer51.stop();
										mediaPlayer51.release();
										mediaPlayer51 = null;
									}
									mediaPlayer51 = MediaPlayer.create(MainActivity.this, R.raw.b51);
									mediaPlayer51.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer51 != null) {
										mediaPlayer51.stop();
										mediaPlayer51.release();
										mediaPlayer51 = null;
									}
									mediaPlayer51 = MediaPlayer.create(MainActivity.this, R.raw.c51);
									mediaPlayer51.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer51 != null) {
										mediaPlayer51.stop();
										mediaPlayer51.release();
										mediaPlayer51 = null;
									}
									mediaPlayer51 = MediaPlayer.create(MainActivity.this, R.raw.a51);
									mediaPlayer51.start();
									break;
							}
						}
					});

				}

				if (arg0 + 1 == 52) {
					mediaPlayer52 = MediaPlayer.create(MainActivity.this, R.raw.a52);
					if (mediaPlayer51 != null) {
						mediaPlayer51.stop();
						mediaPlayer51.release();
						mediaPlayer51 = null;
					}
					mediaPlayer52.start();

					mbutton.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button:
									if (mediaPlayer52 != null) {
										mediaPlayer52.stop();
										mediaPlayer52.release();
										mediaPlayer52 = null;
									}
									mediaPlayer52 = MediaPlayer.create(MainActivity.this, R.raw.b52);
									mediaPlayer52.start();
									break;
							}
						}
					});
					mbutton_a.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_a:
									if (mediaPlayer52 != null) {
										mediaPlayer52.stop();
										mediaPlayer52.release();
										mediaPlayer52 = null;
									}
									mediaPlayer52 = MediaPlayer.create(MainActivity.this, R.raw.c52);
									mediaPlayer52.start();
									break;
							}
						}
					});

					mbutton_b.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							switch (v.getId()) {
								case R.id.button_b:
									if (mediaPlayer52 != null) {
										mediaPlayer52.stop();
										mediaPlayer52.release();
										mediaPlayer52 = null;
									}
									mediaPlayer52 = MediaPlayer.create(MainActivity.this, R.raw.a52);
									mediaPlayer52.start();
									break;
							}
						}
					});

				}


			}

		}
	}

