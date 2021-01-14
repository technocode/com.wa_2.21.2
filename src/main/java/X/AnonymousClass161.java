package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.161  reason: invalid class name */
public final class AnonymousClass161 extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final AnonymousClass160 A01;

    public AnonymousClass161(AnonymousClass160 r1, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.A01 = r1;
    }

    public static int A00(Context context) {
        String eglQueryString;
        int i = AnonymousClass0W2.A00;
        if (i < 26 && ("samsung".equals(AnonymousClass0W2.A03) || "XT1650".equals(AnonymousClass0W2.A04))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (A02(r6) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass161 A01(android.content.Context r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass161.A01(android.content.Context, boolean):X.161");
    }

    public static synchronized boolean A02(Context context) {
        boolean z;
        synchronized (AnonymousClass161.class) {
            z = true;
            if (!A03) {
                A02 = AnonymousClass0W2.A00 < 24 ? 0 : A00(context);
                A03 = true;
            }
            if (A02 == 0) {
                z = false;
            }
        }
        return z;
    }

    public void release() {
        super.release();
        AnonymousClass160 r2 = this.A01;
        synchronized (r2) {
            if (!this.A00) {
                Handler handler = r2.A00;
                if (handler != null) {
                    handler.sendEmptyMessage(2);
                    this.A00 = true;
                } else {
                    throw null;
                }
            }
        }
    }
}
