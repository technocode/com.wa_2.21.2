package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;

/* renamed from: X.1xL  reason: invalid class name and case insensitive filesystem */
public final class C42821xL implements AbstractC27901Sb {
    public final WaTextView A00;
    public final AnonymousClass01X A01;

    public C42821xL(AnonymousClass01X r2, View view) {
        this.A01 = r2;
        WaTextView waTextView = (WaTextView) view.findViewById(R.id.title);
        this.A00 = waTextView;
        C002301g.A03(waTextView);
    }

    @Override // X.AbstractC27901Sb
    public void ADY(AbstractC27921Sd r3) {
        String A06;
        int i = ((C42881xR) r3).A00;
        if (i == 0) {
            A06 = this.A01.A06(R.string.block_list_contacts_header);
        } else if (i == 1) {
            A06 = this.A01.A06(R.string.block_list_businesses_header);
        } else if (i != 2) {
            A06 = null;
        } else {
            A06 = this.A01.A06(R.string.block_list_payments_header);
        }
        this.A00.setText(A06);
    }
}
