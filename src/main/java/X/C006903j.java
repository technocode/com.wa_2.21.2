package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.03j  reason: invalid class name and case insensitive filesystem */
public class C006903j {
    public static volatile C006903j A04;
    public boolean A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public volatile AnonymousClass0R6 A02;
    public volatile boolean A03;

    public static C006903j A00() {
        if (A04 == null) {
            synchronized (C014408c.class) {
                if (A04 == null) {
                    A04 = new C006903j();
                }
            }
        }
        return A04;
    }

    public int A01(AnonymousClass02N r2) {
        C08560bL r0 = (C08560bL) A0A().get(r2);
        if (r0 == null) {
            return 0;
        }
        return r0.A03;
    }

    public int A02(UserJid userJid) {
        C08560bL r0 = (C08560bL) A0A().get(userJid);
        if (r0 == null) {
            return 0;
        }
        return r0.A0M.expiration;
    }

    public long A03(AnonymousClass02N r3) {
        C08560bL r0 = (C08560bL) A0A().get(r3);
        if (r0 == null) {
            return 1;
        }
        return r0.A0G;
    }

    public long A04(AnonymousClass02N r3) {
        C08560bL r0 = (C08560bL) A0A().get(r3);
        if (r0 == null) {
            return 0;
        }
        return r0.A0K;
    }

    public synchronized C08560bL A05(AnonymousClass02N r2) {
        if (r2 == null) {
            return null;
        }
        return (C08560bL) A0A().get(r2);
    }

    public C28491Un A06(AnonymousClass02N r6) {
        C28491Un r0;
        C08560bL r4 = (C08560bL) A0A().get(r6);
        if (r4 == null) {
            return new C28491Un(0, 0, 0);
        }
        synchronized (r4) {
            r0 = new C28491Un(r4.A03, r4.A04, r4.A05);
        }
        return r0;
    }

    public C007103l A07(UserJid userJid) {
        C08560bL r0 = (C08560bL) A0A().get(userJid);
        if (r0 == null) {
            return null;
        }
        return r0.A0M;
    }

    public String A08(AnonymousClass02N r2) {
        C08560bL r0 = (C08560bL) A0A().get(r2);
        if (r0 == null) {
            return null;
        }
        return r0.A0Q;
    }

    public synchronized Set A09() {
        return A0A().keySet();
    }

    public final ConcurrentHashMap A0A() {
        Map map;
        if (this.A02 == null && !this.A03) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A02 != null) {
                AnonymousClass0R6 r7 = this.A02;
                this.A03 = true;
                this.A02 = null;
                try {
                    AnonymousClass0DG r3 = r7.A00;
                    C014508d r2 = r3.A08;
                    r2.A05();
                    if (r2.A01) {
                        try {
                            map = r3.A04.A0A();
                        } catch (IllegalStateException e) {
                            Log.e("msgstore-manager/finish", e);
                            r2.A05();
                            r2.A07.close();
                            r3.A0A.A02();
                            map = r3.A04.A0A();
                        }
                        for (Map.Entry entry : ((HashMap) map).entrySet()) {
                            this.A01.put(entry.getKey(), entry.getValue());
                        }
                        ArrayList<AnonymousClass02N> arrayList = new ArrayList(this.A01.keySet());
                        AnonymousClass09F r9 = r7.A00.A00;
                        AnonymousClass01Q r10 = r9.A08;
                        C006903j r8 = r10.A00;
                        r8.A0A();
                        ArrayList arrayList2 = r10.A01;
                        synchronized (arrayList2) {
                            arrayList2.clear();
                            for (AnonymousClass02N r1 : arrayList) {
                                if (r8.A0C(r1)) {
                                    C08570bM r22 = new C08570bM();
                                    r22.A01 = r1;
                                    r22.A00 = r8.A04(r1);
                                    arrayList2.add(r22);
                                }
                            }
                            Collections.sort(arrayList2, r10.A02);
                        }
                        r9.A00.A0E(new RunnableEBaseShape1S0100000_I0_1(r9.A07, 46));
                        StringBuilder sb = new StringBuilder("msgstore-manager/initialize/chats ");
                        sb.append(arrayList.size());
                        Log.i(sb.toString());
                        this.A00 = true;
                        this.A03 = false;
                    } else {
                        Log.w("msgstore-manager/finish/db is not ready yet", new Throwable());
                        throw new AnonymousClass1VE();
                    }
                } catch (AnonymousClass1VE unused) {
                } catch (Throwable th) {
                    this.A03 = false;
                    throw th;
                }
            }
        }
        return this.A01;
    }

    public synchronized void A0B(AnonymousClass02N r2, C08560bL r3) {
        if (r2 != null) {
            A0A().put(r2, r3);
        }
    }

    public boolean A0C(AnonymousClass02N r3) {
        return A0A().containsKey(r3) && !A0F(r3);
    }

    public boolean A0D(AnonymousClass02N r7) {
        C08560bL r0;
        if (A0F(r7) || (r0 = (C08560bL) A0A().get(r7)) == null || r0.A0F == 1) {
            return false;
        }
        return true;
    }

    public boolean A0E(AnonymousClass02N r3) {
        C08560bL r0 = (C08560bL) A0A().get(r3);
        return r0 != null && r0.A0R;
    }

    public boolean A0F(AnonymousClass02N r9) {
        C08560bL r7 = (C08560bL) A0A().get(r9);
        if (r7 == null) {
            return true;
        }
        long j = r7.A0F;
        if (j == 0 && r7.A0B == 0) {
            return false;
        }
        long j2 = r7.A0B;
        return j2 == r7.A0C && j2 >= j;
    }
}
