package com.whatsapp.gif_search;

import X.AbstractC49282Pv;
import X.AbstractC49292Px;
import X.AnonymousClass00D;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass03P;
import X.AnonymousClass0Eg;
import X.C000300f;
import X.C06170Sb;
import X.C54492f0;
import X.C59882oR;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;

public class GifSearchContainer extends FrameLayout {
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C000300f A04;
    public WaEditText A05;
    public AnonymousClass03P A06;
    public AnonymousClass00D A07;
    public AnonymousClass01X A08;
    public AnonymousClass00Y A09;
    public AnonymousClass0Eg A0A;
    public C54492f0 A0B;
    public AbstractC49282Pv A0C;
    public AbstractC49292Px A0D;
    public AnonymousClass022 A0E;
    public C06170Sb A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I = false;

    public GifSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void A00(GifSearchContainer gifSearchContainer, CharSequence charSequence) {
        if (gifSearchContainer.A0C != null) {
            gifSearchContainer.A01.setVisibility(8);
            gifSearchContainer.A02.setVisibility(8);
            gifSearchContainer.A00.setVisibility(0);
            if (TextUtils.isEmpty(charSequence)) {
                gifSearchContainer.A0B.A09(null);
                C54492f0 A012 = gifSearchContainer.A01();
                gifSearchContainer.A0B = A012;
                gifSearchContainer.A03.setAdapter(A012);
                gifSearchContainer.A0B.A09(gifSearchContainer.A0C.A01());
            } else {
                gifSearchContainer.A0B.A09(gifSearchContainer.A0C.A02(charSequence, false));
            }
            gifSearchContainer.A0G = charSequence.toString();
        }
    }

    public final C54492f0 A01() {
        return new C59882oR(this, this.A0A, this.A09, this.A04, this.A06, this.A08, this.A0D, this.A0E, getResources().getDimensionPixelSize(R.dimen.gif_trend_preview_size));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredHeight() != i4 - i2) {
            if (!this.A0I) {
                post(new RunnableEBaseShape10S0100000_I1_5(this, 3));
            }
            this.A0I = !this.A0I;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r0 == 0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.isInEditMode()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r7, r8)
            return
        L_0x000a:
            int r4 = android.view.View.MeasureSpec.getMode(r8)
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x004a
            int r3 = r6.getSuggestedMinimumHeight()
            boolean r0 = X.C06170Sb.A01(r6)
            if (r0 != 0) goto L_0x0046
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            if (r1 == r0) goto L_0x0052
            r0 = 2
            if (r1 != r0) goto L_0x003d
            X.00D r0 = r6.A07
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "keyboard_height_landscape"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
        L_0x003b:
            if (r0 != 0) goto L_0x0045
        L_0x003d:
            r1 = 1124073472(0x43000000, float:128.0)
            X.01g r0 = X.C002301g.A0K
            float r0 = r0.A00
            float r0 = r0 * r1
            int r0 = (int) r0
        L_0x0045:
            int r3 = r3 + r0
        L_0x0046:
            int r5 = java.lang.Math.min(r3, r5)
        L_0x004a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4)
            super.onMeasure(r7, r0)
            return
        L_0x0052:
            X.00D r0 = r6.A07
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "keyboard_height_portrait"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gif_search.GifSearchContainer.onMeasure(int, int):void");
    }
}
