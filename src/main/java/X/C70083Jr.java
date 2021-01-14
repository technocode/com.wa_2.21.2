package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3Jr  reason: invalid class name and case insensitive filesystem */
public class C70083Jr extends AnonymousClass1XX {
    public static final Parcelable.Creator CREATOR = new C64162xj();
    public long A00;
    public long A01;
    public DeviceJid A02;
    public String A03;

    public C70083Jr(AnonymousClass1XX r1, DeviceJid deviceJid, String str, long j, long j2) {
        super(r1);
        this.A02 = deviceJid;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    public C70083Jr(Parcel parcel) {
        super(parcel);
        this.A02 = (DeviceJid) parcel.readParcelable(DeviceJid.class.getClassLoader());
        String readString = parcel.readString();
        if (readString != null) {
            this.A03 = readString;
            this.A00 = parcel.readLong();
            this.A01 = parcel.readLong();
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass1XX
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }
}
