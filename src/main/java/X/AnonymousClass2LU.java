package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.2LU  reason: invalid class name */
public final class AnonymousClass2LU implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        boolean z;
        AnonymousClass0MH A03;
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        int readInt3 = parcel.readInt();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        UserJid nullable = UserJid.getNullable(parcel.readString());
        UserJid nullable2 = UserJid.getNullable(parcel.readString());
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        ArrayList readArrayList = parcel.readArrayList(AnonymousClass2LW.class.getClassLoader());
        UserJid nullable3 = UserJid.getNullable(parcel.readString());
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        long readLong2 = parcel.readLong();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        byte[] bArr = new byte[readInt5];
        if (readInt5 > 0) {
            parcel.readByteArray(bArr);
        }
        int readInt6 = parcel.readInt();
        AbstractC43791yx r0 = (AbstractC43791yx) parcel.readParcelable(AbstractC43791yx.class.getClassLoader());
        if (readInt == 5) {
            AnonymousClass0MH r10 = new AnonymousClass0MH(5, readLong2, readString9, readInt4);
            r10.A0N = bArr;
            r10.A0H = readString4;
            r10.A08 = nullable3;
            r10.A0M = z;
            return r10;
        }
        C05900Qy A00 = C05900Qy.A00(readString2, readInt3);
        if (readInt != 4) {
            A03 = new AnonymousClass0MH(readInt, nullable, nullable2, readString, A00, readLong2, readString3, readInt2, readLong, readString5, readString6, readString7, null, readString9, readInt4, readInt6);
            A03.A0H = readString4;
            A03.A0J = readArrayList;
            A03.A08 = nullable3;
            A03.A0M = z;
            A03.A07 = r0;
        } else {
            A03 = AnonymousClass0MH.A03(readLong2);
        }
        A03.A0I = readString8;
        return A03;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass0MH[i];
    }
}
