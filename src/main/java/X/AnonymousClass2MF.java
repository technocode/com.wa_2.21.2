package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.ColorPickerComponent;
import com.whatsapp.doodle.ColorPickerView;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.doodle.TitleBarComponent;
import com.whatsapp.gallerypicker.MediaPreviewFragment;

/* renamed from: X.2MF  reason: invalid class name */
public class AnonymousClass2MF {
    public Activity A00;
    public View A01;
    public View A02;
    public C10590es A03;
    public DoodleView A04;
    public AnonymousClass2MN A05;
    public C48522Mp A06;
    public C54212eX A07;
    public MediaPreviewFragment A08;
    public boolean A09;
    public boolean A0A;
    public final Handler A0B = new Handler(Looper.getMainLooper());
    public final AnonymousClass01X A0C;
    public final ColorPickerComponent A0D;
    public final C52902bw A0E = new C52902bw(this);
    public final TitleBarComponent A0F;
    public final C06170Sb A0G;
    public final AnonymousClass00T A0H;
    public final boolean A0I;

    public AnonymousClass2MF(Activity activity, C06170Sb r25, AnonymousClass00T r26, C02590Cr r27, C000300f r28, C52982cD r29, AnonymousClass01X r30, C03620Gz r31, C03570Gt r32, AnonymousClass2cW r33, C53022cH r34, AnonymousClass0D1 r35, View view, C54212eX r37, AbstractC48492Mm r38, MediaPreviewFragment mediaPreviewFragment, TitleBarComponent titleBarComponent, boolean z, boolean z2) {
        this.A00 = activity;
        this.A0G = r25;
        this.A0H = r26;
        this.A0C = r30;
        this.A01 = view;
        this.A07 = r37;
        this.A08 = mediaPreviewFragment;
        this.A0I = z;
        this.A0F = titleBarComponent;
        view.findViewById(R.id.doodle_decoration).setVisibility(0);
        Resources resources = activity.getResources();
        AbstractC48582Mw.A05 = resources.getDimension(R.dimen.doodle_min_shape_size);
        AbstractC48582Mw.A07 = resources.getDimension(R.dimen.doodle_min_text_size);
        AbstractC48582Mw.A0A = resources.getDimension(R.dimen.doodle_max_text_size);
        AbstractC48582Mw.A06 = resources.getDimension(R.dimen.doodle_min_stroke);
        AbstractC48582Mw.A09 = resources.getDimension(R.dimen.doodle_max_stroke);
        AbstractC48582Mw.A08 = resources.getDimension(R.dimen.doodle_hit_test_distance);
        DoodleView doodleView = (DoodleView) this.A01.findViewById(R.id.doodle_view);
        this.A04 = doodleView;
        doodleView.A0Y = false;
        ColorPickerComponent colorPickerComponent = (ColorPickerComponent) this.A01.findViewById(R.id.color_picker_component);
        this.A0D = colorPickerComponent;
        colorPickerComponent.A03(this.A04, r37, new C52912bx(this));
        View findViewById = this.A01.findViewById(R.id.shape_picker);
        this.A02 = findViewById;
        C48522Mp r6 = new C48522Mp(activity, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, findViewById, new C52872bt(this, r38), z, z2);
        this.A06 = r6;
        ColorPickerView colorPickerView = this.A0D.A06;
        r6.A02 = colorPickerView.A03;
        r6.A00 = (float) colorPickerView.A07;
        ((AbstractC16300pa) r6.A0X).A01.A00();
        AnonymousClass2MN r7 = new AnonymousClass2MN(new AnonymousClass2NF(r30, this.A01.findViewById(R.id.trash), new AnonymousClass2NE(), this.A0B), new C48392Ma((ViewGroup) this.A01.findViewById(R.id.media_guidelines), this.A0B), new C52922by(this), r28, C002701k.A00());
        this.A05 = r7;
        this.A04.A0O = r7;
        this.A09 = false;
    }

    public final void A00() {
        if (this.A02.getVisibility() != 8) {
            C10590es r0 = this.A03;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(true);
            }
            this.A02.setVisibility(8);
            this.A0G.A02(this.A02);
            TitleBarComponent titleBarComponent = this.A0F;
            titleBarComponent.setToolbarExtraVisibility(8);
            titleBarComponent.A04();
            this.A07.A02();
            A04();
            if (this.A0I) {
                DoodleView doodleView = this.A04;
                ValueAnimator valueAnimator = doodleView.A0D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                Bitmap bitmap = doodleView.A0F;
                if (bitmap != null) {
                    bitmap.recycle();
                    doodleView.A0F = null;
                    doodleView.invalidate();
                }
                A02();
                if (this.A0A) {
                    this.A08.A0p();
                }
            }
        }
    }

    public final void A01() {
        if (this.A04.A0G()) {
            this.A07.A03();
            A00();
            DoodleView doodleView = this.A04;
            boolean z = !doodleView.A0Y;
            doodleView.A0Y = z;
            ColorPickerComponent colorPickerComponent = this.A0D;
            if (z) {
                colorPickerComponent.A00();
            } else {
                colorPickerComponent.A04(true);
            }
            colorPickerComponent.setColorPaletteAndInvalidate(1);
            this.A04.A0R = null;
            A04();
        }
    }

    public final void A02() {
        DoodleView doodleView = this.A04;
        if (doodleView.A0F != null || doodleView.A0Y || (!doodleView.A0U.A01.isEmpty()) || (!this.A04.A0U.A00.A00.isEmpty())) {
            if (this.A04.getVisibility() != 0) {
                this.A04.setVisibility(0);
            }
        } else if (this.A04.getVisibility() != 4) {
            this.A04.setVisibility(4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r6.A0E != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2MF.A03():void");
    }

    public final void A04() {
        ColorPickerComponent colorPickerComponent = this.A0D;
        ColorPickerView colorPickerView = colorPickerComponent.A06;
        boolean z = colorPickerView.A0A;
        TitleBarComponent titleBarComponent = this.A0F;
        titleBarComponent.setShapeToolDrawableStrokePreview(false);
        titleBarComponent.A04.A04 = false;
        ImageView imageView = titleBarComponent.A0F;
        imageView.setSelected(false);
        ImageView imageView2 = titleBarComponent.A0I;
        imageView2.setSelected(false);
        titleBarComponent.A0H.setSelected(false);
        DoodleView doodleView = this.A04;
        boolean z2 = true;
        if (doodleView.A0Y) {
            ColorPickerComponent colorPickerComponent2 = titleBarComponent.A01;
            if (colorPickerComponent2 != null) {
                ColorPickerView colorPickerView2 = colorPickerComponent2.A06;
                titleBarComponent.A06(colorPickerView2.A00, colorPickerView2.A03);
                titleBarComponent.A05(titleBarComponent.A01.A06.A00, 0);
                titleBarComponent.A06.A00(titleBarComponent.A01.A06.A00, 0);
                titleBarComponent.A04.A04 = titleBarComponent.A01.A06.A0A;
                imageView.setSelected(true);
            }
            colorPickerComponent.A00();
        } else {
            AbstractC48582Mw r1 = doodleView.A0R;
            if (r1 instanceof C53232ck) {
                ColorPickerComponent colorPickerComponent3 = titleBarComponent.A01;
                if (colorPickerComponent3 != null) {
                    AnonymousClass2MU r9 = titleBarComponent.A06;
                    ColorPickerView colorPickerView3 = colorPickerComponent3.A06;
                    r9.A00(colorPickerView3.A00, colorPickerView3.A03);
                    titleBarComponent.A05(titleBarComponent.A01.A06.A00, 0);
                    titleBarComponent.A04.A00(titleBarComponent.A01.A06.A00, 0);
                    imageView2.setSelected(true);
                    titleBarComponent.A08 = true;
                }
                colorPickerComponent.A00();
            } else if (r1 == null || (!r1.A0C() && !r1.A0B())) {
                ColorPickerComponent colorPickerComponent4 = titleBarComponent.A01;
                if (colorPickerComponent4 != null) {
                    titleBarComponent.A05(colorPickerComponent4.A06.A00, 0);
                    titleBarComponent.A06.A00(titleBarComponent.A01.A06.A00, 0);
                    titleBarComponent.A04.A00(titleBarComponent.A01.A06.A00, 0);
                    titleBarComponent.A08 = true;
                }
                colorPickerComponent.A04(true);
            } else {
                titleBarComponent.A01();
                if (!z || !this.A04.A0R.A0C()) {
                    z2 = false;
                }
                titleBarComponent.setShapeToolDrawableStrokePreview(z2);
                colorPickerComponent.A00();
            }
        }
        if (this.A02.getVisibility() == 0) {
            titleBarComponent.A02();
            titleBarComponent.A01();
            titleBarComponent.setShapeToolDrawableStrokePreview(z);
            titleBarComponent.A0B.setVisibility(8);
            colorPickerView.clearAnimation();
            colorPickerComponent.A04(false);
        } else {
            titleBarComponent.A03();
            titleBarComponent.A04();
        }
        boolean z3 = this.A0I;
        boolean z4 = this.A0C.A02().A06;
        if (z3) {
            RelativeLayout relativeLayout = titleBarComponent.A0J;
            View startingViewFromToolbarExtra = titleBarComponent.getStartingViewFromToolbarExtra();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.addRule(!z4 ? 1 : 0, startingViewFromToolbarExtra.getId());
            relativeLayout.setLayoutParams(layoutParams);
        }
        A02();
    }

    public final void A05(C53232ck r13) {
        String str;
        int color;
        float textSize;
        A00();
        this.A07.A03();
        int i = 0;
        this.A04.A0Y = false;
        TitleBarComponent titleBarComponent = this.A0F;
        AnonymousClass2MU r1 = titleBarComponent.A05;
        r1.A03 = 0;
        r1.A01 = 1.0f;
        r1.invalidateSelf();
        titleBarComponent.setTextToolDrawableColor(0);
        AnonymousClass2MU r12 = titleBarComponent.A04;
        r12.A03 = 0;
        r12.A01 = 1.0f;
        r12.invalidateSelf();
        ColorPickerComponent colorPickerComponent = this.A0D;
        colorPickerComponent.A04(false);
        colorPickerComponent.A01(R.anim.color_picker_animate_out);
        this.A07.A00();
        this.A0G.A03(this.A04);
        int[] iArr = {titleBarComponent.getPaddingLeft(), titleBarComponent.getPaddingTop(), titleBarComponent.getPaddingRight(), titleBarComponent.getPaddingBottom()};
        Activity activity = this.A00;
        if (r13 == null) {
            str = "";
        } else {
            str = r13.A07;
        }
        if (r13 == null) {
            color = colorPickerComponent.A06.A03;
        } else {
            color = ((AbstractC48582Mw) r13).A03.getColor();
        }
        if (r13 == null) {
            textSize = 0.0f;
        } else {
            textSize = r13.A06.getTextSize();
            i = r13.A04;
        }
        AnonymousClass2MQ r4 = new AnonymousClass2MQ(activity, str, color, textSize, i, titleBarComponent.A0O, iArr);
        r4.A05 = colorPickerComponent.A06.getHeight();
        r4.A0D = !colorPickerComponent.A05();
        if (r13 != null) {
            ((AbstractC48582Mw) r13).A02 = true;
            this.A04.invalidate();
        }
        r4.show();
        r4.setOnDismissListener(new AnonymousClass2M0(this, r13, r4));
    }

    public boolean A06(float f, float f2) {
        if (this.A02.getVisibility() != 0) {
            DoodleView doodleView = this.A04;
            if (doodleView.A0M == null) {
                return false;
            }
            if (!doodleView.A0Y && doodleView.A0S == null) {
                if (doodleView.A0U.A00(doodleView.A02(f, f2)) != null) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
