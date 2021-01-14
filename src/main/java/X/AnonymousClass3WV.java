package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Random;

/* renamed from: X.3WV  reason: invalid class name */
public class AnonymousClass3WV implements AbstractC64732yf {
    public String A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass0K0 A03;
    public final C02360Br A04;
    public final AnonymousClass3MA A05;
    public final C02400Bv A06;
    public final AnonymousClass0KL A07 = new AnonymousClass3WU(this);
    public final AnonymousClass0C4 A08;

    @Override // X.AbstractC64732yf
    public AnonymousClass2F8 A63() {
        return null;
    }

    public AnonymousClass3WV(AnonymousClass02M r2, AnonymousClass00G r3, C02400Bv r4, AnonymousClass0C4 r5, C02360Br r6, AnonymousClass0K0 r7, AnonymousClass3MA r8) {
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r4;
        this.A08 = r5;
        this.A04 = r6;
        this.A03 = r7;
        this.A05 = r8;
    }

    @Override // X.AbstractC64732yf
    public void AAA(String str) {
        AnonymousClass0C4 r6 = this.A08;
        if (r6 != null) {
            String[] split = str.split(",");
            if (split.length < 3) {
                Log.e("qrsession/processQR/error/invalid_code parts");
            } else {
                byte[] bArr = new byte[64];
                r6.A0Q.nextBytes(bArr);
                C67823Aq r3 = new C67823Aq(split[0], split[1], split[2], bArr);
                if (this.A06.A03()) {
                    this.A04.A0I(false);
                }
                String str2 = r3.A01;
                byte[] bArr2 = r3.A04;
                if (r6 != null) {
                    AnonymousClass1UC A072 = C001801b.A07();
                    try {
                        byte[] A3o = C002001d.A3o(C001801b.A1u(C001801b.A08(AnonymousClass3WM.A00(new byte[]{5}, Base64.decode(str2, 0))), A072.A00), null, 80);
                        byte[] bArr3 = new byte[32];
                        System.arraycopy(A3o, 0, bArr3, 0, 32);
                        byte[] bArr4 = new byte[32];
                        System.arraycopy(A3o, 32, bArr4, 0, 32);
                        byte[] bArr5 = new byte[16];
                        System.arraycopy(A3o, 64, bArr5, 0, 16);
                        byte[] A022 = AnonymousClass3WM.A02(bArr3, bArr5, bArr2);
                        byte[] bArr6 = A072.A01.A01;
                        if (A022 == null) {
                            Log.e("qrsession/encryptSecret fail null enc: true");
                        } else {
                            byte[] A012 = AnonymousClass3WM.A01(bArr4, AnonymousClass3WM.A00(bArr6, A022));
                            if (A012 == null) {
                                Log.e("qrsession/encryptSecret fail null hmac: true");
                            } else {
                                String encodeToString = Base64.encodeToString(AnonymousClass3WM.A00(bArr6, AnonymousClass3WM.A00(A012, A022)), 2);
                                if (encodeToString != null) {
                                    AnonymousClass0K0 r12 = this.A03;
                                    String str3 = r3.A02;
                                    String str4 = r3.A03;
                                    String str5 = r3.A00;
                                    r12.A04(str3, str4, str5, encodeToString, 0);
                                    Context applicationContext = this.A02.A00.getApplicationContext();
                                    String str6 = str5;
                                    AnonymousClass008.A16("WebSession/addBrowserIdToWebSessionVerificationAlarm/ browserId: ", str5);
                                    AnonymousClass00D r9 = r6.A0H;
                                    if (str5 != null) {
                                        SharedPreferences sharedPreferences = r9.A00;
                                        String string = sharedPreferences.getString("web_session_verification_browser_ids", null);
                                        if (string != null) {
                                            str6 = AnonymousClass008.A0L(string, ",", str5);
                                        }
                                        AnonymousClass008.A0m(r9, "web_session_verification_browser_ids", str6);
                                        if (sharedPreferences.getLong("web_session_verification_when_millis", -1) < 0) {
                                            long currentTimeMillis = System.currentTimeMillis() + ((long) (new Random().nextDouble() * 1.08E7d)) + 3600000;
                                            if (r9 == null) {
                                                throw null;
                                            } else if (currentTimeMillis >= 0) {
                                                AnonymousClass008.A0l(r9, "web_session_verification_when_millis", currentTimeMillis);
                                                r6.A0D(applicationContext, currentTimeMillis);
                                            } else {
                                                throw new IllegalArgumentException("When millis cannot be less than 0");
                                            }
                                        }
                                        this.A00 = str5;
                                        this.A05.A00();
                                        return;
                                    }
                                    throw null;
                                }
                            }
                        }
                    } catch (AnonymousClass1UK e) {
                        Log.e("qrsession/encryptSecret/curve error ", e);
                    }
                } else {
                    throw null;
                }
            }
            this.A05.A01();
            return;
        }
        throw null;
    }
}
