package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1wG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42171wG implements AnonymousClass1Rv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ActivityC004702f A01;
    public final /* synthetic */ AnonymousClass1S6 A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ C42171wG(AnonymousClass1S6 r1, List list, int i, ActivityC004702f r4) {
        this.A02 = r1;
        this.A03 = list;
        this.A00 = i;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass1Rv
    public final void ACy(C42301wU r11) {
        AnonymousClass1S6 r0 = this.A02;
        List list = this.A03;
        int i = this.A00;
        ActivityC004702f r8 = this.A01;
        String A0A = r0.A06.A0A(R.plurals.catalog_send_product_message, (long) list.size(), Integer.valueOf(i + 1), Integer.valueOf(list.size()));
        if (C06090Rr.A02) {
            r8.AQu(A0A);
        } else {
            r8.A0M(A0A);
        }
        Log.i("product-details/send-product/async load begin");
    }
}
