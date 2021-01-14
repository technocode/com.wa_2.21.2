package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: X.1aM  reason: invalid class name and case insensitive filesystem */
public class C29881aM extends AbstractC15200nf {
    public static final Parcelable.Creator CREATOR = new C14290lt();
    public SparseArray A00;

    public C29881aM(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        SparseArray sparseArray = new SparseArray(readInt);
        this.A00 = sparseArray;
        for (int i = 0; i < readInt; i++) {
            sparseArray.append(iArr[i], readParcelableArray[i]);
        }
    }

    public C29881aM(Parcelable parcelable) {
        super(parcelable);
    }
}
