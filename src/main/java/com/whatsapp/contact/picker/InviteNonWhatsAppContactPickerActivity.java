package com.whatsapp.contact.picker;

import X.ActivityC03630Ha;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass0HJ;
import X.AnonymousClass0L2;
import X.AnonymousClass0S2;
import X.AnonymousClass0XL;
import X.AnonymousClass0YP;
import X.AnonymousClass1NU;
import X.AnonymousClass1NV;
import X.AnonymousClass2G2;
import X.AnonymousClass2Y1;
import X.AnonymousClass2Y3;
import X.AnonymousClass2Y4;
import X.AnonymousClass2Y5;
import X.AnonymousClass2YO;
import X.C002001d;
import X.C014308b;
import X.C09040cC;
import X.C51362Yk;
import X.C58852me;
import X.C58922ml;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

public class InviteNonWhatsAppContactPickerActivity extends ActivityC03630Ha implements AnonymousClass1NV {
    public MenuItem A00;
    public Toolbar A01;
    public AnonymousClass0YP A02;
    public C58922ml A03;
    public C51362Yk A04;
    public final C09040cC A05 = C09040cC.A00();
    public final AnonymousClass0HJ A06 = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A07 = AnonymousClass01A.A00();
    public final C014308b A08 = C014308b.A00();
    public final AnonymousClass0L2 A09 = AnonymousClass0L2.A01();
    public final AnonymousClass01X A0A = AnonymousClass01X.A00();
    public final AnonymousClass0XL A0B = AnonymousClass0XL.A00();

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        C51362Yk r1 = this.A04;
        if (r1.A01.A01() == null || !((Boolean) r1.A01.A01()).booleanValue()) {
            super.onBackPressed();
        } else {
            this.A04.A01.A07(Boolean.FALSE);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.invite_non_whatsapp_contact_picker);
        AnonymousClass01X r4 = this.A0A;
        setTitle(r4.A06(R.string.tell_a_friend));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.A01 = toolbar;
        A0C(toolbar);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A0B(true);
            this.A02 = new AnonymousClass0YP(this, r4, findViewById(R.id.search_holder), this.A01, new AnonymousClass2YO(this));
            C58922ml r5 = new C58922ml(this, new ArrayList(), this.A06, this.A09.A03(this), r4);
            this.A03 = r5;
            ListView A0T = A0T();
            A0T.setAdapter((ListAdapter) r5);
            registerForContextMenu(A0T);
            A0T.setOnItemClickListener(new AnonymousClass2G2(this));
            C51362Yk r2 = (C51362Yk) C002001d.A0l(this, new C58852me(this)).A00(C51362Yk.class);
            this.A04 = r2;
            r2.A04.A07(0);
            r2.A00.A07(new ArrayList());
            this.A04.A02.A03(this, new AnonymousClass2Y1(this));
            this.A04.A03.A03(this, new AnonymousClass2Y3(this));
            this.A04.A04.A03(this, AnonymousClass2Y5.A00);
            this.A04.A01.A03(this, new AnonymousClass2Y4(this));
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, this.A02.A06.A06(R.string.search)).setIcon(R.drawable.ic_action_search);
        icon.setShowAsAction(10);
        icon.setOnActionExpandListener(new AnonymousClass1NU(this));
        this.A00 = icon;
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            this.A04.A01.A07(Boolean.TRUE);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }
}
