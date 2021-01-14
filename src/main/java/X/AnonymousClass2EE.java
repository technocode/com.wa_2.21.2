package X;

import android.hardware.Camera;

/* renamed from: X.2EE  reason: invalid class name */
public class AnonymousClass2EE implements Camera.PreviewCallback {
    public Camera.Size A00;
    public boolean A01 = true;
    public final /* synthetic */ SurfaceHolder$CallbackC50852Wi A02;

    public AnonymousClass2EE(SurfaceHolder$CallbackC50852Wi r2) {
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r5.A07 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r5.A0P != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r7 != r5.A0X) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r5.A07.addCallbackBuffer(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreviewFrame(byte[] r7, android.hardware.Camera r8) {
        /*
            r6 = this;
            boolean r1 = r6.A01
            r0 = 0
            if (r1 == 0) goto L_0x0010
            r6.A01 = r0
            X.2Wi r0 = r6.A02
            X.0L6 r1 = r0.A0U
            java.lang.String r0 = "cameraView1"
            r1.A02(r0)
        L_0x0010:
            android.hardware.Camera$Size r0 = r6.A00
            if (r0 != 0) goto L_0x001e
            android.hardware.Camera$Parameters r0 = r8.getParameters()     // Catch:{ RuntimeException -> 0x001e }
            android.hardware.Camera$Size r0 = r0.getPreviewSize()     // Catch:{ RuntimeException -> 0x001e }
            r6.A00 = r0     // Catch:{ RuntimeException -> 0x001e }
        L_0x001e:
            android.hardware.Camera$Size r0 = r6.A00
            if (r0 == 0) goto L_0x0052
            X.2Wi r5 = r6.A02
            X.2Wf r4 = r5.A0R
            int r3 = r0.width
            int r2 = r0.height
            monitor-enter(r4)
            X.2EZ r1 = r4.A00     // Catch:{ all -> 0x004e }
            byte[] r0 = r1.A02     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x003b
            r1.A02 = r7     // Catch:{ all -> 0x004e }
            r1.A01 = r3     // Catch:{ all -> 0x004e }
            r1.A00 = r2     // Catch:{ all -> 0x004e }
            r4.notify()     // Catch:{ all -> 0x004e }
            goto L_0x0051
        L_0x003b:
            monitor-exit(r4)
            android.hardware.Camera r0 = r5.A07
            if (r0 == 0) goto L_0x0052
            boolean r0 = r5.A0P
            if (r0 != 0) goto L_0x0052
            byte[] r0 = r5.A0X
            if (r7 != r0) goto L_0x0052
            android.hardware.Camera r0 = r5.A07
            r0.addCallbackBuffer(r7)
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0051:
            monitor-exit(r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EE.onPreviewFrame(byte[], android.hardware.Camera):void");
    }
}
