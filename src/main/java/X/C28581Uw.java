package X;

/* renamed from: X.1Uw  reason: invalid class name and case insensitive filesystem */
public class C28581Uw {
    public byte A00;
    public AnonymousClass02N A01;

    public C28581Uw(AnonymousClass02N r1, byte b) {
        this.A01 = r1;
        this.A00 = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C28581Uw.class != obj.getClass()) {
            return false;
        }
        C28581Uw r5 = (C28581Uw) obj;
        if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" ");
        sb.append((int) this.A00);
        return sb.toString();
    }
}
