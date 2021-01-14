package X;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: X.0QC  reason: invalid class name */
public abstract class AnonymousClass0QC {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public CharSequence A07;
    public CharSequence A08;
    public String A09;
    public ArrayList A0A = new ArrayList();
    public ArrayList A0B;
    public ArrayList A0C;
    public boolean A0D;
    public boolean A0E = true;
    public boolean A0F = false;

    public int A00() {
        return ((AnonymousClass0QB) this).A0B(false);
    }

    public int A01() {
        return ((AnonymousClass0QB) this).A0B(true);
    }

    public AnonymousClass0QC A02(AnonymousClass037 r4) {
        AnonymousClass0QB r2 = (AnonymousClass0QB) this;
        AnonymousClass0LW r1 = r4.A0H;
        if (r1 == null || r1 == r2.A02) {
            r2.A07(new C09130cL(6, r4));
            return r2;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        A0S.append(r4.toString());
        A0S.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(A0S.toString());
    }

    public AnonymousClass0QC A03(AnonymousClass037 r4) {
        AnonymousClass0QB r2 = (AnonymousClass0QB) this;
        AnonymousClass0LW r1 = r4.A0H;
        if (r1 == null || r1 == r2.A02) {
            r2.A07(new C09130cL(3, r4));
            return r2;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        A0S.append(r4.toString());
        A0S.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(A0S.toString());
    }

    public void A04() {
        AnonymousClass0QB r2 = (AnonymousClass0QB) this;
        if (!r2.A0D) {
            r2.A0E = false;
            r2.A02.A0i(r2, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void A05(int i, AnonymousClass037 r4) {
        A0A(i, r4, null, 1);
    }

    public void A06(int i, AnonymousClass037 r3, String str) {
        A0A(i, r3, str, 2);
    }

    public void A07(C09130cL r2) {
        this.A0A.add(r2);
        r2.A01 = this.A02;
        r2.A02 = this.A03;
        r2.A03 = this.A04;
        r2.A04 = this.A05;
    }

    public void A08(String str) {
        if (this.A0E) {
            this.A0D = true;
            this.A09 = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public AnonymousClass0QC A09(AnonymousClass037 r2, EnumC014207z r3) {
        A07(new C09130cL(r2, r3));
        return this;
    }

    public void A0A(int i, AnonymousClass037 r6, String str, int i2) {
        Class<?> cls = r6.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder A0S = AnonymousClass008.A0S("Fragment ");
            A0S.append(cls.getCanonicalName());
            A0S.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(A0S.toString());
        }
        if (str != null) {
            String str2 = r6.A0Q;
            if (str2 == null || str.equals(str2)) {
                r6.A0Q = str;
            } else {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(r6);
                sb.append(": was ");
                throw new IllegalStateException(AnonymousClass008.A0P(sb, r6.A0Q, " now ", str));
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = r6.A03;
                if (i3 == 0 || i3 == i) {
                    r6.A03 = i;
                    r6.A02 = i;
                } else {
                    StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                    sb2.append(r6);
                    sb2.append(": was ");
                    sb2.append(r6.A03);
                    sb2.append(" now ");
                    sb2.append(i);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                sb3.append(r6);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        A07(new C09130cL(i2, r6));
    }
}
