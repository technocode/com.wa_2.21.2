package X;

import android.hardware.Camera;
import com.whatsapp.util.Log;

/* renamed from: X.2Dq  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Dq implements Camera.ErrorCallback {
    public final /* synthetic */ SurfaceHolder$CallbackC50852Wi A00;

    public /* synthetic */ AnonymousClass2Dq(SurfaceHolder$CallbackC50852Wi r1) {
        this.A00 = r1;
    }

    public final void onError(int i, Camera camera) {
        SurfaceHolder$CallbackC50852Wi r3 = this.A00;
        synchronized (r3) {
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/start-camera camera error:");
            sb.append(i);
            sb.append(" takingpicture:");
            sb.append(r3.A0P);
            sb.append(" recording:");
            sb.append(r3.A0O);
            sb.append(" inpreview:");
            sb.append(r3.A0L);
            Log.w(sb.toString());
            if (i == 100) {
                r3.A07();
                r3.A09.post(new RunnableEBaseShape8S0100000_I1_3(r3, 10));
            } else if (i == 2) {
                Camera camera2 = r3.A07;
                if (camera2 != null) {
                    camera2.release();
                }
                r3.A07 = null;
                r3.A08(i);
            }
        }
    }
}
