package X;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Cy  reason: invalid class name and case insensitive filesystem */
public class C68373Cy {
    public ContentValues A00 = new ContentValues();
    public String A01 = "";
    public String A02 = "";
    public List A03 = new ArrayList();
    public Set A04 = new HashSet();
    public Set A05 = new HashSet();
    public byte[] A06;

    public boolean equals(Object obj) {
        if (!(obj instanceof C68373Cy)) {
            return false;
        }
        C68373Cy r5 = (C68373Cy) obj;
        String str = this.A01;
        if (str == null || !str.equals(r5.A01) || !this.A00.equals(r5.A00) || !this.A04.equals(r5.A04) || !this.A05.equals(r5.A05)) {
            return false;
        }
        byte[] bArr = this.A06;
        if (bArr != null && Arrays.equals(bArr, r5.A06)) {
            return true;
        }
        if (!this.A02.equals(r5.A02)) {
            return false;
        }
        if (this.A03.equals(r5.A03) || this.A03.size() == 1 || r5.A03.size() == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("propName: ");
        A0S.append(this.A01);
        A0S.append(", paramMap: ");
        A0S.append(this.A00.toString());
        A0S.append(", propmMap_TYPE: ");
        A0S.append(this.A04.toString());
        A0S.append(", propGroupSet: ");
        A0S.append(this.A05.toString());
        List list = this.A03;
        if (list != null && list.size() > 1) {
            A0S.append(", propValue_vector size: ");
            A0S.append(this.A03.size());
        }
        byte[] bArr = this.A06;
        if (bArr != null) {
            A0S.append(", propValue_bytes size: ");
            A0S.append(bArr.length);
        }
        A0S.append(", propValue: ");
        A0S.append(this.A02);
        return A0S.toString();
    }
}
