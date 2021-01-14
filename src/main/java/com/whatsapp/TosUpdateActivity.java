package com.whatsapp;

import X.AbstractC000400g;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0AR;
import X.AnonymousClass0YH;
import X.AnonymousClass1O6;
import X.AnonymousClass2C0;
import X.C001801b;
import X.C002301g;
import X.C004302a;
import X.C03170Fb;
import X.C05710Pt;
import X.C05720Pu;
import X.C06210Sf;
import X.C06470Tj;
import X.C26091Jm;
import X.ViewTreeObserver$OnScrollChangedListenerC25811Ik;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

public class TosUpdateActivity extends ActivityC004602e {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public CheckBox A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextEmojiLabel A0A;
    public boolean A0B;
    public final C06210Sf A0C = C06210Sf.A00();
    public final AnonymousClass0AR A0D = AnonymousClass0AR.A00();

    public final void A0T() {
        if (this.A00 == 0) {
            if (this.A03.getVisibility() != 0) {
                AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
                float f = 1.0f;
                if (r6.A0M()) {
                    f = -1.0f;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(200);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                this.A03.startAnimation(translateAnimation);
                float f2 = -1.0f;
                if (r6.A0M()) {
                    f2 = 1.0f;
                }
                TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, f2, 1, 0.0f, 1, 0.0f);
                translateAnimation2.setDuration(200);
                translateAnimation2.setInterpolator(new DecelerateInterpolator());
                this.A04.startAnimation(translateAnimation2);
            }
            this.A03.setVisibility(0);
            this.A04.setVisibility(8);
            this.A09.setText("");
            this.A07.setText(((AnonymousClass2C0) this).A01.A06(R.string.tos_next));
            this.A07.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 18));
            if (this.A01.getVisibility() != 8) {
                TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                translateAnimation3.setDuration(200);
                translateAnimation3.setInterpolator(new DecelerateInterpolator());
                this.A01.startAnimation(translateAnimation3);
            }
            this.A01.setVisibility(8);
            this.A06.setImageDrawable(new AnonymousClass0YH(C004302a.A00(this, R.color.tos_indicator_light)));
            this.A02.setVisibility(8);
            return;
        }
        if (this.A04.getVisibility() != 0) {
            AnonymousClass01X r62 = ((AnonymousClass2C0) this).A01;
            float f3 = 1.0f;
            if (r62.A0M()) {
                f3 = -1.0f;
            }
            TranslateAnimation translateAnimation4 = new TranslateAnimation(1, 0.0f, 1, f3, 1, 0.0f, 1, 0.0f);
            translateAnimation4.setDuration(200);
            translateAnimation4.setInterpolator(new DecelerateInterpolator());
            this.A03.startAnimation(translateAnimation4);
            float f4 = -1.0f;
            if (r62.A0M()) {
                f4 = 1.0f;
            }
            TranslateAnimation translateAnimation5 = new TranslateAnimation(1, f4, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation5.setDuration(200);
            translateAnimation5.setInterpolator(new DecelerateInterpolator());
            this.A04.startAnimation(translateAnimation5);
        }
        this.A03.setVisibility(8);
        this.A04.setVisibility(0);
        TextView textView = this.A09;
        AnonymousClass01X r63 = ((AnonymousClass2C0) this).A01;
        textView.setText(r63.A06(R.string.tos_title_screen_2));
        this.A07.setText(r63.A06(R.string.tos_agree_now));
        this.A07.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 19));
        if (this.A01.getVisibility() != 0) {
            TranslateAnimation translateAnimation6 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation6.setDuration(200);
            translateAnimation6.setInterpolator(new DecelerateInterpolator());
            this.A01.startAnimation(translateAnimation6);
        }
        this.A01.setVisibility(0);
        this.A06.setImageDrawable(new AnonymousClass0YH(C004302a.A00(this, R.color.tos_indicator_dark)));
    }

    public void finish() {
        if (this.A0B) {
            super.finish();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A00 == 1) {
            this.A00 = 0;
            A0T();
            return;
        }
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.main_layout);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass1O6(this, findViewById));
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        ((ActivityC004602e) this).A03 = false;
        ((ActivityC004602e) this).A02 = false;
        super.onCreate(bundle);
        setContentView(R.layout.tos_update);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.text_1);
        this.A0A = textEmojiLabel;
        AnonymousClass008.A0d(textEmojiLabel);
        TextEmojiLabel textEmojiLabel2 = this.A0A;
        textEmojiLabel2.setAccessibilityHelper(new C05720Pu(textEmojiLabel2));
        TextEmojiLabel textEmojiLabel3 = (TextEmojiLabel) findViewById(R.id.text_2);
        textEmojiLabel3.A07 = new C05710Pt();
        textEmojiLabel3.setAccessibilityHelper(new C05720Pu(textEmojiLabel3));
        C06210Sf r1 = this.A0C;
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        textEmojiLabel3.setText(r1.A02(this, r3.A06(R.string.tos_text_screen_2)));
        TextView textView = (TextView) findViewById(R.id.not_now);
        this.A08 = textView;
        C002301g.A03(textView);
        this.A08.setBackgroundDrawable(new AnonymousClass0YH(C004302a.A02(this, R.color.selector_gray_button)));
        if (r3.A0M()) {
            this.A08.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_close, 0, 0, 0);
        } else {
            this.A08.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_close, 0);
        }
        TextView textView2 = (TextView) findViewById(R.id.action);
        this.A07 = textView2;
        C002301g.A03(textView2);
        this.A07.setBackgroundDrawable(new AnonymousClass0YH(C004302a.A02(this, R.color.selector_green_button)));
        TextView textView3 = (TextView) findViewById(R.id.title);
        this.A09 = textView3;
        C002301g.A03(textView3);
        this.A06 = (ImageView) findViewById(R.id.indicator_1);
        ((ImageView) findViewById(R.id.indicator_2)).setImageDrawable(new AnonymousClass0YH(C004302a.A00(this, R.color.tos_indicator_light)));
        this.A03 = findViewById(R.id.screen_1);
        this.A04 = findViewById(R.id.screen_2);
        this.A01 = findViewById(R.id.age_consent_container);
        this.A05 = (CheckBox) findViewById(R.id.age_consent);
        View findViewById = findViewById(R.id.age_tip);
        this.A02 = findViewById;
        findViewById.setBackgroundDrawable(new C06470Tj(r3, getResources().getDrawable(R.drawable.ic_tooltip_red)));
        this.A05.setOnCheckedChangeListener(new C26091Jm(this));
        this.A04.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver$OnScrollChangedListenerC25811Ik(this));
        View findViewById2 = findViewById(R.id.main_layout);
        findViewById2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass1O6(this, findViewById2));
        A0T();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        long j;
        String A0d;
        super.onResume();
        C03170Fb r7 = ((ActivityC004602e) this).A08;
        int A022 = r7.A02();
        if (A022 == 0) {
            this.A0B = true;
            finish();
        } else if (A022 == 1) {
            this.A08.setVisibility(0);
            this.A08.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 20));
            synchronized (r7) {
                SharedPreferences sharedPreferences = r7.A02.A00;
                j = 0;
                if (sharedPreferences.getLong("tos_v2_accepted_time", 0) == 0 && AbstractC000400g.A05()) {
                    StringBuilder sb = new StringBuilder("tos_v2_stage_start_time");
                    sb.append(1);
                    j = r7.A00.A07(1) + sharedPreferences.getLong(sb.toString(), 0);
                }
            }
            AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
            if ("sl".equals(r3.A04())) {
                A0d = C001801b.A0f(r3, j, 1);
            } else {
                A0d = C001801b.A0d(r3, j);
            }
            this.A0A.setText(this.A0C.A02(this, r3.A0D(R.string.tos_text_screen_1, r3.A0E(A0d))));
        } else {
            this.A08.setVisibility(4);
            View findViewById = findViewById(R.id.screen_2_frame);
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop() / 3, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
            this.A0A.setText(this.A0C.A02(this, ((AnonymousClass2C0) this).A01.A06(R.string.tos_text_screen_1_expired)));
        }
    }
}
