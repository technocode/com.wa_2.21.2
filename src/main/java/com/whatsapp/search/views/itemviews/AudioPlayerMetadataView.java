package com.whatsapp.search.views.itemviews;

import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SE;
import X.C07990aH;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class AudioPlayerMetadataView extends LinearLayout {
    public TextView A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup viewGroup;
        LinearLayout.inflate(context, R.layout.message_audio_metadata, this);
        setOrientation(0);
        setGravity(17);
        View A0D = AnonymousClass0Q7.A0D(this, R.id.date_wrapper);
        View A0D2 = AnonymousClass0Q7.A0D(this, R.id.status);
        this.A00 = (TextView) AnonymousClass0Q7.A0D(this, R.id.description);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A0K);
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            AnonymousClass0SE.A06(this.A01, A0D, A0D.getPaddingLeft(), dimensionPixelSize2);
            AnonymousClass0SE.A05(this.A01, A0D, dimensionPixelSize, ((LinearLayout.LayoutParams) A0D.getLayoutParams()).rightMargin);
            if (!z && (viewGroup = (ViewGroup) A0D2.getParent()) != null) {
                viewGroup.removeView(A0D2);
            }
        }
    }

    public void setDescription(String str) {
        this.A00.setText(str);
    }
}
