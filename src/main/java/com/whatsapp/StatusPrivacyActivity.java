package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass00T;
import X.AnonymousClass01J;
import X.AnonymousClass01X;
import X.AnonymousClass09E;
import X.AnonymousClass0S2;
import X.AnonymousClass1HN;
import X.AnonymousClass2C0;
import X.C002101e;
import X.ViewTreeObserver$OnPreDrawListenerC26981Nm;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ScrollView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

public class StatusPrivacyActivity extends ActivityC004602e {
    public int A00;
    public View A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public ScrollView A05;
    public final AnonymousClass01J A06 = AnonymousClass01J.A00();
    public final AnonymousClass09E A07 = AnonymousClass09E.A00();
    public final AnonymousClass00T A08 = C002101e.A00();

    public final void A0T() {
        if (this.A05.canScrollVertically(1)) {
            this.A01.setElevation((float) this.A00);
        } else {
            this.A01.setElevation(0.0f);
        }
    }

    public final void A0U() {
        int A042 = this.A07.A04();
        if (A042 == 0) {
            this.A03.setChecked(true);
        } else if (A042 == 1) {
            this.A04.setChecked(true);
        } else if (A042 == 2) {
            this.A02.setChecked(true);
        } else {
            throw new IllegalStateException("unknown status distribution mode");
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            A0U();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A05.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC26981Nm(this));
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.status_privacy);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            A09.A08(r2.A06(R.string.status_privacy));
            this.A05 = (ScrollView) findViewById(R.id.scroll_view);
            this.A03 = (RadioButton) findViewById(R.id.my_contacts_btn);
            this.A02 = (RadioButton) findViewById(R.id.black_list_btn);
            this.A04 = (RadioButton) findViewById(R.id.white_list_btn);
            this.A01 = findViewById(R.id.bottom_button_container);
            A0U();
            this.A03.setText(r2.A06(R.string.select_status_recipients_my_contacts));
            this.A02.setText(r2.A06(R.string.select_status_recipients_black_list));
            this.A04.setText(r2.A06(R.string.select_status_recipients_white_list));
            this.A03.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 13));
            this.A02.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 14));
            this.A04.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 15));
            findViewById(R.id.confirm_change_btn).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 16));
            if (!this.A07.A0H()) {
                this.A08.ANF(new RunnableEBaseShape6S0100000_I1_1(this, 37));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
                this.A05.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass1HN(this));
                this.A05.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC26981Nm(this));
                return;
            }
            return;
        }
        throw null;
    }
}
