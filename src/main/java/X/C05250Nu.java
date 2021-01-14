package X;

import android.graphics.Paint;
import android.os.Build;

/* renamed from: X.0Nu  reason: invalid class name and case insensitive filesystem */
public class C05250Nu {
    public static final AnonymousClass08V A00 = new AnonymousClass08V(50);

    public static Paint.FontMetricsInt A00(Paint paint) {
        int i = 0;
        if (Build.VERSION.SDK_INT <= 23 && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
            String str = Build.MODEL;
            if (str.startsWith("SM-G532") || str.startsWith("SM-G530")) {
                int floatToIntBits = (Float.floatToIntBits(paint.getTextSkewX()) + ((Float.floatToIntBits(paint.getTextSize()) + 31) * 31)) * 31;
                float f = 0.0f;
                if (paint.isFakeBoldText()) {
                    f = 1.0f;
                }
                int floatToIntBits2 = (Float.floatToIntBits(f) + floatToIntBits) * 31;
                if (paint.getTypeface() != null) {
                    i = paint.getTypeface().hashCode();
                }
                AnonymousClass08V r2 = A00;
                Integer valueOf = Integer.valueOf(floatToIntBits2 + i);
                Paint.FontMetricsInt fontMetricsInt = (Paint.FontMetricsInt) r2.A03(valueOf);
                if (fontMetricsInt != null) {
                    return fontMetricsInt;
                }
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                r2.A07(valueOf, fontMetricsInt2);
                return fontMetricsInt2;
            }
        }
        return paint.getFontMetricsInt();
    }
}
