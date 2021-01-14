package X;

/* renamed from: X.0VR  reason: invalid class name */
public class AnonymousClass0VR {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = 0;
    public int A04 = 1;
    public int A05 = 0;
    public int A06;
    public int A07 = -1;
    public long A08;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E = false;

    public int A00() {
        return this.A09 ? this.A05 - this.A00 : this.A03;
    }

    public void A01(int i) {
        int i2 = this.A04;
        if ((i2 & i) == 0) {
            StringBuilder A0S = AnonymousClass008.A0S("Layout state should be one of ");
            A0S.append(Integer.toBinaryString(i));
            A0S.append(" but it is ");
            A0S.append(Integer.toBinaryString(i2));
            throw new IllegalStateException(A0S.toString());
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("State{mTargetPosition=");
        A0S.append(this.A07);
        A0S.append(", mData=");
        A0S.append((Object) null);
        A0S.append(", mItemCount=");
        A0S.append(this.A03);
        A0S.append(", mIsMeasuring=");
        A0S.append(this.A0A);
        A0S.append(", mPreviousLayoutItemCount=");
        A0S.append(this.A05);
        A0S.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        A0S.append(this.A00);
        A0S.append(", mStructureChanged=");
        A0S.append(this.A0D);
        A0S.append(", mInPreLayout=");
        A0S.append(this.A09);
        A0S.append(", mRunSimpleAnimations=");
        A0S.append(this.A0C);
        A0S.append(", mRunPredictiveAnimations=");
        A0S.append(this.A0B);
        A0S.append('}');
        return A0S.toString();
    }
}
