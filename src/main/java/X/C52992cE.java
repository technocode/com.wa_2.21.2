package X;

/* renamed from: X.2cE  reason: invalid class name and case insensitive filesystem */
public class C52992cE implements AnonymousClass2QD {
    public float A00;
    public AbstractC48432Mf A01;

    public C52992cE(AbstractC48432Mf r2, Float f) {
        this.A01 = r2;
        this.A00 = f.floatValue();
    }

    @Override // X.AnonymousClass2QD
    public boolean A2r(Object obj) {
        return this.A01.A9J().equals(((AbstractC48432Mf) obj).A9J());
    }

    @Override // X.AnonymousClass2QD
    public Object A6a() {
        return this.A01;
    }

    @Override // X.AnonymousClass2QD
    public float A9r() {
        return this.A00;
    }

    @Override // X.AnonymousClass2QD
    public void APN(float f) {
        this.A00 = f;
    }
}
