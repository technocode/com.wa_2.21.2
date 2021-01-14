package X;

import java.util.concurrent.Callable;

/* renamed from: X.384  reason: invalid class name */
public final /* synthetic */ class AnonymousClass384 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C72723Tz A01;

    public /* synthetic */ AnonymousClass384(C72723Tz r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C72723Tz r2 = this.A01;
        int i = this.A00;
        if (C72723Tz.A00(r2.A03)) {
            return -6;
        }
        r2.A07.setScaleType(i);
        return 0;
    }
}
