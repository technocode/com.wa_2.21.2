package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.2Pv  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC49282Pv {
    public static volatile AbstractC49282Pv A09;
    public long A00 = -1;
    public WeakReference A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass01X A03;
    public final C48692Ni A04;
    public final AnonymousClass00Y A05;
    public final AnonymousClass0Eg A06;
    public final AnonymousClass03A A07;
    public final AnonymousClass00T A08;

    public AbstractC49282Pv(AnonymousClass00S r3, AnonymousClass0Eg r4, AnonymousClass03A r5, AnonymousClass00T r6, AnonymousClass00Y r7, AnonymousClass01X r8, C48692Ni r9) {
        this.A02 = r3;
        this.A06 = r4;
        this.A07 = r5;
        this.A08 = r6;
        this.A05 = r7;
        this.A03 = r8;
        this.A04 = r9;
    }

    public static synchronized AbstractC49282Pv A00() {
        AbstractC49282Pv r0;
        synchronized (AbstractC49282Pv.class) {
            if (A09 == null) {
                C000300f A002 = C000300f.A00();
                if (A002 != null) {
                    int A062 = A002.A06(AbstractC000400g.A38);
                    if (A062 == 1) {
                        AnonymousClass00S A003 = AnonymousClass00S.A00();
                        if (A003 == null) {
                            throw null;
                        } else if (C000800l.A00() != null) {
                            AnonymousClass0Eg A004 = AnonymousClass0Eg.A00();
                            if (A004 != null) {
                                AnonymousClass03A A005 = AnonymousClass03A.A00();
                                if (A005 != null) {
                                    AnonymousClass00T A006 = C002101e.A00();
                                    if (A006 != null) {
                                        AnonymousClass00Y A007 = AnonymousClass00Y.A00();
                                        if (A007 != null) {
                                            AnonymousClass01X A008 = AnonymousClass01X.A00();
                                            if (A008 != null) {
                                                A09 = new C54642fG(A003, A004, A005, A006, A007, A008, new C48692Ni(AnonymousClass03P.A00()));
                                            } else {
                                                throw null;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else if (A062 != 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected value of gif_provider server prop ");
                        sb.append(A062);
                        Log.e(sb.toString());
                        AnonymousClass00S A009 = AnonymousClass00S.A00();
                        if (A009 == null) {
                            throw null;
                        } else if (C000800l.A00() != null) {
                            AnonymousClass0Eg A0010 = AnonymousClass0Eg.A00();
                            if (A0010 != null) {
                                AnonymousClass03A A0011 = AnonymousClass03A.A00();
                                if (A0011 != null) {
                                    AnonymousClass00T A0012 = C002101e.A00();
                                    if (A0012 != null) {
                                        AnonymousClass00Y A0013 = AnonymousClass00Y.A00();
                                        if (A0013 != null) {
                                            AnonymousClass01X A0014 = AnonymousClass01X.A00();
                                            if (A0014 != null) {
                                                A09 = new C54672fJ(A009, A0010, A0011, A0012, A0013, A0014, new C48692Ni(AnonymousClass03P.A00()));
                                            } else {
                                                throw null;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        AnonymousClass00S A0015 = AnonymousClass00S.A00();
                        if (A0015 == null) {
                            throw null;
                        } else if (C000800l.A00() != null) {
                            AnonymousClass0Eg A0016 = AnonymousClass0Eg.A00();
                            if (A0016 != null) {
                                AnonymousClass03A A0017 = AnonymousClass03A.A00();
                                if (A0017 != null) {
                                    AnonymousClass00T A0018 = C002101e.A00();
                                    if (A0018 != null) {
                                        AnonymousClass00Y A0019 = AnonymousClass00Y.A00();
                                        if (A0019 != null) {
                                            AnonymousClass01X A0020 = AnonymousClass01X.A00();
                                            if (A0020 != null) {
                                                A09 = new C54672fJ(A0015, A0016, A0017, A0018, A0019, A0020, new C48692Ni(AnonymousClass03P.A00()));
                                            } else {
                                                throw null;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
            r0 = A09;
        }
        return r0;
    }

    public final AnonymousClass2Q1 A01() {
        AnonymousClass2Q1 r2;
        AnonymousClass2Q1 r5;
        AnonymousClass00E.A01();
        WeakReference weakReference = this.A01;
        if (weakReference != null && (r5 = (AnonymousClass2Q1) weakReference.get()) != null && this.A02.A05() - this.A00 < TimeUnit.HOURS.toMillis(4) && !r5.A02) {
            return r5;
        }
        if (!(this instanceof C54672fJ)) {
            r2 = new C54622fE((C54642fG) this);
        } else {
            r2 = new C54652fH((C54672fJ) this);
        }
        this.A01 = new WeakReference(r2);
        this.A00 = this.A02.A05();
        return r2;
    }

    public AnonymousClass2Q1 A02(CharSequence charSequence, boolean z) {
        if (!(this instanceof C54672fJ)) {
            return new C54632fF((C54642fG) this, charSequence, z);
        }
        return new C54662fI((C54672fJ) this, charSequence, z);
    }

    public final HttpsURLConnection A03(String str) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setRequestProperty("User-Agent", this.A07.A02());
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.connect();
        return httpsURLConnection;
    }
}
