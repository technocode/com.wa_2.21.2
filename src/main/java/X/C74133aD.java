package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;

/* renamed from: X.3aD  reason: invalid class name and case insensitive filesystem */
public class C74133aD extends C71823Ql {
    public Drawable.ConstantState A00;
    public final /* synthetic */ StickerStoreFeaturedTabFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74133aD(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment, List list) {
        super(stickerStoreFeaturedTabFragment, list);
        this.A01 = stickerStoreFeaturedTabFragment;
    }

    @Override // X.C71823Ql, X.AbstractC16300pa
    public int A05() {
        int A05 = super.A05();
        int i = A05 + 1;
        if (A05 <= 0) {
            return 0;
        }
        return i;
    }

    @Override // X.C71823Ql, X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return super.A06(viewGroup, i);
        }
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
        return new C71723Qb(stickerStoreFeaturedTabFragment, LayoutInflater.from(stickerStoreFeaturedTabFragment.A00()).inflate(R.layout.sticker_store_get_more_footer, viewGroup, false));
    }

    @Override // X.C71823Ql, X.AbstractC16300pa
    public void A07(AbstractC11910hD r9, int i) {
        Drawable.ConstantState constantState;
        if (A00(i) == 0) {
            C71833Qm r92 = (C71833Qm) r9;
            super.A07(r92, i);
            AnonymousClass33N r3 = (AnonymousClass33N) ((C71823Ql) this).A00.get(i);
            int i2 = 8;
            if (r3.A0K) {
                r92.A05.setVisibility(0);
            } else {
                r92.A05.setVisibility(8);
            }
            if (r3.A01()) {
                r92.A04.setVisibility(0);
                r92.A06.setVisibility(8);
                r92.A08.setVisibility(8);
                r92.A07.setVisibility(8);
                if (r3.A05) {
                    r92.A0D.setVisibility(4);
                    r92.A09.setVisibility(0);
                } else {
                    r92.A09.setVisibility(4);
                    r92.A0D.setVisibility(0);
                }
            } else if (r3.A05) {
                r92.A06.setVisibility(8);
                r92.A04.setVisibility(4);
                ProgressBar progressBar = r92.A08;
                progressBar.setVisibility(0);
                progressBar.setIndeterminate(true);
            } else if (r3.A02 != null) {
                ImageView imageView = r92.A06;
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.countrypicker_checkmark);
                imageView.setOnClickListener(null);
                imageView.setContentDescription(((StickerStoreTabFragment) this.A01).A09.A06(R.string.sticker_store_downloaded_content_description));
                imageView.setClickable(false);
                imageView.setFocusable(true);
                if (this.A00 == null) {
                    this.A00 = imageView.getBackground().mutate().getConstantState();
                }
                imageView.setBackgroundResource(0);
                r92.A08.setVisibility(8);
                r92.A04.setVisibility(4);
            } else {
                r92.A04.setVisibility(4);
                ImageView imageView2 = r92.A06;
                imageView2.setVisibility(0);
                r92.A08.setVisibility(8);
                imageView2.setImageResource(R.drawable.sticker_store_download);
                if (imageView2.getBackground() == null && (constantState = this.A00) != null) {
                    imageView2.setBackground(constantState.newDrawable(this.A01.A02()));
                }
                imageView2.setContentDescription(((StickerStoreTabFragment) this.A01).A09.A06(R.string.sticker_store_download_pack_content_description));
                imageView2.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r3, 35));
            }
            View view = r92.A03;
            if (!r3.A05 && r3.A02 == null && r3.A06) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }
}
