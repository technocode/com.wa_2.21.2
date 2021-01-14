package X;

/* renamed from: X.3Vz  reason: invalid class name and case insensitive filesystem */
public class C73233Vz extends AbstractRunnableC20910xi {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass04B A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73233Vz(AnonymousClass04B r2, String str, int i, int i2, int i3) {
        super("updateDataTaskDownloadProgressCallback");
        this.A03 = r2;
        this.A04 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public void run() {
        this.A03.updateDataTaskDownloadProgressCallback(this.A04, (long) this.A02, (long) this.A01, (long) this.A00);
    }
}
