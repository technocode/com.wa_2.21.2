package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.33R  reason: invalid class name */
public abstract class AnonymousClass33R {
    public void A00(List list) {
        if (this instanceof C71713Qa) {
            Collections.sort(list, new AnonymousClass33P(true));
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = ((C71713Qa) this).A00;
            ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A06 = list;
            stickerStoreFeaturedTabFragment.A02 = false;
            C71823Ql r0 = ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A05;
            if (r0 == null) {
                C74133aD r2 = new C74133aD(stickerStoreFeaturedTabFragment, list);
                ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A05 = r2;
                RecyclerView recyclerView = ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A04;
                if (recyclerView != null) {
                    recyclerView.setLayoutFrozen(false);
                    recyclerView.A0i(r2, true, true);
                    recyclerView.A0t(true);
                    recyclerView.requestLayout();
                }
                stickerStoreFeaturedTabFragment.A0n();
            } else {
                r0.A00 = list;
                ((AbstractC16300pa) r0).A01.A00();
            }
            stickerStoreFeaturedTabFragment.A0n();
        } else if (!(this instanceof AnonymousClass3QQ)) {
            C54382ep r4 = (C54382ep) this;
            StringBuilder A0S = AnonymousClass008.A0S("EmojiAndGifPopupWindow/getInstalledStickerPacksAsync/onStickerPackReady/got sticker pack: ");
            A0S.append(list.size());
            Log.d(A0S.toString());
            if (list.size() == 0) {
                C03570Gt r3 = r4.A00.A0a;
                RunnableEBaseShape10S0100000_I1_5 runnableEBaseShape10S0100000_I1_5 = new RunnableEBaseShape10S0100000_I1_5(r4, 0);
                if (r3.A0C.A04(AnonymousClass1XO.A0I, 1048576, true, false, 0, false, false)) {
                    Log.d("StickerRepository/downloadInitialPackAsync/autodownload is safe, going to get downloadable metadata");
                    AnonymousClass3QQ r1 = new AnonymousClass3QQ(r3, runnableEBaseShape10S0100000_I1_5);
                    Log.d("StickerRepository/getDownloadableStickerPacksAsync/begin");
                    r3.A0R.ANC(new C09790dX(r3, r1), new Object[0]);
                    return;
                }
                Log.i("StickerRepository/downloadInitialPackAsync/autodownload is not safe, going to do nothing");
                return;
            }
            Log.d("EmojiAndGifPopupWindow/there are sticker packs already/setPref to true and showing sticker tab");
            C59842oN r32 = r4.A00;
            AnonymousClass008.A0n(((AnonymousClass1MI) r32).A05, "sticker_picker_initial_download", true);
            r32.A0B();
        } else {
            AnonymousClass3QQ r12 = (AnonymousClass3QQ) this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass33N r33 = (AnonymousClass33N) it.next();
                if (r33.A0D.equals("whatsappcuppy")) {
                    C03570Gt r22 = r12.A00;
                    if (r22.A0C.A04(AnonymousClass1XO.A0I, r33.A08, true, false, 0, false, false)) {
                        Log.d("StickerRepository/downloadInitialPackAsync/autodownload is safe, going to get downloadable sticker packs");
                        r22.A0I(r33, new AnonymousClass3Q9(r12.A01));
                        return;
                    }
                    Log.i("StickerRepository/downloadInitialPackAsync/autodownload is not safe, going to do nothing");
                }
            }
        }
    }
}
