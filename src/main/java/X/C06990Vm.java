package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Vm  reason: invalid class name and case insensitive filesystem */
public final class C06990Vm {
    public final Set A00 = new HashSet();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C06990Vm.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C06990Vm) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
