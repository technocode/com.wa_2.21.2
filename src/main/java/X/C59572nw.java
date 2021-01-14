package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.util.Calendar;

/* renamed from: X.2nw  reason: invalid class name and case insensitive filesystem */
public class C59572nw extends AbstractC39901sI implements AnonymousClass1O2 {
    public final /* synthetic */ LinksGalleryFragment A00;

    public C59572nw(LinksGalleryFragment linksGalleryFragment) {
        this.A00 = linksGalleryFragment;
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View inflate = linksGalleryFragment.A0A().getLayoutInflater().inflate(R.layout.link_media_item, viewGroup, false);
        ((FrameLayout) inflate.findViewById(R.id.link_preview_frame)).setForeground(C004302a.A03(linksGalleryFragment.A00(), R.drawable.selector_orange_gradient));
        ((ImageView) inflate.findViewById(R.id.chevron)).setImageDrawable(new C06470Tj(((GalleryFragmentBase) linksGalleryFragment).A0A, C004302a.A03(linksGalleryFragment.A00(), R.drawable.chevron)));
        return new C53732dk(linksGalleryFragment, inflate);
    }

    @Override // X.AnonymousClass1O2
    public int A5V(int i) {
        return ((C08660bV) ((GalleryFragmentBase) this.A00).A0G.get(i)).count;
    }

    @Override // X.AnonymousClass1O2
    public int A6d() {
        return ((GalleryFragmentBase) this.A00).A0G.size();
    }

    @Override // X.AnonymousClass1O2
    public long A6e(int i) {
        return -((Calendar) ((GalleryFragmentBase) this.A00).A0G.get(i)).getTimeInMillis();
    }

    @Override // X.AnonymousClass1O2
    public void ADX(AbstractC11910hD r3, int i) {
        ((C53712di) r3).A00.setText(((GalleryFragmentBase) this.A00).A0G.get(i).toString());
    }

    @Override // X.AnonymousClass1O2
    public AbstractC11910hD AEj(ViewGroup viewGroup) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View inflate = linksGalleryFragment.A0A().getLayoutInflater().inflate(R.layout.media_gallery_section_row, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(C004302a.A00(linksGalleryFragment.A00(), R.color.gallery_separator));
        return new C53712di(inflate);
    }

    @Override // X.AnonymousClass1O2
    public boolean AKa(AbstractC11910hD r2, int i, MotionEvent motionEvent) {
        return false;
    }
}
