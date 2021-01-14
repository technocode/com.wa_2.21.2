package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0VW  reason: invalid class name */
public class AnonymousClass0VW implements TypeEvaluator {
    public static final AnonymousClass0VW A00 = new AnonymousClass0VW();

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        float f2 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Number) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float pow5 = (float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d);
        float pow6 = ((((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d)) - pow3) * f) + pow3;
        return Integer.valueOf(Math.round(((float) Math.pow((double) pow6, 0.45454545454545453d)) * 255.0f) | (Math.round(((float) Math.pow((double) (((pow4 - pow) * f) + pow), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((((((float) ((intValue2 >> 24) & 255)) / 255.0f) - f2) * f) + f2) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (((pow5 - pow2) * f) + pow2), 0.45454545454545453d)) * 255.0f) << 8));
    }
}
