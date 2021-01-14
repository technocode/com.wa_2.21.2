package com.whatsapp.biz.product.view.activity;

import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass00Z;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass02M;
import X.AnonymousClass08B;
import X.AnonymousClass09H;
import X.AnonymousClass0HL;
import X.AnonymousClass0J9;
import X.AnonymousClass0L2;
import X.AnonymousClass0M5;
import X.AnonymousClass0O5;
import X.AnonymousClass0OS;
import X.AnonymousClass0QU;
import X.AnonymousClass0SD;
import X.AnonymousClass0Z9;
import X.AnonymousClass1RX;
import X.AnonymousClass1S2;
import X.AnonymousClass1S3;
import X.AnonymousClass1S6;
import X.AnonymousClass1S8;
import X.AnonymousClass1S9;
import X.AnonymousClass1SS;
import X.AnonymousClass1x9;
import X.AnonymousClass2C0;
import X.AnonymousClass2D8;
import X.C000300f;
import X.C003701u;
import X.C007003k;
import X.C014308b;
import X.C017009c;
import X.C017109d;
import X.C02580Cq;
import X.C05530Oy;
import X.C07430Xq;
import X.C27831Rq;
import X.C40141sh;
import X.C41771vc;
import X.C42001vz;
import X.C42411wf;
import X.C42651x3;
import X.C42691x7;
import X.C42721xB;
import X.C42731xC;
import X.C42741xD;
import X.C42751xE;
import X.C42761xF;
import X.C42771xG;
import X.C42781xH;
import X.C42791xI;
import X.C42801xJ;
import X.C44151za;
import X.C460227l;
import X.C48052Ks;
import X.C48082Kv;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.InfoCard;
import com.whatsapp.WaButton;
import com.whatsapp.biz.catalog.CatalogReportDialogFragment;
import com.whatsapp.biz.catalog.ShareProductLinkActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ProductDetailActivity extends AnonymousClass2D8 implements AnonymousClass1S2 {
    public WaButton A00;
    public WaButton A01;
    public C460227l A02;
    public C42791xI A03;
    public String A04;
    public final AnonymousClass01I A05 = AnonymousClass01I.A00();
    public final C017009c A06 = C017009c.A00();
    public final C017109d A07 = C017109d.A00();
    public final AnonymousClass1RX A08 = new C42781xH(this);
    public final C41771vc A09 = C41771vc.A00;
    public final C05530Oy A0A = C05530Oy.A02();
    public final C27831Rq A0B = C27831Rq.A00();
    public final AnonymousClass1S3 A0C = AnonymousClass1S3.A00();
    public final AnonymousClass1S6 A0D = AnonymousClass1S6.A00();
    public final AnonymousClass1S8 A0E = new C42771xG(this);
    public final C07430Xq A0F = C07430Xq.A00;
    public final AnonymousClass01A A0G = AnonymousClass01A.A00();
    public final AnonymousClass08B A0H = AnonymousClass08B.A00;
    public final C014308b A0I = C014308b.A00();
    public final AnonymousClass0L2 A0J = AnonymousClass0L2.A01();
    public final AnonymousClass01P A0K = AnonymousClass01P.A00();
    public final AnonymousClass09H A0L = AnonymousClass09H.A01();

    public static void A05(AnonymousClass0Z9 r8, View view, boolean z, Context context, AnonymousClass0HL r12, C02580Cq r13, boolean z2, int i) {
        String str = r8.A04;
        UserJid userJid = r8.A01;
        C48052Ks A022 = r12.A02(str);
        if (A022 != null) {
            AnonymousClass2D8.A04(userJid, A022.A06, z2, null, null, context, new Intent(context, ProductDetailActivity.class), i);
        } else if (z) {
            C42761xF r1 = new C42761xF(r8, context, r12, view, z2, i, r13);
            if (r13 != null) {
                view.setTag(r8.A0n);
                r13.A0A(r8, view, r1);
                return;
            }
            throw null;
        } else {
            r13.A0D(r8, view, new C42761xF(r8, context, r12, view, z2, i, r13), false);
        }
    }

    public void A0V(int i) {
        ((AnonymousClass2D8) this).A06.setVisibility(0);
        ((AnonymousClass2D8) this).A06.setTextColor(getResources().getColor(R.color.catalog_error_color));
        ((AnonymousClass2D8) this).A06.setText(((AnonymousClass2C0) this).A01.A06(i));
    }

    public void A0W(String str) {
        int i;
        C48052Ks r0 = ((AnonymousClass2D8) this).A0B;
        if (r0 != null) {
            C27831Rq r4 = this.A0B;
            String str2 = r0.A06;
            UserJid userJid = ((AnonymousClass2D8) this).A0C;
            AnonymousClass00Z r7 = r4.A06;
            boolean A012 = r7.A01(r4.A00);
            if (r4.A01.contains(13) || A012) {
                C44151za r2 = new C44151za();
                r2.A03 = 13;
                r2.A07 = str;
                r2.A08 = r4.A00;
                r2.A0A = str2;
                r2.A06 = userJid.getRawString();
                if (!A012) {
                    r2.A00 = Boolean.TRUE;
                }
                r4.A06(r2);
                AnonymousClass00Y r1 = r4.A05;
                if (A012) {
                    i = r7.A00;
                } else {
                    i = 1;
                }
                r1.A08(r2, i);
            }
            C48082Kv r5 = new C48082Kv(((AnonymousClass2D8) this).A0B.A06, str, r4.A00, ((AnonymousClass2D8) this).A0C.getRawString());
            AnonymousClass1S3 r42 = this.A0C;
            C42411wf r10 = new C42411wf(r42.A07, r42, r5);
            AnonymousClass09H r9 = r10.A02;
            String A022 = r9.A02();
            C48082Kv r15 = r10.A01;
            ArrayList arrayList = new ArrayList();
            String str3 = r15.A01;
            arrayList.add(new AnonymousClass0M5("id", (AnonymousClass0OS[]) null, str3));
            String str4 = r15.A02;
            if (!TextUtils.isEmpty(str4)) {
                arrayList.add(new AnonymousClass0M5("reason", (AnonymousClass0OS[]) null, str4));
            }
            arrayList.add(new AnonymousClass0M5("catalog_session_id", (AnonymousClass0OS[]) null, r15.A03));
            AnonymousClass0M5 r13 = new AnonymousClass0M5("request", new AnonymousClass0OS[]{new AnonymousClass0OS("type", "report_product", null, (byte) 0), new AnonymousClass0OS("biz_jid", r15.A00, null, (byte) 0)}, (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]), null);
            boolean A0B2 = r9.A0B(193, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "fb:thrift_iq", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00)}, r13), r10, 32000);
            StringBuilder A0S = AnonymousClass008.A0S("app/sendReportBizProduct productId=");
            A0S.append(str3);
            A0S.append(" success:");
            A0S.append(A0B2);
            Log.i(A0S.toString());
            if (A0B2) {
                A0G(R.string.catalog_product_report_sending);
                return;
            }
            AnonymousClass02M r22 = r42.A01;
            r22.A02.post(new RunnableEBaseShape1S0210000_I1(r42, r5, false, 2));
        }
    }

    @Override // X.AnonymousClass1S2
    public void AIq(C48082Kv r6, boolean z) {
        String str;
        String str2;
        C48052Ks r0 = ((AnonymousClass2D8) this).A0B;
        if (r0 != null && r0.A06.equals(r6.A01)) {
            ((ActivityC004702f) this).A0K.A00();
            if (z) {
                C27831Rq r3 = this.A0B;
                C48052Ks r02 = ((AnonymousClass2D8) this).A0B;
                if (r02 == null) {
                    str2 = null;
                } else {
                    str2 = r02.A06;
                }
                r3.A04(15, str2, ((AnonymousClass2D8) this).A0C, null);
                APq(R.string.catalog_product_report_complete_title, R.string.catalog_product_report_complete_content, new Object[0]);
                return;
            }
            C27831Rq r32 = this.A0B;
            C48052Ks r03 = ((AnonymousClass2D8) this).A0B;
            if (r03 == null) {
                str = null;
            } else {
                str = r03.A06;
            }
            r32.A04(16, str, ((AnonymousClass2D8) this).A0C, null);
            APo(R.string.catalog_product_report_complete_error);
        }
    }

    @Override // X.AnonymousClass2D8, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 55) {
            this.A0D.A05(this, ((AnonymousClass2D8) this).A08, ((AnonymousClass2D8) this).A0C, 2, Collections.singletonList(((AnonymousClass2D8) this).A0B), ((AnonymousClass2D8) this).A0C, 0, 0);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.AnonymousClass2D8, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        InfoCard infoCard = (InfoCard) findViewById(R.id.product_business_info_container);
        int A012 = this.A07.A01();
        UserJid userJid = ((AnonymousClass2D8) this).A0C;
        AnonymousClass02M r8 = ((ActivityC004702f) this).A0F;
        AnonymousClass09H r9 = this.A0L;
        AnonymousClass08B r10 = this.A0H;
        C017009c r11 = this.A06;
        C40141sh r4 = new C40141sh(A012, userJid, null, r8, r9, r10, r11);
        AnonymousClass00T r14 = this.A0Q;
        C42651x3 r12 = new C42651x3(userJid, r14, this.A0A, r11, this.A0B, r4);
        C000300f r5 = ((ActivityC004702f) this).A0G;
        C42001vz r112 = new C42001vz(getApplication(), new AnonymousClass1S9(userJid, r14, r5, r11));
        AnonymousClass0O5 A9n = A9n();
        String canonicalName = C460227l.class.getCanonicalName();
        if (canonicalName != null) {
            String A0K2 = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = A9n.A00;
            Object obj = (AnonymousClass0SD) hashMap.get(A0K2);
            if (!C460227l.class.isInstance(obj)) {
                obj = new C460227l(r112.A00, r112.A01);
                AnonymousClass0SD r0 = (AnonymousClass0SD) hashMap.put(A0K2, obj);
                if (r0 != null) {
                    r0.A00();
                }
            }
            this.A02 = (C460227l) obj;
            C42801xJ r102 = new C42801xJ(new AnonymousClass1SS(), ((AnonymousClass2D8) this).A0C, r5, r12);
            AnonymousClass0O5 A9n2 = A9n();
            String canonicalName2 = C42791xI.class.getCanonicalName();
            if (canonicalName2 != null) {
                String A0K3 = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                HashMap hashMap2 = A9n2.A00;
                Object obj2 = (AnonymousClass0SD) hashMap2.get(A0K3);
                if (!C42791xI.class.isInstance(obj2)) {
                    obj2 = new C42791xI(r102.A02, r102.A03, r102.A00, r102.A01);
                    AnonymousClass0SD r02 = (AnonymousClass0SD) hashMap2.put(A0K3, obj2);
                    if (r02 != null) {
                        r02.A00();
                    }
                }
                C42791xI r7 = (C42791xI) obj2;
                this.A03 = r7;
                r7.A03.A03(this, new C42741xD(this));
                this.A03.A06.A03(this, new C42721xB(this));
                this.A03.A04.A03(this, new C42731xC(this));
                this.A03.A05.A03(this, new C42691x7(this));
                this.A03.A02.A03(this, new C42751xE(this));
                this.A03.A01.A03(this, new AnonymousClass1x9(this, bundle, infoCard));
                this.A09.A01(this.A08);
                this.A0F.A01(this.A0E);
                this.A0C.A09.add(this);
                WaButton waButton = (WaButton) findViewById(R.id.message_business_btn);
                this.A01 = waButton;
                waButton.setVisibility(8);
                WaButton waButton2 = (WaButton) findViewById(R.id.cart_btn);
                this.A00 = waButton2;
                waButton2.setVisibility(8);
                this.A00.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 36));
                if (infoCard != null && !this.A05.A09(((AnonymousClass2D8) this).A0C)) {
                    findViewById(R.id.divider_bizinfo).setVisibility(0);
                    infoCard.setVisibility(0);
                    View findViewById = findViewById(R.id.contact_info_container);
                    TextView textView = (TextView) findViewById(R.id.contact_name);
                    ImageView imageView = (ImageView) findViewById(R.id.contact_photo);
                    AnonymousClass01P r03 = this.A0K;
                    AnonymousClass0J9 A0C2 = r03.A02.A0C(((AnonymousClass2D8) this).A0C);
                    if (A0C2 == null) {
                        str = null;
                    } else {
                        str = A0C2.A08;
                    }
                    C007003k A0A2 = this.A0G.A0A(((AnonymousClass2D8) this).A0C);
                    if (textView != null) {
                        if (C003701u.A0E(str)) {
                            str = this.A0I.A08(A0A2, false);
                        }
                        textView.setText(str);
                    }
                    this.A0J.A03(this).A02(A0A2, imageView);
                    findViewById.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 37));
                }
                C42651x3 r42 = this.A03.A08;
                r42.A0A.ANF(new RunnableEBaseShape7S0100000_I1_2(r42, 44));
                this.A02.A03();
                this.A01.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, this, 13));
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0069, code lost:
        if (r4 == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r9) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass2D8, X.ActivityC004902h
    public void onDestroy() {
        this.A0C.A09.remove(this);
        this.A09.A00(this.A08);
        this.A0F.A00(this.A0E);
        super.onDestroy();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass2D8
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (R.id.menu_forward == itemId) {
            if (A0U()) {
                this.A0D.A05(this, ((AnonymousClass2D8) this).A08, ((AnonymousClass2D8) this).A0C, 3, Collections.singletonList(((AnonymousClass2D8) this).A0B), null, 0, 0);
            }
            return true;
        } else if (R.id.menu_share == itemId) {
            ShareProductLinkActivity.A04(this, ((AnonymousClass2D8) this).A0C, ((AnonymousClass2D8) this).A0D);
            return true;
        } else if (R.id.menu_report == itemId) {
            APl(new CatalogReportDialogFragment(), null);
            return true;
        } else if (16908332 != itemId) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C42791xI r3 = this.A03;
            if (r3 == null) {
                throw null;
            } else if (getIntent().getBooleanExtra("is_from_product_detail_screen", false)) {
                if (Build.VERSION.SDK_INT < 29) {
                    onStateNotSaved();
                }
                r3.A03.A07(Boolean.TRUE);
                return true;
            } else {
                onBackPressed();
                return true;
            }
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.AnonymousClass2D8, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C42651x3 r3 = this.A03.A08;
        r3.A0A.ANF(new RunnableEBaseShape7S0100000_I1_2(r3, 45));
    }
}
