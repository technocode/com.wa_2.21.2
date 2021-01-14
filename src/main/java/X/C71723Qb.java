package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;

/* renamed from: X.3Qb  reason: invalid class name and case insensitive filesystem */
public class C71723Qb extends AbstractC11910hD {
    public final /* synthetic */ StickerStoreFeaturedTabFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71723Qb(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment, View view) {
        super(view);
        this.A00 = stickerStoreFeaturedTabFragment;
        C002301g.A03((TextView) view.findViewById(R.id.get_more_packs_text));
        view.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 41));
    }
}
