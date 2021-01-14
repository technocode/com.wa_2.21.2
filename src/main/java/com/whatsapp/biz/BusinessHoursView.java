package com.whatsapp.biz;

import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.C004302a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;

public class BusinessHoursView extends LinearLayout {
    public ImageView A00;
    public BusinessHoursContentView A01;
    public boolean A02 = false;
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final AnonymousClass00Y A04 = AnonymousClass00Y.A00();

    public BusinessHoursView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.business_hours_layout, (ViewGroup) this, true);
        setFocusable(true);
        this.A01 = (BusinessHoursContentView) inflate.findViewById(R.id.business_hours_content_view);
        this.A00 = (ImageView) inflate.findViewById(R.id.business_hours_chevron_icon);
    }

    public final void A00() {
        this.A01.setFullView(this.A02);
        ImageView imageView = this.A00;
        Context context = getContext();
        boolean z = this.A02;
        int i = R.drawable.ic_chevron_down;
        if (z) {
            i = R.drawable.ic_chevron_up;
        }
        imageView.setImageDrawable(C004302a.A03(context, i));
    }
}
