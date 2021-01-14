package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.2Ld  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC48162Ld {
    public static final Set A08 = Collections.unmodifiableSet(new HashSet(Arrays.asList("regular", "regular_low", "regular_high", "critical_block", "critical_unblock_low", "generic")));
    public static final Set A09 = Collections.unmodifiableSet(new HashSet(Arrays.asList("critical_block", "critical_unblock_low")));
    public AnonymousClass0DM A00;
    public boolean A01;
    public byte[] A02;
    public final int A03;
    public final long A04;
    public final C48192Lg A05;
    public final String A06;
    public final String A07;

    public AbstractC48162Ld(long j, String str, int i, AnonymousClass0DM r5, boolean z, C48192Lg r7, String str2) {
        this.A04 = j;
        this.A07 = str;
        this.A03 = i;
        this.A00 = r5;
        this.A05 = r7;
        this.A06 = str2;
        this.A01 = z;
    }

    public static String A00(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        String obj = jSONArray.toString();
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    public C77303fw A01() {
        C76933fL A042;
        if ((this instanceof C52772bj) || (A042 = A04()) == null) {
            return null;
        }
        return (C77303fw) A042.A01();
    }

    public synchronized boolean A02() {
        return this.A01;
    }

    public String[] A03() {
        String str;
        if (this instanceof C52792bl) {
            C52792bl r3 = (C52792bl) this;
            return C48182Lf.A02(new String[]{"star"}, r3.A01, r3.A00);
        } else if (this instanceof C52782bk) {
            return new String[]{"setting_securityNotification"};
        } else if (this instanceof C52772bj) {
            return ((C52772bj) this).A00;
        } else {
            if (this instanceof C52762bi) {
                return new String[]{"setting_pushName"};
            } else if (this instanceof C52752bh) {
                return new String[]{"pin", ((C52752bh) this).A00.getRawString()};
            } else if (this instanceof C52742bg) {
                return new String[]{"mute", ((C52742bg) this).A01.getRawString()};
            } else if (this instanceof C52732bf) {
                return new String[]{"markChatAsRead", ((C52732bf) this).A00.getRawString()};
            } else if (this instanceof C52722be) {
                return new String[]{"setting_locale"};
            } else if (this instanceof C52712bd) {
                C52712bd r32 = (C52712bd) this;
                return C48182Lf.A02(new String[]{"deleteMessageForMe"}, r32.A02, r32.A01);
            } else if (this instanceof C52702bc) {
                C52702bc r0 = (C52702bc) this;
                AnonymousClass02N r4 = r0.A00;
                boolean z = r0.A02;
                String[] strArr = new String[3];
                strArr[0] = "deleteChat";
                strArr[1] = r4.getRawString();
                strArr[2] = z ? "1" : "0";
                return strArr;
            } else if (this instanceof C52692bb) {
                return new String[]{"contact", ((C52692bb) this).A00.getRawString()};
            } else if (!(this instanceof C52682ba)) {
                return new String[]{"archive", ((AnonymousClass2bZ) this).A00.getRawString()};
            } else {
                C52682ba r02 = (C52682ba) this;
                AnonymousClass02N r5 = r02.A00;
                boolean z2 = r02.A03;
                boolean z3 = r02.A02;
                String[] strArr2 = new String[4];
                strArr2[0] = "clearChat";
                strArr2[1] = r5.getRawString();
                if (z2) {
                    str = "1";
                } else {
                    str = "0";
                }
                strArr2[2] = str;
                strArr2[3] = z3 ? "1" : "0";
                return strArr2;
            }
        }
    }

    public C76933fL A04() {
        C76933fL r4 = (C76933fL) C77303fw.A0L.AQb();
        long j = this.A04;
        r4.A02();
        C77303fw r1 = (C77303fw) r4.A00;
        r1.A00 |= 1;
        r1.A01 = j;
        return r4;
    }

    public boolean equals(Object obj) {
        byte[] A092;
        byte[] A093;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC48162Ld r5 = (AbstractC48162Ld) obj;
        if (!Arrays.equals(A03(), r5.A03()) || !this.A05.equals(r5.A05)) {
            return false;
        }
        C77303fw A012 = A01();
        if (A012 == null) {
            A092 = null;
        } else {
            A092 = A012.A09();
        }
        C77303fw A013 = r5.A01();
        if (A013 == null) {
            A093 = null;
        } else {
            A093 = A013.A09();
        }
        if (Arrays.equals(A092, A093)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(A03())), this.A05, A01()});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SyncMutation{rowId='");
        AnonymousClass008.A1W(A0S, this.A07, '\'', ", timestamp=");
        A0S.append(this.A04);
        A0S.append(", operation=");
        A0S.append(this.A05);
        A0S.append(", collectionName='");
        AnonymousClass008.A1W(A0S, this.A06, '\'', ", version=");
        A0S.append(this.A03);
        A0S.append(", keyId=");
        A0S.append(this.A00);
        A0S.append(", areDependenciesMissing=");
        A0S.append(this.A01);
        A0S.append('}');
        return A0S.toString();
    }
}
