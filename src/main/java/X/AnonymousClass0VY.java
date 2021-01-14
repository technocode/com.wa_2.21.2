package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0VY  reason: invalid class name */
public class AnonymousClass0VY implements TypeEvaluator {
    public AnonymousClass0VJ[] A00;

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        AnonymousClass0VJ[] r11 = (AnonymousClass0VJ[]) obj;
        AnonymousClass0VJ[] r12 = (AnonymousClass0VJ[]) obj2;
        if (AnonymousClass0N2.A1o(r11, r12)) {
            AnonymousClass0VJ[] r8 = this.A00;
            if (!AnonymousClass0N2.A1o(r8, r11)) {
                r8 = AnonymousClass0N2.A1r(r11);
                this.A00 = r8;
            }
            for (int i = 0; i < r11.length; i++) {
                AnonymousClass0VJ r6 = r8[i];
                AnonymousClass0VJ r5 = r11[i];
                AnonymousClass0VJ r4 = r12[i];
                if (r6 != null) {
                    r6.A00 = r5.A00;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = r5.A01;
                        if (i2 >= fArr.length) {
                            break;
                        }
                        r6.A01[i2] = (r4.A01[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                } else {
                    throw null;
                }
            }
            return r8;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
