package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2uA  reason: invalid class name and case insensitive filesystem */
public final class C62052uA implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            boolean z = true;
            if (parcel.readByte() != 1) {
                z = false;
            }
            return new AnonymousClass3F5(readString, z);
        }
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass3F5[i];
    }
}
