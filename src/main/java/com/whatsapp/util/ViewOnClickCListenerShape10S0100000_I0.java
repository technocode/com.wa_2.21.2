package com.whatsapp.util;

import X.AbstractView$OnClickListenerC08330av;
import X.AnonymousClass0Y2;
import X.AnonymousClass0YW;
import android.view.View;

public class ViewOnClickCListenerShape10S0100000_I0 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape10S0100000_I0(AnonymousClass0Y2 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public ViewOnClickCListenerShape10S0100000_I0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e4, code lost:
        if (r0 != 0) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030b, code lost:
        if (r2.A0J == false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0319, code lost:
        if (r2.A0J != false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031b, code lost:
        r14 = "1";
     */
    @Override // X.AbstractView$OnClickListenerC08330av
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.view.View r27) {
        /*
        // Method dump skipped, instructions count: 1750
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0.A00(android.view.View):void");
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void onClick(View view) {
        if (9 - this.A01 != 0) {
            super.onClick(view);
        } else if (((AnonymousClass0YW) this.A00).A1O.isEmpty()) {
            super.onClick(view);
        } else {
            A00(view);
        }
    }
}
