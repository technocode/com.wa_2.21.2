package X;

import android.util.Pair;
import android.util.SparseBooleanArray;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.3QU  reason: invalid class name */
public class AnonymousClass3QU extends AnonymousClass0JW {
    public final AnonymousClass3QC A00;
    public final AnonymousClass0H0 A01;
    public final C03570Gt A02;

    public AnonymousClass3QU(C03570Gt r1, AnonymousClass3QC r2, AnonymousClass0H0 r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        Pair[] pairArr = (Pair[]) objArr;
        if (pairArr != null) {
            Pair pair = pairArr[0];
            if (pair != null) {
                return this.A02.A03((String) pair.first, ((Boolean) pair.second).booleanValue());
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass33N r12 = (AnonymousClass33N) obj;
        if (r12 != null) {
            AnonymousClass0H0 r0 = this.A01;
            r12.A05 = r0.A01.containsKey(r12.A0D);
        }
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A00.A00;
        AnonymousClass33O r1 = stickerStorePackPreviewActivity.A0G;
        r1.A02 = r12;
        r1.A01 = new SparseBooleanArray();
        r1.A00 = new SparseBooleanArray();
        stickerStorePackPreviewActivity.A0M = new HashMap();
        if (r12 != null) {
            stickerStorePackPreviewActivity.A0N = null;
            AnonymousClass3QA r13 = new AnonymousClass3QA(stickerStorePackPreviewActivity, r12);
            Log.d("StickerStorePackPreviewActivity/getStarredStickerListAsync/begin");
            C71783Qh r3 = new C71783Qh(r13, stickerStorePackPreviewActivity.A0V);
            stickerStorePackPreviewActivity.A0X.ANC(r3, r12);
            for (int i = 0; i < r12.A04.size(); i++) {
                stickerStorePackPreviewActivity.A0M.put(((C29241Xq) r12.A04.get(i)).A0A, Integer.valueOf(i));
            }
        }
        if (stickerStorePackPreviewActivity.A0H == null) {
            AnonymousClass3QO r32 = new AnonymousClass3QO(stickerStorePackPreviewActivity.A0V.A04(), stickerStorePackPreviewActivity.A0S, stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.sticker_store_preview_item), stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.sticker_store_preview_padding), true, "sticker_store_my_tab".equals(stickerStorePackPreviewActivity.getIntent().getStringExtra("sticker_pack_preview_source")), stickerStorePackPreviewActivity.A0J);
            stickerStorePackPreviewActivity.A0H = r32;
            r32.A05 = stickerStorePackPreviewActivity.A0W;
            stickerStorePackPreviewActivity.A0B.setAdapter(r32);
        }
        AnonymousClass3QO r14 = stickerStorePackPreviewActivity.A0H;
        r14.A04 = stickerStorePackPreviewActivity.A0G;
        ((AbstractC16300pa) r14).A01.A00();
        stickerStorePackPreviewActivity.A0U();
    }
}
