package com.northdoo.futian_ducha.wps.broad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * 当按Home时传来的广播信息
 * @author kingsoft
 *
 */
public class HomeKeyReceiver extends BroadcastReceiver
{
	@Override
	public void onReceive(Context context, Intent intent) 
	{
		//告诉用户收到Home键的广播
		/*Toast.makeText(context, "监听Home键", Toast.LENGTH_SHORT).show();*/
	}

}
