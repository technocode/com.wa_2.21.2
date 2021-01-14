package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.2PX  reason: invalid class name */
public class AnonymousClass2PX implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01 = Float.MAX_VALUE;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public Context A08;
    public Matrix A09;
    public Matrix A0A = new Matrix();
    public Matrix A0B = new Matrix();
    public PointF A0C;
    public RectF A0D;
    public RectF A0E;
    public RectF A0F;
    public ScaleGestureDetector A0G;
    public View.OnClickListener A0H;
    public View A0I;
    public C14890n3 A0J;
    public AnonymousClass2c2 A0K;
    public AnonymousClass2PU A0L;
    public AnonymousClass2PV A0M;
    public AnonymousClass2PW A0N;
    public RunnableEBaseShape0S0220102_I1 A0O;
    public RunnableEBaseShape0S0220102_I1 A0P;
    public boolean A0Q;
    public boolean A0R = true;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public final Runnable A0X;

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

    public AnonymousClass2PX(Context context, View view, AnonymousClass2c2 r8) {
        int i;
        new Paint();
        new Rect();
        this.A07 = 0.8f;
        this.A0D = new RectF();
        this.A0E = new RectF();
        this.A0F = new RectF();
        this.A0C = new PointF();
        this.A0X = new RunnableEBaseShape9S0100000_I1_4(this, 47);
        this.A08 = context;
        this.A0I = view;
        this.A0K = r8;
        this.A0J = new C14890n3(context, this);
        Resources resources = this.A08.getResources();
        try {
            i = resources.getDimensionPixelSize(resources.getIdentifier("config_minScalingSpan", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
            i = (int) TypedValue.applyDimension(5, 27.0f, resources.getDisplayMetrics());
        }
        AnonymousClass2PT r2 = new AnonymousClass2PT(this.A08, this, i);
        this.A0G = r2;
        if (Build.VERSION.SDK_INT >= 19) {
            r2.setQuickScaleEnabled(false);
        }
        View view2 = this.A0I;
        this.A0M = new AnonymousClass2PV(view2, this);
        this.A0P = new RunnableEBaseShape0S0220102_I1(view2, this, 1);
        this.A0O = new RunnableEBaseShape0S0220102_I1(view2, this, 0);
        this.A0L = new AnonymousClass2PU(view2, this);
        this.A0N = new AnonymousClass2PW(view2, this);
    }

    public final void A00(float f, float f2, float f3) {
        float min = Math.min(Math.max(f, this.A03 * 0.8f), this.A02);
        float f4 = min / this.A00;
        this.A0A.postRotate(-this.A06, (float) (this.A0I.getWidth() >> 1), (float) (this.A0I.getHeight() >> 1));
        this.A0A.postScale(f4, f4, f2, f3);
        this.A00 = min;
        this.A0A.postRotate(this.A06, (float) (this.A0I.getWidth() >> 1), (float) (this.A0I.getHeight() >> 1));
        A02(true);
        this.A0K.A00(this.A0A);
    }

    public final void A01(boolean z) {
        float min;
        if (this.A0S) {
            if (z || this.A03 == 0.0f) {
                float width = this.A0D.width();
                float height = this.A0D.height();
                float width2 = (float) ((this.A0I.getWidth() - this.A0I.getPaddingLeft()) - this.A0I.getPaddingRight());
                float height2 = (float) ((this.A0I.getHeight() - this.A0I.getPaddingTop()) - this.A0I.getPaddingBottom());
                this.A04 = 0.0f;
                this.A0A.reset();
                this.A0E.set(0.0f, 0.0f, width2, height2);
                float abs = Math.abs(this.A06 % 180.0f);
                if (abs == 90.0f) {
                    min = Math.min(width2 / height, height2 / width);
                } else {
                    min = Math.min(width2 / width, height2 / height);
                }
                this.A03 = min;
                float min2 = Math.min(min, Float.MAX_VALUE);
                this.A03 = min2;
                if (abs == 90.0f) {
                    float f = width2 / height;
                    float f2 = height2 / width;
                    if (Math.abs((f / f2) - 1.0f) < 0.0f) {
                        min2 = Math.max(f, f2);
                        this.A04 = min2;
                    }
                } else {
                    float f3 = width2 / width;
                    float f4 = height2 / height;
                    if (Math.abs((f3 / f4) - 1.0f) < 0.0f) {
                        min2 = Math.max(f3, f4);
                        this.A04 = min2;
                    }
                }
                this.A00 = Math.min(min2, Float.MAX_VALUE);
                this.A04 = Math.min(this.A04, Float.MAX_VALUE);
                this.A02 = Math.max(min2 * 8.0f, 8.0f);
                float f5 = width / 2.0f;
                float f6 = height / 2.0f;
                this.A0A.setTranslate((width2 / 2.0f) - f5, (height2 / 2.0f) - f6);
                Matrix matrix = this.A0A;
                float f7 = this.A00;
                matrix.preScale(f7, f7, f5, f6);
                this.A0A.postRotate(this.A06, (float) (this.A0I.getWidth() / 2), (float) (this.A0I.getHeight() / 2));
                this.A05 = this.A00;
                this.A0B.set(this.A0A);
            }
            Matrix matrix2 = this.A0A;
            this.A09 = matrix2;
            this.A0K.A00(matrix2);
        }
    }

    public final void A02(boolean z) {
        float f;
        this.A0F.set(this.A0D);
        this.A0A.mapRect(this.A0F);
        float width = (float) this.A0I.getWidth();
        RectF rectF = this.A0F;
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = width - 0.0f;
        if (f3 - f2 < f5) {
            f = ((f5 - (f3 + f2)) / 2.0f) + 0.0f;
        } else {
            f = f2 > 0.0f ? 0.0f - f2 : f3 < width ? width - f3 : 0.0f;
        }
        float height = (float) this.A0I.getHeight();
        RectF rectF2 = this.A0F;
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
            RunnableEBaseShape0S0220102_I1 runnableEBaseShape0S0220102_I1 = this.A0O;
            if (runnableEBaseShape0S0220102_I1 != null && !runnableEBaseShape0S0220102_I1.A05) {
                runnableEBaseShape0S0220102_I1.A02 = -1;
                runnableEBaseShape0S0220102_I1.A00 = f;
                runnableEBaseShape0S0220102_I1.A01 = f4;
                runnableEBaseShape0S0220102_I1.A06 = false;
                runnableEBaseShape0S0220102_I1.A05 = true;
                ((View) runnableEBaseShape0S0220102_I1.A04).postDelayed(runnableEBaseShape0S0220102_I1, 250);
                return;
            }
            return;
        }
        this.A0A.postTranslate(f, f4);
        this.A0K.A00(this.A0A);
    }

    public final boolean A03(float f, float f2) {
        float max;
        float max2;
        this.A0F.set(this.A0D);
        this.A0A.mapRect(this.A0F);
        float width = (float) this.A0I.getWidth();
        RectF rectF = this.A0F;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = width - 0.0f;
        if (f4 - f3 < f5) {
            max = ((f5 - (f4 + f3)) / 2.0f) + 0.0f;
        } else {
            max = Math.max(width - f4, Math.min(0.0f - f3, f));
        }
        float height = (float) this.A0I.getHeight();
        RectF rectF2 = this.A0F;
        float f6 = rectF2.top;
        float f7 = rectF2.bottom;
        float f8 = height - 0.0f;
        if (f7 - f6 < f8) {
            max2 = ((f8 - (f7 + f6)) / 2.0f) + 0.0f;
        } else {
            max2 = Math.max(height - f7, Math.min(0.0f - f6, f2));
        }
        this.A0A.postTranslate(max, max2);
        this.A0K.A00(this.A0A);
        return max == f && max2 == f2;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.A0W) {
            return false;
        }
        if (!this.A0Q) {
            float f = this.A00;
            float f2 = this.A03;
            if (f == f2) {
                f2 *= 2.0f;
            }
            float min = Math.min(this.A02, Math.max(f2, f2));
            AnonymousClass2PV r4 = this.A0M;
            if (r4 != null) {
                if (min == f2) {
                    r4.A00(f, min, (float) (this.A0I.getWidth() >> 1), (float) (this.A0I.getHeight() >> 1), 200);
                } else {
                    r4.A00(f, min, motionEvent.getX(), motionEvent.getY(), 200);
                }
            }
        }
        this.A0Q = false;
        AnonymousClass2c2 r42 = this.A0K;
        if (this.A00 != this.A03) {
            z = true;
        }
        r42.A01(z);
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0W) {
            return true;
        }
        RunnableEBaseShape0S0220102_I1 runnableEBaseShape0S0220102_I1 = this.A0P;
        if (runnableEBaseShape0S0220102_I1 != null) {
            runnableEBaseShape0S0220102_I1.A05 = false;
            runnableEBaseShape0S0220102_I1.A06 = true;
        }
        RunnableEBaseShape0S0220102_I1 runnableEBaseShape0S0220102_I12 = this.A0O;
        if (runnableEBaseShape0S0220102_I12 == null) {
            return true;
        }
        runnableEBaseShape0S0220102_I12.A05 = false;
        runnableEBaseShape0S0220102_I12.A06 = true;
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        RunnableEBaseShape0S0220102_I1 runnableEBaseShape0S0220102_I1;
        if (this.A0W && (runnableEBaseShape0S0220102_I1 = this.A0P) != null && !runnableEBaseShape0S0220102_I1.A05) {
            runnableEBaseShape0S0220102_I1.A02 = -1;
            runnableEBaseShape0S0220102_I1.A00 = f;
            runnableEBaseShape0S0220102_I1.A01 = f2;
            runnableEBaseShape0S0220102_I1.A06 = false;
            runnableEBaseShape0S0220102_I1.A05 = true;
            ((View) runnableEBaseShape0S0220102_I1.A04).post(runnableEBaseShape0S0220102_I1);
        }
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0W) {
            this.A0T = false;
            this.A0V = true;
            A00(scaleGestureDetector.getScaleFactor() * this.A00, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0W) {
            return false;
        }
        AnonymousClass2PV r1 = this.A0M;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        this.A0T = true;
        AnonymousClass2c2 r2 = this.A0K;
        boolean z = false;
        if (this.A00 <= this.A03) {
            z = true;
        }
        r2.A01(z);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass2PV r1;
        if (this.A0W) {
            this.A0V = false;
            if (this.A0T) {
                this.A0Q = true;
                this.A0A.set(this.A0B);
                this.A00 = this.A05;
                this.A0K.A00(this.A0A);
            }
        }
        float f = this.A00;
        float f2 = this.A03;
        if (f < f2 && (r1 = this.A0M) != null) {
            r1.A00(f, f2, (float) (this.A0I.getWidth() >> 1), (float) (this.A0I.getHeight() >> 1), 100);
        }
        AnonymousClass2c2 r2 = this.A0K;
        boolean z = false;
        if (this.A00 <= this.A03) {
            z = true;
        }
        r2.A01(z);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0W) {
            this.A0U = true;
            A03(-f, -f2);
        }
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A0H != null && !this.A0T) {
            motionEvent.getX();
            motionEvent.getY();
            View.OnClickListener onClickListener = this.A0H;
            if (onClickListener != null) {
                onClickListener.onClick(this.A0I);
            }
        }
        this.A0T = false;
        return true;
    }
}
