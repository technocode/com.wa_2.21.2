package com.whatsapp.doodle;

import X.AbstractC000400g;
import X.AnonymousClass01X;
import X.AnonymousClass0L2;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SE;
import X.AnonymousClass2M5;
import X.AnonymousClass2M6;
import X.AnonymousClass2M7;
import X.AnonymousClass2MR;
import X.AnonymousClass2MS;
import X.AnonymousClass2MU;
import X.C000300f;
import X.C002701k;
import X.C06470Tj;
import X.C52932bz;
import X.C52952c5;
import X.C54212eX;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;

public class TitleBarComponent extends FrameLayout {
    public ValueAnimator A00 = ValueAnimator.ofFloat(0.8f, 1.0f);
    public ColorPickerComponent A01;
    public C52932bz A02;
    public DoodleView A03;
    public AnonymousClass2MU A04;
    public AnonymousClass2MU A05;
    public AnonymousClass2MU A06;
    public C54212eX A07;
    public boolean A08 = true;
    public final View.OnClickListener A09 = new ViewOnClickEBaseShape5S0100000_I1_3(this, 39);
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final ImageView A0F;
    public final ImageView A0G;
    public final ImageView A0H;
    public final ImageView A0I;
    public final RelativeLayout A0J;
    public final C000300f A0K = C000300f.A00();
    public final AnonymousClass0L2 A0L = AnonymousClass0L2.A01();
    public final AnonymousClass01X A0M = AnonymousClass01X.A00();
    public final C002701k A0N = C002701k.A00();
    public final boolean A0O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleBarComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ImageView imageView;
        boolean z = false;
        z = (this.A0K.A0D(AbstractC000400g.A24) || this.A0N.A0E(279)) ? true : z;
        this.A0O = z;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(z ? R.layout.title_bar_view_wave_one : R.layout.title_bar_view, (ViewGroup) this, true);
        this.A0C = viewGroup;
        if (this.A0O) {
            imageView = null;
        } else {
            imageView = (ImageView) AnonymousClass0Q7.A0D(viewGroup, R.id.profile_picture);
        }
        this.A0G = imageView;
        this.A0D = (ImageView) AnonymousClass0Q7.A0D(this.A0C, R.id.back);
        this.A0J = (RelativeLayout) AnonymousClass0Q7.A0D(this.A0C, R.id.tool_bar_extra);
        this.A0B = AnonymousClass0Q7.A0D(this.A0C, R.id.undo);
        this.A0A = AnonymousClass0Q7.A0D(this.A0C, R.id.title_bar);
        this.A0F = (ImageView) AnonymousClass0Q7.A0D(this.A0C, R.id.pen);
        this.A0H = (ImageView) AnonymousClass0Q7.A0D(this.A0C, R.id.shape);
        this.A0I = (ImageView) AnonymousClass0Q7.A0D(this.A0C, R.id.text);
        this.A0E = (ImageView) AnonymousClass0Q7.A0D(this.A0C, R.id.crop);
        Resources resources = getContext().getResources();
        if (this.A0O) {
            AnonymousClass0SE.A08(this.A0M, this.A0C, getPaddingLeft(), resources.getDimensionPixelSize(R.dimen.title_bar_top_padding), getPaddingRight(), getPaddingBottom());
        }
        this.A04 = new AnonymousClass2MU(getContext(), R.drawable.ic_cam_draw);
        this.A05 = new AnonymousClass2MU(getContext(), R.drawable.ic_cam_sticker);
        this.A06 = new AnonymousClass2MU(getContext(), R.drawable.ic_cam_text);
        this.A0F.setImageDrawable(this.A04);
        this.A0H.setImageDrawable(this.A05);
        this.A0I.setImageDrawable(this.A06);
        this.A0F.setOnClickListener(this.A09);
        this.A0H.setOnClickListener(this.A09);
        this.A0I.setOnClickListener(this.A09);
        this.A0E.setOnClickListener(this.A09);
        ImageView imageView2 = this.A0D;
        imageView2.setImageDrawable(new C06470Tj(this.A0M, imageView2.getDrawable()));
        this.A0D.setOnClickListener(new C52952c5());
        this.A0B.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 38));
        this.A0B.setOnLongClickListener(new AnonymousClass2M6(this));
        this.A00.setInterpolator(AnonymousClass0N2.A0a(0.5f, 1.35f, 0.4f));
        this.A00.setDuration(400L);
    }

    public static final boolean A00(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF((float) i, (float) iArr[1], (float) (view.getWidth() + i), (float) (view.getHeight() + iArr[1])).contains(f, f2);
    }

    public void A01() {
        ColorPickerComponent colorPickerComponent = this.A01;
        if (colorPickerComponent != null) {
            ColorPickerView colorPickerView = colorPickerComponent.A06;
            A05(colorPickerView.A00, colorPickerView.A03);
            this.A06.A00(this.A01.A06.A00, 0);
            this.A04.A00(this.A01.A06.A00, 0);
            this.A0H.setSelected(true);
            this.A08 = true;
        }
    }

    public void A02() {
        this.A0F.setAlpha(0.5f);
        this.A0I.setAlpha(0.5f);
        this.A0E.setAlpha(0.5f);
        setProfilePhotoAlpha(0.5f);
    }

    public void A03() {
        this.A0F.setAlpha(1.0f);
        this.A0I.setAlpha(1.0f);
        this.A0E.setAlpha(1.0f);
        setProfilePhotoAlpha(1.0f);
    }

    public void A04() {
        DoodleView doodleView = this.A03;
        if (doodleView != null) {
            View view = this.A0B;
            boolean z = !doodleView.A0U.A00.A00.isEmpty();
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public void A05(float f, int i) {
        ColorPickerComponent colorPickerComponent = this.A01;
        if (colorPickerComponent != null) {
            if (!this.A0O || colorPickerComponent.A05() || i == 0) {
                AnonymousClass2MU r1 = this.A05;
                r1.A02 = f;
                r1.A03 = i;
                r1.A01 = 1.0f;
                r1.invalidateSelf();
                return;
            }
            this.A00.addUpdateListener(new AnonymousClass2M7(this, f, i));
            this.A00.addListener(new AnonymousClass2MR(this));
            this.A00.start();
            this.A08 = true;
        }
    }

    public final void A06(float f, int i) {
        if (this.A01 != null) {
            if (!this.A0O || !this.A08 || i == 0) {
                AnonymousClass2MU r1 = this.A04;
                r1.A02 = f;
                r1.A03 = i;
                r1.A01 = 1.0f;
                r1.invalidateSelf();
                return;
            }
            this.A00.addUpdateListener(new AnonymousClass2M5(this, f, i));
            this.A00.addListener(new AnonymousClass2MS(this));
            this.A00.start();
            this.A08 = false;
        }
    }

    public View getStartingViewFromToolbarExtra() {
        ImageView imageView = this.A0G;
        if (imageView != null) {
            return imageView.getVisibility() != 0 ? this.A0D : imageView;
        }
        return this.A0D;
    }

    public RelativeLayout getToolbarExtra() {
        return this.A0J;
    }

    private void setProfilePhotoAlpha(float f) {
        ImageView imageView = this.A0G;
        if (imageView != null) {
            imageView.setAlpha(f);
        }
    }

    public void setShapeToolDrawableStrokePreview(boolean z) {
        this.A05.A04 = z;
    }

    public void setTextToolDrawableColor(int i) {
        AnonymousClass2MU r1 = this.A06;
        r1.A03 = i;
        r1.A01 = 1.0f;
        r1.invalidateSelf();
        this.A08 = true;
    }

    public void setToolbarExtraVisibility(int i) {
        this.A0J.setVisibility(i);
    }
}
