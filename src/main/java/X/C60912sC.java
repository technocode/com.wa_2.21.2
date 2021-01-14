package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2sC  reason: invalid class name and case insensitive filesystem */
public final class C60912sC implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(C60912sC.class.getClassLoader());
        AnonymousClass3DY r0 = new AnonymousClass3DY();
        r0.A00 = readBundle;
        return r0;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass3DY[i];
    }
}
