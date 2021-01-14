package X;

/* renamed from: X.1Ze  reason: invalid class name and case insensitive filesystem */
public class C29541Ze implements AnonymousClass0TR {
    public final /* synthetic */ AnonymousClass23R A00;

    public C29541Ze(AnonymousClass23R r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0TR
    public void AEI(AnonymousClass0T8 r3, boolean z) {
        AnonymousClass0T8 A01;
        if (r3 instanceof AnonymousClass0TY) {
            if (!(r3 instanceof AnonymousClass0TY)) {
                A01 = r3;
            } else {
                A01 = ((AnonymousClass0TY) r3).A00.A01();
            }
            A01.A0F(false);
        }
        AnonymousClass0TR r0 = ((AnonymousClass1ZO) this.A00).A06;
        if (r0 != null) {
            r0.AEI(r3, z);
        }
    }

    @Override // X.AnonymousClass0TR
    public boolean AI7(AnonymousClass0T8 r4) {
        if (r4 == null) {
            return false;
        }
        AnonymousClass23R r1 = this.A00;
        r1.A03 = ((AnonymousClass0TY) r4).A01.A0R;
        AnonymousClass0TR r0 = ((AnonymousClass1ZO) r1).A06;
        if (r0 != null) {
            return r0.AI7(r4);
        }
        return false;
    }
}
