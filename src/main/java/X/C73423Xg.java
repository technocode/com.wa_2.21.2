package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Xg  reason: invalid class name and case insensitive filesystem */
public class C73423Xg extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ C61312sy A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73423Xg(C61312sy r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AnonymousClass0GT r6) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A00 = r6;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilRemoveMerchantAccount onRequestError: ");
        sb.append(r3);
        Log.i(sb.toString());
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJP(r3);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilRemoveMerchantAccount onResponseError=");
        sb.append(r3);
        Log.e(sb.toString());
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJU(r3);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r7) {
        Log.i("Pay: BrazilRemoveMerchantAccount successfully removed merchant account");
        C61312sy r5 = this.A01;
        C01970Ad r0 = r5.A08;
        r0.A04();
        C018709t r02 = r0.A06;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) C018709t.A03(r02)).iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass1VM) it.next()).A07);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r5.A09.ANF(new RunnableEBaseShape1S1100000_I1(this, (String) it2.next(), 22));
            }
        }
        C02060Am r2 = r5.A06;
        synchronized (r2) {
            r2.A00.A05(r2.A02);
        }
        AnonymousClass0GT r1 = this.A00;
        if (r1 != null) {
            r1.AJV(new C68443Df());
        }
    }
}
