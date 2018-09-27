// ITaskCallback.aidl
package com.northdoo.luohu;

// Declare any non-default types here with import statements

interface ITaskCallback {
  void onResponse(String response);
  void onError(String e);
  void onProgress(float progress, long total);
}
