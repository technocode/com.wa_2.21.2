package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.0hF  reason: invalid class name and case insensitive filesystem */
public class C11930hF {
    public final TextEmojiLabel A00;
    public final C014308b A01;
    public final AnonymousClass01X A02;
    public final AnonymousClass31y A03;

    public C11930hF(View view, int i, C014308b r4, AnonymousClass01X r5, AnonymousClass31y r6) {
        this((TextEmojiLabel) view.findViewById(i), r4, r5, r6);
    }

    public C11930hF(TextEmojiLabel textEmojiLabel, C014308b r2, AnonymousClass01X r3, AnonymousClass31y r4) {
        this.A00 = textEmojiLabel;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public void A00() {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setText(this.A02.A06(R.string.you));
        textEmojiLabel.setCompoundDrawables(null, null, null, null);
    }

    public void A01(int i) {
        if (i == 0) {
            this.A00.setCompoundDrawables(null, null, null, null);
        } else if (i == 1) {
            this.A00.A01(R.drawable.ic_verified);
        } else if (i == 2) {
            this.A00.A01(R.drawable.ic_verified_large);
        }
    }

    public void A02(C007003k r4) {
        TextEmojiLabel textEmojiLabel;
        if (r4.A0B()) {
            textEmojiLabel = this.A00;
            textEmojiLabel.A01(R.drawable.ic_verified);
        } else {
            textEmojiLabel = this.A00;
            textEmojiLabel.setCompoundDrawables(null, null, null, null);
        }
        if (AnonymousClass1VY.A0a(r4.A09)) {
            textEmojiLabel.setTextColor(C004302a.A00(textEmojiLabel.getContext(), R.color.list_item_verified_title));
        } else {
            textEmojiLabel.setTextColor(C004302a.A00(textEmojiLabel.getContext(), R.color.list_item_title));
        }
    }

    public void A03(C007003k r5, List list) {
        String A08;
        if (r5.A0B()) {
            A08 = C014308b.A02(r5, false);
        } else {
            A08 = this.A01.A08(r5, false);
        }
        this.A00.A04(A08, list, false, 256);
        A01(r5.A0B() ? 1 : 0);
    }

    public void A04(CharSequence charSequence, List list) {
        if (!(this instanceof C11920hE)) {
            this.A00.A04(charSequence, list, false, 0);
        } else {
            ((C11920hE) this).A05(charSequence, list, null);
        }
    }
}
