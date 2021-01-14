package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;

/* renamed from: X.2F1  reason: invalid class name */
public class AnonymousClass2F1 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2F0();
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SparseIntArray A05;

    public AnonymousClass2F1(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A05 = new SparseIntArray();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int i = 0;
            do {
                this.A05.put(parcel.readInt(), parcel.readInt());
                i++;
            } while (i < readInt);
        }
    }

    public AnonymousClass2F1(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size;
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        SparseIntArray sparseIntArray = this.A05;
        int i2 = 0;
        if (sparseIntArray == null) {
            size = 0;
        } else {
            size = sparseIntArray.size();
        }
        parcel.writeInt(size);
        if (size > 0) {
            do {
                parcel.writeInt(this.A05.keyAt(i2));
                parcel.writeInt(this.A05.valueAt(i2));
                i2++;
            } while (i2 < size);
        }
    }
}
