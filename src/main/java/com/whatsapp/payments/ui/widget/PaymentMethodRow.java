package com.whatsapp.payments.ui.widget;

import X.AnonymousClass11P;
import X.C004302a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.CopyableTextView;

public class PaymentMethodRow extends LinearLayout {
    public ImageView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public ShimmerFrameLayout A05;
    public CopyableTextView A06;

    public PaymentMethodRow(Context context) {
        super(context);
        A00();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        LayoutInflater.from(getContext()).inflate(R.layout.payment_method_row, (ViewGroup) this, true);
        setOrientation(1);
        this.A00 = (ImageView) findViewById(R.id.payment_method_provider_icon);
        this.A04 = (TextView) findViewById(R.id.payment_method_bank_name);
        this.A06 = (CopyableTextView) findViewById(R.id.payment_method_account_id);
        this.A03 = (TextView) findViewById(R.id.payment_method_provider_name);
        this.A02 = (TextView) findViewById(R.id.payment_method_decorate);
        this.A01 = (TextView) findViewById(R.id.payment_branding);
        this.A05 = (ShimmerFrameLayout) findViewById(R.id.payment_method_name_shimmer);
        this.A06.setVisibility(8);
        this.A03.setVisibility(8);
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        ShimmerFrameLayout shimmerFrameLayout = this.A05;
        if (shimmerFrameLayout.A00) {
            shimmerFrameLayout.A00();
            shimmerFrameLayout.A00 = false;
            shimmerFrameLayout.invalidate();
        }
    }

    public void A01(String str) {
        this.A03.setText(str);
        TextView textView = this.A03;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void A02(boolean z) {
        if (!z) {
            this.A04.setTextColor(C004302a.A00(getContext(), R.color.payments_status_gray));
        } else {
            this.A04.setTextColor(C004302a.A00(getContext(), R.color.list_item_title));
        }
    }

    public ImageView getMethodIconView() {
        return this.A00;
    }

    public void setNameShimmer(boolean z) {
        if (z) {
            ShimmerFrameLayout shimmerFrameLayout = this.A05;
            if (!shimmerFrameLayout.A00) {
                shimmerFrameLayout.A00 = true;
                AnonymousClass11P r1 = shimmerFrameLayout.A02;
                ValueAnimator valueAnimator = r1.A00;
                if (valueAnimator != null && !valueAnimator.isStarted() && r1.getCallback() != null) {
                    r1.A00.start();
                    return;
                }
                return;
            }
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout2 = this.A05;
        if (shimmerFrameLayout2.A00) {
            shimmerFrameLayout2.A00();
            shimmerFrameLayout2.A00 = false;
            shimmerFrameLayout2.invalidate();
        }
    }
}
