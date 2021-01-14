package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.search.verification.client.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0L2  reason: invalid class name */
public class AnonymousClass0L2 {
    public static volatile AnonymousClass0L2 A07;
    public final AnonymousClass01I A00;
    public final AnonymousClass0HJ A01;
    public final AnonymousClass01A A02;
    public final C014308b A03;
    public final AnonymousClass08C A04;
    public final AnonymousClass0HK A05;
    public final AnonymousClass01X A06;

    public AnonymousClass0L2(AnonymousClass01I r1, AnonymousClass0HJ r2, AnonymousClass01A r3, C014308b r4, AnonymousClass01X r5, AnonymousClass08C r6, AnonymousClass0HK r7) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r5;
        this.A04 = r6;
        this.A05 = r7;
    }

    public static Bitmap A00(List list, float f) {
        boolean z = false;
        if (list.size() > 1) {
            z = true;
        }
        AnonymousClass00E.A08(z, "Insufficient number of bitmaps to combine");
        if (list.size() == 1) {
            return (Bitmap) list.get(0);
        }
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            if (i < bitmap.getWidth()) {
                i = bitmap.getWidth();
            }
            if (i2 < bitmap.getHeight()) {
                i2 = bitmap.getHeight();
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f2 = (float) i;
        float f3 = (float) i2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        Paint paint = new Paint();
        paint.setColor(-1);
        if (f != 0.0f) {
            if (f > 0.0f) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        if (list.size() == 2) {
            Rect rect = new Rect(((int) (((double) i) * 0.25d)) + 1, 0, ((int) (0.75f * f2)) - 1, i2);
            float f4 = f2 * 0.5f;
            canvas.drawBitmap((Bitmap) list.get(0), rect, new RectF(0.0f, 0.0f, f4 - 2.0f, f3), paint);
            canvas.drawBitmap((Bitmap) list.get(1), rect, new RectF(f4 + 2.0f, 0.0f, f2, f3), paint);
        } else if (list.size() == 3) {
            int i3 = ((int) (((double) i) * 0.25d)) + 1;
            int i4 = ((int) (0.75f * f2)) - 1;
            float f5 = f2 * 0.5f;
            canvas.drawBitmap((Bitmap) list.get(0), new Rect(i3, 0, i4, i2), new RectF(0.0f, 0.0f, f5 - 2.0f, f3), paint);
            double d = (double) i2;
            Rect rect2 = new Rect(i3, ((int) (0.25d * d)) + 1, i4, ((int) (d * 0.75d)) - 1);
            float f6 = f5 + 2.0f;
            float f7 = f3 * 0.5f;
            canvas.drawBitmap((Bitmap) list.get(1), rect2, new RectF(f6, 0.0f, f2, f7 - 2.0f), paint);
            canvas.drawBitmap((Bitmap) list.get(2), rect2, new RectF(f6, f7 + 2.0f, f2, f3), paint);
            return createBitmap;
        } else if (list.size() == 4) {
            double d2 = (double) i2;
            Rect rect3 = new Rect(((int) (((double) i) * 0.25d)) + 1, ((int) (0.25d * d2)) + 1, ((int) (0.75f * f2)) - 1, ((int) (d2 * 0.75d)) - 1);
            float f8 = f2 * 0.5f;
            float f9 = f8 - 2.0f;
            float f10 = 0.5f * f3;
            float f11 = f10 - 2.0f;
            canvas.drawBitmap((Bitmap) list.get(0), rect3, new RectF(0.0f, 0.0f, f9, f11), paint);
            float f12 = f10 + 2.0f;
            canvas.drawBitmap((Bitmap) list.get(1), rect3, new RectF(0.0f, f12, f9, f3), paint);
            float f13 = f8 + 2.0f;
            canvas.drawBitmap((Bitmap) list.get(2), rect3, new RectF(f13, 0.0f, f2, f11), paint);
            canvas.drawBitmap((Bitmap) list.get(3), rect3, new RectF(f13, f12, f2, f3), paint);
            return createBitmap;
        }
        return createBitmap;
    }

    public static AnonymousClass0L2 A01() {
        if (A07 == null) {
            synchronized (AnonymousClass0L2.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass0L2(AnonymousClass01I.A00(), AnonymousClass0HJ.A02(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass08C.A00(), AnonymousClass0HK.A00());
                }
            }
        }
        return A07;
    }

    public Bitmap A02(C007003k r5, int i, int i2) {
        int min = Math.min(i, i2);
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            i3 = -1;
        }
        float f = (float) i3;
        Bitmap bitmap = (Bitmap) this.A04.A02.A02().A02(r5.A05(min, f));
        return (bitmap != null || !r5.A0R || min <= 0) ? bitmap : this.A05.A02(r5, min, f, true);
    }

    public AnonymousClass0YX A03(Context context) {
        Resources resources = context.getResources();
        return new AnonymousClass0YX(this, resources.getDimensionPixelSize(R.dimen.small_avatar_size), resources.getDimension(R.dimen.small_avatar_radius));
    }
}
