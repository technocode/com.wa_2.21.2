package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Er  reason: invalid class name */
public final class AnonymousClass1Er implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new AnonymousClass1Et(readStrongBinder);
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1Et[i];
    }
}
