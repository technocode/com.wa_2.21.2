package com.whatsapp.voipcalling;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03S;
import X.AnonymousClass08B;
import X.AnonymousClass0AQ;
import X.AnonymousClass0BP;
import X.AnonymousClass0FS;
import X.AnonymousClass0GG;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0HN;
import X.AnonymousClass0JW;
import X.AnonymousClass0MB;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QM;
import X.AnonymousClass0S2;
import X.AnonymousClass1PN;
import X.AnonymousClass2C0;
import X.AnonymousClass31y;
import X.AnonymousClass3TU;
import X.AnonymousClass3TV;
import X.C001801b;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.C06470Tj;
import X.C09060cE;
import X.C09110cJ;
import X.C09200cS;
import X.C09260ca;
import X.C11930hF;
import X.C674338o;
import X.C674438p;
import X.DialogInterface$OnClickListenerC670737c;
import X.DialogInterface$OnClickListenerC670837d;
import X.DialogInterface$OnClickListenerC670937e;
import X.ViewTreeObserver$OnGlobalLayoutListenerC673538f;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;
import com.whatsapp.util.ViewOnClickCListenerShape1S1200000_I1;
import java.util.ArrayList;
import java.util.Iterator;

public class CallLogActivity extends ActivityC004602e {
    public View A00;
    public ImageView A01;
    public ListView A02;
    public TextView A03;
    public C11930hF A04;
    public C007003k A05;
    public UserJid A06;
    public C09110cJ A07;
    public AnonymousClass3TV A08;
    public ArrayList A09;
    public final AnonymousClass0GG A0A = AnonymousClass0GG.A00();
    public final AnonymousClass1PN A0B = AnonymousClass1PN.A00();
    public final AnonymousClass0HJ A0C = AnonymousClass0HJ.A02();
    public final AnonymousClass0BP A0D = new AnonymousClass3TU(this);
    public final AnonymousClass08B A0E = AnonymousClass08B.A00;
    public final C014308b A0F = C014308b.A00();
    public final AnonymousClass0HK A0G = AnonymousClass0HK.A00();
    public final AnonymousClass0HN A0H = AnonymousClass0HN.A00();
    public final AnonymousClass00S A0I = AnonymousClass00S.A00();
    public final AnonymousClass03S A0J = AnonymousClass03S.A00();
    public final AnonymousClass0FS A0K = AnonymousClass0FS.A00();
    public final AnonymousClass0AQ A0L = AnonymousClass0AQ.A00();
    public final AnonymousClass00Y A0M = AnonymousClass00Y.A00();
    public final AnonymousClass31y A0N = AnonymousClass31y.A00();
    public final C09060cE A0O = C09060cE.A01();
    public final AnonymousClass00T A0P = C002101e.A00();
    public final C09200cS A0Q = C09200cS.A00();

    public final void A0T() {
        Log.i("calllog/update");
        C007003k A022 = this.A0L.A02(this.A06);
        this.A05 = A022;
        this.A0C.A06(this.A01, A022);
        this.A04.A03(this.A05, null);
        String str = this.A05.A0L;
        if (str == null || str.isEmpty()) {
            this.A03.setVisibility(8);
        } else {
            this.A03.setVisibility(0);
            this.A03.setText(this.A05.A0L);
        }
        AnonymousClass3TV r0 = this.A08;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        AnonymousClass3TV r2 = new AnonymousClass3TV(this);
        this.A08 = r2;
        this.A0P.ANC(r2, new Void[0]);
    }

    public final void A0U(boolean z) {
        Jid A022 = this.A05.A02(AnonymousClass02N.class);
        if (A022 != null) {
            Intent A023 = this.A0O.A02(this.A05, (AnonymousClass02N) A022, z);
            int i = 11;
            if (z) {
                i = 10;
            }
            try {
                startActivityForResult(A023, i);
                this.A07.A02(z, 1);
            } catch (ActivityNotFoundException | SecurityException e) {
                Log.w("calllog/opt system contact list could not found", e);
                C002001d.A2O(this, 2);
            }
        } else {
            throw null;
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 11 || i == 10) {
            if (i2 == -1) {
                this.A0H.A06();
            }
            this.A07.A00();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A07 = new C09110cJ(this.A0M, ((ActivityC004702f) this).A0G, super.A0I, this.A0J);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
            setTitle(r5.A06(R.string.call_details));
            setContentView(R.layout.contact_call_log_v2);
            UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
            if (nullable != null) {
                this.A06 = nullable;
                this.A02 = (ListView) findViewById(16908298);
                View inflate = getLayoutInflater().inflate(R.layout.contact_call_log_header_v2, (ViewGroup) this.A02, false);
                AnonymousClass0Q7.A0W(inflate, 2);
                this.A02.addHeaderView(inflate, null, false);
                View findViewById = findViewById(R.id.header);
                this.A00 = findViewById;
                findViewById.setClickable(true);
                C11930hF r0 = new C11930hF((TextEmojiLabel) findViewById(R.id.conversation_contact_name), this.A0F, r5, this.A0N);
                this.A04 = r0;
                C002301g.A03(r0.A00);
                this.A03 = (TextView) findViewById(R.id.conversation_contact_status);
                findViewById(R.id.divider).setBackgroundDrawable(new C06470Tj(r5, C004302a.A03(this, R.drawable.list_header_divider)));
                this.A02.setOnScrollListener(new C674338o(this));
                this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC673538f(this));
                this.A01 = (ImageView) findViewById(R.id.photo_btn);
                StringBuilder sb = new StringBuilder();
                sb.append(this.A0B.A01(R.string.transition_photo));
                sb.append("-avatar");
                String obj = sb.toString();
                AnonymousClass0Q7.A0g(this.A01, obj);
                this.A01.setOnClickListener(new ViewOnClickCListenerShape1S1200000_I1(this, this.A06, obj, 0));
                View findViewById2 = findViewById(R.id.call_btn);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 19));
                    View findViewById3 = findViewById(R.id.video_call_btn);
                    if (findViewById3 != null) {
                        findViewById3.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 20));
                        C674438p r9 = new C674438p(this);
                        this.A02.setAdapter((ListAdapter) r9);
                        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("calls");
                        if (parcelableArrayListExtra != null) {
                            this.A09 = new ArrayList();
                            Iterator it = parcelableArrayListExtra.iterator();
                            while (it.hasNext()) {
                                C09260ca r02 = (C09260ca) ((Parcelable) it.next());
                                AnonymousClass0QM A042 = this.A0K.A04(new C09260ca(r02.A01, r02.A03, r02.A02, r02.A00));
                                if (A042 != null) {
                                    this.A09.add(A042);
                                }
                            }
                            r9.A00 = this.A09;
                            r9.notifyDataSetChanged();
                            ArrayList arrayList = this.A09;
                            if (!arrayList.isEmpty()) {
                                long A062 = this.A0I.A06(((AnonymousClass0QM) arrayList.get(0)).A08);
                                TextView textView = (TextView) findViewById(R.id.calls_title);
                                if (DateUtils.isToday(A062)) {
                                    textView.setText(C001801b.A0Y(r5));
                                } else if (DateUtils.isToday(86400000 + A062)) {
                                    textView.setText(C001801b.A0Z(r5));
                                } else {
                                    textView.setText(DateUtils.formatDateTime(this, A062, 16));
                                }
                            } else {
                                finish();
                            }
                        }
                        A0T();
                        this.A0E.A01(this.A0D);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            Log.i("calllog/dialog-add-contact");
            AnonymousClass0MB r3 = new AnonymousClass0MB(this);
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            r3.A01.A0E = r2.A06(R.string.add_contact_as_new_or_existing);
            r3.A07(r2.A06(R.string.new_contact), new DialogInterface$OnClickListenerC670937e(this));
            r3.A06(r2.A06(R.string.existing_contact), new DialogInterface$OnClickListenerC670737c(this));
            return r3.A00();
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            Log.w("calllog/add to contacts: activity not found, probably tablet");
            AnonymousClass0MB r32 = new AnonymousClass0MB(this);
            AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
            r32.A01.A0E = r22.A06(R.string.activity_not_found);
            r32.A07(r22.A06(R.string.ok), new DialogInterface$OnClickListenerC670837d(this));
            return r32.A00();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        menu.add(0, R.id.menuitem_new_conversation, 0, r3.A06(R.string.menuitem_new)).setIcon(R.drawable.ic_action_message).setAlphabeticShortcut('n').setShowAsAction(2);
        menu.add(0, R.id.menuitem_clear_call_log, 0, r3.A06(R.string.clear_single_log)).setIcon(R.drawable.ic_action_delete);
        C007003k r0 = this.A05;
        if (r0 != null && r0.A08 == null) {
            menu.add(0, R.id.menuitem_add_to_contacts, 0, r3.A06(R.string.add_contact));
        }
        menu.add(0, R.id.menuitem_unblock_contact, 0, r3.A06(R.string.unblock));
        menu.add(0, R.id.menuitem_block_contact, 0, r3.A06(R.string.block));
        return true;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0E.A00(this.A0D);
        AnonymousClass3TV r0 = this.A08;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        if (r0.A08() == false) goto L_0x0083;
     */
    @Override // X.ActivityC004702f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r9) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallLogActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean A0H2 = this.A0A.A0H((UserJid) this.A05.A02(UserJid.class));
        MenuItem findItem = menu.findItem(R.id.menuitem_unblock_contact);
        if (findItem != null) {
            findItem.setVisible(A0H2);
        }
        MenuItem findItem2 = menu.findItem(R.id.menuitem_block_contact);
        if (findItem2 != null) {
            findItem2.setVisible(!A0H2);
        }
        return true;
    }
}
