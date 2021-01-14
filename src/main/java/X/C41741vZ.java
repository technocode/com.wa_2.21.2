package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1vZ  reason: invalid class name and case insensitive filesystem */
public class C41741vZ implements AbstractC03680Hf {
    public View A00;
    public View A01;
    public ImageView A02;
    public TextView A03;
    public TextEmojiLabel A04;
    public AnonymousClass1RU A05;
    public BusinessProfileFieldView A06;
    public CatalogMediaCard A07;
    public C28231Tk A08;
    public C007003k A09;
    public final View A0A;
    public final ActivityC004702f A0B;
    public final AnonymousClass02M A0C = AnonymousClass02M.A00();
    public final AnonymousClass01I A0D = AnonymousClass01I.A00();
    public final C000300f A0E = C000300f.A00();
    public final C017009c A0F = C017009c.A00();
    public final C017109d A0G = C017109d.A00();
    public final C27831Rq A0H = C27831Rq.A00();
    public final AnonymousClass08B A0I = AnonymousClass08B.A00;
    public final C014308b A0J = C014308b.A00();
    public final AnonymousClass01X A0K = AnonymousClass01X.A00();
    public final AnonymousClass01P A0L = AnonymousClass01P.A00();
    public final C002701k A0M = C002701k.A00();
    public final AnonymousClass00Y A0N = AnonymousClass00Y.A00();
    public final AnonymousClass09H A0O = AnonymousClass09H.A01();
    public final AnonymousClass325 A0P = AnonymousClass325.A00();

    public C41741vZ(ActivityC004702f r2, View view, C007003k r4) {
        if (view != null) {
            this.A00 = view.findViewById(R.id.business_verification_status);
            this.A04 = (TextEmojiLabel) view.findViewById(R.id.business_verification_status_text);
            this.A02 = (ImageView) view.findViewById(R.id.add_business_to_contact);
            this.A06 = (BusinessProfileFieldView) view.findViewById(R.id.business_description);
            this.A07 = (CatalogMediaCard) view.findViewById(R.id.business_catalog_media_card);
            this.A03 = (TextView) view.findViewById(R.id.blank_business_details_text);
            this.A0B = r2;
            this.A0A = view;
            this.A09 = r4;
            return;
        }
        throw null;
    }

    public UserJid A00() {
        C007003k r1 = this.A09;
        if (r1 == null) {
            return null;
        }
        return (UserJid) r1.A02(UserJid.class);
    }

    public void A01(UserJid userJid, boolean z) {
        C28231Tk r5 = this.A08;
        if (r5 == null || !r5.A09) {
            this.A07.setVisibility(8);
        } else {
            this.A07.setup(userJid, z, null, false, r5);
        }
    }

    @Override // X.AbstractC03680Hf
    public void AGV() {
        ActivityC004702f r0 = this.A0B;
        if (r0 != null) {
            r0.AMi();
        }
    }

    @Override // X.AbstractC03680Hf
    public void AGW() {
        ActivityC004702f r0 = this.A0B;
        if (r0 != null) {
            r0.AMi();
        }
    }
}
