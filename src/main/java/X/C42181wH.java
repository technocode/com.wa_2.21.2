package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.1wH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42181wH implements AbstractC27861Rw {
    public final /* synthetic */ ActivityC004702f A00;

    public /* synthetic */ C42181wH(ActivityC004702f r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC27861Rw
    public final void AH7(C42301wU r3) {
        ActivityC004702f r1 = this.A00;
        r1.AMi();
        r1.APo(R.string.catalog_product_send_message_failed);
        Log.w("product-details/send-product/product load failed");
    }
}
