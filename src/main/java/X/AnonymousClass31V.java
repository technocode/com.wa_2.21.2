package X;

import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.31V  reason: invalid class name */
public class AnonymousClass31V {
    public final Drawable A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass31V(Drawable drawable) {
        this.A02 = "DOWNLOADED";
        this.A00 = drawable;
        this.A01 = 0;
        this.A03 = true;
    }

    public AnonymousClass31V(String str, Drawable drawable, Integer num, boolean z) {
        this.A02 = str;
        this.A00 = drawable;
        this.A01 = num;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass31V r5 = (AnonymousClass31V) obj;
        if (!this.A02.equals(r5.A02) || this.A00 != r5.A00 || !C006803i.A0q(this.A01, r5.A01) || this.A03 != r5.A03) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A01, Boolean.valueOf(this.A03)});
    }
}
