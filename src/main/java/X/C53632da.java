package X;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2da  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53632da implements AbstractC47662Jb {
    public final /* synthetic */ C53732dk A00;

    public /* synthetic */ C53632da(C53732dk r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC47662Jb
    public final void AER(Object obj) {
        TextView textView;
        C53732dk r5 = this.A00;
        C48902Of r7 = (C48902Of) obj;
        C48862Ob r1 = r7.A01.A00;
        r5.A02 = r1.A01;
        r5.A03 = r1.A02;
        if (r5.A01 instanceof AnonymousClass0ZJ) {
            textView = r5.A09;
            textView.setTypeface(null, 2);
        } else {
            textView = r5.A09;
            textView.setTypeface(null, 0);
        }
        r5.A07.setText(r7.A02);
        textView.setText(r7.A00);
        if (r7.A01.A04) {
            r5.A0B.A05.A09(r5.A01, r5.A06, new C53722dj(r5));
        } else {
            ImageView imageView = r5.A06;
            imageView.setVisibility(0);
            imageView.setImageDrawable(C002001d.A0b(imageView.getContext(), R.drawable.ic_group_invite_link, R.color.white_alpha_80));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setScaleX(1.5f);
            imageView.setScaleY(1.5f);
            imageView.setBackgroundColor(C004302a.A00(imageView.getContext(), R.color.media_link_thumbnail_background));
        }
        String str = r7.A01.A00.A00;
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = r5.A0A;
            textView2.setText(str);
            textView2.setVisibility(0);
            return;
        }
        r5.A0A.setVisibility(8);
    }
}
