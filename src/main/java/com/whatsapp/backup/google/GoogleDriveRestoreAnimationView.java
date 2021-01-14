package com.whatsapp.backup.google;

import X.AnonymousClass01X;
import X.C002001d;
import X.C004302a;
import X.C07990aH;
import X.C27631Qt;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.search.verification.client.R;

public class GoogleDriveRestoreAnimationView extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Resources A05;
    public Paint A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public C27631Qt A0A;
    public boolean A0B;
    public boolean A0C;
    public final DecelerateInterpolator A0D = new DecelerateInterpolator();
    public final AnonymousClass01X A0E = AnonymousClass01X.A00();

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        this.A01 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C07990aH.A13, 0, 0);
            int i2 = 0;
            int i3 = 1;
            try {
                this.A09 = obtainStyledAttributes.getDrawable(this.A0E.A02().A06 ? 3 : 0);
                this.A07 = obtainStyledAttributes.getDrawable(!this.A0E.A02().A06 ? 3 : i2);
                this.A0C = obtainStyledAttributes.getBoolean(2, false);
                this.A03 = obtainStyledAttributes.getColor(this.A0E.A02().A06 ? 4 : 1, 0);
                this.A02 = obtainStyledAttributes.getColor(!this.A0E.A02().A06 ? 4 : i3, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Resources resources = context.getResources();
        this.A05 = resources;
        Drawable drawable = this.A09;
        if (drawable == null) {
            drawable = resources.getDrawable(this.A0E.A02().A06 ? R.drawable.ill_backup_phone : R.drawable.ill_backup_restore);
            this.A09 = drawable;
        }
        this.A04 = drawable != null ? drawable.getIntrinsicWidth() : i;
        if (this.A07 == null) {
            this.A07 = this.A05.getDrawable(this.A0E.A02().A06 ? R.drawable.ill_backup_restore : R.drawable.ill_backup_phone);
        }
        this.A09 = C002001d.A0e(this.A09, this.A03);
        this.A07 = C002001d.A0e(this.A07, this.A02);
        this.A06 = new Paint();
    }

    public void A00() {
        if (this.A0A == null) {
            A01();
        }
        this.A01 = 1;
        startAnimation(this.A0A);
    }

    public final void A01() {
        C27631Qt r2 = new C27631Qt(this);
        this.A0A = r2;
        r2.setDuration(2000);
        this.A0A.setRepeatCount(-1);
        this.A0A.setInterpolator(new LinearInterpolator());
        this.A0A.setFillAfter(true);
    }

    public void A02(boolean z) {
        if (this.A0A == null) {
            A01();
        }
        clearAnimation();
        if (z) {
            this.A08 = C002001d.A0e(this.A05.getDrawable(R.drawable.ic_restore_error), C004302a.A00(getContext(), R.color.googleDriveRestoreAnimationErrorIconTint));
            this.A01 = 3;
        } else {
            this.A09 = C002001d.A0e(this.A05.getDrawable(R.drawable.ill_restore_anim), this.A03);
            this.A08 = C002001d.A0e(this.A05.getDrawable(R.drawable.ill_restore_success_checkmark), C004302a.A00(getContext(), R.color.googleDriveRestoreAnimationSuccessIconTint));
            this.A01 = 2;
        }
        C27631Qt r2 = this.A0A;
        if (r2 != null) {
            r2.setDuration(800);
            startAnimation(this.A0A);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C27631Qt r2 = new C27631Qt(this);
        this.A0A = r2;
        r2.setDuration(2000);
        this.A0A.setRepeatCount(-1);
        this.A0A.setInterpolator(new LinearInterpolator());
        this.A0A.setFillAfter(true);
        startAnimation(this.A0A);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r0 == 3) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d5, code lost:
        if (r4 < (r2 - 0.5d)) goto L_0x01d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r25) {
        /*
        // Method dump skipped, instructions count: 660
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleDriveRestoreAnimationView.onDraw(android.graphics.Canvas):void");
    }

    public void onVisibilityChanged(View view, int i) {
        C27631Qt r0;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A0A) != null) {
            startAnimation(r0);
        }
    }
}
