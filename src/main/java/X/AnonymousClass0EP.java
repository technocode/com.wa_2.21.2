package X;

import com.whatsapp.util.Log;

/* renamed from: X.0EP  reason: invalid class name */
public class AnonymousClass0EP {
    public static volatile AnonymousClass0EP A06;
    public final AnonymousClass09A A00;
    public final C014408c A01;
    public final C006903j A02;
    public final C015308l A03;
    public final AnonymousClass094 A04;
    public final C014508d A05;

    public AnonymousClass0EP(C015308l r1, C014408c r2, C006903j r3, AnonymousClass09A r4, C014508d r5, AnonymousClass094 r6) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
        this.A05 = r5;
        this.A04 = r6;
    }

    public static AnonymousClass0EP A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0EP.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0EP(C015308l.A00(), C014408c.A00(), C006903j.A00(), AnonymousClass09A.A02, C014508d.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A06;
    }

    public void A01(AnonymousClass02N r4, String str) {
        StringBuilder sb = new StringBuilder("msgstore/updategroupchatsubject/");
        sb.append(r4);
        Log.i(sb.toString());
        this.A00.A01(new RunnableEBaseShape0S1200000_I0(this, r4, str, 10), 37);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r0 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0084, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass02N r8, java.lang.String r9, java.lang.Long r10) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EP.A02(X.02N, java.lang.String, java.lang.Long):void");
    }

    public void A03(AnonymousClass02U r4, String str, long j) {
        StringBuilder sb = new StringBuilder("msgstore/updategroupchat/");
        sb.append(r4);
        sb.append(" creation=");
        sb.append(j);
        Log.i(sb.toString());
        this.A00.A01(new AnonymousClass2KR(this, r4, str, j), 38);
    }
}
