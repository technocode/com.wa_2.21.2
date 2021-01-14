package X;

import android.util.SparseBooleanArray;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;

/* renamed from: X.3Qi  reason: invalid class name and case insensitive filesystem */
public class C71793Qi extends AnonymousClass0JW {
    public final int A00;
    public final AnonymousClass33N A01;
    public final /* synthetic */ StickerStorePackPreviewActivity A02;

    public C71793Qi(StickerStorePackPreviewActivity stickerStorePackPreviewActivity, int i, AnonymousClass33N r3) {
        this.A02 = stickerStorePackPreviewActivity;
        this.A00 = i;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A02;
        AnonymousClass33O r0 = stickerStorePackPreviewActivity.A0G;
        int i = this.A00;
        SparseBooleanArray sparseBooleanArray = r0.A01;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.put(i, true);
        }
        stickerStorePackPreviewActivity.A0H.A02(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r1 != null) goto L_0x008d;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.Object[] r8) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71793Qi.A02(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C29241Xq r5 = (C29241Xq) obj;
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A02;
        AnonymousClass33O r0 = stickerStorePackPreviewActivity.A0G;
        int i = this.A00;
        SparseBooleanArray sparseBooleanArray = r0.A01;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.put(i, false);
        }
        stickerStorePackPreviewActivity.A0H.A02(i);
        stickerStorePackPreviewActivity.A0H.A0B(i, r5, this.A01);
    }
}
