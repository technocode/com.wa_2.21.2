package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.3Xi  reason: invalid class name and case insensitive filesystem */
public class C73443Xi extends AbstractC68463Dh {
    public final /* synthetic */ C73453Xj A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73443Xi(C73453Xj r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r3) {
        this.A00.A07.A00(new C61072sS());
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        this.A00.A07.A00(new C61072sS());
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r5) {
        try {
            AnonymousClass0M5 A0E = r5.A0E("account");
            C61072sS A002 = C61072sS.A00(A0E);
            if (A002 != null) {
                this.A00.A07.A00(A002);
                return;
            }
            C74733bP r2 = new C74733bP();
            r2.A01(0, A0E.A0E("merchant"));
            C43771yv r22 = (C43771yv) r2.A03();
            this.A00.A06.A01().A01(r22, new C68633Dy(this, r22));
        } catch (AnonymousClass1XC unused) {
            Log.e("PAY: BrazilMerchantRegAction/regMerchant: invalid response message");
            this.A00.A07.A00(new C61072sS());
        }
    }
}
