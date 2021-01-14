package com.whatsapp.payments.ui;

import X.ActivityC004602e;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass08B;
import X.AnonymousClass0BP;
import X.AnonymousClass0GG;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0S2;
import X.AnonymousClass0YP;
import X.AnonymousClass0YX;
import X.AnonymousClass1PN;
import X.AnonymousClass2C0;
import X.AnonymousClass31y;
import X.AnonymousClass3H7;
import X.AnonymousClass3H8;
import X.C002101e;
import X.C007003k;
import X.C014308b;
import X.C02040Ak;
import X.C10040dw;
import X.C10050dx;
import X.C62822vP;
import X.C63092vq;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class PaymentGroupParticipantPickerActivity extends ActivityC004602e {
    public ListView A00;
    public AnonymousClass0YP A01;
    public AnonymousClass0YX A02;
    public GroupJid A03;
    public C10050dx A04;
    public C63092vq A05;
    public C10040dw A06;
    public ArrayList A07;
    public final AnonymousClass0GG A08 = AnonymousClass0GG.A00();
    public final AnonymousClass01I A09 = AnonymousClass01I.A00();
    public final AnonymousClass1PN A0A = AnonymousClass1PN.A00();
    public final AnonymousClass01A A0B = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0C = new AnonymousClass3H7(this);
    public final AnonymousClass08B A0D = AnonymousClass08B.A00;
    public final C014308b A0E = C014308b.A00();
    public final AnonymousClass0L2 A0F = AnonymousClass0L2.A01();
    public final AnonymousClass01T A0G = AnonymousClass01T.A00();
    public final C02040Ak A0H = C02040Ak.A00();
    public final AnonymousClass31y A0I = AnonymousClass31y.A00();
    public final AnonymousClass00T A0J = C002101e.A00();
    public final ArrayList A0K = new ArrayList();

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A01.A05()) {
            this.A01.A04(true);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C007003k r1 = (C007003k) this.A00.getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (r1 == null || menuItem.getItemId() != 0) {
            return super.onContextItemSelected(menuItem);
        }
        AnonymousClass0GG r2 = this.A08;
        Jid A022 = r1.A02(UserJid.class);
        if (A022 != null) {
            r2.A07(this, null, (UserJid) A022);
            return true;
        }
        throw null;
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onCreate(bundle);
        this.A02 = this.A0F.A03(this);
        setContentView(R.layout.payment_group_participant_picker);
        this.A03 = GroupJid.getNullable(getIntent().getStringExtra("extra_jid"));
        this.A05 = new C63092vq(this, this, this.A0K);
        ListView listView = (ListView) findViewById(R.id.group_participant_picker_list);
        this.A00 = listView;
        listView.setAdapter((ListAdapter) this.A05);
        this.A00.setOnItemClickListener(new C62822vP(this));
        registerForContextMenu(this.A00);
        this.A0D.A01(this.A0C);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0C(toolbar);
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        this.A01 = new AnonymousClass0YP(this, r4, findViewById(R.id.search_holder), toolbar, new AnonymousClass3H8(this));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(r4.A06(R.string.payments_pick_group_participant_activity_title));
            A092.A0A(true);
        }
        C10050dx r0 = this.A04;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A04 = null;
        }
        C10040dw r2 = new C10040dw(this);
        this.A06 = r2;
        this.A0J.ANC(r2, new Void[0]);
        A0G(R.string.register_wait_message);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C007003k r5 = (C007003k) ((AdapterView) view).getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        if (r5 != null && this.A08.A0H((UserJid) r5.A02(UserJid.class))) {
            contextMenu.add(0, 0, 0, ((AnonymousClass2C0) this).A01.A0D(R.string.block_list_menu_unblock, this.A0E.A08(r5, false)));
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, ((AnonymousClass2C0) this).A01.A06(R.string.search)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A02.A00();
        this.A0D.A00(this.A0C);
        C10050dx r0 = this.A04;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A04 = null;
        }
        C10040dw r02 = this.A06;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A06 = null;
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public boolean onSearchRequested() {
        this.A01.A01();
        return false;
    }
}
