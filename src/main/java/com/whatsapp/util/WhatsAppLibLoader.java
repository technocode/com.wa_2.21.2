package com.whatsapp.util;

import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00O;
import X.C000100c;
import android.content.Context;
import com.whatsapp.voipcalling.Voip;
import java.util.Arrays;
import java.util.Map;

public class WhatsAppLibLoader {
    public static final String[] A07 = new String[0];
    public static final String[] A08 = {"vlc", "whatsapp", "curve25519"};
    public static volatile WhatsAppLibLoader A09;
    public Boolean A00 = null;
    public Map A01 = null;
    public final AnonymousClass009 A02;
    public final AnonymousClass00C A03;
    public final C000100c A04;
    public final AnonymousClass00D A05;
    public final AnonymousClass00O A06;

    public static native String getJNICodeVersion();

    public static native void testLibraryUsable(byte[] bArr);

    public WhatsAppLibLoader(AnonymousClass009 r2, AnonymousClass00C r3, AnonymousClass00D r4, AnonymousClass00O r5, C000100c r6) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = r6;
    }

    public static WhatsAppLibLoader A00() {
        if (A09 == null) {
            synchronized (WhatsAppLibLoader.class) {
                if (A09 == null) {
                    A09 = new WhatsAppLibLoader(AnonymousClass009.A00(), AnonymousClass00C.A00(), AnonymousClass00D.A00(), AnonymousClass00O.A00(), new C000100c());
                }
            }
        }
        return A09;
    }

    public static final boolean A01() {
        byte[] bArr = new byte[3];
        try {
            testLibraryUsable(bArr);
            if (!Arrays.equals(new byte[]{31, 41, 59}, bArr)) {
                Log.w("whatsapplibloader/usable test array does not match");
                return false;
            }
            try {
                String jNICodeVersion = getJNICodeVersion();
                StringBuilder sb = new StringBuilder();
                sb.append("whatsapplibloader/usable jniVersion: ");
                sb.append(jNICodeVersion);
                Log.i(sb.toString());
                if (!"2.21.2.4".equals(jNICodeVersion)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("whatsapplibloader/usable version does not match. JAVA version: ");
                    sb2.append("2.21.2.4");
                    sb2.append(", JNI version: ");
                    sb2.append(jNICodeVersion);
                    Log.w(sb2.toString());
                    return false;
                }
                try {
                    Voip.getCallInfo();
                    Log.i("whatsapplibloader/usable isLibraryUsable: True");
                    return true;
                } catch (UnsatisfiedLinkError e) {
                    Log.w("whatsapplibloader/usable error while testing library usability getCallInfo", e);
                    return false;
                }
            } catch (UnsatisfiedLinkError e2) {
                Log.w("whatsapplibloader/usable error while testing library usability getJNICodeVersion", e2);
                return false;
            }
        } catch (UnsatisfiedLinkError e3) {
            Log.w("whatsapplibloader/usable error while testing library usability testLibraryUsable", e3);
            return false;
        }
    }

    public final void A02(Context context, String str) {
        AnonymousClass008.A18("whatsapplibloader/system-load-library-with-install start, loading: ", str);
        try {
            if (this.A04 != null) {
                System.loadLibrary(str);
                StringBuilder sb = new StringBuilder();
                sb.append("whatsapplibloader/system-load-library-with-install loaded: ");
                sb.append(str);
                Log.d(sb.toString());
                Log.i("whatsapplibloader/system-load-library-with-install end");
                return;
            }
            throw null;
        } catch (UnsatisfiedLinkError e) {
            Log.w("whatsapplibloader/system-load-library-with-install error", e);
            A03(context, Arrays.asList(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0108, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0110, code lost:
        if (r9 != null) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(android.content.Context r12, java.util.List r13) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.WhatsAppLibLoader.A03(android.content.Context, java.util.List):void");
    }

    public synchronized boolean A04() {
        boolean z;
        if (this.A00 == null) {
            Log.e("whatsapplibloader/is-loaded: isLoaded() was called before load was attempted");
        }
        z = false;
        if (this.A00 == Boolean.TRUE) {
            z = true;
        }
        return z;
    }
}
