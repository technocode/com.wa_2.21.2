package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.0KJ  reason: invalid class name */
public class AnonymousClass0KJ extends AnonymousClass0KK implements AnonymousClass0KL {
    public static volatile AnonymousClass0KJ A07;
    public final C000300f A00;
    public final AnonymousClass0DH A01;
    public final AnonymousClass0DW A02;
    public final AnonymousClass0KN A03 = new AnonymousClass0KM(this);
    public final AnonymousClass00T A04;
    public final AnonymousClass0C4 A05;
    public final AnonymousClass0C6 A06;

    @Override // X.AnonymousClass0KL
    public void ALo(int i) {
    }

    @Override // X.AnonymousClass0KL
    public void ALq() {
    }

    public AnonymousClass0KJ(AnonymousClass00T r2, AnonymousClass0C4 r3, C000300f r4, AnonymousClass0DH r5, AnonymousClass0C6 r6, AnonymousClass0F0 r7, C006303d r8, AnonymousClass0DW r9) {
        this.A04 = r2;
        this.A05 = r3;
        this.A00 = r4;
        this.A01 = r5;
        this.A06 = r6;
        this.A02 = r9;
        r8.A00(this);
        r7.A00(this.A03);
    }

    public static AnonymousClass0KJ A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0KJ.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass0KJ(C002101e.A00(), AnonymousClass0C4.A00(), C000300f.A00(), AnonymousClass0DH.A00(), AnonymousClass0C6.A00(), AnonymousClass0F0.A00(), C006303d.A00(), AnonymousClass0DW.A00());
                }
            }
        }
        return A07;
    }

    public boolean A01(String str) {
        Iterator it = ((AbstractCollection) this.A05.A04()).iterator();
        while (it.hasNext()) {
            AnonymousClass0K4 r2 = (AnonymousClass0K4) it.next();
            if (r2.A03 == 1 && !r2.A0I.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AnonymousClass0KL
    public void ALp(AnonymousClass0K4 r4) {
        if (r4.A03 == 1 && !A01(r4.A0I)) {
            this.A04.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 20));
        }
    }
}
