package X;

/* renamed from: X.2U3  reason: invalid class name */
public class AnonymousClass2U3 {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass1WF A03;
    public String A04;
    public String A05;
    public String A06;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2U3)) {
            return false;
        }
        AnonymousClass2U3 r4 = (AnonymousClass2U3) obj;
        if (this.A03 == r4.A03 && r4.A02 == this.A02 && r4.A01 == this.A01 && r4.A00 == this.A00) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[ResumeCheck.Result type=");
        A0S.append(this.A03);
        A0S.append(", resume=");
        A0S.append(this.A02);
        A0S.append(", error=");
        A0S.append(this.A01);
        A0S.append(", message=");
        A0S.append(this.A05);
        A0S.append(", backoff=");
        return AnonymousClass008.A0N(A0S, this.A00, "]");
    }
}
