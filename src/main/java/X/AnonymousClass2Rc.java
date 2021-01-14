package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Rc  reason: invalid class name */
public final class AnonymousClass2Rc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AnonymousClass0OP(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass0OP[i];
    }
}
