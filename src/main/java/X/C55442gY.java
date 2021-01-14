package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.2gY  reason: invalid class name and case insensitive filesystem */
public class C55442gY extends AbstractC16300pa {
    public int A00;
    public List A01;
    public final /* synthetic */ C08840bo A02;

    public C55442gY(C08840bo r1) {
        this.A02 = r1;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        int size;
        int size2;
        List list = this.A01;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        List list2 = this.A01;
        if (list2 == null) {
            size2 = this.A00;
        } else {
            size2 = this.A00 - list2.size();
        }
        return (size2 <= 0 || size <= 0) ? size : size + 1;
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.A02.A01;
        if (i != 0) {
            return new C55452gZ(layoutInflater.inflate(R.layout.accept_invite_participant_count, viewGroup, false));
        }
        return new C55432gX(layoutInflater.inflate(R.layout.accept_invite_participant, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r9, int i) {
        int size;
        int A002 = A00(i);
        if (A002 == 0) {
            C55432gX r92 = (C55432gX) r9;
            C007003k r5 = (C007003k) this.A01.get(i);
            C08840bo r3 = this.A02;
            TextView textView = r92.A01;
            if (r3 != null) {
                if (!TextUtils.isEmpty(r5.A0F)) {
                    textView.setText(r5.A0F);
                    textView.setSingleLine(false);
                    textView.setTextColor(C004302a.A00(r3.A00, R.color.primary_text));
                } else if (r5.A0A()) {
                    textView.setText(C014308b.A02(r5, false));
                    textView.setSingleLine(false);
                    textView.setTextColor(C004302a.A00(r3.A00, R.color.primary_text));
                } else {
                    String A08 = r3.A0L.A08((AnonymousClass02N) r5.A02(AnonymousClass02N.class));
                    if (!TextUtils.isEmpty(A08)) {
                        textView.setSingleLine(false);
                        textView.setTextColor(C004302a.A00(r3.A00, R.color.primary_text));
                    } else if (!TextUtils.isEmpty(r5.A0O)) {
                        StringBuilder A0S = AnonymousClass008.A0S("~");
                        A0S.append(r5.A0O);
                        A08 = A0S.toString();
                        textView.setSingleLine(false);
                        textView.setTextColor(C004302a.A00(r3.A00, R.color.secondary_text));
                    } else {
                        A08 = r3.A0K.A0F(C12420i4.A00(r5));
                        textView.setSingleLine(true);
                        textView.setTextColor(C004302a.A00(r3.A00, R.color.primary_text));
                    }
                    textView.setText(A08);
                }
                textView.setEllipsize(TextUtils.TruncateAt.END);
                AnonymousClass0YX r32 = r3.A0E;
                r32.A04(r5, r92.A00, false, new C12260ho(r32.A04.A01, r5));
                return;
            }
            throw null;
        } else if (A002 == 1) {
            TextView textView2 = ((C55452gZ) r9).A00;
            AnonymousClass01X r52 = this.A02.A0K;
            Object[] objArr = new Object[1];
            List list = this.A01;
            if (list == null) {
                size = this.A00;
            } else {
                size = this.A00 - list.size();
            }
            objArr[0] = Integer.valueOf(size);
            textView2.setText(r52.A0D(R.string.additional_participant_count, objArr));
        }
    }
}
