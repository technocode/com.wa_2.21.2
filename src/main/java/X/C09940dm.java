package X;

import android.content.Intent;
import android.os.SystemClock;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.0dm  reason: invalid class name and case insensitive filesystem */
public class C09940dm extends AnonymousClass0JW {
    public long A00;
    public final long A01;
    public final C000300f A02;
    public final AnonymousClass00D A03;
    public final AnonymousClass2OL A04;
    public final AnonymousClass0KP A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final WeakReference A09;
    public final JSONObject A0A;
    public final boolean A0B;
    public final byte[] A0C;

    public C09940dm(C000300f r2, AnonymousClass2OL r3, AnonymousClass00D r4, AnonymousClass0KP r5, String str, String str2, byte[] bArr, String str3, JSONObject jSONObject, boolean z, long j, AnonymousClass0HU r14) {
        this.A06 = str;
        this.A08 = str2;
        this.A0C = bArr;
        this.A07 = str3;
        this.A0A = jSONObject;
        this.A0B = z;
        this.A01 = j;
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A09 = new WeakReference(r14);
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        AnonymousClass0HU r1 = (AnonymousClass0HU) this.A09.get();
        if (r1 == null) {
            return;
        }
        if (!(r1 instanceof ChangeNumber)) {
            C002001d.A2O(r1, 9);
            return;
        }
        C002001d.A2N(r1, 1);
        C002001d.A2O(r1, 9);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str;
        String charSequence;
        String charSequence2;
        String charSequence3;
        AnonymousClass0HM r2;
        AnonymousClass02R r1 = (AnonymousClass02R) obj;
        AnonymousClass0HU r3 = (AnonymousClass0HU) this.A09.get();
        if (r3 != null) {
            C002001d.A2N(r3, 9);
            r3.A00 = null;
            Object obj2 = r1.A00;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                C48842Nz r7 = (C48842Nz) r1.A01;
                String str2 = this.A06;
                String str3 = this.A08;
                long j = this.A00;
                if (r7 != null) {
                    int i = r7.A01;
                    if (i != 0) {
                        AnonymousClass008.A0k(((ActivityC004702f) r3).A0J, "registration_voice_code_length", i);
                    }
                    int i2 = r7.A00;
                    if (i2 != 0) {
                        AnonymousClass008.A0k(((ActivityC004702f) r3).A0J, "registration_sms_code_length", i2);
                    }
                }
                if (!(intValue == 4 || intValue == 3)) {
                    r3.A03 = null;
                }
                if (intValue == 1) {
                    Log.i("enterphone/reinstalled");
                    r3.AFo();
                    if (r7 != null) {
                        AnonymousClass0HM r0 = r3.A0H;
                        String str4 = r7.A0E;
                        r0.A0E(str2, str3, str4);
                        AnonymousClass008.A0n(((ActivityC004702f) r3).A0J, "new_jid", r7.A0F);
                        if (r3 instanceof RegisterPhone) {
                            RegisterPhone registerPhone = (RegisterPhone) r3;
                            ((AnonymousClass0HU) registerPhone).A0H.A0E(str2, str3, str4);
                            ((AnonymousClass0HU) registerPhone).A0F.A01(false);
                            AnonymousClass0HU.A0L = 7;
                            registerPhone.A0T();
                            if (((AnonymousClass0HU) registerPhone).A02.A02) {
                                r2 = registerPhone.A0a;
                                AnonymousClass0JE.A0F(registerPhone, r2, registerPhone.A0R, false);
                            } else {
                                r2 = registerPhone.A0a;
                                r2.A0C(2);
                                registerPhone.startActivity(new Intent(registerPhone, RegisterName.class));
                            }
                            r2.A05().A00();
                            registerPhone.finish();
                        } else if (!(r3 instanceof ChangeNumber)) {
                            r3.A0H.A0E(str2, str3, str4);
                            r3.A0F.A01(false);
                        } else {
                            ChangeNumber changeNumber = (ChangeNumber) r3;
                            ((AnonymousClass0HU) changeNumber).A0H.A0E(str2, str3, str4);
                            ((AnonymousClass0HU) changeNumber).A0F.A01(false);
                            if (((AnonymousClass0HU) changeNumber).A02.A02) {
                                AnonymousClass0JE.A0F(changeNumber, changeNumber.A0M, changeNumber.A0D, false);
                            }
                            changeNumber.A0M.A0F();
                            changeNumber.finish();
                        }
                    } else {
                        throw null;
                    }
                } else if (intValue == 2) {
                    Log.i("enterphone/new-installation");
                    AnonymousClass0JE.A0H(((ActivityC004702f) r3).A0J, AnonymousClass0JE.A00);
                    AnonymousClass0HU.A0L = 15;
                    r3.A0T();
                    r3.AFo();
                    if (r7 != null) {
                        r3.AHy(r7.A06, r7.A07, r7.A0B);
                        return;
                    }
                    throw null;
                } else if (intValue == 5) {
                    Log.e("enterphone/blocked");
                    StringBuilder sb = new StringBuilder();
                    sb.append("+");
                    sb.append(str2);
                    sb.append(str3);
                    r3.A03 = sb.toString();
                    AnonymousClass0HU.A0N = str2;
                    AnonymousClass0HU.A0O = str3;
                    StringBuilder A0S = AnonymousClass008.A0S("+");
                    A0S.append(str2);
                    A0S.append(str3);
                    r3.A03 = A0S.toString();
                    if (!r3.A02.A02) {
                        boolean z = ((ActivityC004702f) r3).A0J.A00.getBoolean("underage_account_banned", false);
                        AnonymousClass008.A1G("wa-shared-prefs/getUnderageAccountBanned ", z);
                        int i3 = 124;
                        if (z) {
                            i3 = 125;
                        }
                        C002001d.A2O(r3, i3);
                    }
                } else if (intValue == 4) {
                    Log.i("enterphone/error-unspecified");
                    if (!r3.A02.A02) {
                        C002001d.A2O(r3, 109);
                    }
                } else if (intValue == 3) {
                    Log.i("enterphone/error-connectivity");
                    AnonymousClass30C r5 = r3.A02;
                    AnonymousClass01X r4 = ((AnonymousClass2C0) r3).A01;
                    r5.A03(r4.A0D(R.string.register_check_connectivity, r4.A06(R.string.connectivity_self_help_instructions)));
                } else if (intValue == 6) {
                    Log.i("enterphone/phone-number-too-long");
                    AnonymousClass30A r52 = r3.A01;
                    TextView textView = r52.A04;
                    if (textView == null) {
                        charSequence3 = r3.A0J.A03(((AnonymousClass2C0) r3).A01, r52.A06);
                    } else {
                        charSequence3 = textView.getText().toString();
                    }
                    r3.A02.A03(((AnonymousClass2C0) r3).A01.A0D(R.string.register_bad_phone_too_long, charSequence3));
                } else if (intValue == 7) {
                    Log.i("enterphone/phone-number-too-short");
                    AnonymousClass30A r53 = r3.A01;
                    TextView textView2 = r53.A04;
                    if (textView2 == null) {
                        charSequence2 = r3.A0J.A03(((AnonymousClass2C0) r3).A01, r53.A06);
                    } else {
                        charSequence2 = textView2.getText().toString();
                    }
                    r3.A02.A03(((AnonymousClass2C0) r3).A01.A0D(R.string.register_bad_phone_too_short, charSequence2));
                } else if (intValue == 8) {
                    Log.i("enterphone/phone-number-bad-format");
                    AnonymousClass30A r54 = r3.A01;
                    TextView textView3 = r54.A04;
                    if (textView3 == null) {
                        charSequence = r3.A0J.A03(((AnonymousClass2C0) r3).A01, r54.A06);
                    } else {
                        charSequence = textView3.getText().toString();
                    }
                    AnonymousClass01X r55 = ((AnonymousClass2C0) r3).A01;
                    StringBuilder A0S2 = AnonymousClass008.A0S("+");
                    A0S2.append((Object) r3.A01.A02.getText());
                    A0S2.append(AnonymousClass020.A01);
                    A0S2.append((Object) r3.A01.A03.getText());
                    String A0F = r55.A0F(A0S2.toString());
                    r3.A02.A03(r55.A0D(R.string.register_bad_format_with_number, A0F, charSequence));
                } else if (intValue == 9) {
                    Log.i("enterphone/temporarily-unavailable");
                    if (r7 != null) {
                        String str5 = r7.A05;
                        if (str5 == null) {
                            r3.A02.A03(((AnonymousClass2C0) r3).A01.A06(R.string.register_temporarily_unavailable));
                            return;
                        }
                        try {
                            long parseLong = Long.parseLong(str5) * 1000;
                            AnonymousClass0HU.A0M = SystemClock.elapsedRealtime() + parseLong;
                            r3.A0H.A0D(parseLong);
                            AnonymousClass30C r8 = r3.A02;
                            AnonymousClass01X r72 = ((AnonymousClass2C0) r3).A01;
                            r8.A03(r72.A0D(R.string.register_temporarily_unavailable_with_time, C002001d.A1a(r72, parseLong)));
                        } catch (NumberFormatException unused) {
                            r3.A02.A02(R.string.register_temporarily_unavailable);
                        }
                    } else {
                        throw null;
                    }
                } else if (intValue == 12) {
                    Log.i("enterphone/old-version");
                    r3.A07.A01 = true;
                    r3.A02.A01(114);
                } else {
                    if (intValue == 14) {
                        str = "enterphone/bad-token";
                    } else if (intValue == 15) {
                        str = "enterphone/invalid-skey";
                    } else if (intValue == 11) {
                        Log.w("enterphone/too-recent");
                        if (j != 0) {
                            long j2 = j * 1000;
                            try {
                                AnonymousClass0HU.A0M = SystemClock.elapsedRealtime() + j2;
                                r3.A0H.A0D(j2);
                                AnonymousClass30C r82 = r3.A02;
                                AnonymousClass01X r73 = ((AnonymousClass2C0) r3).A01;
                                r82.A03(r73.A0D(R.string.register_try_is_too_recent, C002001d.A1a(r73, j2)));
                                return;
                            } catch (NumberFormatException e) {
                                Log.w("enterphone/too-recent/time-not-int", e);
                                r3.A02.A02(R.string.register_try_is_too_recent_unspecified);
                                return;
                            }
                        } else {
                            Log.w("enterphone/too-recent/time-not-int");
                            r3.A02.A02(R.string.register_try_is_too_recent_unspecified);
                            return;
                        }
                    } else if (intValue == 16) {
                        r3.AFo();
                        r3.A0H.A0C(7);
                        if (r7 != null) {
                            AnonymousClass00D r83 = ((ActivityC004702f) r3).A0J;
                            r83.A0a(r7.A09, r7.A08, r7.A04, -1, -1, r3.A0B.A05());
                            AnonymousClass0HU.A0N = str2;
                            AnonymousClass0HU.A0O = str3;
                            r83.A0Z(str2, str3);
                            Intent intent = new Intent(r3, VerifyTwoFactorAuth.class);
                            boolean z2 = false;
                            if (r3.A06.A01.A01() != null) {
                                z2 = true;
                            }
                            intent.putExtra("changenumber", z2);
                            r3.A0I(intent, false);
                            r3.finish();
                            return;
                        }
                        throw null;
                    } else {
                        return;
                    }
                    Log.i(str);
                    r3.A02.A03(((AnonymousClass2C0) r3).A01.A06(R.string.register_should_upgrade_market));
                }
            } else {
                throw null;
            }
        }
    }
}
