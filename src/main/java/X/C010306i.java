package X;

/* renamed from: X.06i  reason: invalid class name and case insensitive filesystem */
public class C010306i {
    public final /* synthetic */ C010206h A00;
    public final /* synthetic */ int[] A01;

    public C010306i(int[] iArr, C010206h r2) {
        this.A01 = iArr;
        this.A00 = r2;
    }

    public void A00() {
        AnonymousClass112.A00();
        int[] iArr = this.A01;
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            this.A00.A02();
        } else if (i < 0) {
            throw new IllegalStateException("negative recursion level");
        }
    }

    public void A01() {
        C33471gp.A00("LispyEvaluation", null);
        int[] iArr = this.A01;
        iArr[0] = iArr[0] + 1;
    }
}
