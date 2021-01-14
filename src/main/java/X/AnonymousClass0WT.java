package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0WT  reason: invalid class name */
public final class AnonymousClass0WT extends AnonymousClass0SD {
    public static final AnonymousClass0O4 A05 = new AnonymousClass0WU();
    public boolean A00 = false;
    public final HashMap A01 = new HashMap();
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final boolean A04;

    public AnonymousClass0WT(boolean z) {
        this.A04 = z;
    }

    public boolean A02(AnonymousClass037 r3) {
        if (this.A02.containsKey(r3.A0S) && this.A04) {
            return this.A00;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0WT.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0WT r5 = (AnonymousClass0WT) obj;
        if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || !this.A03.equals(r5.A03)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A03.hashCode() + ((this.A01.hashCode() + (this.A02.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.A01.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.A03.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
