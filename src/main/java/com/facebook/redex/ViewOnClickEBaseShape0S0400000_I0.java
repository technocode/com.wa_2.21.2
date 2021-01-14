package com.facebook.redex;

import X.AnonymousClass00Y;
import X.AnonymousClass21P;
import X.C02780Dk;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class ViewOnClickEBaseShape0S0400000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public ViewOnClickEBaseShape0S0400000_I0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public final void onClick(View view) {
        switch (this.A04) {
            case 0:
                AnonymousClass21P r2 = new AnonymousClass21P();
                r2.A00 = 3;
                ((AnonymousClass00Y) this.A00).A0B(r2, null, false);
                ((C02780Dk) this.A01).A05(((View) this.A02).getContext(), (Intent) this.A03);
                return;
            case 1:
                AnonymousClass21P r22 = new AnonymousClass21P();
                r22.A00 = 6;
                ((AnonymousClass00Y) this.A00).A0B(r22, null, false);
                ((C02780Dk) this.A01).A05(((View) this.A02).getContext(), new Intent("android.intent.action.VIEW", (Uri) this.A03));
                return;
            default:
                return;
        }
    }
}
