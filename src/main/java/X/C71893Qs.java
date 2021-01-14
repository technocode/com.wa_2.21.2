package X;

/* renamed from: X.3Qs  reason: invalid class name and case insensitive filesystem */
public class C71893Qs implements AnonymousClass2QD {
    public float A00;
    public final AnonymousClass33A A01;

    public C71893Qs(float f, AnonymousClass33A r2) {
        this.A00 = f;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass2QD
    public boolean A2r(Object obj) {
        String str = ((AnonymousClass33A) obj).A01;
        if (str != null) {
            return str.equals(this.A01.A01);
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
        StringBuffer stringBuffer = new StringBuffer("WeightedRecentStickerIdentifier{");
        stringBuffer.append("stickerIdentifier=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", weight=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
