package X;

import android.util.Base64;
import com.whatsapp.fieldstats.privatestats.PrivateStatsWorker;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.0KU  reason: invalid class name */
public class AnonymousClass0KU {
    public static volatile AnonymousClass0KU A0G;
    public NativeVOPRFExtension A00;
    public final C000300f A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass0KX A03;
    public final AnonymousClass0KV A04;
    public final AnonymousClass0KW A05;
    public final AnonymousClass0EU A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass0GU A08;
    public volatile int A09 = 0;
    public volatile long A0A;
    public volatile long A0B;
    public volatile String A0C;
    public volatile boolean A0D = false;
    public volatile boolean A0E = false;
    public volatile byte[] A0F;

    public AnonymousClass0KU(AnonymousClass00S r2, AnonymousClass00T r3, C000300f r4, AnonymousClass0GU r5, AnonymousClass0KV r6, AnonymousClass0KW r7, AnonymousClass0KX r8, AnonymousClass0EU r9) {
        this.A02 = r2;
        this.A07 = r3;
        this.A08 = r5;
        this.A01 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r8;
        this.A06 = r9;
        r7.A00 = this;
    }

    public static AnonymousClass0KU A00() {
        if (A0G == null) {
            synchronized (AnonymousClass0KU.class) {
                if (A0G == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass00T A003 = C002101e.A00();
                    C000300f A004 = C000300f.A00();
                    AnonymousClass0GU A005 = AnonymousClass0GU.A00();
                    if (AnonymousClass0KV.A02 == null) {
                        synchronized (AnonymousClass0KV.class) {
                            if (AnonymousClass0KV.A02 == null) {
                                AnonymousClass0KV.A02 = new AnonymousClass0KV(AnonymousClass022.A00());
                            }
                        }
                    }
                    AnonymousClass0KV r9 = AnonymousClass0KV.A02;
                    if (AnonymousClass0KW.A02 == null) {
                        synchronized (AnonymousClass0KW.class) {
                            if (AnonymousClass0KW.A02 == null) {
                                AnonymousClass0KW.A02 = new AnonymousClass0KW(AnonymousClass09H.A01());
                            }
                        }
                    }
                    A0G = new AnonymousClass0KU(A002, A003, A004, A005, r9, AnonymousClass0KW.A02, AnonymousClass0KX.A00(), AnonymousClass0EU.A03);
                }
            }
        }
        return A0G;
    }

    public int A01() {
        AnonymousClass0KV r4 = this.A04;
        int i = r4.A00().getInt("first_token_stage", 0);
        if (i == 1) {
            synchronized (this) {
                if (this.A0D) {
                    return 15;
                }
                return 2;
            }
        } else if (i == 0) {
            return 2;
        } else {
            return r4.A00().getInt("token_not_ready_reason", 0);
        }
    }

    public final synchronized void A02() {
        Log.d("PrivateStatsToken/resetTokens");
        this.A0C = null;
        this.A0F = null;
        this.A09 = 0;
        this.A0E = false;
        this.A0D = false;
        AnonymousClass0KV r3 = this.A04;
        r3.A05("original_token", null);
        r3.A05("next_original_token", null);
        r3.A04("base_timestamp", 0);
        r3.A04("time_to_live", 0);
        r3.A05("blinding_factor", null);
        r3.A02(-1);
        r3.A05("shared_secret", null);
        if (r3.A00().getInt("first_token_stage", 0) == 1) {
            r3.A01(0);
        }
    }

    public final void A03(int i) {
        if (this.A09 < 2) {
            this.A09++;
            this.A07.ANO(new RunnableEBaseShape3S0100000_I0_3(this, 4), ((long) this.A09) * 30000 * ((long) this.A09));
            return;
        }
        if (i == 5) {
            this.A04.A03(9);
        } else {
            this.A04.A03(10);
        }
        A06(false, i);
    }

    public final synchronized void A04(int i) {
        if (!this.A0D) {
            this.A0D = true;
            StringBuilder sb = new StringBuilder();
            sb.append("PrivateStatsToken/doCreateFirstToken!!--->about to create 1st token: ");
            sb.append(i);
            Log.i(sb.toString());
            A05(false);
        }
    }

    public void A05(boolean z) {
        NativeVOPRFExtension nativeVOPRFExtension = this.A00;
        if (nativeVOPRFExtension == null) {
            nativeVOPRFExtension = new NativeVOPRFExtension();
            this.A00 = nativeVOPRFExtension;
        }
        if (nativeVOPRFExtension != null) {
            byte[] bArr = new byte[32];
            C05850Qn.A00(bArr);
            byte[] bArr2 = null;
            int i = 0;
            while (i < 256) {
                bArr2 = new byte[32];
                C05850Qn.A00(bArr2);
                bArr2[31] = (byte) (bArr2[31] & 31);
                if (nativeVOPRFExtension.A00(bArr2)) {
                    break;
                }
                i++;
            }
            if (i >= 256) {
                Log.w("PrivateStatsToken/generateCredentialToken cannot generate valid blindingFactor");
                this.A04.A03(5);
                A06(true, 4);
                return;
            }
            AnonymousClass00S r4 = this.A02;
            long A032 = r4.A03();
            byte[] A022 = nativeVOPRFExtension.A02(bArr, bArr2);
            long A033 = r4.A03();
            if (A022 == null) {
                Log.e("PrivateStatsToken/generateCredentialToken failed to blind the token");
                this.A04.A03(7);
                A06(true, 4);
                return;
            }
            AnonymousClass0KX r6 = this.A03;
            C05860Qo r1 = new C05860Qo();
            r1.A00 = 1;
            r1.A01 = Long.valueOf(A033 - A032);
            r6.A01.A0B(r1, null, false);
            synchronized (this) {
                this.A0E = z;
                this.A0F = A022;
                if (z) {
                    AnonymousClass0KV r2 = this.A04;
                    r2.A05("next_original_token", Base64.encodeToString(bArr, 10));
                    r2.A05("blinding_factor", Base64.encodeToString(bArr2, 10));
                } else {
                    AnonymousClass0KV r62 = this.A04;
                    r62.A05("original_token", Base64.encodeToString(bArr, 10));
                    r62.A05("blinding_factor", Base64.encodeToString(bArr2, 10));
                    r62.A05("shared_secret", null);
                    r62.A02(-1);
                    r62.A04("base_timestamp", 0);
                    r62.A04("time_to_live", 0);
                }
                this.A09 = 0;
                this.A0A = r4.A03();
                this.A0B = this.A0A;
                if (this.A06.A03()) {
                    this.A0C = this.A05.A00(this.A0F);
                } else {
                    A03(5);
                }
            }
            return;
        }
        throw null;
    }

    public final synchronized void A06(boolean z, int i) {
        Log.d("PrivateStatsToken/abortGeneratingTokens");
        long A032 = this.A02.A03();
        this.A03.A02(i, A032 - this.A0A, A032 - this.A0B, (long) this.A09);
        this.A0D = false;
        AnonymousClass0KV r2 = this.A04;
        r2.A05("blinding_factor", null);
        if (this.A0E) {
            r2.A05("next_original_token", null);
        } else {
            r2.A05("original_token", null);
        }
        this.A0E = false;
        this.A0F = null;
        if (!z) {
            this.A0C = null;
            this.A09 = 0;
        }
        if (r2.A00().getInt("first_token_stage", 0) == 1) {
            r2.A01(0);
        }
    }

    public final boolean A07() {
        AnonymousClass0KV r3 = this.A04;
        int i = r3.A00().getInt("first_token_stage", 0);
        if (i == 2) {
            return false;
        }
        int A062 = this.A01.A06(AbstractC000400g.A0C);
        if (A062 <= 30) {
            Log.d("PrivateStatsToken/delayForFirstTokenIfNeeded randomizing 1st token request is disabled");
            r3.A01(2);
            return false;
        }
        long j = r3.A00().getLong("first_token_delay_time", 0);
        if (i == 1) {
            if (!this.A0D) {
                AnonymousClass00S r5 = this.A02;
                if (r5.A05() / 1000 > r3.A00().getLong("first_token_request_timestamp", 0) + j + 300) {
                    ((AbstractC17680ry) this.A08.get()).A01("name.com.whatsapp.privatestats.firsttoken");
                    Log.i("PrivateStatsToken/delayForFirstTokenIfNeeded cancelled the work");
                    A04(2);
                } else {
                    r5.A05();
                    return true;
                }
            }
            return true;
        } else if (i != 0) {
            return false;
        } else {
            long nextInt = ((long) new Random().nextInt(A062 - 30)) + 30;
            AnonymousClass008.A10("PrivateStatsToken/delayForFirstToken-->delay timesec= ", nextInt);
            r3.A04("first_token_delay_time", nextInt);
            r3.A04("first_token_request_timestamp", this.A02.A05() / 1000);
            r3.A01(1);
            C31001cM r32 = new C31001cM(PrivateStatsWorker.class);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            r32.A00.A03 = timeUnit.toMillis(nextInt);
            ((AbstractC17680ry) this.A08.get()).A02("name.com.whatsapp.privatestats.firsttoken", EnumC17570rl.REPLACE, Collections.singletonList(r32.A00()));
            return true;
        }
    }
}
