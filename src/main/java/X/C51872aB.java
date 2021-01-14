package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2aB  reason: invalid class name and case insensitive filesystem */
public class C51872aB implements AbstractC664834n {
    public TextView A00;
    public final AnonymousClass01X A01;

    @Override // X.AbstractC664834n
    public /* synthetic */ void AAV(ViewStub viewStub) {
        C664734m.A00(this, viewStub);
    }

    public C51872aB(AnonymousClass01X r1) {
        this.A01 = r1;
    }

    @Override // X.AbstractC664834n
    public void A2F(Object obj) {
        C05900Qy r3;
        AnonymousClass0MH r5 = (AnonymousClass0MH) obj;
        this.A00.setVisibility(8);
        if (r5 != null && (r3 = r5.A06) != null) {
            this.A00.setText(C02150Av.A01(this.A01, r3, r5.A08()));
            this.A00.setVisibility(0);
        }
    }

    @Override // X.AbstractC664834n
    public int A74() {
        return R.layout.conversation_row_payment_amount_summary;
    }

    @Override // X.AbstractC664834n
    public void ALk(View view) {
        this.A00 = (TextView) AnonymousClass0Q7.A0D(view, R.id.amount_container);
    }
}
