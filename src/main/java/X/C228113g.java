package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.13g  reason: invalid class name and case insensitive filesystem */
public final class C228113g implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C227913e();
    public final AbstractC228013f[] A00;

    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: X.13f[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C228113g(Parcel parcel) {
        this.A00 = new AbstractC228013f[parcel.readInt()];
        int i = 0;
        while (true) {
            AbstractC228013f[] r1 = this.A00;
            if (i < r1.length) {
                r1[i] = parcel.readParcelable(AbstractC228013f.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public C228113g(List list) {
        AbstractC228013f[] r0 = new AbstractC228013f[list.size()];
        this.A00 = r0;
        list.toArray(r0);
    }

    public C228113g(AbstractC228013f... r1) {
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C228113g.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A00, ((C228113g) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AbstractC228013f[] r4 = this.A00;
        int length = r4.length;
        parcel.writeInt(length);
        for (AbstractC228013f r0 : r4) {
            parcel.writeParcelable(r0, 0);
        }
    }
}
