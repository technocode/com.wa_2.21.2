package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2s8  reason: invalid class name and case insensitive filesystem */
public final class C60872s8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        AnonymousClass0RM r1 = new AnonymousClass0RM();
        ((AnonymousClass0RK) r1).A02 = UserJid.getNullable(parcel.readString());
        r1.A01 = parcel.readString();
        r1.A02 = parcel.readString();
        return r1;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass0RM[i];
    }
}
