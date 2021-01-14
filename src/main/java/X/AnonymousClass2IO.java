package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.2IO  reason: invalid class name */
public class AnonymousClass2IO {
    public float A00;
    public View A01;
    public ImageView A02;
    public AnonymousClass0M3 A03;
    public final ImageView A04;
    public final LinearLayout A05;
    public final TextView A06;
    public final AnonymousClass2IK A07;
    public final StickerView A08;
    public final /* synthetic */ C60442pR A09;

    public AnonymousClass2IO(C60442pR r12, View view) {
        this.A09 = r12;
        this.A08 = (StickerView) view.findViewById(R.id.sticker_image);
        this.A06 = (TextView) view.findViewById(R.id.date);
        this.A04 = (ImageView) view.findViewById(R.id.status);
        this.A07 = new AnonymousClass2IK(view, r12.A02, r12.A0Z, r12.A0a, r12.A0b, r12.A0n, r12.A1E, r12.A05, r12.A07, r12.A06);
        this.A05 = (LinearLayout) view.findViewById(R.id.date_wrapper);
    }

    public final void A00() {
        View view = this.A01;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        AnonymousClass2IL r1 = new AnonymousClass2IL(this, this.A09.getContext());
        this.A01 = r1;
        r1.setClickable(true);
        this.A01.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 21));
        ((ViewGroup) this.A08.getParent()).addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
    }

    public void A01(AnonymousClass0M3 r13, boolean z) {
        ImageView imageView;
        boolean z2;
        this.A03 = r13;
        C60442pR r7 = this.A09;
        AbstractC43421yL rowsContainer = r7.getRowsContainer();
        if (rowsContainer == null || !rowsContainer.AAO()) {
            View view = this.A01;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            A00();
            this.A01.setSelected(r7.getRowsContainer().ABK(r13));
        }
        ColorStateList colorStateList = null;
        if (r13 != null) {
            if (z) {
                if (rowsContainer != null) {
                    z2 = rowsContainer.ABf(r13);
                    StickerView stickerView = this.A07.A0M;
                    if (z2) {
                        stickerView.A01 = new C51782a1(rowsContainer, r13);
                    } else {
                        stickerView.A01 = null;
                    }
                } else {
                    z2 = false;
                }
                this.A07.A08 = z2;
            }
            AnonymousClass2IK r4 = this.A07;
            r4.A03((AnonymousClass0ZE) r13, z);
            AnonymousClass0M4 r5 = r13.A02;
            if (r5 != null) {
                TextView textView = this.A06;
                AnonymousClass01X r9 = r7.A0n;
                textView.setText(AnonymousClass0OZ.A00(r9, r7.A0l.A06(r13.A0E)));
                LinearLayout linearLayout = this.A05;
                if (linearLayout != null) {
                    if (r13.A0j) {
                        if (this.A02 == null) {
                            this.A02 = new ImageView(r7.getContext());
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.gravity = 16;
                            this.A02.setLayoutParams(layoutParams);
                            AnonymousClass0SE.A06(r9, this.A02, 0, C002301g.A0K.A0H);
                            linearLayout.addView(this.A02, 0);
                            linearLayout.setClipChildren(false);
                        }
                        this.A02.setImageDrawable(r7.getStarDrawable());
                        this.A02.setVisibility(0);
                    } else {
                        ImageView imageView2 = this.A02;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                    }
                }
                C007303n r8 = r13.A0n;
                boolean z3 = r8.A02;
                if (z3 && (imageView = this.A04) != null) {
                    int A0F = r7.A0F(((AbstractC007503q) r13).A08);
                    int A0G = r7.A0G(((AbstractC007503q) r13).A08);
                    if (A0G != 0) {
                        colorStateList = C004302a.A02(r7.getContext(), A0G);
                    }
                    AnonymousClass0N2.A1E(imageView, colorStateList);
                    imageView.setImageResource(A0F);
                }
                if (r5.A0a && !r5.A0Y) {
                    r4.A01();
                } else if ((!r5.A0P || (r5.A0X && !z3)) && (!r13.A0f || !z3 || AnonymousClass1VY.A0T(r8.A00))) {
                    r4.A00();
                } else {
                    r4.A02();
                }
                this.A08.setOnLongClickListener(new View$OnLongClickListenerC47362Hn(this, rowsContainer, r13));
                return;
            }
            throw null;
        }
        StickerView stickerView2 = this.A08;
        stickerView2.setImageDrawable(null);
        stickerView2.setOnLongClickListener(null);
    }
}
