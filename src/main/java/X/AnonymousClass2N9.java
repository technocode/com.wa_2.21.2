package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2N9  reason: invalid class name */
public class AnonymousClass2N9 {
    public float A00;
    public int A01 = 0;
    public int A02 = 0;
    public long A03;
    public Canvas A04;
    public List A05 = new ArrayList();
    public float[] A06 = new float[4];
    public final float A07;
    public final float A08;
    public final long A09;
    public final Paint A0A;
    public final AnonymousClass2N7 A0B;
    public final AnonymousClass2N8 A0C;
    public final List A0D = new ArrayList();
    public final List A0E = new ArrayList();

    public AnonymousClass2N9(PointF pointF, long j, Bitmap bitmap, PointF pointF2, int i, Paint paint, float f, float f2) {
        this.A09 = j;
        AnonymousClass2N8 r0 = new AnonymousClass2N8(pointF, j);
        this.A0C = r0;
        this.A0B = r0.A02.A03;
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            float f3 = (float) i;
            canvas.scale(f3, f3);
            if (pointF2 != null) {
                canvas.translate(-pointF2.x, -pointF2.y);
            }
            this.A04 = canvas;
        }
        this.A07 = f;
        this.A0A = paint;
        this.A03 = j;
        this.A08 = f2;
        this.A00 = A00(i);
        A04(pointF, j);
    }

    public final float A00(int i) {
        float f = (this.A07 * 0.03f) - 0.125f;
        if (f < 0.125f) {
            f = 0.125f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        return (f * this.A08) / ((float) i);
    }

    public final void A01() {
        AnonymousClass2N7 r4 = this.A0B;
        float f = this.A00;
        r4.A04 = f;
        int floor = ((int) Math.floor((double) (r4.A03 / f))) + 1;
        while (true) {
            int i = this.A01;
            if (i < floor) {
                float[] fArr = this.A06;
                float f2 = ((float) i) * r4.A04;
                if (f2 < r4.A01 || f2 > r4.A00) {
                    Map.Entry floorEntry = r4.A08.floorEntry(Float.valueOf(f2));
                    if (floorEntry == null) {
                        r4.A06 = null;
                        r4.A01 = 1.0f;
                        r4.A00 = 0.0f;
                    } else {
                        r4.A06 = (AnonymousClass2N6) floorEntry.getValue();
                        float floatValue = ((Number) floorEntry.getKey()).floatValue();
                        r4.A01 = floatValue;
                        r4.A00 = r4.A06.A00() + floatValue;
                    }
                }
                AnonymousClass2N6 r1 = r4.A06;
                if (r1 != null) {
                    r1.A01((f2 - r4.A01) / r1.A00(), fArr);
                } else {
                    r4.A07.A01(1.0f, fArr);
                }
                List list = this.A05;
                float[] fArr2 = new float[3];
                float[] fArr3 = this.A06;
                fArr2[0] = fArr3[0];
                fArr2[1] = fArr3[1];
                PointF pointF = new PointF(fArr3[2], fArr3[3]);
                float f3 = this.A07;
                float f4 = pointF.x;
                float f5 = pointF.y;
                double sqrt = Math.sqrt((double) ((f5 * f5) + (f4 * f4)));
                float f6 = AnonymousClass2NB.A00;
                float sqrt2 = (((float) Math.sqrt(sqrt)) - 0.0f) / ((0.4f * f3) - 0.0f);
                if (sqrt2 < 0.0f) {
                    sqrt2 = 0.0f;
                } else if (sqrt2 > 1.0f) {
                    sqrt2 = 1.0f;
                }
                fArr2[2] = (1.0f - (f6 * ((3.0f - (sqrt2 * 2.0f)) * (sqrt2 * sqrt2)))) * f3;
                list.add(fArr2);
                this.A01++;
            } else {
                return;
            }
        }
    }

    public final void A02(Canvas canvas, int i) {
        if (canvas != null) {
            AnonymousClass2N7 r0 = this.A0B;
            float f = this.A00;
            r0.A04 = f;
            int floor = ((int) Math.floor((double) (r0.A03 / f))) + 1;
            this.A02 = i;
            while (i < floor) {
                float[] fArr = (float[]) this.A05.get(i);
                Paint paint = this.A0A;
                paint.setStrokeWidth(fArr[2]);
                canvas.drawPoint(fArr[0], fArr[1], paint);
                i = this.A02 + 1;
                this.A02 = i;
            }
        }
    }

    public void A03(PointF pointF, long j) {
        long max = Math.max(j, this.A03 + 1);
        this.A0D.add(pointF);
        this.A0E.add(Long.valueOf(max - this.A09));
        AnonymousClass2N8 r6 = this.A0C;
        PointF pointF2 = r6.A04;
        pointF2.set(pointF);
        while (((double) r6.A01) + 3.0d < ((double) max)) {
            r6.A00();
        }
        AnonymousClass2NA r5 = r6.A05;
        float A002 = r5.A00(pointF2);
        AnonymousClass2NA r3 = new AnonymousClass2NA();
        float f = A002;
        while (A002 > 0.0f && f > 0.0f) {
            r3.set(r5);
            r6.A00();
            f = r5.A00(r3);
            A002 -= f;
        }
        AnonymousClass2N5 r4 = r6.A02;
        long j2 = r4.A02;
        AnonymousClass2NA r1 = r4.A00;
        if (r1 != r4.A01) {
            r4.A00(r1, j2);
            r4.A01 = r4.A00;
        }
        A01();
        Canvas canvas = this.A04;
        if (canvas != null) {
            A02(canvas, this.A02);
        }
    }

    public void A04(PointF pointF, long j) {
        if (this.A03 <= j) {
            this.A0D.add(pointF);
            this.A0E.add(Long.valueOf(j - this.A09));
            AnonymousClass2N8 r5 = this.A0C;
            r5.A04.set(pointF);
            while (((double) r5.A01) + 3.0d < ((double) j)) {
                r5.A00();
            }
            A01();
            Canvas canvas = this.A04;
            if (canvas != null) {
                A02(canvas, this.A02);
            }
        }
    }
}
