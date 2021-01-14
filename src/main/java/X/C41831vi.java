package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1vi  reason: invalid class name and case insensitive filesystem */
public class C41831vi extends AbstractC16300pa {
    public List A00 = new ArrayList();
    public final C27701Rb A01;
    public final CartFragment A02;
    public final AnonymousClass1S0 A03;
    public final AnonymousClass01X A04;

    public C41831vi(C27701Rb r2, AnonymousClass01X r3, AnonymousClass1S0 r4, CartFragment cartFragment) {
        this.A03 = r4;
        this.A02 = cartFragment;
        this.A01 = r2;
        this.A04 = r3;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C41841vj(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_cart_item, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r9, int i) {
        String string;
        C41841vj r92 = (C41841vj) r9;
        C27711Rc r2 = (C27711Rc) this.A00.get(i);
        TextView textView = r92.A04;
        C48052Ks r7 = r2.A01;
        textView.setText(r7.A08);
        r92.A03.setText(String.valueOf(r2.A00));
        TextView textView2 = r92.A02;
        BigDecimal bigDecimal = r7.A09;
        C05910Qz r4 = r7.A01;
        AnonymousClass01X r3 = this.A04;
        Context context = textView2.getContext();
        if (bigDecimal == null || r4 == null) {
            string = context.getString(R.string.ask_for_price);
        } else {
            string = r4.A03(r3, bigDecimal, true);
        }
        textView2.setText(string);
        ImageView imageView = r92.A01;
        if (!A09(r7, imageView)) {
            C27701Rb r0 = this.A01;
            C48052Ks A022 = r0.A0C.A02(r7.A06);
            if (A022 == null || !A09(A022, imageView)) {
                imageView.setBackgroundResource(R.color.light_gray);
                imageView.setImageResource(R.drawable.ic_product_image_loading);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
            }
        }
        r92.A0H.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r2, 10));
        r92.A00.setOnClickListener(new C41821vh(this, r2));
    }

    public int A08() {
        int i = 0;
        for (C27711Rc r0 : this.A00) {
            i = (int) (((long) i) + r0.A00);
        }
        return i;
    }

    public final boolean A09(C48052Ks r15, ImageView imageView) {
        List list = r15.A0A;
        if (list.isEmpty() || r15.A00()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            C48072Ku r1 = (C48072Ku) list.get(i);
            if (r1 != null) {
                String str = r1.A04;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = r1.A02;
                    AnonymousClass1S0 r12 = this.A03;
                    imageView.setBackgroundResource(R.color.light_gray);
                    imageView.setImageResource(R.drawable.ic_product_image_loading);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (TextUtils.isEmpty(str)) {
                        return true;
                    }
                    r12.A02(new C48072Ku(str2, str, null, 0, 0), 2, C35221jz.A00, null, C35241k1.A00, imageView);
                    return true;
                }
            }
        }
        return false;
    }
}
