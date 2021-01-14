package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;

/* renamed from: X.0d0  reason: invalid class name and case insensitive filesystem */
public class ActivityC09470d0 extends ActivityC004602e {
    public RecyclerView A00;
    public PayToolbar A01;
    public final C018809u A02 = C018809u.A00("PaymentComponentListActivity", "infra", "COMMON");
    public final AnonymousClass3H6 A03 = new AnonymousClass3H6(this);

    public AbstractC11910hD A0T(ViewGroup viewGroup, int i) {
        C018809u r2 = this.A02;
        StringBuilder sb = new StringBuilder("Create view holder for ");
        sb.append(i);
        r2.A03(sb.toString());
        if (i == 100) {
            return new C73613Ya(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_common_component_section_header, viewGroup, false));
        }
        if (i == 102) {
            return new C73623Yb(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_common_component_section_separator, viewGroup, false));
        }
        if (i == 103) {
            return new C73623Yb(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.divider, viewGroup, false));
        }
        StringBuilder sb2 = new StringBuilder("no valid mapping for: ");
        sb2.append(i);
        throw new RuntimeException(C018809u.A01("PaymentComponentListActivity", sb2.toString()));
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (!(this instanceof PaymentTransactionDetailsListActivity)) {
            z = !(this instanceof IndiaUpiMandateHistoryActivity);
        } else {
            z = false;
        }
        if (z) {
            setContentView(R.layout.payment_component_pay_service_list_activity);
            int A002 = C004302a.A00(this, R.color.fb_pay_hub_icon_tint);
            PayToolbar payToolbar = (PayToolbar) findViewById(R.id.pay_service_toolbar);
            this.A01 = payToolbar;
            A0C(payToolbar);
            AnonymousClass0S2 A09 = A09();
            if (A09 != null) {
                A09.A08(((AnonymousClass2C0) this).A01.A06(R.string.facebook_pay));
                A09.A0A(true);
                A09.A04(C002001d.A0e(getResources().getDrawable(R.drawable.ic_close), A002));
            }
        } else {
            setContentView(R.layout.payment_component_list_activity);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.payment_component_list);
        this.A00 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.A00.setAdapter(this.A03);
    }
}
