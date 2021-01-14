package X;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

/* renamed from: X.32e  reason: invalid class name and case insensitive filesystem */
public class C659432e {
    public boolean A00;
    public final TextView A01;
    public final TextView A02;
    public final AnonymousClass02M A03 = AnonymousClass02M.A00();
    public final AnonymousClass01A A04 = AnonymousClass01A.A00();
    public final AnonymousClass0BP A05 = new C71603Pp(this);
    public final AnonymousClass08B A06 = AnonymousClass08B.A00;
    public final C014308b A07 = C014308b.A00();
    public final AnonymousClass0YX A08;
    public final AnonymousClass0L2 A09 = AnonymousClass0L2.A01();
    public final AnonymousClass00S A0A = AnonymousClass00S.A00();
    public final AnonymousClass00D A0B = AnonymousClass00D.A00();
    public final AnonymousClass01X A0C = AnonymousClass01X.A00();
    public final C71613Pq A0D;
    public final Runnable A0E = new RunnableEBaseShape12S0100000_I1_7(this, 45);

    public C659432e(ViewGroup viewGroup) {
        this.A08 = this.A09.A03(viewGroup.getContext());
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.status_details, viewGroup, true);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(16908298);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        TextView textView = (TextView) inflate.findViewById(16908292);
        this.A01 = textView;
        textView.setText(this.A0C.A06(this.A0B.A0k() ? R.string.no_one_saw_your_status : R.string.no_one_saw_your_status_because_you_disabled_read_receipts));
        this.A0D = new C71613Pq(this);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.title);
        this.A02 = textView2;
        C002301g.A03(textView2);
        recyclerView.setAdapter(this.A0D);
        this.A06.A01(this.A05);
    }

    public final void A00() {
        AnonymousClass02M r0 = this.A03;
        Runnable runnable = this.A0E;
        Handler handler = r0.A02;
        handler.removeCallbacks(runnable);
        C71613Pq r1 = this.A0D;
        if (r1.A05() > 0) {
            long j = 0;
            for (C659332d r02 : r1.A00) {
                long j2 = r02.A00;
                if (j2 > j) {
                    j = j2;
                }
            }
            handler.postDelayed(runnable, (AnonymousClass0OY.A01(j) - System.currentTimeMillis()) + 1000);
        }
    }
}
