package com.whatsapp.qrcode;

import X.AbstractC64492yH;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02U;
import X.AnonymousClass09H;
import X.AnonymousClass0EO;
import X.AnonymousClass1NO;
import X.AnonymousClass3LA;
import X.C002001d;
import X.C002101e;
import X.C007003k;
import X.C06470Tj;
import X.C09970dp;
import X.C64712yd;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.util.Log;

public class GroupLinkQrActivity extends ActivityC004602e implements AnonymousClass1NO, AbstractC64492yH {
    public C007003k A00;
    public AnonymousClass02U A01;
    public C64712yd A02;
    public ContactQrContactCardView A03;
    public String A04;
    public final AnonymousClass01A A05 = AnonymousClass01A.A00();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final AnonymousClass0EO A07 = AnonymousClass0EO.A00();
    public final AnonymousClass09H A08 = AnonymousClass09H.A01();
    public final AnonymousClass00T A09 = C002101e.A00();

    public final void A0T(boolean z) {
        if (z) {
            APv(0, R.string.contact_qr_wait);
        }
        AnonymousClass3LA r1 = new AnonymousClass3LA(((ActivityC004702f) this).A0F, this.A08, this, z);
        AnonymousClass02U r0 = this.A01;
        if (r0 != null) {
            r1.A00(r0);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC64492yH
    public void AGz(String str, int i, boolean z) {
        String A0K;
        this.A0K.A00();
        if (str != null) {
            StringBuilder sb = new StringBuilder("invitelink/gotcode/");
            sb.append(str);
            sb.append(" recreate:");
            sb.append(z);
            Log.i(sb.toString());
            AnonymousClass0EO r0 = this.A07;
            r0.A0j.put(this.A01, str);
            this.A04 = str;
            ContactQrContactCardView contactQrContactCardView = this.A03;
            if (TextUtils.isEmpty(str)) {
                A0K = null;
            } else {
                A0K = AnonymousClass008.A0K("https://chat.whatsapp.com/", str);
            }
            contactQrContactCardView.setQrCode(A0K);
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
        if (TextUtils.isEmpty(this.A04)) {
            finish();
        }
    }

    @Override // X.AnonymousClass1NO
    public void AN7() {
        A0T(true);
    }

    public /* synthetic */ void lambda$onCreate$2358$GroupLinkQrActivity(View view) {
        onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String A0K;
        super.onCreate(bundle);
        setContentView(R.layout.group_qr_code);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        AnonymousClass01X r4 = this.A06;
        toolbar.setNavigationIcon(new C06470Tj(r4, C002001d.A0e(getResources().getDrawable(R.drawable.ic_back_teal), getResources().getColor(R.color.tealActionBarItemDrawableTint))));
        toolbar.setTitle(r4.A06(R.string.contact_qr_title));
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 11));
        A0C(toolbar);
        setTitle(r4.A06(R.string.settings_qr));
        AnonymousClass02U A032 = AnonymousClass02U.A03(getIntent().getStringExtra("jid"));
        if (A032 != null) {
            this.A01 = A032;
            this.A00 = this.A05.A0A(A032);
            ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) findViewById(R.id.group_qr_card);
            this.A03 = contactQrContactCardView;
            contactQrContactCardView.A01(this.A00, true);
            this.A03.setStyle(0);
            this.A03.setPrompt(r4.A06(R.string.group_link_qr_prompt));
            this.A02 = new C64712yd();
            AnonymousClass0EO r0 = this.A07;
            String str = (String) r0.A0j.get(this.A01);
            this.A04 = str;
            if (!TextUtils.isEmpty(str)) {
                String str2 = this.A04;
                ContactQrContactCardView contactQrContactCardView2 = this.A03;
                if (TextUtils.isEmpty(str2)) {
                    A0K = null;
                } else {
                    A0K = AnonymousClass008.A0K("https://chat.whatsapp.com/", str2);
                }
                contactQrContactCardView2.setQrCode(A0K);
            }
            A0T(false);
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass01X r4 = this.A06;
        menu.add(0, R.id.menuitem_contactqr_share, 0, r4.A06(R.string.contact_qr_share)).setIcon(C002001d.A0b(this, R.drawable.ic_share, R.color.shareIconTint)).setShowAsAction(2);
        menu.add(0, R.id.menuitem_contactqr_revoke, 0, r4.A06(R.string.contact_qr_revoke));
        return true;
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String A0K;
        String A0K2;
        if (menuItem.getItemId() == R.id.menuitem_contactqr_share) {
            if (this.A04 == null) {
                A0T(false);
                ((ActivityC004702f) this).A0F.A06(R.string.share_failed, 0);
                return true;
            }
            A0G(R.string.contact_qr_wait);
            AnonymousClass00T r6 = this.A09;
            AnonymousClass01X r8 = this.A06;
            Object[] objArr = new Object[1];
            String str = this.A04;
            if (TextUtils.isEmpty(str)) {
                A0K = null;
            } else {
                A0K = AnonymousClass008.A0K("https://chat.whatsapp.com/", str);
            }
            objArr[0] = A0K;
            C09970dp r5 = new C09970dp(this, r8.A0D(R.string.group_qr_email_body_with_link, objArr));
            Bitmap[] bitmapArr = new Bitmap[1];
            C007003k r2 = this.A00;
            String str2 = this.A04;
            if (TextUtils.isEmpty(str2)) {
                A0K2 = null;
            } else {
                A0K2 = AnonymousClass008.A0K("https://chat.whatsapp.com/", str2);
            }
            bitmapArr[0] = C002001d.A0U(this, r2, true, A0K2, r8.A06(R.string.group_link_qr_share_prompt));
            r6.ANC(r5, bitmapArr);
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_contactqr_revoke) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass02U r0 = this.A01;
            RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment = new RevokeLinkConfirmationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("jid", r0.getRawString());
            bundle.putBoolean("from_qr", true);
            revokeLinkConfirmationDialogFragment.A0N(bundle);
            APm(revokeLinkConfirmationDialogFragment);
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A02.A01(this.A0I, getWindow());
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        this.A02.A00(getWindow());
        super.onStop();
    }
}
