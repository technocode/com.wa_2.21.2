package X;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2wk  reason: invalid class name and case insensitive filesystem */
public class C63632wk extends FrameLayout {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();

    public C63632wk(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.payment_card_view, (ViewGroup) this, true);
        setBottomDividerSpaceVisibility(0);
        this.A02 = (TextView) findViewById(R.id.card_name);
        this.A03 = (TextView) findViewById(R.id.card_number);
        this.A01 = (ImageView) findViewById(R.id.card_network_icon);
        this.A00 = (ImageView) findViewById(R.id.card_view_background);
        this.A00.setImageDrawable(new C63612wi(context));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00.setClipToOutline(true);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + ((int) (((float) (View.MeasureSpec.getSize(i) - (getPaddingRight() + getPaddingLeft()))) * 0.62f)), 1073741824));
    }

    public void setBottomDividerSpaceVisibility(int i) {
        float f = 0.0f;
        if (i == 0) {
            f = 24.0f;
        }
        setPadding(C008805h.A02(getContext(), 24.0f), 0, C008805h.A02(getContext(), 24.0f), C008805h.A02(getContext(), f));
    }

    public void setCard(C43761yu r8) {
        String str;
        int A07;
        TextView textView = this.A02;
        AnonymousClass01X r5 = this.A04;
        Object[] objArr = new Object[2];
        int i = r8.A01;
        if (i != 1) {
            str = i != 2 ? i != 3 ? i != 4 ? null : "Discover" : "American Express" : "MasterCard";
        } else {
            str = "Visa";
        }
        objArr[0] = str;
        objArr[1] = AnonymousClass1VM.A02(r8.A00);
        textView.setText(r5.A0D(R.string.fb_pay_card_name, objArr));
        this.A03.setText(r5.A0D(R.string.fb_pay_card_number, r8.A0A));
        ImageView imageView = this.A01;
        if (r8.A01 == 0) {
            A07 = R.drawable.card_default;
        } else {
            A07 = C28051Sr.A07(r8);
        }
        imageView.setImageResource(A07);
    }

    public void setCardNameTextViewVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public void setCardNetworkIconVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public void setCardNumberTextColor(int i) {
        this.A03.setTextColor(i);
    }
}
