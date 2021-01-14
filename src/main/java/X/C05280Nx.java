package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* renamed from: X.0Nx  reason: invalid class name and case insensitive filesystem */
public final class C05280Nx {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static boolean A00(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("󟿽");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, length) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        ThreadLocal threadLocal = A00;
        AnonymousClass02R r3 = (AnonymousClass02R) threadLocal.get();
        if (r3 == null) {
            r3 = new AnonymousClass02R(new Rect(), new Rect());
            threadLocal.set(r3);
        } else {
            ((Rect) r3.A00).setEmpty();
            ((Rect) r3.A01).setEmpty();
        }
        Rect rect = (Rect) r3.A00;
        paint.getTextBounds("󟿽", 0, 2, rect);
        Object obj = r3.A01;
        paint.getTextBounds(str, 0, length, (Rect) obj);
        return !rect.equals(obj);
    }
}
