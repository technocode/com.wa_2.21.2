package com.google.android.exoplayer2.ui;

import X.AnonymousClass0W2;
import X.AnonymousClass14D;
import X.AnonymousClass14I;
import X.AnonymousClass155;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.List;

public final class SubtitleView extends View implements AnonymousClass14I {
    public float A00 = 0.08f;
    public float A01 = 0.0533f;
    public AnonymousClass14D A02 = AnonymousClass14D.A06;
    public List A03;
    public boolean A04 = true;
    public boolean A05 = true;
    public final List A06 = new ArrayList();

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A00() {
        AnonymousClass14D r0;
        if (AnonymousClass0W2.A00 < 19 || !((CaptioningManager) getContext().getSystemService("captioning")).isEnabled() || isInEditMode()) {
            r0 = AnonymousClass14D.A06;
        } else {
            r0 = getUserCaptionStyleV19();
        }
        setStyle(r0);
    }

    public void A01() {
        float f;
        if (AnonymousClass0W2.A00 < 19 || isInEditMode()) {
            f = 1.0f;
        } else {
            f = getUserCaptionFontScaleV19();
        }
        setFractionalTextSize(f * 0.0533f);
    }

    @Override // X.AnonymousClass14I
    public void AEn(List list) {
        setCues(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0485 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r38) {
        /*
        // Method dump skipped, instructions count: 1160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.SubtitleView.dispatchDraw(android.graphics.Canvas):void");
    }

    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    private AnonymousClass14D getUserCaptionStyleV19() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        CaptioningManager.CaptionStyle userStyle = ((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle();
        if (AnonymousClass0W2.A00 < 21) {
            return new AnonymousClass14D(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        if (userStyle.hasForegroundColor()) {
            i = userStyle.foregroundColor;
        } else {
            i = AnonymousClass14D.A06.A03;
        }
        if (userStyle.hasBackgroundColor()) {
            i2 = userStyle.backgroundColor;
        } else {
            i2 = AnonymousClass14D.A06.A00;
        }
        if (userStyle.hasWindowColor()) {
            i3 = userStyle.windowColor;
        } else {
            i3 = AnonymousClass14D.A06.A04;
        }
        if (userStyle.hasEdgeType()) {
            i4 = userStyle.edgeType;
        } else {
            i4 = AnonymousClass14D.A06.A02;
        }
        if (userStyle.hasEdgeColor()) {
            i5 = userStyle.edgeColor;
        } else {
            i5 = AnonymousClass14D.A06.A01;
        }
        return new AnonymousClass14D(i, i2, i3, i4, i5, userStyle.getTypeface());
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            invalidate();
        }
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.A05 != z || this.A04 != z) {
            this.A05 = z;
            this.A04 = z;
            invalidate();
        }
    }

    public void setBottomPaddingFraction(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            invalidate();
        }
    }

    public void setCues(List list) {
        int i;
        if (this.A03 != list) {
            this.A03 = list;
            if (list == null) {
                i = 0;
            } else {
                i = list.size();
            }
            while (true) {
                List list2 = this.A06;
                if (list2.size() < i) {
                    list2.add(new AnonymousClass155(getContext()));
                } else {
                    invalidate();
                    return;
                }
            }
        }
    }

    public void setFractionalTextSize(float f) {
        if (this.A01 != f) {
            this.A01 = f;
            invalidate();
        }
    }

    public void setStyle(AnonymousClass14D r2) {
        if (this.A02 != r2) {
            this.A02 = r2;
            invalidate();
        }
    }
}
