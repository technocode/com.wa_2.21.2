package com.whatsapp.deeplink;

import X.AbstractC000400g;
import X.AbstractC48272Lo;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass00Y;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02Y;
import X.AnonymousClass09H;
import X.AnonymousClass0GZ;
import X.AnonymousClass0HL;
import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import X.AnonymousClass1S3;
import X.AnonymousClass2C0;
import X.AnonymousClass2D8;
import X.C000300f;
import X.C002001d;
import X.C01970Ad;
import X.C02780Dk;
import X.C06190Sd;
import X.C27831Rq;
import X.C41191ud;
import X.C42251wO;
import X.C42391wd;
import X.C42491wn;
import X.C44271zm;
import X.C48092Kw;
import X.C52852br;
import X.C52862bs;
import X.DialogInterface$OnClickListenerC48242Ll;
import X.DialogInterface$OnClickListenerC48252Lm;
import X.HandlerC48262Ln;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.contactqr.QrSheetDeepLinkActivity;
import com.whatsapp.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class DeepLinkActivity extends ActivityC004602e implements AbstractC48272Lo {
    public Handler A00;
    public final C02780Dk A01 = C02780Dk.A02();
    public final AnonymousClass02M A02 = AnonymousClass02M.A00();
    public final AnonymousClass01I A03 = AnonymousClass01I.A00();
    public final C000300f A04 = C000300f.A00();
    public final AnonymousClass0GZ A05 = AnonymousClass0GZ.A00();
    public final C27831Rq A06 = C27831Rq.A00();
    public final AnonymousClass0HL A07 = AnonymousClass0HL.A00();
    public final AnonymousClass1S3 A08 = AnonymousClass1S3.A00();
    public final C42391wd A09 = C42391wd.A00;
    public final C06190Sd A0A = C06190Sd.A00();
    public final AnonymousClass00Y A0B = AnonymousClass00Y.A00();
    public final AnonymousClass09H A0C = AnonymousClass09H.A01();
    public final C01970Ad A0D = C01970Ad.A00();

    public void A0T(int i, int i2, C41191ud r7) {
        Message obtain = Message.obtain(this.A00, 1);
        obtain.arg1 = i;
        this.A00.sendMessageDelayed(obtain, 500);
        r7.A01.A03(new C52852br(this, i2), null);
    }

    @Override // X.AbstractC48272Lo
    public void AFY(int i) {
        this.A0K.A00();
        APo(R.string.invalid_deep_link);
        this.A00.removeMessages(1);
    }

    @Override // X.AbstractC48272Lo
    public void AKh(Uri uri) {
        this.A00.removeMessages(1);
        AMi();
        if (uri == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
            builder.setMessage(r3.A06(R.string.futureproof_deep_link)).setNegativeButton(r3.A06(R.string.cancel), new DialogInterface$OnClickListenerC48242Ll(this)).setPositiveButton(r3.A06(R.string.update_whatsapp), new DialogInterface$OnClickListenerC48252Lm(this)).create().show();
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", getPackageName());
        intent.putExtra("create_new_tab", true);
        this.A01.A05(this, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        UserJid userJid;
        Pair pair;
        super.onCreate(bundle);
        String str = null;
        this.A00 = new HandlerC48262Ln(this, getMainLooper());
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data == null) {
            APq(R.string.invalid_deep_link, 0, new Object[0]);
            finish();
            return;
        }
        int A032 = this.A0A.A03(data);
        int intExtra = intent.getIntExtra("source", 1);
        if (A032 != 2) {
            C44271zm r1 = new C44271zm();
            r1.A01 = Integer.valueOf(intExtra);
            r1.A02 = Integer.valueOf(A032);
            this.A0B.A0B(r1, null, false);
        }
        if (A032 != 10) {
            switch (A032) {
                case 1:
                    C52862bs r6 = new C52862bs(this, this.A0C);
                    try {
                        URI uri = new URI(data.getScheme(), data.getHost(), data.getPath(), null);
                        AnonymousClass09H r15 = r6.A00;
                        String A022 = r15.A02();
                        boolean A0B2 = r15.A0B(229, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "fb:thrift_iq", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0)}, new AnonymousClass0M5("request", new AnonymousClass0OS[]{new AnonymousClass0OS("type", "verify_link", null, (byte) 0)}, new AnonymousClass0M5[]{new AnonymousClass0M5("url", (AnonymousClass0OS[]) null, uri.toString())}, null)), r6, 32000);
                        StringBuilder sb = new StringBuilder();
                        sb.append("sendVerifyLinkRequest url=");
                        sb.append(data);
                        sb.append(" success:");
                        sb.append(A0B2);
                        Log.i(sb.toString());
                        if (A0B2) {
                            Message obtain = Message.obtain(this.A00, 1);
                            obtain.arg1 = R.string.opening_deep_link;
                            this.A00.sendMessageDelayed(obtain, 500);
                            return;
                        }
                    } catch (URISyntaxException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("sendVerifyLinkRequest url=");
                        sb2.append(data);
                        sb2.append(" failed because the url is invalid");
                        Log.w(sb2.toString());
                    }
                    AFY(400);
                    return;
                case 2:
                    if (this.A04.A0D(AbstractC000400g.A0j)) {
                        AnonymousClass01I r0 = this.A03;
                        r0.A04();
                        if (r0.A00 == null && !"com.whatsapp.DEEP_LINK_REDIRECT".equals(intent.getAction()) && !"com.whatsapp.w4b.DEEP_LINK_REDIRECT".equals(intent.getAction())) {
                            Intent intent2 = new Intent();
                            intent2.addFlags(268435456);
                            intent2.setData(data);
                            if (C002001d.A0T(this, "com.whatsapp.w4b") != null) {
                                intent2.setAction("com.whatsapp.w4b.DEEP_LINK_REDIRECT");
                            }
                            if (!(intent2.getAction() == null || intent2.resolveActivity(getPackageManager()) == null)) {
                                startActivity(intent2);
                                finish();
                                return;
                            }
                        }
                    }
                    Intent intent3 = new Intent(this, ContactPicker.class);
                    intent3.putExtra("uri", data);
                    intent3.putExtra("source", intExtra);
                    Intent intent4 = new Intent(this, ContactPicker.class);
                    intent4.putExtra("uri", data);
                    startActivity(intent4);
                    break;
                case 4:
                    Class A8J = this.A0D.A03().A8J();
                    StringBuilder sb3 = new StringBuilder("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT ");
                    sb3.append(A8J);
                    Log.i(sb3.toString());
                    startActivity(new Intent(this, A8J));
                    break;
                case 5:
                    String queryParameter = data.getQueryParameter("phoneNumber");
                    String queryParameter2 = data.getQueryParameter("productID");
                    if ("wa.me".equals(data.getHost())) {
                        List<String> pathSegments = data.getPathSegments();
                        boolean z = false;
                        if (pathSegments.size() == 3) {
                            z = true;
                        }
                        AnonymousClass00E.A06(z);
                        queryParameter = pathSegments.get(2);
                        queryParameter2 = pathSegments.get(1);
                    }
                    if (queryParameter != null) {
                        try {
                            userJid = UserJid.getFromIdentifier(queryParameter);
                        } catch (AnonymousClass02Y unused2) {
                        }
                        Long.parseLong(queryParameter2);
                        str = queryParameter2;
                        pair = new Pair(str, userJid);
                        if (!TextUtils.isEmpty((CharSequence) pair.first) || pair.second == null) {
                            APq(R.string.invalid_product_link, 0, new Object[0]);
                            break;
                        } else {
                            C27831Rq r4 = this.A06;
                            r4.A01(6);
                            boolean A092 = this.A03.A09((Jid) pair.second);
                            UserJid userJid2 = (UserJid) pair.second;
                            String str2 = (String) pair.first;
                            Intent intent5 = new Intent(this, ProductDetailActivity.class);
                            AnonymousClass02M r10 = this.A02;
                            AnonymousClass1S3 r11 = this.A08;
                            AnonymousClass0HL r02 = this.A07;
                            C41191ud r12 = new C41191ud();
                            if (r02.A02(str2) != null) {
                                AnonymousClass2D8.A04(userJid2, str2, A092, null, null, this, intent5, 6);
                                r12.A00(Boolean.TRUE);
                            } else if (r11.A05(new C48092Kw(userJid2, str2, Integer.valueOf((int) getResources().getDimension(R.dimen.medium_thumbnail_size)), Integer.valueOf((int) getResources().getDimension(R.dimen.medium_thumbnail_size)), r4.A00))) {
                                r11.A08.add(new C42251wO(str2, r10, r11, userJid2, A092, this, intent5, r12));
                            } else {
                                r12.A00(Boolean.FALSE);
                            }
                            A0T(R.string.opening_product, R.string.product_not_exist, r12);
                            return;
                        }
                    }
                    userJid = null;
                    try {
                        Long.parseLong(queryParameter2);
                        str = queryParameter2;
                    } catch (NumberFormatException unused3) {
                    }
                    pair = new Pair(str, userJid);
                    if (!TextUtils.isEmpty((CharSequence) pair.first)) {
                    }
                    APq(R.string.invalid_product_link, 0, new Object[0]);
                case 6:
                    UserJid A012 = C06190Sd.A01(data);
                    if (A012 == null) {
                        APq(R.string.invalid_catalog_link, 0, new Object[0]);
                        break;
                    } else {
                        this.A06.A01(6);
                        C02780Dk r13 = this.A01;
                        AnonymousClass02M r112 = this.A02;
                        AnonymousClass1S3 r3 = this.A08;
                        C42391wd r122 = this.A09;
                        C41191ud r2 = new C41191ud();
                        r122.A01(new C42491wn(A012, r112, r122, r13, this, intExtra, r2));
                        r3.A03(A012, getResources().getDimensionPixelSize(R.dimen.product_catalog_list_thumb_size));
                        A0T(R.string.opening_catalog, R.string.catalog_not_exist, r2);
                        return;
                    }
            }
            finish();
        }
        String scheme = data.getScheme();
        if ("wa.me".equals(data.getHost())) {
            str = data.toString();
        } else if (!TextUtils.isEmpty(scheme) && ("whatsapp".equals(scheme) || "whatsapp-consumer".equals(scheme))) {
            StringBuilder A0S = AnonymousClass008.A0S("https://wa.me/message/");
            A0S.append(data.getLastPathSegment());
            str = A0S.toString();
        }
        if (TextUtils.isEmpty(str)) {
            APq(R.string.invalid_chat_link, 0, new Object[0]);
        } else {
            Intent intent6 = new Intent(this, QrSheetDeepLinkActivity.class);
            intent6.putExtra("qrcode", str);
            startActivity(intent6);
        }
        finish();
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A00.removeMessages(1);
    }
}
