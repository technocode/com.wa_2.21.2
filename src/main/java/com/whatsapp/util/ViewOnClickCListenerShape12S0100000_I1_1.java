package com.whatsapp.util;

import X.AbstractView$OnClickListenerC08330av;
import X.AnonymousClass01X;
import X.C02780Dk;
import X.C09040cC;
import X.C26491Ld;
import X.C48672Ng;
import X.C53092cP;
import X.C59052my;
import X.C59062mz;
import X.C59142n9;
import X.C59152nA;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.search.verification.client.R;

public class ViewOnClickCListenerShape12S0100000_I1_1 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape12S0100000_I1_1(C48672Ng r2) {
        this.A01 = 43;
        this.A00 = r2;
    }

    public ViewOnClickCListenerShape12S0100000_I1_1(C53092cP r2) {
        this.A01 = 40;
        this.A00 = r2;
    }

    public ViewOnClickCListenerShape12S0100000_I1_1(C59052my r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public ViewOnClickCListenerShape12S0100000_I1_1(C59062mz r2) {
        this.A01 = 22;
        this.A00 = r2;
    }

    public ViewOnClickCListenerShape12S0100000_I1_1(C59142n9 r2) {
        this.A01 = 27;
        this.A00 = r2;
    }

    public ViewOnClickCListenerShape12S0100000_I1_1(C59152nA r2) {
        this.A01 = 28;
        this.A00 = r2;
    }

    public ViewOnClickCListenerShape12S0100000_I1_1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r3.A07.A09(r9.A0F.A0A) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015f, code lost:
        if (r1 != 5) goto L_0x0161;
     */
    /* JADX WARNING: Removed duplicated region for block: B:616:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0168  */
    @Override // X.AbstractView$OnClickListenerC08330av
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.view.View r16) {
        /*
        // Method dump skipped, instructions count: 3142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1.A00(android.view.View):void");
    }

    public final void A01(String str) {
        C59052my r6 = (C59052my) this.A00;
        C26491Ld r9 = r6.A0F;
        Intent putExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", new String[]{str});
        AnonymousClass01X r5 = r6.A0n;
        Intent putExtra2 = putExtra.putExtra("android.intent.extra.SUBJECT", r5.A06(R.string.tell_a_friend_email_subject));
        StringBuilder sb = new StringBuilder();
        sb.append(r5.A0D(R.string.tell_a_friend_email_body, "https://www.whatsapp.com/download/"));
        sb.append("\n\n");
        r9.A01(putExtra2.putExtra("android.intent.extra.TEXT", sb.toString()), r6.getContext(), null, r5.A06(R.string.invite_via_email_title), true);
    }

    public final void A02(String str) {
        C59052my r2 = (C59052my) this.A00;
        C09040cC r7 = r2.A0G;
        Activity A002 = C02780Dk.A00(r2.getContext());
        StringBuilder sb = new StringBuilder("sms:");
        sb.append(str);
        r7.A01(A002, Uri.parse(sb.toString()), r2.A0n.A0D(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/"), 18);
    }
}
