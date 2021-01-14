package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.0QI  reason: invalid class name */
public final class AnonymousClass0QI implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new DeviceJid(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new DeviceJid[i];
    }
}
