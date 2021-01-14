package X;

/* renamed from: X.0z4  reason: invalid class name and case insensitive filesystem */
public class C21630z4 {
    public boolean A00;
    public final C22170zz A01;

    public C21630z4(C22170zz r1) {
        this.A01 = r1;
    }

    public final void A00(String str) {
        StringBuilder sb = new StringBuilder("Can only check if prepared on the Optic thread. ");
        sb.append(str);
        A01(sb.toString());
        if (!this.A00) {
            StringBuilder A0Z = AnonymousClass008.A0Z("Not prepared: ", str, " Current thread: ");
            A0Z.append(Thread.currentThread().getName());
            throw new IllegalStateException(A0Z.toString());
        }
    }

    public final void A01(String str) {
        if (!this.A01.A08()) {
            StringBuilder A0Y = AnonymousClass008.A0Y(str, " Current thread: ");
            A0Y.append(Thread.currentThread().getName());
            throw new RuntimeException(A0Y.toString());
        }
    }

    public final void A02(boolean z, String str) {
        StringBuilder sb = new StringBuilder("Can only set the prepared state on the Optic thread. ");
        sb.append(str);
        A01(sb.toString());
        this.A00 = z;
    }
}
