package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3XW  reason: invalid class name */
public class AnonymousClass3XW extends AbstractC68463Dh {
    public final /* synthetic */ C61232sq A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XW(C61232sq r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilDeviceBindingAction onRequestError: ");
        sb.append(r3);
        Log.i(sb.toString());
        this.A00.A09.AEy(null, null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilDeviceBindingAction onResponseError: ");
        sb.append(r3);
        Log.i(sb.toString());
        this.A00.A09.AEy(null, null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r9) {
        AnonymousClass0M5 A0D;
        AnonymousClass0M5[] r0;
        int length;
        AnonymousClass0M5 A0D2 = r9.A0D("account");
        if (A0D2 == null || (A0D = A0D2.A0D("card")) == null) {
            this.A00.A09.AEy(null, null, new C61072sS());
            return;
        }
        C74723bO r02 = new C74723bO();
        r02.A01(0, A0D);
        C43761yu r5 = (C43761yu) r02.A03();
        ArrayList arrayList = new ArrayList();
        AnonymousClass0M5 A0D3 = A0D2.A0D("verify-method-list");
        if (!(A0D3 == null || (r0 = A0D3.A03) == null || (length = r0.length) <= 0)) {
            for (int i = 0; i < length; i++) {
                arrayList.add(new C61672tY(A0D3.A0C(i)));
            }
        }
        this.A00.A09.AEy(r5, arrayList, null);
    }
}
