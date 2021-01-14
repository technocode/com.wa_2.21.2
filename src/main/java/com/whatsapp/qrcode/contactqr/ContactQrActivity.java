package com.whatsapp.qrcode.contactqr;

import X.AbstractC07290Ww;
import X.ActivityC004702f;
import X.AnonymousClass01X;
import X.AnonymousClass1Y6;
import X.C002001d;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;

public class ContactQrActivity extends AnonymousClass1Y6 implements AbstractC07290Ww {
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass1Y6, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AnonymousClass1Y6) this).A0A = ((ActivityC004702f) this).A0J.A00.getString("contact_qr_code", null);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass01X r4 = ((AnonymousClass1Y6) this).A0O;
        menu.add(0, R.id.menuitem_contactqr_share, 0, r4.A06(R.string.contact_qr_share)).setIcon(C002001d.A0b(this, R.drawable.ic_share, R.color.shareIconTint)).setShowAsAction(2);
        menu.add(0, R.id.menuitem_contactqr_revoke, 0, r4.A06(R.string.contact_qr_revoke));
        return true;
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_contactqr_share) {
            A0U();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_contactqr_revoke) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            APm(new BaseQrActivity$RevokeCodeDialogFragment());
            return true;
        }
    }
}
