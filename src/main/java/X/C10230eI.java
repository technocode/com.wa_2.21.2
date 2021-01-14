package X;

import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.0eI  reason: invalid class name and case insensitive filesystem */
public class C10230eI extends AnonymousClass0JW {
    public final byte A00;
    public final C04080Iy A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass0B3 A03;
    public final AnonymousClass01K A04;
    public final AnonymousClass0BV A05;
    public final AnonymousClass00Y A06;
    public final File A07;
    public final WeakReference A08 = new WeakReference(null);

    public C10230eI(AnonymousClass009 r7, AnonymousClass00T r8, AnonymousClass00Y r9, AnonymousClass01K r10, AnonymousClass0BV r11, AnonymousClass0B3 r12, byte b, File file) {
        this.A02 = r7;
        this.A06 = r9;
        this.A00 = b;
        this.A04 = r10;
        this.A05 = r11;
        this.A03 = r12;
        this.A07 = file;
        C04080Iy r4 = new C04080Iy();
        r8.ANF(new RunnableEBaseShape0S0100100_I0(r4, 20000, 0));
        this.A01 = r4;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass2TD r5 = (AnonymousClass2TD) obj;
        AbstractC03150Ez r0 = (AbstractC03150Ez) this.A08.get();
        if (r0 != null) {
            r0.A1e(r5);
        }
        this.A06.A0B(r5.A00.A00(), null, false);
    }
}
