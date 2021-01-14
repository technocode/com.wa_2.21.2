package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spanned;

/* renamed from: X.0Nt  reason: invalid class name and case insensitive filesystem */
public class C05240Nt {
    public float A00 = 1.0f;
    public final Context A01;
    public final Paint A02;

    public C05240Nt(Context context, Paint paint) {
        this.A01 = context;
        this.A02 = paint;
    }

    public C05240Nt(Context context, Paint paint, float f) {
        this.A01 = context;
        this.A02 = paint;
        this.A00 = f;
    }

    public static void A00(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spanned) {
            Paint.FontMetricsInt A002 = C05250Nu.A00(paint);
            int textSize = (int) ((paint.getTextSize() * 1.1f) + 0.5f);
            C05260Nv[] r3 = (C05260Nv[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), C05260Nv.class);
            if (r3 != null) {
                for (C05260Nv r0 : r3) {
                    r0.A00 = A002;
                    r0.A03().setBounds(0, 0, textSize, textSize);
                }
            }
        }
    }
}
