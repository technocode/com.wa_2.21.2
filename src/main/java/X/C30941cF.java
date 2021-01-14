package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1cF  reason: invalid class name and case insensitive filesystem */
public class C30941cF extends AbstractC15200nf {
    public static final Parcelable.Creator CREATOR = new C17510rf();
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public C30941cF(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C30941cF.class.getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public C30941cF(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("FragmentPager.SavedState{");
        A0S.append(Integer.toHexString(System.identityHashCode(this)));
        A0S.append(" position=");
        return AnonymousClass008.A0N(A0S, this.A00, "}");
    }
}
