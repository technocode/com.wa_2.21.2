package X;

import com.whatsapp.location.LocationSharingService;

/* renamed from: X.2iJ  reason: invalid class name and case insensitive filesystem */
public class C56242iJ extends AnonymousClass1W2 {
    public final /* synthetic */ AnonymousClass1W2 A00;
    public final /* synthetic */ AnonymousClass0XZ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56242iJ(AnonymousClass0XZ r1, AnonymousClass02N r2, boolean z, AnonymousClass1W2 r4) {
        super(r2, z);
        this.A01 = r1;
        this.A00 = r4;
    }

    @Override // X.AnonymousClass1W2
    public void A02(int i) {
        super.A02(i);
        AnonymousClass1W2 r0 = this.A00;
        r0.A02(i);
        AnonymousClass0XZ r2 = this.A01;
        if (r2.A02.A0e(r0.A00)) {
            LocationSharingService.A01(r2.A01.A00, (long) i);
        }
    }
}
