package com.northdoo.luohu;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameter;
import com.northdoo.luohu.Parameters;
interface ITaskBinder {
          
        boolean isTaskRunning();
        void stopRunningTask();
        void registerCallback(ITaskCallback cb,String type,String url,in List<Parameter> parameter);
        void registerCallbacks(ITaskCallback cb,String type,in Parameters parameter);
        void unregisterCallback(ITaskCallback cb);
}
