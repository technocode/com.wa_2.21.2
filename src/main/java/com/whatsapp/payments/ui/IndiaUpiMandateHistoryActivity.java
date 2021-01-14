package com.whatsapp.payments.ui;

import X.AbstractC11910hD;
import X.AbstractC29091Wz;
import X.ActivityC09470d0;
import X.AnonymousClass0AD;
import X.AnonymousClass0S2;
import X.AnonymousClass3I6;
import X.AnonymousClass3YS;
import X.C002001d;
import X.C018809u;
import X.C63332wF;
import X.C68953Fe;
import X.C68963Ff;
import X.C69303Gn;
import X.C73783Yr;
import X.C74813bX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

public class IndiaUpiMandateHistoryActivity extends ActivityC09470d0 {
    public AbstractC29091Wz A00;
    public AnonymousClass3I6 A01;
    public final AnonymousClass0AD A02 = AnonymousClass0AD.A00;
    public final C018809u A03 = C018809u.A00("IndiaUpiMandateHistoryActivity", "mandates", "IN");
    public final C63332wF A04 = C63332wF.A00();

    @Override // X.ActivityC09470d0
    public AbstractC11910hD A0T(ViewGroup viewGroup, int i) {
        if (i == 1002) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_expandable_listview, viewGroup, false);
            inflate.setBackgroundColor(inflate.getContext().getResources().getColor(R.color.primary_surface));
            return new C74813bX(inflate);
        } else if (i != 1003) {
            return super.A0T(viewGroup, i);
        } else {
            return new AnonymousClass3YS(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_payment_section_header_component, viewGroup, false));
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC09470d0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08(getString(R.string.upi_mandate_row_title));
            A09.A0A(true);
        }
        this.A03.A07(null, "onCreate", null);
        C63332wF r1 = this.A04;
        if (r1 != null) {
            AnonymousClass3I6 r3 = (AnonymousClass3I6) C002001d.A0l(this, new C73783Yr(r1, this)).A00(AnonymousClass3I6.class);
            this.A01 = r3;
            if (r3 != null) {
                r3.A06.ANF(new RunnableEBaseShape11S0100000_I1_6(r3, 38));
                AnonymousClass3I6 r0 = this.A01;
                r0.A01.A03(r0.A00, new C68963Ff(this));
                AnonymousClass3I6 r02 = this.A01;
                r02.A02.A03(r02.A00, new C68953Fe(this));
                C69303Gn r12 = new C69303Gn(this);
                this.A00 = r12;
                this.A02.A01(r12);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        this.A02.A00(this.A00);
        super.onDestroy();
    }
}
