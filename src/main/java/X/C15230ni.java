package X;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: X.0ni  reason: invalid class name and case insensitive filesystem */
public class C15230ni implements Comparator {
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();
    public final AbstractC15210ng A02;
    public final boolean A03;

    public C15230ni(boolean z, AbstractC15210ng r3) {
        this.A03 = z;
        this.A02 = r3;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Rect rect = this.A00;
        Rect rect2 = this.A01;
        ((C07890a3) obj).A02.getBoundsInParent(rect);
        ((C07890a3) obj2).A02.getBoundsInParent(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            if (this.A03) {
                return 1;
            }
            return -1;
        } else if (i3 <= i4) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                if (this.A03) {
                    return 1;
                }
                return -1;
            } else if (i7 <= i8) {
                return 0;
            } else {
                if (!this.A03) {
                    return 1;
                }
                return -1;
            }
        } else if (!this.A03) {
            return 1;
        } else {
            return -1;
        }
    }
}
