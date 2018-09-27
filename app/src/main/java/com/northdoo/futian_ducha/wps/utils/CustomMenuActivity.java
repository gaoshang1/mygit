package com.northdoo.futian_ducha.wps.utils;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

import com.northdoo.futian_ducha.wps.service.FloatServiceTest;

import cn.wps.moffice.service.doc.Document;


public class CustomMenuActivity
{
    String path;
    String ID;
    boolean marks;
    protected static Document mDoc = null;
    Context context;

    public CustomMenuActivity(String channel)
    {
        if (channel.equals("cn52"))
            openThread.start();
    }

    public CustomMenuActivity(Context context, String path, String id)
    {
        this.path = path;
        this.ID = id;
        this.context = context;
        /*if (FloatServiceTest.mDoc==null){
			reDoService(context);
		}
		try {
			onMenuAtion(path, ID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}*/
    }
	
	/*public CustomMenuActivity(String path, String id, boolean marks) {
		this.path = path;
		this.ID = id;
		this.marks = marks;
		try {
			getMenuText();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}*/

	/*public void onMenuAtion(String path, String id) throws RemoteException {
		switch (id) {
		// 鏌ョ湅鑿滃崟涓嬬殑閫夐�??
		case "menu_id_path":
			FloatServiceTest.getPath();
			break;
		case "menu_id_file_name":
			FloatServiceTest.getName();
			break;
		case "menu_id_total_page":
			FloatServiceTest.getPageCount();
			break;
		case "menu_id_currentpage":
			FloatServiceTest.getCurrentPageNum();
			break;
		case "menu_id_doc_length":
			FloatServiceTest.getLength();
			break;
		case "menu_id_isprotect":
			FloatServiceTest.isProtectOn();
			break;
		case "menu_id_type_protect":
			FloatServiceTest.getProtectionType();
			break;
		case "menu_id_ishandmode":
			FloatServiceTest.isInHandWriterMode();
			break;
		case "menu_id_isrevisionmode":
			FloatServiceTest.isInRevisionMode();
			break;
		case "menu_id_hide_toolbar":
			FloatServiceTest.hiddenToolBar();
			break;
		case "menu_id_hide_contextmenu":
			FloatServiceTest.hiddenMenuBar();
			break;
		case "menu_id_handmode":
			FloatServiceTest.handWriteComment();
			break;
		case "menu_id_revisionmode":
			FloatServiceTest.changeRevisionMode();
			break;
		case "menu_id_selection":
			FloatServiceTest.setSelection();
			break;
		case "menu_id_copy":
			FloatServiceTest.copy();
			break;
		case "menu_id_cut":
			FloatServiceTest.cut();
			break;
		case "menu_id_paste":
			FloatServiceTest.paste();
			break;
		case "menu_id_insert_text":
			FloatServiceTest.typeText();
			break;
		case "menu_id_insert_para":
			FloatServiceTest.insertParagraph();
			break;
		case "menu_id_theme_page":
			FloatServiceTest.saveCurrentPageToImage();
			break;
		case "menu_id_insert_image":
			FloatServiceTest.addPicture();
//			String imagePath = Define.SDCARD_PATH + "涓撲笟鐗堟埅鍥�.png";
//			File myFile = new File(imagePath);
//			if (myFile.exists()) {
//				mDoc.getShapes().addPicture2(imagePath, true, true, 150, 150,155, 130, null);
//				Util.showToast(context, "鎻掑叆鎴愬姛");
//			} else {
//				Util.showToast(context, "鎵句笉鍒板浘鐗�");
//			}
			break;
		case "menu_id_insert_textbox":
			FloatServiceTest.addTextBox();
//			mDoc.getShapes().addTextbox2(MsoTextOrientation.msoTextOrientationHorizontal, 150, 150,155, 130, null);
			break;
		case "menu_id_close":
			FloatServiceTest.closeFile();
			break;
		case "menu_id_user_name":
			FloatServiceTest.getUser();			
			break;
		case "menu_id_handwriter":
			FloatServiceTest.getForbiddenInk();
			break;
		case "menu_id_comment":
			FloatServiceTest.changeRevisionMode();
			break;
		case "menu_id_fontinfo":
			FloatServiceTest.getFont();
			break;

		case "menu_id_IsShowRevisons":
			FloatServiceTest.getShowRevisions();
			break;
		case "menu_id_del_object":
			FloatServiceTest.deleteShapes();
			break;
		case "menu_id_gethasInk":
			FloatServiceTest.isHasInk(1);
			break;
		case "menu_id_del_allhasInk":
			FloatServiceTest.delAllHasInk();
			break;
		default:
			Util.showToast(context, "鎵惧埌涓岻D瀵瑰簲鐨勪簨浠�");
			break;
		}
	}
	
	public String getMenuText() throws RemoteException {
		mDoc = FloatServiceTest.mDoc;
		Log.d("===DEBUG===", "mDoc=" + mDoc);

		switch (ID) {		
		case "menu_id_comment":
			boolean isTrue = mDoc.isInRevisionMode();
			if (!isTrue) {return "杩涘叆淇";	} else {return "閫�鍑轰慨璁�?";}
		case "menu_id_handwriter":
			return mDoc.getForbiddenInk() ? "鍚敤澧ㄨ抗" : "绂佺敤澧ㄨ抗";
		default:
			return null;
		}
	}
	
	void reDoService(Context c){
		boolean f = FloatServiceTest.bindOfficeService();
		try {
			FloatServiceTest.mDoc = FloatServiceTest.mService.getActiveDocument();
		} catch (RemoteException e) {
			Util.showToast(c, "鑾峰彇鏂囨�?��?�硅薄澶辫触");
			e.printStackTrace();
		}
		Util.showToast(c, "杩炴帴鐘舵�侊細"+f +"/nmDoc锛�"+FloatServiceTest.mDoc);
		if(FloatServiceTest.mDoc!=null) Util.showToast(context, "鏈嶅姟宸查噸鎺�");
	}*/

    Thread openThread = new Thread(new Runnable()
    {

        @Override
        public void run()
        {
            Log.d("===DEBUG===", "openThread.start");
            int i = 0;
            boolean docIsLoadOk = false;
            while (!docIsLoadOk && i++ <= 60)
            {
                try
                {
                    Thread.sleep(1000);
                    try
                    {
                        if (FloatServiceTest.mDoc != null)
                            docIsLoadOk = FloatServiceTest.mDoc.isLoadOK();
                        Log.d("=====Debug====", "鎵撳紑鏂囨�?�鍔犺浇鐘舵�侊�? " + docIsLoadOk + "  鏃堕棿锛�? " + i);
                    } catch (RemoteException e)
                    {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e)
                {
                }
            }
            Log.d("=====Debug====", "鎵撳紑鏂囨�?�鍔犺浇鑰楁椂锛�? " + i);
            if (FloatServiceTest.mDoc != null)
            {
                try
                {
                    mDoc = FloatServiceTest.mDoc;
                    mDoc.undo2(3);
                    mDoc.toggleForbiddenInk(true);     //绂佺敤澧ㄨ抗
                } catch (RemoteException e)
                {
                    e.printStackTrace();
                }
            }
            if (openThread != null)
            {
                Thread.dumpStack();
                openThread = null;
            }
        }

    });

}
