package com.whatsapp.doodle;

import X.AbstractC000400g;
import X.AnonymousClass01X;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass2M8;
import X.AnonymousClass2MJ;
import X.C000300f;
import X.C002701k;
import X.C52892bv;
import X.C54212eX;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;

public class ColorPickerComponent extends LinearLayout {
    public C54212eX A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final C000300f A04 = C000300f.A00();
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();
    public final ColorPickerView A06;
    public final C002701k A07 = C002701k.A00();
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColorPickerComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View A0D;
        boolean z = false;
        z = (this.A04.A0D(AbstractC000400g.A24) || this.A07.A0E(279)) ? true : z;
        this.A08 = z;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(z ? R.layout.color_picker_wave_one : R.layout.color_picker, (ViewGroup) this, true);
        this.A03 = viewGroup;
        this.A06 = (ColorPickerView) AnonymousClass0Q7.A0D(viewGroup, R.id.color_picker);
        this.A01 = AnonymousClass0Q7.A0D(this.A03, R.id.color_picker_container);
        if (this.A08) {
            A0D = null;
        } else {
            A0D = AnonymousClass0Q7.A0D(this.A03, R.id.extra_view);
        }
        this.A02 = A0D;
        A02(getResources().getConfiguration().orientation);
    }

    public void A00() {
        if (!A05()) {
            ColorPickerView colorPickerView = this.A06;
            colorPickerView.setVisibility(0);
            if (this.A08) {
                A01(R.anim.color_picker_animate_in);
            } else if (this.A00 != null) {
                float f = -1.0f;
                if (this.A05.A0M()) {
                    f = 1.0f;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(180);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                colorPickerView.startAnimation(translateAnimation);
            }
            C54212eX r0 = this.A00;
            if (r0 != null) {
                r0.A00.A02.A07(true);
            }
        }
    }

    public void A01(int i) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i);
        loadAnimation.setFillBefore(true);
        loadAnimation.setInterpolator(AnonymousClass0N2.A0a(0.5f, 1.35f, 0.4f));
        this.A06.startAnimation(loadAnimation);
    }

    public final void A02(int i) {
        if (i == 2) {
            this.A01.setPadding(getPaddingLeft(), (int) getResources().getDimension(R.dimen.color_picker_top_padding), getPaddingRight(), (int) getResources().getDimension(R.dimen.color_picker_bottom_padding));
        } else {
            this.A01.setPadding(getPaddingLeft(), (int) getResources().getDimension(R.dimen.color_picker_top_padding), getPaddingRight(), 0);
        }
    }

    public void A03(AnonymousClass2MJ r4, C54212eX r5, AnonymousClass2M8 r6) {
        this.A00 = r5;
        if (this.A08) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = (int) getResources().getDimension(R.dimen.color_picker_container_height);
            setLayoutParams(layoutParams);
        }
        if (r4 != null) {
            ColorPickerView colorPickerView = this.A06;
            ((DoodleView) r4).A0C(colorPickerView.A00, colorPickerView.A03);
        }
        this.A06.A09 = new C52892bv(r4, r6);
    }

    public void A04(boolean z) {
        if (!z) {
            this.A06.setVisibility(4);
        } else if (this.A00 != null && A05()) {
            ColorPickerView colorPickerView = this.A06;
            colorPickerView.setVisibility(4);
            if (this.A08) {
                A01(R.anim.color_picker_animate_out);
            } else if (this.A00 != null) {
                float f = -1.0f;
                if (this.A05.A0M()) {
                    f = 1.0f;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(180);
                translateAnimation.setInterpolator(new AccelerateInterpolator());
                colorPickerView.startAnimation(translateAnimation);
            }
            this.A00.A00();
        }
    }

    public boolean A05() {
        return this.A06.getVisibility() == 0;
    }

    public int getColorPickerHeight() {
        return this.A06.getHeight();
    }

    public float getMinSize() {
        return (float) this.A06.A07;
    }

    public int getSelectedColor() {
        return this.A06.A03;
    }

    public float getSelectedStrokeSize() {
        return this.A06.A00;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A08) {
            A02(configuration.orientation);
        }
    }

    public void setColorAndInvalidate(int i) {
        this.A06.setColorAndInvalidate(i);
    }

    public void setColorPaletteAndInvalidate(int i) {
        this.A06.setColorPaletteAndInvalidate(i);
    }

    public void setMaxHeight(int i) {
        this.A06.A04 = i;
    }

    public void setSizeAndInvalidate(float f) {
        this.A06.setSizeAndInvalidate(f);
    }
}
