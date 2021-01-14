package X;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.webkit.URLUtil;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.1tI  reason: invalid class name and case insensitive filesystem */
public class C40451tI extends AnonymousClass0JW {
    public static final HashMap A09 = new HashMap();
    public int A00;
    public long A01;
    public AnonymousClass1WL A02;
    public final AnonymousClass0EV A03 = AnonymousClass0EV.A00();
    public final AnonymousClass00G A04 = AnonymousClass00G.A01;
    public final AnonymousClass0ET A05 = AnonymousClass0ET.A00();
    public final AnonymousClass03U A06 = AnonymousClass03U.A00();
    public final AnonymousClass03A A07 = AnonymousClass03A.A00();
    public final AnonymousClass00T A08 = C002101e.A00();

    public C40451tI(AnonymousClass1WL r2, int i, long j) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = j;
    }

    public static File A00(Context context, C40451tI r3) {
        File file = new File(context.getCacheDir(), "ProfilePictureTemp");
        file.mkdirs();
        return new File(file, URLUtil.guessFileName(r3.A02.A05.toString(), null, null));
    }

    public static void A01(AnonymousClass1WL r4, int i, long j, AnonymousClass00T r8) {
        HashMap hashMap = A09;
        synchronized (hashMap) {
            AnonymousClass02N r1 = r4.A03;
            if (hashMap.containsKey(r1)) {
                C40451tI r3 = (C40451tI) hashMap.get(r1);
                if (!r3.A02.A05.equals(r4.A05)) {
                    ((AnonymousClass0JW) r3).A00.cancel(true);
                    hashMap.remove(r3.A02.A03);
                    A02(r4, i, j, r8);
                } else if (!((AnonymousClass0JW) r3).A00.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    hashMap.remove(r3.A02.A03);
                    A02(r4, i, j, r8);
                }
            } else {
                A02(r4, i, j, r8);
            }
        }
    }

    public static void A02(AnonymousClass1WL r3, int i, long j, AnonymousClass00T r7) {
        C40451tI r2 = new C40451tI(r3, i, j);
        A09.put(r3.A03, r2);
        r7.ANC(r2, new Void[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.Object r6) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40451tI.A03(java.lang.Object):void");
    }

    public final void A04(AnonymousClass1NC r3) {
        HashMap hashMap = A09;
        synchronized (hashMap) {
            hashMap.remove(this.A02.A03);
        }
        r3.A02.delete();
    }

    public final void A05(AnonymousClass1NC r8) {
        Double d;
        AnonymousClass0ET r6 = this.A05;
        int i = r8.A00;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.A01);
        File file = r8.A02;
        if (file != null) {
            d = Double.valueOf((double) file.length());
        } else {
            d = null;
        }
        r6.A02(i, 2, valueOf, d);
    }
}
