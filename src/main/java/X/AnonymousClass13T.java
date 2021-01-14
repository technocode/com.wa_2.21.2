package X;

import android.util.Log;

/* renamed from: X.13T  reason: invalid class name */
public final class AnonymousClass13T {
    public final String A00;

    public AnonymousClass13T(String str, int i, byte[] bArr) {
        C002001d.A39((i == 0) ^ (bArr == null));
        this.A00 = str;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        return;
                    }
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        return;
                    }
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        return;
                    }
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        return;
                    }
                    break;
            }
            StringBuilder sb = new StringBuilder("Unsupported protection scheme type '");
            sb.append(str);
            sb.append("'. Assuming AES-CTR crypto mode.");
            Log.w("TrackEncryptionBox", sb.toString());
        }
    }
}
