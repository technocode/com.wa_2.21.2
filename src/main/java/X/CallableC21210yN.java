package X;

import android.hardware.Camera;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.0yN  reason: invalid class name and case insensitive filesystem */
public class CallableC21210yN implements Callable {
    public final /* synthetic */ Camera A00;
    public final /* synthetic */ C33081gA A01;

    public CallableC21210yN(C33081gA r1, Camera camera) {
        this.A01 = r1;
        this.A00 = camera;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33081gA r5 = this.A01;
        C21430yj r1 = r5.A0M;
        Camera camera = this.A00;
        r1.A00(camera, true);
        try {
            camera.setPreviewTexture(null);
        } catch (IOException e) {
            Log.e("Camera1Device", "Unable to remove the current SurfaceTexture", e);
        }
        r5.A0N.A01(camera);
        camera.release();
        return null;
    }
}
