package X;

import android.os.Parcel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0RK  reason: invalid class name */
public abstract class AnonymousClass0RK extends AnonymousClass0RL {
    public int A00;
    public long A01 = -1;
    public UserJid A02;
    public String A03;
    public boolean A04;

    @Override // X.AnonymousClass0RL
    public void A02(String str) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(AnonymousClass1VY.A0D(this.A02));
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
