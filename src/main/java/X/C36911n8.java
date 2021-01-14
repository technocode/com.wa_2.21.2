package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1n8  reason: invalid class name and case insensitive filesystem */
public class C36911n8 extends AbstractC15200nf {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1Dx();
    public final AnonymousClass05W A00;

    public C36911n8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.A00 = new AnonymousClass05W(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A00.put(strArr[i], bundleArr[i]);
        }
    }

    public C36911n8(Parcelable parcelable) {
        super(parcelable);
        this.A00 = new AnonymousClass05W();
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ExtendableSavedState{");
        A0S.append(Integer.toHexString(System.identityHashCode(this)));
        A0S.append(" states=");
        A0S.append(this.A00);
        A0S.append("}");
        return A0S.toString();
    }
}
