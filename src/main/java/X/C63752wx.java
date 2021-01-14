package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2wx  reason: invalid class name and case insensitive filesystem */
public class C63752wx extends FrameLayout {
    public TextView A00;
    public TextView A01;
    public AnonymousClass00S A02 = AnonymousClass00S.A00();
    public AnonymousClass01X A03 = AnonymousClass01X.A00();
    public C02150Av A04 = C02150Av.A02();

    public C63752wx(Context context) {
        super(context);
        FrameLayout.inflate(getContext(), R.layout.payout_transaction_row, this);
        this.A01 = (TextView) AnonymousClass0Q7.A0D(this, R.id.date);
        this.A00 = (TextView) AnonymousClass0Q7.A0D(this, R.id.amount);
    }
}
