package X;

/* renamed from: X.2Ge  reason: invalid class name and case insensitive filesystem */
public class C47032Ge {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC11910hD A04;
    public AbstractC11910hD A05;

    public C47032Ge(AbstractC11910hD r1, AbstractC11910hD r2, int i, int i2, int i3, int i4) {
        this.A05 = r1;
        this.A04 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ChangeInfo{oldHolder=");
        A0S.append(this.A05);
        A0S.append(", newHolder=");
        A0S.append(this.A04);
        A0S.append(", fromX=");
        A0S.append(this.A00);
        A0S.append(", fromY=");
        A0S.append(this.A01);
        A0S.append(", toX=");
        A0S.append(this.A02);
        A0S.append(", toY=");
        A0S.append(this.A03);
        A0S.append('}');
        return A0S.toString();
    }
}
