package X;

import android.content.Context;

/* renamed from: X.1Ai  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC24381Ai {
    public Object A00;
    public boolean A01 = false;
    public final Context A02;
    public final Object A03 = new Object();
    public final String A04;
    public final String A05;
    public final String A06;

    public AbstractC24381Ai(Context context) {
        this.A02 = context;
        this.A04 = "FaceNativeHandle";
        StringBuilder sb = new StringBuilder("face".length() + 39);
        sb.append("com.google.android.gms.vision.dynamite");
        sb.append(".");
        sb.append("face");
        this.A05 = sb.toString();
        this.A06 = "com.google.android.gms.vision.dynamite";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r2 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        android.util.Log.e(r9.A04, "Error creating remote native handle", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b A[ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:8:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC24381Ai.A00():java.lang.Object");
    }
}
