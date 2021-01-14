package X;

import android.content.res.TypedArray;

/* renamed from: X.1hC  reason: invalid class name and case insensitive filesystem */
public class C33691hC extends AnonymousClass11M {
    public C33691hC() {
        this.A00.A0F = false;
    }

    @Override // X.AnonymousClass11M
    public AnonymousClass11M A00(TypedArray typedArray) {
        super.A00(typedArray);
        if (typedArray.hasValue(2)) {
            AnonymousClass11N r3 = this.A00;
            r3.A05 = (typedArray.getColor(2, r3.A05) & 16777215) | (r3.A05 & -16777216);
        }
        if (typedArray.hasValue(12)) {
            AnonymousClass11N r1 = this.A00;
            r1.A09 = typedArray.getColor(12, r1.A09);
        }
        return this;
    }
}
