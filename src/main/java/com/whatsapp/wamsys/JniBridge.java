package com.whatsapp.wamsys;

import X.AbstractC20960xs;
import X.AbstractC20980xu;
import X.AbstractC21010xx;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00Y;
import X.AnonymousClass00Z;
import X.AnonymousClass00n;
import X.AnonymousClass00u;
import X.AnonymousClass00v;
import X.AnonymousClass04o;
import X.AnonymousClass04y;
import X.AnonymousClass04z;
import X.AnonymousClass051;
import X.AnonymousClass078;
import X.AnonymousClass0E6;
import X.AnonymousClass0KR;
import X.AnonymousClass0OE;
import X.AnonymousClass0P0;
import X.AnonymousClass0PW;
import X.AnonymousClass0QZ;
import X.AnonymousClass1Q5;
import X.AnonymousClass1Q6;
import X.AnonymousClass1UE;
import X.AnonymousClass1UK;
import X.AnonymousClass1UN;
import X.AnonymousClass1VW;
import X.AnonymousClass2BD;
import X.AnonymousClass2O0;
import X.AnonymousClass2O2;
import X.AnonymousClass2O3;
import X.AnonymousClass2O4;
import X.AnonymousClass2O5;
import X.AnonymousClass2O6;
import X.AnonymousClass2O7;
import X.AnonymousClass3Ak;
import X.AnonymousClass3W1;
import X.AnonymousClass3W2;
import X.AnonymousClass3W3;
import X.AnonymousClass3W4;
import X.AnonymousClass3W5;
import X.AnonymousClass3W6;
import X.AnonymousClass3W7;
import X.AnonymousClass3W8;
import X.C000600j;
import X.C000700k;
import X.C001000o;
import X.C001300s;
import X.C001400w;
import X.C001500x;
import X.C001600y;
import X.C001801b;
import X.C003701u;
import X.C20970xt;
import X.C21040y2;
import X.C48842Nz;
import X.CallableC20940xq;
import X.EnumC48832Ny;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.protocol.ProtocolJniHelper;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public class JniBridge {
    public static volatile JniBridge INSTANCE;
    public final AnonymousClass04o jniBridgeExceptionHandler;
    public C000600j jniCallbacks = null;
    public final AtomicReference wajContext = new AtomicReference();

    public static native double jvidispatchDIO(int i, long j, Object obj);

    public static native long jvidispatchI();

    public static native long jvidispatchIIDO(int i, long j, double d, Object obj);

    public static native long jvidispatchIIIIIIOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native long jvidispatchIIIIIOOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIIIOOOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIIIO(int i, long j, long j2, Object obj);

    public static native long jvidispatchIIIOO(long j, long j2, Object obj, Object obj2);

    public static native long jvidispatchIIO(int i, long j, Object obj);

    public static native long jvidispatchIIOO(int i, long j, Object obj, Object obj2);

    public static native long jvidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native long jvidispatchIIOOOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static native long jvidispatchIO(int i, Object obj);

    public static native long jvidispatchIOO(Object obj, Object obj2);

    public static native long jvidispatchIOOO(Object obj, Object obj2, Object obj3);

    public static native long jvidispatchIOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static native Object jvidispatchO();

    public static native Object jvidispatchOII(long j, long j2);

    public static native Object jvidispatchOIIIIOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIIIOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIIIOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOIIO(int i, long j, long j2, Object obj);

    public static native Object jvidispatchOIO(int i, long j, Object obj);

    public static native Object jvidispatchOIOO(int i, long j, Object obj, Object obj2);

    public static native Object jvidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOO(int i, Object obj);

    public static native Object jvidispatchOOO(int i, Object obj, Object obj2);

    public static native Object jvidispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public JniBridge(AnonymousClass04o r2) {
        this.jniBridgeExceptionHandler = r2;
    }

    public static JniBridge getInstance() {
        if (INSTANCE == null) {
            synchronized (JniBridge.class) {
                if (INSTANCE == null) {
                    if (AnonymousClass04o.A01 == null) {
                        synchronized (AnonymousClass04o.class) {
                            if (AnonymousClass04o.A01 == null) {
                                AnonymousClass04o.A01 = new AnonymousClass04o(AnonymousClass009.A00());
                            }
                        }
                    }
                    INSTANCE = new JniBridge(AnonymousClass04o.A01);
                }
            }
        }
        return INSTANCE;
    }

    public C000600j getJniCallbacks(NativeHolder nativeHolder) {
        NativeHolder wajContext2 = getWajContext();
        if (!(wajContext2 == null || nativeHolder == null || wajContext2.isNativeEqual(nativeHolder))) {
            if (this.jniCallbacks != null) {
                Log.d("JniBridge/WamsysContextNotMatching");
            } else {
                throw null;
            }
        }
        return this.jniCallbacks;
    }

    public NativeHolder getWajContext() {
        return (NativeHolder) this.wajContext.get();
    }

    public void initWajContext() {
        AtomicReference atomicReference = this.wajContext;
        if (this.jniCallbacks != null) {
            Log.d("wamsys/JniBridge java -> wamsys crossing for WAJContextInit");
            NativeHolder nativeHolder = (NativeHolder) atomicReference.getAndSet(jvidispatchO());
            if (nativeHolder != null) {
                nativeHolder.release();
                return;
            }
            return;
        }
        throw null;
    }

    public static long jnidispatchI(int i) {
        if (i == 0) {
            return INSTANCE.jniCallbacks.A0A.A05() / 1000;
        }
        if (i == 1) {
            try {
                if (INSTANCE.jniCallbacks == null) {
                    throw null;
                }
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
        return 0;
    }

    public static long jnidispatchIIIIIIIIIIIIIOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C48842Nz r0;
        EnumC48832Ny r6;
        try {
            int i = (int) j;
            int i2 = (int) j2;
            int i3 = (int) j3;
            String str = (String) obj;
            int i4 = (int) j4;
            int i5 = (int) j5;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            boolean z = false;
            if (0 != j12) {
                z = true;
            }
            String str4 = (String) obj4;
            AbstractC20960xs r7 = (AbstractC20960xs) obj5;
            if (!(r7 instanceof AnonymousClass3W1)) {
                return 0;
            }
            AnonymousClass2O0 r11 = AnonymousClass2O0.ERROR_UNSPECIFIED;
            AnonymousClass2O0 r14 = AnonymousClass2O0.OK;
            AnonymousClass3W2 r10 = ((AnonymousClass3W1) r7).A00;
            AnonymousClass0KR r13 = r10.A00;
            if (r13 != null) {
                boolean z2 = true;
                AnonymousClass2O0 r5 = r14;
                if (i != 1) {
                    r5 = i != 3 ? r11 : AnonymousClass2O0.FAIL;
                }
                if (r5 == r11) {
                    AnonymousClass008.A0u("wamsys/registration/unknown-exist-status ", i);
                }
                if (r5 == r14) {
                    if (i3 != 1) {
                        z2 = false;
                    }
                    r0 = new C48842Nz(r5, str, z2);
                } else if (r13 != null) {
                    if (i2 != 16) {
                        switch (i2) {
                            case 1:
                                r6 = EnumC48832Ny.INCORRECT;
                                break;
                            case 2:
                                r6 = EnumC48832Ny.BLOCKED;
                                break;
                            case 3:
                                r6 = EnumC48832Ny.LENGTH_LONG;
                                break;
                            case 4:
                                r6 = EnumC48832Ny.LENGTH_SHORT;
                                break;
                            case 5:
                                r6 = EnumC48832Ny.FORMAT_WRONG;
                                break;
                            case 6:
                                r6 = EnumC48832Ny.TEMPORARILY_UNAVAILABLE;
                                break;
                            case 7:
                                r6 = EnumC48832Ny.OLD_VERSION;
                                break;
                            default:
                                switch (i2) {
                                    case 23:
                                        r6 = EnumC48832Ny.SECURITY_CODE;
                                        break;
                                    case 24:
                                        r6 = EnumC48832Ny.INVALID_SKEY_SIGNATURE;
                                        break;
                                    case 25:
                                        r6 = EnumC48832Ny.BIZ_NOT_ALLOWED;
                                        break;
                                    case 26:
                                        r6 = EnumC48832Ny.LIMITED_RELEASE;
                                        break;
                                    default:
                                        try {
                                            throw new IOException("fail, unknown reason");
                                        } catch (IOException unused) {
                                            AnonymousClass008.A0u("wamsys/registration/unknown-exist-fail-reason ", i2);
                                            ((AnonymousClass3Ak) r10).A01 = null;
                                            ((AnonymousClass3Ak) r10).A00.countDown();
                                            return 0;
                                        }
                                }
                        }
                    } else {
                        r6 = EnumC48832Ny.ERROR_BAD_TOKEN;
                    }
                    r0 = new C48842Nz(r5, r6);
                    r0.A05 = String.valueOf(j6);
                    r0.A01 = i4;
                    r0.A00 = i5;
                    r0.A06 = String.valueOf(j7);
                    r0.A07 = String.valueOf(j8);
                    r0.A03 = j9;
                    r0.A09 = str2;
                    r0.A08 = str3;
                    r0.A04 = j10;
                    r0.A02 = j11;
                    r0.A0A = z;
                    if (str4 != null) {
                        r0.A0B = Base64.decode(str4, 0);
                    }
                } else {
                    throw null;
                }
                ((AnonymousClass3Ak) r10).A01 = r0;
                ((AnonymousClass3Ak) r10).A00.countDown();
                return 0;
            }
            throw null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        AnonymousClass2O5 r5;
        try {
            int i = (int) j;
            int i2 = (int) j2;
            int i3 = (int) j3;
            String str = (String) obj;
            int i4 = (int) j4;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            boolean z = 0 != j10;
            String str4 = (String) obj5;
            String str5 = (String) obj6;
            AbstractC20960xs r1 = (AbstractC20960xs) obj7;
            if (!(r1 instanceof AnonymousClass3W7)) {
                return 0;
            }
            AnonymousClass2O5 r14 = AnonymousClass2O5.ERROR_UNSPECIFIED;
            AnonymousClass3W8 r11 = ((AnonymousClass3W7) r1).A00;
            if (r11.A01 != null) {
                boolean z2 = true;
                if (i == 1 || i == 2) {
                    r5 = AnonymousClass2O5.YES;
                } else {
                    if (i == 3) {
                        if (i2 == 1) {
                            r5 = AnonymousClass2O5.FAIL_INCORRECT;
                        } else if (i2 == 2) {
                            r5 = AnonymousClass2O5.FAIL_BLOCKED;
                        } else if (i2 == 6) {
                            r5 = AnonymousClass2O5.FAIL_TEMPORARILY_UNAVAILABLE;
                        } else if (i2 == 11) {
                            r5 = AnonymousClass2O5.FAIL_TOO_MANY_GUESSES;
                        } else if (i2 == 22) {
                            r5 = AnonymousClass2O5.FAIL_STALE;
                        } else if (i2 == 28) {
                            r5 = AnonymousClass2O5.FAIL_RESET_TOO_SOON;
                        } else if (i2 == 19) {
                            r5 = AnonymousClass2O5.FAIL_MISMATCH;
                        } else if (i2 == 20) {
                            r5 = AnonymousClass2O5.FAIL_GUESSED_TOO_FAST;
                        }
                    }
                    r5 = r14;
                }
                if (r5 == r14) {
                    StringBuilder sb = new StringBuilder("wamsys/registration/security-status-unspecified; response-status ");
                    sb.append(i);
                    sb.append(" failure-reason ");
                    sb.append(i2);
                    Log.e(sb.toString());
                }
                AnonymousClass2O4 r12 = new AnonymousClass2O4(r5);
                r12.A06 = str;
                if (i3 != 1) {
                    z2 = false;
                }
                r12.A09 = z2;
                r12.A05 = String.valueOf(i4);
                r12.A00 = j6;
                r12.A08 = str2;
                r12.A07 = str3;
                r12.A02 = j7;
                r12.A01 = j8;
                r12.A0A = z;
                if (str5 != null) {
                    r12.A0B = Base64.decode(str5, 0);
                }
                r12.A04 = str4;
                ((AnonymousClass3Ak) r11).A01 = r12;
                ((AnonymousClass3Ak) r11).A00.countDown();
                return 0;
            }
            throw null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        AnonymousClass2O3 r6;
        try {
            int i = (int) j;
            int i2 = (int) j2;
            String str = (String) obj;
            int i3 = (int) j3;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            String str4 = (String) obj4;
            String str5 = (String) obj5;
            int i4 = (int) j4;
            int i5 = (int) j5;
            String str6 = (String) obj6;
            AbstractC20960xs r1 = (AbstractC20960xs) obj7;
            if (!(r1 instanceof AnonymousClass3W3)) {
                return 0;
            }
            AnonymousClass2O3 r15 = AnonymousClass2O3.ERROR_UNSPECIFIED;
            AnonymousClass3W4 r5 = ((AnonymousClass3W3) r1).A00;
            if (r5.A00 != null) {
                boolean z = true;
                if (i == 1) {
                    r6 = AnonymousClass2O3.OK;
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            r6 = AnonymousClass2O3.YES_WITH_CODE;
                        }
                    } else if (i2 == 2) {
                        r6 = AnonymousClass2O3.ERROR_BLOCKED;
                    } else if (i2 == 26) {
                        r6 = AnonymousClass2O3.ERROR_LIMITED_RELEASE;
                    } else if (i2 == 29) {
                        r6 = AnonymousClass2O3.ERROR_FLASH_CALL_DISABLED;
                    } else if (i2 == 23) {
                        r6 = AnonymousClass2O3.SECURITY_CODE;
                    } else if (i2 != 24) {
                        switch (i2) {
                            case 6:
                                r6 = AnonymousClass2O3.ERROR_TEMPORARILY_UNAVAILABLE;
                                break;
                            case 7:
                                r6 = AnonymousClass2O3.ERROR_OLD_VERSION;
                                break;
                            case 8:
                                r6 = AnonymousClass2O3.ERROR_TOO_RECENT;
                                break;
                            case 9:
                                r6 = AnonymousClass2O3.ERROR_TOO_MANY;
                                break;
                            case 10:
                                r6 = AnonymousClass2O3.ERROR_NEXT_METHOD;
                                break;
                            case 11:
                                r6 = AnonymousClass2O3.ERROR_TOO_MANY_GUESSES;
                                break;
                            case 12:
                                r6 = AnonymousClass2O3.ERROR_BAD_PARAMETER;
                                break;
                            case 13:
                                r6 = AnonymousClass2O3.ERROR_MISSING_PARAMETER;
                                break;
                            case 14:
                                r6 = AnonymousClass2O3.ERROR_PROVIDER_TIMEOUT;
                                break;
                            case 15:
                                r6 = AnonymousClass2O3.ERROR_PROVIDER_UNROUTABLE;
                                break;
                            case GlVideoRenderer.CAP_RENDER_I420:
                                r6 = AnonymousClass2O3.ERROR_BAD_TOKEN;
                                break;
                            case 17:
                                r6 = AnonymousClass2O3.ERROR_TOO_MANY_ALL_METHODS;
                                break;
                            case 18:
                                r6 = AnonymousClass2O3.ERROR_NO_ROUTES;
                                break;
                        }
                    } else {
                        r6 = AnonymousClass2O3.ERROR_INVALID_SKEY_SIGNATURE;
                    }
                    r6 = r15;
                } else {
                    r6 = AnonymousClass2O3.YES;
                }
                if (r6 == r15) {
                    StringBuilder sb = new StringBuilder("wamsys/registration/request-code-status-unspecified; response-status ");
                    sb.append(i);
                    sb.append(" failure-reason ");
                    sb.append(i2);
                    Log.e(sb.toString());
                }
                AnonymousClass2O2 r12 = new AnonymousClass2O2(r6);
                r12.A03 = i2;
                r12.A08 = str;
                if (i3 != 1) {
                    z = false;
                }
                r12.A0G = z;
                r12.A0B = String.valueOf(j6);
                r12.A07 = str2;
                r12.A0A = str3;
                r12.A0C = String.valueOf(j7);
                r12.A0D = String.valueOf(j8);
                r12.A0F = str4;
                r12.A0E = str5;
                r12.A04 = j9;
                r12.A01 = i4;
                r12.A00 = i5;
                r12.A06 = str6;
                ((AnonymousClass3Ak) r5).A01 = r12;
                ((AnonymousClass3Ak) r5).A00.countDown();
                return 0;
            }
            throw null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIO(long j, long j2, long j3, long j4, long j5, Object obj) {
        try {
            C000600j r4 = INSTANCE.jniCallbacks;
            int i = (int) j;
            byte[] bArr = (byte[]) obj;
            int i2 = (int) j2;
            int i3 = (int) j3;
            int i4 = (int) j4;
            int i5 = (int) j5;
            if (r4 != null) {
                AnonymousClass00Z r0 = new AnonymousClass00Z(i3, i4, i5, false);
                AnonymousClass00Y r9 = r4.A0C;
                Integer A03 = r9.A03(i, r0, false);
                if (A03 == null) {
                    return 0;
                }
                int intValue = A03.intValue();
                if (i2 != 2) {
                    r9.A0F.A01.execute(new AnonymousClass1VW(r9, i2, i, bArr, intValue));
                    return 0;
                }
                throw new UnsupportedOperationException("WamRuntime/logEvent hasn't implemented for privatestats yet");
            }
            throw null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        AnonymousClass2O7 r12;
        try {
            int i = (int) j;
            int i2 = (int) j2;
            int i3 = (int) j3;
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            String str4 = (String) obj4;
            String str5 = (String) obj6;
            AbstractC20960xs r3 = (AbstractC20960xs) obj7;
            if (!(r3 instanceof AnonymousClass3W5)) {
                return 0;
            }
            AnonymousClass2O7 r1 = AnonymousClass2O7.ERROR_UNSPECIFIED;
            AnonymousClass3W6 r32 = ((AnonymousClass3W5) r3).A00;
            if (r32.A00 != null) {
                boolean z = true;
                if (i != 1) {
                    if (i == 3) {
                        if (i2 == 2) {
                            r12 = AnonymousClass2O7.FAIL_BLOCKED;
                        } else if (i2 == 6) {
                            r12 = AnonymousClass2O7.FAIL_TEMPORARILY_UNAVAILABLE;
                        } else if (i2 == 11) {
                            r12 = AnonymousClass2O7.FAIL_TOO_MANY_GUESSES;
                        } else if (i2 != 26) {
                            switch (i2) {
                                case 19:
                                    r12 = AnonymousClass2O7.FAIL_MISMATCH;
                                    break;
                                case AnonymousClass0PW.A01:
                                    r12 = AnonymousClass2O7.FAIL_GUESSED_TOO_FAST;
                                    break;
                                case 21:
                                    r12 = AnonymousClass2O7.FAIL_MISSING;
                                    break;
                                case 22:
                                    r12 = AnonymousClass2O7.FAIL_STALE;
                                    break;
                                case 23:
                                    r12 = AnonymousClass2O7.SECURITY_CODE;
                                    break;
                            }
                        } else {
                            r12 = AnonymousClass2O7.ERROR_LIMITED_RELEASE;
                        }
                    }
                    r12 = r1;
                } else {
                    r12 = AnonymousClass2O7.YES;
                }
                if (r12 == r1) {
                    StringBuilder sb = new StringBuilder("wamsys/registration/verify-code-status-unspecified; response-status ");
                    sb.append(i);
                    sb.append(" failure-reason ");
                    sb.append(i2);
                    Log.e(sb.toString());
                }
                AnonymousClass2O6 r2 = new AnonymousClass2O6(r12);
                r2.A03 = str;
                if (i3 != 1) {
                    z = false;
                }
                r2.A07 = z;
                r2.A04 = String.valueOf(j4);
                r2.A06 = str2;
                r2.A05 = str3;
                r2.A00 = j5;
                if (str4 != null) {
                    r2.A08 = Base64.decode(str4, 0);
                }
                r2.A02 = str5;
                ((AnonymousClass3Ak) r32).A01 = r2;
                ((AnonymousClass3Ak) r32).A00.countDown();
                return 0;
            }
            throw null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIO(int i, long j, long j2, long j3, Object obj) {
        if (i == 0) {
            ((AbstractC21010xx) obj).AMB(j, j2, j3);
        } else if (i == 1) {
            try {
                ((AbstractC20980xu) obj).AMB(j, j2, j3);
                return 0;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r1 != null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0126, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0127, code lost:
        if (r3 != null) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIO(int r11, long r12, java.lang.Object r14) {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIO(int, long, java.lang.Object):long");
    }

    public static long jnidispatchIIOO(int i, long j, Object obj, Object obj2) {
        if (i == 0) {
            int i2 = (int) j;
            byte[] bArr = (byte[]) obj2;
            C001500x r1 = INSTANCE.getJniCallbacks((NativeHolder) obj).A09;
            if (r1 == null) {
                throw null;
            } else if (bArr == null || bArr.length <= 0) {
                return 0;
            } else {
                r1.A00.A0D.A00(i2, bArr);
                return 1;
            }
        } else if (i == 1) {
            C001000o r6 = INSTANCE.getJniCallbacks((NativeHolder) obj).A0B;
            r6.A0H.A00();
            int i3 = (((int) j) % 16777214) + 1;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj2).entrySet()) {
                arrayList.add(new AnonymousClass1Q6(((Integer) entry.getKey()).intValue(), (byte[]) entry.getValue()));
            }
            r6.A0V(arrayList, i3);
            return 0;
        } else if (i == 2) {
            List list = (List) obj2;
            AnonymousClass00n r2 = INSTANCE.getJniCallbacks((NativeHolder) obj).A05;
            if (r2 != null) {
                int[] iArr = new int[list.size()];
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iArr[i4] = ((Integer) list.get(i4)).intValue();
                }
                r2.A00.A0A.A03(iArr);
                return 1;
            }
            throw null;
        } else if (i == 3) {
            C001300s r0 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
            AnonymousClass0E6 r3 = new AnonymousClass0E6((String) obj, (int) j);
            AnonymousClass04z r22 = r0.A00.A0C;
            byte[] A03 = r22.A03(r3);
            if (A03 == null) {
                return 0;
            }
            try {
                C001000o.A02(new AnonymousClass1UN(A03));
                return 1;
            } catch (IOException unused) {
                r22.A01(r3);
                return 0;
            }
        } else if (i != 4) {
            return 0;
        } else {
            try {
                C001300s r02 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
                r02.A00.A0C.A01(new AnonymousClass0E6((String) obj, (int) j));
                return 1;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    public static long jnidispatchIIOOO(int i, long j, Object obj, Object obj2, Object obj3) {
        if (i != 0) {
            if (i == 1) {
                byte[] bArr = (byte[]) obj3;
                AnonymousClass00v r3 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A04;
                AnonymousClass0E6 r2 = new AnonymousClass0E6((String) obj, (int) j);
                if (bArr == null) {
                    r3.A00.A0M(r2);
                    return 1;
                }
                try {
                    r3.A00.A0N(r2, new AnonymousClass0QZ(C001801b.A08(bArr)));
                    return 1;
                } catch (AnonymousClass1UK e) {
                    Log.e("IdentityKeyStoreImpl/Could not save the identity key.", e);
                    return 0;
                }
            } else if (i == 2) {
                INSTANCE.getJniCallbacks((NativeHolder) obj2);
                AnonymousClass051.A00(new AnonymousClass0E6((String) obj, (int) j));
                return 1;
            } else if (i != 3) {
                return 0;
            } else {
                try {
                    String str = (String) obj;
                    int i2 = (int) j;
                    byte[] bArr2 = (byte[]) obj3;
                    C001300s r22 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
                    try {
                        C001000o.A02(new AnonymousClass1UN(bArr2));
                        r22.A00.A0C.A02(new AnonymousClass0E6(str, i2), bArr2);
                        return 1;
                    } catch (IOException e2) {
                        Log.e("sessionStoreImpl/invalid-session-record", e2);
                        return 0;
                    }
                } catch (Exception e3) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e3);
                    return 0;
                }
            }
        } else if (INSTANCE.getJniCallbacks((NativeHolder) obj).A04 != null) {
            return 0;
        } else {
            throw null;
        }
    }

    public static long jnidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        if (i == 0) {
            byte[] bArr = (byte[]) obj4;
            AnonymousClass00u r2 = INSTANCE.getJniCallbacks((NativeHolder) obj3).A07;
            AnonymousClass0OE r1 = new AnonymousClass0OE((String) obj, new AnonymousClass0E6((String) obj2, (int) j));
            if (bArr == null) {
                r2.A00.A0S(r1);
                return 1;
            }
            r2.A00.A0U(r1, bArr);
            return 1;
        } else if (i != 1) {
            return 0;
        } else {
            try {
                byte[] bArr2 = (byte[]) obj4;
                C001600y r22 = INSTANCE.getJniCallbacks((NativeHolder) obj3).A03;
                AnonymousClass0OE r12 = new AnonymousClass0OE((String) obj, new AnonymousClass0E6((String) obj2, (int) j));
                if (bArr2 == null) {
                    r22.A00.A0R(r12);
                    return 1;
                }
                r22.A00.A0T(r12, bArr2);
                return 1;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    public static long jnidispatchIIOOOOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            ((AbstractC21010xx) obj3).A2u((int) j, (String) obj, (String) obj2, (byte[]) obj4, (byte[]) obj5, (byte[]) obj6, (byte[]) obj7, (byte[]) obj8, (byte[]) obj9);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIO(int i, Object obj) {
        switch (i) {
            case 0:
                String str = (String) obj;
                if (INSTANCE.jniCallbacks != null) {
                    Log.d(str);
                    return 0;
                }
                throw null;
            case 1:
                if (!((AbstractC21010xx) obj).AAv()) {
                    return 0;
                }
                return 1;
            case 2:
                if (!((AbstractC20980xu) obj).AAv()) {
                    return 0;
                }
                return 1;
            case 3:
                return (long) INSTANCE.getJniCallbacks((NativeHolder) obj).A04.A00.A08.A02();
            case 4:
                return (long) INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0E().A00.A01;
            case 5:
                return (long) INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A0A.A00();
            case 6:
                return (long) INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A08.A01();
            case 7:
                try {
                    return (long) INSTANCE.jniCallbacks.A0D.getTypeFromKeyValue(obj);
                } catch (Exception e) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e);
                    return 0;
                }
            default:
                return 0;
        }
    }

    public static long jnidispatchIOO(int i, Object obj, Object obj2) {
        if (i == 0) {
            if (!((AnonymousClass0P0) obj).ANM(new C20970xt((NativeHolder) obj2))) {
                return 0;
            }
            return 1;
        } else if (i != 1) {
            return 0;
        } else {
            try {
                String str = (String) obj;
                StringBuilder A0V = AnonymousClass008.A0V("axolotl deleted ", (long) INSTANCE.getJniCallbacks((NativeHolder) obj2).A08.A00.A0C.A00.A02().A01("sessions", "recipient_id = ?", new String[]{str}, "SignalSessionStore/removeAllSessions"), " sessions with ");
                A0V.append(C003701u.A06(str, 4));
                Log.i(A0V.toString());
                return 1;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    public static long jnidispatchIOOO(Object obj, Object obj2, Object obj3) {
        try {
            byte[] bArr = (byte[]) obj3;
            AnonymousClass1UE r4 = (AnonymousClass1UE) obj;
            INSTANCE.getJniCallbacks((NativeHolder) obj2).A01.A00.A0H.A00();
            if (r4 == null) {
                return 0;
            }
            r4.AA9(bArr);
            return 1;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static Object jnidispatchOI(long j) {
        try {
            int i = (int) j;
            if (INSTANCE.jniCallbacks.A06 != null) {
                try {
                    byte[] bArr = new byte[i];
                    SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                    return bArr;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw null;
            }
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return null;
        }
    }

    public static Object jnidispatchOIO(int i, long j, Object obj) {
        if (i == 0) {
            int i2 = (int) j;
            byte[] A01 = INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0D.A01(i2);
            if (A01 == null) {
                AnonymousClass008.A0u("no signed prekey available with id ", i2);
                return null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl loaded a signed pre key with id ");
                sb.append(i2);
                Log.i(sb.toString());
                AnonymousClass078.A02(AnonymousClass2BD.A06, A01);
                return A01;
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder("failed to parse signed pre key record during load for id ");
                sb2.append(i2);
                Log.e(sb2.toString(), e);
                return null;
            }
        } else if (i == 1) {
            int i3 = (int) j;
            AnonymousClass04y r3 = INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A0A;
            byte[] A04 = r3.A04(i3);
            if (A04 == null) {
                return null;
            }
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("axolotl found a pre key with id ");
                sb3.append(i3);
                Log.i(sb3.toString());
                C001000o.A01(i3, A04);
                return A04;
            } catch (IOException e2) {
                StringBuilder sb4 = new StringBuilder("error reading prekey ");
                sb4.append(i3);
                sb4.append("; deleting");
                Log.e(sb4.toString(), e2);
                r3.A02(i3);
                return null;
            }
        } else if (i != 2) {
            return null;
        } else {
            try {
                int i4 = (int) j;
                AnonymousClass00n r0 = INSTANCE.getJniCallbacks((NativeHolder) obj).A05;
                if (i4 <= 0) {
                    return null;
                }
                List A012 = r0.A00.A0A.A01();
                HashMap hashMap = new HashMap();
                Iterator it = ((ArrayList) A012).iterator();
                while (it.hasNext()) {
                    AnonymousClass1Q6 r2 = (AnonymousClass1Q6) it.next();
                    hashMap.put(Integer.valueOf(r2.A00), r2.A01);
                    if (hashMap.size() == i4) {
                        break;
                    }
                }
                return hashMap;
            } catch (Exception e3) {
                INSTANCE.jniBridgeExceptionHandler.A00(e3);
                return null;
            }
        }
    }

    public static Object jnidispatchOIOO(int i, long j, Object obj, Object obj2) {
        if (i == 0) {
            C20970xt ABq = ((AnonymousClass0P0) obj2).ABq((String) obj, (int) j);
            if (ABq != null) {
                return ABq.A00;
            }
            return null;
        } else if (i == 1) {
            AnonymousClass00v r0 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A04;
            AnonymousClass0QZ A0A = r0.A00.A0A(new AnonymousClass0E6((String) obj, (int) j));
            if (A0A != null) {
                return A0A.A00.A00();
            }
            return null;
        } else if (i != 2) {
            return null;
        } else {
            try {
                C001300s r02 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
                AnonymousClass0E6 r3 = new AnonymousClass0E6((String) obj, (int) j);
                AnonymousClass04z r2 = r02.A00.A0C;
                byte[] A03 = r2.A03(r3);
                if (A03 == null) {
                    return null;
                }
                try {
                    C001000o.A02(new AnonymousClass1UN(A03));
                    return A03;
                } catch (IOException unused) {
                    r2.A01(r3);
                    return null;
                }
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        if (r6 != null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchOIOOO(int r11, long r12, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchOIOOO(int, long, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static Object jnidispatchOO(int i, Object obj) {
        C21040y2 r0;
        AnonymousClass1Q5 r02;
        switch (i) {
            case 0:
                String str = (String) obj;
                C000700k r1 = INSTANCE.jniCallbacks.A02;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        InetAddress[] inetAddressArr = r1.A00.A01(str).A04;
                        ArrayList arrayList = new ArrayList();
                        for (InetAddress inetAddress : inetAddressArr) {
                            arrayList.add(inetAddress.getHostAddress());
                        }
                        return arrayList;
                    } catch (UnknownHostException unused) {
                    }
                }
                return null;
            case 1:
                byte[] bArr = INSTANCE.getJniCallbacks((NativeHolder) obj).A00.A00.A05().A01.A01;
                int length = bArr.length;
                if (length == 32) {
                    return bArr;
                }
                AnonymousClass008.A1M(AnonymousClass008.A0S("AuthKeyStoreImpl/the key length is not expected/privateLength="), length);
                return null;
            case 2:
                if (INSTANCE.jniCallbacks != null) {
                    Log.d("wamsys/JniBridge wamsys -> java crossing for WESIdentityKeyStoreAPICopyIdentityKeyPair");
                    AnonymousClass00v r3 = INSTANCE.getJniCallbacks((NativeHolder) obj).A04;
                    C001400w r2 = r3.A01;
                    if (r2.A01()) {
                        r02 = r3.A00.A08.A03();
                    } else {
                        try {
                            r02 = (AnonymousClass1Q5) r2.A00.submit(new CallableC20940xq(r3)).get();
                        } catch (InterruptedException | ExecutionException unused2) {
                            Log.e("IdentityKeyStoreImpl/loadIdentityPublicKey thread interrupted");
                            r0 = null;
                        }
                    }
                    r0 = new C21040y2(r02.A01, r02.A00);
                    if (r0 != null) {
                        return r0.A00;
                    }
                    return null;
                }
                throw null;
            case 3:
                return INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0E().A00.A09();
            case 4:
                return INSTANCE.jniCallbacks.A0D.getTagFromProtocolTreeNode(obj);
            case 5:
                Object[] attributesFromProtocolTreeNode = INSTANCE.jniCallbacks.A0D.getAttributesFromProtocolTreeNode(obj);
                if (attributesFromProtocolTreeNode != null) {
                    return Arrays.asList(attributesFromProtocolTreeNode);
                }
                return null;
            case 6:
                Object[] childrenFromProtocolTreeNode = INSTANCE.jniCallbacks.A0D.getChildrenFromProtocolTreeNode(obj);
                if (childrenFromProtocolTreeNode != null) {
                    return Arrays.asList(childrenFromProtocolTreeNode);
                }
                return null;
            case 7:
                return INSTANCE.jniCallbacks.A0D.getDataFromProtocolTreeNode(obj);
            case 8:
                return INSTANCE.jniCallbacks.A0D.getKeyFromKeyValue(obj);
            case 9:
                return INSTANCE.jniCallbacks.A0D.getValueStringFromKeyValue(obj);
            case 10:
                try {
                    return INSTANCE.jniCallbacks.A0D.createNewJid((String) obj);
                } catch (Exception e) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e);
                    return null;
                }
            default:
                return null;
        }
    }

    public static Object jnidispatchOOO(Object obj, Object obj2) {
        try {
            Map map = (Map) obj2;
            C001300s r5 = INSTANCE.getJniCallbacks((NativeHolder) obj).A08;
            HashMap hashMap = null;
            if (r5 != null) {
                if (map != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : map.keySet()) {
                        int intValue = num.intValue();
                        Object obj3 = map.get(Integer.valueOf(intValue));
                        if (obj3 != null) {
                            arrayList.add(new AnonymousClass0E6((String) obj3, intValue));
                        } else {
                            throw null;
                        }
                    }
                    Set A0I = r5.A00.A0I(arrayList);
                    hashMap = new HashMap();
                    Iterator it = ((HashSet) A0I).iterator();
                    while (it.hasNext()) {
                        AnonymousClass0E6 r2 = (AnonymousClass0E6) it.next();
                        hashMap.put(Integer.valueOf(r2.A00), r2.A01);
                    }
                }
                return hashMap;
            }
            throw null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static Object jnidispatchOOOOO(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr;
        try {
            String str = (String) obj;
            List list = (List) obj3;
            List list2 = (List) obj4;
            byte[] bArr = (byte[]) obj2;
            ProtocolJniHelper protocolJniHelper = INSTANCE.jniCallbacks.A0D;
            Object[] array = list != null ? list.toArray() : null;
            if (list2 != null) {
                objArr = list2.toArray();
            } else {
                objArr = null;
            }
            return protocolJniHelper.createProtocolTreeNode(str, array, objArr, bArr);
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }
}
