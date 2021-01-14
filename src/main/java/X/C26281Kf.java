package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Kf  reason: invalid class name and case insensitive filesystem */
public class C26281Kf extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F = getResources().getDimensionPixelSize(R.dimen.bouncing_lock_arrow_bounce_displacement);
    public int A0G = C004302a.A00(getContext(), R.color.bouncing_lock_arrow_color);
    public int A0H = getResources().getDimensionPixelSize(R.dimen.bouncing_lock_border_size);
    public int A0I = getResources().getDimensionPixelSize(R.dimen.bouncing_lock_size_collapsed);
    public int A0J = (this.A0I >> 1);
    public int A0K;
    public int A0L;
    public int A0M = getResources().getDimensionPixelSize(R.dimen.bouncing_lock_height_expanded);
    public int A0N = C004302a.A00(getContext(), R.color.bouncing_lock_icon_locked);
    public int A0O = C004302a.A00(getContext(), R.color.bouncing_lock_lock_icon_unlocked);
    public AnimatorSet A0P;
    public Bitmap A0Q;
    public Bitmap A0R;
    public Bitmap A0S;
    public Matrix A0T;
    public Paint A0U;
    public Paint A0V;
    public Paint A0W;
    public Paint A0X;
    public RectF A0Y = new RectF();
    public RectF A0Z;
    public boolean A0a = false;
    public boolean A0b;

    public C26281Kf(Context context) {
        super(context, null, 0);
        int A002 = C004302a.A00(getContext(), R.color.bouncing_lock_background_color);
        Paint paint = new Paint(1);
        this.A0V = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A0V.setColor(A002);
        this.A0Z = new RectF();
        int A003 = C004302a.A00(getContext(), R.color.bouncing_lock_border_color);
        Paint paint2 = new Paint(1);
        this.A0W = paint2;
        paint2.setColor(A003);
        this.A0W.setStyle(Paint.Style.STROKE);
        this.A0W.setStrokeWidth((float) this.A0H);
        Paint paint3 = new Paint(1);
        this.A0X = paint3;
        paint3.setFilterBitmap(true);
        Paint paint4 = new Paint(1);
        this.A0U = paint4;
        paint4.setFilterBitmap(true);
        this.A0U.setColorFilter(new PorterDuffColorFilter(this.A0G, PorterDuff.Mode.SRC_IN));
        this.A0S = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_shackle);
        this.A0R = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_body);
        this.A0Q = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_arrow);
        float height = ((float) this.A0S.getHeight()) * 0.39f;
        this.A05 = height;
        this.A0B = height;
        float height2 = (float) ((this.A0I >> 1) - (this.A0S.getHeight() >> 1));
        this.A0D = height2;
        float height3 = (((float) this.A0S.getHeight()) * 0.9f) + height2;
        this.A0C = height3;
        this.A0A = height3 + ((float) this.A0R.getHeight()) + ((float) getResources().getDimensionPixelSize(R.dimen.bouncing_lock_arrow_margin_top));
        this.A01 = this.A0B;
        this.A03 = -2.5f;
        this.A06 = (float) (this.A0Q.getHeight() + this.A0M);
        float height4 = (float) (this.A0S.getHeight() + this.A0M);
        this.A08 = height4;
        this.A07 = (((float) this.A0S.getHeight()) * 0.9f) + height4;
        this.A0T = new Matrix();
        A02();
        if (Build.VERSION.SDK_INT >= 21) {
            setElevation((float) getResources().getDimensionPixelSize(R.dimen.bouncing_lock_elevation));
            setClipToOutline(false);
            setOutlineProvider(new C26271Ke(this));
        }
    }

    public void A00() {
        if (this.A0b) {
            if (this.A0a) {
                AnimatorSet animatorSet = this.A0P;
                if (animatorSet != null) {
                    animatorSet.end();
                    this.A0P.removeAllListeners();
                }
                this.A0P = null;
            }
            int alpha = (int) ((getAlpha() / 1.0f) * 200.0f);
            animate().setListener(null).cancel();
            animate().alpha(0.0f).setDuration((long) alpha).setListener(new C26251Kc(this)).start();
        }
    }

    public final void A01() {
        postInvalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public final void A02() {
        this.A01 = this.A0B;
        this.A00 = this.A06;
        this.A04 = this.A08;
        this.A02 = this.A07;
        this.A0K = 0;
        this.A0L = this.A0M;
        this.A0E = 255;
        this.A09 = 0.0f;
        setTranslationY(0.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        this.A0X.setColorFilter(new PorterDuffColorFilter(this.A0O, PorterDuff.Mode.SRC_IN));
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            setPivotY((float) (getMeasuredHeight() >> 1));
            setPivotX((float) (getMeasuredWidth() >> 1));
        }
    }

    public final void A03() {
        if (!this.A0a) {
            this.A0P = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(800L);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new C25481Hd(this));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setDuration(400L);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setInterpolator(new AccelerateInterpolator());
            ofFloat2.addUpdateListener(new AnonymousClass1HZ(this));
            this.A0P.playTogether(ofFloat, ofFloat2);
            this.A0P.addListener(new C26231Ka(this));
            this.A0P.start();
        }
    }

    public final void A04(long j, Runnable runnable) {
        if (!this.A0b) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(j);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new C25471Hc(this));
            ofFloat.addListener(new C26241Kb(this, runnable));
            ofFloat.start();
        }
    }

    public int getCollapsedHeightPx() {
        return this.A0I;
    }

    public int getExpandedHeightPx() {
        return this.A0M;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A0V.setAlpha(this.A0K);
        RectF rectF = this.A0Y;
        rectF.left = 0.0f;
        float f = (float) ((int) this.A01);
        rectF.top = f;
        rectF.right = 0.0f + ((float) this.A0I);
        rectF.bottom = f + ((float) this.A0L);
        float f2 = (float) this.A0J;
        canvas.drawRoundRect(rectF, f2, f2, this.A0V);
        if (Build.VERSION.SDK_INT < 21) {
            RectF rectF2 = this.A0Z;
            RectF rectF3 = this.A0Y;
            float f3 = rectF3.left;
            float f4 = (float) (this.A0H >> 1);
            float f5 = f3 + f4;
            rectF2.left = f5;
            rectF2.top = rectF3.top + f4;
            float f6 = rectF3.right - f4;
            rectF2.right = f6;
            rectF2.bottom = rectF3.bottom - f4;
            float f7 = (f6 - f5) / 2.0f;
            canvas.drawRoundRect(rectF2, f7, f7, this.A0W);
        }
        float width = (float) (getWidth() >> 1);
        this.A0T.setTranslate(width - ((float) (this.A0S.getWidth() >> 1)), this.A04);
        this.A0T.postRotate(this.A03, (float) (this.A0S.getWidth() >> 1), (float) this.A0S.getHeight());
        canvas.drawBitmap(this.A0S, this.A0T, this.A0X);
        Bitmap bitmap = this.A0R;
        canvas.drawBitmap(bitmap, width - ((float) (bitmap.getWidth() >> 1)), this.A02, this.A0X);
        this.A0U.setAlpha(this.A0E);
        Bitmap bitmap2 = this.A0Q;
        canvas.drawBitmap(bitmap2, width - ((float) (bitmap2.getWidth() >> 1)), this.A00, this.A0U);
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A0I, (int) (((float) this.A0M) + this.A05));
    }

    public void setPercentageLocked(float f) {
        boolean z = false;
        if (f >= 0.0f) {
            z = true;
        }
        AnonymousClass00E.A09(z, "Percentage must be >= 0.0");
        float min = Math.min(1.0f, f);
        if (this.A09 != min) {
            this.A09 = min;
            float f2 = (float) (this.A0M - this.A0I);
            float height = ((float) this.A0S.getHeight()) * 0.39f;
            this.A0E = 255 - ((int) (Math.min(1.0f, min / 0.65f) * 255.0f));
            int i = this.A0M;
            this.A0L = Math.min(i, Math.max((int) (((float) i) - (f2 * min)), this.A0I));
            setTranslationY(Math.min(min, 1.0f) * (-f2));
            if (min >= 0.15f) {
                boolean z2 = this.A0a;
                if (z2) {
                    if (z2) {
                        AnimatorSet animatorSet = this.A0P;
                        if (animatorSet != null) {
                            animatorSet.end();
                            this.A0P.removeAllListeners();
                        }
                        this.A0P = null;
                    }
                    this.A01 = this.A0B;
                    this.A00 = this.A0A;
                }
                float min2 = Math.min(1.0f, min);
                this.A03 = (2.5f * min2) - 1.75f;
                this.A02 = this.A0C - (min2 * height);
                A01();
            } else if (this.A0b && !this.A0a) {
                A03();
            }
        }
    }
}
