package X;

import android.util.Pair;

/* renamed from: X.1nP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C37021nP implements AbstractC24581Bn {
    public final Pair A00;
    public final C013207n A01;

    public C37021nP(C013207n r1, Pair pair) {
        this.A01 = r1;
        this.A00 = pair;
    }

    @Override // X.AbstractC24581Bn
    public final Object AQY(AbstractC011406u r4) {
        C013207n r2 = this.A01;
        Pair pair = this.A00;
        synchronized (r2) {
            r2.A00.remove(pair);
        }
        return r4;
    }
}
