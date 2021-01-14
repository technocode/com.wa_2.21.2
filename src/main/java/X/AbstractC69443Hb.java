package X;

import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;
import com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow;
import java.util.List;

/* renamed from: X.3Hb  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC69443Hb extends AbstractC11910hD {
    public AbstractC69443Hb(View view) {
        super(view);
    }

    public void A0C(AbstractC63232w5 r15, int i) {
        View peerPaymentTransactionRow;
        if (this instanceof C73613Ya) {
            ((C73613Ya) this).A00.setText(((C69473He) r15).A00);
        } else if (this instanceof AnonymousClass3YX) {
            AnonymousClass3YX r4 = (AnonymousClass3YX) this;
            C69563Hn r152 = (C69563Hn) r15;
            r4.A01.setImageDrawable(C002001d.A0b(r4.A0H.getContext(), r152.A00, r152.A01));
            r4.A02.setText(r152.A04);
            if (r152.A05) {
                r4.A00.setVisibility(8);
                return;
            }
            r4.A00.setText(r152.A03);
            r4.A00.setOnClickListener(r152.A02);
        } else if (this instanceof AnonymousClass3YW) {
            AnonymousClass3YW r2 = (AnonymousClass3YW) this;
            C69553Hm r153 = (C69553Hm) r15;
            r2.A01.setText(r153.A00);
            r2.A02.setText(r153.A01);
            r2.A00.setVisibility(0);
        } else if (this instanceof AnonymousClass3YV) {
            AnonymousClass3YV r3 = (AnonymousClass3YV) this;
            r3.A01.setText(((C69543Hl) r15).A00);
            C002001d.A2m(r3.A00, C004302a.A00(r3.A0H.getContext(), R.color.fb_pay_hub_icon_tint));
        } else if (this instanceof AnonymousClass3YU) {
            AnonymousClass3YU r5 = (AnonymousClass3YU) this;
            C69533Hk r154 = (C69533Hk) r15;
            byte[] bArr = r154.A09;
            if (bArr != null) {
                r5.A01.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            }
            r5.A04.setText(r154.A03);
            String str = r154.A04;
            if (str != null) {
                r5.A03.setText(str);
            }
            TextView textView = r5.A03;
            int i2 = 0;
            if (r154.A04 == null) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            if (r154.A08) {
                r5.A02.setVisibility(0);
                ((ImageView) AnonymousClass0Q7.A0D(r5.A02, R.id.warning_icon)).setImageDrawable(C002001d.A0b(r5.A0H.getContext(), r154.A00, r154.A01));
                ((TextView) AnonymousClass0Q7.A0D(r5.A02, R.id.warning_message)).setText(r154.A06);
                if (r154.A07) {
                    r5.A00.setVisibility(0);
                    r5.A00.setText(r154.A05);
                    r5.A00.setOnClickListener(r154.A02);
                    return;
                }
                r5.A00.setVisibility(8);
                return;
            }
            r5.A02.setVisibility(8);
        } else if (!(this instanceof AnonymousClass3YT)) {
            if (this instanceof C74823bY) {
                AnonymousClass3YL r9 = (AnonymousClass3YL) this;
                C69523Hj r155 = (C69523Hj) r15;
                ImageView imageView = r9.A03;
                View view = r9.A0H;
                C002001d.A2m(imageView, C004302a.A00(view.getContext(), R.color.fb_pay_hub_icon_tint));
                String str2 = r155.A02;
                String str3 = r155.A01;
                View.OnClickListener onClickListener = r155.A00;
                r9.A08 = str2;
                r9.A07 = str3;
                r9.A00 = onClickListener;
                List list = r9.A09;
                list.clear();
                r9.A04.removeAllViews();
                list.addAll(r155.A03);
                r9.A0D();
                for (int i3 = 0; i3 < Math.min(list.size(), 2); i3++) {
                    AnonymousClass0MH r22 = (AnonymousClass0MH) list.get(i3);
                    LinearLayout linearLayout = r9.A04;
                    int size = list.size();
                    C63752wx r32 = new C63752wx(view.getContext());
                    if (r22 != null) {
                        long j = r22.A04;
                        if (j > 0) {
                            r32.A01.setText(C001801b.A0e(r32.A03, r32.A02.A06(j)));
                        }
                        r32.A00.setText(r32.A04.A09(r22));
                        int i4 = size - 1;
                        View findViewById = r32.findViewById(R.id.divider);
                        if (i3 < i4) {
                            findViewById.setVisibility(0);
                        } else {
                            findViewById.setVisibility(8);
                        }
                        linearLayout.addView(r32);
                    } else {
                        throw null;
                    }
                }
            } else if (this instanceof C74813bX) {
                C74813bX r92 = (C74813bX) this;
                C73713Yk r156 = (C73713Yk) r15;
                r92.A00 = r156.A01;
                String str4 = r156.A04;
                if (str4 != null) {
                    ((AnonymousClass3YL) r92).A06.setText(str4);
                    ((AnonymousClass3YL) r92).A06.setVisibility(0);
                }
                ImageView imageView2 = ((AnonymousClass3YL) r92).A03;
                View view2 = r92.A0H;
                C002001d.A2m(imageView2, C004302a.A00(view2.getContext(), R.color.settings_icon));
                String str5 = r156.A03;
                String str6 = r156.A02;
                View.OnClickListener onClickListener2 = r156.A00;
                ((AnonymousClass3YL) r92).A08 = str5;
                ((AnonymousClass3YL) r92).A07 = str6;
                ((AnonymousClass3YL) r92).A00 = onClickListener2;
                List list2 = ((AnonymousClass3YL) r92).A09;
                list2.clear();
                ((AnonymousClass3YL) r92).A04.removeAllViews();
                list2.addAll(r156.A05);
                r92.A0D();
                for (int i5 = 0; i5 < Math.min(list2.size(), 2); i5++) {
                    AnonymousClass0MH r23 = (AnonymousClass0MH) list2.get(i5);
                    LinearLayout linearLayout2 = ((AnonymousClass3YL) r92).A04;
                    int size2 = list2.size();
                    if (r23.A02 != 1000 || !r23.A0L) {
                        peerPaymentTransactionRow = new PeerPaymentTransactionRow(view2.getContext());
                    } else {
                        peerPaymentTransactionRow = LayoutInflater.from(view2.getContext()).inflate(R.layout.payment_transaction_interop_shimmer, (ViewGroup) linearLayout2, false);
                    }
                    if (peerPaymentTransactionRow instanceof PeerPaymentTransactionRow) {
                        PeerPaymentTransactionRow peerPaymentTransactionRow2 = (PeerPaymentTransactionRow) peerPaymentTransactionRow;
                        peerPaymentTransactionRow2.A0H = r92.A00;
                        peerPaymentTransactionRow2.A2H(r23);
                    } else if (peerPaymentTransactionRow instanceof PaymentInteropShimmerRow) {
                        ((PaymentInteropShimmerRow) peerPaymentTransactionRow).A2H(r23);
                    }
                    int i6 = size2 - 1;
                    View findViewById2 = peerPaymentTransactionRow.findViewById(R.id.divider);
                    if (i5 < i6) {
                        findViewById2.setVisibility(0);
                    } else {
                        findViewById2.setVisibility(8);
                    }
                    linearLayout2.addView(peerPaymentTransactionRow);
                }
            } else if (!(this instanceof AnonymousClass3YP)) {
                AnonymousClass3YM r52 = (AnonymousClass3YM) this;
                C69463Hd r157 = (C69463Hd) r15;
                ImageView imageView3 = r52.A00;
                View view3 = r52.A0H;
                imageView3.setImageDrawable(C002001d.A0b(view3.getContext(), r157.A00, r157.A01));
                r52.A01.setText(r157.A03);
                view3.setOnClickListener(r157.A02);
            } else {
                AnonymousClass3YP r24 = (AnonymousClass3YP) this;
                C73703Yj r158 = (C73703Yj) r15;
                r24.A00.setText(r158.A01);
                r24.A0H.setOnClickListener(r158.A00);
            }
        }
    }
}
