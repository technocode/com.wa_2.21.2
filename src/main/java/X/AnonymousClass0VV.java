package X;

import android.hardware.Camera;
import android.os.Looper;
import android.util.Log;

/* renamed from: X.0VV  reason: invalid class name */
public enum AnonymousClass0VV {
    FRONT(1),
    BACK(0);
    
    public static final Camera.CameraInfo A00 = new Camera.CameraInfo();
    public final int infoId;
    public int mCameraId;
    public Camera.CameraInfo mCameraInfo;
    public boolean mIsPresent;

    /* access modifiers changed from: public */
    AnonymousClass0VV(int i) {
        this.infoId = i;
    }

    public int A00(int i) {
        if (i == -1) {
            return 0;
        }
        A01();
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        if (cameraInfo == null) {
            cameraInfo = A00;
        }
        int i2 = ((i + 45) / 90) * 90;
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        if (i3 == 1) {
            return ((i4 - i2) + 360) % 360;
        }
        return (i4 + i2) % 360;
    }

    public final void A01() {
        if (this.mCameraInfo == null) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                Log.e("CameraFacing", Log.getStackTraceString(new Exception("checkCameraInfo() was executed in the UI thread")));
            }
            try {
                int numberOfCameras = Camera.getNumberOfCameras();
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                for (int i = 0; i < numberOfCameras; i++) {
                    Camera.getCameraInfo(i, cameraInfo);
                    if (cameraInfo.facing == this.infoId) {
                        this.mCameraInfo = cameraInfo;
                        this.mCameraId = i;
                        this.mIsPresent = true;
                        return;
                    }
                }
                this.mCameraId = 0;
                this.mCameraInfo = A00;
                this.mIsPresent = false;
            } catch (RuntimeException e) {
                Log.e("CameraFacing", "CameraFacing failed to determine the correct camera id and camera info", e);
            }
        }
    }
}
