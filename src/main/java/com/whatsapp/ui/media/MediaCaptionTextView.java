package com.whatsapp.ui.media;

import X.AnonymousClass022;
import X.AnonymousClass03P;
import X.C002001d;
import X.C02590Cr;
import X.C72193Rw;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.text.ReadMoreTextView;

public class MediaCaptionTextView extends ReadMoreTextView {
    public final AnonymousClass03P A00;
    public final C02590Cr A01 = C02590Cr.A00();
    public final AnonymousClass022 A02;

    public MediaCaptionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass03P A002;
        AnonymousClass022 r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass03P.A00();
        }
        this.A00 = A002;
        this.A02 = !isInEditMode() ? AnonymousClass022.A00() : r1;
        setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 7));
        ((ReadMoreTextView) this).A02 = C72193Rw.A00;
    }

    public void setCaptionText(CharSequence charSequence) {
        float dimensionPixelSize;
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return;
        }
        int A0F = C002001d.A0F(charSequence);
        if (A0F <= 0 || A0F > 3) {
            Resources resources = getContext().getResources();
            int length = charSequence.length();
            int i = R.dimen.caption_text_size_small;
            if (length < 96) {
                i = R.dimen.caption_text_size_large;
            }
            dimensionPixelSize = (float) resources.getDimensionPixelSize(i);
        } else {
            float dimensionPixelSize2 = (float) getContext().getResources().getDimensionPixelSize(R.dimen.caption_text_size_large);
            dimensionPixelSize = (((Math.max(dimensionPixelSize2, Math.min(dimensionPixelSize2, (getContext().getResources().getDisplayMetrics().density * dimensionPixelSize2) / getContext().getResources().getDisplayMetrics().scaledDensity) * 1.5f) - dimensionPixelSize2) * ((float) (4 - A0F))) / 3.0f) + dimensionPixelSize2;
        }
        if (charSequence.length() < 96) {
            setGravity(17);
        } else {
            setGravity(8388611);
        }
        setTextSize(0, dimensionPixelSize);
        setText(C002001d.A1H(C002001d.A1C(this.A00, this.A02, charSequence), getContext(), getPaint(), this.A01));
        setVisibility(0);
    }
}
