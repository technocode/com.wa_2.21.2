package com.whatsapp.voipcalling;

import X.AnonymousClass01A;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass31y;
import X.C000300f;
import X.C002001d;
import X.C007003k;
import X.C014308b;
import X.C06170Sb;
import X.C11930hF;
import X.C673738h;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.Voip;
import java.util.List;

public class CallDetailsLayout extends LinearLayout {
    public int A00;
    public int A01;
    public Typeface A02;
    public Typeface A03;
    public FrameLayout A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public C11930hF A08;
    public C11930hF A09;
    public PeerAvatarLayout A0A;
    public final C000300f A0B = C000300f.A00();
    public final AnonymousClass01A A0C = AnonymousClass01A.A00();
    public final C014308b A0D = C014308b.A00();
    public final AnonymousClass01X A0E = AnonymousClass01X.A00();
    public final AnonymousClass01T A0F = AnonymousClass01T.A00();
    public final AnonymousClass31y A0G = AnonymousClass31y.A00();

    public CallDetailsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C06170Sb.A00();
        LayoutInflater.from(context).inflate(R.layout.call_details_layout, (ViewGroup) this, true);
        this.A07 = (TextView) findViewById(R.id.name);
        this.A06 = (TextView) findViewById(R.id.name_byline);
        this.A09 = new C11930hF(this, R.id.name, this.A0D, this.A0E, this.A0G);
        this.A08 = new C11930hF(this, R.id.name_byline, this.A0D, this.A0E, this.A0G);
        if (C002001d.A3M(this.A0B)) {
            C11930hF r3 = this.A08;
            r3.A00.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.joinable_call_name_byline_text_size));
        }
        this.A05 = (TextView) findViewById(R.id.call_status);
        this.A0A = (PeerAvatarLayout) findViewById(R.id.peer_avatar_layout);
        this.A04 = (FrameLayout) findViewById(R.id.peer_avatar_container);
        this.A01 = getResources().getColor(R.color.primary_voip);
        this.A03 = Typeface.create("sans-serif", 0);
        this.A02 = Typeface.create("sans-serif-light", 0);
    }

    public static final ObjectAnimator A00(View view, String str, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(125L);
        return ofFloat;
    }

    public final String A01(List list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            C007003k A0A2 = this.A0C.A0A((AnonymousClass02N) list.get(i));
            if (i2 >= 1) {
                sb.append(", ");
            }
            sb.append(this.A0D.A04(A0A2));
            i++;
            i2++;
        }
        return sb.toString();
    }

    public final void A02(Voip.CallState callState, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2 = 0;
        boolean z4 = true;
        if (z2 || Voip.A0B(callState) || this.A00 == 1 || (callState == Voip.CallState.CALLING && z)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean A3M = C002001d.A3M(this.A0B);
        if (A3M) {
            if ((!(Voip.A0B(callState) || callState == Voip.CallState.CALLING || callState == Voip.CallState.PRE_ACCEPT_RECEIVED) || z) && this.A00 != 1) {
                z4 = false;
            }
            z3 = z4;
        }
        FrameLayout frameLayout = this.A04;
        if (!z3) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        Resources resources = getResources();
        if (!A3M || !z) {
            i = R.dimen.call_voice_top_bar_height;
            if (z2) {
                i = R.dimen.call_video_top_bar_height;
            }
        } else {
            i = R.dimen.joinable_call_top_bar_height;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        if (z3) {
            dimensionPixelSize = (getResources().getDimensionPixelSize(R.dimen.call_avatar_top_bar_margin) + dimensionPixelSize) - getResources().getDimensionPixelSize(R.dimen.call_avatar_view_elevation);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams.topMargin != dimensionPixelSize) {
            layoutParams.topMargin = dimensionPixelSize;
            setLayoutParams(layoutParams);
        }
    }

    public void A03(String str) {
        TextView textView = this.A05;
        int i = 0;
        if (str == null) {
            i = 8;
        }
        textView.setVisibility(i);
        this.A05.setText(str);
    }

    public void clearAnimation() {
        this.A0A.clearAnimation();
        this.A0A.setTranslationY(0.0f);
        this.A05.clearAnimation();
        this.A05.setTranslationY(0.0f);
        this.A07.clearAnimation();
        this.A07.setTranslationY(0.0f);
        this.A06.clearAnimation();
        this.A06.setTranslationY(0.0f);
        for (int i = 0; i < this.A0A.getChildCount(); i++) {
            C673738h r2 = (C673738h) this.A0A.getChildAt(i);
            r2.A03.clearAnimation();
            r2.A03.setScaleX(1.0f);
            r2.A03.setScaleY(1.0f);
        }
    }
}
