package X;

/* renamed from: X.2dG  reason: invalid class name and case insensitive filesystem */
public class C53432dG {
    public static volatile C53432dG A06;
    public final C000300f A00;
    public final AnonymousClass0CL A01;
    public final C03910Ig A02;
    public final C03950Ik A03;
    public final C02660Cy A04;
    public final AnonymousClass03U A05;

    public C53432dG(AnonymousClass0CL r1, C000300f r2, C03950Ik r3, AnonymousClass03U r4, C02660Cy r5, C03910Ig r6) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
        this.A02 = r6;
    }

    public static C53432dG A00() {
        if (A06 == null) {
            synchronized (C53432dG.class) {
                if (A06 == null) {
                    A06 = new C53432dG(AnonymousClass0CL.A00(), C000300f.A00(), C03950Ik.A00(), AnonymousClass03U.A00(), C02660Cy.A00(), C03910Ig.A00());
                }
            }
        }
        return A06;
    }
}
