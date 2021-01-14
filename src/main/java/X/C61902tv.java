package X;

import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2tv  reason: invalid class name and case insensitive filesystem */
public class C61902tv {
    public static volatile C61902tv A03;
    public final C04050Iv A00;
    public final C02010Ah A01;
    public final C018809u A02 = C018809u.A00("PaymentFingerprintKeyStore", "payment-settings", "COMMON");

    public C61902tv(AnonymousClass00G r4, C02010Ah r5) {
        this.A01 = r5;
        this.A00 = new C04050Iv(r4.A00);
    }

    public static C61902tv A00() {
        if (A03 == null) {
            synchronized (C61902tv.class) {
                if (A03 == null) {
                    A03 = new C61902tv(AnonymousClass00G.A01, C02010Ah.A00());
                }
            }
        }
        return A03;
    }

    public synchronized int A01() {
        int i;
        JSONObject optJSONObject;
        try {
            String A032 = this.A01.A03();
            if (!TextUtils.isEmpty(A032) && (optJSONObject = new JSONObject(A032).optJSONObject("bio")) != null) {
                i = optJSONObject.optInt("bioState", 0);
                if (i == 1) {
                    if (C008805h.A0D() == null) {
                        A03();
                        return 0;
                    }
                }
                return i;
            }
        } catch (JSONException e) {
            this.A02.A08("getState threw: ", e);
        }
        i = 0;
        return i;
    }

    public final synchronized String A02(int i) {
        String str;
        JSONObject jSONObject;
        str = null;
        try {
            C02010Ah r5 = this.A01;
            String A032 = r5.A03();
            if (TextUtils.isEmpty(A032)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A032);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("bio");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", "1");
            if (i == 0) {
                optJSONObject.remove("bioId");
                optJSONObject.remove("bioPublicKey");
            } else if (i == 2) {
                str = UUID.randomUUID().toString().replace("-", "");
                optJSONObject.put("bioId", str);
            }
            optJSONObject.put("bioState", i);
            jSONObject.put("bio", optJSONObject);
            AnonymousClass008.A0q(r5, "payments_setup_country_specific_info", jSONObject.toString());
        } catch (JSONException e) {
            this.A02.A08("PaymentFingerprintKeyStore setState threw: ", e);
        }
        return str;
    }

    public void A03() {
        Log.i("FingerprintHelper-helper/remove-key");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            instance.deleteEntry("payment_bio_key_alias");
            A02(0);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            StringBuilder A0S = AnonymousClass008.A0S("FingerprintHelper/removeKey: api=");
            A0S.append(Build.VERSION.SDK_INT);
            A0S.append(" error: ");
            A0S.append(e.toString());
            Log.i(A0S.toString());
        }
    }

    public void A04(String str) {
        String str2;
        JSONObject optJSONObject;
        if (str != null) {
            synchronized (this) {
                str2 = null;
                try {
                    String A032 = this.A01.A03();
                    if (!TextUtils.isEmpty(A032) && (optJSONObject = new JSONObject(A032).optJSONObject("bio")) != null) {
                        str2 = optJSONObject.optString("bioId", null);
                    }
                } catch (JSONException e) {
                    this.A02.A08("getId threw: ", e);
                }
            }
            if (str.equals(str2)) {
                A02(1);
                return;
            }
        }
        A03();
        return;
    }

    public boolean A05() {
        C04050Iv r1 = this.A00;
        return r1.A05() && r1.A04();
    }

    public boolean A06(byte[] bArr, C04080Iy r5, AbstractC27431Py r6) {
        C04070Ix A0D = C008805h.A0D();
        if (A0D != null) {
            this.A00.A03(A0D, r5, new C68853Eu(this, r6, bArr));
            return true;
        }
        this.A02.A07(null, "sign: cryptoObject is null", null);
        A03();
        return false;
    }
}
