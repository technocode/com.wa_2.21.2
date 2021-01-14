package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.filter.FilterUtils;

/* renamed from: X.2dX  reason: invalid class name and case insensitive filesystem */
public class C53602dX extends AbstractC16300pa {
    public boolean A00 = false;
    public Bitmap[] A01;
    public boolean[] A02;
    public boolean[] A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Drawable A07;
    public final AnonymousClass01X A08 = AnonymousClass01X.A00();
    public final C59502nm A09 = C59502nm.A00();
    public final AnonymousClass2OT A0A;

    public C53602dX(Context context, AnonymousClass2OT r5) {
        this.A06 = context;
        this.A0A = r5;
        this.A04 = context.getResources().getDimension(R.dimen.filter_selected_thumb_height) / ((float) r5.A0J);
        this.A05 = context.getResources().getDimension(R.dimen.filter_selected_thumb_width) / ((float) r5.A0K);
        this.A07 = new ColorDrawable(C004302a.A00(context, R.color.camera_thumb));
        int size = FilterUtils.A00.size() - 1;
        this.A01 = new Bitmap[size];
        this.A03 = new boolean[size];
        this.A02 = new boolean[size];
        A08(0);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return FilterUtils.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new View$OnClickListenerC53592dW(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.filter_thumb_item, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r17, int i) {
        float f;
        View$OnClickListenerC53592dW r14 = (View$OnClickListenerC53592dW) r17;
        AnonymousClass2OT r7 = this.A0A;
        boolean z = false;
        if (i == r7.A02) {
            z = true;
        }
        boolean booleanValue = Boolean.valueOf(z).booleanValue();
        float f2 = 1.0f;
        if (booleanValue) {
            f = this.A05;
        } else {
            f = 1.0f;
        }
        if (booleanValue) {
            f2 = this.A04;
        }
        r14.A04.A03(booleanValue, false);
        View view = r14.A00;
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setPivotX(((float) r7.A0K) / 2.0f);
        view.setPivotY((float) r7.A0J);
        AnonymousClass01X r8 = this.A08;
        String A062 = r8.A06(((Number) FilterUtils.A00.get(i)).intValue());
        TextView textView = r14.A03;
        textView.setText(A062);
        ImageView imageView = r14.A02;
        imageView.setBackgroundDrawable(this.A07);
        imageView.setImageDrawable(null);
        View view2 = r14.A01;
        view2.setOnClickListener(r14);
        if (r7.A03 == null) {
            return;
        }
        if (i == 0) {
            ((AnonymousClass0JW) new C10540en(this.A06, r7, r8, this, i, this.A01, this.A03, this.A02, r14, this.A09)).A00.executeOnExecutor(r7.A0X, new Void[0]);
            return;
        }
        boolean[] zArr = this.A02;
        if (zArr[i - 1]) {
            ((AnonymousClass0JW) new C10540en(this.A06, r7, r8, this, i, this.A01, this.A03, zArr, r14, this.A09)).A00.executeOnExecutor(r7.A0X, new Void[0]);
        } else if (this.A00) {
            textView.setText(r8.A06(R.string.filter_loading));
            imageView.setBackgroundColor(C004302a.A00(this.A06, R.color.filter_loading_background_color));
            view2.setOnClickListener(null);
            imageView.setClickable(false);
        } else {
            textView.setText(r8.A06(R.string.filter_error));
            imageView.setClickable(true);
            view2.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 2));
        }
    }

    public void A08(int i) {
        this.A00 = true;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.A02;
            if (i2 < zArr.length) {
                if (!zArr[i2]) {
                    A02(i2);
                }
                i2++;
            } else {
                this.A09.A0M(i, new C53582dV(this));
                return;
            }
        }
    }
}
