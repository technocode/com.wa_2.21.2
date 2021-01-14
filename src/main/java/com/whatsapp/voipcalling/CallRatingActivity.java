package com.whatsapp.voipcalling;

import X.AbstractC673938k;
import X.AnonymousClass008;
import X.AnonymousClass022;
import X.AnonymousClass03P;
import X.AnonymousClass0AR;
import X.AnonymousClass0ET;
import X.AnonymousClass2C0;
import X.AnonymousClass3TA;
import X.C02590Cr;
import X.C09270cb;
import X.C674038l;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;

public class CallRatingActivity extends AnonymousClass2C0 {
    public static final int[] A0G = {R.string.rating_1, R.string.rating_2, R.string.rating_3, R.string.rating_4, R.string.rating_5};
    public View A00;
    public EditText A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public RatingBar A04;
    public TextView A05;
    public WamCall A06;
    public AbstractC673938k A07;
    public Integer A08;
    public boolean A09;
    public final AnonymousClass03P A0A;
    public final C02590Cr A0B = C02590Cr.A00();
    public final AnonymousClass0ET A0C;
    public final AnonymousClass022 A0D;
    public final C674038l A0E;
    public final C09270cb A0F;

    public CallRatingActivity() {
        AnonymousClass0AR.A00();
        this.A0A = AnonymousClass03P.A00();
        this.A0C = AnonymousClass0ET.A00();
        this.A0E = C674038l.A01;
        this.A0F = C09270cb.A00();
        this.A0D = AnonymousClass022.A00();
        this.A07 = new AnonymousClass3TA(this);
    }

    public final void A0D() {
        int rating = (int) this.A04.getRating();
        String A0B2 = AnonymousClass008.A0B(this.A01);
        View view = this.A00;
        boolean z = false;
        if (rating > 0 || A0B2.codePointCount(0, A0B2.length()) >= 3) {
            z = true;
        }
        view.setEnabled(z);
    }

    public /* synthetic */ void lambda$onCreate$2697$CallRatingActivity(View view) {
        findViewById(((Number) view.getTag()).intValue()).performClick();
    }

    public /* synthetic */ void lambda$onCreate$2698$CallRatingActivity(View view) {
        CompoundButton compoundButton = (CompoundButton) view;
        Number number = (Number) compoundButton.getTag();
        if (number != null) {
            if (compoundButton.isChecked()) {
                this.A08 = Integer.valueOf(this.A08.intValue() | (1 << number.intValue()));
            } else {
                this.A08 = Integer.valueOf(this.A08.intValue() & ((1 << number.intValue()) ^ -1));
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("callratingactivity/problems ");
        A0S.append(Integer.toBinaryString(this.A08.intValue()));
        Log.i(A0S.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013f, code lost:
        if (r0.longValue() < 1) goto L_0x0141;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 639
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallRatingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C674038l r0 = this.A0E;
        r0.A00.remove(this.A07);
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        String str;
        super.onStop();
        WamCall wamCall = this.A06;
        if (wamCall != null) {
            StringBuilder A0S = AnonymousClass008.A0S("callratingactivity/postCallEvent with rating ");
            A0S.append(wamCall.userRating);
            Log.i(A0S.toString());
            C09270cb r1 = this.A0F;
            WamCall wamCall2 = this.A06;
            if (wamCall2 != null) {
                str = wamCall2.callRandomId;
            } else {
                str = null;
            }
            r1.A00.edit().putString("call_rating_last_call", str).apply();
            this.A0C.A06(this.A06, this.A09);
            this.A06 = null;
        }
        finish();
    }
}
