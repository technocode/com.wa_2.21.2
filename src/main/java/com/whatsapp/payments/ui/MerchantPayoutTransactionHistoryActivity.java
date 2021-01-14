package com.whatsapp.payments.ui;

import X.AbstractC005102k;
import X.ActivityC004602e;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.AnonymousClass3G9;
import X.AnonymousClass3GA;
import X.AnonymousClass3GB;
import X.AnonymousClass3IB;
import X.C002001d;
import X.C004302a;
import X.C02270Bi;
import X.C10000ds;
import X.C63382wK;
import X.C69403Gx;
import X.C73843Yx;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.StickyHeadersRecyclerView;

public class MerchantPayoutTransactionHistoryActivity extends ActivityC004602e {
    public FrameLayout A00;
    public StickyHeadersRecyclerView A01;
    public C69403Gx A02;
    public AnonymousClass3IB A03;
    public final C63382wK A04 = C63382wK.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.payout_transaction_history);
        int A002 = C004302a.A00(this, R.color.fb_pay_hub_icon_tint);
        A0C((Toolbar) findViewById(R.id.pay_service_toolbar));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08(((AnonymousClass2C0) this).A01.A06(R.string.payment_merchant_payouts_title));
            A09.A0A(true);
            A09.A04(C002001d.A0e(getResources().getDrawable(R.drawable.ic_close), A002));
        }
        this.A02 = new C69403Gx(this);
        this.A00 = (FrameLayout) findViewById(R.id.loading_container);
        StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) findViewById(R.id.transaction_list);
        this.A01 = stickyHeadersRecyclerView;
        stickyHeadersRecyclerView.setAdapter(this.A02);
        C63382wK r1 = this.A04;
        if (r1 != null) {
            AnonymousClass3IB r3 = (AnonymousClass3IB) C002001d.A0l(this, new C73843Yx(r1, this)).A00(AnonymousClass3IB.class);
            this.A03 = r3;
            if (r3 != null) {
                r3.A00.A07(Boolean.TRUE);
                r3.A01.A07(Boolean.FALSE);
                r3.A09.ANC(new C10000ds(r3, r3.A06), new Void[0]);
                AnonymousClass3IB r5 = this.A03;
                AnonymousClass3GB r4 = new AnonymousClass3GB(this);
                AnonymousClass3G9 r32 = new AnonymousClass3G9(this);
                AnonymousClass3GA r2 = new AnonymousClass3GA(this);
                r5.A02.A03(r5.A03, r4);
                C02270Bi r0 = r5.A00;
                AbstractC005102k r12 = r5.A03;
                r0.A03(r12, r32);
                r5.A01.A03(r12, r2);
                return;
            }
            throw null;
        }
        throw null;
    }
}
