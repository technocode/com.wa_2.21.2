package com.facebook.msys.mci;

import X.AbstractC20890xc;
import X.AbstractC20920xl;
import X.AbstractC20930xm;
import X.AbstractRunnableC20910xi;
import X.AnonymousClass04B;
import X.AnonymousClass3W0;
import X.C002601j;
import X.C32971fz;
import android.util.Log;
import com.facebook.msys.mci.network.common.DataTask;
import com.facebook.msys.mci.network.common.DataTaskListener;
import com.facebook.msys.mci.network.common.UrlResponse;
import com.facebook.simplejni.NativeHolder;
import java.io.IOException;
import java.util.HashMap;

public class NetworkSession implements AnonymousClass04B {
    public static final String TAG = "NetworkSession";
    public final HashMap mCallbackMap = new HashMap();
    public final DataTaskListener mDataTaskListener;
    public boolean mDisposed;
    public final AbstractC20890xc mDisposer;
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    private native NativeHolder initNativeHolder(String str, NotificationCenter notificationCenter);

    private native void markDataTaskAsCompleted(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, Throwable th);

    private native void nativeDispose();

    private native void registerDownloadTaskProgressObserver(String str);

    private native void registerUploadTaskProgressObserver(String str);

    private native void setNetworkStateConnectedNative(NotificationCenter notificationCenter);

    private native void setNetworkStateDisconnectedNative(NotificationCenter notificationCenter);

    private native void updateDataTaskDownloadProgress(String str, long j, long j2, long j3);

    private native void updateDataTaskUploadProgress(String str, long j, long j2, long j3);

    public native int getNetworkSessionTimeoutIntervalMs();

    public native DataTask[] getPendingDataTasks();

    public NetworkSession(String str, NotificationCenter notificationCenter, AbstractC20930xm r5) {
        C002601j.A01("NetworkSession.new");
        try {
            this.mNotificationCenter = notificationCenter;
            AnonymousClass3W0 r1 = (AnonymousClass3W0) r5;
            this.mDataTaskListener = r1.A01;
            this.mDisposer = new C32971fz(r5);
            this.mNativeHolder = initNativeHolder(str, notificationCenter);
            int networkSessionTimeoutIntervalMs = getNetworkSessionTimeoutIntervalMs();
            if (networkSessionTimeoutIntervalMs > 0) {
                r1.A00 = networkSessionTimeoutIntervalMs;
            }
        } finally {
            C002601j.A00();
        }
    }

    private void dispatchProgressUpdateToObserver(String str, long j, long j2, long j3) {
        if (this.mCallbackMap.containsKey(str)) {
            this.mCallbackMap.get(str);
        }
    }

    public synchronized void dispose() {
        if (!this.mDisposed) {
            AbstractC20890xc r0 = this.mDisposer;
            if (r0 == null || ((AnonymousClass3W0) ((C32971fz) r0).A00) != null) {
                nativeDispose();
                this.mDisposed = true;
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass04B
    public void executeInNetworkContext(AbstractRunnableC20910xi r2) {
        Execution.executeAsync(r2, 3);
    }

    @Override // X.AnonymousClass04B
    public synchronized void markDataTaskAsCompletedCallback(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, IOException iOException) {
        markDataTaskAsCompleted(str, str2, i, urlResponse, bArr, str3, iOException);
        if (this.mCallbackMap.containsKey(str2)) {
            this.mCallbackMap.remove(str2);
        }
    }

    private void onNewDataTask(DataTask dataTask) {
        Log.d(TAG, "New data task received from msys");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onNewTask(dataTask, this);
        }
    }

    public synchronized void registerDownloadTaskProgressObserverCallback(String str, AbstractC20920xl r3) {
        this.mCallbackMap.put(str, r3);
        registerDownloadTaskProgressObserver(str);
    }

    public synchronized void registerUploadTaskProgressObserverCallback(String str, AbstractC20920xl r3) {
        this.mCallbackMap.put(str, r3);
        registerUploadTaskProgressObserver(str);
    }

    public void setNetworkStateConnected() {
        setNetworkStateConnectedNative(this.mNotificationCenter);
    }

    public void setNetworkStateDisconnected() {
        setNetworkStateDisconnectedNative(this.mNotificationCenter);
    }

    @Override // X.AnonymousClass04B
    public void updateDataTaskDownloadProgressCallback(String str, long j, long j2, long j3) {
        updateDataTaskDownloadProgress(str, j, j2, j3);
    }

    @Override // X.AnonymousClass04B
    public void updateDataTaskUploadProgressCallback(String str, long j, long j2, long j3) {
        updateDataTaskUploadProgress(str, j, j2, j3);
    }
}
