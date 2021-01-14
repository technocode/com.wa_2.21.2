package X;

/* renamed from: X.0pQ  reason: invalid class name and case insensitive filesystem */
public class C16200pQ {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05 = 0;
    public boolean A06;
    public boolean A07 = true;
    public boolean A08;

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("LayoutState{mAvailable=");
        A0S.append(this.A00);
        A0S.append(", mCurrentPosition=");
        A0S.append(this.A01);
        A0S.append(", mItemDirection=");
        A0S.append(this.A03);
        A0S.append(", mLayoutDirection=");
        A0S.append(this.A04);
        A0S.append(", mStartLine=");
        A0S.append(this.A05);
        A0S.append(", mEndLine=");
        A0S.append(this.A02);
        A0S.append('}');
        return A0S.toString();
    }
}
