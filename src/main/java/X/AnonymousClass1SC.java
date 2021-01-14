package X;

import android.content.DialogInterface;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1SC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1SC implements DialogInterface.OnClickListener {
    public final /* synthetic */ CatalogListActivity A00;
    public final /* synthetic */ C007003k A01;

    public /* synthetic */ AnonymousClass1SC(CatalogListActivity catalogListActivity, C007003k r2) {
        this.A00 = catalogListActivity;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CatalogListActivity catalogListActivity = this.A00;
        C007003k r1 = this.A01;
        AnonymousClass0GG r2 = catalogListActivity.A03;
        Jid A02 = r1.A02(UserJid.class);
        if (A02 != null) {
            r2.A07(catalogListActivity, null, (UserJid) A02);
            C002001d.A2N(catalogListActivity, 106);
            return;
        }
        throw null;
    }
}
