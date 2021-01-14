package com.whatsapp.text;

import X.AbstractC663834a;
import X.AnonymousClass01X;
import X.AnonymousClass34Z;
import X.C05710Pt;
import X.C06140Ry;
import X.C72083Rl;
import X.C72093Rm;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

public class ReadMoreTextView extends TextEmojiLabel {
    public static final AbstractC663834a A0C;
    public int A00;
    public int A01;
    public AnonymousClass34Z A02;
    public CharSequence A03;
    public CharSequence A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09 = new Handler(Looper.getMainLooper());
    public final AnonymousClass01X A0A = AnonymousClass01X.A00();
    public final Runnable A0B = new RunnableEBaseShape0S0102000_I1(this);

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            A0C = new C72083Rl();
        } else {
            A0C = new C72093Rm();
        }
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0C.AP6(this);
        super.A07 = new C05710Pt();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A1S);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                this.A03 = this.A0A.A06(resourceId);
            }
            this.A01 = obtainStyledAttributes.getResourceId(2, R.color.link_color);
            this.A07 = obtainStyledAttributes.getBoolean(1, false);
            int i = obtainStyledAttributes.getInt(0, 0);
            this.A00 = i;
            if (i > 0) {
                setMaxLines(i);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09.removeCallbacks(this.A0B);
    }

    @Override // X.C05560Pe
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Handler handler = this.A09;
        Runnable runnable = this.A0B;
        handler.removeCallbacks(runnable);
        if (this.A00 != 0) {
            handler.post(runnable);
        }
    }

    public void setExpanded(boolean z) {
        int i;
        if (this.A05 != z) {
            this.A05 = z;
            if (z || (i = this.A00) == 0) {
                i = Integer.MAX_VALUE;
            }
            setMaxLines(i);
            setText(this.A04);
        }
    }

    public void setLinesLimit(int i) {
        this.A00 = i;
        if (this.A05 || i == 0) {
            i = Integer.MAX_VALUE;
        }
        setMaxLines(i);
        requestLayout();
        invalidate();
    }

    public void setReadMoreClickListener(AnonymousClass34Z r1) {
        this.A02 = r1;
    }

    @Override // com.whatsapp.TextEmojiLabel, android.widget.TextView, com.whatsapp.WaTextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (!this.A08) {
            this.A04 = charSequence;
        }
    }

    public static void setVisibleText(ReadMoreTextView readMoreTextView, CharSequence charSequence) {
        readMoreTextView.A08 = true;
        readMoreTextView.setText(charSequence);
        readMoreTextView.A08 = false;
    }
}
