package X;

import android.content.res.TypedArray;

/* renamed from: X.11M  reason: invalid class name */
public abstract class AnonymousClass11M {
    public final AnonymousClass11N A00 = new AnonymousClass11N();

    public AnonymousClass11M A00(TypedArray typedArray) {
        if (typedArray.hasValue(3)) {
            AnonymousClass11N r1 = this.A00;
            r1.A0H = typedArray.getBoolean(3, r1.A0H);
        }
        if (typedArray.hasValue(0)) {
            AnonymousClass11N r12 = this.A00;
            r12.A0G = typedArray.getBoolean(0, r12.A0G);
        }
        if (typedArray.hasValue(1)) {
            AnonymousClass11N r2 = this.A00;
            r2.A05 = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (r2.A05 & 16777215);
        }
        if (typedArray.hasValue(11)) {
            AnonymousClass11N r22 = this.A00;
            r22.A09 = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & r22.A09);
        }
        if (typedArray.hasValue(7)) {
            AnonymousClass11N r4 = this.A00;
            long j = (long) typedArray.getInt(7, (int) r4.A0D);
            if (j >= 0) {
                r4.A0D = j;
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0I("Given a negative duration: ", j));
            }
        }
        if (typedArray.hasValue(14)) {
            AnonymousClass11N r13 = this.A00;
            r13.A0A = typedArray.getInt(14, r13.A0A);
        }
        if (typedArray.hasValue(15)) {
            AnonymousClass11N r42 = this.A00;
            long j2 = (long) typedArray.getInt(15, (int) r42.A0E);
            if (j2 >= 0) {
                r42.A0E = j2;
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0I("Given a negative repeat delay: ", j2));
            }
        }
        if (typedArray.hasValue(16)) {
            AnonymousClass11N r14 = this.A00;
            r14.A0B = typedArray.getInt(16, r14.A0B);
        }
        if (typedArray.hasValue(5)) {
            AnonymousClass11N r23 = this.A00;
            int i = typedArray.getInt(5, r23.A06);
            if (i == 1) {
                r23.A06 = 1;
            } else if (i == 2) {
                r23.A06 = 2;
            } else if (i != 3) {
                r23.A06 = 0;
            } else {
                r23.A06 = 3;
            }
        }
        if (typedArray.hasValue(17)) {
            AnonymousClass11N r15 = this.A00;
            if (typedArray.getInt(17, r15.A0C) != 1) {
                r15.A0C = 0;
            } else {
                r15.A0C = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            AnonymousClass11N r16 = this.A00;
            float f = typedArray.getFloat(6, r16.A00);
            if (f >= 0.0f) {
                r16.A00 = f;
            } else {
                StringBuilder sb = new StringBuilder("Given invalid dropoff value: ");
                sb.append(f);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (typedArray.hasValue(9)) {
            AnonymousClass11N r24 = this.A00;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, r24.A08);
            if (dimensionPixelSize >= 0) {
                r24.A08 = dimensionPixelSize;
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0F("Given invalid width: ", dimensionPixelSize));
            }
        }
        if (typedArray.hasValue(8)) {
            AnonymousClass11N r25 = this.A00;
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, r25.A07);
            if (dimensionPixelSize2 >= 0) {
                r25.A07 = dimensionPixelSize2;
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0F("Given invalid height: ", dimensionPixelSize2));
            }
        }
        if (typedArray.hasValue(13)) {
            AnonymousClass11N r17 = this.A00;
            float f2 = typedArray.getFloat(13, r17.A02);
            if (f2 >= 0.0f) {
                r17.A02 = f2;
            } else {
                StringBuilder sb2 = new StringBuilder("Given invalid intensity value: ");
                sb2.append(f2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        if (typedArray.hasValue(19)) {
            AnonymousClass11N r18 = this.A00;
            float f3 = typedArray.getFloat(19, r18.A04);
            if (f3 >= 0.0f) {
                r18.A04 = f3;
            } else {
                StringBuilder sb3 = new StringBuilder("Given invalid width ratio: ");
                sb3.append(f3);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        if (typedArray.hasValue(10)) {
            AnonymousClass11N r19 = this.A00;
            float f4 = typedArray.getFloat(10, r19.A01);
            if (f4 >= 0.0f) {
                r19.A01 = f4;
            } else {
                StringBuilder sb4 = new StringBuilder("Given invalid height ratio: ");
                sb4.append(f4);
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        if (typedArray.hasValue(18)) {
            AnonymousClass11N r110 = this.A00;
            r110.A03 = typedArray.getFloat(18, r110.A03);
        }
        return this;
    }

    public AnonymousClass11N A01() {
        AnonymousClass11N r3 = this.A00;
        int i = r3.A0C;
        if (i != 1) {
            int[] iArr = r3.A0J;
            int i2 = r3.A05;
            iArr[0] = i2;
            int i3 = r3.A09;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int[] iArr2 = r3.A0J;
            int i4 = r3.A09;
            iArr2[0] = i4;
            iArr2[1] = i4;
            int i5 = r3.A05;
            iArr2[2] = i5;
            iArr2[3] = i5;
        }
        float[] fArr = r3.A0I;
        if (i != 1) {
            float f = r3.A02;
            float f2 = 1.0f - f;
            float f3 = r3.A00;
            fArr[0] = Math.max((f2 - f3) / 2.0f, 0.0f);
            fArr[1] = Math.max((f2 - 0.001f) / 2.0f, 0.0f);
            float f4 = f + 1.0f;
            fArr[2] = Math.min((f4 + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min((f4 + f3) / 2.0f, 1.0f);
            return r3;
        }
        fArr[0] = 0.0f;
        float f5 = r3.A02;
        fArr[1] = Math.min(f5, 1.0f);
        fArr[2] = Math.min(f5 + r3.A00, 1.0f);
        fArr[3] = 1.0f;
        return r3;
    }
}
