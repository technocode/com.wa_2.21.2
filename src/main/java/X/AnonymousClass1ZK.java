package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.1ZK  reason: invalid class name */
public class AnonymousClass1ZK extends AbstractC12880jE {
    public int[][] A00;

    public AnonymousClass1ZK(AnonymousClass1ZK r2, AnonymousClass1ZL r3, Resources resources) {
        super(r2, r3, resources);
        if (r2 != null) {
            this.A00 = r2.A00;
        } else {
            this.A00 = new int[this.A0V.length][];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: int[][] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC12880jE
    public void A04() {
        if (!(this instanceof AnonymousClass23J)) {
            int length = this.A00.length;
            int[][] iArr = new int[length][];
            for (int i = length - 1; i >= 0; i--) {
                int[][] iArr2 = this.A00;
                iArr[i] = iArr2[i] != null ? iArr2[i].clone() : null;
            }
            this.A00 = iArr;
            return;
        }
        AnonymousClass23J r1 = (AnonymousClass23J) this;
        r1.A00 = r1.A00.clone();
        r1.A01 = r1.A01.clone();
    }

    public int A06(int[] iArr) {
        int[][] iArr2 = this.A00;
        int i = this.A0A;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    public Drawable newDrawable() {
        return new AnonymousClass1ZL(this, null);
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass1ZL(this, resources);
    }
}
