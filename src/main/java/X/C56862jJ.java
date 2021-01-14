package X;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2jJ  reason: invalid class name and case insensitive filesystem */
public class C56862jJ implements AnonymousClass2T4 {
    public int A00;
    public C56872jK A01;
    public boolean A02;
    public byte[] A03;
    public final C03140Ey A04;
    public final C03140Ey A05;
    public final C03140Ey A06 = new C03140Ey();
    public final C03140Ey A07 = new C03140Ey();
    public final C03140Ey A08 = new C03140Ey();
    public final C03140Ey A09 = new C03140Ey();
    public final C03140Ey A0A;
    public final C03140Ey A0B;
    public final C03140Ey A0C = new C03140Ey();
    public final C03140Ey A0D;
    public final C03140Ey A0E;
    public final C03140Ey A0F;
    public final C03140Ey A0G;
    public final AnonymousClass2KO A0H;
    public final AnonymousClass1W6 A0I;
    public final AnonymousClass2T3 A0J;
    public final AnonymousClass2TE A0K;
    public final AbstractC03150Ez A0L;
    public final AbstractC03150Ez A0M;
    public final AbstractC03150Ez A0N;
    public final AbstractC03150Ez A0O;
    public final Object A0P = new Object();
    public final AtomicBoolean A0Q = new AtomicBoolean();
    public final AtomicBoolean A0R = new AtomicBoolean();
    public volatile String A0S;

    public C56862jJ(AnonymousClass1W6 r6, AnonymousClass2TE r7, AnonymousClass2T3 r8, AnonymousClass2KO r9) {
        C03140Ey r4 = new C03140Ey();
        this.A0B = r4;
        C03140Ey r3 = new C03140Ey();
        this.A0A = r3;
        C03140Ey r2 = new C03140Ey();
        this.A0E = r2;
        C03140Ey r1 = new C03140Ey();
        this.A0F = r1;
        this.A0G = new C03140Ey();
        this.A0D = new C03140Ey();
        this.A04 = new C03140Ey();
        this.A05 = new C03140Ey();
        this.A0L = r3;
        this.A0M = r4;
        this.A0N = r2;
        this.A0O = r1;
        this.A0K = r7;
        this.A0I = r6;
        this.A0J = r8;
        AnonymousClass2TT r32 = r7.A01;
        byte b = r32.A05.A00;
        int i = r32.A01;
        synchronized (r8) {
            r8.A05 = Integer.valueOf(C002001d.A00(b, i, false));
        }
        AnonymousClass2T3 r12 = this.A0J;
        boolean z = r7.A00.A0B;
        synchronized (r12) {
            r12.A08 = z;
        }
        File file = r32.A07;
        if (file != null) {
            this.A07.A04(new AnonymousClass1WE(file, true));
        }
        this.A0H = r9;
    }

    public AnonymousClass2T3 A00() {
        AnonymousClass2T3 r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2TF A01() {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56862jJ.A01():X.2TF");
    }

    public AnonymousClass2TT A02() {
        AnonymousClass2TT r0 = this.A0K.A01;
        AnonymousClass1WE r2 = (AnonymousClass1WE) this.A07.A00();
        if (r0 != null) {
            return r2 != null ? new AnonymousClass2TT(r0.A08, r2.A01, r0.A0B, r0.A09, r0.A0A, r0.A05, r0.A00, r0.A01, r0.A02, r0.A03, r0.A0D, r0.A0G, r0.A0C, r0.A06, r0.A04, false, r0.A0F) : r0;
        }
        throw null;
    }

    public void A03() {
        this.A08.A01();
        this.A07.A01();
        this.A06.A01();
        this.A09.A01();
        this.A0B.A01();
        this.A0A.A01();
        this.A0C.A01();
        this.A0E.A01();
        this.A0F.A01();
        this.A0G.A01();
        this.A0D.A01();
    }

    public void A04(int i) {
        this.A09.A04(Integer.valueOf(i));
    }
}
