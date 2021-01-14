package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.EmojiContainerView;

/* renamed from: X.2dJ  reason: invalid class name and case insensitive filesystem */
public class C53462dJ extends AbstractC11910hD {
    public int A00;
    public C03960Il A01;
    public final ImageView A02;
    public final EmojiContainerView A03;
    public final C02590Cr A04;
    public final AbstractC48682Nh A05;
    public final AnonymousClass022 A06;

    public C53462dJ(C02590Cr r4, AnonymousClass022 r5, ViewGroup viewGroup, LayoutInflater layoutInflater, AbstractC48682Nh r8, int i) {
        super(layoutInflater.inflate(R.layout.emoji_search_preview, viewGroup, false));
        this.A04 = r4;
        this.A05 = r8;
        this.A06 = r5;
        View view = this.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        this.A03 = (EmojiContainerView) view.findViewById(R.id.emoji_preview_container);
        this.A02 = (ImageView) view.findViewById(R.id.emoji);
        this.A03.setVisibility(0);
    }

    public final void A0C() {
        this.A02.setImageDrawable(this.A04.A02(this.A0H.getContext(), -1, new AnonymousClass2d1(this.A01.A00), 0.75f));
    }
}
