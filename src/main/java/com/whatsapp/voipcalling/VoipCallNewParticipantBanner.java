package com.whatsapp.voipcalling;

import X.AbstractC12270hp;
import X.AbstractC676639q;
import X.AbstractC676739r;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass0HJ;
import X.AnonymousClass0L2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0YX;
import X.AnonymousClass31y;
import X.AnonymousClass38Z;
import X.AnonymousClass3UU;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.C11930hF;
import X.C676539p;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickEBaseShape3S0200000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class VoipCallNewParticipantBanner extends LinearLayout {
    public int A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public C007003k A04;
    public AbstractC676739r A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = new Handler(new AnonymousClass38Z(this));
    public final ImageView A09;
    public final AnonymousClass02M A0A = AnonymousClass02M.A00();
    public final C11930hF A0B;
    public final AnonymousClass0HJ A0C = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A0D = AnonymousClass01A.A00();
    public final C014308b A0E = C014308b.A00();
    public final AbstractC12270hp A0F = new AnonymousClass3UU(this);
    public final AnonymousClass0YX A0G;
    public final AnonymousClass0L2 A0H = AnonymousClass0L2.A01();
    public final AnonymousClass01X A0I = AnonymousClass01X.A00();
    public final AnonymousClass31y A0J = AnonymousClass31y.A00();
    public final VoipCallControlRingingDotsIndicator A0K;

    public VoipCallNewParticipantBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.voip_call_control_sheet_participant_row, (ViewGroup) this, true);
        setVisibility(8);
        this.A0B = new C11930hF(this, R.id.name, this.A0E, this.A0I, this.A0J);
        AnonymousClass0Q7.A0D(this, R.id.subtitle).setVisibility(0);
        this.A09 = (ImageView) AnonymousClass0Q7.A0D(this, R.id.avatar);
        this.A0K = (VoipCallControlRingingDotsIndicator) AnonymousClass0Q7.A0D(this, R.id.ringing_dots);
        this.A0B.A00.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf"), 0);
        C11930hF r2 = this.A0B;
        r2.A00.setTextColor(C004302a.A00(context, R.color.paletteOnSurface));
        this.A0G = this.A0H.A03(context);
        A02();
    }

    public void A00() {
        this.A08.removeMessages(0);
        if (getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, getResources().getDimension(R.dimen.call_new_participant_banner_bottom_margin));
            ofFloat.setDuration(600L);
            ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
            ofFloat.addListener(new C676539p(this));
            this.A06 = true;
            ofFloat.start();
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.A03.cancel();
            this.A03 = null;
        }
        this.A04 = null;
    }

    public void A01() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        Log.i("VoipCallNewParticipantBanner/resetBannerYPosition");
        marginLayoutParams.bottomMargin = (int) getResources().getDimension(R.dimen.call_new_participant_banner_bottom_margin);
        setLayoutParams(marginLayoutParams);
    }

    public final void A02() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = getContext();
        boolean z = this.A07;
        int i = R.color.primary_voip;
        if (z) {
            i = R.color.paletteSurface_dark;
        }
        gradientDrawable.setColor(C004302a.A00(context, i));
        gradientDrawable.setCornerRadius(getResources().getDimension(R.dimen.call_new_participant_banner_corner_radius));
        setBackground(gradientDrawable);
    }

    public int getBannerHeight() {
        if (this.A02 == 0) {
            this.A02 = ((((int) getResources().getDimension(R.dimen.horizontal_padding)) << 1) + ((int) getResources().getDimension(R.dimen.contact_picker_row_height))) - ((int) getResources().getDimension(R.dimen.call_pip_min_margin));
        }
        if (getVisibility() != 0 || this.A06) {
            return 0;
        }
        return this.A02;
    }

    public UserJid getParticipantJid() {
        C007003k r0 = this.A04;
        if (r0 != null) {
            return UserJid.of(r0.A09);
        }
        return null;
    }

    public void setOnBannerClickListener(AbstractC676639q r3) {
        setOnClickListener(new ViewOnClickEBaseShape3S0200000_I1_2(this, r3, 1));
    }

    public void setVisibilityChangeAnimationListener(AbstractC676739r r1) {
        this.A05 = r1;
    }
}
