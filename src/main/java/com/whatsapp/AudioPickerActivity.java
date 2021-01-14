package com.whatsapp;

import X.AbstractC15630oP;
import X.AbstractC15640oQ;
import X.ActivityC03630Ha;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass08D;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass0YP;
import X.AnonymousClass1HR;
import X.AnonymousClass1KR;
import X.AnonymousClass1KS;
import X.AnonymousClass27H;
import X.AnonymousClass2C0;
import X.AnonymousClass2PM;
import X.C007003k;
import X.C008805h;
import X.C014308b;
import X.C04370Kc;
import X.C15650oR;
import X.C28301Tu;
import X.C39331rK;
import android.database.Cursor;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class AudioPickerActivity extends ActivityC03630Ha implements AbstractC15630oP {
    public AudioManager A00;
    public Menu A01;
    public ImageButton A02;
    public ListView A03;
    public RelativeLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public AnonymousClass1KS A07;
    public AnonymousClass0YP A08;
    public C007003k A09;
    public AnonymousClass2PM A0A;
    public String A0B;
    public ArrayList A0C;
    public LinkedHashMap A0D;
    public final AnonymousClass01A A0E = AnonymousClass01A.A00();
    public final C014308b A0F = C014308b.A00();
    public final C04370Kc A0G = C04370Kc.A00();

    public final void A0V() {
        MenuItem findItem;
        AnonymousClass0S2 A092 = A09();
        AnonymousClass00E.A04(A092, "supportActionBar is null");
        Iterator it = this.A0D.values().iterator();
        while (it.hasNext()) {
            String str = ((AnonymousClass1KR) it.next()).A03;
            if (str == null || !new File(str).exists()) {
                it.remove();
            }
        }
        boolean z = true;
        if (this.A07.getCursor() == null) {
            this.A03.setVisibility(8);
            this.A05.setVisibility(8);
            this.A04.setVisibility(0);
            this.A06.setVisibility(8);
            C28301Tu.A05();
            A092.A07("");
        } else {
            this.A04.setVisibility(8);
            if (this.A07.getCursor().getCount() == 0) {
                this.A03.setVisibility(8);
                C008805h.A16(this.A02, false, false);
                if (this.A08.A05()) {
                    this.A05.setVisibility(8);
                    this.A06.setVisibility(0);
                    this.A06.setText(((AnonymousClass2C0) this).A01.A0D(R.string.audio_nothing_found, this.A0B));
                } else {
                    this.A05.setVisibility(0);
                    this.A06.setVisibility(8);
                    this.A0D.clear();
                }
                A092.A07("");
            } else {
                this.A03.setVisibility(0);
                this.A05.setVisibility(8);
                this.A06.setVisibility(8);
                LinkedHashMap linkedHashMap = this.A0D;
                if (linkedHashMap.isEmpty()) {
                    A092.A07(((AnonymousClass2C0) this).A01.A06(R.string.tap_to_select));
                } else {
                    A092.A07(((AnonymousClass2C0) this).A01.A0A(R.plurals.n_selected, (long) linkedHashMap.size(), Integer.valueOf(linkedHashMap.size())));
                }
                if (this.A0D.isEmpty()) {
                    C008805h.A16(this.A02, false, false);
                } else {
                    C008805h.A16(this.A02, true, false);
                }
            }
        }
        Menu menu = this.A01;
        if (menu != null && (findItem = menu.findItem(R.id.menuitem_search)) != null) {
            if (this.A07.getCursor() == null || this.A07.getCursor().getCount() <= 0) {
                z = false;
            }
            findItem.setVisible(z);
        }
    }

    @Override // X.AbstractC15630oP
    public C15650oR AEk(int i, Bundle bundle) {
        return new AnonymousClass27H(this, this.A0C, getContentResolver());
    }

    @Override // X.AbstractC15630oP
    public /* bridge */ /* synthetic */ void AHA(C15650oR r2, Object obj) {
        this.A07.swapCursor((Cursor) obj);
        A0V();
    }

    @Override // X.AbstractC15630oP
    public void AHG(C15650oR r3) {
        this.A07.swapCursor(null);
        A0V();
    }

    public void lambda$onCreate$914$AudioPickerActivity(View view) {
        AnonymousClass01X r5;
        String A0A2;
        String A082 = this.A0F.A08(this.A09, false);
        LinkedHashMap linkedHashMap = this.A0D;
        int size = linkedHashMap.size();
        if (size == 1) {
            String str = ((AnonymousClass1KR) linkedHashMap.values().iterator().next()).A07;
            r5 = ((AnonymousClass2C0) this).A01;
            boolean A092 = this.A09.A09();
            int i = R.string.confirm_send_single_audio;
            if (A092) {
                i = R.string.group_confirm_send_single_audio;
            }
            A0A2 = r5.A0D(i, str, A082);
        } else {
            r5 = ((AnonymousClass2C0) this).A01;
            boolean A093 = this.A09.A09();
            int i2 = R.plurals.confirm_send_audios;
            if (A093) {
                i2 = R.plurals.group_confirm_send_audios;
            }
            A0A2 = r5.A0A(i2, (long) size, Integer.valueOf(size), A082);
        }
        AnonymousClass0MB r2 = new AnonymousClass0MB(this);
        r2.A01.A0E = A0A2;
        r2.A07(r5.A06(R.string.send), new AnonymousClass1HR(this));
        r2.A05(r5.A06(R.string.cancel), null);
        r2.A00().show();
    }

    public /* synthetic */ void lambda$onSearchRequested$915$AudioPickerActivity(View view) {
        this.A04.setVisibility(8);
        if (!this.A0D.isEmpty()) {
            C008805h.A16(this.A02, true, true);
        }
        this.A08.A04(true);
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A08.A05()) {
            if (!this.A0D.isEmpty()) {
                C008805h.A16(this.A02, true, true);
            }
            this.A08.A04(true);
            return;
        }
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_audio_file_list);
        this.A0D = new LinkedHashMap();
        this.A0A = new AnonymousClass2PM(AnonymousClass08D.A00(), getContentResolver(), new Handler());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0C(toolbar);
        AnonymousClass01X r7 = ((AnonymousClass2C0) this).A01;
        this.A08 = new AnonymousClass0YP(this, r7, findViewById(R.id.search_holder), toolbar, new C39331rK(this));
        AnonymousClass01A r2 = this.A0E;
        AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
        if (A012 != null) {
            this.A09 = r2.A0A(A012);
            AnonymousClass0S2 A092 = A09();
            AnonymousClass00E.A04(A092, "supportActionBar is null");
            A092.A0A(true);
            A092.A08(r7.A0D(R.string.send_to_contact, this.A0F.A08(this.A09, false)));
            this.A05 = (RelativeLayout) findViewById(R.id.no_audio_layout);
            this.A04 = (RelativeLayout) findViewById(R.id.loading_audio_layout);
            this.A06 = (TextView) findViewById(R.id.empty);
            ListView A0T = A0T();
            this.A03 = A0T;
            A0T.setBackground(null);
            ImageButton imageButton = (ImageButton) findViewById(R.id.fab);
            this.A02 = imageButton;
            C008805h.A16(imageButton, false, false);
            this.A02.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 6));
            this.A02.setContentDescription(r7.A06(R.string.send));
            AnonymousClass1KS r0 = new AnonymousClass1KS(this, this);
            this.A07 = r0;
            A0U(r0);
            this.A00 = this.A0I.A09();
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z = false;
        menu.add(0, R.id.menuitem_search, 0, ((AnonymousClass2C0) this).A01.A06(R.string.search)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        this.A01 = menu;
        MenuItem findItem = menu.findItem(R.id.menuitem_search);
        if (findItem != null) {
            if (this.A03.getCount() > 0) {
                z = true;
            }
            findItem.setVisible(z);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0A.A00();
        this.A0A = null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AudioManager audioManager = this.A00;
        if (audioManager != null) {
            if (i == 24) {
                audioManager.adjustStreamVolume(3, 1, 1);
                return true;
            } else if (i == 25) {
                audioManager.adjustStreamVolume(3, -1, 1);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
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
        C008805h.A16(this.A02, false, true);
        this.A08.A01();
        findViewById(R.id.search_back).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 5));
        return false;
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        A0V();
        AbstractC15640oQ.A00(this).A02(0, null, this);
        super.onStart();
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        C28301Tu r0 = C28301Tu.A0i;
        if (r0 != null) {
            r0.A0C();
            C28301Tu.A0i = null;
        }
    }
}
