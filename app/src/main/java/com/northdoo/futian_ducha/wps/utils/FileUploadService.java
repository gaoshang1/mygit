package com.northdoo.futian_ducha.wps.utils;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.widget.Toast;

import java.io.File;


public class FileUploadService extends Service {
	private String filePath;
	private String userGUID;
	private boolean isRequesting = false;
	SettingPreference settingPreference;
	private Handler handler = new Handler(){
		@Override
		public void dispatchMessage(Message msg) {
			// TODO Auto-generated method stub
			super.dispatchMessage(msg);
//			switch (msg.what) {
//			case Globals.MSG_SUCCESS:
//				toastInfo("上传成功");
//				stopSelf();
//				break;
//			case  Globals.MSG_FAILURE:
//				toastInfo("上传失败");
//				break;
//			case Globals.MSG_NETWORK_ERROR:
//				toastInfo(getString(R.string.network_poor));
//				break;
//			case Globals.MSG_EXCPTION:
//				toastInfo("上传失败");
//				break;
//			default:
//				break;
//			}
		}
	};
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		settingPreference = new SettingPreference(this);
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
//		if (NetworkUtils.isNetworkConnected(this)) {
//			isRequesting = true;
//			new Thread(new UploadThread()).start();
//		}else {
//			handler.sendEmptyMessage(Globals.MSG_NETWORK_ERROR);
//		}
		return super.onStartCommand(intent, flags, startId);
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void deleteFile(File file) {
		if (file.exists()) { // 判断文件是否存在
			if (file.isFile()) { // 判断是否是文件
				file.delete(); // delete()方法 你应该知道 是删除的意思;
			} else if (file.isDirectory()) { // 否则如果它是一个目录
				File files[] = file.listFiles(); // 声明目录下所有的文件 files[];
				for (int i = 0; i < files.length; i++) { // 遍历目录下所有的文件
					this.deleteFile(files[i]); // 把每个文件 用这个方法进行迭代
				}
			}
			file.delete();
		} else {
			//Constants.Logdada("文件不存在！" + "\n");
		}
	}
//
//	//执行文件上传线程
//	public class UploadThread implements Runnable{
//
//		@Override
//		public void run() {
//			Message msg = Message.obtain();
//			try {
//				Thread.sleep(1000);
//				userGUID = getSharedPreferences(Config.FILE, Context.MODE_PRIVATE)
//						.getString(Config.USER_GUID, "");
//				filePath = settingPreference.getSettingParam(Define.SAVE_PATH, "");
//				File file = new File(filePath);
//				String result;
//				if (TestData.TEST_DATA) {
//					result = "{\"success\":true}";
//				} else {
//					//http://172.29.53.100/moa/ftqw/attachment/upload.json?documentRowGUID={AC1D3524-0000-0000-7F6E-7E5600000017}&appid=100106&step=1&uploadType=1&instanceGUID={AC1D3524-0000-0000-7F6C-FD9D00000011}
//					String uploadUrl = Globals.DOWNLOAD_ADDRESS7 
//							+ "?documentRowGUID=" + DoDetetailActivity.documentGUID
//							+ "&appid=100106"
//							+ "&step=" + DoDetetailActivity.step
//							+ "&uploadType=1"
//							+ "&userGUID="+userGUID;
//							//+ "&instanceGUID=" + DoDetetailActivity.instanceGUID;
//					result = HttpUtils.doUploadFile(uploadUrl, filePath);
//				}
//				//{"RESULT":{"isSuccess":"false"}}
//				if (result!=null) {
//					JSONObject jsonObject = new 
//							JSONObject(result);
//					JSONObject jo = JsonUtils.getJSONObject(jsonObject, "RESULT");
//					boolean isSuccess = jo.getBoolean("isSuccess");
//					if (isSuccess) {
//						msg.what = Globals.MSG_SUCCESS;
////						deleteFile(file);
//					} else {
//						msg.what = Globals.MSG_FAILURE;
//					}
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				Log.i("error", e.toString());
//				msg.what = Globals.MSG_FAILURE;
//			}
//			if (isRequesting) {
//				handler.sendMessage(msg);
//			}
//			
//		}
//		
//	}
	
	private void toastInfo(String str) {
		Toast.makeText(this, str, Toast.LENGTH_LONG).show();
	}

	

}
