package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.2MI  reason: invalid class name */
public class AnonymousClass2MI extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2MH();
    public final float A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass2MI(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() != 1 ? false : true;
        this.A00 = parcel.readFloat();
    }

    public AnonymousClass2MI(Parcelable parcelable, String str, String str2, boolean z, float f) {
        super(parcelable);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeFloat(this.A00);
    }
}
