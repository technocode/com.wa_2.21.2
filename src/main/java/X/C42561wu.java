package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.1wu  reason: invalid class name and case insensitive filesystem */
public class C42561wu extends AbstractC16300pa {
    public final AnonymousClass1S0 A00;
    public final OrderDetailFragment A01;
    public final AnonymousClass01X A02;
    public final List A03;

    public C42561wu(AnonymousClass01X r1, AnonymousClass1S0 r2, List list, OrderDetailFragment orderDetailFragment) {
        this.A03 = list;
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = orderDetailFragment;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A03.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C42571wv(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_order_detail, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r19, int i) {
        String string;
        C42571wv r1 = (C42571wv) r19;
        AnonymousClass1SJ r2 = (AnonymousClass1SJ) this.A03.get(i);
        r1.A02.setText(r2.A03);
        BigDecimal bigDecimal = r2.A05;
        C05910Qz r6 = r2.A02;
        AnonymousClass01X r5 = this.A02;
        Context context = r1.A01.getContext();
        if (bigDecimal == null || r6 == null) {
            string = context.getString(R.string.ask_for_price);
        } else {
            string = r6.A03(r5, bigDecimal, true);
        }
        r1.A01.setText(r1.A01.getContext().getString(R.string.order_item_price_quantity, string, Integer.valueOf(r2.A00)));
        ImageView imageView = r1.A00;
        AnonymousClass1SL r4 = r2.A01;
        AnonymousClass1S0 r52 = this.A00;
        imageView.setBackgroundResource(R.color.light_gray);
        imageView.setImageResource(R.drawable.ic_product_image_loading);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (r4 != null) {
            String str = r4.A01;
            if (!TextUtils.isEmpty(str)) {
                r52.A02(new C48072Ku(r4.A00, str, null, 0, 0), 2, C35221jz.A00, null, C35241k1.A00, imageView);
            }
        }
        r1.A0H.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r2, 12));
    }
}
