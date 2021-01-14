package X;

import android.content.Context;
import android.hardware.Camera;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.whatsapp.util.Log;

/* renamed from: X.27q  reason: invalid class name */
public class AnonymousClass27q extends SurfaceHolder$CallbackC50852Wi implements SurfaceHolder.Callback {
    public int A00;
    public int A01;
    public Camera A02;
    public SurfaceHolder A03;

    public AnonymousClass27q(Context context) {
        super(context);
        SurfaceHolder holder = getHolder();
        this.A03 = holder;
        holder.addCallback(this);
    }

    public int getDisplayOrientation() {
        int i;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(super.A00, cameraInfo);
        int rotation = defaultDisplay.getRotation();
        int i2 = 0;
        boolean z = false;
        if (cameraInfo.facing == 1) {
            z = true;
        }
        int i3 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (z) {
            i = (360 - ((i3 + i2) % 360)) % 360;
        } else {
            i = ((i3 - i2) + 360) % 360;
        }
        StringBuilder A0U = AnonymousClass008.A0U("bloks_camera/startpreview display:", i2, " camera:", i3, " preview:");
        A0U.append(i);
        A0U.append(" front:");
        A0U.append(z);
        Log.i(A0U.toString());
        return i;
    }
}
