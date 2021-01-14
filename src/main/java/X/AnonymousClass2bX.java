package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.2bX  reason: invalid class name */
public class AnonymousClass2bX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2LT();
    public final int A00;
    public final AbstractC05890Qx A01;
    public final C05900Qy A02;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass2bX(long j, int i, AbstractC05890Qx r9) {
        AnonymousClass00E.A09(j >= 0, "value must be a number greater or equal to zero");
        if (1 != 0) {
            this.A00 = i;
            this.A01 = r9;
            this.A02 = new C05900Qy(new BigDecimal(((double) j) / ((double) i)), r9.A5z());
            return;
        }
        throw new IllegalArgumentException("offset must be a number greater or equal to zero");
    }

    public AnonymousClass2bX(Parcel parcel) {
        this.A02 = (C05900Qy) parcel.readParcelable(C05900Qy.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A01 = (AbstractC05890Qx) parcel.readSerializable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass2bX.class != obj.getClass()) {
            return false;
        }
        AnonymousClass2bX r5 = (AnonymousClass2bX) obj;
        if (this.A00 != r5.A00 || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A02.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("PaymentMoney{amount=");
        A0S.append(this.A02);
        A0S.append(", offset=");
        A0S.append(this.A00);
        A0S.append(", currency=");
        A0S.append(this.A01.A5e());
        A0S.append('}');
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, 1);
        parcel.writeInt(this.A00);
        parcel.writeSerializable(this.A01);
    }
}
