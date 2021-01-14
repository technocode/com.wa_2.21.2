package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0M5  reason: invalid class name */
public final class AnonymousClass0M5 {
    public final String A00;
    public final byte[] A01;
    public final AnonymousClass0OS[] A02;
    public final AnonymousClass0M5[] A03;

    public AnonymousClass0M5(String str, AnonymousClass0OS[] r3) {
        this(str, r3, null, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass0M5(String str, AnonymousClass0OS[] r5, AnonymousClass0M5 r6) {
        this(str, r5, r6 != null ? new AnonymousClass0M5[]{r6} : null, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass0M5(String str, AnonymousClass0OS[] r4, String str2) {
        this(str, r4, null, str2 != null ? str2.getBytes() : null);
    }

    public AnonymousClass0M5(String str, AnonymousClass0OS[] r3, byte[] bArr) {
        this(str, r3, null, bArr);
    }

    public AnonymousClass0M5(String str, AnonymousClass0OS[] r4, AnonymousClass0M5[] r5, byte[] bArr) {
        if (str != null) {
            this.A00 = str;
            this.A02 = r4;
            this.A03 = r5;
            this.A01 = bArr;
            if (r5 != null && bArr != null) {
                throw new IllegalArgumentException("node may not have both data and children");
            }
            return;
        }
        throw null;
    }

    public static String A00(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static void A01(AnonymousClass0M5 r2, String str) {
        if (!A02(r2, str)) {
            StringBuilder sb = new StringBuilder("failed requireTag: node: ");
            sb.append(r2);
            sb.append(" tag: ");
            sb.append(str);
            throw new AnonymousClass1XC(sb.toString());
        }
    }

    public static boolean A02(AnonymousClass0M5 r0, String str) {
        return r0 != null && r0.A00.equals(str);
    }

    public static byte[] A03(AnonymousClass0M5 r3, int i) {
        byte[] bArr = r3.A01;
        if (bArr != null) {
            int length = bArr.length;
            if (length == i) {
                return bArr;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("failed require. node ");
            sb.append(r3);
            sb.append(" data length ");
            sb.append(length);
            sb.append(" != required length ");
            sb.append(i);
            throw new AnonymousClass1XC(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("failed require. node ");
        sb2.append(r3);
        sb2.append(" missing data");
        throw new AnonymousClass1XC(sb2.toString());
    }

    public int A04(String str) {
        String A0F = A0F(str);
        try {
            return Integer.parseInt(A0F);
        } catch (NumberFormatException unused) {
            throw new AnonymousClass1XC(AnonymousClass008.A0P(AnonymousClass008.A0Z("attribute ", str, " for tag "), this.A00, " is not integral: ", A0F));
        }
    }

    public int A05(String str, int i) {
        String A0G = A0G(str, null);
        if (A0G == null) {
            return i;
        }
        try {
            return Integer.parseInt(A0G);
        } catch (NumberFormatException unused) {
            throw new AnonymousClass1XC(AnonymousClass008.A0P(AnonymousClass008.A0Z("attribute ", str, " for tag "), this.A00, " is not integral: ", A0G));
        }
    }

    public long A06(String str) {
        String A0F = A0F(str);
        try {
            return Long.parseLong(A0F);
        } catch (NumberFormatException unused) {
            throw new AnonymousClass1XC(AnonymousClass008.A0P(AnonymousClass008.A0Z("attribute ", str, " for tag "), this.A00, " is not integral: ", A0F));
        }
    }

    public long A07(String str, long j) {
        String A0G = A0G(str, null);
        if (A0G == null) {
            return j;
        }
        try {
            return Long.parseLong(A0G);
        } catch (NumberFormatException unused) {
            throw new AnonymousClass1XC(AnonymousClass008.A0P(AnonymousClass008.A0Z("attribute ", str, " for tag "), this.A00, " is not integral: ", A0G));
        }
    }

    public Jid A08(Class cls, String str, AnonymousClass009 r8) {
        Jid jid;
        AnonymousClass0OS A0A = A0A(str);
        if (!((A0A == null || (jid = A0A.A01) == null) && (jid = Jid.getNullable(A0G(str, null))) == null) && !jid.isProtocolCompliant()) {
            StringBuilder sb = new StringBuilder("Jid: '");
            sb.append(jid);
            sb.append("' key: '");
            sb.append(str);
            sb.append("' tag: '");
            r8.A04("invalid jid!", AnonymousClass008.A0O(sb, this.A00, "'"), true);
        }
        if (cls == DeviceJid.class && (jid instanceof UserJid)) {
            jid = DeviceJid.of(jid);
        }
        try {
            return (Jid) cls.cast(jid);
        } catch (ClassCastException unused) {
            StringBuilder A0S = AnonymousClass008.A0S("protocol-tree-node/getAttributeJid/failed to convert '");
            A0S.append(AnonymousClass1VY.A0D(jid));
            A0S.append("' to ");
            A0S.append(cls.getName());
            Log.e(A0S.toString());
            r8.A03("invalid-jid-attribute", 2);
            return null;
        }
    }

    public Jid A09(Class cls, String str, AnonymousClass009 r5) {
        Jid A08 = A08(cls, str, r5);
        if (A08 != null) {
            return A08;
        }
        StringBuilder A0Z = AnonymousClass008.A0Z("required attribute '", str, "' missing for tag ");
        A0Z.append(this.A00);
        throw new AnonymousClass1XC(A0Z.toString());
    }

    public final AnonymousClass0OS A0A(String str) {
        AnonymousClass0OS[] r4 = this.A02;
        if (r4 == null || (r3 = r4.length) <= 0) {
            return null;
        }
        for (AnonymousClass0OS r1 : r4) {
            if (TextUtils.equals(str, r1.A02)) {
                return r1;
            }
        }
        return null;
    }

    public AnonymousClass0M5 A0B() {
        AnonymousClass0M5[] r1 = this.A03;
        if (r1 != null && r1.length != 0) {
            return r1[0];
        }
        StringBuilder A0S = AnonymousClass008.A0S("required first child missing for tag ");
        A0S.append(this.A00);
        throw new AnonymousClass1XC(A0S.toString());
    }

    public AnonymousClass0M5 A0C(int i) {
        AnonymousClass0M5[] r1 = this.A03;
        if (r1 == null || r1.length <= i) {
            return null;
        }
        return r1[i];
    }

    public AnonymousClass0M5 A0D(String str) {
        AnonymousClass0M5[] r5 = this.A03;
        if (r5 == null) {
            return null;
        }
        for (AnonymousClass0M5 r1 : r5) {
            if (TextUtils.equals(str, r1.A00)) {
                return r1;
            }
        }
        return null;
    }

    public AnonymousClass0M5 A0E(String str) {
        AnonymousClass0M5 A0D = A0D(str);
        if (A0D != null) {
            return A0D;
        }
        StringBuilder A0Z = AnonymousClass008.A0Z("required child ", str, " missing for tag ");
        A0Z.append(this.A00);
        throw new AnonymousClass1XC(A0Z.toString());
    }

    public String A0F(String str) {
        String A0G = A0G(str, null);
        if (A0G != null) {
            return A0G;
        }
        StringBuilder A0Z = AnonymousClass008.A0Z("required attribute '", str, "' missing for tag ");
        A0Z.append(this.A00);
        throw new AnonymousClass1XC(A0Z.toString());
    }

    public String A0G(String str, String str2) {
        AnonymousClass0OS A0A = A0A(str);
        if (A0A != null) {
            return A0A.A03;
        }
        return str2;
    }

    public List A0H(String str) {
        AnonymousClass0M5[] r5 = this.A03;
        if (r5 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass0M5 r1 : r5) {
            if (TextUtils.equals(str, r1.A00)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public AnonymousClass0OS[] A0I() {
        AnonymousClass0OS[] r1 = this.A02;
        if (r1 == null || r1.length != 0) {
            return r1;
        }
        return null;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        AnonymousClass0M5[] r6;
        AnonymousClass0OS[] r0;
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0M5.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0M5 r11 = (AnonymousClass0M5) obj;
        if (!this.A00.equals(r11.A00)) {
            return false;
        }
        AnonymousClass0OS[] r5 = this.A02;
        if (r5 != null && (r0 = r11.A02) != null) {
            int length = r5.length;
            if (length != r0.length) {
                return false;
            }
            for (AnonymousClass0OS r2 : r5) {
                String A0G = r11.A0G(r2.A02, null);
                if (A0G == null || !r2.A03.equals(A0G)) {
                    return false;
                }
            }
        } else if (!(r5 == null && r11.A02 == null)) {
            return false;
        }
        AnonymousClass0M5[] r7 = this.A03;
        if (r7 != null && (r6 = r11.A03) != null) {
            int length2 = r7.length;
            int length3 = r6.length;
            if (length2 != length3) {
                return false;
            }
            for (AnonymousClass0M5 r22 : r7) {
                for (AnonymousClass0M5 r02 : r6) {
                    if (r22.equals(r02)) {
                    }
                }
                return false;
            }
        } else if (!(r7 == null && r11.A03 == null)) {
            return false;
        }
        byte[] bArr2 = this.A01;
        if (!(bArr2 == null || (bArr = r11.A01) == null || (bArr2.length == bArr.length && Arrays.equals(bArr2, bArr)))) {
            return false;
        }
        if (bArr2 == null) {
            if (r11.A01 == null) {
                return true;
            }
            return false;
        } else if (r11.A01 != null) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (this.A00.hashCode() + 31) * 31;
        byte[] bArr = this.A01;
        int i2 = 0;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i3 = (hashCode2 + hashCode) * 31;
        AnonymousClass0M5[] r5 = this.A03;
        if (r5 == null) {
            i = 0;
        } else {
            i = 0;
            for (AnonymousClass0M5 r0 : r5) {
                if (r0 != null) {
                    i = r0.hashCode() + i;
                }
            }
        }
        int i4 = (i3 + i) * 31;
        AnonymousClass0OS[] r3 = this.A02;
        if (r3 != null) {
            for (AnonymousClass0OS r02 : r3) {
                if (r02 != null) {
                    i2 = r02.hashCode() + i2;
                }
            }
        }
        return i4 + i2;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("<");
        String str = this.A00;
        A0S.append(str);
        AnonymousClass0OS[] r4 = this.A02;
        if (r4 == null) {
            r4 = new AnonymousClass0OS[0];
        }
        for (AnonymousClass0OS r1 : r4) {
            A0S.append(" ");
            A0S.append(r1.A02);
            A0S.append("='");
            A0S.append(r1.A03);
            A0S.append("'");
        }
        byte[] bArr = this.A01;
        if (bArr == null && this.A03 == null) {
            A0S.append("/>");
        } else {
            A0S.append(">");
            AnonymousClass0M5[] r2 = this.A03;
            if (r2 == null) {
                r2 = new AnonymousClass0M5[0];
            }
            for (AnonymousClass0M5 r0 : r2) {
                if (r0 != null) {
                    A0S.append(r0.toString());
                }
            }
            if (bArr != null) {
                try {
                    A0S.append(new String(bArr, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    Log.w("protocolTreeNode/toString/could not convert data", e);
                }
            }
            A0S.append("</");
            A0S.append(str);
            A0S.append(">");
        }
        return A0S.toString();
    }
}
