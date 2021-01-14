package X;

/* renamed from: X.0Jh  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC04160Jh extends AbstractC04170Ji {
    public AnonymousClass078 A00;
    public boolean A01 = false;
    public final AnonymousClass078 A02;

    public AbstractC04160Jh(AnonymousClass078 r3) {
        this.A02 = r3;
        this.A00 = (AnonymousClass078) r3.A0H(EnumC04960Mn.NEW_MUTABLE_INSTANCE, null, null);
    }

    public AnonymousClass078 A00() {
        if (this.A01) {
            return this.A00;
        }
        this.A00.A0C();
        this.A01 = true;
        return this.A00;
    }

    public final AnonymousClass078 A01() {
        AnonymousClass078 A002 = A00();
        if (A002.A0F()) {
            return A002;
        }
        throw new AnonymousClass1FV();
    }

    public void A02() {
        if (this.A01) {
            AnonymousClass078 r2 = (AnonymousClass078) this.A00.A0H(EnumC04960Mn.NEW_MUTABLE_INSTANCE, null, null);
            r2.A0E(C04980Mp.A00, this.A00);
            this.A00 = r2;
            this.A01 = false;
        }
    }

    public void A03(AnonymousClass078 r3) {
        A02();
        this.A00.A0E(C04980Mp.A00, r3);
    }

    @Override // X.AnonymousClass077
    public AnonymousClass076 A61() {
        return this.A02;
    }

    @Override // java.lang.Object
    public Object clone() {
        AbstractC04160Jh r1 = (AbstractC04160Jh) this.A02.A0H(EnumC04960Mn.NEW_BUILDER, null, null);
        r1.A03(A00());
        return r1;
    }
}
