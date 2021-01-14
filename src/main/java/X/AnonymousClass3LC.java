package X;

/* renamed from: X.3LC  reason: invalid class name */
public class AnonymousClass3LC implements AbstractC03810Hu {
    public int A00 = 0;
    public boolean A01;
    public final AnonymousClass00D A02;
    public final /* synthetic */ C04510Kq A03;

    public AnonymousClass3LC(C04510Kq r3, AnonymousClass00D r4, C64522yK r5, boolean z) {
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = z;
        int i = (r5.A05 ? 1 : 0) + 0;
        this.A00 = i;
        int i2 = i + (r5.A03 ? 1 : 0);
        this.A00 = i2;
        int i3 = i2 + (r5.A04 ? 1 : 0);
        this.A00 = i3;
        this.A00 = i3 + (r5.A01 ? 1 : 0);
    }

    public synchronized void A00(int i) {
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (this.A01 && i2 == 0) {
            this.A03.A07.A0P("account_sync", null);
        }
        if (i == 1) {
            AnonymousClass008.A0j(this.A02, "account_sync_status_num_retries");
        } else if (i == 2) {
            AnonymousClass008.A0j(this.A02, "account_sync_picture_num_retries");
        } else if (i == 3) {
            AnonymousClass008.A0j(this.A02, "account_sync_privacy_num_retries");
        } else if (i == 4) {
            AnonymousClass008.A0j(this.A02, "account_sync_blocklist_num_retries");
        }
    }
}
