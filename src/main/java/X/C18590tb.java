package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0tb  reason: invalid class name and case insensitive filesystem */
public class C18590tb {
    public EnumC18500tS A00;
    public EnumC18580ta A01;
    public boolean A02 = false;

    public C18590tb(EnumC18500tS r2, EnumC18580ta r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    public static int A00(List list, int i, AbstractC31941e3 r6) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = list.get(i);
        AbstractC18840u0 r0 = ((C18850u1) r6).A00;
        if (obj != r0) {
            return -1;
        }
        for (Object obj2 : r0.A5H()) {
            if (obj2 == r6) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static List A01(C31821dr r8) {
        ArrayList arrayList = new ArrayList();
        do {
            boolean A0C = r8.A0C();
            if (A0C) {
                break;
            }
            String str = null;
            if (!A0C) {
                int i = r8.A01;
                char charAt = r8.A03.charAt(i);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    r8.A01 = i;
                } else {
                    int A04 = r8.A04();
                    while (true) {
                        if ((A04 < 65 || A04 > 90) && (A04 < 97 || A04 > 122)) {
                            str = r8.A03.substring(i, r8.A01);
                        } else {
                            A04 = r8.A04();
                        }
                    }
                    str = r8.A03.substring(i, r8.A01);
                }
            }
            if (str == null) {
                break;
            }
            try {
                arrayList.add(EnumC18500tS.valueOf(str));
            } catch (IllegalArgumentException unused) {
            }
        } while (r8.A0D());
        return arrayList;
    }

    public static boolean A02(C18540tW r10, C18560tY r11, int i, List list, int i2) {
        int i3 = i2;
        C18570tZ r1 = (C18570tZ) r11.A01.get(i);
        AbstractC31941e3 r4 = (AbstractC31941e3) list.get(i2);
        if (!A05(r10, r1, r4)) {
            return false;
        }
        EnumC18490tR r12 = r1.A00;
        if (r12 == EnumC18490tR.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i3 > 0) {
                i3--;
                if (A02(r10, r11, i - 1, list, i3)) {
                    return true;
                }
            }
            return false;
        } else if (r12 == EnumC18490tR.CHILD) {
            return A02(r10, r11, i - 1, list, i2 - 1);
        } else {
            int A002 = A00(list, i2, r4);
            if (A002 <= 0) {
                return false;
            }
            return A03(r10, r11, i - 1, list, i3, (AbstractC31941e3) ((C18850u1) r4).A00.A5H().get(A002 - 1));
        }
    }

    public static boolean A03(C18540tW r4, C18560tY r5, int i, List list, int i2, AbstractC31941e3 r9) {
        C18570tZ r1 = (C18570tZ) r5.A01.get(i);
        if (!A05(r4, r1, r9)) {
            return false;
        }
        EnumC18490tR r12 = r1.A00;
        if (r12 == EnumC18490tR.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 >= 0) {
                if (A02(r4, r5, i - 1, list, i2)) {
                    return true;
                }
                i2--;
            }
            return false;
        } else if (r12 == EnumC18490tR.CHILD) {
            return A02(r4, r5, i - 1, list, i2);
        } else {
            int A002 = A00(list, i2, r9);
            if (A002 <= 0) {
                return false;
            }
            return A03(r4, r5, i - 1, list, i2, (AbstractC31941e3) ((C18850u1) r9).A00.A5H().get(A002 - 1));
        }
    }

    public static boolean A04(C18540tW r9, C18560tY r10, AbstractC31941e3 r11) {
        int i;
        ArrayList arrayList = new ArrayList();
        AbstractC18840u0 r0 = ((C18850u1) r11).A00;
        while (true) {
            i = 0;
            if (r0 == null) {
                break;
            }
            arrayList.add(0, r0);
            r0 = ((C18850u1) r0).A00;
        }
        int size = arrayList.size() - 1;
        List list = r10.A01;
        if (list != null && list.size() == 1) {
            return A05(r9, (C18570tZ) r10.A01.get(0), r11);
        }
        List list2 = r10.A01;
        if (list2 != null) {
            i = list2.size();
        }
        return A03(r9, r10, i - 1, arrayList, size, r11);
    }

    public static boolean A05(C18540tW r7, C18570tZ r8, AbstractC31941e3 r9) {
        List list;
        String str = r8.A01;
        if (!(str == null || str.equals(r9.A00().toLowerCase(Locale.US)))) {
            return false;
        }
        List<C18460tO> list2 = r8.A02;
        if (list2 != null) {
            for (C18460tO r3 : list2) {
                String str2 = r3.A01;
                int hashCode = str2.hashCode();
                if (hashCode != 3355) {
                    if (hashCode != 94742904 || !str2.equals("class") || (list = r9.A04) == null || !list.contains(r3.A02)) {
                        return false;
                    }
                } else if (!str2.equals("id") || !r3.A02.equals(r9.A03)) {
                    return false;
                }
                return false;
            }
        }
        List<AbstractC18510tT> list3 = r8.A03;
        if (list3 != null) {
            for (AbstractC18510tT r0 : list3) {
                if (!r0.ABy(r7, r9)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final C18550tX A06(C31821dr r12) {
        char charAt;
        int A012;
        C18550tX r3 = new C18550tX();
        while (!r12.A0C()) {
            try {
                if (!r12.A0F("<!--") && !r12.A0F("-->")) {
                    if (!r12.A0E('@')) {
                        List<C18560tY> A0I = r12.A0I();
                        if (A0I == null || A0I.isEmpty()) {
                            break;
                        } else if (r12.A0E('{')) {
                            r12.A0B();
                            C18820ty r5 = new C18820ty();
                            do {
                                String A0H = r12.A0H();
                                r12.A0B();
                                if (r12.A0E(':')) {
                                    r12.A0B();
                                    if (!r12.A0C()) {
                                        int i = r12.A01;
                                        int charAt2 = r12.A03.charAt(i);
                                        int i2 = i;
                                        while (charAt2 != -1 && charAt2 != 59 && charAt2 != 125 && charAt2 != 33 && charAt2 != 10 && charAt2 != 13) {
                                            if (!C19010uH.A00(charAt2)) {
                                                i2 = r12.A01 + 1;
                                            }
                                            charAt2 = r12.A04();
                                        }
                                        if (r12.A01 > i) {
                                            String substring = r12.A03.substring(i, i2);
                                            if (substring != null) {
                                                r12.A0B();
                                                if (r12.A0E('!')) {
                                                    r12.A0B();
                                                    if (r12.A0F("important")) {
                                                        r12.A0B();
                                                    } else {
                                                        throw new C18440tM("Malformed rule set: found unexpected '!'");
                                                    }
                                                }
                                                r12.A0E(';');
                                                C19030uJ.A0H(r5, A0H, substring);
                                                r12.A0B();
                                                if (r12.A0C()) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            r12.A01 = i;
                                        }
                                    }
                                    throw new C18440tM("Expected property value");
                                }
                                throw new C18440tM("Expected ':'");
                            } while (!r12.A0E('}'));
                            r12.A0B();
                            for (C18560tY r2 : A0I) {
                                r3.A00(new C18530tV(r2, r5, this.A01));
                            }
                        } else {
                            throw new C18440tM("Malformed rule block: expected '{'");
                        }
                    } else {
                        String A0H2 = r12.A0H();
                        r12.A0B();
                        if (A0H2 != null) {
                            boolean z = this.A02;
                            int i3 = 0;
                            if (!z && A0H2.equals("media")) {
                                List A013 = A01(r12);
                                if (r12.A0E('{')) {
                                    r12.A0B();
                                    EnumC18500tS r7 = this.A00;
                                    Iterator it = A013.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            A06(r12);
                                            break;
                                        }
                                        Object next = it.next();
                                        if (next != EnumC18500tS.all) {
                                            if (next == r7) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    this.A02 = true;
                                    r3.A01(A06(r12));
                                    this.A02 = false;
                                    if (!r12.A0C() && !r12.A0E('}')) {
                                        throw new C18440tM("Invalid @media rule: expected '}' at end of rule set");
                                    }
                                } else {
                                    throw new C18440tM("Invalid @media rule: missing rule set");
                                }
                            } else if (z || !A0H2.equals("import")) {
                                Log.w("CSSParser", String.format("Ignoring @%s rule", A0H2));
                                while (true) {
                                    if (r12.A0C()) {
                                        break;
                                    }
                                    int intValue = r12.A08().intValue();
                                    if (intValue != 59) {
                                        if (intValue != 123) {
                                            if (intValue == 125 && i3 > 0 && i3 - 1 == 0) {
                                                break;
                                            }
                                        } else {
                                            i3++;
                                        }
                                    } else if (i3 == 0) {
                                        break;
                                    }
                                }
                            } else {
                                if (!r12.A0C()) {
                                    int i4 = r12.A01;
                                    if (r12.A0F("url(")) {
                                        r12.A0B();
                                        if (r12.A0G() == null) {
                                            StringBuilder sb = new StringBuilder();
                                            while (!r12.A0C() && (charAt = r12.A03.charAt(r12.A01)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !C19010uH.A00(charAt) && !Character.isISOControl((int) charAt)) {
                                                int i5 = r12.A01 + 1;
                                                r12.A01 = i5;
                                                if (charAt == '\\') {
                                                    if (!r12.A0C()) {
                                                        String str = r12.A03;
                                                        r12.A01 = i5 + 1;
                                                        charAt = str.charAt(i5);
                                                        if (!(charAt == '\n' || charAt == '\r' || charAt == '\f')) {
                                                            int A014 = C31821dr.A01(charAt);
                                                            if (A014 != -1) {
                                                                int i6 = 1;
                                                                while (!r12.A0C() && (A012 = C31821dr.A01(r12.A03.charAt(r12.A01))) != -1) {
                                                                    r12.A01++;
                                                                    A014 = (A014 << 4) + A012;
                                                                    i6++;
                                                                    if (i6 > 5) {
                                                                        break;
                                                                    }
                                                                }
                                                                sb.append((char) A014);
                                                            }
                                                        }
                                                    }
                                                }
                                                sb.append((char) charAt);
                                            }
                                            if (sb.length() == 0 || sb.toString() == null) {
                                                r12.A01 = i4;
                                            }
                                        }
                                        r12.A0B();
                                        if (!r12.A0C() && !r12.A0F(")")) {
                                            r12.A01 = i4;
                                        }
                                        r12.A0B();
                                        A01(r12);
                                        if (!r12.A0C() && !r12.A0E(';')) {
                                            throw new C18440tM("Invalid @media rule: expected '}' at end of rule set");
                                        }
                                    }
                                }
                                if (r12.A0G() == null) {
                                    throw new C18440tM("Invalid @import rule: expected string or url()");
                                }
                                r12.A0B();
                                A01(r12);
                                throw new C18440tM("Invalid @media rule: expected '}' at end of rule set");
                            }
                            r12.A0B();
                        } else {
                            throw new C18440tM("Invalid '@' rule");
                        }
                    }
                }
            } catch (C18440tM e) {
                StringBuilder A0S = AnonymousClass008.A0S("CSS parser terminated early due to error: ");
                A0S.append(e.getMessage());
                Log.e("CSSParser", A0S.toString());
            }
        }
        return r3;
    }
}
