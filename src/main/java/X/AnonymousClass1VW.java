package X;

/* renamed from: X.1VW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1VW extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass00Y A03;
    public final /* synthetic */ byte[] A04;

    public /* synthetic */ AnonymousClass1VW(AnonymousClass00Y r1, int i, int i2, byte[] bArr, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = bArr;
        this.A02 = i3;
    }

    public final void run() {
        AnonymousClass00Y r5 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        byte[] bArr = this.A04;
        int i3 = this.A02;
        if (i == 1) {
            if (r5.A0H()) {
                r5.A04.A03(i2, bArr, i3);
                r5.A04.A01();
                r5.A05();
            }
        } else if (r5.A0F()) {
            r5.A05.A03(i2, bArr, i3);
            r5.A05.A01();
            r5.A0E(false);
            r5.A00.A01();
        }
    }
}
