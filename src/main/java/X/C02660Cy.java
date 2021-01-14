package X;

/* renamed from: X.0Cy  reason: invalid class name and case insensitive filesystem */
public class C02660Cy {
    public static volatile C02660Cy A02;
    public AnonymousClass21W A00;
    public final AnonymousClass03A A01;

    public C02660Cy(AnonymousClass03A r1) {
        this.A01 = r1;
    }

    public static C02660Cy A00() {
        if (A02 == null) {
            synchronized (C02660Cy.class) {
                if (A02 == null) {
                    A02 = new C02660Cy(AnonymousClass03A.A00());
                }
            }
        }
        return A02;
    }

    public AnonymousClass21W A01() {
        AnonymousClass21W r1 = this.A00;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass21W r12 = new AnonymousClass21W(this.A01);
        this.A00 = r12;
        return r12;
    }
}
