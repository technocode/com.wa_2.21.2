package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.2Fm  reason: invalid class name and case insensitive filesystem */
public class C46902Fm extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C46892Fl();
    public final String A00;
    public final String A01;

    public C46902Fm(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C46902Fm(Parcelable parcelable, String str, String str2) {
        super(parcelable);
        this.A00 = str;
        this.A01 = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
