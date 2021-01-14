package X;

import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1wy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42601wy implements AnonymousClass0SG {
    public final /* synthetic */ OrderDetailFragment A00;

    public /* synthetic */ C42601wy(OrderDetailFragment orderDetailFragment) {
        this.A00 = orderDetailFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        OrderDetailFragment orderDetailFragment = this.A00;
        AnonymousClass1SG r13 = (AnonymousClass1SG) obj;
        orderDetailFragment.A01.setVisibility(8);
        C460327p r0 = orderDetailFragment.A08;
        List<AnonymousClass1SJ> list = r13.A02;
        if (r0 != null) {
            int i = 0;
            for (AnonymousClass1SJ r02 : list) {
                i += r02.A00;
            }
            TextView textView = orderDetailFragment.A03;
            AnonymousClass01X r4 = orderDetailFragment.A0H;
            textView.setText(r4.A0A(R.plurals.products_total_quantity, (long) i, Integer.valueOf(i)));
            orderDetailFragment.A02.setText(orderDetailFragment.A08.A02(list));
            orderDetailFragment.A05.setAdapter(new C42561wu(r4, orderDetailFragment.A06, list, orderDetailFragment));
            orderDetailFragment.A00.setVisibility(0);
            TextView textView2 = orderDetailFragment.A04;
            C42611wz r3 = orderDetailFragment.A07;
            if (r3 != null) {
                long A06 = r3.A06.A06(TimeUnit.SECONDS.toMillis(r13.A00));
                AnonymousClass01X r7 = r3.A07;
                String A0c = C001801b.A0c(r7, A06);
                String A002 = AnonymousClass0OZ.A00(r7, A06);
                textView2.setText(AnonymousClass0OZ.A01(r7, r3.A02.getString(R.string.order_sent_date_and_time, A0c, A002), A06));
                return;
            }
            throw null;
        }
        throw null;
    }
}
