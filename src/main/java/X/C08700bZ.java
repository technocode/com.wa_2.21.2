package X;

/* renamed from: X.0bZ  reason: invalid class name and case insensitive filesystem */
public class C08700bZ implements AnonymousClass0SG {
    public C04080Iy A00;
    public final /* synthetic */ AnonymousClass0RN A01;
    public final /* synthetic */ AnonymousClass0Yj A02;
    public final /* synthetic */ AnonymousClass0XL A03;
    public final /* synthetic */ boolean A04 = true;

    public C08700bZ(AnonymousClass0XL r2, AnonymousClass0RN r3, AnonymousClass0Yj r4) {
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    @Override // X.AnonymousClass0SG
    public void ADy(Object obj) {
        C04080Iy r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        RunnableEBaseShape4S0200000_I0_3 runnableEBaseShape4S0200000_I0_3 = new RunnableEBaseShape4S0200000_I0_3(this, obj);
        this.A00 = ((C666535g) runnableEBaseShape4S0200000_I0_3.A00).A00;
        if (this.A04) {
            this.A03.A00.ANJ(runnableEBaseShape4S0200000_I0_3);
        } else {
            this.A03.A00.ANF(runnableEBaseShape4S0200000_I0_3);
        }
    }
}
