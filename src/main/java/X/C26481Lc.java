package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.Locale;

/* renamed from: X.1Lc  reason: invalid class name and case insensitive filesystem */
public class C26481Lc {
    public static volatile C26481Lc A06;
    public final C39981sQ A00;
    public final AnonymousClass00C A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass03S A04;
    public final AnonymousClass0A8 A05;

    public C26481Lc(AnonymousClass00G r2, AnonymousClass00S r3, AnonymousClass00C r4, AnonymousClass03S r5, AnonymousClass0A8 r6, C39981sQ r7) {
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r7;
        r6.A00(new C39991sR(this));
    }

    public static C26481Lc A00() {
        if (A06 == null) {
            synchronized (C26481Lc.class) {
                if (A06 == null) {
                    A06 = new C26481Lc(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass00C.A00(), AnonymousClass03S.A00(), AnonymousClass0A8.A00, C39981sQ.A00);
                }
            }
        }
        return A06;
    }

    public final File A01() {
        AnonymousClass00G r1 = this.A03;
        if (r1.A00.getExternalCacheDir() == null) {
            Log.e("draftvoicenotecache/getcachedvoicenotesdirectory/external cache directory could not be accessed");
            return null;
        }
        File file = new File(r1.A00.getExternalCacheDir().getAbsolutePath(), "Cached Voice Notes");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        Log.e("draftvoicenotecache/getcachedvoicenotefile/problem creating directory ");
        return null;
    }

    public final File A02(AnonymousClass02N r6) {
        File A012 = A01();
        if (A012 == null) {
            return null;
        }
        return new File(A012, String.format(Locale.US, "%s.%s", r6.getRawString(), "opus"));
    }

    public final File A03(AnonymousClass02N r6) {
        File A012 = A01();
        if (A012 == null) {
            Log.i("draftvoicenotecache/getquotedmessagefile/cached voice note directory is null");
            return null;
        }
        return new File(A012, String.format(Locale.US, "%s.txt", r6.getRawString()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (X.C006803i.A0m(r0) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass02N r7) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26481Lc.A04(X.02N):void");
    }

    public final void A05(AnonymousClass02N r3) {
        File A032 = A03(r3);
        if (A032 != null && A032.exists() && A032.delete()) {
            AnonymousClass008.A11("draftvoicenotecache/deletevoicenote deleted quoted message file jid ", r3);
        }
    }
}
