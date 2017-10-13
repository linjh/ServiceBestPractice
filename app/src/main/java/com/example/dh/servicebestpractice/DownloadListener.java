package com.example.dh.servicebestpractice;

/**
 * Created by dh on 2017/10/12.
 */

public interface DownloadListener {

    void onProgress(int progress);
    void onSucess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
