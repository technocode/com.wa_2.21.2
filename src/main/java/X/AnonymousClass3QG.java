package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3QG  reason: invalid class name */
public class AnonymousClass3QG extends AbstractC16300pa {
    public int A00 = 0;
    public long A01 = 0;
    public AnonymousClass33K A02;
    public List A03;
    public boolean A04 = false;
    public final LayoutInflater A05;
    public final AnonymousClass01X A06;
    public final AnonymousClass0D1 A07;
    public final AnonymousClass33U A08;
    public final Integer A09;
    public final HashMap A0A = new HashMap();

    public AnonymousClass3QG(List list, Context context, AnonymousClass0D1 r5, AnonymousClass01X r6, AnonymousClass33U r7, Integer num) {
        this.A05 = LayoutInflater.from(context);
        this.A06 = r6;
        this.A07 = r5;
        this.A08 = r7;
        this.A09 = num;
        A08(list);
        A04(true);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        List list = this.A03;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C71863Qp(this.A07, this.A06, this.A05, viewGroup, this.A08, this.A09);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r13, int i) {
        C29241Xq r0;
        C71863Qp r132 = (C71863Qp) r13;
        List list = this.A03;
        if (list != null) {
            C29241Xq r4 = (C29241Xq) list.get(i);
            boolean z = this.A04;
            if (z != r132.A03) {
                r132.A03 = z;
                if (!z) {
                    StickerView stickerView = r132.A08;
                    stickerView.A03 = false;
                    stickerView.A01();
                } else if (r132.A02) {
                    StickerView stickerView2 = r132.A08;
                    stickerView2.A03 = true;
                    stickerView2.A00();
                }
            }
            int i2 = this.A00;
            if (r4 == null || (r0 = r132.A01) == null || !r4.A0A.equals(r0.A0A)) {
                r132.A01 = r4;
                View view = r132.A0H;
                if (r4 == null) {
                    view.setOnClickListener(null);
                    r132.A08.setImageResource(0);
                    view.setBackgroundResource(0);
                    view.setClickable(false);
                } else {
                    view.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(r132, r4, 38));
                    view.setOnLongClickListener(r132.A04);
                    view.setBackgroundResource(R.drawable.selector_orange_gradient);
                    view.setContentDescription(r132.A05.A06(R.string.sticker_message_content_description));
                    StickerView stickerView3 = r132.A08;
                    int dimensionPixelSize = stickerView3.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_picker_item);
                    r132.A06.A06(r4, i2, stickerView3, dimensionPixelSize, dimensionPixelSize, true, true, new AnonymousClass3QB(r132));
                }
            }
            r132.A00 = new View$OnLongClickListenerC661132x(this, r4);
        }
    }

    public void A08(List list) {
        this.A03 = list;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29241Xq r5 = (C29241Xq) it.next();
                HashMap hashMap = this.A0A;
                if (hashMap.get(r5.A0A) == null) {
                    long j = this.A01;
                    this.A01 = 1 + j;
                    hashMap.put(r5.A0A, Long.valueOf(j));
                }
            }
        }
    }
}
