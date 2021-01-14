package com.whatsapp.mediaview;

import X.AbstractView$OnClickListenerC50262Ua;
import X.AnonymousClass1MC;
import X.AnonymousClass2UZ;
import X.C08490bD;
import X.C14890n3;
import X.C57552kU;
import X.C57562kV;
import X.RunnableC50272Ub;
import X.RunnableC50282Uc;
import X.RunnableC50292Ud;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.InteractiveAnnotation;

public class PhotoView extends C08490bD implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02 = Float.MAX_VALUE;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08 = 0.8f;
    public int A09 = 0;
    public Matrix A0A;
    public Matrix A0B = new Matrix();
    public Matrix A0C = new Matrix();
    public Paint A0D = new Paint();
    public PointF A0E = new PointF();
    public Rect A0F = new Rect();
    public RectF A0G = new RectF();
    public RectF A0H = new RectF();
    public RectF A0I = new RectF();
    public BitmapDrawable A0J;
    public Drawable A0K;
    public ScaleGestureDetector A0L;
    public View.OnClickListener A0M;
    public C14890n3 A0N;
    public RunnableC50272Ub A0O;
    public RunnableC50282Uc A0P;
    public RunnableC50292Ud A0Q;
    public RunnableEBaseShape0S0120102_I1 A0R;
    public RunnableEBaseShape0S0120102_I1 A0S;
    public boolean A0T = false;
    public boolean A0U;
    public boolean A0V = true;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final Runnable A0Z = new RunnableEBaseShape11S0100000_I1_6(this, 6);

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public PhotoView(Context context) {
        super(context, null);
        A03();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public static void A00(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A00(viewGroup.getChildAt(i));
            }
        } else if (view instanceof PhotoView) {
            ((PhotoView) view).A01();
        }
    }

    public void A01() {
        this.A0N = null;
        this.A0L = null;
        this.A0J = null;
        setImageDrawable(null);
        RunnableC50282Uc r1 = this.A0P;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        this.A0P = null;
        RunnableEBaseShape0S0120102_I1 runnableEBaseShape0S0120102_I1 = this.A0S;
        if (runnableEBaseShape0S0120102_I1 != null) {
            runnableEBaseShape0S0120102_I1.A04 = false;
            runnableEBaseShape0S0120102_I1.A05 = true;
        }
        this.A0S = null;
        RunnableEBaseShape0S0120102_I1 runnableEBaseShape0S0120102_I12 = this.A0R;
        if (runnableEBaseShape0S0120102_I12 != null) {
            runnableEBaseShape0S0120102_I12.A04 = false;
            runnableEBaseShape0S0120102_I12.A05 = true;
        }
        this.A0R = null;
        RunnableC50272Ub r0 = this.A0O;
        if (r0 != null) {
            r0.A02 = true;
            PhotoView photoView = r0.A03;
            photoView.A07 = (float) Math.round(photoView.A07);
            photoView.A08(true);
            photoView.requestLayout();
            photoView.invalidate();
        }
        this.A0O = null;
        RunnableC50292Ud r12 = this.A0Q;
        if (r12 != null) {
            r12.A01 = true;
        }
        this.A0Q = null;
        setOnClickListener(null);
        this.A0M = null;
    }

    public void A02() {
        this.A0B.set(this.A0C);
        this.A00 = this.A06;
        setImageMatrix(this.A0B);
    }

    public final void A03() {
        Context context = getContext();
        this.A0N = new C14890n3(context, this);
        AnonymousClass2UZ r2 = new AnonymousClass2UZ(context, this, getScaledMinScalingSpan());
        this.A0L = r2;
        if (Build.VERSION.SDK_INT >= 19) {
            r2.setQuickScaleEnabled(false);
        }
        this.A0P = new RunnableC50282Uc(this);
        this.A0S = new RunnableEBaseShape0S0120102_I1(this, 1);
        this.A0R = new RunnableEBaseShape0S0120102_I1(this, 0);
        this.A0O = new RunnableC50272Ub(this);
        this.A0Q = new RunnableC50292Ud(this);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void A04(float f, float f2) {
        View.OnClickListener onClickListener = this.A0M;
        if (onClickListener == null) {
            return;
        }
        if (onClickListener instanceof AbstractView$OnClickListenerC50262Ua) {
            C57552kU r7 = (C57552kU) ((AbstractView$OnClickListenerC50262Ua) onClickListener);
            Bitmap photo = r7.A00.A01.getPhoto();
            if (photo != null) {
                Matrix matrix = new Matrix();
                C57562kV r5 = r7.A00;
                PhotoView photoView = r5.A01;
                photoView.getImageMatrix().invert(matrix);
                float[] fArr = {f, f2};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                matrix.mapPoints(fArr);
                InteractiveAnnotation A002 = AnonymousClass1MC.A00(r7.A01, fArr, fArr2);
                if (A002 != null) {
                    MediaViewFragment.A05(r5.A00, A002, photoView);
                    return;
                }
            }
            MediaViewFragment mediaViewFragment = r7.A00.A00;
            mediaViewFragment.A10(!((MediaViewBaseFragment) mediaViewFragment).A0G, true);
            return;
        }
        onClickListener.onClick(this);
    }

    public final void A05(float f, float f2, float f3) {
        float min = Math.min(Math.max(f, this.A04 * this.A08), this.A03);
        float f4 = min / this.A00;
        this.A0B.postRotate(-this.A07, (float) (getWidth() >> 1), (float) (getHeight() >> 1));
        this.A0B.postScale(f4, f4, f2, f3);
        this.A00 = min;
        this.A0B.postRotate(this.A07, (float) (getWidth() >> 1), (float) (getHeight() >> 1));
        A09(true);
        setImageMatrix(this.A0B);
    }

    public void A06(Bitmap bitmap) {
        A07(bitmap == null ? null : new BitmapDrawable(getResources(), bitmap));
    }

    public void A07(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = this.A0J;
        if (bitmapDrawable != bitmapDrawable2) {
            boolean z = false;
            if (bitmapDrawable2 != null) {
                if (!(bitmapDrawable != null && bitmapDrawable2.getIntrinsicWidth() == bitmapDrawable.getIntrinsicWidth() && this.A0J.getIntrinsicHeight() == bitmapDrawable.getIntrinsicHeight())) {
                    z = true;
                }
                this.A04 = 0.0f;
            }
            this.A0J = bitmapDrawable;
            setImageDrawable(bitmapDrawable);
            A08(z);
            invalidate();
        }
    }

    public final void A08(boolean z) {
        float abs;
        float min;
        BitmapDrawable bitmapDrawable = this.A0J;
        if (bitmapDrawable != null && this.A0W) {
            this.A0J.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.A0J.getIntrinsicHeight());
            if (z || (this.A04 == 0.0f && this.A0J != null && this.A0W)) {
                float intrinsicWidth = (float) this.A0J.getIntrinsicWidth();
                float intrinsicHeight = (float) this.A0J.getIntrinsicHeight();
                float width = (float) ((getWidth() - getPaddingLeft()) - getPaddingRight());
                float height = (float) ((getHeight() - getPaddingTop()) - getPaddingBottom());
                this.A05 = 0.0f;
                this.A0B.reset();
                this.A0H.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                this.A0G.set(0.0f, 0.0f, width, height);
                float f = intrinsicWidth / 2.0f;
                float f2 = intrinsicHeight / 2.0f;
                this.A0B.setTranslate((width / 2.0f) - f, (height / 2.0f) - f2);
                if (this.A0T) {
                    abs = Math.abs(this.A07 % 180.0f);
                    if (abs == 90.0f) {
                        min = Math.max(width / intrinsicHeight, height / intrinsicWidth);
                    } else {
                        min = Math.max(width / intrinsicWidth, height / intrinsicHeight);
                    }
                    this.A04 = min;
                } else {
                    abs = Math.abs(this.A07 % 180.0f);
                    if (abs == 90.0f) {
                        min = Math.min(width / intrinsicHeight, height / intrinsicWidth);
                    } else {
                        min = Math.min(width / intrinsicWidth, height / intrinsicHeight);
                    }
                    this.A04 = min;
                }
                float f3 = this.A02;
                float min2 = Math.min(min, f3);
                this.A04 = min2;
                int i = this.A09;
                if (i == 3) {
                    min2 = abs == 90.0f ? Math.max(width / intrinsicHeight, height / intrinsicWidth) : Math.max(width / intrinsicWidth, height / intrinsicHeight);
                } else if (i == 1) {
                    min2 = abs == 90.0f ? width / intrinsicHeight : width / intrinsicWidth;
                } else if (i == 2) {
                    min2 = abs == 90.0f ? height / intrinsicWidth : height / intrinsicHeight;
                }
                if (abs == 90.0f) {
                    float f4 = width / intrinsicHeight;
                    float f5 = height / intrinsicWidth;
                    if (Math.abs((f4 / f5) - 1.0f) < this.A01) {
                        min2 = Math.max(f4, f5);
                        this.A05 = min2;
                    }
                } else {
                    float f6 = width / intrinsicWidth;
                    float f7 = height / intrinsicHeight;
                    if (Math.abs((f6 / f7) - 1.0f) < this.A01) {
                        min2 = Math.max(f6, f7);
                        this.A05 = min2;
                    }
                }
                float min3 = Math.min(min2, f3);
                this.A00 = min3;
                this.A05 = Math.min(this.A05, f3);
                this.A0B.preScale(min3, min3, f, f2);
                this.A03 = Math.max(this.A04 * 8.0f, 8.0f);
                this.A0B.postRotate(this.A07, (float) (getWidth() / 2), (float) (getHeight() / 2));
                this.A06 = this.A00;
                this.A0C.set(this.A0B);
            }
            Matrix matrix = this.A0B;
            this.A0A = matrix;
            setImageMatrix(matrix);
        }
    }

    public final void A09(boolean z) {
        float f;
        this.A0I.set(this.A0H);
        this.A0B.mapRect(this.A0I);
        float width = (float) getWidth();
        RectF rectF = this.A0I;
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = width - 0.0f;
        if (f3 - f2 < f5) {
            f = ((f5 - (f3 + f2)) / 2.0f) + 0.0f;
        } else {
            f = f2 > 0.0f ? 0.0f - f2 : f3 < width ? width - f3 : 0.0f;
        }
        float height = (float) getHeight();
        RectF rectF2 = this.A0I;
        float f6 = rectF2.top;
        float f7 = rectF2.bottom;
        float f8 = height - 0.0f;
        if (f7 - f6 < f8) {
            f4 = 0.0f + ((f8 - (f7 + f6)) / 2.0f);
        } else if (f6 > 0.0f) {
            f4 = 0.0f - f6;
        } else if (f7 < height) {
            f4 = height - f7;
        }
        if ((Math.abs(f) > 20.0f || Math.abs(f4) > 20.0f) && !z) {
            RunnableEBaseShape0S0120102_I1 runnableEBaseShape0S0120102_I1 = this.A0R;
            if (runnableEBaseShape0S0120102_I1 != null && !runnableEBaseShape0S0120102_I1.A04) {
                runnableEBaseShape0S0120102_I1.A02 = -1;
                runnableEBaseShape0S0120102_I1.A00 = f;
                runnableEBaseShape0S0120102_I1.A01 = f4;
                runnableEBaseShape0S0120102_I1.A05 = false;
                runnableEBaseShape0S0120102_I1.A04 = true;
                ((View) runnableEBaseShape0S0120102_I1.A03).postDelayed(runnableEBaseShape0S0120102_I1, 250);
                return;
            }
            return;
        }
        this.A0B.postTranslate(f, f4);
        setImageMatrix(this.A0B);
    }

    public boolean A0A() {
        if (!this.A0Y) {
            return false;
        }
        RunnableEBaseShape0S0120102_I1 runnableEBaseShape0S0120102_I1 = this.A0S;
        if (runnableEBaseShape0S0120102_I1 != null && runnableEBaseShape0S0120102_I1.A04) {
            return true;
        }
        float f = this.A05;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        float f2 = this.A00;
        if (i == 0) {
            if (f2 != this.A04) {
                return true;
            }
            return false;
        } else if (f2 > f) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A0B(float f, float f2) {
        float max;
        float max2;
        this.A0I.set(this.A0H);
        this.A0B.mapRect(this.A0I);
        float width = (float) getWidth();
        RectF rectF = this.A0I;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = width - 0.0f;
        if (f4 - f3 < f5) {
            max = ((f5 - (f4 + f3)) / 2.0f) + 0.0f;
        } else {
            max = Math.max(width - f4, Math.min(0.0f - f3, f));
        }
        float height = (float) getHeight();
        RectF rectF2 = this.A0I;
        float f6 = rectF2.top;
        float f7 = rectF2.bottom;
        float f8 = height - 0.0f;
        if (f7 - f6 < f8) {
            max2 = ((f8 - (f7 + f6)) / 2.0f) + 0.0f;
        } else {
            max2 = Math.max(height - f7, Math.min(0.0f - f6, f2));
        }
        this.A0B.postTranslate(max, max2);
        setImageMatrix(this.A0B);
        return max == f && max2 == f2;
    }

    public Bitmap getFullViewCroppedBitmap() {
        if (!this.A0T) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix(this.A0A);
        if (this.A0J != null) {
            canvas.concat(matrix);
            this.A0J.draw(canvas);
        }
        return createBitmap;
    }

    public float getMinScale() {
        return this.A04;
    }

    public Bitmap getPhoto() {
        BitmapDrawable bitmapDrawable = this.A0J;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    public float getScale() {
        return this.A00;
    }

    private int getScaledMinScalingSpan() {
        Resources resources = getContext().getResources();
        try {
            return resources.getDimensionPixelSize(resources.getIdentifier("config_minScalingSpan", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
            return (int) TypedValue.applyDimension(5, 27.0f, resources.getDisplayMetrics());
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.A0V || !this.A0Y) {
            return false;
        }
        if (!this.A0U) {
            float f = this.A00;
            float f2 = this.A04;
            if (f == f2) {
                f2 *= 2.0f;
            }
            float min = Math.min(this.A03, Math.max(f2, f2));
            RunnableC50282Uc r4 = this.A0P;
            if (r4 != null) {
                if (min == f2) {
                    r4.A00(f, min, (float) (getWidth() >> 1), (float) (getHeight() >> 1), 200);
                } else {
                    r4.A00(f, min, motionEvent.getX(), motionEvent.getY(), 200);
                }
            }
        }
        this.A0U = false;
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0Y) {
            return true;
        }
        RunnableEBaseShape0S0120102_I1 runnableEBaseShape0S0120102_I1 = this.A0S;
        if (runnableEBaseShape0S0120102_I1 != null) {
            runnableEBaseShape0S0120102_I1.A04 = false;
            runnableEBaseShape0S0120102_I1.A05 = true;
        }
        RunnableEBaseShape0S0120102_I1 runnableEBaseShape0S0120102_I12 = this.A0R;
        if (runnableEBaseShape0S0120102_I12 == null) {
            return true;
        }
        runnableEBaseShape0S0120102_I12.A04 = false;
        runnableEBaseShape0S0120102_I12.A05 = true;
        return true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0J != null && this.A0K != null) {
            int width = (getWidth() - this.A0K.getIntrinsicWidth()) >> 1;
            int height = (getHeight() - this.A0K.getIntrinsicHeight()) >> 1;
            Drawable drawable = this.A0K;
            drawable.setBounds(width, height, drawable.getIntrinsicWidth() + width, this.A0K.getIntrinsicHeight() + height);
            this.A0K.draw(canvas);
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        RunnableEBaseShape0S0120102_I1 runnableEBaseShape0S0120102_I1;
        if (this.A0Y && (runnableEBaseShape0S0120102_I1 = this.A0S) != null && !runnableEBaseShape0S0120102_I1.A04) {
            runnableEBaseShape0S0120102_I1.A02 = -1;
            runnableEBaseShape0S0120102_I1.A00 = f;
            runnableEBaseShape0S0120102_I1.A01 = f2;
            runnableEBaseShape0S0120102_I1.A05 = false;
            runnableEBaseShape0S0120102_I1.A04 = true;
            ((View) runnableEBaseShape0S0120102_I1.A03).post(runnableEBaseShape0S0120102_I1);
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0W = true;
        Matrix matrix = this.A0A;
        if (matrix == null || matrix.equals(getImageMatrix())) {
            A08(z);
        }
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0Y) {
            this.A0X = false;
            A05(scaleGestureDetector.getScaleFactor() * this.A00, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0Y) {
            return false;
        }
        RunnableC50282Uc r1 = this.A0P;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        this.A0X = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        RunnableC50282Uc r1;
        if (this.A0Y && this.A0X) {
            this.A0U = true;
            A02();
        }
        float f = this.A00;
        float f2 = this.A04;
        if (f < f2 && (r1 = this.A0P) != null) {
            r1.A00(f, f2, (float) (getWidth() >> 1), (float) (getHeight() >> 1), 100);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A0Y) {
            return true;
        }
        A0B(-f, -f2);
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A0M != null && !this.A0X && this.A0V) {
            A04(motionEvent.getX(), motionEvent.getY());
        }
        this.A0X = false;
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.A0L == null || this.A0N == null)) {
            if (!isEnabled()) {
                return false;
            }
            this.A0L.onTouchEvent(motionEvent);
            this.A0N.A00.AL5(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return true;
                }
            } else if (this.A0M != null && !this.A0X && pointerCount == 1 && !this.A0V) {
                this.A0E.set(motionEvent.getX(), motionEvent.getY());
                post(this.A0Z);
            }
            RunnableEBaseShape0S0120102_I1 runnableEBaseShape0S0120102_I1 = this.A0S;
            if (runnableEBaseShape0S0120102_I1 != null && !runnableEBaseShape0S0120102_I1.A04) {
                A09(false);
            }
        }
        return true;
    }

    public void setAllowFullViewCrop(boolean z) {
        if (z != this.A0T) {
            this.A0T = z;
            requestLayout();
            invalidate();
        }
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.A0V = z;
    }

    public void setInitialFitTolerance(float f) {
        this.A01 = f;
    }

    public void setInitialScaleType(int i) {
        this.A09 = i;
    }

    public void setIsLongpressEnabled(boolean z) {
        this.A0N.A00.AOQ(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0M = onClickListener;
    }

    public void setOverlay(Drawable drawable) {
        this.A0K = drawable;
    }

    public void setUnderscaleAmount(float f) {
        this.A08 = f;
    }
}
