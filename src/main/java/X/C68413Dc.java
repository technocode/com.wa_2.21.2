package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Dc  reason: invalid class name and case insensitive filesystem */
public class C68413Dc implements AnonymousClass2LO {
    public final AnonymousClass00G A00;
    public final C68393Da A01;
    public final C01980Ae A02;
    public final C01970Ad A03;

    @Override // X.AnonymousClass2LO
    public byte[] AGg(AnonymousClass1VM r2) {
        return null;
    }

    public C68413Dc(AnonymousClass00G r1, C01970Ad r2, C01980Ae r3, C68393Da r4) {
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass2LO
    public void A1v(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC43781yw r1 = ((AnonymousClass1VM) it.next()).A06;
            if ((r1 instanceof C74463ay) && ((C74463ay) r1).A0G) {
                C01980Ae r12 = this.A02;
                synchronized (r12) {
                    r12.A05(r12.A01("2fa"));
                }
            }
        }
    }

    @Override // X.AnonymousClass2LO
    public AnonymousClass1VM A2B(AnonymousClass1VM r9) {
        String str;
        JSONObject jSONObject;
        AbstractC43781yw r1;
        C74463ay r4 = (C74463ay) r9.A06;
        StringBuilder A0S = AnonymousClass008.A0S("PAY: beforeMethodAdded got methodData: ");
        if (r4 != null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("vpa: ");
            A0S2.append(C28051Sr.A17(r4.A0D));
            A0S2.append(" image: ");
            A0S2.append(((AnonymousClass27v) r4).A01);
            A0S2.append(" supportPhoneNumber: ");
            A0S2.append(r4.A0B);
            str = A0S2.toString();
        } else {
            str = "null";
        }
        AnonymousClass008.A1U(A0S, str);
        if (r4 != null) {
            if (!TextUtils.isEmpty(((AnonymousClass27v) r4).A01)) {
                String str2 = ((AnonymousClass27v) r4).A01;
                File file = new File(this.A00.A00.getCacheDir(), "BankLogos");
                if (!file.mkdirs() && !file.isDirectory()) {
                    Log.w("PAY: IndiaUpiStorageObserver/imageUrlToByteArray unable to create bank logos cache directory");
                }
                AnonymousClass1RK r2 = new AnonymousClass1RK(file, 1048576);
                String A012 = C007603r.A01(str2);
                if (A012 != null) {
                    int i = ((int) C002301g.A0K.A00) * 40;
                    Bitmap A002 = r2.A00(A012, i, i);
                    r2.A03(false);
                    if (A002 != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        A002.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (byteArray != null) {
                            r9.A0B = byteArray;
                        }
                    }
                    r9.A0B = C28051Sr.A26(((AnonymousClass27v) r4).A01);
                } else {
                    throw null;
                }
            }
            C01970Ad r0 = this.A03;
            r0.A04();
            AnonymousClass1VM A08 = r0.A06.A08(r9.A07);
            if (!(A08 == null || (r1 = A08.A06) == null)) {
                C74463ay r12 = (C74463ay) r1;
                if (TextUtils.isEmpty(r4.A0D)) {
                    r4.A0D = r12.A0D;
                }
                if (TextUtils.isEmpty(r4.A0E)) {
                    r4.A0E = r12.A0E;
                }
                if (TextUtils.isEmpty(r4.A06)) {
                    r4.A06 = r12.A04();
                }
            }
            if (TextUtils.isEmpty(r4.A0D)) {
                String A05 = this.A01.A05();
                if (!TextUtils.isEmpty(A05)) {
                    r4.A0D = A05;
                }
            }
            if (TextUtils.isEmpty(r4.A0E)) {
                String A082 = this.A01.A08();
                if (!TextUtils.isEmpty(A082)) {
                    r4.A0E = A082;
                }
            }
            C68393Da r3 = this.A01;
            String str3 = r4.A0D;
            String str4 = r4.A0E;
            String str5 = r4.A07;
            String str6 = r4.A0C;
            synchronized (r3) {
                try {
                    C02010Ah r42 = r3.A02;
                    String A032 = r42.A03();
                    if (TextUtils.isEmpty(A032)) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(A032);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        r3.A0H(jSONObject, str3, str4);
                        StringBuilder sb = new StringBuilder();
                        sb.append("PAY: IndiaUpiPaymentSharedPrefs updated handle: ");
                        sb.append(C28051Sr.A17(str3));
                        Log.i(sb.toString());
                    }
                    if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                        r3.A0G(jSONObject, str5, str6);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("PAY: IndiaUpiPaymentSharedPrefs updated psp: ");
                        sb2.append(str5);
                        sb2.append(" transactionPrefix: ");
                        sb2.append(str6);
                        Log.i(sb2.toString());
                    }
                    AnonymousClass008.A0q(r42, "payments_setup_country_specific_info", jSONObject.toString());
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs updateHandleDeviceBinding threw: ", e);
                }
            }
        }
        return r9;
    }
}
