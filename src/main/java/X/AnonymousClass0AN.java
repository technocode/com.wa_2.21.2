package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.0AN  reason: invalid class name */
public class AnonymousClass0AN {
    public static volatile AnonymousClass0AN A07;
    public final AnonymousClass0A9 A00;
    public final C015308l A01;
    public final AnonymousClass094 A02;
    public final C014508d A03;
    public final C015408m A04;
    public final C015708p A05;
    public final Map A06 = Collections.synchronizedMap(new AnonymousClass04h(200));

    public AnonymousClass0AN(C015308l r3, AnonymousClass0A9 r4, C015408m r5, C015708p r6, C014508d r7, AnonymousClass094 r8) {
        this.A01 = r3;
        this.A00 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r7;
        this.A02 = r8;
    }

    public static AnonymousClass0AN A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0AN.class) {
                if (A07 == null) {
                    C015308l A002 = C015308l.A00();
                    AnonymousClass0A9 A003 = AnonymousClass0A9.A00();
                    C015408m A004 = C015408m.A00();
                    C015708p A005 = C015708p.A00();
                    C014508d A006 = C014508d.A00();
                    AnonymousClass096.A00();
                    A07 = new AnonymousClass0AN(A002, A003, A004, A005, A006, AnonymousClass094.A00());
                }
            }
        }
        return A07;
    }
}
