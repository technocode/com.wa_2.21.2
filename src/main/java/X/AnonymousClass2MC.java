package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.2MC  reason: invalid class name */
public class AnonymousClass2MC extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2MB();
    public final float A00;
    public final int A01;

    public AnonymousClass2MC(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
    }

    public AnonymousClass2MC(Parcelable parcelable, int i, float f) {
        super(parcelable);
        this.A01 = i;
        this.A00 = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }
}
