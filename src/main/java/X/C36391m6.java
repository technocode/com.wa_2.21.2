package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1m6  reason: invalid class name and case insensitive filesystem */
public final class C36391m6 extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CH();
    public byte[] A00;
    public final Uri A01;
    public final Map A02;

    public C36391m6(Uri uri, Bundle bundle, byte[] bArr) {
        this.A01 = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getParcelable(str));
        }
        this.A02 = hashMap;
        this.A00 = bArr;
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.A00;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String valueOf2 = String.valueOf(valueOf);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 8);
        sb2.append(",dataSz=");
        sb2.append(valueOf2);
        sb.append(sb2.toString());
        Map map = this.A02;
        int size = map.size();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append(", numAssets=");
        sb3.append(size);
        sb.append(sb3.toString());
        String valueOf3 = String.valueOf(this.A01);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 6);
        sb4.append(", uri=");
        sb4.append(valueOf3);
        sb.append(sb4.toString());
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : map.keySet()) {
            String valueOf4 = String.valueOf(map.get(str));
            sb.append(AnonymousClass008.A09(valueOf4.length() + AnonymousClass008.A00(str, 7), "\n    ", str, ": ", valueOf4));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0z(parcel, 2, this.A01, i, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry entry : this.A02.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((AnonymousClass1C7) entry.getValue()));
        }
        C008805h.A0x(parcel, 4, bundle);
        C008805h.A14(parcel, 5, this.A00, false);
        C008805h.A0r(parcel, A03);
    }
}
