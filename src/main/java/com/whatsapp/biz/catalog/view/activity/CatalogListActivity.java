package com.whatsapp.biz.catalog.view.activity;

import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass0GG;
import X.AnonymousClass0HL;
import X.AnonymousClass0MB;
import X.AnonymousClass0O5;
import X.AnonymousClass0SD;
import X.AnonymousClass1RX;
import X.AnonymousClass1S3;
import X.AnonymousClass1S9;
import X.AnonymousClass1SA;
import X.AnonymousClass1SB;
import X.AnonymousClass1SC;
import X.AnonymousClass1SD;
import X.AnonymousClass2DB;
import X.AnonymousClass325;
import X.C002101e;
import X.C007003k;
import X.C014308b;
import X.C017009c;
import X.C05530Oy;
import X.C41771vc;
import X.C42001vz;
import X.C42431wh;
import X.C42441wi;
import X.C42451wj;
import X.C42521wq;
import X.C42531wr;
import X.C460227l;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.ShareCatalogLinkActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.util.HashMap;

public class CatalogListActivity extends AnonymousClass2DB {
    public C460227l A00;
    public C42521wq A01;
    public String A02;
    public final AnonymousClass0GG A03 = AnonymousClass0GG.A00();
    public final AnonymousClass01I A04 = AnonymousClass01I.A00();
    public final C017009c A05 = C017009c.A00();
    public final AnonymousClass1RX A06 = new C42451wj(this);
    public final C41771vc A07 = C41771vc.A00;
    public final C05530Oy A08 = C05530Oy.A02();
    public final AnonymousClass0HL A09 = AnonymousClass0HL.A00();
    public final AnonymousClass1S3 A0A = AnonymousClass1S3.A00();
    public final AnonymousClass01A A0B = AnonymousClass01A.A00();
    public final C014308b A0C = C014308b.A00();
    public final AnonymousClass01P A0D = AnonymousClass01P.A00();
    public final AnonymousClass325 A0E = AnonymousClass325.A00();
    public final AnonymousClass00T A0F = C002101e.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass2DB, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A07.A01(this.A06);
        UserJid userJid = ((AnonymousClass2DB) this).A03;
        AnonymousClass00T r7 = this.A0F;
        C42001vz r8 = new C42001vz(getApplication(), new AnonymousClass1S9(userJid, r7, ((ActivityC004702f) this).A0G, this.A05));
        AnonymousClass0O5 A9n = A9n();
        String canonicalName = C460227l.class.getCanonicalName();
        if (canonicalName != null) {
            String A0K = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = A9n.A00;
            Object obj = (AnonymousClass0SD) hashMap.get(A0K);
            if (!C460227l.class.isInstance(obj)) {
                obj = new C460227l(r8.A00, r8.A01);
                AnonymousClass0SD r0 = (AnonymousClass0SD) hashMap.put(A0K, obj);
                if (r0 != null) {
                    r0.A00();
                }
            }
            this.A00 = (C460227l) obj;
            AnonymousClass1SD r3 = new AnonymousClass1SD();
            UserJid userJid2 = ((AnonymousClass2DB) this).A03;
            C42531wr r6 = new C42531wr(r3, userJid2, new AnonymousClass1SA(userJid2, r7, this.A08));
            AnonymousClass0O5 A9n2 = A9n();
            String canonicalName2 = C42521wq.class.getCanonicalName();
            if (canonicalName2 != null) {
                String A0K2 = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                HashMap hashMap2 = A9n2.A00;
                Object obj2 = (AnonymousClass0SD) hashMap2.get(A0K2);
                if (!C42521wq.class.isInstance(obj2)) {
                    obj2 = new C42521wq(r6.A01, r6.A02, r6.A00);
                    AnonymousClass0SD r02 = (AnonymousClass0SD) hashMap2.put(A0K2, obj2);
                    if (r02 != null) {
                        r02.A00();
                    }
                }
                C42521wq r32 = (C42521wq) obj2;
                this.A01 = r32;
                r32.A00.A03(this, new C42441wi(this));
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 106) {
            return super.onCreateDialog(i);
        }
        C007003k A0A2 = this.A0B.A0A(((AnonymousClass2DB) this).A03);
        AnonymousClass0MB r4 = new AnonymousClass0MB(this);
        r4.A01.A0E = getString(R.string.cannot_send_to_blocked_contact_1, this.A0C.A08(A0A2, false));
        r4.A04(R.string.unblock, new AnonymousClass1SC(this, A0A2));
        r4.A03(R.string.cancel, new AnonymousClass1SB(this));
        return r4.A00();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.catalog, menu);
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        MenuItem findItem2 = menu.findItem(R.id.menu_edit);
        MenuItem findItem3 = menu.findItem(R.id.menu_share);
        findItem.setActionView(R.layout.menu_item_cart);
        findItem.getActionView().setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 35));
        TextView textView = (TextView) findItem.getActionView().findViewById(R.id.cart_total_quantity);
        String str = this.A02;
        if (str != null) {
            textView.setText(str);
        }
        this.A00.A03();
        this.A00.A00.A03(this, new C42431wh(this, findItem));
        findItem2.setVisible(false);
        findItem3.setVisible(((AnonymousClass2DB) this).A04);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass2DB, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A07.A00(this.A06);
    }

    @Override // X.ActivityC004702f, X.AnonymousClass2DB
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (R.id.menu_edit != itemId) {
            if (R.id.menu_share == itemId) {
                UserJid userJid = ((AnonymousClass2DB) this).A03;
                Intent intent = new Intent(this, ShareCatalogLinkActivity.class);
                intent.setAction("android.intent.action.VIEW");
                intent.putExtra("jid", userJid.getRawString());
                startActivity(intent);
                return true;
            } else if (16908332 == itemId) {
                onBackPressed();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.AnonymousClass2DB, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        AnonymousClass1SA r3 = this.A01.A01;
        r3.A03.ANF(new RunnableEBaseShape7S0100000_I1_2(r3, 41));
    }
}
