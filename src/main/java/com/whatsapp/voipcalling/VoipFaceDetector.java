package com.whatsapp.voipcalling;

import X.AbstractC24661Bw;
import X.AnonymousClass00E;
import X.C36251lp;
import X.C36281ls;
import X.C36291lt;
import android.content.Context;
import com.whatsapp.util.Log;

public final class VoipFaceDetector {
    public static final String TAG = "voip/video/VoipFaceDetector/";
    public final boolean detectBounds;
    public final AbstractC24661Bw detector;
    public final int maxDetections;
    public volatile int nextFrameId;
    public volatile boolean released;

    public VoipFaceDetector(AbstractC24661Bw r1, int i, boolean z) {
        this.detector = r1;
        this.maxDetections = i;
        this.detectBounds = z;
    }

    public static VoipFaceDetector create(Context context, int i, boolean z) {
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        AnonymousClass00E.A06(z2);
        Context applicationContext = context.getApplicationContext();
        C36291lt r1 = new C36291lt();
        r1.A01 = 0;
        r1.A02 = 0;
        r1.A03 = 0;
        r1.A04 = true;
        r1.A05 = true;
        r1.A00 = -1.0f;
        return new VoipFaceDetector(new C36251lp(new C36281ls(applicationContext, r1)), i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0210, code lost:
        if (r11 != 3) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r23 <= 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C676939u detect(java.nio.ByteBuffer r21, int r22, int r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 619
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipFaceDetector.detect(java.nio.ByteBuffer, int, int, int, int):X.39u");
    }

    public synchronized boolean isOperational() {
        boolean z;
        z = false;
        if (!this.released && ((C36251lp) this.detector).A01.A00() != null) {
            z = true;
        }
        return z;
    }

    public synchronized void release() {
        if (!this.released) {
            Log.i("voip/video/VoipFaceDetector/Releasing face detector");
            this.released = true;
            this.detector.A00();
        }
    }
}
