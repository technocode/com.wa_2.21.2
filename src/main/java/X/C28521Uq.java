package X;

/* renamed from: X.1Uq  reason: invalid class name and case insensitive filesystem */
public final class C28521Uq {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C28521Uq(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = z;
        this.A00 = z2;
        this.A01 = z3;
        this.A02 = z4;
        this.A03 = z5;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("WriteResult{wasSuccess=");
        A0S.append(this.A04);
        A0S.append(", chatAdded=");
        A0S.append(this.A00);
        A0S.append(", chatUnarchived=");
        A0S.append(this.A01);
        A0S.append(", isDuplicate=");
        A0S.append(this.A02);
        A0S.append(", isExpired=");
        A0S.append(this.A03);
        A0S.append('}');
        return A0S.toString();
    }
}
