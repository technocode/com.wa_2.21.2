package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0o2  reason: invalid class name and case insensitive filesystem */
public class C15410o2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C15400o1();
    public final Bundle A00;

    public int describeContents() {
        return 0;
    }

    public C15410o2(Bundle bundle) {
        this.A00 = bundle;
    }

    public C15410o2(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.A00 = readBundle;
        if (classLoader != null && readBundle != null) {
            readBundle.setClassLoader(classLoader);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }
}
