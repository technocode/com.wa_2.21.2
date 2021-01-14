package X;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.DeadObjectException;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.03C  reason: invalid class name */
public class AnonymousClass03C {
    public static volatile AnonymousClass03C A01;
    public final AnonymousClass03D A00;

    public AnonymousClass03C(AnonymousClass00G r3) {
        this.A00 = new AnonymousClass03D(r3.A00);
    }

    public static AnonymousClass03C A00() {
        if (A01 == null) {
            synchronized (AnonymousClass03C.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass03C(AnonymousClass00G.A01);
                }
            }
        }
        return A01;
    }

    public static String A01(AnonymousClass02N r2) {
        if (r2 == null) {
            return null;
        }
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(r2.getRawString().getBytes()), 0);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static void A02(AnonymousClass03E r2, Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder A0S = AnonymousClass008.A0S("wa-notification-manager largeIcon builder=");
            int hashCode = r2.hashCode();
            if (bitmap != null) {
                A0S.append(hashCode);
                A0S.append(" ref=");
                A0S.append(bitmap.hashCode());
                A0S.append(" c=");
                A0S.append(bitmap.getByteCount());
                A0S.append(" w=");
                A0S.append(bitmap.getWidth());
                A0S.append(" h=");
                A0S.append(bitmap.getHeight());
                Log.d(A0S.toString());
            } else {
                A0S.append(hashCode);
                A0S.append(" ref=null");
                Log.d(A0S.toString());
            }
        }
        r2.A0C = r2.A02(bitmap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (android.text.TextUtils.isEmpty(r6.getChannelId()) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass02N r4, int r5, android.app.Notification r6) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0011
            java.lang.String r0 = r6.getChannelId()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.AnonymousClass00E.A07(r0)
            java.lang.String r2 = A01(r4)
            if (r4 == 0) goto L_0x0035
            java.lang.String r0 = "wanotificationmanager/notify/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.d(r0)
        L_0x0035:
            X.03D r0 = r3.A00     // Catch:{ RuntimeException -> 0x003b }
            r0.A01(r2, r5, r6)     // Catch:{ RuntimeException -> 0x003b }
            return
        L_0x003b:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = "wanotificationmanager/notifyfailed/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
            return
        L_0x0057:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03C.A03(X.02N, int, android.app.Notification):void");
    }

    public final void A04(String str, int i, String str2) {
        boolean A0D = C003701u.A0D();
        StringBuilder A0a = AnonymousClass008.A0a("wa-notification-manager/cancel debugString=", str2, " tag=", str, " ui=");
        A0a.append(A0D);
        A0a.append(" id=");
        A0a.append(i);
        Log.d(A0a.toString());
        try {
            AnonymousClass03D r2 = this.A00;
            r2.A00.cancel(str, i);
            if (Build.VERSION.SDK_INT <= 19) {
                r2.A00(new AnonymousClass03F(r2.A01.getPackageName(), i, str));
            }
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                StringBuilder sb = new StringBuilder("wanotificationmanager/cancelfailed/");
                sb.append(e);
                Log.e(sb.toString());
                return;
            }
            throw e;
        }
    }

    public void A05(String str, Notification notification) {
        try {
            this.A00.A01(str, 27, notification);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                StringBuilder sb = new StringBuilder("wanotificationmanager/notifyForJoinableCalls/notifyfailed");
                sb.append(e);
                Log.e(sb.toString());
                return;
            }
            throw e;
        }
    }
}
