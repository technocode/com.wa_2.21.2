package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2tZ  reason: invalid class name and case insensitive filesystem */
public final class C61682tZ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        AnonymousClass3Y2 r2 = new AnonymousClass3Y2();
        r2.A02 = UserJid.getNullable(parcel.readString());
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        r2.A04 = z;
        ((AnonymousClass0RK) r2).A00 = parcel.readInt();
        r2.A03 = parcel.readString();
        return r2;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass3Y2[i];
    }
}
