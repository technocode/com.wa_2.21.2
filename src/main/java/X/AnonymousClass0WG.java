package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0WG  reason: invalid class name */
public class AnonymousClass0WG {
    public int A00 = -1;
    public int A01 = 0;
    public AnonymousClass0WH A02;
    public AnonymousClass0WG A03;
    public HashSet A04 = null;
    public final EnumC13990lL A05;
    public final AnonymousClass0WC A06;

    public AnonymousClass0WG(AnonymousClass0WC r2, EnumC13990lL r3) {
        this.A06 = r2;
        this.A05 = r3;
    }

    public int A00() {
        AnonymousClass0WG r0;
        if (this.A06.A0N == 8) {
            return 0;
        }
        int i = this.A00;
        if (i <= -1 || (r0 = this.A03) == null || r0.A06.A0N != 8) {
            return this.A01;
        }
        return i;
    }

    public void A01() {
        HashSet hashSet;
        AnonymousClass0WG r0 = this.A03;
        if (!(r0 == null || (hashSet = r0.A04) == null)) {
            hashSet.remove(this);
        }
        this.A03 = null;
        this.A01 = 0;
        this.A00 = -1;
    }

    public void A02() {
        AnonymousClass0WH r0 = this.A02;
        if (r0 == null) {
            this.A02 = new AnonymousClass0WH(EnumC13980lK.UNRESTRICTED);
        } else {
            r0.A00();
        }
    }

    public void A03(AnonymousClass0WG r3, int i, int i2) {
        if (r3 == null) {
            A01();
            return;
        }
        this.A03 = r3;
        HashSet hashSet = r3.A04;
        if (hashSet == null) {
            hashSet = new HashSet();
            r3.A04 = hashSet;
        }
        hashSet.add(this);
        if (i > 0) {
            this.A01 = i;
        } else {
            this.A01 = 0;
        }
        this.A00 = i2;
    }

    public boolean A04() {
        AnonymousClass0WG r0;
        HashSet hashSet = this.A04;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AnonymousClass0WG r2 = (AnonymousClass0WG) it.next();
            EnumC13990lL r1 = r2.A05;
            switch (r1.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    r0 = null;
                    break;
                case 1:
                    r0 = r2.A06.A0X;
                    break;
                case 2:
                    r0 = r2.A06.A0S;
                    break;
                case 3:
                    r0 = r2.A06.A0W;
                    break;
                case 4:
                    r0 = r2.A06.A0Y;
                    break;
                default:
                    throw new AssertionError(r1.name());
            }
            AnonymousClass0WG r12 = r0.A03;
            boolean z = false;
            if (r12 != null) {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A06.A0f);
        sb.append(":");
        sb.append(this.A05.toString());
        return sb.toString();
    }
}
