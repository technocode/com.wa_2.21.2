package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2wl  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC63642wl extends LinearLayout {
    public int A00 = 2;
    public View.OnClickListener A01;
    public ViewGroup A02;
    public FrameLayout A03;
    public ImageView A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public CharSequence A08;
    public CharSequence A09;
    public final List A0A = new ArrayList();

    public AbstractC63642wl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.payment_expandable_listview, (ViewGroup) this, true);
        setOrientation(1);
        this.A07 = (TextView) AnonymousClass0Q7.A0D(this, R.id.header);
        this.A02 = (ViewGroup) AnonymousClass0Q7.A0D(this, R.id.see_more_container);
        this.A04 = (ImageView) AnonymousClass0Q7.A0D(this, R.id.see_more_icon);
        this.A06 = (TextView) AnonymousClass0Q7.A0D(this, R.id.see_more_text);
        this.A03 = (FrameLayout) AnonymousClass0Q7.A0D(this, R.id.custom_empty_view_container);
        this.A05 = (LinearLayout) AnonymousClass0Q7.A0D(this, R.id.list_item_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C61212so.A1h);
            try {
                this.A00 = obtainStyledAttributes.getInt(2, 2);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId > 0) {
                    this.A04.setImageDrawable(context.getResources().getDrawable(resourceId));
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 > 0) {
                    this.A06.setText(resourceId2);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void A00(List list) {
        PeerPaymentTransactionRow peerPaymentTransactionRow;
        List list2 = this.A0A;
        list2.clear();
        this.A05.removeAllViews();
        if (list.size() > this.A00) {
            this.A02.setVisibility(0);
            this.A06.setText(this.A09);
            this.A02.setOnClickListener(this.A01);
        } else if (!list.isEmpty()) {
            this.A02.setVisibility(8);
            this.A03.setVisibility(8);
        } else if (this.A03.getChildCount() > 0) {
            this.A03.setVisibility(0);
        } else {
            this.A02.setVisibility(0);
            this.A06.setText(this.A08);
            this.A02.setOnClickListener(null);
        }
        list2.addAll(list.subList(0, Math.min(list.size(), this.A00)));
        for (int i = 0; i < list2.size(); i++) {
            TransactionsExpandableView transactionsExpandableView = (TransactionsExpandableView) this;
            AnonymousClass0MH r8 = (AnonymousClass0MH) list.get(i);
            C63762wy r6 = transactionsExpandableView.A00;
            if (r6 != null) {
                if (r8.A02 != 1000 || !r8.A0L) {
                    Context context = r6.A00;
                    AbstractC61092sU r0 = r6.A01;
                    PeerPaymentTransactionRow peerPaymentTransactionRow2 = new PeerPaymentTransactionRow(context);
                    peerPaymentTransactionRow2.A0H = r0;
                    peerPaymentTransactionRow = peerPaymentTransactionRow2;
                } else {
                    peerPaymentTransactionRow = LayoutInflater.from(r6.A00).inflate(R.layout.payment_transaction_interop_shimmer, (ViewGroup) transactionsExpandableView, false);
                }
                Object obj = list.get(i);
                int size = list2.size();
                AnonymousClass0MH r82 = (AnonymousClass0MH) obj;
                if (transactionsExpandableView.A00 != null) {
                    peerPaymentTransactionRow.A2H(r82);
                    int i2 = size - 1;
                    View findViewById = peerPaymentTransactionRow.findViewById(R.id.divider);
                    if (i < i2) {
                        findViewById.setVisibility(0);
                    } else {
                        findViewById.setVisibility(8);
                    }
                    this.A05.addView(peerPaymentTransactionRow);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public ImageView getSeeMoreImageView() {
        return this.A04;
    }

    public int getSizeLimit() {
        return this.A00;
    }

    public void setCustomEmptyView(View view) {
        this.A03.addView(view);
    }

    public void setTitle(CharSequence charSequence) {
        this.A07.setText(charSequence);
        this.A07.setVisibility(0);
    }
}
