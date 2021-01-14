package X;

import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0201000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;

/* renamed from: X.3Ql  reason: invalid class name and case insensitive filesystem */
public class C71823Ql extends AbstractC16300pa {
    public List A00;
    public final /* synthetic */ StickerStoreTabFragment A01;

    public C71823Ql(StickerStoreTabFragment stickerStoreTabFragment, List list) {
        this.A01 = stickerStoreTabFragment;
        this.A00 = list;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        View inflate = stickerStoreTabFragment.A01.inflate(R.layout.sticker_store_row, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.sticker_row_recycler);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.A0j(new C71813Qk(stickerStoreTabFragment.A02().getDimensionPixelSize(R.dimen.sticker_store_row_preview_padding)));
        int dimensionPixelSize = stickerStoreTabFragment.A02().getDimensionPixelSize(R.dimen.sticker_store_row_preview_item);
        if (stickerStoreTabFragment.A00 == 0) {
            stickerStoreTabFragment.A00 = Math.min(5, Math.max(viewGroup.getWidth() / dimensionPixelSize, 1));
        }
        return new C71833Qm(stickerStoreTabFragment, inflate);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r14, int i) {
        String str;
        C71833Qm r142 = (C71833Qm) r14;
        AnonymousClass33N r3 = (AnonymousClass33N) this.A00.get(i);
        r142.A0A.setText(r3.A0H);
        long j = r3.A08;
        if (j > 0) {
            TextView textView = r142.A0B;
            textView.setText(C002001d.A1Y(this.A01.A09, j));
            textView.setVisibility(0);
            r142.A01.setVisibility(0);
        } else {
            r142.A0B.setVisibility(8);
            r142.A01.setVisibility(8);
        }
        r142.A0C.setText(r3.A0F);
        View view = r142.A02;
        view.setClickable(true);
        view.setOnClickListener(new ViewOnClickEBaseShape0S0201000_I1(this, r3, i, 6));
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        int dimensionPixelSize = stickerStoreTabFragment.A02().getDimensionPixelSize(R.dimen.sticker_store_row_preview_item);
        if (r142.A00 == null) {
            C664334g A04 = stickerStoreTabFragment.A0D.A04();
            AnonymousClass0D1 r7 = stickerStoreTabFragment.A0A;
            if (!(stickerStoreTabFragment instanceof StickerStoreMyTabFragment)) {
                str = "sticker_store_featured_tab";
            } else {
                str = "sticker_store_my_tab";
            }
            r142.A00 = new AnonymousClass3QO(A04, r7, dimensionPixelSize, 0, false, "sticker_store_my_tab".equals(str), null);
        }
        AnonymousClass33O r1 = new AnonymousClass33O();
        r1.A02 = r3;
        r1.A01 = new SparseBooleanArray();
        r1.A00 = new SparseBooleanArray();
        AnonymousClass3QO r0 = r142.A00;
        r0.A04 = r1;
        int i2 = stickerStoreTabFragment.A00;
        r0.A00 = i2;
        r142.A0E.A1N(i2);
        ((AbstractC16300pa) r142.A00).A01.A00();
        r142.A0F.setAdapter(r142.A00);
        r142.A0D.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r3, 37));
        if (r3.A0M) {
            r142.A05.setVisibility(0);
        } else {
            r142.A05.setVisibility(8);
        }
    }
}
