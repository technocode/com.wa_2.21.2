package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass03P;
import X.C06140Ry;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class CopyableTextView extends WaTextView implements View.OnClickListener {
    public String A00;
    public final AnonymousClass02M A01 = AnonymousClass02M.A00();
    public final AnonymousClass03P A02 = AnonymousClass03P.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();

    public CopyableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        setTextIsSelectable(true);
        setOnClickListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A0h);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                this.A00 = this.A03.A06(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onClick(View view) {
        ClipboardManager A05;
        if (!TextUtils.isEmpty(this.A00) && (A05 = this.A02.A05()) != null) {
            A05.setPrimaryClip(ClipData.newPlainText(getText(), getText()));
            this.A01.A0C(this.A00, 0);
        }
    }

    public void setToastString(String str) {
        this.A00 = str;
    }
}
