package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Zx  reason: invalid class name and case insensitive filesystem */
public class C29661Zx extends AbstractC15200nf {
    public static final Parcelable.Creator CREATOR = new C13500kL();
    public boolean A00;

    public C29661Zx(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public C29661Zx(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SearchView.SavedState{");
        A0S.append(Integer.toHexString(System.identityHashCode(this)));
        A0S.append(" isIconified=");
        A0S.append(this.A00);
        A0S.append("}");
        return A0S.toString();
    }
}
