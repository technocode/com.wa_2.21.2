package com.whatsapp.storage;

import X.AbstractC43421yL;
import X.ActivityC004902h;
import X.AnonymousClass009;
import X.AnonymousClass00T;
import X.AnonymousClass019;
import X.AnonymousClass01K;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass0AC;
import X.AnonymousClass0BV;
import X.AnonymousClass0BW;
import X.AnonymousClass0Q7;
import X.AnonymousClass1PN;
import X.C000300f;
import X.C002101e;
import X.C02580Cq;
import X.C02780Dk;
import X.C04370Kc;
import X.C71993Rc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

public class StorageUsageMediaGalleryFragment extends MediaGalleryFragmentBase {
    public int A00;
    public AnonymousClass02N A01;
    public final C02780Dk A02 = C02780Dk.A02();
    public final AnonymousClass009 A03 = AnonymousClass009.A00();
    public final AnonymousClass02M A04 = AnonymousClass02M.A00();
    public final C000300f A05 = C000300f.A00();
    public final AnonymousClass1PN A06 = AnonymousClass1PN.A00();
    public final AnonymousClass01K A07 = AnonymousClass01K.A00();
    public final AnonymousClass0BV A08 = AnonymousClass0BV.A00();
    public final AnonymousClass019 A09 = new C71993Rc(this);
    public final AnonymousClass0AC A0A = AnonymousClass0AC.A00;
    public final AnonymousClass0BW A0B = AnonymousClass0BW.A00();
    public final C04370Kc A0C = C04370Kc.A00();
    public final C02580Cq A0D = C02580Cq.A01();
    public final AnonymousClass00T A0E = C002101e.A00();

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.storage_usage_gallery, viewGroup, false);
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0b(Bundle bundle) {
        super.A0b(bundle);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            int i = bundle2.getInt("storage_media_gallery_fragment_gallery_type", 0);
            this.A00 = i;
            if (i == 0) {
                AnonymousClass02N A012 = AnonymousClass02N.A01(bundle2.getString("storage_media_gallery_fragment_jid"));
                if (A012 != null) {
                    this.A01 = A012;
                } else {
                    throw null;
                }
            } else {
                AnonymousClass0Q7.A0D(((AnonymousClass037) this).A0A, R.id.no_media_text).setVisibility(8);
            }
        }
        AnonymousClass0Q7.A0h(((MediaGalleryFragmentBase) this).A07, true);
        View view = ((AnonymousClass037) this).A0A;
        if (view != null) {
            AnonymousClass0Q7.A0h(view.findViewById(R.id.no_media), true);
            A0v(false, false);
            this.A0A.A01(this.A09);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0c() {
        super.A0c();
        this.A0A.A00(this.A09);
    }

    public final AbstractC43421yL A0y() {
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            return (AbstractC43421yL) A0A2;
        }
        throw null;
    }
}
