package X;

import java.util.concurrent.Callable;

/* renamed from: X.381  reason: invalid class name */
public final /* synthetic */ class AnonymousClass381 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C72723Tz A06;

    public /* synthetic */ AnonymousClass381(C72723Tz r1, long j, int i, int i2, int i3, int i4, int i5) {
        this.A06 = r1;
        this.A05 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C72723Tz r1 = this.A06;
        long j = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int i5 = this.A04;
        if (C72723Tz.A00(r1.A03)) {
            return -6;
        }
        r1.A07.renderNativeFrame(j, i, i2, i3, i4, i5);
        return Integer.valueOf(r1.A01());
    }
}
