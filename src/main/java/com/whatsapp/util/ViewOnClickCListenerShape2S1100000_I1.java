package com.whatsapp.util;

import X.AbstractC51572Zg;
import X.AbstractView$OnClickListenerC08330av;
import X.AnonymousClass008;
import X.AnonymousClass32V;
import X.AnonymousClass3ZT;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.search.verification.client.R;

public class ViewOnClickCListenerShape2S1100000_I1 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public String A01;
    public final int A02;

    public ViewOnClickCListenerShape2S1100000_I1(Object obj, String str, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        switch (this.A02) {
            case 0:
                String str = this.A01;
                Uri parse = Uri.parse(str);
                if (parse.getScheme() == null) {
                    StringBuilder A0S = AnonymousClass008.A0S("http://");
                    A0S.append(str);
                    parse = Uri.parse(A0S.toString());
                }
                try {
                    ((View) this.A00).getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
                    return;
                } catch (ActivityNotFoundException unused) {
                    ((AbstractC51572Zg) this.A00).A0V.A06(R.string.activity_not_found, 0);
                    return;
                }
            case 1:
                AnonymousClass3ZT r0 = (AnonymousClass3ZT) this.A00;
                r0.A03.ANL(r0.getContext(), Uri.parse(this.A01));
                return;
            case 2:
                ((AnonymousClass32V) this.A00).A00.ANL(view.getContext(), Uri.parse(this.A01));
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
