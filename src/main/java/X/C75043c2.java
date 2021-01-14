package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* renamed from: X.3c2  reason: invalid class name and case insensitive filesystem */
public class C75043c2 extends AbstractC60272p5 implements AnonymousClass1W7 {
    public final C29241Xq A00;
    public final AnonymousClass0I1 A01 = new AnonymousClass0I1();
    public final File A02;
    public final /* synthetic */ AnonymousClass0HC A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75043c2(AnonymousClass0HC r9, C29241Xq r10, File file) {
        super(r9.A03, r9.A02, r9.A07, r9.A04, r9.A05, r9.A00.A06);
        this.A03 = r9;
        this.A00 = r10;
        this.A02 = file;
    }

    public AnonymousClass1W8 A02() {
        if (this.A03.A06.A0B(null, null, new AnonymousClass3QH(this), false, this.A00.A0A, this)) {
            try {
                return (AnonymousClass1W8) this.A01.get();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e);
                return new AnonymousClass1W8(1);
            }
        } else {
            A1j(this);
            return A00().A00;
        }
    }

    @Override // X.AnonymousClass1W7
    public void AFF(boolean z) {
        AnonymousClass008.A1G("StickerBitmapNetworkFetcher/cancelled transferred = ", z);
    }

    @Override // X.AnonymousClass1W7
    public void AFG(AnonymousClass1W8 r3, C49982Sy r4) {
        StringBuilder A0S = AnonymousClass008.A0S("StickerBitmapNetworkFetcher/completed result = ");
        A0S.append(r3.toString());
        Log.d(A0S.toString());
    }
}
