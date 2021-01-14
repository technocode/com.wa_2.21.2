package X;

import android.hardware.Camera;

/* renamed from: X.0ye  reason: invalid class name and case insensitive filesystem */
public class C21380ye {
    public static int A01 = -1;
    public static Camera.CameraInfo[] A02;
    public final C22170zz A00;

    public C21380ye(C22170zz r1) {
        this.A00 = r1;
    }

    public static boolean A00(int i) {
        Camera.CameraInfo[] cameraInfoArr = A02;
        if (cameraInfoArr == null) {
            int i2 = A01;
            if (i2 == -1) {
                i2 = Camera.getNumberOfCameras();
                A01 = i2;
            }
            cameraInfoArr = new Camera.CameraInfo[i2];
            for (int i3 = 0; i3 < A01; i3++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i3, cameraInfo);
                cameraInfoArr[i3] = cameraInfo;
            }
            A02 = cameraInfoArr;
        }
        for (int i4 = 0; i4 < A01; i4++) {
            if (cameraInfoArr[i4].facing == i) {
                return true;
            }
        }
        return false;
    }
}
