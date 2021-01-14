package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ct  reason: invalid class name and case insensitive filesystem */
public class C53322ct extends AbstractC16300pa {
    public int A00 = -1;
    public List A01 = new ArrayList();
    public final /* synthetic */ AnonymousClass2ND A02;

    public C53322ct(AnonymousClass2ND r2) {
        this.A02 = r2;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A01.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        AnonymousClass2ND r4 = this.A02;
        C53332cu r3 = new C53332cu(LayoutInflater.from(r4.A06.getContext()).inflate(R.layout.shape_picker_subcategory_item, viewGroup, false));
        r4.A01(r3, r4.A00);
        r3.A0H.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r3, 43));
        return r3;
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r10, int i) {
        C53332cu r102 = (C53332cu) r10;
        int i2 = 0;
        boolean z = false;
        if (this.A00 == i) {
            z = true;
        }
        AnonymousClass2ND r4 = this.A02;
        AnonymousClass01X r6 = r4.A07;
        if (!(r4 instanceof C53342cv)) {
            ImageView imageView = r102.A01;
            imageView.setImageResource(C53302cr.A01[i]);
            float f = 0.55f;
            if (z) {
                f = 1.0f;
            }
            imageView.setAlpha(f);
            r102.A0H.setContentDescription(r6.A06(C53302cr.A02[i]));
        } else {
            C53342cv r42 = (C53342cv) r4;
            boolean z2 = r42.A01;
            if (!z2 || i != 0) {
                List list = r42.A03;
                if (z2) {
                    i--;
                }
                AnonymousClass33N r7 = (AnonymousClass33N) list.get(i);
                String str = r7.A0D;
                ImageView imageView2 = r102.A01;
                if (!str.equals(imageView2.getTag())) {
                    r42.A02.A0J(r7, new C71843Qn(imageView2, str));
                    r102.A0H.setContentDescription(r6.A0D(R.string.shape_picker_sticker_pack_subcategory_content_description, r7.A0F));
                }
            } else {
                ImageView imageView3 = r102.A01;
                imageView3.setTag(null);
                imageView3.setImageResource(R.drawable.ic_stickers_recents);
                r102.A0H.setContentDescription(r6.A06(R.string.shape_picker_recents_subcategory_content_description));
            }
        }
        View view = r102.A00;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void A08() {
        ShapePickerRecyclerView shapePickerRecyclerView = this.A02.A08;
        GridLayoutManager gridLayoutManager = shapePickerRecyclerView.A06;
        if (gridLayoutManager != null) {
            int A0r = gridLayoutManager.A0r();
            GridLayoutManager gridLayoutManager2 = shapePickerRecyclerView.A06;
            if (gridLayoutManager2 != null) {
                int A0t = gridLayoutManager2.A0t();
                int i = 0;
                if (A0r != 0) {
                    int adapterItemCount = shapePickerRecyclerView.getAdapterItemCount();
                    int i2 = -1;
                    if (A0t == adapterItemCount - 1) {
                        i = this.A01.size() - 1;
                    } else {
                        int i3 = Integer.MAX_VALUE;
                        while (i < this.A01.size()) {
                            int abs = Math.abs(((Number) this.A01.get(i)).intValue() - A0r);
                            if (abs < i3) {
                                i2 = i;
                                i3 = abs;
                            }
                            i++;
                        }
                        i = i2;
                    }
                }
                A09(i);
                return;
            }
            throw new IllegalStateException("Must set adapter first");
        }
        throw new IllegalStateException("Must set adapter first");
    }

    public final void A09(int i) {
        int i2 = this.A00;
        AnonymousClass2ND r4 = this.A02;
        LinearLayoutManager linearLayoutManager = r4.A03;
        int A0s = linearLayoutManager.A0s();
        int A0u = linearLayoutManager.A0u();
        this.A00 = i;
        A02(i2);
        A02(this.A00);
        int max = Math.max(this.A00 - ((A0u - A0s) >> 1), 0);
        AbstractC16520pw r1 = r4.A05;
        if (max != r1.A00) {
            r1.A00 = max;
            linearLayoutManager.A0Z(r1);
        }
    }
}
