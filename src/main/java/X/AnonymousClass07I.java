package X;

/* renamed from: X.07I  reason: invalid class name */
public final class AnonymousClass07I {
    public final int A00;
    public final Class A01;

    public AnonymousClass07I(Class cls, int i) {
        C001801b.A1R(cls, "Null dependency anInterface.");
        this.A01 = cls;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass07I)) {
            return false;
        }
        AnonymousClass07I r4 = (AnonymousClass07I) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.A01);
        sb.append(", type=");
        int i = this.A00;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", direct=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
