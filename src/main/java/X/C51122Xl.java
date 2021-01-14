package X;

/* renamed from: X.2Xl  reason: invalid class name and case insensitive filesystem */
public class C51122Xl implements AnonymousClass0By {
    public final AnonymousClass0RN A00;
    public final C02430Bz A01;

    @Override // X.AnonymousClass0By
    public void AEz(AnonymousClass2F8 r1) {
    }

    @Override // X.AnonymousClass0By
    public void AF1(AnonymousClass2F8 r1) {
    }

    @Override // X.AnonymousClass0By
    public void AF3(AnonymousClass1VI r1) {
    }

    public C51122Xl(AnonymousClass0RN r1, C02430Bz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass0By
    public void AF0(C05350Oe r3, int i) {
        AnonymousClass008.A0v("OptInWebBeta/Device_Logout_Failed/errorCode: ", i);
        this.A00.A20(Boolean.FALSE);
        this.A01.A01(this);
    }

    @Override // X.AnonymousClass0By
    public void AF2(C05350Oe r3) {
        this.A00.A20(Boolean.TRUE);
        this.A01.A01(this);
    }
}
