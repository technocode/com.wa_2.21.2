package com.whatsapp.util;

import X.AbstractView$OnClickListenerC08330av;
import X.ActivityC004702f;
import X.AnonymousClass02N;
import X.AnonymousClass32V;
import X.C02780Dk;
import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import java.util.Set;

public class ViewOnClickCListenerShape1S1200000_I1 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public ViewOnClickCListenerShape1S1200000_I1(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        switch (this.A03) {
            case 0:
                QuickContactActivity.A04((Activity) this.A00, view, (AnonymousClass02N) this.A01, this.A02);
                return;
            case 1:
                Set set = (Set) this.A01;
                if (set == null) {
                    AnonymousClass32V r0 = (AnonymousClass32V) this.A00;
                    r0.A00.ANL(r0.A01(), Uri.parse(this.A02));
                    return;
                }
                ((ActivityC004702f) C02780Dk.A01(((AnonymousClass32V) this.A00).A01())).APm(SuspiciousLinkWarningDialogFragment.A00(this.A02, set));
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
