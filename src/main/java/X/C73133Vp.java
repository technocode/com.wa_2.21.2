package X;

/* renamed from: X.3Vp  reason: invalid class name and case insensitive filesystem */
public class C73133Vp implements AnonymousClass09O {
    public final /* synthetic */ AnonymousClass09O A00;
    public final /* synthetic */ C67763Ad A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03 = "wabloks.245";
    public final /* synthetic */ boolean A04;

    public C73133Vp(C67763Ad r2, boolean z, String str, AnonymousClass09O r5) {
        this.A01 = r2;
        this.A04 = z;
        this.A02 = str;
        this.A00 = r5;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        this.A00.AEv(str);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r3) {
        this.A00.AFd(str, r3);
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r5) {
        if (this.A04) {
            String str2 = this.A03;
            String str3 = this.A02;
            AnonymousClass1TX A002 = ((AnonymousClass1TY) this.A01.A02.get()).A00(str2);
            A002.A00.A07(str3, new AnonymousClass1TW(r5));
        }
        this.A00.AKk(str, r5);
    }
}
