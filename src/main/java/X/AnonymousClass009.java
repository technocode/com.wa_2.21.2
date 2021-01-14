package X;

import android.content.ContentResolver;
import android.provider.Settings;
import android.util.Pair;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.009  reason: invalid class name */
public abstract class AnonymousClass009 {
    public static volatile AnonymousClass009 A00;

    public static AnonymousClass009 A00() {
        AnonymousClass009 r0 = A00;
        if (r0 != null) {
            return r0;
        }
        throw null;
    }

    public String A01() {
        if (!(this instanceof AnonymousClass00L)) {
            throw new RuntimeException("Must use overridden implementation");
        }
        AnonymousClass00L r3 = (AnonymousClass00L) this;
        AnonymousClass01I r1 = r3.A02;
        r1.A04();
        Me me = r1.A00;
        if (me != null) {
            return me.jabber_id;
        }
        String replaceAll = r1.A02().toLowerCase(Locale.US).replaceAll("\\W", "-");
        if (!replaceAll.equals("")) {
            return replaceAll;
        }
        ContentResolver A06 = r3.A06.A06();
        if (A06 == null) {
            Log.w("crashlogs/get-from-parameter cr=null");
            return replaceAll;
        }
        String string = Settings.Secure.getString(A06, "android_id");
        if (string == null || string.length() < 6) {
            string = "123456";
        }
        StringBuilder A0S = AnonymousClass008.A0S("new-");
        A0S.append(string.substring(string.length() - 6));
        return A0S.toString();
    }

    public String A02(String str, String str2, boolean z) {
        if (!(this instanceof AnonymousClass00L)) {
            throw new RuntimeException("Must use overridden implementation");
        }
        AnonymousClass00L r2 = (AnonymousClass00L) this;
        StringBuilder sb = new StringBuilder("CrashLogs/Checking fb upload server status type=");
        sb.append(str2);
        Log.d(sb.toString());
        AnonymousClass1LM r1 = new AnonymousClass1LM();
        AnonymousClass0J3 r4 = new AnonymousClass0J3(r2.A0A, "https://crashlogs.whatsapp.net/wa_fls_upload_check", r2.A0C.A02(), new AnonymousClass235(r1), false, false);
        List list = r4.A0C;
        list.add(Pair.create("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af"));
        list.add(Pair.create("from", str));
        list.add(Pair.create("type", str2));
        list.add(Pair.create("support_exception_only_upload", String.valueOf(z)));
        int A01 = r4.A01(null);
        if (A01 == 200) {
            return r1.A00;
        }
        if (A01 == 403) {
            r1.A00 = "no_upload";
            return "no_upload";
        } else if (A01 != 500) {
            throw new IOException(AnonymousClass008.A0G("Unknown response code ", A01, " from crash upload server"));
        } else {
            throw new IOException("Response 500 received from server");
        }
    }

    public void A03(String str, int i) {
        if (!(this instanceof AnonymousClass00L)) {
            throw new RuntimeException("Must use overridden implementation");
        }
        A05(new AnonymousClass00A(str), i);
    }

    public void A04(String str, String str2, boolean z) {
        if (!(this instanceof AnonymousClass00L)) {
            throw new RuntimeException("Must use overridden implementation");
        }
        AnonymousClass00L r1 = (AnonymousClass00L) this;
        C08910by r3 = new C08910by();
        r3.A02 = str;
        r3.A01 = str2;
        if (z) {
            r3.A00 = C003701u.A09(new AnonymousClass00A(str));
        }
        r1.A09.A0B(r3, null, true);
    }

    public void A05(Throwable th, int i) {
        if (!(this instanceof AnonymousClass00L)) {
            throw new RuntimeException("Must use overridden implementation");
        }
        AnonymousClass00L r1 = (AnonymousClass00L) this;
        th.getMessage();
        if (i < 0) {
            i = 30;
        }
        if (C001801b.A00(r1.A03) <= i) {
            if (!(th instanceof AnonymousClass00A)) {
                th = new AnonymousClass00A(th);
            }
            Log.e("UNCAUGHT EXCEPTION", th);
            r1.A06(false, false, false, true, false, new HashSet(Collections.singletonList("log_files_upload")), null, null);
        }
    }

    public void A06(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, HashSet hashSet, File file, String str) {
        AnonymousClass0JF A02;
        if (!(this instanceof AnonymousClass00L)) {
            throw new RuntimeException("Must use overridden implementation");
        }
        AnonymousClass00L r2 = (AnonymousClass00L) this;
        if (z2 || (A02 = r2.A04.A02()) == null || !A02.A03) {
            try {
                r2.A0D.ANF(new AnonymousClass1YG(r2, z5, z, z2, z3, z4, hashSet, file, str));
            } catch (Exception e) {
                Log.e("crashlogs/upload/failed", e);
            }
        } else {
            Log.i("crashlogs/upload/roaming/skip");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ef, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f8, code lost:
        if (0 == 0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fa, code lost:
        r2 = java.lang.System.currentTimeMillis();
        r6 = r1.A0B(r0, r2);
        r4 = r1.A0A(r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        if (r6 != null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0108, code lost:
        if (r4 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010a, code lost:
        r14 = r4.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010e, code lost:
        r1.A0D(new X.AnonymousClass1YH(r6.getPath(), r14, r1.A01(), r30, r32, X.AnonymousClass00L.A03(r33), r35, r2));
        r1.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0127, code lost:
        if (r0 != r5) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0129, code lost:
        r0.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012c, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(boolean r29, boolean r30, boolean r31, boolean r32, java.util.HashSet r33, java.io.File r34, java.lang.String r35) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass009.A07(boolean, boolean, boolean, boolean, java.util.HashSet, java.io.File, java.lang.String):boolean");
    }
}
