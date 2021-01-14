package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversationslist.ViewHolder;

/* renamed from: X.2al  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52212al implements AbstractC47662Jb {
    public final /* synthetic */ C12000hO A00;

    public /* synthetic */ C52212al(C12000hO r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC47662Jb
    public final void AER(Object obj) {
        C12000hO r6 = this.A00;
        C47742Jj r0 = (C47742Jj) obj;
        AbstractC007503q r5 = r0.A02;
        C007003k r4 = r0.A00;
        C007003k r3 = r0.A01;
        AnonymousClass01X r12 = r6.A05;
        ViewHolder viewHolder = r6.A0C;
        View view = viewHolder.A05;
        Context context = r6.A01;
        AnonymousClass0SE.A08(r12, view, context.getResources().getDimensionPixelSize(R.dimen.list_row_padding), 0, 0, 0);
        View view2 = viewHolder.A04;
        view2.setVisibility(8);
        viewHolder.A0E.setVisibility(8);
        viewHolder.A0D.setVisibility(8);
        viewHolder.A0A.setVisibility(8);
        viewHolder.A0C.setVisibility(8);
        viewHolder.A0B.setVisibility(8);
        viewHolder.A09.setVisibility(8);
        viewHolder.A03.setVisibility(8);
        viewHolder.A07.setVisibility(8);
        TextEmojiLabel textEmojiLabel = viewHolder.A0M;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setTextColor(C004302a.A00(context, R.color.list_item_sub_title));
        textEmojiLabel.setTypeface(null, 0);
        textEmojiLabel.setPlaceholder(0);
        AnonymousClass2I3 r02 = viewHolder.A00;
        r02.A01.A01.setTextColor(C004302a.A00(context, R.color.list_item_sub_title));
        viewHolder.A00.A01.A01.setVisibility(0);
        ImageView imageView = viewHolder.A08;
        imageView.setEnabled(false);
        imageView.setOnClickListener(null);
        imageView.setOnLongClickListener(null);
        view2.setOnClickListener(null);
        view2.setOnLongClickListener(null);
        ((AbstractC11910hD) viewHolder).A0H.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(r6, r5, 7));
        viewHolder.A00.A01(r4, r6.A04.A8O(), r6.A0I);
        viewHolder.A00.A00.A02(r4);
        r6.A03(r5, r4, r3);
    }
}
