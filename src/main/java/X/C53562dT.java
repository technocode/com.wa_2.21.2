package X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: X.2dT  reason: invalid class name and case insensitive filesystem */
public class C53562dT implements AnonymousClass2OP {
    public final int A00 = 4;
    public final AnonymousClass2OM A01;
    public final Class A02;
    public final String A03;

    public C53562dT(String str, Object obj) {
        this.A03 = str;
        this.A02 = String.class;
        this.A01 = new AnonymousClass2OM(obj, String.class);
    }

    @Override // X.AnonymousClass2OP
    public boolean AB0(AnonymousClass2OQ r5) {
        try {
            String str = this.A03;
            Map map = r5.A00;
            if (map.containsKey(str)) {
                AnonymousClass2OM r1 = new AnonymousClass2OM(map.get(str), this.A02);
                int i = this.A00;
                switch (i) {
                    case 3:
                    case 4:
                        return r1.equals(this.A01);
                    case 5:
                        return !r1.equals(this.A01);
                    case 6:
                        if (r1.compareTo(this.A01) < 0) {
                            return true;
                        }
                        return false;
                    case 7:
                        if (r1.compareTo(this.A01) > 0) {
                            return true;
                        }
                        return false;
                    case 8:
                        if (r1.compareTo(this.A01) <= 0) {
                            return true;
                        }
                        return false;
                    case 9:
                        if (r1.compareTo(this.A01) >= 0) {
                            return true;
                        }
                        return false;
                    case 10:
                        throw null;
                    default:
                        throw new IllegalStateException(AnonymousClass008.A0N(AnonymousClass008.A0S("Operator with code "), i, " is not currently supported"));
                }
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0K(str, " has not been set on UserInfo"));
            }
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C53562dT)) {
            return false;
        }
        C53562dT r4 = (C53562dT) obj;
        if (!this.A03.equals(r4.A03) || this.A00 != r4.A00) {
            return false;
        }
        AnonymousClass2OM r1 = this.A01;
        if (r1 == null) {
            if (r4.A01 != null) {
                return false;
            }
        } else if (!r1.equals(r4.A01)) {
            return false;
        }
        if (this.A02.equals(r4.A02)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A00), this.A01, null, this.A02});
    }
}
