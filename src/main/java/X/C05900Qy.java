package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;

/* renamed from: X.0Qy  reason: invalid class name and case insensitive filesystem */
public class C05900Qy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R4();
    public final BigDecimal A00;

    public int describeContents() {
        return 0;
    }

    public C05900Qy(Parcel parcel) {
        this.A00 = (BigDecimal) parcel.readSerializable();
    }

    public C05900Qy(BigDecimal bigDecimal, int i) {
        AnonymousClass00E.A07(bigDecimal.compareTo(BigDecimal.ZERO) >= 0);
        this.A00 = bigDecimal.setScale(i, 6);
    }

    public static C05900Qy A00(String str, int i) {
        try {
            return new C05900Qy(new BigDecimal(str), i);
        } catch (NumberFormatException e) {
            Log.i("Pay: PaymentTransactionInfo.MethodInfo createFromParcel threw: ", e);
            return null;
        }
    }

    public boolean A01() {
        BigDecimal bigDecimal = this.A00;
        return bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C05900Qy.class != obj.getClass()) {
            return false;
        }
        BigDecimal bigDecimal = this.A00;
        BigDecimal bigDecimal2 = ((C05900Qy) obj).A00;
        if (bigDecimal == null) {
            if (bigDecimal2 != null) {
                return false;
            }
        } else if (bigDecimal.compareTo(bigDecimal2) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.A00;
        return 31 + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return this.A00.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
    }
}
