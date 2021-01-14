package X;

/* renamed from: X.0bS  reason: invalid class name and case insensitive filesystem */
public class C08630bS extends AbstractC08640bT {
    public C08630bS(Object obj, int i) {
        super(obj, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C08630bS.class != obj.getClass()) {
            return false;
        }
        AbstractC08640bT r5 = (AbstractC08640bT) obj;
        if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[type: ");
        A0S.append(this.A00);
        A0S.append(", data: ");
        A0S.append(this.A01);
        A0S.append("]");
        return A0S.toString();
    }
}
