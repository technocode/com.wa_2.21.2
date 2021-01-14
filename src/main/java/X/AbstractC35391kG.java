package X;

import android.os.Parcelable;

/* renamed from: X.1kG  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC35391kG extends AbstractC239018a implements Parcelable {
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        AbstractC239018a r7 = (AbstractC239018a) obj;
        for (C35381kF r2 : A03().values()) {
            if (A04(r2)) {
                if (!r7.A04(r2) || !A02(r2).equals(r7.A02(r2))) {
                    return false;
                }
            } else if (r7.A04(r2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (C35381kF r2 : A03().values()) {
            if (A04(r2)) {
                i = A02(r2).hashCode() + (i * 31);
            }
        }
        return i;
    }
}
