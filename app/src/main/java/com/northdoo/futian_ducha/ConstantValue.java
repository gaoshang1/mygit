
package com.northdoo.futian_ducha;

import android.os.Environment;

/**
 * 常量
 * com.kinggrid.iapppdf.demo.ConstantValue
 * @author wmm
 * create at 2015年8月13日 下午5:13:18
 */
public interface ConstantValue {
	final static int KEY_DOCUMENT_SAVE = 0;//退出保存
	final static int KEY_SINGER = 1;//签名
	final static int KEY_FULL_SINGER = 3;//全文批注
	
	final static String SDCARD_PATH = Environment
			.getExternalStorageDirectory().getPath().toString();//SD卡的路径
	
	//intent传递名称,实际使用中根据需要自定义名称
	final String NAME = "demo_name";
	final String LIC = "demo_lic";

	//Handler 
	final int MSG_WHAT_DISMISSDIALOG = 201;
	final int MSG_WHAT_REFRESHDOCUMENT = 203;
	
}

