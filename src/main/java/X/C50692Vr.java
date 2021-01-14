package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLException;

/* renamed from: X.2Vr  reason: invalid class name and case insensitive filesystem */
public class C50692Vr {
    public final C50522Va A00;

    public C50692Vr(C58382lp r11) {
        C50542Vc r3 = new C50542Vc();
        try {
            AnonymousClass2VZ[] r9 = C50702Vs.A0C;
            for (AnonymousClass2VZ r5 : r9) {
                EnumC50552Vd r4 = EnumC50552Vd.START;
                if (r3.A01.get(r5) == null) {
                    EnumC50552Vd r2 = r5.A02;
                    if (r2 != r4 || r3.A00 == null) {
                        r3.A01.put(r5, new C50572Vf());
                        if (r2 == r4) {
                            r3.A00 = r5;
                        }
                    } else {
                        StringBuilder A0S = AnonymousClass008.A0S("Start state already exists, new state invalid: ");
                        A0S.append(r5.A03);
                        throw new C50532Vb(A0S.toString());
                    }
                } else {
                    StringBuilder A0S2 = AnonymousClass008.A0S("State already added: ");
                    A0S2.append(r5.A03);
                    throw new C50532Vb(A0S2.toString());
                }
            }
            C50562Ve[] r6 = C50602Vi.A0V;
            for (C50562Ve r42 : r6) {
                C50572Vf r22 = (C50572Vf) r3.A01.get(r42.A02);
                if (r22 == null) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("Cannot find input state for transition ");
                    A0S3.append(r42.A04);
                    throw new C50532Vb(A0S3.toString());
                } else if (r3.A01.get(r42.A01) != null) {
                    r22.A00.add(r42);
                } else {
                    StringBuilder A0S4 = AnonymousClass008.A0S("Cannot find output state for transition ");
                    A0S4.append(r42.A04);
                    throw new C50532Vb(A0S4.toString());
                }
            }
            EnumC50552Vd r62 = EnumC50552Vd.END;
            if (r3.A00 != null) {
                for (AnonymousClass2VZ r0 : r3.A01.keySet()) {
                    if (r0.A02 == r62) {
                        HashSet hashSet = new HashSet();
                        for (Map.Entry entry : r3.A01.entrySet()) {
                            if (((C50572Vf) entry.getValue()).A00.size() != 0 || ((AnonymousClass2VZ) entry.getKey()).A02 == r62) {
                                C50572Vf r02 = (C50572Vf) entry.getValue();
                                if (r02 != null) {
                                    HashSet hashSet2 = new HashSet();
                                    Iterator it = r02.A00.iterator();
                                    while (it.hasNext()) {
                                        hashSet2.add(((C50562Ve) it.next()).A01);
                                    }
                                    hashSet.addAll(hashSet2);
                                } else {
                                    throw null;
                                }
                            } else {
                                StringBuilder A0S5 = AnonymousClass008.A0S("Non-end state with no outbound transitions: ");
                                A0S5.append(((AnonymousClass2VZ) entry.getKey()).A03);
                                throw new C50532Vb(A0S5.toString());
                            }
                        }
                        if (r3.A01.size() - hashSet.size() > 1) {
                            throw new C50532Vb("Non-start state(s) with no incoming transitions exist(s)");
                        } else if (r3.A01.size() - hashSet.size() != 1 || !hashSet.contains(r3.A00)) {
                            r3.A02 = true;
                            this.A00 = new C50522Va(r3, r11);
                            return;
                        } else {
                            throw new C50532Vb("Non-start state(s) with no incoming transitions exist(s)");
                        }
                    }
                }
                throw new C50532Vb("State machine must have an end state");
            }
            throw new C50532Vb("State machine must have a start state");
        } catch (C50532Vb e) {
            e = e;
            throw new C29001Wo((byte) 80, new SSLException("Failed to init finite state machine.", e.getCause() != null ? e.getCause() : e));
        }
    }

    public synchronized void A00(AnonymousClass2VY r7) {
        AnonymousClass2VW r2;
        AnonymousClass2VW r22;
        try {
            C50522Va r5 = this.A00;
            C50542Vc r1 = r5.A02;
            AnonymousClass2VZ r23 = r5.A00;
            if (r1.A02) {
                Iterator it = ((C50572Vf) r1.A01.get(r23)).A00.iterator();
                while (it.hasNext()) {
                    C50562Ve r4 = (C50562Ve) it.next();
                    if (r4.A03.isInstance(r7)) {
                        AnonymousClass2VZ r3 = r4.A01;
                        AnonymousClass2VZ r0 = r5.A00;
                        if (!(r3 == r0 || (r22 = r0.A01) == null)) {
                            r22.A00(r7, r5.A01, r4, 1);
                        }
                        AnonymousClass2VW r24 = r4.A00;
                        if (r24 != null) {
                            r24.A00(r7, r5.A01, r4, 2);
                        }
                        if (!(r3 == r5.A00 || (r2 = r3.A00) == null)) {
                            r2.A00(r7, r5.A01, r4, 3);
                        }
                        r5.A00 = r3;
                    }
                }
                StringBuilder A0S = AnonymousClass008.A0S("No valid transition from state: ");
                A0S.append(r23.A03);
                throw new C50532Vb(A0S.toString());
            }
            throw new C50532Vb("State machine map is not initialized - call build()");
        } catch (C50532Vb e) {
            e = e;
            if (!(e.getCause() instanceof C29001Wo)) {
                if (e.getCause() != null) {
                    e = e.getCause();
                }
                throw new C29001Wo((byte) 80, new SSLException("Internal Error", e));
            }
            throw ((C29001Wo) e.getCause());
        }
    }
}
