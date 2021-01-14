package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3QO  reason: invalid class name */
public class AnonymousClass3QO extends AbstractC16300pa {
    public int A00;
    public int A01;
    public View A02;
    public RecyclerView A03;
    public AnonymousClass33O A04;
    public C71773Qg A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final AbstractC16450pp A09 = new AnonymousClass3QM(this);
    public final AnonymousClass0D1 A0A;
    public final StickerView A0B;
    public final C664334g A0C;
    public final boolean A0D;
    public final boolean A0E;

    public AnonymousClass3QO(C664334g r3, AnonymousClass0D1 r4, int i, int i2, boolean z, boolean z2, StickerView stickerView) {
        this.A0A = r4;
        this.A0C = r3;
        this.A07 = i;
        this.A06 = i2;
        this.A00 = 0;
        this.A08 = R.drawable.sticker_store_error;
        this.A0D = z;
        this.A0E = z2;
        this.A0B = stickerView;
        if (stickerView != null) {
            stickerView.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 39));
            stickerView.setOnLongClickListener(new AnonymousClass331(this));
        }
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        int i;
        AnonymousClass33N r1 = this.A04.A02;
        if (r1 == null) {
            return 0;
        }
        if (r1.A0N || (r1.A0E == null && !r1.A04.isEmpty())) {
            i = r1.A04.size();
        } else {
            i = r1.A03.size();
        }
        int i2 = this.A00;
        return i2 > 0 ? Math.min(i, i2) : i;
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        AnonymousClass3QP r3 = new AnonymousClass3QP(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_store_preview, viewGroup, false));
        ImageView imageView = r3.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i2 = this.A07;
        layoutParams.height = i2;
        layoutParams.width = i2;
        imageView.setLayoutParams(layoutParams);
        int i3 = this.A06;
        imageView.setPadding(i3, i3, i3, i3);
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0.get(r14) == false) goto L_0x0018;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r13, int r14) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QO.A07(X.0hD, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2.getVisibility() != 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.A03
            if (r0 == 0) goto L_0x0026
            com.whatsapp.stickers.StickerView r2 = r3.A0B
            if (r2 == 0) goto L_0x000f
            int r1 = r2.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0025
            if (r2 == 0) goto L_0x0025
            android.view.View r1 = r3.A02
            r0 = 0
            r1.setVisibility(r0)
            r0 = 4
            r2.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r3.A03
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
        L_0x0025:
            return
        L_0x0026:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QO.A08():void");
    }

    public final void A09() {
        if (this.A03 != null) {
            StickerView stickerView = this.A0B;
            if (stickerView != null) {
                this.A02.setVisibility(4);
                stickerView.setVisibility(0);
                this.A03.setAlpha(0.2f);
                return;
            }
            return;
        }
        throw null;
    }

    public final void A0A() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            StickerView stickerView = this.A0B;
            if (stickerView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
                int i = marginLayoutParams.leftMargin;
                int i2 = marginLayoutParams.rightMargin;
                int width = this.A03.getWidth();
                int height = this.A03.getHeight();
                AbstractC11910hD A0C2 = this.A03.A0C(this.A01);
                if (A0C2 == null) {
                    A08();
                    return;
                }
                View view = A0C2.A0H;
                this.A02 = view;
                float width2 = (((float) this.A02.getWidth()) / 2.0f) + view.getX() + ((float) i);
                float y = this.A02.getY();
                float max = Math.max(width2 - (((float) stickerView.getWidth()) / 2.0f), 0.0f);
                float max2 = Math.max(((((float) this.A02.getHeight()) / 2.0f) + y) - (((float) stickerView.getHeight()) / 2.0f), 0.0f);
                stickerView.setX(max - Math.max(((((float) stickerView.getWidth()) + max) - ((float) width)) - ((float) i2), 0.0f));
                stickerView.setY(max2 - Math.max((((float) stickerView.getHeight()) + max2) - ((float) height), 0.0f));
                return;
            }
            return;
        }
        throw null;
    }

    public void A0B(int i, C29241Xq r12, AnonymousClass33N r13) {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            AbstractC11910hD A0C2 = recyclerView.A0C(i);
            if (A0C2 == null) {
                A08();
                return;
            }
            View view = A0C2.A0H;
            this.A02 = view;
            ImageView imageView = (ImageView) view.findViewById(R.id.sticker_preview);
            this.A01 = i;
            A0A();
            StickerView stickerView = this.A0B;
            if (stickerView == null) {
                return;
            }
            if (!A0D(r12, r13) || !r13.A0K) {
                stickerView.setImageDrawable(imageView.getDrawable());
                A09();
                return;
            }
            this.A0A.A06(r12, 1, stickerView, stickerView.getWidth(), stickerView.getHeight(), true, false, new AnonymousClass3Q7(this));
            A09();
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r1 != 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(int r6) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QO.A0C(int):boolean");
    }

    public final boolean A0D(C29241Xq r2, AnonymousClass33N r3) {
        if (r2 == null || r2.A07 == null) {
            return false;
        }
        return this.A0E || !r3.A01();
    }
}
