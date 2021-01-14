package X;

/* renamed from: X.3Vy  reason: invalid class name and case insensitive filesystem */
public class C73223Vy extends AbstractRunnableC20910xi {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass04B A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73223Vy(AnonymousClass04B r2, String str, int i, int i2, byte[] bArr) {
        super("updateDataTaskUploadProgressCallback");
        this.A02 = r2;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = bArr;
    }

    public void run() {
        this.A02.updateDataTaskUploadProgressCallback(this.A03, (long) this.A00, (long) this.A01, (long) this.A04.length);
    }
}
