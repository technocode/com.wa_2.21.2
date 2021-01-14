package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.3HJ  reason: invalid class name */
public class AnonymousClass3HJ extends AbstractC16300pa implements AnonymousClass1O2 {
    public List A00;
    public final Context A01;
    public final /* synthetic */ PaymentTransactionHistoryActivity A02;

    public AnonymousClass3HJ(PaymentTransactionHistoryActivity paymentTransactionHistoryActivity, Context context, List list) {
        this.A02 = paymentTransactionHistoryActivity;
        this.A01 = context;
        this.A00 = new ArrayList(list);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == 2000) {
            return new AnonymousClass3HI(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_interop_shimmer, viewGroup, false));
        }
        return new AnonymousClass3HK(this.A02, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_row_container, viewGroup, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a8, code lost:
        if (r8.A02(((X.AnonymousClass0MH) r10.A00.get(r12)).A04).equals(r8.A02(((X.AnonymousClass0MH) r10.A00.get(r3)).A04)) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b0, code lost:
        if (r3 == r10.A00.size()) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b2, code lost:
        r11.A00.findViewById(com.google.android.search.verification.client.R.id.divider).setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c0, code lost:
        if (r7.A09 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c2, code lost:
        r0 = r7.A0E.A09(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c8, code lost:
        if (r0 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ca, code lost:
        r8 = r0.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ce, code lost:
        r5 = r7.A0P;
        r3 = r5.A0D(r6);
        r0 = r7.A09;
        r2 = ((X.AnonymousClass2C0) r7).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00dd, code lost:
        if (X.AnonymousClass1YB.A04(r8, r0, r2, true) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00df, code lost:
        r2 = r11.A00;
        r2.A09.A04(r8, r11.A01.A09, false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f3, code lost:
        if (X.AnonymousClass1YB.A04(r3, r7.A09, r2, true) == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f5, code lost:
        r2 = r11.A00;
        r2.A0A.A04(r3, r11.A01.A09, false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0100, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0101, code lost:
        r3 = r5.A09(r6);
        r2 = r11.A00;
        r2.A08.A04(r3, r11.A01.A09, false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0110, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r11, int r12) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HJ.A07(X.0hD, int):void");
    }

    @Override // X.AnonymousClass1O2
    public int A5V(int i) {
        return ((C63222w4) this.A02.A0R.get(i)).count;
    }

    @Override // X.AnonymousClass1O2
    public int A6d() {
        return this.A02.A0R.size();
    }

    @Override // X.AnonymousClass1O2
    public long A6e(int i) {
        return -((Calendar) this.A02.A0R.get(i)).getTimeInMillis();
    }

    @Override // X.AnonymousClass1O2
    public void ADX(AbstractC11910hD r3, int i) {
        ((AnonymousClass3HH) r3).A00.setText(this.A02.A0R.get(i).toString());
    }

    @Override // X.AnonymousClass1O2
    public AbstractC11910hD AEj(ViewGroup viewGroup) {
        View inflate = this.A02.getLayoutInflater().inflate(R.layout.transaction_history_section_row, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(C004302a.A00(this.A01, R.color.primary_surface));
        return new AnonymousClass3HH(inflate);
    }

    @Override // X.AnonymousClass1O2
    public boolean AKa(AbstractC11910hD r2, int i, MotionEvent motionEvent) {
        return false;
    }
}
