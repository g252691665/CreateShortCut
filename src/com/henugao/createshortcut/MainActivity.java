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
		 * 1 你想干什么事情
		 * 2 叫什么名字
		 * 3 长什么样子
		 */
		
		Intent dowhtIntent = new Intent();
		//我想打电话
		dowhtIntent.setAction(Intent.ACTION_CALL);
		dowhtIntent.setData(Uri.parse("tel://110"));
		intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, dowhtIntent);
		//名字叫做什么
		intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "打电话");
		//长什么样子
		intent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, R.drawable.ic_launcher);
		
		sendBroadcast(intent);
		
		
	}

}
