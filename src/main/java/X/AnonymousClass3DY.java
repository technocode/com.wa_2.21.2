package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.3DY  reason: invalid class name */
public final class AnonymousClass3DY extends AnonymousClass0RL {
    public static final HashSet A01 = new HashSet(Arrays.asList("vpa", "keys", "vpaName", "balance", "usableBalance", "updatedSenderVpa"));
    public static final Parcelable.Creator CREATOR = new C60912sC();
    public Bundle A00;

    public int describeContents() {
        return 0;
    }

    @Override // X.AnonymousClass0RL
    public void A02(String str) {
        throw new UnsupportedOperationException("PAY: IndiaUpiPaymentData does not support fromDBString");
    }

    public String A03() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("providerType");
        }
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.A00.keySet()) {
            if (!A01.contains(str)) {
                StringBuilder A0Y = AnonymousClass008.A0Y(str, "=");
                A0Y.append(this.A00.get(str));
                arrayList.add(A0Y.toString());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("=SCRUBBED");
                arrayList.add(sb.toString());
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S(" [ bundle: {");
        A0S.append(TextUtils.join(", ", arrayList));
        A0S.append("}]");
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }
}
