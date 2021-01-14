package androidx.core.graphics.drawable;

import X.AbstractC17470rb;
import X.C30931cE;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(AbstractC17470rb r8) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.A02 = r8.A00(iconCompat.A02, 1);
        byte[] bArr = iconCompat.A08;
        if (r8.A09(2)) {
            Parcel parcel = ((C30931cE) r8).A05;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                bArr = new byte[readInt];
                parcel.readByteArray(bArr);
            }
        }
        iconCompat.A08 = bArr;
        iconCompat.A05 = r8.A01(iconCompat.A05, 3);
        iconCompat.A00 = r8.A00(iconCompat.A00, 4);
        iconCompat.A01 = r8.A00(iconCompat.A01, 5);
        iconCompat.A03 = (ColorStateList) r8.A01(iconCompat.A03, 6);
        String str = iconCompat.A07;
        if (r8.A09(7)) {
            str = ((C30931cE) r8).A05.readString();
        }
        iconCompat.A07 = str;
        iconCompat.A04 = PorterDuff.Mode.valueOf(str);
        int i = iconCompat.A02;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        iconCompat.A06 = iconCompat.A08;
                        return iconCompat;
                    } else if (i != 4) {
                        if (i != 5) {
                            return iconCompat;
                        }
                    }
                }
                iconCompat.A06 = new String(iconCompat.A08, Charset.forName("UTF-16"));
                return iconCompat;
            }
            Parcelable parcelable = iconCompat.A05;
            if (parcelable != null) {
                iconCompat.A06 = parcelable;
                return iconCompat;
            }
            byte[] bArr2 = iconCompat.A08;
            iconCompat.A06 = bArr2;
            iconCompat.A02 = 3;
            iconCompat.A00 = 0;
            iconCompat.A01 = bArr2.length;
            return iconCompat;
        }
        Parcelable parcelable2 = iconCompat.A05;
        if (parcelable2 != null) {
            iconCompat.A06 = parcelable2;
            return iconCompat;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 5) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void write(androidx.core.graphics.drawable.IconCompat r9, X.AbstractC17470rb r10) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.write(androidx.core.graphics.drawable.IconCompat, X.0rb):void");
    }
}
