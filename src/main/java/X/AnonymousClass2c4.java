package X;

/* renamed from: X.2c4  reason: invalid class name */
public class AnonymousClass2c4 implements AnonymousClass2M8 {
    public final /* synthetic */ AnonymousClass2MQ A00;

    @Override // X.AnonymousClass2M8
    public void ALS() {
    }

    public AnonymousClass2c4(AnonymousClass2MQ r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass2M8
    public void AEM(float f, int i) {
        AnonymousClass2MQ r2 = this.A00;
        r2.A03 = i;
        r2.A0A.setTextColor(i);
        AnonymousClass2MU r1 = r2.A0B;
        r1.A03 = i;
        r1.A01 = 1.0f;
        r1.invalidateSelf();
        r2.A0A.setFontStyle(r2.A04);
    }
}
