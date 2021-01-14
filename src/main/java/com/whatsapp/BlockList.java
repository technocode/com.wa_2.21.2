package com.whatsapp;

import X.AbstractC000400g;
import X.AbstractC27921Sd;
import X.ActivityC004702f;
import X.ActivityC03630Ha;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass04j;
import X.AnonymousClass08B;
import X.AnonymousClass0BP;
import X.AnonymousClass0GG;
import X.AnonymousClass0HJ;
import X.AnonymousClass0L2;
import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import X.AnonymousClass0S2;
import X.AnonymousClass0YX;
import X.AnonymousClass1HY;
import X.AnonymousClass1SZ;
import X.AnonymousClass2C0;
import X.AnonymousClass31y;
import X.AnonymousClass3DW;
import X.AnonymousClass3E8;
import X.C002001d;
import X.C004302a;
import X.C007003k;
import X.C007603r;
import X.C014308b;
import X.C01970Ad;
import X.C01980Ae;
import X.C02040Ak;
import X.C03340Fu;
import X.C05270Nw;
import X.C26381Kq;
import X.C38381pm;
import X.C38391pn;
import X.C39411rS;
import X.C42871xQ;
import X.C42881xR;
import X.C42891xS;
import X.C449222e;
import X.C61082sT;
import X.C61432tA;
import X.C74523b4;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public class BlockList extends ActivityC03630Ha {
    public AnonymousClass1SZ A00;
    public AnonymousClass0YX A01;
    public C449222e A02;
    public ArrayList A03 = new ArrayList();
    public ArrayList A04 = new ArrayList();
    public final AnonymousClass0GG A05 = AnonymousClass0GG.A00();
    public final AnonymousClass0HJ A06 = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A07 = AnonymousClass01A.A00();
    public final AnonymousClass0BP A08 = new C39411rS(this);
    public final AnonymousClass08B A09 = AnonymousClass08B.A00;
    public final C014308b A0A = C014308b.A00();
    public final AnonymousClass0L2 A0B = AnonymousClass0L2.A01();
    public final AnonymousClass04j A0C = AnonymousClass04j.A00();
    public final C01980Ae A0D = C01980Ae.A00();
    public final C03340Fu A0E = C03340Fu.A00();
    public final C02040Ak A0F = C02040Ak.A00();
    public final C01970Ad A0G = C01970Ad.A00();
    public final AnonymousClass31y A0H = AnonymousClass31y.A00();

    public final void A0V() {
        boolean z;
        HashSet hashSet;
        this.A03.clear();
        this.A04.clear();
        Iterator it = ((AbstractCollection) this.A05.A02()).iterator();
        while (it.hasNext()) {
            this.A04.add(this.A07.A0A((AnonymousClass02N) it.next()));
        }
        Collections.sort(this.A04, new C26381Kq(this.A0A, ((AnonymousClass2C0) this).A01));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean A0D2 = ((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A0q);
        Iterator it2 = this.A04.iterator();
        while (it2.hasNext()) {
            C007003k r1 = (C007003k) it2.next();
            if (!A0D2 || !r1.A08()) {
                arrayList.add(new C42871xQ(r1));
            } else {
                arrayList2.add(new C42871xQ(r1));
            }
        }
        C449222e r2 = this.A02;
        if (r2 != null) {
            synchronized (r2) {
                z = false;
                if (r2.A00 != -1) {
                    z = true;
                }
            }
            if (z) {
                C449222e r22 = this.A02;
                synchronized (r22) {
                    hashSet = new HashSet(r22.A0B);
                }
                ArrayList arrayList4 = new ArrayList(hashSet);
                Collections.sort(arrayList4);
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new C42891xS((String) it3.next()));
                }
            }
        }
        if (A0D2 && !arrayList.isEmpty()) {
            this.A03.add(new C42881xR(0));
        }
        this.A03.addAll(arrayList);
        if (A0D2) {
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList5 = this.A03;
                arrayList5.add(new C42881xR(1));
                arrayList5.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                this.A03.add(new C42881xR(2));
            }
        }
        this.A03.addAll(arrayList3);
    }

    public final void A0W() {
        TextView textView = (TextView) findViewById(R.id.block_list_primary_text);
        TextView textView2 = (TextView) findViewById(R.id.block_list_help);
        View findViewById = findViewById(R.id.block_list_info);
        if (this.A05.A0G()) {
            textView2.setVisibility(0);
            findViewById.setVisibility(0);
            Drawable A032 = C004302a.A03(this, R.drawable.ic_add_person_tip);
            if (A032 != null) {
                AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
                textView.setText(r1.A06(R.string.no_blocked_contacts));
                textView2.setText(C05270Nw.A00(r1.A06(R.string.block_list_help), C002001d.A0e(A032, C004302a.A00(this, R.color.add_person_to_block_tint)), textView2.getPaint()));
                return;
            }
            throw null;
        }
        textView2.setVisibility(8);
        findViewById.setVisibility(8);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        boolean A022 = AnonymousClass04j.A02(this);
        int i = R.string.network_required;
        if (A022) {
            i = R.string.network_required_airplane_on;
        }
        textView.setText(r2.A06(i));
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 10) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            UserJid nullable = UserJid.getNullable(intent.getStringExtra("contact"));
            if (nullable != null) {
                this.A05.A0A(this, true, null, true, this.A07.A0A(nullable), null);
                return;
            }
            throw null;
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C449222e r3;
        AbstractC27921Sd r1 = (AbstractC27921Sd) A0T().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() != 0) {
            return super.onContextItemSelected(menuItem);
        }
        int A6v = r1.A6v();
        if (A6v != 0) {
            if (A6v == 1 && (r3 = this.A02) != null) {
                r3.A01(this, this.A0E, ((C42891xS) r1).A00, false, new C38391pn(this));
            }
            return true;
        }
        C007003k r12 = ((C42871xQ) r1).A00;
        AnonymousClass0GG r0 = this.A05;
        if (r12 != null) {
            r0.A09(this, r12, true);
            return true;
        }
        throw null;
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        boolean z;
        HashSet hashSet;
        super.onCreate(bundle);
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        setTitle(r3.A06(R.string.block_list_header));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            setContentView(R.layout.block_list);
            this.A01 = this.A0B.A03(this);
            if (this.A0F.A04() && this.A0D.A09()) {
                C449222e A5X = this.A0G.A03().A5X();
                this.A02 = A5X;
                if (A5X != null) {
                    synchronized (A5X) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("PAY: IndiaUpiBlockListManager shouldFetch lastFetched: ");
                        sb.append(A5X.A00);
                        Log.i(sb.toString());
                        z = !TextUtils.isEmpty(A5X.A08.A05()) && (A5X.A00 == -1 || A5X.A04.A05() - A5X.A00 >= 86400000);
                    }
                    if (z) {
                        C449222e r9 = this.A02;
                        C03340Fu r8 = this.A0E;
                        C38381pm r7 = new C38381pm(this);
                        AnonymousClass3E8 r12 = new AnonymousClass3E8(r9.A05.A00, r9.A02, r9.A03, r9.A07, r8, r9, r9.A09);
                        AnonymousClass3DW r14 = new AnonymousClass3DW(r9, r7);
                        Log.i("PAY: getBlockedVpas called");
                        C449222e r72 = r12.A03;
                        synchronized (r72) {
                            hashSet = new HashSet(r72.A0B);
                        }
                        ArrayList arrayList = new ArrayList(hashSet);
                        for (int i = 0; i < arrayList.size(); i++) {
                            arrayList.set(i, C007603r.A02(((String) arrayList.get(i)).toLowerCase(Locale.US)));
                        }
                        Collections.sort(arrayList);
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            sb2.append((String) it.next());
                        }
                        AnonymousClass0M5 r4 = new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "upi-get-blocked-vpas", null, (byte) 0), new AnonymousClass0OS("version", "2", null, (byte) 0), new AnonymousClass0OS("hash", C007603r.A02(sb2.toString()), null, (byte) 0)}, null, null);
                        C61082sT r13 = ((C61432tA) r12).A00;
                        if (r13 != null) {
                            r13.A03("upi-get-blocked-vpas");
                        }
                        ((C61432tA) r12).A01.A09(false, r4, new C74523b4(r12.A00, r12.A01, r12.A02, r12.A04, r13, r14), 0);
                    }
                }
            }
            A0V();
            A0W();
            AnonymousClass1SZ r92 = new AnonymousClass1SZ(this, this.A06, this.A0A, r3, this.A0H, this.A01, this.A03);
            this.A00 = r92;
            A0U(r92);
            A0T().setEmptyView(findViewById(R.id.block_list_empty));
            A0T().setDivider(null);
            A0T().setClipToPadding(false);
            registerForContextMenu(A0T());
            A0T().setOnItemClickListener(new AnonymousClass1HY(this));
            this.A09.A01(this.A08);
            this.A05.A0D(null);
            return;
        }
        throw null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        String str;
        AbstractC27921Sd r1 = (AbstractC27921Sd) A0T().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        int A6v = r1.A6v();
        if (A6v == 0) {
            str = this.A0A.A08(((C42871xQ) r1).A00, false);
        } else if (A6v != 1) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        } else {
            str = ((C42891xS) r1).A00;
        }
        contextMenu.add(0, 0, 0, ((AnonymousClass2C0) this).A01.A0D(R.string.block_list_menu_unblock, str));
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_settings_add_blocked_contact, 0, ((AnonymousClass2C0) this).A01.A06(R.string.menuitem_add)).setIcon(R.drawable.ic_action_add_person).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A01.A00();
        this.A09.A00(this.A08);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_settings_add_blocked_contact) {
            Intent intent = new Intent(this, ContactPicker.class);
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                Jid jid = ((C007003k) it.next()).A09;
                if (jid != null) {
                    arrayList.add(jid.getRawString());
                } else {
                    throw null;
                }
            }
            intent.putExtra("block_contact", true);
            intent.putStringArrayListExtra("blocked_list", arrayList);
            startActivityForResult(intent, 10);
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }
}
