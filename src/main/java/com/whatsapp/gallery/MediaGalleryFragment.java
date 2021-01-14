package com.whatsapp.gallery;

import X.AbstractC48922Oh;
import X.ActivityC004902h;
import X.AnonymousClass019;
import X.AnonymousClass01K;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass0AC;
import X.AnonymousClass0BV;
import X.AnonymousClass0Q7;
import X.AnonymousClass1PN;
import X.C02580Cq;
import X.C08680bX;
import X.C53772do;
import X.C59682o7;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallerypicker.RecyclerFastScroller;
import java.util.ArrayList;
import java.util.List;

public class MediaGalleryFragment extends MediaGalleryFragmentBase implements AbstractC48922Oh {
    public AnonymousClass02N A00;
    public final AnonymousClass1PN A01 = AnonymousClass1PN.A00();
    public final AnonymousClass01K A02 = AnonymousClass01K.A00();
    public final AnonymousClass0BV A03 = AnonymousClass0BV.A00();
    public final AnonymousClass019 A04 = new C53772do(this);
    public final AnonymousClass0AC A05 = AnonymousClass0AC.A00;
    public final C02580Cq A06 = C02580Cq.A01();

    @Override // X.AbstractC48922Oh
    public void AJp(C08680bX r1) {
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0b(Bundle bundle) {
        super.A0b(bundle);
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(A0A.getIntent().getStringExtra("jid"));
            if (A012 != null) {
                this.A00 = A012;
                AnonymousClass0Q7.A0h(((MediaGalleryFragmentBase) this).A07, true);
                View view = ((AnonymousClass037) this).A0A;
                if (view != null) {
                    AnonymousClass0Q7.A0h(view.findViewById(R.id.no_media), true);
                    A0v(false, false);
                    ActivityC004902h A0A2 = A0A();
                    if (A0A2 instanceof MediaGalleryActivity) {
                        ((MediaGalleryFragmentBase) this).A07.A0l(((MediaGalleryActivity) A0A2).A0D);
                        RecyclerFastScroller recyclerFastScroller = (RecyclerFastScroller) ((AnonymousClass037) this).A0A.findViewById(R.id.scroller);
                        AppBarLayout appBarLayout = (AppBarLayout) A0A().findViewById(R.id.appbar);
                        recyclerFastScroller.A04 = (CoordinatorLayout) A0A().findViewById(R.id.coordinator);
                        recyclerFastScroller.A07 = appBarLayout;
                        C59682o7 r1 = new C59682o7(recyclerFastScroller);
                        List list = appBarLayout.A05;
                        if (list == null) {
                            list = new ArrayList();
                            appBarLayout.A05 = list;
                        }
                        if (r1 != null && !list.contains(r1)) {
                            appBarLayout.A05.add(r1);
                        }
                    }
                    this.A05.A01(this.A04);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0c() {
        super.A0c();
        this.A05.A00(this.A04);
    }

    @Override // X.AbstractC48922Oh
    public void AJv() {
        ((MediaGalleryFragmentBase) this).A06.A01.A00();
    }
}
