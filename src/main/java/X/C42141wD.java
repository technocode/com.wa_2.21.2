package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.jid.UserJid;
import java.io.Serializable;

/* renamed from: X.1wD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42141wD implements AbstractC665434t {
    public final /* synthetic */ CatalogMediaCard A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C42141wD(CatalogMediaCard catalogMediaCard, boolean z, UserJid userJid) {
        this.A00 = catalogMediaCard;
        this.A02 = z;
        this.A01 = userJid;
    }

    @Override // X.AbstractC665434t
    public final void AEE() {
        CatalogMediaCard catalogMediaCard = this.A00;
        boolean z = this.A02;
        UserJid userJid = this.A01;
        if (!z) {
            C02780Dk r5 = catalogMediaCard.A08;
            Context context = catalogMediaCard.getContext();
            Intent intent = new Intent(context, CatalogListActivity.class);
            intent.putExtra("cache_jid", userJid.getRawString());
            intent.putExtra("source", (Serializable) null);
            r5.A05(context, intent);
            catalogMediaCard.A0C.A02(3, 22, null, userJid);
        }
    }
}
