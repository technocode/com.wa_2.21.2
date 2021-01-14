package X;

import java.io.Closeable;

/* renamed from: X.2Ty  reason: invalid class name and case insensitive filesystem */
public final class C50242Ty implements Closeable {
    public final AnonymousClass2KL A00;
    public final AnonymousClass2KL A01;
    public final AnonymousClass2KL A02;
    public final AnonymousClass2KL A03;
    public final /* synthetic */ C02480Ce A04;

    public C50242Ty(C02480Ce r2, AnonymousClass2KL r3, AnonymousClass2KL r4) {
        this.A04 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = null;
        this.A01 = null;
    }

    public C50242Ty(C02480Ce r1, AnonymousClass2KL r2, AnonymousClass2KL r3, AnonymousClass2KL r4, AnonymousClass2KL r5) {
        this.A04 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A02 = r4;
        this.A01 = r5;
    }

    public C50232Tx A00() {
        String A002;
        String A003 = this.A03.A00();
        AnonymousClass2KL r1 = this.A00;
        String A004 = r1.A00();
        AnonymousClass2KL r0 = this.A02;
        String str = null;
        if (r0 == null) {
            A002 = null;
        } else {
            A002 = r0.A00();
        }
        AnonymousClass2KL r02 = this.A01;
        if (r02 != null) {
            str = r02.A00();
        }
        return new C50232Tx(A003, A004, A002, str, r1.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C006803i.A0Z(this.A00);
        C006803i.A0Z(this.A03);
        C006803i.A0Z(this.A02);
        C006803i.A0Z(this.A01);
    }
}
