package com.whatsapp;

import X.AbstractC000400g;
import X.AbstractC64492yH;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02U;
import X.AnonymousClass03P;
import X.AnonymousClass05j;
import X.AnonymousClass09H;
import X.AnonymousClass0EO;
import X.AnonymousClass1G3;
import X.AnonymousClass1GH;
import X.AnonymousClass1GJ;
import X.AnonymousClass1NO;
import X.AnonymousClass2C0;
import X.AnonymousClass2Cp;
import X.AnonymousClass3LA;
import X.C007003k;
import X.C014308b;
import X.C25191Fl;
import X.C26861Mx;
import X.C26921Ne;
import X.C26931Nf;
import X.C39051qs;
import X.C40711ti;
import X.C40721tj;
import X.C40731tk;
import X.EnumC25131Fe;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.GroupLinkQrActivity;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ShareInviteLinkActivity extends AnonymousClass2Cp implements AnonymousClass1NO, AbstractC64492yH {
    public C26931Nf A00;
    public C26931Nf A01;
    public C40711ti A02;
    public C40721tj A03;
    public C40731tk A04;
    public AnonymousClass02U A05;
    public String A06;
    public final BroadcastReceiver A07;
    public final C39051qs A08;
    public final AnonymousClass01A A09 = AnonymousClass01A.A00();
    public final C014308b A0A;
    public final AnonymousClass0EO A0B;
    public final AnonymousClass09H A0C = AnonymousClass09H.A01();

    public ShareInviteLinkActivity() {
        AnonymousClass03P.A00();
        this.A0A = C014308b.A00();
        this.A0B = AnonymousClass0EO.A00();
        this.A07 = new C26921Ne(this);
        this.A08 = new C39051qs(this);
    }

    public final void A0X(String str) {
        String A0K;
        this.A06 = str;
        if (TextUtils.isEmpty(str)) {
            A0K = null;
        } else {
            A0K = AnonymousClass008.A0K("https://chat.whatsapp.com/", str);
        }
        if (!TextUtils.isEmpty(str)) {
            ((AnonymousClass2Cp) this).A01.setText(A0K);
            AnonymousClass01X r7 = ((AnonymousClass2C0) this).A01;
            String A0D = r7.A0D(R.string.share_invite_link_message, A0K);
            C007003k A092 = this.A09.A09(this.A05);
            if (A092 == null) {
                Log.e("invitelink/share/no-contact");
            } else {
                C40721tj r3 = this.A03;
                r3.A02 = A0D;
                r3.A01 = r7.A0D(R.string.share_invite_link_subject, this.A0A.A08(A092, false));
                this.A03.A00 = r7.A06(R.string.share_invite_link_via);
            }
            this.A04.A00 = A0D;
            this.A02.A00 = A0K;
            return;
        }
        A0Y(false);
        ((AnonymousClass2Cp) this).A01.setText(" \n ");
    }

    public final void A0Y(boolean z) {
        ((AnonymousClass2Cp) this).A01.setEnabled(z);
        ((C26931Nf) this.A02).A00.setEnabled(z);
        this.A01.A00.setEnabled(z);
        ((C26931Nf) this.A03).A00.setEnabled(z);
        ((C26931Nf) this.A04).A00.setEnabled(z);
    }

    public final void A0Z(boolean z) {
        AnonymousClass008.A1H("invitelink/sendgetlink/recreate:", z);
        if (z) {
            A0Y(false);
            A0O(true);
        }
        AnonymousClass3LA r1 = new AnonymousClass3LA(((ActivityC004702f) this).A0F, this.A0C, this, z);
        AnonymousClass02U r0 = this.A05;
        if (r0 != null) {
            r1.A00(r0);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC64492yH
    public void AGz(String str, int i, boolean z) {
        A0Y(true);
        A0O(false);
        if (str != null) {
            StringBuilder sb = new StringBuilder("invitelink/gotcode/");
            sb.append(str);
            sb.append(" recreate:");
            sb.append(z);
            Log.i(sb.toString());
            AnonymousClass0EO r0 = this.A0B;
            r0.A0j.put(this.A05, str);
            A0X(str);
            if (z) {
                APo(R.string.reset_link_complete);
                return;
            }
            return;
        }
        AnonymousClass008.A0v("invitelink/failed/", i);
        if (i == 401) {
            ((ActivityC004702f) this).A0F.A06(R.string.failed_create_invite_link_not_admin, 0);
        } else if (i != 404) {
            ((ActivityC004702f) this).A0F.A06(R.string.register_try_again_later, 0);
        } else {
            ((ActivityC004702f) this).A0F.A06(R.string.failed_create_invite_link_no_group, 0);
        }
        if (TextUtils.isEmpty(this.A06)) {
            finish();
        }
    }

    @Override // X.AnonymousClass1NO
    public void AN7() {
        A0Z(true);
    }

    public /* synthetic */ void lambda$onCreate$1437$ShareInviteLinkActivity(View view) {
        AnonymousClass02U r1 = this.A05;
        Intent intent = new Intent(this, GroupLinkQrActivity.class);
        intent.putExtra("jid", r1.getRawString());
        startActivity(intent);
    }

    public /* synthetic */ void lambda$onCreate$1438$ShareInviteLinkActivity(View view) {
        AnonymousClass02U r0 = this.A05;
        if (r0 != null) {
            RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment = new RevokeLinkConfirmationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("jid", r0.getRawString());
            bundle.putBoolean("from_qr", false);
            revokeLinkConfirmationDialogFragment.A0N(bundle);
            APl(revokeLinkConfirmationDialogFragment, null);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2Cp, X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        setTitle(r6.A06(R.string.share_invite_link_title));
        ((TextView) findViewById(R.id.share_link_description)).setText(r6.A06(R.string.invite_link_description));
        this.A04 = A0W();
        this.A02 = A0U();
        this.A03 = A0V();
        C26931Nf r1 = new C26931Nf();
        this.A00 = r1;
        r1.A00 = A0T();
        this.A00.A00(R.drawable.ic_scan_qr, r6.A06(R.string.settings_qr), new ViewOnClickEBaseShape3S0100000_I1_1(this, 28));
        View view = this.A00.A00;
        int i = 8;
        if (((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A1A)) {
            i = 0;
        }
        view.setVisibility(i);
        C26931Nf r12 = new C26931Nf();
        this.A01 = r12;
        r12.A00 = A0T();
        this.A01.A00(R.drawable.ic_revoke_invite, r6.A06(R.string.revoke_invite_link), new ViewOnClickEBaseShape3S0100000_I1_1(this, 29));
        AnonymousClass02U A032 = AnonymousClass02U.A03(getIntent().getStringExtra("jid"));
        if (A032 != null) {
            this.A05 = A032;
            if (this.A09.A09(A032) == null) {
                StringBuilder A0S = AnonymousClass008.A0S("invitelink/sharelink/no-contact ");
                A0S.append(this.A05);
                Log.e(A0S.toString());
                finish();
                return;
            }
            AnonymousClass0EO r3 = this.A0B;
            A0X((String) r3.A0j.get(this.A05));
            A0Z(false);
            if (Build.VERSION.SDK_INT >= 18) {
                registerReceiver(this.A07, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
            }
            r3.A0Y.A01(this.A08);
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (Build.VERSION.SDK_INT >= 19 && !((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A1A)) {
            menu.add(0, R.id.menuitem_print, 0, ((AnonymousClass2C0) this).A01.A06(R.string.print_invite_link_qr_code));
        }
        if (NfcAdapter.getDefaultAdapter(this) != null) {
            menu.add(0, R.id.menuitem_write_tag, 0, ((AnonymousClass2C0) this).A01.A06(R.string.write_nfc_tag));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 18) {
            unregisterReceiver(this.A07);
        }
        AnonymousClass0EO r0 = this.A0B;
        r0.A0Y.A00(this.A08);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_print) {
            StringBuilder A0S = AnonymousClass008.A0S("invitelink/printlink/");
            A0S.append(this.A06);
            A0S.append(" jid:");
            A0S.append(this.A05);
            Log.i(A0S.toString());
            if (!(this.A05 == null || this.A06 == null)) {
                try {
                    EnumMap enumMap = new EnumMap(EnumC25131Fe.class);
                    StringBuilder sb = new StringBuilder();
                    sb.append("whatsapp://chat?code=");
                    sb.append(this.A06);
                    AnonymousClass1GJ A012 = AnonymousClass1GH.A01(sb.toString(), AnonymousClass1G3.M, enumMap);
                    if (A012 != null) {
                        AnonymousClass05j r7 = A012.A04;
                        C007003k A092 = this.A09.A09(this.A05);
                        if (A092 == null) {
                            Log.e("invitelink/print/no-contact");
                            return true;
                        }
                        String A0D = ((AnonymousClass2C0) this).A01.A0D(R.string.share_invite_link_qr_code, this.A0A.A08(A092, false));
                        PrintManager printManager = (PrintManager) getSystemService("print");
                        if (printManager == null) {
                            Log.e("invitelink/print/no-print-manager");
                            return true;
                        }
                        printManager.print(A0D, new C26861Mx(this, this.A0M, A0D, r7), null);
                        return true;
                    }
                } catch (C25191Fl e) {
                    Log.i("invitelink/", e);
                }
            }
            return true;
        } else if (itemId != R.id.menuitem_write_tag) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            StringBuilder A0S2 = AnonymousClass008.A0S("invitelink/writetag/");
            A0S2.append(this.A06);
            A0S2.append(" jid:");
            A0S2.append(this.A05);
            Log.i(A0S2.toString());
            if (!(this.A05 == null || this.A06 == null)) {
                Intent intent = new Intent(this, WriteNfcTagActivity.class);
                intent.putExtra("mime", "application/com.whatsapp.join");
                intent.putExtra("data", this.A06);
                startActivity(intent);
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 2131363470(0x7f0a068e, float:1.834675E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L_0x001a
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r3)
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.setEnabled(r0)
        L_0x001a:
            boolean r0 = super.onPrepareOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ShareInviteLinkActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }
}
