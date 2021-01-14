package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1eg  reason: invalid class name and case insensitive filesystem */
public final class C32311eg extends AbstractC19160uZ {
    public static final Matrix A0Y = new Matrix();
    public static final Paint A0Z = new Paint(1);
    public static final Path A0a = new Path();
    public static final C19480v6 A0b = new C19480v6();
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
    public float A0E;
    public int A0F;
    public int A0G;
    public View A0H;
    public AbstractC19220uf A0I;
    public C19570vF A0J;
    public C07040Vr A0K;
    public Object A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final float A0S;
    public final float A0T;
    public final int A0U;
    public final float[] A0V = new float[2];
    public final float[] A0W = new float[2];
    public final float[] A0X = new float[2];

    public C32311eg(C32031eE r6, C19640vM r7) {
        super(r6);
        C07040Vr r2 = r7.A02;
        this.A0K = r2;
        super.A00 = (double) C19250ui.A02(r2.A01);
        super.A01 = (double) C19250ui.A01(r2.A00);
        C19570vF r0 = r7.A01;
        this.A0J = r0 == null ? C19590vH.A01("hue_240.0", new C32291ee()) : r0;
        this.A0N = r7.A04;
        this.A0M = r7.A03;
        this.A00 = 1.0f;
        super.A04 = true;
        super.A02 = 0.0f;
        float[] fArr = this.A0V;
        float[] fArr2 = r7.A06;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        float[] fArr3 = this.A0W;
        float[] fArr4 = r7.A07;
        fArr3[0] = fArr4[0];
        fArr3[1] = fArr4[1];
        float f = super.A06;
        this.A0T = 48.0f * f;
        this.A0U = (int) (8.0f * f);
        this.A0S = f * 5.0f;
        A06();
    }

    @Override // X.AbstractC19160uZ
    public void A02(Canvas canvas) {
        long nanoTime = System.nanoTime();
        try {
            Bitmap bitmap = this.A0J.A00;
            boolean z = this.A0Q && !(this.A0N == null && this.A0M == null);
            if (A09()) {
                Paint paint = A0Z;
                paint.setAlpha((int) (this.A00 * 255.0f));
                Matrix matrix = A0Y;
                matrix.setTranslate(this.A0D - this.A04, this.A0E - this.A07);
                matrix.postRotate(this.A06, this.A0D, this.A0E);
                canvas.drawBitmap(bitmap, matrix, paint);
                paint.setAlpha(255);
                if (z) {
                    float[] fArr = this.A0X;
                    fArr[0] = this.A02;
                    fArr[1] = this.A0B;
                    matrix.mapPoints(fArr);
                    long nanoTime2 = System.nanoTime();
                    int i = this.A0G / 2;
                    if (this.A0R) {
                        Path path = A0a;
                        path.reset();
                        float f = (float) i;
                        float f2 = fArr[1] - ((float) (this.A0F * 1));
                        float f3 = this.A0S;
                        float f4 = f3 * ((float) 1);
                        path.moveTo(fArr[0] - f, f2 - f4);
                        path.lineTo(fArr[0] + f, (fArr[1] - ((float) (this.A0F * 1))) - f4);
                        path.lineTo(fArr[0] + f, fArr[1] - f4);
                        path.lineTo(fArr[0] + f3, fArr[1] - f4);
                        path.lineTo(fArr[0], fArr[1]);
                        path.lineTo(fArr[0] - f3, fArr[1] - f4);
                        path.lineTo(fArr[0] - f, fArr[1] - f4);
                        path.close();
                        paint.setColor(-16777216);
                        paint.setShadowLayer(12.0f, 0.0f, 0.0f, -16777216);
                        canvas.drawPath(path, paint);
                        int i2 = -1;
                        if (this.A0P) {
                            i2 = -2236963;
                        }
                        paint.setColor(i2);
                        canvas.drawPath(path, paint);
                    }
                    matrix.setTranslate(fArr[0] - ((float) i), (fArr[1] - ((float) this.A0F)) - this.A0S);
                    this.A0H.setDrawingCacheEnabled(true);
                    canvas.drawBitmap(this.A0H.getDrawingCache(), matrix, paint);
                    C19550vD.A0J.A03(System.nanoTime() - nanoTime2);
                }
            }
        } finally {
            C19550vD.A0M.A03(System.nanoTime() - nanoTime);
        }
    }

    public void A03() {
        if (this.A0Q && super.A03 != 1) {
            super.A03 = 1;
            AbstractC19220uf r0 = this.A0I;
            if (r0 != null) {
                r0.AA6(this);
            }
        }
        this.A0Q = false;
    }

    public void A04() {
        A05();
        if (super.A03 != 4) {
            super.A03 = 4;
            AbstractC19220uf r0 = this.A0I;
            if (r0 != null) {
                r0.AA6(this);
            }
        }
        this.A0Q = true;
    }

    public final void A05() {
        int i;
        int i2;
        View view = null;
        this.A0H = null;
        C32031eE r6 = super.A0A;
        AbstractC19080uO r0 = r6.A08;
        if (r0 != null) {
            view = r0.A6p(this);
            this.A0H = view;
            if (view != null) {
                this.A0R = false;
            } else {
                view = r0.A6n(this);
                this.A0H = view;
                this.A0R = true;
            }
        }
        if (view == null) {
            this.A0R = true;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            Context context = super.A09;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            String str = this.A0N;
            if (str == null || this.A0M == null) {
                i = this.A0U;
                i2 = i;
            } else {
                i2 = this.A0U;
                i = i2 / 3;
            }
            if (str != null) {
                TextView textView = new TextView(context);
                textView.setPadding(i2, i2, i2, i);
                textView.setText(this.A0N);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxLines(1);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setGravity(17);
                textView.setTextColor(-16777216);
                layoutParams.width = -1;
                linearLayout.addView(textView, layoutParams);
            }
            if (this.A0M != null) {
                TextView textView2 = new TextView(context);
                textView2.setPadding(i2, i, i2, i2);
                textView2.setText(this.A0M);
                textView2.setMaxLines(5);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTextColor(-12303292);
                layoutParams.gravity = 3;
                linearLayout.addView(textView2, layoutParams);
            }
            this.A0H = linearLayout;
        } else if (view.getLayoutParams() == null) {
            this.A0H.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        this.A0H.measure(View.MeasureSpec.makeMeasureSpec(r6.A0E.getWidth(), EditorInfoCompat.IME_FLAG_FORCE_ASCII), View.MeasureSpec.makeMeasureSpec(r6.A0E.getHeight(), EditorInfoCompat.IME_FLAG_FORCE_ASCII));
        this.A0G = this.A0H.getMeasuredWidth();
        int measuredHeight = this.A0H.getMeasuredHeight();
        this.A0F = measuredHeight;
        this.A0H.layout(0, 0, this.A0G, measuredHeight);
        A06();
        A00();
    }

    public final void A06() {
        Bitmap bitmap = this.A0J.A00;
        float width = (float) bitmap.getWidth();
        float[] fArr = this.A0V;
        float f = fArr[0] * width;
        this.A04 = f;
        this.A05 = width - f;
        float height = (float) bitmap.getHeight();
        float f2 = fArr[1] * height;
        this.A07 = f2;
        this.A01 = height - f2;
        float[] fArr2 = this.A0W;
        this.A02 = fArr2[0] * width;
        this.A0B = fArr2[1] * height;
        float f3 = this.A0T;
        if (width < f3) {
            this.A03 = (f3 - width) / 2.0f;
        } else {
            this.A03 = 0.0f;
        }
        if (height < f3) {
            this.A0C = (f3 - height) / 2.0f;
        } else {
            this.A0C = 0.0f;
        }
        Matrix matrix = A0Y;
        matrix.setRotate(0.0f);
        float[] fArr3 = super.A0D;
        fArr3[0] = this.A04 - this.A02;
        fArr3[1] = this.A07 - this.A0B;
        matrix.mapPoints(fArr3);
        this.A0A = ((float) this.A0F) + this.A0S + fArr3[1];
        float f4 = (float) (this.A0G >> 1);
        float f5 = fArr3[0];
        this.A08 = f4 + f5;
        this.A09 = f4 - f5;
    }

    public void A07(C19570vF r3) {
        if (r3 == null) {
            r3 = C19590vH.A01("hue_240.0", new C32291ee());
        }
        this.A0J = r3;
        A06();
        A00();
    }

    public void A08(C07040Vr r3) {
        this.A0K = r3;
        super.A00 = (double) C19250ui.A02(r3.A01);
        super.A01 = (double) C19250ui.A01(r3.A00);
        A00();
    }

    public final boolean A09() {
        boolean z;
        if (!this.A0Q || (this.A0N == null && this.A0M == null)) {
            z = false;
        } else {
            z = true;
        }
        this.A06 = 0.0f + 0.0f;
        C19480v6 r4 = A0b;
        double d = super.A00;
        C19250ui r12 = super.A0B;
        double A032 = d - r12.A03(this.A04);
        r4.A01 = A032;
        double A033 = r12.A03(this.A05) + d;
        r4.A02 = A033;
        double d2 = super.A01;
        double A034 = d2 - r12.A03(this.A07);
        r4.A03 = A034;
        r4.A00 = r12.A03(this.A01) + d2;
        if (z) {
            double A035 = d2 - r12.A03(this.A0A);
            if (A035 < A034) {
                r4.A03 = A035;
            }
            double A036 = d - r12.A03(this.A08);
            if (A036 < A032) {
                r4.A01 = A036;
            }
            double A037 = r12.A03(this.A09) + d;
            if (A033 < A037) {
                r4.A02 = A037;
            }
        }
        float[] fArr = super.A0D;
        C19480v6 r6 = super.A0C;
        r12.A0A(r6);
        if (r4.A00 < r6.A03 || r4.A03 > r6.A00) {
            return false;
        }
        fArr[0] = (float) ((int) Math.ceil(r6.A01 - r4.A02));
        float floor = (float) ((int) Math.floor(r6.A02 - r4.A01));
        fArr[1] = floor;
        float f = fArr[0];
        if (f > floor) {
            return false;
        }
        r12.A07(d + ((double) f), d2, fArr);
        this.A0D = fArr[0];
        this.A0E = fArr[1];
        return true;
    }
}
