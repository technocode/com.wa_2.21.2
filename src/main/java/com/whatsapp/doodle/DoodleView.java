package com.whatsapp.doodle;

import X.AbstractC000400g;
import X.AbstractC48582Mw;
import X.AnonymousClass01X;
import X.AnonymousClass0D1;
import X.AnonymousClass2M1;
import X.AnonymousClass2MG;
import X.AnonymousClass2MI;
import X.AnonymousClass2MJ;
import X.AnonymousClass2MN;
import X.AnonymousClass2MZ;
import X.AnonymousClass2Mt;
import X.AnonymousClass2N9;
import X.AnonymousClass2c8;
import X.AnonymousClass2c9;
import X.C000300f;
import X.C002701k;
import X.C02590Cr;
import X.C48392Ma;
import X.C48572Mv;
import X.C48592Mx;
import X.C53182cf;
import X.C53232ck;
import X.C53252cm;
import X.C53272co;
import X.C59452nh;
import X.C60482pY;
import X.C60492pZ;
import X.C60502pa;
import X.GestureDetector$OnGestureListenerC52962c7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public class DoodleView extends View implements AnonymousClass2MJ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public ValueAnimator A0D;
    public Bitmap A0E;
    public Bitmap A0F;
    public Bitmap A0G;
    public Bitmap A0H;
    public Matrix A0I;
    public Matrix A0J;
    public Rect A0K;
    public RectF A0L;
    public RectF A0M;
    public AnonymousClass2MG A0N;
    public AnonymousClass2MN A0O;
    public GestureDetector$OnGestureListenerC52962c7 A0P;
    public C48572Mv A0Q;
    public AbstractC48582Mw A0R;
    public AbstractC48582Mw A0S;
    public AbstractC48582Mw A0T;
    public C48592Mx A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final Matrix A0b;
    public final Paint A0c;
    public final Paint A0d;
    public final PointF A0e;
    public final RectF A0f;
    public final RectF A0g;
    public final Handler A0h;
    public final C000300f A0i;
    public final AnonymousClass01X A0j;
    public final C02590Cr A0k;
    public final C002701k A0l;
    public final AnonymousClass0D1 A0m;
    public final Runnable A0n;
    public final float[] A0o;

    public DoodleView(Context context) {
        super(context);
        this.A0l = C002701k.A00();
        this.A0k = C02590Cr.A00();
        this.A0i = C000300f.A00();
        this.A0j = AnonymousClass01X.A00();
        this.A0m = AnonymousClass0D1.A00();
        this.A0U = new C48592Mx();
        this.A0Y = true;
        this.A0Z = false;
        this.A0a = false;
        this.A0W = true;
        this.A0e = new PointF();
        this.A09 = 1;
        this.A0h = new Handler();
        this.A0n = new RunnableEBaseShape9S0100000_I1_4(this, 30);
        this.A0f = new RectF();
        this.A04 = 1.0f;
        this.A0I = new Matrix();
        this.A0o = new float[2];
        this.A0g = new RectF();
        this.A0b = new Matrix();
        this.A0d = new Paint(1);
        this.A0c = new Paint(1);
        this.A0J = new Matrix();
        A08();
    }

    public DoodleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0l = C002701k.A00();
        this.A0k = C02590Cr.A00();
        this.A0i = C000300f.A00();
        this.A0j = AnonymousClass01X.A00();
        this.A0m = AnonymousClass0D1.A00();
        this.A0U = new C48592Mx();
        this.A0Y = true;
        this.A0Z = false;
        this.A0a = false;
        this.A0W = true;
        this.A0e = new PointF();
        this.A09 = 1;
        this.A0h = new Handler();
        this.A0n = new RunnableEBaseShape9S0100000_I1_4(this, 30);
        this.A0f = new RectF();
        this.A04 = 1.0f;
        this.A0I = new Matrix();
        this.A0o = new float[2];
        this.A0g = new RectF();
        this.A0b = new Matrix();
        this.A0d = new Paint(1);
        this.A0c = new Paint(1);
        this.A0J = new Matrix();
        A08();
    }

    public static Bitmap A00(Bitmap bitmap, int i, int i2) {
        if (bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        try {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e) {
            Log.i("oom trying to create bitmap cache", e);
            return null;
        } catch (NullPointerException e2) {
            Log.i("NPE trying to create bitmap cache", e2);
            return null;
        }
    }

    public static boolean A01(List list, Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC48582Mw r1 = (AbstractC48582Mw) it.next();
            if ((r1 instanceof C53182cf) && ((C53182cf) r1).A09) {
                return true;
            }
        }
        return false;
    }

    public PointF A02(float f, float f2) {
        Matrix matrix = this.A0b;
        matrix.reset();
        matrix.preRotate((float) (-this.A0A));
        int i = this.A0A;
        if (i == 90) {
            matrix.preTranslate((float) (-getDisplayWidth()), 0.0f);
        } else if (i == 180) {
            matrix.preTranslate((float) (-getDisplayWidth()), (float) (-getDisplayHeight()));
        } else if (i == 270) {
            matrix.preTranslate(0.0f, (float) (-getDisplayHeight()));
        } else if (i != 0) {
            throw new IllegalArgumentException();
        }
        Rect rect = this.A0K;
        if (rect != null) {
            Rect rect2 = this.A0K;
            f = ((f * ((float) rect.width())) / ((float) getWidth())) + ((float) rect2.left);
            f2 = ((f2 * ((float) rect2.height())) / ((float) getHeight())) + ((float) this.A0K.top);
        }
        float[] fArr = this.A0o;
        RectF rectF = this.A0f;
        fArr[0] = f - rectF.left;
        fArr[1] = f2 - rectF.top;
        matrix.mapPoints(fArr);
        RectF rectF2 = this.A0M;
        float f3 = rectF2.left;
        RectF rectF3 = this.A0L;
        float f4 = fArr[0];
        float f5 = this.A00;
        return new PointF((f4 / f5) + (f3 - rectF3.left), (fArr[1] / f5) + (rectF2.top - rectF3.top));
    }

    public PointF A03(PointF pointF) {
        float[] fArr = this.A0o;
        float f = pointF.x;
        RectF rectF = this.A0M;
        float f2 = rectF.left;
        RectF rectF2 = this.A0L;
        float f3 = this.A00;
        fArr[0] = (f - (f2 - rectF2.left)) * f3;
        fArr[1] = (pointF.y - (rectF.top - rectF2.top)) * f3;
        Matrix matrix = this.A0b;
        matrix.reset();
        int i = this.A0A;
        if (i == 90) {
            matrix.preTranslate((float) getDisplayWidth(), 0.0f);
        } else if (i == 180) {
            matrix.preTranslate((float) getDisplayWidth(), (float) getDisplayHeight());
        } else if (i == 270) {
            matrix.preTranslate(0.0f, (float) getDisplayHeight());
        } else if (i != 0) {
            throw new IllegalArgumentException();
        }
        matrix.preRotate((float) this.A0A);
        matrix.mapPoints(fArr);
        float f4 = fArr[0];
        float f5 = fArr[1];
        RectF rectF3 = this.A0f;
        float f6 = f4 + rectF3.left;
        float f7 = f5 + rectF3.top;
        Rect rect = this.A0K;
        if (rect != null) {
            f6 = ((f6 - ((float) rect.left)) * ((float) getWidth())) / ((float) this.A0K.width());
            f7 = ((f7 - ((float) this.A0K.top)) * ((float) getHeight())) / ((float) this.A0K.height());
        }
        return new PointF(f6, f7);
    }

    public AbstractC48582Mw A04(MotionEvent motionEvent) {
        if (!A0G() || motionEvent.getPointerCount() != 1) {
            return null;
        }
        return this.A0U.A00(A02(motionEvent.getX(), motionEvent.getY()));
    }

    public AbstractC48582Mw A05(MotionEvent motionEvent) {
        if (!A0G() || motionEvent.getPointerCount() != 2) {
            return null;
        }
        PointF A022 = A02(motionEvent.getX(0), motionEvent.getY(0));
        PointF A023 = A02(motionEvent.getX(1), motionEvent.getY(1));
        C48592Mx r4 = this.A0U;
        AbstractC48582Mw A002 = r4.A00(A022);
        if (A002 != null) {
            return A002;
        }
        AbstractC48582Mw A003 = r4.A00(A023);
        return A003 == null ? r4.A00(new PointF((A022.x + A023.x) / 2.0f, (A022.y + A023.y) / 2.0f)) : A003;
    }

    public void A06() {
        if (this.A0M != null) {
            Matrix matrix = new Matrix();
            this.A0I = matrix;
            matrix.preRotate((float) this.A0A);
            int i = this.A0A;
            if (i == 90) {
                this.A0I.preTranslate(0.0f, -this.A0M.height());
            } else if (i == 180) {
                this.A0I.preTranslate(-this.A0M.width(), -this.A0M.height());
            } else if (i == 270) {
                this.A0I.preTranslate(-this.A0M.width(), 0.0f);
            } else if (i != 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    public void A07() {
        this.A0V = true;
        this.A0C = SystemClock.elapsedRealtime();
        invalidate();
    }

    public final void A08() {
        this.A0B = -65536;
        this.A02 = 8.0f;
        this.A03 = 8.0f;
        this.A0P = new GestureDetector$OnGestureListenerC52962c7(this);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 || (i >= 23 && this.A0i.A0D(AbstractC000400g.A2I))) {
            setLayerType(2, null);
        }
    }

    public final void A09() {
        Bitmap bitmap = this.A0E;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        C48592Mx r0 = this.A0U;
        if (r0 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : r0.A01) {
                if (obj instanceof C53182cf) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                A0H(true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C53182cf r7 = (C53182cf) it.next();
                    Bitmap bitmap2 = this.A0E;
                    PointF pointF = this.A0e;
                    int i = this.A09;
                    r7.A02 = bitmap2;
                    r7.A03 = pointF;
                    r7.A01 = i;
                    r7.A05 = false;
                    if (bitmap2 != null && r7.A09) {
                        AnonymousClass2N9 r3 = r7.A04;
                        if (r3 != null) {
                            Canvas canvas = new Canvas(bitmap2);
                            float f = (float) i;
                            canvas.scale(f, f);
                            if (pointF != null) {
                                canvas.translate(-pointF.x, -pointF.y);
                            }
                            r3.A04 = canvas;
                            r3.A00 = r3.A00(i);
                            r3.A01 = 0;
                            r3.A05.clear();
                            r3.A01();
                            AnonymousClass2N9 r1 = r7.A04;
                            Canvas canvas2 = r1.A04;
                            if (canvas2 != null) {
                                r1.A02(canvas2, 0);
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                return;
            }
            return;
        }
        throw null;
    }

    public final void A0A() {
        if (this.A0M != null) {
            RectF rectF = new RectF();
            RectF rectF2 = this.A0M;
            int width = getWidth();
            int height = getHeight();
            float width2 = rectF2.width() / rectF2.height();
            float f = (float) width;
            float f2 = (float) height;
            if (width2 > f / f2) {
                f2 = f / width2;
            } else {
                f = f2 * width2;
            }
            float f3 = (float) (width / 2);
            float f4 = (float) (height / 2);
            float f5 = f / 2.0f;
            float f6 = f2 / 2.0f;
            this.A0J.mapRect(rectF, new RectF(f3 - f5, f4 - f6, f3 + f5, f4 + f6));
            rectF.intersect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()));
            AnonymousClass2MN r2 = this.A0O;
            if (r2.A01.A0D(AbstractC000400g.A2Q) || r2.A05.A0E(278)) {
                RectF rectF3 = r2.A00;
                if (rectF3 == null || !rectF3.equals(rectF)) {
                    r2.A00 = rectF;
                    C48392Ma r1 = r2.A03;
                    r1.A02.set(rectF);
                    for (AnonymousClass2MZ r0 : r1.A05.values()) {
                        View view = r0.A06;
                        if (view != null) {
                            r0.A07.removeView(view);
                        }
                    }
                    r1.A05.clear();
                    Map map = r1.A05;
                    Handler handler = r1.A09;
                    ViewGroup viewGroup = r1.A0A;
                    map.put(1, new AnonymousClass2c8(1, handler, viewGroup, r1.A02, r1.A03));
                    r1.A05.put(2, new AnonymousClass2c8(2, handler, viewGroup, r1.A02, r1.A03));
                    r1.A05.put(3, new AnonymousClass2c9(handler, viewGroup, r1.A02, r1.A03));
                }
            }
        }
    }

    public final void A0B(float f, float f2) {
        AbstractC48582Mw r3;
        boolean z;
        this.A0S = null;
        this.A0Q = null;
        AnonymousClass2MG r1 = this.A0N;
        if ((r1 == null || !r1.AK4(this.A0R, f, f2)) && (r3 = this.A0R) != null) {
            if (r3 instanceof C59452nh) {
                C59452nh r32 = (C59452nh) r3;
                r32.A0M.A00(r32.A0L, this);
                z = true;
            } else if (r3 instanceof C60492pZ) {
                C60492pZ r33 = (C60492pZ) r3;
                r33.A0G.A00(r33.A0F, this);
                z = true;
            } else if (!(r3 instanceof C60482pY)) {
                z = false;
            } else {
                C60482pY r34 = (C60482pY) r3;
                r34.A0E.A00(r34.A0D, this);
                z = true;
            }
            if (z) {
                invalidate();
            }
        }
    }

    public void A0C(float f, int i) {
        AbstractC48582Mw r2 = this.A0R;
        if (!(r2 == null || r2 == this.A0S || (!r2.A0C() && !r2.A0B()))) {
            this.A0Q = r2.A01();
            r2 = this.A0R;
            this.A0S = r2;
        }
        this.A03 = f;
        float f2 = this.A01;
        if (f2 == 0.0f) {
            this.A02 = f;
        } else {
            this.A02 = f / f2;
        }
        this.A0B = i;
        if (!this.A0Y && r2 != null) {
            if (r2.A0C() || r2.A0B()) {
                if (r2.A0B()) {
                    r2.A08(i);
                }
                AbstractC48582Mw r1 = this.A0R;
                if (r1.A0C()) {
                    r1.A06(this.A02);
                }
                AbstractC48582Mw r3 = this.A0R;
                if (r3 instanceof C53232ck) {
                    C53232ck r32 = (C53232ck) r3;
                    float f3 = AbstractC48582Mw.A09;
                    float f4 = AbstractC48582Mw.A06;
                    float f5 = (f3 - f4) / 4.0f;
                    if (f < f4 + f5) {
                        r32.A0I(0);
                    } else if (f < (2.0f * f5) + f4) {
                        r32.A0I(1);
                    } else if (f < (f5 * 3.0f) + f4) {
                        r32.A0I(2);
                    } else {
                        r32.A0I(3);
                    }
                }
                invalidate();
            }
        }
    }

    public void A0D(AbstractC48582Mw r13) {
        boolean z;
        float f;
        float f2;
        int i;
        float width = this.A0M.width();
        float height = this.A0M.height();
        if (!(r13 instanceof C59452nh)) {
            z = r13 instanceof C60482pY;
        } else {
            z = true;
        }
        if (z && !this.A0U.A01()) {
            this.A0h.postDelayed(this.A0n, 1000);
        }
        if (r13 instanceof C60502pa) {
            f = width / 3.0f;
            f2 = height / 3.0f;
        } else {
            f = width / 2.0f;
            f2 = height / 2.0f;
        }
        PointF centerPoint = getCenterPoint();
        RectF rectF = this.A0M;
        float f3 = centerPoint.x;
        float f4 = f / 2.0f;
        float f5 = centerPoint.y;
        float f6 = f2 / 2.0f;
        r13.A0E(rectF, f3 - f4, f5 - f6, f3 + f4, f5 + f6);
        if (r13.A0B()) {
            if (!(r13 instanceof C60502pa)) {
                i = 1;
            } else {
                i = ((C60502pa) r13).A01;
            }
            if (i == 1) {
                r13.A08(this.A0B);
            }
        }
        if (r13.A0C()) {
            r13.A06(AbstractC48582Mw.A06 / this.A01);
        }
        float f7 = 1.0f / this.A04;
        if (r13 instanceof C59452nh) {
            C59452nh r0 = (C59452nh) r13;
            r0.A07(f7, 2);
            r0.A0N.A00(f7);
        } else if (r13 instanceof C60492pZ) {
            C60492pZ r02 = (C60492pZ) r13;
            r02.A07(f7, 2);
            r02.A0H.A00(f7);
        } else if (!(r13 instanceof C60482pY)) {
            r13.A07(f7, 2);
        } else {
            C60482pY r03 = (C60482pY) r13;
            r03.A07(f7, 2);
            r03.A0F.A00(f7);
        }
        r13.A00 += (float) (-this.A0A);
        for (AbstractC48582Mw r04 : this.A0U.A01) {
            r04.A04();
        }
        this.A0U.A01.add(r13);
        this.A0U.A00.A00.add(new C53252cm(r13));
        invalidate();
        this.A0R = r13;
        this.A0S = null;
        this.A0Q = null;
        this.A0Y = false;
        AnonymousClass2MG r05 = this.A0N;
        if (r05 != null) {
            r05.AK6(r13);
            this.A0Z = false;
        }
    }

    public void A0E(AbstractC48582Mw r4) {
        C48592Mx r2 = this.A0U;
        r2.A00.A00.add(new C53272co(r4, r2.A01.indexOf(r4)));
        this.A0U.A01.remove(r4);
        if (r4 == this.A0R) {
            this.A0R = null;
        }
        this.A0X = false;
        invalidate();
    }

    public void A0F(String str, int i, int i2) {
        C53232ck r4 = new C53232ck(getContext(), this.A0k, this.A0j);
        ((AbstractC48582Mw) r4).A03.setColor(i);
        r4.A0J(str, i2);
        ((AbstractC48582Mw) r4).A00 += (float) (-this.A0A);
        float width = this.A0M.width();
        PointF centerPoint = getCenterPoint();
        RectF rectF = this.A0M;
        float f = centerPoint.x;
        float f2 = ((width * 7.0f) / 8.0f) / 2.0f;
        float f3 = centerPoint.y;
        float height = (this.A0M.height() / 10.0f) / 2.0f;
        r4.A0E(rectF, f - f2, f3 - height, f2 + f, f3 + height);
        r4.A07(1.0f / this.A04, 2);
        this.A0U.A01.add(r4);
        this.A0U.A00.A00.add(new C53252cm(r4));
        invalidate();
        this.A0R = r4;
        this.A0S = null;
        this.A0Q = null;
        this.A0Y = false;
        AnonymousClass2MG r0 = this.A0N;
        if (r0 != null) {
            r0.AK6(r4);
            this.A0Z = false;
        }
    }

    public boolean A0G() {
        return (this.A0L == null || this.A0M == null) ? false : true;
    }

    public final boolean A0H(boolean z) {
        if (this.A0M == null) {
            return false;
        }
        if (this.A0E == null && !z) {
            return false;
        }
        int scaleForPenCache = getScaleForPenCache();
        Bitmap bitmap = this.A0E;
        if (bitmap != null && bitmap.getHeight() == ((int) (this.A0M.height() * ((float) this.A09)))) {
            int width = this.A0E.getWidth();
            float width2 = this.A0M.width();
            int i = this.A09;
            if (width == ((int) (width2 * ((float) i)))) {
                PointF pointF = this.A0e;
                float f = pointF.x;
                RectF rectF = this.A0M;
                if (f == ((float) ((int) rectF.left)) && pointF.y == ((float) ((int) rectF.top)) && scaleForPenCache == i) {
                    return false;
                }
            }
        }
        this.A09 = scaleForPenCache;
        this.A0E = A00(this.A0E, (int) (this.A0M.width() * ((float) this.A09)), (int) (this.A0M.height() * ((float) this.A09)));
        PointF pointF2 = this.A0e;
        RectF rectF2 = this.A0M;
        pointF2.set((float) ((int) rectF2.left), (float) ((int) rectF2.top));
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0136, code lost:
        if (r14.A0c.getAlpha() < 255) goto L_0x0138;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r15) {
        /*
        // Method dump skipped, instructions count: 546
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.doodle.DoodleView.draw(android.graphics.Canvas):void");
    }

    public RectF getBitmapRect() {
        return this.A0L;
    }

    private PointF getCenterPoint() {
        if (this.A0K != null) {
            return A02(getX() + ((float) (getWidth() >> 1)), getY() + ((float) (getHeight() >> 1)));
        }
        return new PointF(this.A0M.centerX(), this.A0M.centerY());
    }

    public AbstractC48582Mw getCurrentShape() {
        return this.A0R;
    }

    private int getDisplayHeight() {
        return (int) this.A0f.height();
    }

    private int getDisplayWidth() {
        return (int) this.A0f.width();
    }

    public AnonymousClass2Mt getDoodle() {
        return new AnonymousClass2Mt(this.A0L, this.A0M, this.A0A, this.A0U.A02);
    }

    public float getRotate() {
        return (float) this.A0A;
    }

    private int getScaleForPenCache() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return Math.max(1, (int) Math.min(((float) displayMetrics.widthPixels) / this.A0M.width(), ((float) displayMetrics.heightPixels) / this.A0M.height()));
    }

    public float getStrokeScale() {
        return this.A01;
    }

    public float getZoomScale() {
        return this.A04;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0U.A01()) {
            this.A0h.postDelayed(this.A0n, 1000);
        }
    }

    public void onDetachedFromWindow() {
        this.A0h.removeCallbacks(this.A0n);
        super.onDetachedFromWindow();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RectF rectF = this.A0M;
        if (rectF != null) {
            RectF rectF2 = this.A0g;
            rectF2.set(rectF);
            this.A0I.mapRect(rectF2);
            float measuredWidth = (float) getMeasuredWidth();
            float measuredHeight = (float) getMeasuredHeight();
            float width = rectF2.width() / rectF2.height();
            if ((1.0f * measuredWidth) / measuredHeight < width) {
                measuredHeight = measuredWidth / width;
            } else {
                measuredWidth = measuredHeight * width;
            }
            this.A00 = measuredWidth / rectF2.width();
            if (this.A01 == 0.0f || !(!this.A0U.A01.isEmpty())) {
                float f = this.A00;
                this.A01 = f;
                this.A02 = this.A03 / f;
            }
            this.A0f.set((((float) getMeasuredWidth()) - measuredWidth) / 2.0f, (((float) getMeasuredHeight()) - measuredHeight) / 2.0f, (((float) getMeasuredWidth()) + measuredWidth) / 2.0f, (((float) getMeasuredHeight()) + measuredHeight) / 2.0f);
            if (A0H(false)) {
                A09();
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass2MI r11 = (AnonymousClass2MI) parcelable;
        String str = r11.A01;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass2Mt r2 = new AnonymousClass2Mt();
            try {
                r2.A08(str, getContext(), this.A0k, this.A0i, this.A0l, this.A0j, this.A0m);
                this.A0L = r2.A02;
                this.A0M = r2.A01;
                this.A0A = r2.A00;
                C48592Mx r1 = this.A0U;
                r1.A01.clear();
                r1.A00.A00.clear();
                C48592Mx r0 = this.A0U;
                r0.A01.addAll(r2.A04);
                A09();
            } catch (JSONException e) {
                Log.e("error loading shapes", e);
            }
            C48592Mx r02 = this.A0U;
            String str2 = r11.A02;
            if (r02 == null) {
                throw null;
            } else if (str2 != null) {
                try {
                    r02.A00.A02(str2, r02.A01);
                } catch (JSONException e2) {
                    Log.e("ShapeRepository/loadUndoState", e2);
                }
            }
        }
        this.A0Y = r11.A03;
        this.A03 = r11.A00;
        A06();
        requestLayout();
        this.A0X = false;
        invalidate();
        super.onRestoreInstanceState(r11.getSuperState());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[SYNTHETIC, Splitter:B:11:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r10 = this;
            android.os.Parcelable r5 = super.onSaveInstanceState()
            android.graphics.RectF r4 = r10.A0L
            r7 = 0
            if (r4 == 0) goto L_0x0023
            android.graphics.RectF r3 = r10.A0M
            if (r3 == 0) goto L_0x0023
            int r2 = r10.A0A     // Catch:{ JSONException -> 0x001d }
            X.2Mx r0 = r10.A0U     // Catch:{ JSONException -> 0x001d }
            java.util.List r1 = r0.A02     // Catch:{ JSONException -> 0x001d }
            X.2Mt r0 = new X.2Mt     // Catch:{ JSONException -> 0x001d }
            r0.<init>(r4, r3, r2, r1)     // Catch:{ JSONException -> 0x001d }
            java.lang.String r6 = r0.A01()     // Catch:{ JSONException -> 0x001d }
            goto L_0x0024
        L_0x001d:
            r1 = move-exception
            java.lang.String r0 = "error saving doodle"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0023:
            r6 = r7
        L_0x0024:
            X.2Mx r0 = r10.A0U
            if (r0 == 0) goto L_0x0041
            X.2N4 r1 = r0.A00     // Catch:{ JSONException -> 0x0031 }
            java.util.List r0 = r0.A01     // Catch:{ JSONException -> 0x0031 }
            java.lang.String r7 = r1.A01(r0)     // Catch:{ JSONException -> 0x0031 }
            goto L_0x0037
        L_0x0031:
            r1 = move-exception
            java.lang.String r0 = "ShapeRepository/getUndoJson"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0037:
            boolean r8 = r10.A0Y
            float r9 = r10.A03
            X.2MI r4 = new X.2MI
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0041:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.doodle.DoodleView.onSaveInstanceState():android.os.Parcelable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024f, code lost:
        if (r8.getStrokeWidth() == r9.A01) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        if (r1 != 6) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r9 != 6) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0384  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
        // Method dump skipped, instructions count: 902
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.doodle.DoodleView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBitmapRect(RectF rectF) {
        this.A0L = rectF;
        this.A01 = 0.0f;
    }

    public void setBlurBackground(Bitmap bitmap) {
        this.A0F = bitmap;
        ValueAnimator valueAnimator = this.A0D;
        if (valueAnimator == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
            this.A0D = ofInt;
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            this.A0D.setDuration(300L);
            this.A0D.addUpdateListener(new AnonymousClass2M1(this));
        } else {
            valueAnimator.cancel();
        }
        this.A0D.start();
    }

    public void setCropRect(RectF rectF) {
        this.A0M = rectF;
        A09();
        A06();
        requestLayout();
        this.A0X = false;
        invalidate();
    }

    public void setCurrentShape(AbstractC48582Mw r1) {
        this.A0R = r1;
    }

    public void setDisplayRect(RectF rectF) {
        this.A0f.set(rectF);
    }

    public void setDoodle(AnonymousClass2Mt r3) {
        this.A0L = r3.A02;
        this.A0M = r3.A01;
        this.A0A = r3.A00;
        C48592Mx r1 = this.A0U;
        r1.A01.clear();
        r1.A00.A00.clear();
        C48592Mx r0 = this.A0U;
        r0.A01.addAll(r3.A04);
        A09();
        A06();
        requestLayout();
        this.A0X = false;
        invalidate();
    }

    public void setEditState(String str) {
        C48592Mx r0 = this.A0U;
        if (r0 == null) {
            throw null;
        } else if (str != null) {
            try {
                r0.A00.A02(str, r0.A01);
            } catch (JSONException e) {
                Log.e("ShapeRepository/loadUndoState", e);
            }
        }
    }

    public void setIsShapeMoving(boolean z) {
        this.A0Z = z;
    }

    public void setListener(AnonymousClass2MG r1) {
        this.A0N = r1;
    }

    public void setPenMode(boolean z) {
        this.A0Y = z;
    }

    public void setRotate(int i) {
        this.A0A = i;
    }

    public void setScreenScale(float f) {
        this.A00 = f;
    }

    public void setShapeMovementController(AnonymousClass2MN r1) {
        this.A0O = r1;
    }

    public void setStrokeColor(int i) {
        this.A0B = i;
    }

    public void setZoomMatrixUpdated(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        this.A0J.setValues(fArr);
    }

    public void setZoomRect(Rect rect) {
        this.A0K = rect;
    }

    public void setZoomScale(float f) {
        this.A04 = f;
    }
}
