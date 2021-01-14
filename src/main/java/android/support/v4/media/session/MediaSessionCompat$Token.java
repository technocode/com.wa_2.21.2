package android.support.v4.media.session;

import X.C12670ic;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12670ic();
    public final Object A00;

    public int describeContents() {
        return 0;
    }

    public MediaSessionCompat$Token(Object obj) {
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = this.A00;
        Object obj3 = ((MediaSessionCompat$Token) obj).A00;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
            return true;
        } else if (obj3 == null) {
            return false;
        } else {
            return obj2.equals(obj3);
        }
    }

    public int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            parcel.writeParcelable((Parcelable) this.A00, i);
        } else {
            parcel.writeStrongBinder((IBinder) this.A00);
        }
    }
}
