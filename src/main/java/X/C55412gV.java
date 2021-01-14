package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.2gV  reason: invalid class name and case insensitive filesystem */
public class C55412gV extends AbstractC16300pa {
    public int A00 = 2;
    public List A01;
    public boolean A02 = false;
    public final Context A03;
    public final LayoutInflater A04;
    public final AnonymousClass1PN A05;
    public final C014308b A06;
    public final AnonymousClass0YX A07;
    public final AnonymousClass01X A08;
    public final AnonymousClass31y A09;

    public C55412gV(Context context, C014308b r4, AnonymousClass01X r5, AnonymousClass1PN r6, AnonymousClass31y r7, AnonymousClass0YX r8) {
        this.A03 = context;
        this.A04 = LayoutInflater.from(context);
        this.A06 = r4;
        this.A08 = r5;
        this.A05 = r6;
        this.A09 = r7;
        this.A07 = r8;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        List list = this.A01;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i = this.A00;
        return (size <= i || this.A02) ? size : i + 1;
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C55402gU(this.A06, this.A08, this.A09, this.A04.inflate(R.layout.group_invite_row, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r11, int i) {
        int size;
        C55402gU r112 = (C55402gU) r11;
        if (this.A02 || i != this.A00) {
            List list = this.A01;
            if (list != null) {
                AnonymousClass2RW r5 = (AnonymousClass2RW) list.get(i);
                C007003k r4 = r5.A00;
                r112.A03.A03(r4, null);
                ImageView imageView = r112.A00;
                StringBuilder sb = new StringBuilder();
                sb.append(this.A05.A01(R.string.transition_avatar));
                sb.append(AnonymousClass1VY.A0D(r4.A09));
                AnonymousClass0Q7.A0g(imageView, sb.toString());
                AnonymousClass0YX r3 = this.A07;
                r3.A02(r4, r112.A00);
                if (r4.A07() && r4.A0O != null) {
                    r112.A01.setVisibility(0);
                    TextEmojiLabel textEmojiLabel = r112.A01;
                    StringBuilder A0S = AnonymousClass008.A0S("~");
                    A0S.append(r4.A0O);
                    textEmojiLabel.A02(A0S.toString());
                }
                if (r4.A0L != null) {
                    r112.A02.setVisibility(0);
                    r112.A02.A02(r4.A0L);
                } else {
                    r112.A02.setVisibility(8);
                }
                r112.A0H.setOnClickListener(new ViewOnClickEBaseShape1S0300000_I1(this, r4, r5, 12));
                r3.A02(r4, r112.A00);
                return;
            }
            return;
        }
        List list2 = this.A01;
        if (list2 == null) {
            size = 0;
        } else {
            size = list2.size();
        }
        int i2 = size - this.A00;
        C11930hF r8 = r112.A03;
        r8.A00.setText(this.A08.A0A(R.plurals.n_more, (long) i2, Integer.valueOf(i2)));
        C11930hF r2 = r112.A03;
        r2.A00.setTextColor(C004302a.A00(this.A03, R.color.list_item_sub_title));
        r112.A02.setVisibility(8);
        r112.A00.setImageResource(R.drawable.ic_more_participants);
        r112.A0H.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 33));
    }
}
