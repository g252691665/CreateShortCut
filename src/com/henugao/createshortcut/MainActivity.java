package com.henugao.createshortcut;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void createShortcut(View view){
		Intent intent = new Intent();
		intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
		
		/**
		 * 1 �����ʲô����
		 * 2 ��ʲô����
		 * 3 ��ʲô����
		 */
		
		Intent dowhtIntent = new Intent();
		//�����绰
		dowhtIntent.setAction(Intent.ACTION_CALL);
		dowhtIntent.setData(Uri.parse("tel://110"));
		intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, dowhtIntent);
		//���ֽ���ʲô
		intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "��绰");
		//��ʲô����
		intent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, R.drawable.ic_launcher);
		
		sendBroadcast(intent);
		
		
	}

}
