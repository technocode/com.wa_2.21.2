package X;

import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: X.2Le  reason: invalid class name and case insensitive filesystem */
public class C48172Le {
    public final int A00;
    public final C48192Lg A01;
    public final AnonymousClass0DM A02;
    public final C77303fw A03;
    public final String A04;
    public final byte[] A05;
    public final String[] A06;

    public String toString() {
        return "SyncMutationData";
    }

    public C48172Le(AbstractC48162Ld r2) {
        this.A00 = r2.A03;
        this.A04 = AbstractC48162Ld.A00(r2.A03());
        this.A02 = r2.A00;
        this.A06 = r2.A03();
        this.A01 = r2.A05;
        this.A03 = r2.A01();
        this.A05 = r2.A02;
    }

    public C48172Le(String str, int i, AnonymousClass0DM r5, C48192Lg r6, byte[] bArr) {
        C77303fw r0;
        this.A00 = i;
        this.A04 = str;
        this.A02 = r5;
        this.A06 = A00(str);
        this.A01 = r6;
        if (bArr != null) {
            r0 = (C77303fw) AnonymousClass078.A02(C77303fw.A0L, bArr);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        this.A05 = null;
    }

    public C48172Le(String str, int i, AnonymousClass0DM r3, String[] strArr, C48192Lg r5, C77303fw r6, byte[] bArr) {
        this.A04 = str;
        this.A00 = i;
        this.A02 = r3;
        this.A06 = strArr;
        this.A01 = r5;
        this.A03 = r6;
        this.A05 = bArr;
    }

    public static String[] A00(String str) {
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
            if (strArr[i].isEmpty()) {
                throw new IllegalArgumentException(AnonymousClass008.A0F("The key is empty in the keyArray at position: ", i));
            }
        }
        if (length > 0) {
            return strArr;
        }
        throw new IllegalArgumentException("keyArray length should have action name");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48172Le)) {
            return false;
        }
        C48172Le r4 = (C48172Le) obj;
        if (!this.A04.equals(r4.A04) || !C006803i.A0q(this.A03, r4.A03) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, this.A01});
    }
}
