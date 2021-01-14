package com.whatsapp.biz.catalog;

import X.AnonymousClass037;
import X.AnonymousClass03S;
import X.AnonymousClass0Q7;
import X.AnonymousClass1PN;
import X.AnonymousClass1S0;
import X.AnonymousClass1S6;
import X.C02780Dk;
import X.C08500bE;
import X.C27831Rq;
import X.C27881Ry;
import X.C42361wa;
import X.C42381wc;
import X.C48052Ks;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;

public class CatalogMediaViewFragment extends MediaViewBaseFragment {
    public int A00;
    public AnonymousClass1S0 A01;
    public C48052Ks A02;
    public UserJid A03;
    public String A04;
    public final C02780Dk A05 = C02780Dk.A02();
    public final AnonymousClass1PN A06 = AnonymousClass1PN.A00();
    public final C27831Rq A07 = C27831Rq.A00();
    public final C27881Ry A08 = C27881Ry.A00();
    public final AnonymousClass03S A09 = AnonymousClass03S.A00();

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.AnonymousClass037
    public void A0c() {
        this.A01.A00();
        super.A0c();
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            this.A01 = new AnonymousClass1S0(this.A08);
            this.A03 = UserJid.getNullable(bundle2.getString("cached_jid"));
            this.A02 = (C48052Ks) bundle2.getParcelable("product");
            this.A00 = bundle2.getInt("target_image_index", 0);
            C08500bE r1 = new C08500bE(this, new C42381wc(this));
            ((MediaViewBaseFragment) this).A08 = r1;
            ((MediaViewBaseFragment) this).A09.setAdapter(r1);
            ((MediaViewBaseFragment) this).A09.A0B(0, false);
            ((MediaViewBaseFragment) this).A09.A0B(this.A00, false);
            ((MediaViewBaseFragment) this).A09.A0F(new C42361wa(this));
        }
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        super.A0l(view, bundle);
        if (bundle == null) {
            this.A04 = AnonymousClass1S6.A01(this.A02.A06, this.A00);
            Bundle bundle2 = ((MediaViewBaseFragment) this).A01;
            if (bundle2 != null) {
                ((MediaViewBaseFragment) this).A0E = true;
                ((MediaViewBaseFragment) this).A0B.A0A(this, bundle2);
            }
            this.A07.A02(10, 29, this.A02.A06, this.A03);
        }
        ((MediaViewBaseFragment) this).A02.setVisibility(8);
        AnonymousClass0Q7.A0D(view, R.id.title_holder).setClickable(false);
    }
}
