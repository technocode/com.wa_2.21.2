package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0vJ  reason: invalid class name and case insensitive filesystem */
public final class C19610vJ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C07040Vr(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C07040Vr[i];
    }
}
