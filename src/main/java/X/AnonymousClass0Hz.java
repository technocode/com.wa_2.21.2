package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0Hz  reason: invalid class name */
public class AnonymousClass0Hz {
    public AnonymousClass0RB A00;
    public List A01 = new ArrayList();
    public Set A02 = new HashSet();
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final EnumC03840Hy A07;

    public AnonymousClass0Hz(EnumC03840Hy r2) {
        this.A07 = r2;
    }

    public static void A00(AnonymousClass0Hz r2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.A03((byte[]) it.next());
        }
    }

    public AnonymousClass0I0 A01() {
        boolean z;
        AnonymousClass0RB r2 = this.A00;
        if (r2.A03 || (((((r2.A01 | r2.A04) | r2.A05) | false) | r2.A00) | r2.A02)) {
            return new AnonymousClass0I0(this);
        }
        throw new IllegalArgumentException("none of the syncs protocols enabled");
    }

    public void A02() {
        this.A00 = new AnonymousClass0RB(true, true, true, true, true, true);
    }

    public void A03(byte[] bArr) {
        for (byte[] bArr2 : this.A01) {
            if (Arrays.equals(bArr2, bArr)) {
                return;
            }
        }
        this.A01.add(bArr);
    }
}
