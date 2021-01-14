package com.whatsapp.crop;

import X.AbstractC59392na;
import X.AnonymousClass2K7;
import X.AnonymousClass2K8;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends AbstractC59392na {
    public float A00;
    public float A01;
    public int A02;
    public AnonymousClass2K7 A03 = null;
    public boolean A04;
    public final ArrayList A05 = new ArrayList();

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC59392na
    public void A02(float f, float f2, float f3) {
        super.A02(f, f2, f3);
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            AnonymousClass2K7 r2 = (AnonymousClass2K7) it.next();
            r2.A03.set(getImageMatrix());
            r2.A04 = r2.A02();
        }
    }

    public void A05(AnonymousClass2K7 r8) {
        Rect rect = r8.A04;
        int max = Math.max(0, -rect.left);
        int min = Math.min(0, getWidth() - rect.right);
        int max2 = Math.max(0, -rect.top);
        int min2 = Math.min(0, getHeight() - rect.bottom);
        if (max == 0 && rect.width() <= getWidth()) {
            max = min;
        }
        if (max2 == 0 && rect.height() <= getHeight()) {
            max2 = min2;
        }
        if (max != 0 || max2 != 0) {
            float f = (float) max;
            float f2 = (float) max2;
            if (f != 0.0f || f2 != 0.0f) {
                A01(f, f2);
                setImageMatrix(getImageViewMatrix());
            }
        }
    }

    public final void A06(AnonymousClass2K7 r14) {
        Rect rect = r14.A04;
        float width = (float) rect.width();
        float height = (float) rect.height();
        float max = Math.max(1.0f, getScale() * Math.min((((float) getWidth()) / width) * 0.6f, (((float) getHeight()) / height) * 0.6f));
        if (((double) (Math.abs(max - getScale()) / max)) > 0.1d) {
            float[] fArr = {r14.A05.centerX(), r14.A05.centerY()};
            getImageMatrix().mapPoints(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            RunnableEBaseShape7S0200000_I1_2 runnableEBaseShape7S0200000_I1_2 = new RunnableEBaseShape7S0200000_I1_2(this, r14, 35);
            float scale = getScale();
            this.A09.post(new AnonymousClass2K8(this, System.currentTimeMillis(), scale, (max - getScale()) / 300.0f, f, f2, runnableEBaseShape7S0200000_I1_2));
        }
    }

    public void clearFocus() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A05;
            if (i < arrayList.size()) {
                AnonymousClass2K7 r1 = (AnonymousClass2K7) arrayList.get(i);
                r1.A09 = false;
                r1.A04 = r1.A02();
                i++;
            } else {
                return;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        if (!this.A04) {
            super.onDraw(canvas);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A05;
            if (i < arrayList.size()) {
                AnonymousClass2K7 r8 = (AnonymousClass2K7) arrayList.get(i);
                if (r8 != null) {
                    Path path = new Path();
                    float f = r8.A07.getResources().getDisplayMetrics().density;
                    r8.A0D.setStrokeWidth(0.5f + f);
                    Rect rect = new Rect();
                    r8.A07.getDrawingRect(rect);
                    if (r8.A08) {
                        float width = (float) r8.A04.width();
                        float height = (float) r8.A04.height();
                        Rect rect2 = r8.A04;
                        float f2 = width / 2.0f;
                        path.addCircle(((float) rect2.left) + f2, (height / 2.0f) + ((float) rect2.top), f2, Path.Direction.CW);
                        r8.A0D.setColor(-1112874);
                    } else {
                        path.addRect(new RectF(r8.A04), Path.Direction.CW);
                        r8.A0D.setColor(1728053247);
                        Rect rect3 = new Rect();
                        rect3.set(rect);
                        rect3.right = r8.A04.left;
                        if (r8.A09) {
                            paint = r8.A0B;
                        } else {
                            paint = r8.A0C;
                        }
                        canvas.drawRect(rect3, paint);
                        rect3.set(rect);
                        Rect rect4 = r8.A04;
                        rect3.right = rect4.right;
                        rect3.left = rect4.left;
                        rect3.bottom = rect4.top;
                        if (r8.A09) {
                            paint2 = r8.A0B;
                        } else {
                            paint2 = r8.A0C;
                        }
                        canvas.drawRect(rect3, paint2);
                        rect3.set(rect);
                        Rect rect5 = r8.A04;
                        rect3.right = rect5.right;
                        rect3.left = rect5.left;
                        rect3.top = rect5.bottom;
                        if (r8.A09) {
                            paint3 = r8.A0B;
                        } else {
                            paint3 = r8.A0C;
                        }
                        canvas.drawRect(rect3, paint3);
                        rect3.set(rect);
                        rect3.left = r8.A04.right;
                        if (r8.A09) {
                            paint4 = r8.A0B;
                        } else {
                            paint4 = r8.A0C;
                        }
                        canvas.drawRect(rect3, paint4);
                        int round = Math.round(f);
                        Rect rect6 = r8.A04;
                        int i2 = rect6.left + round;
                        int i3 = rect6.right - round;
                        int i4 = rect6.top;
                        int i5 = i4 + round;
                        int i6 = rect6.bottom;
                        int i7 = i6 - round;
                        float f3 = (float) i2;
                        float f4 = (float) (((i6 - i4) / 3) + i4);
                        float f5 = (float) i3;
                        Paint paint5 = r8.A0D;
                        canvas.drawLine(f3, f4, f5, f4, paint5);
                        Rect rect7 = r8.A04;
                        int i8 = rect7.bottom;
                        float f6 = (float) (i8 - ((i8 - rect7.top) / 3));
                        canvas.drawLine(f3, f6, f5, f6, paint5);
                        Rect rect8 = r8.A04;
                        int i9 = rect8.left;
                        float f7 = (float) (((rect8.right - i9) / 3) + i9);
                        float f8 = (float) i5;
                        float f9 = (float) i7;
                        canvas.drawLine(f7, f8, f7, f9, paint5);
                        Rect rect9 = r8.A04;
                        int i10 = rect9.right;
                        float f10 = (float) (i10 - ((i10 - rect9.left) / 3));
                        canvas.drawLine(f10, f8, f10, f9, paint5);
                    }
                    Paint paint6 = r8.A0D;
                    canvas.drawPath(path, paint6);
                    float f11 = 2.0f * f;
                    int round2 = Math.round(f11);
                    Rect rect10 = r8.A04;
                    int i11 = rect10.left + round2;
                    int i12 = rect10.right - round2;
                    int i13 = rect10.top + round2;
                    int i14 = rect10.bottom - round2;
                    int i15 = (int) (f * 24.0f);
                    int min = Math.min(i15, rect10.width() >> 2);
                    int min2 = Math.min(i15, r8.A04.height() >> 2);
                    Rect rect11 = r8.A04;
                    int i16 = rect11.left;
                    int i17 = ((rect11.right - i16) / 2) + i16;
                    int i18 = rect11.top;
                    int i19 = ((rect11.bottom - i18) / 2) + i18;
                    paint6.setStrokeWidth(f11);
                    paint6.setColor(-1);
                    paint6.setStrokeCap(Paint.Cap.SQUARE);
                    int i20 = min >> 1;
                    float f12 = (float) (i17 - i20);
                    float f13 = (float) i13;
                    float f14 = (float) (i17 + i20);
                    canvas.drawLine(f12, f13, f14, f13, paint6);
                    float f15 = (float) i14;
                    canvas.drawLine(f12, f15, f14, f15, paint6);
                    float f16 = (float) i11;
                    int i21 = min2 >> 1;
                    float f17 = (float) (i19 - i21);
                    float f18 = (float) (i19 + i21);
                    canvas.drawLine(f16, f17, f16, f18, paint6);
                    float f19 = (float) i12;
                    canvas.drawLine(f19, f17, f19, f18, paint6);
                    float f20 = (float) (i11 + min);
                    canvas.drawLine(f16, f13, f20, f13, paint6);
                    float f21 = (float) (i13 + min2);
                    canvas.drawLine(f16, f13, f16, f21, paint6);
                    float f22 = (float) (i12 - min);
                    canvas.drawLine(f19, f13, f22, f13, paint6);
                    canvas.drawLine(f19, f13, f19, f21, paint6);
                    canvas.drawLine(f19, f15, f22, f15, paint6);
                    float f23 = (float) (i14 - min2);
                    canvas.drawLine(f19, f15, f19, f23, paint6);
                    canvas.drawLine(f16, f15, f20, f15, paint6);
                    canvas.drawLine(f16, f15, f16, f23, paint6);
                    i++;
                } else {
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC59392na
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0A.A00 != null) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                AnonymousClass2K7 r2 = (AnonymousClass2K7) it.next();
                r2.A03.set(getImageMatrix());
                r2.A04 = r2.A02();
                if (r2.A09) {
                    A06(r2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03d1, code lost:
        if (r12[1] != 0.0f) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c4, code lost:
        if (r0 != 3) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
        // Method dump skipped, instructions count: 1180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crop.CropImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
