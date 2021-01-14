package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.08Z  reason: invalid class name */
public final class AnonymousClass08Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new UserJid(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new UserJid[i];
    }
}
