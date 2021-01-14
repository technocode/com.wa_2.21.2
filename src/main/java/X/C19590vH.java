package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0vH  reason: invalid class name and case insensitive filesystem */
public final class C19590vH {
    public static float A00 = 1.0f;
    public static long A01;
    public static Context A02;
    public static final float A03 = (((float) Math.sqrt(3.0d)) / 2.0f);
    public static final HashMap A04 = new HashMap(16);

    public static C19570vF A00(Bitmap bitmap) {
        return new C19570vF(bitmap.copy(bitmap.getConfig(), false));
    }

    public static C19570vF A01(String str, AbstractC19580vG r10) {
        C19570vF r5;
        HashMap hashMap = A04;
        Reference reference = (Reference) hashMap.get(str);
        if (reference == null || (r5 = (C19570vF) reference.get()) == null) {
            Bitmap A3E = r10.A3E();
            if (A3E == null) {
                return null;
            }
            r5 = new C19570vF(A3E);
            hashMap.put(str, new WeakReference(r5));
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = A01;
        if (j >= 600000 || j == 0) {
            A01 = uptimeMillis;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Reference) ((Map.Entry) it.next()).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        return r5;
    }

    public static void A02(Canvas canvas, Paint paint, float f, float f2, float f3) {
        Path path = new Path();
        float f4 = 2.0f * f3;
        float f5 = f2 - f4;
        path.moveTo(f, f5);
        path.arcTo(new RectF(f - f3, f5 - f3, f + f3, f5 + f3), 30.0f, -240.0f, true);
        path.lineTo(f, f4 + f5);
        path.lineTo((A03 * f3) + f, (f3 * 0.5f) + f5);
        path.close();
        canvas.drawPath(path, paint);
    }
}
