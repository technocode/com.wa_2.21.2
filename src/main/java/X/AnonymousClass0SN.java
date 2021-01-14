package X;

import java.util.Map;

/* renamed from: X.0SN  reason: invalid class name */
public class AnonymousClass0SN implements Map.Entry {
    public AnonymousClass0SN A00;
    public AnonymousClass0SN A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass0SN(Object obj, Object obj2) {
        this.A02 = obj;
        this.A03 = obj2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0SN)) {
            return false;
        }
        AnonymousClass0SN r4 = (AnonymousClass0SN) obj;
        if (!this.A02.equals(r4.A02) || !this.A03.equals(r4.A03)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.A02;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.A03;
    }

    public int hashCode() {
        return this.A02.hashCode() ^ this.A03.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append("=");
        sb.append(this.A03);
        return sb.toString();
    }
}
