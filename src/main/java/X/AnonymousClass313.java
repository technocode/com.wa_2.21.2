package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import java.util.ArrayList;

/* renamed from: X.313  reason: invalid class name */
public abstract class AnonymousClass313 extends FrameLayout {
    public ViewGroup A00 = ((ViewGroup) AnonymousClass0Q7.A0D(this, R.id.search_message_attachment_container_content));
    public ViewGroup A01 = ((ViewGroup) AnonymousClass0Q7.A0D(this, R.id.search_message_attachment_container_icon));

    public AnonymousClass313(Context context) {
        super(context);
        FrameLayout.inflate(getContext(), R.layout.search_message_attachment_container, this);
    }

    public void A00() {
        View view;
        LinearLayout linearLayout;
        if (this instanceof AnonymousClass3ZU) {
            AnonymousClass3ZU r0 = (AnonymousClass3ZU) this;
            r0.A01 = new AnonymousClass315(r0.getContext(), r0.A05, r0.A02, r0.A09, r0.A03, r0.A06, r0.A04, r0.A08, r0.A07);
            int dimensionPixelSize = r0.getResources().getDimensionPixelSize(R.dimen.search_attachment_height_regular);
            r0.A01.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            view = r0.A01;
        } else if (this instanceof AnonymousClass3ZT) {
            AnonymousClass3ZT r02 = (AnonymousClass3ZT) this;
            int dimensionPixelSize2 = r02.getResources().getDimensionPixelSize(R.dimen.search_attachment_height_regular);
            r02.A01 = new WaImageView(r02.getContext());
            r02.A01.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
            view = r02.A01;
        } else if (!(this instanceof AnonymousClass3ZX)) {
            AnonymousClass3ZS r03 = (AnonymousClass3ZS) this;
            Context context = r03.getContext();
            r03.A04 = new FrameLayout(context);
            int dimensionPixelSize3 = r03.getResources().getDimensionPixelSize(R.dimen.search_attachment_icon_size);
            r03.A00 = r03.getResources().getDimensionPixelSize(R.dimen.contact_card_border_size);
            r03.A02 = r03.getResources().getDimensionPixelSize(R.dimen.contact_card_radius);
            r03.A04.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            r03.A06 = r03.A01(context, dimensionPixelSize3);
            r03.A05 = r03.A01(context, dimensionPixelSize3);
            ArrayList arrayList = new ArrayList();
            r03.A09 = arrayList;
            arrayList.add(r03.A06);
            r03.A09.add(r03.A05);
            r03.A01 = r03.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin);
            int dimensionPixelSize4 = r03.getResources().getDimensionPixelSize(R.dimen.search_attachment_contact_offset);
            r03.A03 = dimensionPixelSize4;
            AnonymousClass0SE.A07(r03.A0D, r03.A05, dimensionPixelSize4, 0, 0, 0);
            r03.A04.addView(r03.A05);
            r03.A04.addView(r03.A06);
            view = r03.A04;
        } else {
            AnonymousClass3ZX r04 = (AnonymousClass3ZX) this;
            r04.A00 = new WaImageView(r04.getContext());
            int dimensionPixelSize5 = r04.getResources().getDimensionPixelSize(R.dimen.search_attachment_icon_size);
            int dimensionPixelSize6 = r04.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize5, dimensionPixelSize5);
            layoutParams.setMargins(dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6);
            r04.A00.setLayoutParams(layoutParams);
            r04.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
            view = r04.A00;
        }
        if (view != null) {
            this.A01.addView(view);
        }
        if (this instanceof AnonymousClass3ZU) {
            AnonymousClass3ZU r05 = (AnonymousClass3ZU) this;
            r05.A00 = new C656730w(r05.getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int dimensionPixelSize7 = r05.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin);
            AnonymousClass0SE.A08(r05.A06, r05.A00, dimensionPixelSize7, 0, dimensionPixelSize7, 0);
            r05.A00.setLayoutParams(layoutParams2);
            linearLayout = r05.A00;
        } else if (this instanceof AnonymousClass3ZT) {
            AnonymousClass3ZT r06 = (AnonymousClass3ZT) this;
            linearLayout = new LinearLayout(r06.getContext());
            linearLayout.setOrientation(1);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 16;
            linearLayout.setLayoutParams(layoutParams3);
            int dimensionPixelSize8 = r06.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin);
            AnonymousClass0SE.A08(r06.A04, linearLayout, dimensionPixelSize8, 0, dimensionPixelSize8, 0);
            r06.A00 = LayoutInflater.from(r06.getContext()).inflate(R.layout.suspicious_link_indicator, (ViewGroup) linearLayout, false);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = C008805h.A02(r06.getContext(), 4.0f);
            layoutParams4.bottomMargin = C008805h.A02(r06.getContext(), 4.0f);
            r06.A00.setLayoutParams(layoutParams4);
            r06.A00.setVisibility(8);
            r06.A02 = new C656730w(r06.getContext());
            r06.A02.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout.addView(r06.A02);
            linearLayout.addView(r06.A00);
        } else if (!(this instanceof AnonymousClass3ZX)) {
            AnonymousClass3ZS r07 = (AnonymousClass3ZS) this;
            r07.A07 = new C656730w(r07.getContext());
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
            AnonymousClass0SE.A08(r07.A0D, r07.A07, 0, 0, r07.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin), 0);
            r07.A07.setLayoutParams(layoutParams5);
            linearLayout = r07.A07;
        } else {
            AnonymousClass3ZX r08 = (AnonymousClass3ZX) this;
            r08.A01 = new C656730w(r08.getContext());
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
            AnonymousClass0SE.A08(r08.A02, r08.A01, 0, 0, r08.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin), 0);
            r08.A01.setLayoutParams(layoutParams6);
            linearLayout = r08.A01;
        }
        if (linearLayout != null) {
            this.A00.addView(linearLayout);
        }
    }
}
