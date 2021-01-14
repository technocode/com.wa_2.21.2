package com.whatsapp.registration;

import X.AnonymousClass0Q7;
import X.ViewTreeObserver$OnScrollChangedListenerC65182zR;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;

public class RegistrationScrollView extends ScrollView {
    public View A00;
    public View A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public LinearLayout A03;
    public WaTextView A04;
    public boolean A05;
    public final float A06 = getResources().getDimension(R.dimen.actionbar_elevation);
    public final ViewTreeObserver.OnScrollChangedListener A07 = new ViewTreeObserver$OnScrollChangedListenerC65182zR(this);

    public RegistrationScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.whatsapp.WaTextView */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(float f, boolean z, LinearLayout linearLayout, WaTextView waTextView, View view, View view2) {
        if (z) {
            view = view2;
        }
        if (f < 0.1f) {
            if (Build.VERSION.SDK_INT < 21) {
                view.setVisibility(0);
                view.setAlpha(f * 10.0f);
            }
            if (!z) {
                linearLayout = waTextView;
            }
            AnonymousClass0Q7.A0Q(linearLayout, f * 10.0f * this.A06);
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            view.setVisibility(0);
        }
        if (!z) {
            linearLayout = waTextView;
        }
        AnonymousClass0Q7.A0Q(linearLayout, this.A06);
    }

    public /* synthetic */ void A01(View view, View view2, LinearLayout linearLayout, WaTextView waTextView) {
        if (!this.A05) {
            getViewTreeObserver().addOnScrollChangedListener(this.A07);
            this.A05 = true;
        }
        boolean canScrollVertically = canScrollVertically(1);
        boolean canScrollVertically2 = canScrollVertically(-1);
        if (canScrollVertically2 || canScrollVertically) {
            if (canScrollVertically) {
                if (Build.VERSION.SDK_INT < 21) {
                    view.setVisibility(0);
                }
                AnonymousClass0Q7.A0Q(waTextView, this.A06);
            }
            if (canScrollVertically2) {
                if (Build.VERSION.SDK_INT < 21) {
                    view2.setVisibility(0);
                }
                AnonymousClass0Q7.A0Q(linearLayout, this.A06);
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            view.setVisibility(8);
            view2.setVisibility(8);
        }
        AnonymousClass0Q7.A0Q(linearLayout, 0.0f);
        AnonymousClass0Q7.A0Q(waTextView, 0.0f);
    }
}
