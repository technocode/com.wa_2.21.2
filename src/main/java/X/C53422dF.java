package X;

/* renamed from: X.2dF  reason: invalid class name and case insensitive filesystem */
public class C53422dF extends AnonymousClass2Q7 {
    public static volatile C53422dF A01;
    public final AnonymousClass00D A00;

    public C53422dF(AnonymousClass00S r12, AnonymousClass00T r13, AnonymousClass00Y r14, AnonymousClass01X r15, AnonymousClass04j r16, AnonymousClass00D r17, C03910Ig r18, C53442dH r19, C53432dG r20, C48692Ni r21) {
        super(r12, r13, r14, r15, r18, r16, r19, r20, r21);
        this.A00 = r17;
    }

    @Override // X.AnonymousClass2Q7
    public AnonymousClass2Q5 A00() {
        if (this.A00.A00.getInt("emoji_search_algorithm_version", 0) == 2) {
            return super.A00();
        }
        return new AnonymousClass2Q5();
    }

    @Override // X.AnonymousClass2Q7
    public boolean A01(AnonymousClass2Q5 r5) {
        boolean A012 = super.A01(r5);
        if (A012) {
            AnonymousClass008.A0k(this.A00, "emoji_search_algorithm_version", 2);
        }
        return A012;
    }
}
