package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.3b4  reason: invalid class name and case insensitive filesystem */
public class C74523b4 extends C73483Xm {
    public final /* synthetic */ AnonymousClass3DW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74523b4(Context context, AnonymousClass02M r9, AnonymousClass04j r10, AnonymousClass0GP r11, C61082sT r12, AnonymousClass3DW r13) {
        super(context, r9, r10, r11, r12, "upi-get-blocked-vpas");
        this.A00 = r13;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r4) {
        AnonymousClass3DW r2 = this.A00;
        if (r2 != null) {
            StringBuilder sb = new StringBuilder("PAY: IndiaUpiBlockListManager fetch error: ");
            sb.append(r4);
            Log.e(sb.toString());
            AbstractC60992sK r0 = r2.A01;
            if (r0 != null) {
                r0.AJZ(r4);
            }
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r4) {
        AnonymousClass3DW r2 = this.A00;
        if (r2 != null) {
            StringBuilder sb = new StringBuilder("PAY: IndiaUpiBlockListManager fetch error: ");
            sb.append(r4);
            Log.e(sb.toString());
            AbstractC60992sK r0 = r2.A01;
            if (r0 != null) {
                r0.AJZ(r4);
            }
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r9) {
        ArrayList arrayList;
        AnonymousClass0M5 A0D = r9.A0D("account");
        if (A0D != null) {
            arrayList = new ArrayList();
            AnonymousClass0M5[] r4 = A0D.A03;
            if (r4 != null) {
                for (AnonymousClass0M5 r1 : r4) {
                    String A0G = r1.A0G("vpa", null);
                    if (!TextUtils.isEmpty(A0G)) {
                        arrayList.add(A0G);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        AnonymousClass3DW r6 = this.A00;
        if (r6 != null) {
            C449222e r42 = r6.A00;
            synchronized (r42) {
                long A05 = r42.A04.A05();
                r42.A00 = A05;
                if (arrayList != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("PAY: IndiaUpiBlockListManager fetch success size: ");
                    sb.append(arrayList.size());
                    sb.append(" time: ");
                    sb.append(r42.A00);
                    Log.i(sb.toString());
                    Set set = r42.A0B;
                    set.clear();
                    set.addAll(arrayList);
                    AnonymousClass008.A0q(r42.A0A, "payments_block_list", TextUtils.join(";", set));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PAY: IndiaUpiBlockListManager fetch success hash matched time: ");
                    sb2.append(A05);
                    Log.i(sb2.toString());
                }
                r42.A0A.A01().edit().putLong("payments_block_list_last_sync_time", r42.A00).apply();
            }
            AbstractC60992sK r0 = r6.A01;
            if (r0 != null) {
                r0.AJZ(null);
            }
        }
    }
}
