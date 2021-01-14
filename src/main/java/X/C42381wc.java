package X;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

/* renamed from: X.1wc  reason: invalid class name and case insensitive filesystem */
public class C42381wc implements AnonymousClass2UK {
    public final /* synthetic */ CatalogMediaViewFragment A00;

    @Override // X.AnonymousClass2UK
    public void A3f(int i) {
    }

    @Override // X.AnonymousClass2UK
    public void AGD() {
    }

    public C42381wc(CatalogMediaViewFragment catalogMediaViewFragment) {
        this.A00 = catalogMediaViewFragment;
    }

    @Override // X.AnonymousClass2UK
    public AnonymousClass02R A3V(int i) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        ViewGroup viewGroup = (ViewGroup) catalogMediaViewFragment.A05().inflate(R.layout.media_view_photo, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.footer);
        C463929x r10 = new C463929x(this, catalogMediaViewFragment.A01());
        r10.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 33));
        if (i == catalogMediaViewFragment.A00) {
            AnonymousClass0Q7.A0g(r10, AnonymousClass008.A0K("thumb-transition-", AnonymousClass1S6.A01(catalogMediaViewFragment.A02.A06, i)));
        }
        int i2 = 0;
        viewGroup.addView(r10, 0);
        ((PhotoView) r10).A01 = 0.2f;
        r10.A0Y = true;
        if (1 == 0) {
            r10.A02();
        }
        catalogMediaViewFragment.A01.A01((C48072Ku) catalogMediaViewFragment.A02.A0A.get(i), 1, new C42371wb(catalogMediaViewFragment, r10, i), null, r10);
        if (!TextUtils.isEmpty(catalogMediaViewFragment.A02.A03)) {
            MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) catalogMediaViewFragment.A05().inflate(R.layout.media_view_caption, (ViewGroup) null);
            viewGroup2.addView(mediaCaptionTextView, 0);
            viewGroup2.setBackground(new ColorDrawable(C004302a.A00(catalogMediaViewFragment.A01(), R.color.media_view_footer_background)));
            mediaCaptionTextView.setCaptionText(catalogMediaViewFragment.A02.A03);
        }
        if (!((MediaViewBaseFragment) catalogMediaViewFragment).A0G) {
            i2 = 8;
        }
        viewGroup2.setVisibility(i2);
        return new AnonymousClass02R(viewGroup, AnonymousClass1S6.A01(catalogMediaViewFragment.A02.A06, i));
    }

    @Override // X.AnonymousClass2UK
    public int A8T(Object obj) {
        int i = 0;
        while (true) {
            CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
            if (i >= catalogMediaViewFragment.A02.A0A.size()) {
                return 0;
            }
            if (AnonymousClass1S6.A01(catalogMediaViewFragment.A02.A06, i).equals(obj)) {
                return i;
            }
            i++;
        }
    }

    @Override // X.AnonymousClass2UK
    public int getCount() {
        return this.A00.A02.A0A.size();
    }
}
