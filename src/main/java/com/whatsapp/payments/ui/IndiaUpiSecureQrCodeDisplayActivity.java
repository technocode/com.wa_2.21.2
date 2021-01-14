package com.whatsapp.payments.ui;

import X.AbstractC000400g;
import X.ActivityC004702f;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass088;
import X.AnonymousClass0L2;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass0YX;
import X.AnonymousClass0Yj;
import X.AnonymousClass1N7;
import X.AnonymousClass1PY;
import X.AnonymousClass2C0;
import X.AnonymousClass36B;
import X.AnonymousClass36C;
import X.AnonymousClass3G2;
import X.AnonymousClass3G3;
import X.AnonymousClass3G4;
import X.AnonymousClass3SI;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C02020Ai;
import X.C02590Cr;
import X.C12420i4;
import X.C61992u4;
import X.C63332wF;
import X.C63882xA;
import X.C63892xB;
import X.C64712yd;
import X.C68393Da;
import X.C69703Ib;
import X.C73813Yu;
import X.ViewTreeObserver$OnScrollChangedListenerC62742vH;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.util.Log;

public class IndiaUpiSecureQrCodeDisplayActivity extends AnonymousClass1PY {
    public View A00;
    public TextView A01;
    public AnonymousClass0YX A02;
    public IndiaUpiDisplaySecureQrCodeView A03;
    public C69703Ib A04;
    public C64712yd A05;
    public final AnonymousClass01I A06 = AnonymousClass01I.A00();
    public final AnonymousClass0L2 A07 = AnonymousClass0L2.A01();
    public final C02020Ai A08;
    public final C63332wF A09;
    public final AnonymousClass36C A0A;

    public IndiaUpiSecureQrCodeDisplayActivity() {
        if (AnonymousClass36C.A02 == null) {
            synchronized (AnonymousClass36B.class) {
                if (AnonymousClass36C.A02 == null) {
                    AnonymousClass00T A002 = C002101e.A00();
                    AnonymousClass088 A003 = AnonymousClass088.A00();
                    C02590Cr.A00();
                    AnonymousClass36C.A02 = new AnonymousClass36C(A002, A003);
                }
            }
        }
        this.A0A = AnonymousClass36C.A02;
        this.A08 = C02020Ai.A00();
        this.A09 = C63332wF.A00();
        this.A05 = new C64712yd();
    }

    public final void A0d() {
        this.A03.A00(true);
        this.A00.setDrawingCacheEnabled(true);
        AnonymousClass36C r1 = this.A0A;
        r1.A01.ANC(new AnonymousClass3SI(getApplicationContext(), this.A00.getDrawingCache(), r1.A00, new AnonymousClass3G3(this)), new Void[0]);
    }

    @Override // X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1006) {
            this.A03.A00(false);
        } else if (i != 202) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0d();
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        C61992u4 A002;
        String trim;
        super.onCreate(bundle);
        setContentView(R.layout.india_payments_dispay_secure_qr_code);
        this.A01 = (TextView) findViewById(R.id.scan_to_pay_info);
        this.A03 = (IndiaUpiDisplaySecureQrCodeView) findViewById(R.id.display_qr_code_view);
        if (getIntent().getExtras() != null) {
            str = getIntent().getExtras().getString("extra_account_holder_name");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str.trim();
        } else {
            str2 = null;
        }
        C63332wF r1 = this.A09;
        if (r1 != null) {
            C69703Ib r7 = (C69703Ib) C002001d.A0l(this, new C73813Yu(r1, this)).A00(C69703Ib.class);
            this.A04 = r7;
            AnonymousClass3G2 r3 = new AnonymousClass3G2(this);
            AnonymousClass3G4 r2 = new AnonymousClass3G4(this);
            r7.A02.A03(r7.A00, r3);
            r7.A01.A03(r7.A00, r2);
            C68393Da r22 = r7.A0A;
            String[] A0J = r22.A0J();
            if (TextUtils.isEmpty(A0J[0])) {
                String A052 = r22.A05();
                if (TextUtils.isEmpty(A052)) {
                    Log.d("PAY: user vpa missing");
                    r7.A02.A07(new C63892xB(-1, -1));
                } else {
                    if (TextUtils.isEmpty(str2)) {
                        trim = r7.A09.A00.getString("push_name", "");
                        r7.A0C.A01(1, null);
                    } else {
                        trim = str2.trim();
                    }
                    C61992u4 A022 = r7.A02();
                    A022.A02 = trim;
                    A022.A09 = A052;
                    r7.A01.A07(A022);
                }
            } else {
                AnonymousClass0Yj r23 = r7.A01;
                String str3 = A0J[0];
                if (str3 == null) {
                    A002 = null;
                } else {
                    A002 = C61992u4.A00(Uri.parse(str3));
                    if (A002 == null) {
                        A002 = null;
                    } else {
                        A002.A01 = str3;
                    }
                }
                r23.A07(A002);
            }
            AnonymousClass0S2 A092 = A09();
            if (A092 != null) {
                A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.my_qr_code));
                Drawable drawable = getResources().getDrawable(R.drawable.ic_back);
                drawable.setColorFilter(getResources().getColor(R.color.colorGrayQRCodeIcon), PorterDuff.Mode.SRC_ATOP);
                A092.A04(drawable);
                A092.A0A(true);
                A092.A02(0.0f);
                View findViewById = findViewById(R.id.parent_view);
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver$OnScrollChangedListenerC62742vH(this, findViewById, A092));
            }
            this.A03.setup(this.A04);
            this.A02 = this.A07.A03(this);
            AnonymousClass01I r24 = this.A06;
            r24.A04();
            if (r24.A01 != null) {
                AnonymousClass0YX r6 = this.A02;
                r24.A04();
                r6.A02(r24.A01, (ImageView) findViewById(R.id.contact_photo));
            }
            ((TextView) findViewById(R.id.user_wa_vpa)).setText(this.A04.A02().A09);
            ((TextView) findViewById(R.id.user_account_name)).setText(this.A04.A02().A02);
            TextView textView = (TextView) findViewById(R.id.user_wa_phone);
            r24.A04();
            UserJid userJid = r24.A03;
            if (userJid != null) {
                textView.setText(C12420i4.A03(userJid.user));
                this.A00 = findViewById(R.id.qrcode_view);
                this.A01.setText(((AnonymousClass2C0) this).A01.A0D(R.string.scan_this_code_to_pay_user, this.A04.A02().A02));
                this.A04.A04(0, null);
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable = getResources().getDrawable(R.drawable.ic_action_share);
        drawable.setColorFilter(getResources().getColor(R.color.colorGrayQRCodeIcon), PorterDuff.Mode.SRC_ATOP);
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        menu.add(0, R.id.menuitem_share_qr, 0, r3.A06(R.string.share)).setIcon(drawable).setShowAsAction(1);
        if (Build.VERSION.SDK_INT >= 19) {
            menu.add(0, R.id.menuitem_print, 0, r3.A06(R.string.print_qr_code));
        }
        if (((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A20)) {
            menu.add(0, R.id.menuitem_sign_qr, 0, r3.A06(R.string.upi_signing_qr_code_revoke_menu_item));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A02.A00();
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_share_qr) {
            if (C004302a.A01(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.payment_permission_storage_need_write_access_v30;
                if (i < 30) {
                    i2 = R.string.payment_permission_storage_need_write_access;
                }
                startActivityForResult(RequestPermissionActivity.A05(this, R.string.payment_permission_storage_need_write_access_request, i2, true), 202);
                return true;
            }
            this.A04.A04(4, new C63882xA(this.A03.getUserInputAmount()));
            return true;
        } else if (itemId == 16908332) {
            AnonymousClass0TX.A0B(this);
            return true;
        } else {
            if (itemId == R.id.menuitem_print) {
                if (this.A03.A09 != null && !isFinishing()) {
                    View view = this.A00;
                    if (view == null) {
                        throw null;
                    }
                    view.setDrawingCacheEnabled(true);
                    this.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    View view2 = this.A00;
                    view2.layout(0, 0, view2.getMeasuredWidth(), this.A00.getMeasuredHeight());
                    this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    this.A00.buildDrawingCache(true);
                    Bitmap createBitmap = Bitmap.createBitmap(this.A00.getDrawingCache());
                    AnonymousClass36C r1 = this.A0A;
                    String str = this.A04.A02().A02;
                    if (r1 != null) {
                        PrintManager printManager = (PrintManager) getSystemService("print");
                        if (printManager == null) {
                            Log.e("PAY: payments-display-qr/print/no-print-manager");
                        } else {
                            printManager.print(str, new AnonymousClass1N7(this, createBitmap), null);
                        }
                        this.A00.setDrawingCacheEnabled(false);
                    } else {
                        throw null;
                    }
                }
            } else if (itemId == R.id.menuitem_sign_qr) {
                this.A04.A04(3, null);
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A03;
        if (indiaUpiDisplaySecureQrCodeView.A00.getVisibility() == 0) {
            indiaUpiDisplaySecureQrCodeView.A0B.requestFocus();
            indiaUpiDisplaySecureQrCodeView.A0B.A01(true);
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A05.A01(((ActivityC004702f) this).A0I, getWindow());
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A05.A00(getWindow());
    }
}
