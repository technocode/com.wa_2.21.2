package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1vJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41591vJ {
    public final /* synthetic */ C41641vO A00;

    public /* synthetic */ C41591vJ(C41641vO r1) {
        this.A00 = r1;
    }

    public final void A00(long j) {
        AnonymousClass1RB r5 = this.A00.A01;
        AtomicLong atomicLong = r5.A0Z;
        atomicLong.addAndGet(j);
        if (j >= 10240) {
            r5.A0C.A0B(atomicLong.get(), r5.A0X.get());
        }
    }
}
