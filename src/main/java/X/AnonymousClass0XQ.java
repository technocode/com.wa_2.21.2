package X;

import java.util.Set;

/* renamed from: X.0XQ  reason: invalid class name */
public class AnonymousClass0XQ {
    public static volatile AnonymousClass0XQ A05;
    public Set A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass00D A02;
    public final AnonymousClass0FS A03;
    public final AnonymousClass0A8 A04;

    public AnonymousClass0XQ(AnonymousClass02M r1, AnonymousClass0FS r2, AnonymousClass00D r3, AnonymousClass0A8 r4) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A04 = r4;
    }

    public static AnonymousClass0XQ A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0L1.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0XQ(AnonymousClass02M.A00(), AnonymousClass0FS.A00(), AnonymousClass00D.A00(), AnonymousClass0A8.A00);
                }
            }
        }
        return A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r3 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XQ.A01():void");
    }

    public void A02(AnonymousClass0QM r5) {
        A01();
        if (this.A00.isEmpty()) {
            AnonymousClass008.A0l(this.A02, "first_unseen_joinable_call", r5.A02());
        }
        synchronized (this) {
            this.A00.add(r5.A09.A02);
        }
        AnonymousClass02M r3 = this.A01;
        r3.A02.post(new RunnableEBaseShape4S0100000_I0_4(this.A04, 47));
    }
}
