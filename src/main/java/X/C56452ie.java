package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2ie  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56452ie implements AbstractC03150Ez {
    public final /* synthetic */ C40531tQ A00;
    public final /* synthetic */ C04420Kh A01;

    public /* synthetic */ C56452ie(C04420Kh r1, C40531tQ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        ((AtomicInteger) obj).addAndGet(this.A00.A01.size());
    }
}
