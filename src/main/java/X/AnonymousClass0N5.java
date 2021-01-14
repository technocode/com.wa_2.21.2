package X;

import android.util.Base64;
import java.util.List;

/* renamed from: X.0N5  reason: invalid class name */
public final class AnonymousClass0N5 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public AnonymousClass0N5(String str, String str2, String str3, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        if (list != null) {
            this.A04 = list;
            StringBuilder sb = new StringBuilder(str);
            sb.append("-");
            sb.append(str2);
            sb.append("-");
            sb.append(str3);
            this.A00 = sb.toString();
            return;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder A0S = AnonymousClass008.A0S("FontRequest {mProviderAuthority: ");
        A0S.append(this.A01);
        A0S.append(", mProviderPackage: ");
        A0S.append(this.A02);
        A0S.append(", mQuery: ");
        A0S.append(this.A03);
        A0S.append(", mCertificates:");
        sb.append(A0S.toString());
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i++;
            } else {
                sb.append("}");
                StringBuilder sb2 = new StringBuilder("mCertificatesArray: ");
                sb2.append(0);
                sb.append(sb2.toString());
                return sb.toString();
            }
        }
    }
}
