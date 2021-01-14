package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.C004302a;
import X.C06140Ry;
import X.C06470Tj;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;

public class ListItemWithRightIcon extends LinearLayout {
    public WaImageView A00;
    public WaTextView A01;
    public WaTextView A02;
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemWithRightIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        int i3 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C06140Ry.A15, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                i2 = obtainStyledAttributes.getResourceId(0, 0);
                i = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                i3 = resourceId;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.list_item_with_right_icon, (ViewGroup) this, true);
        this.A02 = (WaTextView) AnonymousClass0Q7.A0D(inflate, R.id.list_item_title);
        this.A01 = (WaTextView) AnonymousClass0Q7.A0D(inflate, R.id.list_item_description);
        this.A00 = (WaImageView) AnonymousClass0Q7.A0D(inflate, R.id.list_item_icon);
        if (i3 != 0) {
            this.A02.setText(this.A03.A06(i3));
        }
        if (i2 != 0) {
            this.A01.setText(this.A03.A06(i2));
        }
        if (i != 0) {
            this.A00.setImageDrawable(new C06470Tj(this.A03, C004302a.A03(getContext(), i)));
        }
    }

    public void setDescription(String str) {
        this.A01.setText(str);
    }

    public void setIcon(int i) {
        this.A00.setImageDrawable(new C06470Tj(this.A03, C004302a.A03(getContext(), i)));
    }

    public void setIconVisible(boolean z) {
        WaImageView waImageView = this.A00;
        int i = 8;
        if (z) {
            i = 0;
        }
        waImageView.setVisibility(i);
    }

    public void setTitle(String str) {
        this.A02.setText(str);
    }
}
