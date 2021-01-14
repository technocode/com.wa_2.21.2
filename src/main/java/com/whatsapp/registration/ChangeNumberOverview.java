package com.whatsapp.registration;

import X.ActivityC004602e;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.AnonymousClass308;
import X.C002101e;
import X.C01970Ad;
import X.C02040Ak;
import X.ViewTreeObserver$OnScrollChangedListenerC64982z7;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class ChangeNumberOverview extends ActivityC004602e {
    public int A00;
    public View A01;
    public ScrollView A02;
    public final C02040Ak A03 = C02040Ak.A00();
    public final C01970Ad A04 = C01970Ad.A00();
    public final AnonymousClass00T A05 = C002101e.A00();

    public final void A0T() {
        if (this.A02.canScrollVertically(1)) {
            this.A01.setElevation((float) this.A00);
        } else {
            this.A01.setElevation(0.0f);
        }
    }

    public /* synthetic */ void lambda$onCreate$2393$ChangeNumberOverview(View view) {
        Log.i("changenumberoverview/next");
        startActivity(new Intent(this, ChangeNumber.class));
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A02.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass308(this));
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        setTitle(r2.A06(R.string.change_number_title));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            A09.A0B(true);
            setContentView(R.layout.change_number_overview);
            this.A02 = (ScrollView) findViewById(R.id.scroll_view);
            this.A01 = findViewById(R.id.bottom_button_container);
            if (this.A03.A04()) {
                this.A05.ANF(new RunnableEBaseShape12S0100000_I1_7(this, 23));
            } else {
                ((TextView) findViewById(R.id.change_number_overview_body_one)).setText(r2.A06(R.string.change_number_overview_one));
                ((TextView) findViewById(R.id.change_number_overview_body_two)).setText(r2.A06(R.string.change_number_overview_two));
                ((TextView) findViewById(R.id.change_number_overview_body_three)).setText(r2.A06(R.string.change_number_overview_three));
            }
            findViewById(R.id.next_btn).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 23));
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
                this.A02.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver$OnScrollChangedListenerC64982z7(this));
                this.A02.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass308(this));
                return;
            }
            return;
        }
        throw null;
    }
}
