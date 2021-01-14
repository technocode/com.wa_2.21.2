package X;

/* renamed from: X.2fD  reason: invalid class name and case insensitive filesystem */
public class C54612fD implements AnonymousClass2QD {
    public float A00;
    public final AnonymousClass2Q0 A01;

    public C54612fD(float f, AnonymousClass2Q0 r2) {
        this.A00 = f;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass2QD
    public boolean A2r(Object obj) {
        String str = ((AnonymousClass2Q0) obj).A00;
        if (str != null) {
            return str.equals(this.A01.A00);
        }
        throw null;
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

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("WeightedRecentGifIdentifier{");
        stringBuffer.append("gifIdentifier=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", weight=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
