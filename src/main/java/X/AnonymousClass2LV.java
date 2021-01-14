package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2LV  reason: invalid class name */
public final class AnonymousClass2LV implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AnonymousClass1VM A01 = AnonymousClass1VM.A01(readInt, readString, C05870Qv.A00(readString2), parcel.readString(), parcel.readString());
        if (A01 instanceof C43761yu) {
            ((C43761yu) A01).A01 = parcel.readInt();
        }
        C05900Qy A00 = C05900Qy.A00(parcel.readString(), parcel.readInt());
        int readInt2 = parcel.readInt();
        if (A00 == null) {
            return null;
        }
        return new AnonymousClass2LW(A01, A00, readInt2);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass2LW[i];
    }
}
