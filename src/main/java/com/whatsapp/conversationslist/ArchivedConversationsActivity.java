package com.whatsapp.conversationslist;

import X.AbstractC000400g;
import X.ActivityC004602e;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.C000300f;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;

public class ArchivedConversationsActivity extends ActivityC004602e {
    public final C000300f A00 = C000300f.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A0D = this.A00.A0D(AbstractC000400g.A0p);
        int i = R.string.archived_chats;
        if (A0D) {
            i = R.string.archive_read_later;
        }
        setTitle(i);
        A09().A0A(true);
        setContentView(R.layout.archived_conversations);
        if (bundle == null) {
            AnonymousClass0LW A04 = A04();
            if (A04 != null) {
                AnonymousClass0QB r2 = new AnonymousClass0QB(A04);
                r2.A05(R.id.container, new ArchivedConversationsFragment());
                r2.A00();
                return;
            }
            throw null;
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
