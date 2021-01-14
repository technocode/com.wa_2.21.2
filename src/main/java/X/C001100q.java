package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.00q  reason: invalid class name and case insensitive filesystem */
public class C001100q {
    public static volatile C001100q A07;
    public C11470gL A00;
    public C11460gK A01;
    public boolean A02;
    public final C000300f A03;
    public final AnonymousClass1VU A04;
    public final AnonymousClass1VU A05;
    public final AnonymousClass022 A06;

    public C001100q(AnonymousClass009 r3, C000300f r4, AnonymousClass022 r5) {
        this.A03 = r4;
        this.A06 = r5;
        if (Build.VERSION.SDK_INT >= 23) {
            this.A04 = new C43861z4(r3, r4);
        }
        this.A05 = new AnonymousClass05D(r3, r4);
    }

    public static C001100q A00() {
        if (A07 == null) {
            synchronized (C001100q.class) {
                if (A07 == null) {
                    A07 = new C001100q(AnonymousClass009.A00(), C000300f.A00(), AnonymousClass022.A00());
                }
            }
        }
        return A07;
    }

    public static final void A01(SharedPreferences sharedPreferences) {
        if (!sharedPreferences.edit().remove("client_static_keypair_enc").commit()) {
            Log.w("AuthKeyStore/failed to clear key pair");
        }
    }

    public final int A02() {
        SharedPreferences A012 = this.A06.A01("keystore");
        int A062 = this.A03.A06(AbstractC000400g.A0B);
        int i = A012.getInt("client_static_keypair_enc_ver", -1);
        if (A062 != -1 ? i >= A062 : i == -1) {
            return i;
        }
        boolean commit = A012.edit().remove("client_static_keypair_enc").putInt("client_static_keypair_enc_ver", A062).commit();
        AnonymousClass1VU r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
        StringBuilder sb = new StringBuilder("AuthKeyStore/dropping encAuthKeys ");
        sb.append(commit);
        Log.w(sb.toString());
        return A062;
    }

    public final C11470gL A03() {
        SharedPreferences A012;
        String string;
        C11560gW A002;
        byte[] A052;
        AnonymousClass1VU r0;
        if (A02() <= 0 || (string = (A012 = this.A06.A01("keystore")).getString("client_static_keypair_enc", null)) == null || (A002 = C11560gW.A00(new JSONArray(string))) == null) {
            return null;
        }
        int i = A002.A00;
        if (i == 0) {
            if (Build.VERSION.SDK_INT < 23 || (r0 = this.A04) == null) {
                Log.e("AuthKeyStore/readClientStaticKeypairEnc/not supported sdk for type");
                A01(A012);
                return null;
            }
            A052 = r0.A05(A002);
            Log.i("AuthKeyStore/readClientStaticKeypairEnc 1");
        } else if (i == 1) {
            Log.e("AuthKeyStore/readClientStaticKeypairEnc/not supported sdk for type");
            A01(A012);
            return null;
        } else if (i == 2) {
            A052 = this.A05.A05(A002);
            Log.i("AuthKeyStore/readClientStaticKeypairEnc 3");
        } else {
            Log.e("AuthKeyStore/readClientStaticKeypairEnc not supported type");
            A01(A012);
            Log.e("AuthKeyStore/readClientStaticKeypairEnc/failed to read data");
            return null;
        }
        if (A052 != null) {
            return C11470gL.A01(A052);
        }
        Log.e("AuthKeyStore/readClientStaticKeypairEnc/failed to read data");
        return null;
    }

    public final C11470gL A04() {
        C11470gL r3 = null;
        if (A02() <= 0) {
            return null;
        }
        try {
            r3 = A03();
        } catch (JSONException unused) {
        }
        if (r3 == null) {
            try {
                return A03();
            } catch (JSONException e) {
                this.A05.A04("read invalid json", e);
            }
        }
        return r3;
    }

    public synchronized C11470gL A05() {
        C11470gL r3;
        boolean equals;
        r3 = this.A00;
        if (r3 == null) {
            AnonymousClass022 r5 = this.A06;
            SharedPreferences A012 = r5.A01("keystore");
            String string = A012.getString("client_static_keypair", "");
            C11470gL r10 = null;
            try {
                if (!TextUtils.isEmpty(string)) {
                    r10 = C11470gL.A01(Base64.decode(string, 3));
                }
            } catch (IllegalArgumentException e) {
                Log.w("failed to deserialize client static keypair", e);
            }
            r3 = A06(A012);
            if (r10 == null) {
                if (r3 == null) {
                    SharedPreferences A013 = r5.A01("keystore");
                    Log.i("generating new client static keypair");
                    r3 = C11470gL.A00();
                    byte[] A022 = r3.A02();
                    if (A09(A022, A013) || A09(A022, A013)) {
                        A08(A022);
                    } else {
                        throw new RuntimeException("unable to write client static keypair");
                    }
                }
            } else if (r3 == null) {
                byte[] A023 = r10.A02();
                if (A09(A023, A012) || A09(A023, A012)) {
                    r3 = A06(A012);
                    if (r3 == null) {
                        throw new RuntimeException("AuthKeyStore/failed to get client static key pair");
                    }
                } else {
                    throw new RuntimeException("unable to write client static keypair");
                }
            }
            AnonymousClass1VU r9 = this.A04;
            if (r9 != null && A02() > 0) {
                byte[] A024 = r3.A02();
                C11470gL A042 = A04();
                if (A042 == null) {
                    equals = A08(A024);
                } else {
                    equals = Arrays.equals(A024, A042.A02());
                }
                long j = A012.getLong("client_static_keypair_enc_success", 0);
                if (equals) {
                    long j2 = j + 1;
                    A012.edit().putLong("client_static_keypair_enc_success", j2).apply();
                    StringBuilder sb = new StringBuilder();
                    sb.append("AuthKeyStore/succeeded to read enc 1, accessed = ");
                    sb.append(j2);
                    Log.i(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AuthKeyStore/failed to match keys 1 previouslyAccessed = ");
                    sb2.append(j);
                    r9.A03(new AnonymousClass00A(sb2.toString()));
                }
            }
            Log.i("AuthKeyStore/using new key");
            if (r10 != null) {
                boolean commit = A012.edit().remove("client_static_keypair").commit();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("AuthKeyStore/successfully matched; deleted old = ");
                sb3.append(commit);
                Log.i(sb3.toString());
            }
            this.A00 = r3;
        }
        return r3;
    }

    public final C11470gL A06(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("client_static_keypair_pwd_enc", null);
        if (string == null) {
            return null;
        }
        try {
            C11560gW A002 = C11560gW.A00(new JSONArray(string));
            if (A002 == null) {
                return null;
            }
            if (A002.A00 != 2) {
                Log.e("AuthKeyStore/readClientStaticKeypairEnc 3 not expected type");
                return null;
            }
            byte[] A052 = this.A05.A05(A002);
            Log.i("AuthKeyStore/readClientStaticKeypairEnc 3");
            if (A052 != null) {
                return C11470gL.A01(A052);
            }
            Log.e("AuthKeyStore/readClientStaticKeypairEnc/failed to read data");
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean A07(C11560gW r5, String str) {
        SharedPreferences A012 = this.A06.A01("keystore");
        if (r5 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(r5.A00);
            jSONArray.put(Base64.encodeToString(r5.A02, 3));
            byte[] bArr = r5.A03;
            if (bArr != null) {
                jSONArray.put(Base64.encodeToString(bArr, 3));
            }
            byte[] bArr2 = r5.A04;
            if (bArr2 != null) {
                jSONArray.put(Base64.encodeToString(bArr2, 3));
            }
            String str2 = r5.A01;
            if (str2 != null) {
                jSONArray.put(str2);
            }
            String obj = jSONArray.toString();
            if (obj != null) {
                boolean commit = A012.edit().putString(str, obj).commit();
                if (!commit) {
                    Log.e("AuthKeyStore/failed to store clientStaticKeypair");
                }
                return commit;
            }
        }
        Log.e("AuthKeyStore/failed to store clientStaticKeypair/cant generate json");
        return false;
    }

    public final boolean A08(byte[] bArr) {
        if (A02() <= 0) {
            return false;
        }
        SharedPreferences A012 = this.A06.A01("keystore");
        if (!TextUtils.isEmpty(A012.getString("client_static_keypair_enc", null))) {
            return false;
        }
        AnonymousClass1VU r1 = this.A04;
        if (r1 != null && (A0A(bArr, A012, r1) || A0A(bArr, A012, r1))) {
            return true;
        }
        Log.w("AuthKeyStore/ensureEncKeyStored/failed to use enc csk");
        return false;
    }

    public final boolean A09(byte[] bArr, SharedPreferences sharedPreferences) {
        C11470gL A062;
        AnonymousClass1VU r2 = this.A05;
        if (!A07(r2.A00(bArr), "client_static_keypair_pwd_enc") || (A062 = A06(sharedPreferences)) == null || !Arrays.equals(bArr, A062.A02())) {
            r2.A04("failed to store and read correct key", new RuntimeException());
            return false;
        }
        Log.i("AuthKeyStore/storedAndCanRead/3");
        return true;
    }

    public final boolean A0A(byte[] bArr, SharedPreferences sharedPreferences, AnonymousClass1VU r6) {
        C11470gL A042;
        if (!A07(r6.A00(bArr), "client_static_keypair_enc") || (A042 = A04()) == null || !Arrays.equals(bArr, A042.A02())) {
            r6.A04("failed to store and read correct key", new RuntimeException());
            A01(sharedPreferences);
            return false;
        }
        AnonymousClass008.A18("AuthKeyStore/storedAndCanRead/", "1");
        return true;
    }
}
