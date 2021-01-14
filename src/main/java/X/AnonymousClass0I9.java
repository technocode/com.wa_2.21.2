package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.0I9  reason: invalid class name */
public class AnonymousClass0I9 {
    public static volatile AnonymousClass0I9 A04;
    public final AnonymousClass0DH A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass01Q A02;
    public final AnonymousClass0IA A03;

    public AnonymousClass0I9(AnonymousClass0DH r1, AnonymousClass01A r2, AnonymousClass01Q r3, AnonymousClass0IA r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static AnonymousClass0I9 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0I9.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0I9(AnonymousClass0DH.A00(), AnonymousClass01A.A00(), AnonymousClass01Q.A00(), AnonymousClass0IA.A00());
                }
            }
        }
        return A04;
    }

    public void A01(Collection collection) {
        if (!this.A00.A0L()) {
            this.A01.A0P(collection);
            this.A03.A05(new ArrayList(collection));
        }
    }
}
